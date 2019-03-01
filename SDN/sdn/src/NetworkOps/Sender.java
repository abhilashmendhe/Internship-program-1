/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkOps;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author abhilash
 */
public class Sender {
    Socket clientSocket = null;
    String srcDir = null;
    String dstDir = null;
    byte[] readBuffer = new byte[1024];
    private InputStream inStream = null;
    private OutputStream outStream = null;
    int state = 0;
    final int permissionReqState = 1;
    final int initialState = 0;
    final int dirHeaderSendState = 2;
    final int fileHeaderSendState = 3;
    final int fileSendState = 4;
    final int fileFinishedState = 5;
    private boolean isLive = false;
    private int numFiles = 0;
    private int filePointer = 0;
    String request = "May I send?";
    String respServer = "Yes,You can";
    String dirResponse = "Directory created...Please send files";
    String fileHeaderRecvd = "File header received ...Send File";
    String fileReceived = "File Received";
    String dirFailedResponse = "Failed";
    File[] opFileList = null;

    public Sender(Socket clientSocket, String srcDir, String dstDir) {

        try {
            this.clientSocket = clientSocket;
            inStream = clientSocket.getInputStream();
            outStream = clientSocket.getOutputStream();
            isLive = true;
            this.srcDir = srcDir;
            this.dstDir = dstDir;
            state = initialState;
            readResponse(); //starting read thread
            sendMessage(request);
            state = permissionReqState;
        } catch (IOException io) {
            io.printStackTrace();
        }


    }

    private void sendMessage(String message) {
        try {
            sendBytes(request.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    /**
     * Thread to read response from server
     */
    private void readResponse() {
        Runnable readRunnable = new Runnable() {
            public void run() {
                while (isLive) {
                    try {
                        int num = inStream.read(readBuffer);
                        if (num > 0) {
                            byte[] tempArray = new byte[num];
                            System.arraycopy(readBuffer, 0, tempArray, 0, num);
                            processBytes(tempArray);
                        }
                    } catch (SocketException se) {
                        System.exit(0);
                    } catch (IOException io) {
                        io.printStackTrace();
                        isLive = false;
                    }
                }
            }
        };
        Thread readThread = new Thread(readRunnable);
        readThread.start();

    }

    private void sendDirectoryHeader() {
        File file = new File(srcDir);
        if (file.isDirectory()) {
            try {
                String[] childFiles = file.list();
                numFiles = childFiles.length;
                String dirHeader = "$" + dstDir + "#" + numFiles + "&";
                sendBytes(dirHeader.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException en) {
                en.printStackTrace();
            }
        } else {
            System.out.println(srcDir + " is not a valid directory");
        }
    }


 private void sendFile(String dirName) {
        File file = new File(dirName);

        if (!file.isDirectory()) {
            try {
                int len = (int) file.length();
                int buffSize = len / 8;
                //to avoid the heap limitation
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                FileChannel channel = raf.getChannel();

                int numRead = 0;
                while (numRead >= 0) {
                    ByteBuffer buf = ByteBuffer.allocate(1024 * 1000);
                    numRead = channel.read(buf);
                    if (numRead > 0) {
                        byte[] array = new byte[numRead];
                        System.arraycopy(buf.array(), 0, array, 0, numRead);
                        sendBytes(array);
                    }
                }
                System.out.println("Finished");

            } catch (IOException io) {
                io.printStackTrace();
            }

        }

    }

    private void sendHeader(String fileName) {
        try {
            File file = new File(fileName);
            if (file.isDirectory())
                return;//avoiding child directories to avoid confusion
            //if want we can sent them recursively
            //with proper state transitions

            String header = "&" + fileName + "#" + file.length() + "*";
            sendHeader(header);

            sendBytes(header.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void sendBytes(byte[] dataBytes) {
        synchronized (clientSocket) {
            if (outStream != null) {
                try {
                    outStream.write(dataBytes);
                    outStream.flush();
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
        }

    }

    private void processBytes(byte[] data) {
        try {
            String parsedMessage = new String(data, "UTF-8");
            System.out.println(parsedMessage);
            setResponse(parsedMessage);
        } catch (UnsupportedEncodingException u) {
            u.printStackTrace();
        }
    }

    private void setResponse(String message) {
        if (message.trim().equalsIgnoreCase(respServer) && state == permissionReqState) {
            state = dirHeaderSendState;
            sendDirectoryHeader();


        } else if (message.trim().equalsIgnoreCase(dirResponse) && state == dirHeaderSendState) {
            state = fileHeaderSendState;
            if (LocateDirectory()) {
                createAndSendHeader();
            } else {
                System.out.println("Vacant or invalid directory");
            }


        } else if (message.trim().equalsIgnoreCase(fileHeaderRecvd) && state == fileHeaderSendState) {
            state = fileSendState;
            sendFile(opFileList[filePointer].toString());
            state = fileFinishedState;
            filePointer++;

        } else if (message.trim().equalsIgnoreCase(fileReceived) && state == fileFinishedState) {
            if (filePointer < numFiles) {
                createAndSendHeader();
            }
            System.out.println("Successfully sent");

        } else if (message.trim().equalsIgnoreCase(dirFailedResponse)) {
            System.out.println("Going to exit....Error ");
            // System.exit(0);
        } else if (message.trim().equalsIgnoreCase("Thanks")) {
            System.out.println("All files were copied");
        }

    }

    private void closeSocket() {
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private boolean LocateDirectory() {
        boolean status = false;
        File file = new File(srcDir);
        if (file.isDirectory()) {
            opFileList = file.listFiles();
            numFiles = opFileList.length;
            if (numFiles <= 0) {
                System.out.println("No files found");
            } else {
                status = true;
            }

        }
        return status;
    }

    private void createAndSendHeader() {
        File opFile = opFileList[filePointer];
        String header = "&" + opFile.getName() + "#" + opFile.length() + "*";
        try {
            state = fileHeaderSendState;
            sendBytes(header.getBytes("UTF-8"));

        } catch (UnsupportedEncodingException e) {

        }
    }

    private void sendListFiles() {
        createAndSendHeader();

    }
}

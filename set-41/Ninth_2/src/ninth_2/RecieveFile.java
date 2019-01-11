/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninth_2;

import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class RecieveFile extends Thread{
    
    public void run()
    {
        try {
            ServerSocket ss = new ServerSocket(1254);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF();
                if(data.contains("#"))
                {
                    String contt[] = data.split("#");
                    String sender_ip = contt[0];
                    String filewriteconten = contt[1];
                    String filename = contt[2];
                    new WriteFile().writeFile("/home/abhilash/rec_file/"+filename, filewriteconten);
                    //new SendAck().AckDataSend("File recieved", "127.0.0.1");
                    File f = new File("/home/abhilash/rec_file/");
                    String files[] = f.list();
                    for(int i=0; i<files.length; i++)
                    {
                        if(filename.equals(files[i]))
                            new SendAck().AckDataSend("Thanks file recieved!!!!", sender_ip);
                    }
                    
                }
            }
        } catch (Exception e) {
            System.out.println("Error in class DataReciever: "+e);
        }
    }
}

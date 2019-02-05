/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkops;

import attackk.SendDataFrame;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author abhil
 */
public class ReceiverFromAllNode extends Thread{
    public void run()
    {
        try {
            ServerSocket ss = new ServerSocket(1255);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF();
                //System.out.println(data);
                if(data.contains("nodetomsg"))
                {

                    //System.out.println(data);
                    String[] s1 = data.split("#");
                    if(s1[2].contains(","))
                    {
                        String[] s2 = s1[2].split(",");
                        String transfer_node = s2[1];
                        //System.out.println(transfer_node);
                        String nextallip = "";
                        for(int i=1; i<s2.length; i++)
                        {
                            nextallip = nextallip + s2[i]+",";
                        }
                        nextallip = nextallip.substring(0,nextallip.length()-1);
                        String message = "";
                        for(int i=0; i<s1.length-1; i++)
                        {
                            message = message + s1[i] + "#";
                        }
                        message += nextallip;
                        System.out.println(message);
                        new SenderToNode().send(transfer_node, message);
                    }
                    else
                    {
                        String message[] = data.split("#");
                        System.out.println("Message: "+message[1]);
                        SendDataFrame.jTextArea2.setText(message[1]);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error in class ReceiverFromAllNode: "+e);
        }
    }
}

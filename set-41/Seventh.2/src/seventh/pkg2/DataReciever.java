/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh.pkg2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class DataReciever extends Thread {
    
    public void run()
    {
        try {
            ServerSocket ss = new ServerSocket(1221);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF();
                if(data.contains("#"))
                {
                    String ip_msg[] = data.split("#");
                    System.out.println(ip_msg[0]+"#"+ip_msg[1]);
                    new AckSender().AckDataSend("Data sucessfully sent "+ip_msg[0], "127.0.0.1");
                    System.out.println("Data successuflly recieved");
                }
            }
        } catch (Exception e) {
            System.out.println("Error in class DataReciever "+e);
        }
            
        }
}


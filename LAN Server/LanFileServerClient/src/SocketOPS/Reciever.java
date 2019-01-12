/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketOPS;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;
import lanserverfileserverclient.UploadDataFrame;

/**
 *
 * @author abhilash
 */
public class Reciever extends Thread{
    public void run()
    {
        
        try {
            ServerSocket ss = new ServerSocket(3000);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF();
                if(data.contains("received"))
                {
                    String sss[] = data.split("#");
                   UploadDataFrame.rec=sss[1];
            
                }
                
            }
            
        } catch (Exception e) {
            System.out.println("Error in class AckReciever "+e);
        }
        }
}

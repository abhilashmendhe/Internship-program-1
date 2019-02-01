/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkops;

import DBops.InsertMaker;
import com.sun.corba.se.spi.activation.Server;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author abhilash
 */
public class Receiver extends Thread{
    
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
                    String ip_name[] = data.split("#");
                    String hostname = ip_name[0];
                    String ip = ip_name[1];
                    if(new InsertMaker().insert(ip, hostname))
                    {
                        JOptionPane.showMessageDialog(null, "Inserted sucessfully in DB!!!");
                        new Sender().send(ip, "Received!!!");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Error while inserting");
                }
            }
        } catch (Exception e) {
            System.out.println("Error in Receiver class: "+e);
        }
    }
}

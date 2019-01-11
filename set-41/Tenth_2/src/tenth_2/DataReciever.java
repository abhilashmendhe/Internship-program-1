/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenth_2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author abhilash
 */
public class DataReciever extends Thread {
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        try {
            ServerSocket ss = new ServerSocket(1254);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF().trim();
                String get = RecieverFrame.jTextArea1.getText();
                RecieverFrame.jTextArea1.setText(get+data+"\n");
                
                //new AckSender().AckDataSend(msg1, "192.168.1.30");

            }
        } catch (Exception e) {
            System.out.println("Error in class DataReciever "+e);
        }
    }       
}

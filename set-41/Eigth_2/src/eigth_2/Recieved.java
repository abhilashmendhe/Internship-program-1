/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigth_2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author abhilash
 */
public class Recieved extends Thread {
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
                String data = dis.readUTF();
                System.out.println(data);
                new AckSend().sendData("rec", "127.0.0.1");
                
            }
        } catch (Exception e) {
            System.out.println("Error in class Recieved "+e);
        }
    }
}

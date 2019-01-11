/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigth_1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class AckRec extends Thread{
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
                Eigth_1.str = data;
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("Error in class Recieved "+e);
        }
    }
}

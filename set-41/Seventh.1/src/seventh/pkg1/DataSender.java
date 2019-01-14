/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh.pkg1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author abhilash
 */
public class DataSender {
    public void SendData(String msg, String ip)
    {
        try {
            
            Socket s = new Socket(ip, 1254);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            
            AckReciever a = new AckReciever();
            a.run();
            
        } catch (Exception e) {
            System.out.println("Error in class DataSender: "+e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_sender;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class First_sender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        try {
            // TODO code application logic here

            DatagramSocket ds = new DatagramSocket();
            String str = "Welcome to Innovatus!!!";
            Inet4Address ip = (Inet4Address) Inet4Address.getByName("192.168.1.35");
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
            ds.send(dp);
            ds.close();
        } catch (SocketException ex) {
            Logger.getLogger(First_sender.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

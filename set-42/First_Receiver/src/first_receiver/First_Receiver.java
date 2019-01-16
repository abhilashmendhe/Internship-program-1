/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_receiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class First_Receiver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            
            // Pragrammer have to explicitly convert buffer messages(String) into packets
            byte buffer[] = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buffer, 1024);
            
            DatagramSocket ds = new DatagramSocket(2111);
            
            ds.receive(dp);
            
            String str = new String(dp.getData(),0,dp.getLength());
            System.out.println("Messages");
            System.out.println("---------------");
            System.out.println(str);
            ds.close();
            
        } catch (SocketException ex) {
            Logger.getLogger(First_Receiver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

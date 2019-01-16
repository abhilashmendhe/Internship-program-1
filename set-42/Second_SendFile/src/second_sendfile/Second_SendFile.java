/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second_sendfile;

import java.io.File;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author abhilash
 */
public class Second_SendFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            DatagramSocket ds = new DatagramSocket();
            File f = new File("/home/abhilash/rec_file/a1.txt");
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getAbsoluteFile());
            String str = f.getName()+"#"+new ReadFile().getContent(f.getAbsolutePath());
            
            InetAddress ip = InetAddress.getByName("192.168.1.70");
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
            ds.send(dp);
            ds.close();
        } catch (Exception e) {
        }
    }
    
}

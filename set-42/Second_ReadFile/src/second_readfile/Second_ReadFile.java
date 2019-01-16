/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second_readfile;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class Second_ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            byte[] buff = new byte[4096];
            DatagramPacket dp = new DatagramPacket(buff, 4096);
            
            DatagramSocket ds = new DatagramSocket(3000);
            ds.receive(dp);
            String str = new String(dp.getData(),0,dp.getLength());
            String spl[] = str.split("#");
            File f = new File("/home/abhilash/rec_file/"+spl[0]);
            if(new WriteFile().writeFile(f.getAbsolutePath(), spl[1]))
                System.out.println("File Received Sucessfully!!");
        } catch (SocketException ex) {
            Logger.getLogger(Second_ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

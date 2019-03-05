/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkOps;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sdnreceiver.MainFrame;

/**
 *
 * @author root
 */
public class Receiver2 extends Thread{
    
    public void run()
    {
        try {
            ServerSocket s = new ServerSocket(3000);
            
            while(true)
            {
                Socket conn = s.accept();
                DataInputStream dis = new DataInputStream(conn.getInputStream());
                String data = dis.readUTF();
                
                    MainFrame.adddrec.add(data);
                MainFrame.data = data;
                
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Receiver2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOSNetworkOps;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import sdn.MainFrame;

/**
 *
 * @author abhilash
 */
public class Receiver extends Thread {
    
    public void run()
    {
        try {
            ServerSocket s = new ServerSocket(3002);
            while(true)
            {
                Socket ss = s.accept();
                DataInputStream dis = new DataInputStream(ss.getInputStream());
                String data = dis.readUTF();
                MainFrame.getfromdos = data;
            }
        } catch (IOException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

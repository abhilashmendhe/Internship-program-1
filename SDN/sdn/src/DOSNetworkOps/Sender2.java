/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOSNetworkOps;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class Sender2 {
    
    public void send(String data)
    {
        try {
            Socket s = new Socket("10.0.2.8",3000);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(data);
            
        } catch (IOException ex) {
            Logger.getLogger(Sender2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

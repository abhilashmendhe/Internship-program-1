/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninth_1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class SendFile {
    
    public void transferFile(String filecont, String ip)
    {
        try {
            Socket s = new Socket(ip, 1254);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(filecont);
            RecieveAck r = new RecieveAck();
            r.start();
            
        } catch (Exception e) {
            System.out.println("Error in class SendFile: "+e);
        }
    }
}

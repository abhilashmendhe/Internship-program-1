/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigth_1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class Sender {
    public void sendData(String msg, String ip)
    {
        try {
            
            Socket s = new Socket(ip,1254);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            AckRec a = new AckRec();
            a.start();
        } catch (Exception e) {
            System.out.println("Error in class Sender: "+e);
        }
    }
}

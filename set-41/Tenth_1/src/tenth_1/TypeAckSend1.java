/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenth_1;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class TypeAckSend1 {
    public void typesend(String msg, String ip)
    {
        try {
            Socket s = new Socket(ip, 3111);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
        } catch (Exception e) {
            System.out.println("Error in class TypeAckSend1: "+e);
        }
    }
}

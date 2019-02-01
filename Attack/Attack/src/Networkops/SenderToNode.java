/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkops;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author abhil
 */
public class SenderToNode {
    public void send(String ip, String msg)
    {
        try {
            Socket s = new Socket(ip,1255);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            ReceiverFromNode r = new ReceiverFromNode();
            r.start();
        } catch (Exception e) {
            System.out.println("Error in class SenderToNode: "+e);
        }
    }
    
}

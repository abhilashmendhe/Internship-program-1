/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketOPS;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author abhilash
 */

public class SendAck {
public static Socket s;
    public void AckDataSend(String msg, String ip)
    {
        try {
            s = new Socket(ip, 3000);
           
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            //s.close();
        } catch (Exception e) {
            System.out.println("Error in class SendAck: "+e);
        }
    }
}

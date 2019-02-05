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
 * @author abhilash
 */
public class SenderToNPM {
    public void send(String ip, String msg)
    {
        try {
            Socket s = new Socket(ip,1254);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            ReceiverFromNPM r = new ReceiverFromNPM();
            r.start();
        } catch (Exception e) {
            System.out.println("Error in class SenderToNPM: "+e);
        }
    }
}

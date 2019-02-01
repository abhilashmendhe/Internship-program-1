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
public class Sender {
    public void send(String ip, String msg)
    {
        try {
            Socket s = new Socket(ip,3000);
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            
        } catch (Exception e) {
            System.out.println("Error in class Sender: "+e);
        }
    }
}

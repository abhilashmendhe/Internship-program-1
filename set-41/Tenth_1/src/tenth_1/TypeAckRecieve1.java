/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenth_1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class TypeAckRecieve1 extends Thread{
    public void run()
    {
        try {
            ServerSocket ss = new ServerSocket(3112);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF().trim();
                if(data.isEmpty())
                    SenderFrame.jTextArea1.setText("");
                else
                    SenderFrame.jTextArea1.setText(data.trim());
//                String get = SenderFrame.jTextArea1.getText();
//                SenderFrame.jTextArea1.setText(get+data+"\n");
            }
        } catch (Exception e) {
            System.out.println("Error in class TypeAckRecieve1 "+e);
        }
    }
}

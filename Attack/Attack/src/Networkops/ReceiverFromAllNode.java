/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkops;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author abhil
 */
public class ReceiverFromAllNode extends Thread{
    public void run()
    {
        try {
            ServerSocket ss = new ServerSocket(1255);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF();
                //System.out.println(data);
                if(data.contains("nodetomsg"))
                {
                    System.out.println(data);
//                    String d[] = data.split("#");
//                    System.out.println(d[1]);
                    String d1[] = data.split("#");
                    String d2[] = data.split(",");
                    String nodeip = d2[0];
                    String mii = "";
                    for(int i=1; i<d2.length; i++)
                    {
                        mii = mii + d2[i] + ",";
                    }
                    mii = mii.substring(0,mii.length()-1);
                    String message = "";
                    for(int i=0; i<d1.length-1; i++)
                    {
                        message = message + d1[i] + "#";
                    }
                    message = message + mii;
                    new SenderToNode().send(nodeip, message);
                    System.out.println(message);
                }
            }
        } catch (Exception e) {
            System.out.println("Error in class ReceiverFromAllNode: "+e);
        }
    }
}

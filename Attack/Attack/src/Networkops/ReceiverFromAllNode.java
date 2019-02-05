/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkops;

import attack.MaliciousFrame;
import attack.NPMFrame;
import attack.SendDataFrame;
import static attack.SendDataFrame.jTextField1;
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
                MaliciousFrame m = new MaliciousFrame();
                System.out.println(data);
                        
                if(data.contains("nodetomsg"))
                {
                   //System.out.println(data);
                    String s1[] = data.split("#");
                    if(s1[2].contains(","))
                    {
                        String s2[] = s1[2].split(",");
                        String transfer_node = s2[1];
                        
                        String nextallip = "";
                        for(int i=1; i<s2.length; i++)
                        {
                           // System.out.println(nextallip);
                            nextallip = nextallip + s2[i] +",";
                        }
                        nextallip = nextallip.substring(0,nextallip.length()-1);
                        String message = "";
                        for(int i=0; i<s1.length-1; i++)
                        {
                            message = message +s1[i]+"#";
                        }
                        message += nextallip;
                        
                        String mm[] = message.split("#");
                        String actualmessage = mm[1];
                        
                        m.jTextArea1.setText(mm[1]);
                        m.setVisible(true);
                        m.setLocation(600, 300);
                        Thread.sleep(5000);
                        m.dispose();
                        //System.out.println(m.jTextArea1.getText().length());
                        if(m.jTextArea1.getText().length()==0)
                        {
                            System.out.println("empty");
                            String actualM = m.jTextArea1.getText();
                            //System.out.println(actualM);
                            String AMH = "npmtohashmal#"+NPMFrame.source_ip+"#null";
                            System.out.println(AMH);
                            new SenderToNPM().send(NPMFrame.jTextField1.getText(), AMH);
                            message = s1[0]+"#"+m.jTextArea1.getText()+"#"+nextallip;
                            //System.out.println(message);
                            new SenderToNode().send(transfer_node, message);
                        }
                        else if(!actualmessage.equals(m.jTextArea1.getText()))
                        {
                            System.out.println("changed");
                            String actualM = m.jTextArea1.getText();
                            //System.out.println(actualM);
                            String hashAM = new MessageDigest.MD().getHash(actualM);
                            String AMH = "npmtohashmal#"+NPMFrame.source_ip+"#"+hashAM;
                            System.out.println(AMH);
                            new SenderToNPM().send(NPMFrame.jTextField1.getText(), AMH);
                            message = s1[0]+"#"+m.jTextArea1.getText()+"#"+nextallip;
                            new SenderToNode().send(transfer_node, message);
                        }
                        else
                        {
                            System.out.println("no change");
                            String actualM = m.jTextArea1.getText();
                            //System.out.println(actualM);
                            String hashAM = new MessageDigest.MD().getHash(actualM);
                            String AMH = "npmtohashmal#"+NPMFrame.source_ip+"#"+hashAM;
                            System.out.println(AMH);
                            new SenderToNPM().send(NPMFrame.jTextField1.getText(), AMH);
                            new SenderToNode().send(transfer_node, message);
                        }
                               
                       // System.out.println(message);
                    }
                    else
                    {
                        String message[] = data.split("#");
                        System.out.println("Message: "+message[1]);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error in class ReceiverFromAllNode: "+e);
        }
    }
}

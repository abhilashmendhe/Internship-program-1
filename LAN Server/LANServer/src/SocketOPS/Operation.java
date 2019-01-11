/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketOPS;


import FileOps.WriteFile;
import java.io.File;

/**
 *
 * @author abhilash
 */
public class Operation 
{
    public void startOperation(String data)
    {
         if(data.contains("store"))
                {
                    String contt[] = data.split("#");
                    //System.out.println(contt);
                    String sender_ip = contt[1];
                    String filename = contt[2];
                    String filewritecontent = contt[3];
                    if(new WriteFile().writeFile("/home/abhilash/rec_file/"+filename, filewritecontent))
                    {
                        String msg="received#Thanks File Received";
                        new SendAck().AckDataSend(msg, sender_ip);
                    }
                    //new SendAck().AckDataSend("File recieved", "127.0.0.1");
                    
                   
                    
                }
    }
}

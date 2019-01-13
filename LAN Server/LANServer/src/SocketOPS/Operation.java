/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketOPS;


import FileOps.ReadFile;
import FileOps.WriteFile;
import java.io.File;
import lanserver.FileServerFrame;

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
                String msg="received#Thanks File Received:abhilash";
                new SendAck().AckDataSend(msg, sender_ip);
                //System.out.println("asdfasd");

            }
                    //new SendAck().AckDataSend("File recieved", "127.0.0.1");
        }
        if(data.contains("search"))
        {
                    
            String cont1[] = data.split("#");
            String send_ip1 = cont1[1];
            String keyword = cont1[2];
            
            File f = new File("/home/abhilash/rec_file/");
           
            File files[] = f.listFiles();
//            for(int j=0; j<files.length; j++)
//                System.out.print(" "+files[j]);
           // String ffff = new ReadFile().getContent(data)
            String contfiles = "";
            for(int i=0; i<files.length; i++)
            {
                String tempstr = new ReadFile().getContent(files[i].getAbsolutePath());
                String t = tempstr.trim();
                //System.out.println(tempstr);
                if(t.contains(keyword))
                    contfiles += files[i].getName()+",";
            }
            
            
            
           // System.out.println(contfiles);
            new SendAck().AckDataSend("result#"+contfiles, send_ip1);
            
        }
        if(data.contains("download"))
            {
                //System.out.println(data);
                String filess[] = data.split("#");
                //System.out.println(filess[2]);
                String filename[] = filess[2].split(",");
                //System.out.println(filename.length);
                       
                String filecontent = "";
                for(int i=0; i<filename.length; i++)
                {
                    //System.out.println(" "+filename[i]);
                            
                    String ss = new ReadFile().getContent("/home/abhilash/rec_file/"+filename[i].trim());
                    String files_content = filename[i] +"@"+ ss.trim();
                    filecontent += files_content+"/";
                }
                
                new SendAck().AckDataSend("downloadfiles#"+filecontent, filess[1]);
            }
         
    }
}

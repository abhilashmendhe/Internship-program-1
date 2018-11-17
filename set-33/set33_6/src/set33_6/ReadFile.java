/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set33_6;

import java.io.FileInputStream;

/**
 *
 * @author abhilash
 */
public class ReadFile {
    
    
    String getContent(String path)
    {
        String content = "";
        
        try {
            StringBuffer sb = new StringBuffer();
            FileInputStream fis = new FileInputStream(path);
            int x = 0;
            char ch = 0;
            
            do{
                x = fis.read();
                if(x!=-1)
                {
                    ch = (char)x;
                    sb.append(ch);
                }
            }while(x!=-1);
            
            content = sb.toString();
        } catch (Exception e) {
        }
        
        return content;
    }
}

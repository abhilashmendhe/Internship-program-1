/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tf.idf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author abhil
 */
public class TextFileReader {
    
    public String readfile(String path) throws FileNotFoundException, IOException
    {
        String content = "";
        StringBuffer st = new StringBuffer();
        FileInputStream fis = new FileInputStream(path);
        int x = 0; 
        char ch = 0;
        
        do{
            x = fis.read();
            if(x!=-1)
            {
                ch = (char)x;
                st.append(ch);
            }
            
        }while(x!=-1);
        content = st.toString();
        return content;
    }
}

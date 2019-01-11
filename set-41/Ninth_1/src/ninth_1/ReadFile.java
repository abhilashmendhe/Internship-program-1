/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninth_1;

import java.io.FileInputStream;

/**
 *
 * @author abhilash
 */
public class ReadFile {
    
    public String getContent(String path)
    {
        String content = "";
        try {
            StringBuffer st = new StringBuffer();
            FileInputStream fis = new FileInputStream(path);
            
            int x = 0; 
            char ch = 0;
            
            do{
                x = fis.read();
                if(x!=-1)
                {
                    ch = (char) x;
                    st.append(ch);
                }
            }while(x!=-1);
            content = st.toString();
        } catch (Exception e) {
            System.out.println("Error in class ReadFile: "+e);
        }
        return content;
    }
}

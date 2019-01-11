/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninth_2;

import java.io.FileOutputStream;

/**
 *
 * @author abhilash
 */
public class WriteFile {
    
    public boolean writeFile(String path, String content)
    {
        boolean f = false;
        
        try {
            
            FileOutputStream fos = new FileOutputStream(path);
            
            for(int i=0; i<content.length(); i++)
            {
                char ch = content.charAt(i);
                int b = (int)ch;
                fos.write(b);
            }
            fos.close();
            f = true;
        } catch (Exception e) {
            System.out.println("Error in class WriteFile "+e);
        }
        
        return f;
    }

}

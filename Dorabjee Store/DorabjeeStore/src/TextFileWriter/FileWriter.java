/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextFileWriter;

import java.io.FileOutputStream;

/**
 *
 * @author abhil
 */
public class FileWriter {
    public boolean writeFile(String path, String content)
    {
        boolean f = false;
        
        try {
            
            FileOutputStream fo = new FileOutputStream(path);
            
            for(int i=0; i<content.length(); i++)
            {
                char ch = content.charAt(i);
                int b = (int)ch;
                fo.write(b);
            }
            fo.close();
            f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class FileOps");
            System.out.println("Error in funciton writeFile: "+e);
        }
        return f;
    }
}

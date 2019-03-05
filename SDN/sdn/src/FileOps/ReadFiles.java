/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class ReadFiles {
    
    public int[] file(String path) throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream(path);
        int []file = new int[fis.available()];
        for(int i=0; i<file.length; i++)
        {
            file[i] = fis.read();
        }
        
     return file;
    }
}

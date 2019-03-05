/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileOps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author abhilash
 */
public class WriteFiles {
    
    public void write(String path, int fsize[]) throws FileNotFoundException, IOException
    {
        FileOutputStream fos = new FileOutputStream(path);
        for(int i=0; i<fsize.length; i++)
        {
            fos.write(fsize[i]);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tf.idf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class ProcessInitiator {
    
    public ArrayList intiate() throws IOException
    {
        String path = FolderSelectionFrame.path;
        ArrayList<String> filedata = new ArrayList<String>();
        File folder = new File(path);
        File f[] = folder.listFiles();
        
        for(int i=0; i<f.length; i++)
        {
            String abspath = f[i].getAbsolutePath();
            
            String filecontent = new TextFileReader().readfile(abspath);
            String cont[] = filecontent.split(" ");
            
            for(int j=0; j<cont.length; j++)
                filedata.add(cont[j].toLowerCase());
            
        }
        //System.out.println(data);
        return filedata;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author abhilash
 */
public class Third {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        
        URL url = new URL("http://www.unipune.ac.in/");
        
        InputStream is = url.openStream();
        byte buff[] = new byte[8];
        
        while(is.read(buff)!=-1)
        {
            System.out.println(new String(buff));
        }
        
    }
    
}

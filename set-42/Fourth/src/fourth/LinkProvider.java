/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author abhilash
 */
public class LinkProvider {
    public String cont;
    public String linking(String u) throws MalformedURLException, IOException
    {
       
        
        URL toRead = new URL(u);
        BufferedReader in  = new BufferedReader(new InputStreamReader(toRead.openStream()));
        Detagger d = new Detagger(in);
        d.parse();
        in.close();
        cont=d.toString();
        
        return cont;
    }
}

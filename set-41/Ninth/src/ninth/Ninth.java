/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninth;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

/**
 *
 * @author abhilash
 */
public class Ninth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
        // TODO code application logic here
        URL encodeurl = new URL("http%3A%2F%2Fwww.stmaryschurchpune.com%2FBible-Study-Fellowship.html");
        String url = URLDecoder.decode(encodeurl.toString(), "UTF-8");
        
        System.out.println("Encoded URL: "+encodeurl.toString());
        System.out.println("URL: "+url);
    }
    
}

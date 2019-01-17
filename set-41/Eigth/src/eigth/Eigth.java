/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigth;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author abhilash
 */
public class Eigth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
        // TODO code application logic here
        
        URL url = new URL("http://www.stmaryschurchpune.com/Bible-Study-Fellowship.html");
        String urlencode = URLEncoder.encode(url.toString(), "UTF-8");
        
        System.out.println("Original url: "+url.toString());
        System.out.println("Encoded URL: "+urlencode);
    }
    
}

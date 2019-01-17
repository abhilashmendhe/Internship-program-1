/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenth;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author abhilash
 */
public class Tenth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException {
        // TODO code application logic here
        URI uri = new URI("http://www.stmaryschurchpune.com/Sunday-School.html");
        
        System.out.println("Host: "+uri.getHost());
        System.out.println("Path: "+uri.getPath());
        System.out.println("Port: "+uri.getPort());
    }
    
}

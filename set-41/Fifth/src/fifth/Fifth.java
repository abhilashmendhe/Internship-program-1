/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifth;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author abhilash
 */
public class Fifth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        // TODO code application logic here
        URL u = new URL("http://www.google.com/home");
        System.out.println("Query: "+u.getQuery());
        System.out.println("REF: "+u.getRef());
        System.out.println("File: "+u.getFile());
        System.out.println("Authority: "+u.getAuthority());
    }
    
}

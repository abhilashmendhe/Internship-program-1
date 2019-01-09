/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

import com.sun.webkit.network.URLs;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author abhilash
 */
public class Fourth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        // TODO code application logic here
        URL u = new URL("http://www.amazon.jp");
        String proto = u.getProtocol();
        int port = u.getPort();
        String host = u.getHost();
        
        System.out.println("Protocol: "+proto);
        System.out.println("Port number: "+port);
        System.out.println("Hostname: "+host);
    }
    
}

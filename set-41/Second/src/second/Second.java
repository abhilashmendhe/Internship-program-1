/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 *
 * @author abhilash
 */
public class Second {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        String name_ip[] = Inet4Address.getByName("www.linkedin.com").toString().split("/");
        System.out.println("Site name is "+name_ip[0]);
        System.out.println("IP address is "+name_ip[1]);
    }
    
}

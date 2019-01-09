/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author abhilash
 */
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        InetAddress ret = InetAddress.getLocalHost();
        String s = ret.toString();
        String spl[] = s.split("/");
        System.out.println("Hostname: "+spl[0]);
        System.out.println("IPAddress: "+spl[1]);
        
    }
    
}

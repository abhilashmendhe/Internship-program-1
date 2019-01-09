/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author abhilash
 */
public class Third {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        InetAddress in[] = Inet4Address.getAllByName("www.amazon.jp");
        for(int i=0; i<in.length; i++)
            System.out.println(in[i]);
    }
    
}

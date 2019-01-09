/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh.pkg1;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 *
 * @author abhilash
 */
public class Seventh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        
        DataSender d = new DataSender();
        String ip_name[] = Inet4Address.getLocalHost().toString().split("/");
        //String ipp = ip_name[1];
        String ipp = "192.168.1.40";
        String msgg = ipp+"#"+"Ayla jaduu!!!?";
        d.SendData(msgg, ipp);
    }
    
}

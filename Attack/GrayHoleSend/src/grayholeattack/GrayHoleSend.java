/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grayholeattack;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.sound.midi.Receiver;

/**
 *
 * @author abhilash
 */
public class GrayHoleSend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        Sender s = new Sender();
        String name_ip[] = InetAddress.getLocalHost().toString().split("/");
        String source_ip = name_ip[1];
        System.out.println(source_ip);
        String dest_ip = "10.0.2.10";
        
        String msg = "hiii";
        String hop_cnt = "0";
        String all = source_ip+"#"+dest_ip+"#"+msg+"#"+hop_cnt;
        
        new Sender().dataSend(all, dest_ip);
        
        
    }
    
}

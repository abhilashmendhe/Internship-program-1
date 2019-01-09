/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth.pkg1;

/**
 *
 * @author abhilash
 */
public class Sixth1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DataSender d = new DataSender();
        String msg = "Hello suhita ek item";
        String ip = "192.168.1.32";
        d.SendData(msg, ip);
    }
    
}

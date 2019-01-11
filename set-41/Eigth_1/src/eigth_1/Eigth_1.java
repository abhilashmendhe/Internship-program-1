/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigth_1;

/**
 *
 * @author abhilash
 */
public class Eigth_1 {

    /**
     * @param args the command line arguments
     */public static String str="";
    public static void main(String[] args) {
        // TODO code application logic here
        long st = System.currentTimeMillis();
        String msg = "hey";
        new Sender().sendData(msg, "127.0.0.1");
         byte[] len = msg.getBytes();
        
        while(true)
        {
            if(str.equals("rec"))
                break;
            
        }
        
        long end = System.currentTimeMillis();
        long t = end-st;
        
        System.out.println("Size of msg: ");
        System.out.println("Delay: "+t+" ms");
        
    }
    
    
}

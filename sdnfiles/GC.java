/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class GC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Runtime r = Runtime.getRuntime();
        System.out.println("Total mem: "+r.maxMemory()/1000000);
        Process p = null;
        
        try {
            p = r.exec("ls");
            p.waitFor();
        } catch (IOException ex) {
            Logger.getLogger(GC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        
    }
   
    
    
}

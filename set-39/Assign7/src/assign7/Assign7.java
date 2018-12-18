/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign7;

/**
 *
 * @author abhilash
 */
public class Assign7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        One o = new One();
        Thread t = new Thread(o);
        t.start();
        
    }
    
}

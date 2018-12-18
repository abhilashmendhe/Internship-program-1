/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

/**
 *
 * @author abhilash
 */
public class Assign6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One o = new One();
        Two t = new Two();
        Three tt = new Three();
        
        o.setPriority(3);
        t.setPriority(1);
        tt.setPriority(2);
        o.start();
        t.start();
        tt.start();
        
    }
    
}

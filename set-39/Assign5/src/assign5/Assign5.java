/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign5;

/**
 *
 * @author abhilash
 */
public class Assign5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One o = new One();
        Two t = new Two();
        Three tt = new Three();
        o.start();
//        o.yield();
//        o.yield();
//        o.yield();
        t.start();
        tt.start();
    }
    
}

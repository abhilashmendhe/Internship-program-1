/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_3;

/**
 *
 * @author abhil
 */
public class Set22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Time t1 = new Time();
        Time t2 = new Time();
        
        t1.getData(20, 300, 1500);
        t2.getData(400, 20, 10);
        
        Time t3 = t1.getDiffTime(t2);
        t3.Display(t3);
        
    }
    
}

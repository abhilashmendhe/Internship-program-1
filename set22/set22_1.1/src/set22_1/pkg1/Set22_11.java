/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_1.pkg1;

/**
 *
 * @author abhil
 */
public class Set22_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.getData(3, 5);
        c2.getData(3, 8);
        
        Complex c = c1.getSum(c2);
        
        c1.Display(c);
    }
    
}

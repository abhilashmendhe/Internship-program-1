/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_2;

/**
 *
 * @author abhil
 */
public class Set22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Days d1 = new Days();
        Days d2 = new Days();
        
        d1.getDays(5,3,2,3);
        d2.getDays(1,10,13,6);
        
        Days day = d1.getSum(d2);
        d1.Display(day);
    }
    
}

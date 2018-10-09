/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_2;

/**
 *
 * @author abhi
 */
public class Set21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reverse a1 = new Reverse();
        
        a1.getData(1023);
        int s = a1.getReverse();
        a1.displayReverse(s);
    }
    
}

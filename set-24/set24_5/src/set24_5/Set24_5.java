/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_5;

/**
 *
 * @author abhil
 */
public class Set24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GCD1 g1 = new GCD1(30, 12);
        GCD2 g2 = new GCD2(40, 50);
        GCD3 g3 = new GCD3(48, 36);
        
        int gcd1 = g1.getGCD(g1);
        int gcd2 = g2.getGCD(g2);
        int gcd3 = g3.getGCD(g3);
        
        BiggestGcd big = new BiggestGcd();
        big.getBiggest(gcd1,gcd2,gcd3);
    }
    
}

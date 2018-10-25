/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_7;

/**
 *
 * @author abhil
 */
import binarydecimal.*;
public class Set27_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reverse r = new Reverse();
        int r1 = r.getRev(1234);
        System.out.println("Reverse is "+r1);
        
        BinToDec b = new BinToDec();
        int b1 = b.getBinToDec(1010);
        System.out.println("Binary is "+b1);
        
        DecToBin d = new DecToBin();
        int d1 = d.getDecToBin(32);
        System.out.println("Decimal is "+d1);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_5;

import arithmaticoperations.*;

/**
 *
 * @author abhil
 */
public class Set27_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();
        Modulus mod = new Modulus();
        
        int a = add.getAdd(1, 2);
        int s = sub.getSub(1, 2);
        int m = mul.getMul(10, 2);
        double dd = div.getDiv(12, 4);
        int mo = mod.getMod(5, 2);
        
        System.out.println("Add is "+a);
        System.out.println("Sub is "+s);
        System.out.println("Mul is "+m);
        System.out.println("Div is "+dd);
        System.out.println("Mod is "+mo);
    }
    
}

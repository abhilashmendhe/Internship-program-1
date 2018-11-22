/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_13;

/**
 *
 * @author abhil
 */
abstract public class BTOD implements Num {
    
    public void btod(int n)
    {
        int rev = 0;
        int i = 0;
        while(n>0)
        {
            int rem = n % 10;
            rev = rev + (int)(Math.pow(2, i++)*rem);
            n = n / 10;
        }
        System.out.println("Decimal is "+rev);
    }

}
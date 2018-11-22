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
public class DTOB extends BTOD implements Num {
    
    public void dtob(int n)
    {
        int rev = 0;
        int i = 0;
        while(n>0)
        {
            int rem = n % 2;
            rev = rev + (int)Math.pow(10, i++)* rem;
            n = n / 2;
        }
        
        System.out.println("Binary is "+rev);
    }
}

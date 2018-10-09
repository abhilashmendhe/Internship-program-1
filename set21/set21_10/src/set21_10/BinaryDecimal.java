/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_10;

/**
 *
 * @author abhi
 */
public class BinaryDecimal {

    public int[] getDecimalArray(int b[])
    {
        for(int i=0; i<b.length; i++)
        {
            int rev = 0;
            int inc = 0;
            while(b[i]>0)
            {
                int r = b[i] % 10; 
                rev += Math.pow(2, inc) * r;
                b[i] /= 10;
                inc++;
            }
            b[i] = rev;
        }
        return b;
    }
}

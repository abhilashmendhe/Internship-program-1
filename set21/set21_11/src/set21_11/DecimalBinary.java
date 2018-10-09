/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_11;

/**
 *
 * @author abhi
 */
public class DecimalBinary {

    public int[] getBinaryArray(int b[])
    {
        for(int i=0; i<b.length; i++)
        {
            int rev = 0;
            int inc = 0;
            while(b[i]>0)
            {
                int r = b[i] % 2;
                rev += Math.pow(10, inc) * r;
                b[i] /= 2;
                inc++;
            }
            b[i] = rev;
        }
        return b;
    }
}

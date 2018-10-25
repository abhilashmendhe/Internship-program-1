/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarydecimal;

/**
 *
 * @author abhil
 */
public class BinToDec {

    public int getBinToDec(int n)
    {
        int dec = 0;
        int tmp = 0;
        while(n>0)
        {
            int rem = n%10;
            dec += (int)Math.pow(2, tmp++)*rem;
            n = n / 10;
        }
        return dec;
    }
}

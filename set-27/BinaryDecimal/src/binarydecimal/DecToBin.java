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
public class DecToBin {
    
    public int getDecToBin(int n)
    {
        int bin = 0;
        int tmp = 0;
        
        while(n>0)
        {
            int rem = n % 2;
            bin += Math.pow(10, tmp++)*rem;
            n = n / 2;
        }
        return bin;
    }
}

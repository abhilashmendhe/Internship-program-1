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
public class Reverse {
 
    public int getRev(int n)
    {
        int r = 0;
        while(n>0)
        {
            int rem = n%10;
            r = (r*10)+rem;
            n = n / 10;
        }
        return r;
    }
}

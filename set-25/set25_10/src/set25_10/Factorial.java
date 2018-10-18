/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_10;

/**
 *
 * @author abhil
 */
public class Factorial {
    
    public static int getFactorial(int a)
    {
        int fact=1;
        while(a>1)
        {
            fact*=a;
            a--;
        }
        return fact;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_5;

/**
 *
 * @author abhil
 */
public class Withdraw {
    
    boolean getWithdraw(int a, double bal, Customer s[])
    {
        boolean f = false;
        for(int i=0; i<s.length; i++)
        {
            if(s[i].acc == a)
            {
                s[i].bal -= bal;
            }
        }
        return f;
    }
}

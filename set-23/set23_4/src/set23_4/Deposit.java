/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_4;

/**
 *
 * @author abhil
 */
public class Deposit {
    
    boolean isDeposit(int a, double bal, Customer s[])
    {
        boolean f = false;
        for(int i=0; i<s.length; i++)
        {
            if(a==s[i].acc)
            {
                s[i].bal += bal;
                f = true;
            }
        }
        return f;
    }
}

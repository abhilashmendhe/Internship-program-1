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
public class Find {
    
    void getCustomer(Customer s[])
    {
        for(int i=0; i<s.length; i++)
        {
            if(s[i].bal<5000)
            {
                System.out.println("Name: "+s[i].name);
                System.out.println("Acc. No. is "+s[i].acc);
                System.out.println("Amount is "+s[i].bal);
            }
        }
    }
}

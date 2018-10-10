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
public class Display {
    
    void displayAcc(int a, Customer s[])
    {
        for(int i=0; i<s.length; i++)
        {
            if(s[i].acc == a)
            {
                System.out.println("Account number "+s[i].acc);
                System.out.println("Balance is "+s[i].bal);
            }
        }
    }
    
    void displayAll(Customer s[])
    {
        for(int i=0; i<s.length; i++)
        {
            System.out.println("Name is "+s[i].name);
            System.out.println("Account number "+s[i].acc);
            System.out.println("Balance is "+s[i].bal);
        }
    }
}

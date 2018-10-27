/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_11;

/**
 *
 * @author abhil
 */
public class CI extends Interest{
    
    public void findInterest()
    {
        int p=1000, n=10, r=3;
        double t = 0;
        
        for(int i=0; i<n; i++)
        {
            t += (double)(p*n*r)/100;
        }
        System.out.println("CI is "+t);
    }
}

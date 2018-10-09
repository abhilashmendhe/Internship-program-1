/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_3;

/**
 *
 * @author abhi
 */
public class Mean { 
    
    public double computeMean(int a[])
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
            sum += a[i];
        double mean = (double)(sum/a.length);
        
        return mean;
        
    }

}

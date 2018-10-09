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
public class StandardDeviation {

    
    public double getSD(int a[], double m)
    {
        double var = 0;
        for(int i=0; i<a.length; i++)
            var += (double)Math.pow((m-a[i]),2);
        
        double sd = Math.sqrt(var/a.length);
        return sd;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_9;

/**
 *
 * @author abhil
 */
public class MeanSD {
    
    int x;
    int a[];
    
    void getData(int b)
    {
        x = b;
        a = new int[b];
    }
    
    void getArray(int a1[])
    {
        for(int i=0; i<a1.length; i++)
            a[i] = a1[i];
    }
    
    Data getMeanSD()
    {
        double mean = 0;
        double sd = 0;
        
        for(int i=0; i<a.length; i++)
            mean += a[i];
        mean = (double)(mean / a.length);
        
        for(int i=0; i<a.length; i++)
            sd += Math.pow((mean-a[i]), 2);
        
        sd = Math.sqrt(sd/a.length);
        
        //System.out.println(mean);
        Data d = new Data();
        
        d.mean = mean;
        d.sd = sd;
        
        return d;
    }
}

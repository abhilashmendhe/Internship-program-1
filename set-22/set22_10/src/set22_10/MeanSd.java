/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_10;

/**
 *
 * @author abhil
 */
public class MeanSd {

    void getMeanSD(int b[])
    {
        double mean = 0;
        double sd = 0;
        
        for(int i=0; i<b.length; i++)
            mean += (double)b[i];
        
        mean = mean / b.length;
        
        for(int i=0; i<b.length; i++)
            sd += (double)Math.pow((mean-b[i]),2);
        
        sd = Math.sqrt(sd / b.length);
        
        Data.mean = mean;
        Data.sd = sd;
        
        System.out.println("Mean is "+Data.mean);
        System.out.println("SD is "+Data.sd);
        
    }
}

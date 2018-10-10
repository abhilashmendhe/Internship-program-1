/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_7;

/**
 *
 * @author abhil
 */
public class MeanSd {

    Datakeeper getMeanSd(IntArray aa)
    {
        double mean = 0;
        double sd = 0;
        for(int i=0; i<aa.b.length; i++)
        {
            mean = (double)(mean+aa.b[i]);
        }
        mean = mean / aa.b.length;
        
        for(int i=0; i<aa.b.length; i++)
        {
            sd += (double)(Math.pow((mean-aa.b[i]), 2));
        }
        sd = Math.sqrt(sd/aa.b.length);
        
        Datakeeper d = new Datakeeper();
        
        d.mean = mean;
        d.sd = sd;
       
        return d;
    }
}

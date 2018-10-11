/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_9;

/**
 *
 * @author abhil
 */
public class Transform {
    
    Datakeeper getNormTransnorm(Matrix m1)
    {
        int trace = 0;
        double normal = 0;
        for(int i=0; i<m1.mat.length; i++)
        {
            for(int j=0; j<m1.mat[0].length; j++)
            {
                if(i==j)
                    trace = trace + m1.mat[i][j];
       
                normal += (double)Math.pow(m1.mat[i][j], 2);
            }
        }    
        normal = Math.sqrt(normal);
                
        //System.out.println(trace);
        //System.out.println(normal);
        Datakeeper d = new Datakeeper();
        d.trace = trace;
        d.normal = normal;
        
        return d;
    }
    
}

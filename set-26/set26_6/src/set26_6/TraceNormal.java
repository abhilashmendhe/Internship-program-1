/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_6;

/**
 *
 * @author abhil
 */
public class TraceNormal {
    
    public Datakeeper getTraceNormal(int m[][])
    {
        int trace = 0;
        double normal = 0;
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                if(i==j)
                    trace += m[i][j];
                
                normal += (Math.pow(m[i][j], 2)); 
                        
            }
        }
        
        normal = (double)Math.sqrt(normal);
        
        Datakeeper d = new Datakeeper();
        
        d.trace = trace;
        d.normal = normal;
        
        return d;
        
    }
}

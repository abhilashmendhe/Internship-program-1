/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_6;

/**
 *
 * @author abhil
 */
public class Parallel {
    
    int x,y;
    
    void getData(int a,int b)
    {
        x=a;
        y=b;
    }
    
    public boolean getParallel(Parallel p[])
    {
        boolean f = true;
        
        for(int i=1; i<p.length; i++)
        {
            if(p[i].y!=p[i-1].y)
            {
                f = false;
                break;
            }
        }
        
        return f;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_3;

/**
 *
 * @author abhil
 */
public class Parallel {
    
    boolean isParallel(Point p1, Point p2, Point p3, Point p4)
    {
        boolean f = true;
        double d1 = Math.sqrt(Math.pow((p1.x-p3.x),2)+Math.pow((p1.y-p3.y),2));
        double d2 = Math.sqrt(Math.pow((p2.x-p4.x),2)+Math.pow((p2.y-p4.y),2));
        
        if(d1!=d2)
            f=false;
        
        return f;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_3;

/**
 *
 * @author abhil
 */
public class Point2 {
    
    int x,y;

    Point2(int a, int b) {
        x = a;
        y = b;
    }
    
    void getDistance(Point1 p1)
    {
       
        
        double compute1 = (double)Math.pow((p1.x-x), 2);
        double compute2 = (double)Math.pow((p1.y-y), 2);
        
        double d = Math.sqrt(compute2+compute1);
        System.out.println("Distance is "+d);
    }
    
}

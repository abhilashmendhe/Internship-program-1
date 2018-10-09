/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_1;

/**
 *
 * @author abhil
 */
public class Distance {
 
    
    double getDistance(Point p1, Point p2)
    {
        double d = Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
        return d;
    }
}

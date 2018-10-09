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
public class Area {
    
    double getArea(double d1 , double d2, double d3)
    {
        double s = (d1 + d2 + d3)/2;
        double A = Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
        return A;
    }

    
}

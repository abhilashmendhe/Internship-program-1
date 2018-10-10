/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_4;

/**
 *
 * @author abhil
 */
public class Area {

    void getArea(P1 p1, P2 p2, P3 p3)
    {
        double d1 = Math.sqrt((Math.pow((p1.x-p2.x),2))+(Math.pow((p1.y-p2.y),2)));
        double d2 = Math.sqrt((Math.pow((p1.x-p3.x),2))+(Math.pow((p1.y-p3.y),2)));
        double d3 = Math.sqrt((Math.pow((p2.x-p3.x),2))+(Math.pow((p2.y-p3.y),2))); 

        double s = (d1+d2+d3)/3;
        
        double area = Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
        
        System.out.println("Area of triangle is "+area);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_1;

/**
 *
 * @author abhil
 */
public class Area {
    
    double getArea(double r)
    {
        double a = Math.PI * Math.pow(r, 2);
        return a;
    }
    
    double getArea(double h, double b)
    {
        double a = 0.5 * h * b;
        return a;
    }
    
    int getArea(int side)
    {
        int a = side * side;
        return a;
    }
    
    int getArea(int a, int b)
    {
        int ar = a * b;
        return ar;
    }
}

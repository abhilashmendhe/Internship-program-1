/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_2;

/**
 *
 * @author abhil
 */
public class Height extends Base {
    
    private int h;
    
    public void getH(int h)
    {
        this.h = h;
    }
    
    public void getArea()
    {
        double a = (double)(0.5*h*retB());
        System.out.println("Area of triangle is "+a);
    }
}

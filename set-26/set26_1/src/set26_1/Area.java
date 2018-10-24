/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_1;

/**
 *
 * @author abhil
 */
public class Area extends PI{
    
    public double r;
    
    public void getR(int x)
    {
        r = x;
    }
    
    public void getArea()
    {
        double a = retPI()*Math.pow(r, 2);
        System.out.println("Area is "+a);
    }
}

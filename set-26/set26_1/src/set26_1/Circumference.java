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
public class Circumference extends PI{

    public double r;
    
    public void getR(int r)
    {
        this.r = r;
    }
    
    public void getCircumference()
    {
        double c = 2 * retPI() * r;
        System.out.println("Circumference is "+c);
    }
}

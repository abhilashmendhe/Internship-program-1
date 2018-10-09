/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_1.pkg1;

/**
 *
 * @author abhil
 */
public class Complex {
    int x, y;
    public void getData(int a, int b)
    {
        x = a;
        y = b;
    }
    
    Complex getSum(Complex c2)
    {
        Complex c = new Complex();
        
        c.x = x + c2.x;
        c.y = y + c2.y;
        
        return c;
    }
    
    void Display(Complex c)
    {
        System.out.println("Sum is "+c.x+"+i"+c.y);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_1;

/**
 *
 * @author abhil
 */
public class Addition {
    
    Complex  getSum(Complex c1, Complex c2)
    {
        Complex c3 = new Complex();
        
        c3.x = c1.x + c2.x;
        c3.y = c1.y + c2.y;
        
        return c3;
    }
}

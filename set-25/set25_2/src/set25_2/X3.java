/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_2;

/**
 *
 * @author abhil
 */
public class X3 extends X2{
    
    int x3;
    
    public X3(int a, int b, int c)
    {
        super(a, b);
        x3 = c;
    }
    
    double getAverage()
    {
        double avg = (double)(x1+x2+x3)/3;
        
        return avg;
        
        
    }
}

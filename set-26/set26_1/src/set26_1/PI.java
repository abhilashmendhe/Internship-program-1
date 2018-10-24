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
public class PI {
    
    private double pi;
    
    private void setPI(double x)
    {
        pi = x;
    }
    
    public void callSetPi(double x)
    {
        setPI(x); 
    }
    
    public double retPI()
    { 
        return pi;
    }
    
    
}

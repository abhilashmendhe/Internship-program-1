/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_10;

/**
 *
 * @author abhil
 */
public class Circle extends Shape{
    
    public void findArea()
    {
        double r = 2;
        double a = Math.PI*Math.pow(r, 2);
        System.out.println("Area of circle "+a);
    }
}

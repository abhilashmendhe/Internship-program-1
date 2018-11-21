/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set28_12;

/**
 *
 * @author abhil
 */
public class Area implements Circle {

    @Override
    public void findArea(int r) {
        
        double a = pi * r * r;
        System.out.println("Area of circle is "+a);
    }
    
}

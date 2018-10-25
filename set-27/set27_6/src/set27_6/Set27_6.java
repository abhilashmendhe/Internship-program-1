/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_6;

/**
 *
 * @author abhil
 */
import area.*;
public class Set27_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t = new Triangle();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        
        double a1=t.getArea(10, 20);
        double a2=c.getArea(5);
        int a3=r.getArea(10, 2);
        int a4=s.getArea(5);
    
        System.out.println("Area of triangle is "+a1);
        System.out.println("Area of circle is "+a2);
        System.out.println("Area of rectangle is "+a3);
        System.out.println("Area of square is "+a4);
                
    }
    
}

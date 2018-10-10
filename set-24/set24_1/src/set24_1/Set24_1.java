/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_1;

/**
 *
 * @author abhil
 */
public class Set24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Area a = new Area();
        
        double circle = a.getArea(5);
        double triangle = a.getArea(10, 6);
        double sq = a.getArea(10);
        double rec = a.getArea(30, 40);
        
        System.out.println("Area of circle is "+circle);
        System.out.println("Area of triangle is "+triangle);
        System.out.println("Area of square is "+sq);
        System.out.println("Area of rectangle is "+rec);
               
    }
    
}

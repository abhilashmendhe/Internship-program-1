/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_1;

/**
 *
 * @author abhil
 */
public class Set23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Distance d = new Distance();
        Area a = new Area();
        p1.getData(2, 3);
        p2.getData(4, 5);
        p3.getData(8, 3);
        
        double d1 = d.getDistance(p1, p2);
        double d2 = d.getDistance(p1, p3);
        double d3 = d.getDistance(p2, p3);
        
        
        
        double area = a.getArea(d1, d2, d3);
        
        System.out.println("Dist one is "+d1);
        System.out.println("Dist two is "+d2);
        System.out.println("Dist three is "+d3);
        System.out.println("Area is "+area);
    }
    
}

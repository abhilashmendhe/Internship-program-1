/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set23_3;

/**
 *
 * @author abhil
 */
public class Set23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();
        
        p1.getData(3, 4);
        p2.getData(3, 4);
        p3.getData(3, 4);
        p4.getData(3, 4);
        
        Parallel p = new Parallel();
        Boolean b1 = p.isParallel(p1, p2, p3, p4);
        
        if(b1)
            System.out.println("It is parallel");
        else
            System.out.println("It is not parallel");
            
    }
    
}

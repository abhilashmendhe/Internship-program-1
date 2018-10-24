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
public class Set26_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Circumference c = new Circumference();
        c.callSetPi(Math.PI);
        c.getR(10);
        c.getCircumference();
        
        Area a = new Area();
        a.callSetPi(Math.PI);
        a.getR(10);
        a.getArea();
    }
    
}

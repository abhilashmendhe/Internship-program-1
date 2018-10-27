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
public class Set28_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s;
        s = new Circle();
        
        s.findArea();
        s = new Triangle();
        s.findArea();
        s = new Rectangle();
        s.findArea();
    }
    
}

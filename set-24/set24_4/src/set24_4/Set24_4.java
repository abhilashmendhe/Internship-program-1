/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_4;

/**
 *
 * @author abhil
 */
public class Set24_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        P1 p1 = new P1();
        P2 p2 = new P2(3, 8);
        P2 p = new P2(11, 6);
        P3 p3 = new P3(p);
        
        Area area = new Area();
        area.getArea(p1, p2, p3);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_8;

/**
 *
 * @author abhil
 */
public class Set25_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Two t = new Two();
        t.getX(10);
        t.getY(20);
        int sum = t.Sum();
        
        System.out.println("Addition is "+sum);
    }
    
}

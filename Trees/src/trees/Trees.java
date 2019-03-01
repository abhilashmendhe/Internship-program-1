/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author root
 */
public class Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeOps t = new TreeOps();
        t.create(6);
        t.create(4);
        t.create(3);
        t.create(5);
        t.create(8);
        t.create(1);
        
        System.out.println("\nTree pre-order");
        t.display();
        System.out.println();
    }
    
}

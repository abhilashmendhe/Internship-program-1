/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set36_10;

/**
 *
 * @author abhil
 */
import java.util.*; 
public class Set36_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> t1 = new TreeSet<Integer>();
        
        t1.add(12);
        t1.add(3);
        t1.add(5);
        t1.add(1);
        t1.add(8);
        t1.add(7);
        t1.add(21);
        
        System.out.println("Tree Set");
        System.out.println(t1);
        System.out.println("Head set");
        System.out.println(t1.headSet(8));
        System.out.println("Tail set");
        System.out.println(t1.tailSet(8));
        
        System.out.println("Sub Set");
        System.out.println(t1.subSet(4 , 10));
       
    }
    
}

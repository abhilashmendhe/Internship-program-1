/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set36_4;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set36_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet h1 = new HashSet();
      //  HashSet h2 = new HashSet(Collection c);
        h1.add(12);
        h1.add(5);
        h1.add("A");
        h1.add("B");
        h1.add("C");
        h1.add("A");
        
        System.out.println(h1);
    }
    
}

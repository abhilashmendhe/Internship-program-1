/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set36_5;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set36_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet h1 = new HashSet();
        
        h1.add("A");
        h1.add("B");
        h1.add("C");
        
        Iterator it = h1.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}

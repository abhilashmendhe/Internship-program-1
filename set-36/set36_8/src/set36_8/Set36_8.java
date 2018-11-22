/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set36_8;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set36_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<String> t1 = new TreeSet<String>();
        
        t1.add("Tushar");
        t1.add("Harshal");
        t1.add("Suchit");
        t1.add("Abhilash");
        t1.add("Ankit");
        t1.add("Shreepad");
        t1.add("Ajith");
        
        Iterator it = t1.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}

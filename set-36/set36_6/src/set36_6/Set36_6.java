/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set36_6;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set36_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList arr = new ArrayList();
        
        
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("B");
        arr.add("C");
        
        System.out.println("Array List");
        System.out.println(arr);
        HashSet h = new HashSet();
    
        h.addAll(arr);
        
        arr.clear(); 
        arr.addAll(h);
        
        System.out.println("Now Array list without Duplicates elements");
        System.out.println(arr);
    }
    
}

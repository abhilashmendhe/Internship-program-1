/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_7;

/**
 *
 * @author abhil
 */

import java.util.*;
public class Set35_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        
        arrlist.add(1);
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(3);
        arrlist.add(1);
        
        System.out.println("Array List");
        System.out.println(arrlist);
        
        ArrayList<Integer> uniq = new ArrayList<Integer>();
        
                
        for(int i=0; i<arrlist.size(); i++)
        {
            if(!(uniq.contains(arrlist.get(i))))
                uniq.add(arrlist.get(i));
        }
        
        System.out.println("Unique Elements");
        System.out.println(uniq);
                
                
    }
    
}

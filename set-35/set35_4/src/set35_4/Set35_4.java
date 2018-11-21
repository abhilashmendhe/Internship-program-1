/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_4;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set35_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        arr.add(6);
        arr.add(3);
        arr.add(11);
        arr.add(10);
        arr.add(2);
        
        System.out.println("Array list");
        System.out.println(arr);
        
        int big = arr.get(0);
        int small = arr.get(0);
        
        for(int i=0; i<arr.size(); i++)
        {
            if(big<arr.get(i))
                big = arr.get(i);
            
            if(small>arr.get(i))
                small = arr.get(i);
        }
        System.out.println();
        System.out.println("Biggest element is "+big);
        System.out.println("Smallest element is "+small);
    }
    
}

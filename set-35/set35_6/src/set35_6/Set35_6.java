/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_6;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set35_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        
        arr1.add(5);
        arr1.add(3);
        arr1.add(10);
        arr1.add(1);
        arr1.add(4);
        
        for(int i=0; i<arr1.size(); i++)
        {
            for(int j=0; j<arr1.size()-1; j++)
            {
                int x = arr1.get(j);
                int y = arr1.get(j+1);
                   
                if(arr1.get(j)>arr1.get(j+1))
                {
                    arr1.set(j, y);
                    arr1.set(j+1, x);
                }
            }
        }
        
        System.out.println("Sorted array in ascending order");
        System.out.println(arr1);
    }
    
}

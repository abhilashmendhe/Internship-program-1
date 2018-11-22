/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_8;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set35_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();
        ArrayList arr3 = new ArrayList();
        ArrayList arr4 = new ArrayList();
        ArrayList arr5 = new ArrayList();
        
        arr1.add(123);
        arr1.add("Abhilash");
        arr1.add(51.84);
        
        arr2.add(234);
        arr2.add("Shreepad");
        arr2.add(71.33);
        
        arr3.add(345);
        arr3.add("Suchit");
        arr3.add(65.54);
        
        arr4.add(456);
        arr4.add("Ankit");
        arr4.add(66.1);
        
        arr5.add(567);
        arr5.add("Vithal");
        arr5.add(80.87);
        
        
        ArrayList bigArr = new ArrayList();
        
        bigArr.add(arr1);
        bigArr.add(arr2);
        bigArr.add(arr3);
        bigArr.add(arr4);
        bigArr.add(arr5);
        
        
        System.out.println(bigArr);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        
        
        for(int i=0; i<bigArr.size(); i++)
        {
            ArrayList temp = new ArrayList();
            temp = (ArrayList)bigArr.get(i);
            System.out.println();
            System.out.println(temp);
            
            System.out.println("-----------------------");
            for(int j=0; j<temp.size(); j++)
            {
                System.out.println(temp.get(j));
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_9;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set35_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        ArrayList arrlist1 = new ArrayList();
        ArrayList arrlist2 = new ArrayList();
        ArrayList arrlist3 = new ArrayList();
                
        arrlist1.add("1");
        arrlist1.add("Abhilash");
        arrlist1.add("54.3");
               
        arrlist2.add("2");
        arrlist2.add("Shreepad");
        arrlist2.add("73.65");
        
        arrlist3.add("3");
        arrlist3.add("Suchit");
        arrlist3.add("62.99");
        
        ArrayList bigArr = new ArrayList();
        bigArr.add(arrlist1);
        bigArr.add(arrlist2);
        bigArr.add(arrlist3);
        
        System.out.println("Array List");
        System.out.println(bigArr);
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        for(int i=0; i<bigArr.size(); i++)
        {
            for(int j=0; j<bigArr.size()-1; j++)
            {
                ArrayList temp1 = new ArrayList();
                temp1 = (ArrayList)bigArr.get(j);
                double n1 = Double.parseDouble((String) temp1.get(2));
                
                ArrayList temp2 = new ArrayList();
                temp2 = (ArrayList)bigArr.get(j+1);
                double n2 = Double.parseDouble((String)temp2.get(2));
                
                if(n1<n2)
                {
                    bigArr.set(j, j+1);
                    bigArr.set(j+1, j);
                }
                
            }
        }
        System.out.println("Sorted ArrayList");
        System.out.println(bigArr);
    }
    
}

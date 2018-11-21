/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_2;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set35_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList arr = new ArrayList();
        arr.add("Lion");
        arr.add("Tiger");
        arr.add("Elephant");
        arr.add("Monkey");
        
        for(int i=0; i<arr.size(); i++)
        {
            //System.out.println(arr.get(i));
            String s = (String)arr.get(i);
            System.out.print(" "+s);
        }
        
        System.out.println();
    }
    
}

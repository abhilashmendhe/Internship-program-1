/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set35_5;

/**
 *
 * @author abhil
 */
import java.util.*;
import javax.xml.transform.Source;
public class Set35_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     ArrayList arr1 = new ArrayList();
     
     arr1.add("BMW");
     arr1.add("Merc");
     arr1.add("audi");
     arr1.add("HONDA");
     
     ArrayList arr2 = new ArrayList();
     
     arr2.add("BMW");
     arr2.add("MERC");
     arr2.add("audi");
     arr2.add("hondaa");
     
        System.out.println("First array list");
        System.out.println(arr1);
        System.out.println();
        System.out.println("Second array list");
        System.out.println(arr2);
     
    ArrayList common = new ArrayList();
    
    for(int i=0; i<arr1.size(); i++)
    {
        String s = (String)arr1.get(i);
        
        for(int j=0; j<arr2.size(); j++)
        {
            if(s==arr2.get(i))
                common.add(s);
            
            break;
        }
    }
        System.out.println();
        System.out.println("Common elements are");
        System.out.println(common);
    }
    
            
}

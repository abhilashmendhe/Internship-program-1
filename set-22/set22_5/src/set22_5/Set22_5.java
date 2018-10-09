/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_5;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set22_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ReverseArray a[] = new ReverseArray[5];
        System.out.println("Enter elements in array");
        for(int i=0; i<a.length; i++)
        {
            int k = sc.nextInt();
            a[i] = new ReverseArray();
            a[i].getData(k);
        }
        
        System.out.println("Elements of array before reverse");
        for(int i=0; i<a.length; i++)
            System.out.print(" "+a[i].a);
        
     
         System.out.println();
         
         ReverseArray rev[] = a[0].getReverse(a);
         
         System.out.println("Elements of array after reverse");
         for(int i=0; i<rev.length; i++)
             System.out.print(" "+rev[i].a);
         System.out.println();
    }
    
}

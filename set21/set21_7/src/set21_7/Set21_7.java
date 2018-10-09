/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_7;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");int n = sc.nextInt();
        int a[] = new int[n+1];
        
        System.out.println("\nEnter elements in array");
        for(int i=0; i<a.length-1; i++)
            a[i] = sc.nextInt();
        
        System.out.println("\nElemets of array are");
        for(int i=0; i<a.length-1; i++)
            System.out.print(" "+a[i]);
        
        System.out.print("\nEnter element to insert: ");int ele = sc.nextInt();
        System.out.print("\nEnter position to insert element: ");int pos = sc.nextInt();
        
        Insert a1 = new Insert();
        
        int arrrr[] = a1.getArray(a,ele,pos);
        System.out.println("Elements of array after insertion");
        for(int i=0; i<a.length; i++)
            System.out.print(" "+arrrr[i]);
        
        System.out.println();
        
                
    }
    
}

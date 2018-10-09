/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_9;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("\n Enter elements in array");
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        
        System.out.println("\n Elements of array");
        for(int i=0; i<a.length; i++)
            System.out.print(" "+a[i]);
        
        ReverseArray a1 = new ReverseArray();
        
        int arrr[] = a1.getArray(a);
        System.out.println("\nReverse array is");
        for(int i=0; i<arrr.length; i++)
            System.out.print(" "+arrr[i]);
                     
        System.out.println();
        
    }
    
}

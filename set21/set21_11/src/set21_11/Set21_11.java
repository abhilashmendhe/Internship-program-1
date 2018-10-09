/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_11;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter elements in an array");
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        
        System.out.println("Elements of array ");
        for(int i=0; i<a.length; i++)
            System.out.print(" "+a[i]);
        
        DecimalBinary a1 = new DecimalBinary();
        
        int arr[] = a1.getBinaryArray(a);
        System.out.println("\nElements of array in binary");
        for(int i=0; i<arr.length; i++)
            System.out.print(" "+arr[i]);
        
        System.out.println();
    }
    
}

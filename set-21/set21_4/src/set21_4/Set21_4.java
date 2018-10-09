/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_4;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");int n = sc.nextInt();
        
        int a[] = new int[n];
        
        System.out.println("Enter elements in array");
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        
        Sort rev = new Sort();
        
        System.out.println("Array sorted in Ascending array");
        int arrayAscending[] = rev.getAscending(a);
        
        for(int i=0; i<arrayAscending.length; i++)
            System.out.print(" "+arrayAscending[i]);
        
        
        System.out.println();
        
        System.out.println("Array sorted in Descending array");
        int arrayDescending[] = rev.getDescending(a);
        
        for(int i=0; i<arrayDescending.length; i++)
            System.out.print(" "+arrayDescending[i]);
        
        System.out.println();
    }
    
}

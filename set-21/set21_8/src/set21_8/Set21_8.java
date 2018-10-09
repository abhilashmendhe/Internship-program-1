/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_8;

/**
 *
 * @author abhi
 */
import java.util.*;
import javax.sound.midi.Soundbank;
public class Set21_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter elements of array");
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        
        System.out.println("\nElements of array are");
        for(int i=0; i<a.length; i++)
            System.out.print(" "+a[i]);
        
        System.out.print("\nEnter element to delete: ");int ele = sc.nextInt();
        
               
        System.out.println("\nArray after deletion");
        Delete a1 = new Delete();
        int arrr[] = a1.getArray(a, ele);
        
        for(int i=0; i<arrr.length-1; i++)
            System.out.print(" "+arrr[i]);
        System.out.println();
    }
   
}

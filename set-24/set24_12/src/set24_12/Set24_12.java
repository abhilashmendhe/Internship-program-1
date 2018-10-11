/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_12;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set24_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("\nEnter elements in array");
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        
        
        Array a1 = new Array(arr);
        Array a2 = new Array(arr);
        
        Sort s = new Sort();
        
        s.getAscending(a1);
        s.getDescending(a2);
        
        System.out.println();
    }
    
}

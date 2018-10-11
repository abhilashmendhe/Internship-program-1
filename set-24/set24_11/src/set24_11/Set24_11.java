/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_11;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set24_11 {

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
        
        Array ar = new Array(arr);
        
        BigSmall bs = new BigSmall();
        
        int retarr[] = bs.getBigSmall(ar);
        
        System.out.println("Swap of big and small elements in array is");
        for(int i=0; i<retarr.length; i++)
            System.out.print(" "+retarr[i]);
        
        System.out.println();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_2;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set24_2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Average aa = new Average();
       
        
        double m1 = aa.getAvg(10, 20);
        double m2 = aa.getAvg(10, 20, 30);
        double m3 = aa.getAvg(10, 20, 30, 40);
        
        System.out.println("Average of two numbers: "+m1);
        System.out.println("Average of three numbers: "+m2);
        System.out.println("Average of four numbers: "+m3);
        
        System.out.print("Enter n: ");int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter elements in array");
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        double m4 = aa.getAvg(a);
        System.out.println("Average of n:"+n+" numbers: "+m4);
        
    }
    
}

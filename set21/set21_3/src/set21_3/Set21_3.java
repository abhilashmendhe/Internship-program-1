/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_3;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("\nEnter elements in array");
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
       
        Mean m1 = new Mean();
        double m = m1.computeMean(a);
        System.out.println("Mean is "+m);
        
        StandardDeviation sd1 = new StandardDeviation();
        
        double sd = sd1.getSD(a,m);
        System.out.println("SD is "+sd);
    }
    
}

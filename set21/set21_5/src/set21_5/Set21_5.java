/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_5;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");int n1 = sc.nextInt();
        int a1[] = new int[n1];
        System.out.print("Enter n2: ");int n2 = sc.nextInt();
        int a2[] = new int[n2];
        System.out.println();
        System.out.println("Enter elements in first array");
        for(int i=0; i<a1.length; i++)
            a1[i] = sc.nextInt();
        
        System.out.println("Enter elements in Second array");
        for(int i=0; i<a2.length; i++)
            a2[i] = sc.nextInt();
        
        
        
        
        Merge mg = new Merge();
        System.out.println("Merged array after one after another");
        int merge1[] = mg.getOneAfterAnother(a1, a2);
        
        for(int i=0; i<merge1.length; i++)
            System.out.print(" "+merge1[i]);
        
        System.out.println();
        
        System.out.println("Merged array consecutevely");
        int merge2[] = mg.getConsecutively(a1, a2);
        
        for(int i=0; i<merge2.length; i++)
            System.out.print(" "+merge2[i]);
        
        System.out.println();
        
    }
    
}

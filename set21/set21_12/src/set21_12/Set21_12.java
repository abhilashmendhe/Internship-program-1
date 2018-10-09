/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_12;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");int r = sc.nextInt();
        System.out.print("Enter column: ");int c = sc.nextInt();
        int mat[][] = new int[r][c];
    
        System.out.println("\nEnter elements in matrix");
        for(int i=0; i<mat.length; i++)
            for(int j=0; j<mat[0].length; j++)
                mat[i][j] = sc.nextInt();
        
        System.out.println("\nElements of matrix");
        for(int i=0; i<mat.length; i++)
        {    
            for(int j=0; j<mat[0].length; j++)
                System.out.print(" "+mat[i][j]);
            System.out.println();
        }
    
        Calculate a1 = new Calculate();
        int trace = a1.getTrace(mat);
        System.out.println("Trace is "+trace);
        
        double normal = a1.getNormal(mat);
        System.out.println("Normal is "+normal);
    }
    
}

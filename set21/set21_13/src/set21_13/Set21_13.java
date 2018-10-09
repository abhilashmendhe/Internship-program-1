/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_13;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");int r = sc.nextInt();
        System.out.print("Enter column: ");int c = sc.nextInt();
        
        int mat[][] = new int[r][c];
        System.out.println("\nEnter Elements in matrix");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                mat[i][j] = sc.nextInt();
        }
        
        System.out.println("\nElements in matrix");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                System.out.print(" "+mat[i][j]);
            System.out.println();
        }
        
      Transpose a1 = new Transpose();
      
      int trans[][] = a1.getTranspose(mat);
      System.out.println("Transpose matrix is");
      for(int i=0; i<trans.length; i++)
        {
            for(int j=0; j<trans[0].length; j++)
                System.out.print(" "+trans[i][j]);
            
            System.out.println();
        }
      
        System.out.println();
    }
    
}

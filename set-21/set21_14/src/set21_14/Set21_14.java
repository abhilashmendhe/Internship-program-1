/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_14;

/**
 *
 * @author abhi
 */
import java.util.*;
public class Set21_14 {

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
        
        System.out.print("Enter the first row to change: ");int row1 = sc.nextInt();
        System.out.print("Enter the second row to change: ");int row2 = sc.nextInt();
        
        Interchange a1 = new Interchange();
        
        int matrow[][] = a1.getRowInterchange(mat, row1, row2);
        
        System.out.println("After Interchange of rows");
        for(int i=0; i<matrow.length; i++)
        {
            for(int j=0; j<matrow[0].length; j++)
                System.out.print(" "+matrow[i][j]);
            System.out.println();
        }
        
        System.out.print("Enter the first col to change: ");int col1 = sc.nextInt();
        System.out.print("Enter the second col to change: ");int col2 = sc.nextInt();
        
        int matcol[][] = a1.getColInterchange(mat, col1, col2);
        
        System.out.println("After Interchange of columns");
        for(int i=0; i<matcol.length; i++)
        {
            for(int j=0; j<matcol[0].length; j++)
                System.out.print(" "+matcol[i][j]);
            System.out.println();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_10;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set24_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        
        System.out.println("Enter elements in first matrix");
        for(int i=0; i<mat1.length; i++)
        {    for(int j=0; j<mat1[0].length; j++)
                mat1[i][j] = sc.nextInt();
        }
        System.out.println("Enter elements in second matrix");
        for(int i=0; i<mat2.length; i++)
        {    for(int j=0; j<mat2[0].length; j++)
                mat2[i][j] = sc.nextInt();
        }
        
        Matrix1 m1 = new Matrix1(mat1);
        Matrix2 m2 = new Matrix2(mat2);
        
        Addition add = new Addition();
        
        int addmat[][] = add.getAddition(m1, m2);
        
        
        System.out.println("Addition of two matrix");
        for(int i=0; i<addmat.length; i++)
        {
            for(int j=0; j<addmat[0].length; j++)
                System.out.print(" "+addmat[i][j]);
            
            System.out.println();
        }
        
    }
    
}

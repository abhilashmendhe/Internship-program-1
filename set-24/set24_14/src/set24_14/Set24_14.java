/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_14;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set24_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        System.out.println("Enter elements in matrix");
        
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                mat[i][j] = sc.nextInt();
        }
        
        Matrix m = new Matrix(mat);
        Elements ele = new Elements();
        int above[] = ele.getAboveSecondryDiagonlaElements(m);
        int below[] = ele.getBelowSecondryDiagonlaElements(m);
        System.out.println("Elements above secondry matrix");
        for(int i=0; i<above.length; i++)
            System.out.print(" "+above[i]);
        
        System.out.println();
        
        System.out.println("Elements below secondry matrix");
        for(int i=0; i<below.length; i++)
            System.out.print(" "+below[i]);
    
        System.out.println();
        
    }
    
}

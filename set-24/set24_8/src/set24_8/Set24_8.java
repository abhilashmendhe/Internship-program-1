/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_8;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set24_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[2][2];
        System.out.println("Enter elements in matrix");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                mat[i][j]=sc.nextInt();
        }
        
        Transpose ttt = new Transpose(mat);
        ttt.getTranspose();
    }
    
}

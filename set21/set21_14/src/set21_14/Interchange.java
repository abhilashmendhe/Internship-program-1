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
public class Interchange {

    public int[][] getRowInterchange(int mat[][], int row1, int row2)
    {
        for(int i=0; i<mat[0].length; i++)
        {
            int tmp = mat[row1-1][i];
            mat[row1-1][i] = mat[row2-1][i];
            mat[row2-1][i] = tmp;
        }
        
        return mat;
    }
    
    public int[][] getColInterchange(int mat[][], int col1, int col2)
    {
        for(int i=0; i<mat.length; i++)
        {
            int tmp = mat[i][col1-1];
            mat[i][col1-1] = mat[i][col2-1];
            mat[i][col2-1] = tmp;
        }
        
        return mat;
    }
}

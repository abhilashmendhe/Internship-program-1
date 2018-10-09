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
public class Transpose {

    public int[][] getTranspose(int mat[][])
    {
        int tmp[][] = new int[mat[0].length][mat.length];
        for(int i=0; i<tmp.length; i++)
        {
            for(int j=0; j<tmp[0].length; j++)
                tmp[i][j] = mat[j][i];
        }
        return tmp;
    }
}

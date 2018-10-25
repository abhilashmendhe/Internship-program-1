/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixops;

/**
 *
 * @author abhil
 */
public class Addition {

    public int[][] getAdd(int m1[][], int m2[][])
    {
        int add[][] = new int[m1.length][m2[0].length];
        
        for(int i=0; i<add.length; i++)
        {
            for(int j=0; j<add[0].length; j++)
                add[i][j] = m1[i][j] + m2[i][j];
        }
        
        return add;
    }
}

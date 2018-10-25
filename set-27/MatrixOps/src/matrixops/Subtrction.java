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
public class Subtrction {
    
    public int[][] getSub(int m1[][], int m2[][])
    {
        int sub[][] = new int[m1.length][m2[0].length];
        
        for(int i=0; i<sub.length; i++)
        {
            for(int j=0; j<sub[0].length; j++)
                sub[i][j] = m1[i][j] - m2[i][j];
        }
        
        return sub;
    }
}

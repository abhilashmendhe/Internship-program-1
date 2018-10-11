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
public class Addition {
    
    int[][] getAddition(Matrix1 m1, Matrix2 m2)
    {
        
        int add[][] = new int[m1.mat1.length][m2.mat222[0].length];
        
        for(int i=0; i<m1.mat1.length; i++)
        {
            for(int j=0; j<m2.mat222[0].length; j++)
                add[i][j] = m1.mat1[i][j] + m2.mat222[i][j];
        }
        
        return add;
    }
}

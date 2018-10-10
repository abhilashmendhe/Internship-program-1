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
public class Transpose {

    int mat[][];
    public Transpose(int a[][]) {
    
        mat = a;
    }

    void getTranspose()
    {
        int m[][] = new int[mat[0].length][mat.length];
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                m[i][j] = mat[j][i];
        }
        
        System.out.println("Transpose is");
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
                System.out.print(" "+m[i][j]);
            
            System.out.println();
        }
    }
    
}

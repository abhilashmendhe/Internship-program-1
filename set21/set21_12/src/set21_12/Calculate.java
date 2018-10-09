/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_12;

/**
 *
 * @author abhi
 */
public class Calculate {

    public int getTrace(int mat[][])
    {
        int sum = 0;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                if(i==j)
                    sum+=mat[i][j];
        }
       return sum;
    }

    public double getNormal(int mat[][])
    {
        int normal = 0;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                    normal += (int)Math.pow(mat[i][j], 2);
        }
        
        return Math.sqrt(normal);
    }
}

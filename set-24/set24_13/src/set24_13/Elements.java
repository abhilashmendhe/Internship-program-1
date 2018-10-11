/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_13;

/**
 *
 * @author abhil
 */
public class Elements {
 
    int [] getPrincipalElements(Matrix m)
    {
        int size = 0;
        for(int i=0; i<m.mat.length; i++)
        {
            for(int j=0; j<m.mat[0].length; j++)
            {
                if(i==j)
                    size++;
            }
        }
        
        int aaa[] = new int[size];
        int pos = 0;
        for(int i=0; i<m.mat.length; i++)
        {
            for(int j=0; j<m.mat[0].length; j++)
            {
                if(i==j)
                    aaa[pos++]=m.mat[i][j];
            }
        }
        return aaa;
    }
}

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
public class Elements {

    int [] getAboveSecondryDiagonlaElements(Matrix m)
    {
        int size = 0;
        
        for(int i=0; i<m.mat.length; i++)
        {
            for(int j=0; j<m.mat[0].length; j++)
            {
                if(j<m.mat[0].length-1-i)
                    size++;
            }
        }
        
        int a1[] = new int[size];
        int pos = 0;
        for(int i=0; i<m.mat.length; i++)
        {
            for(int j=0; j<m.mat[0].length; j++)
            {
                if(j<m.mat[0].length-1-i)
                    a1[pos++]=m.mat[i][j];
            }
        }
        
        return a1;
    }
    
    int [] getBelowSecondryDiagonlaElements(Matrix m)
    {
        int size = 0;
        
        for(int i=0; i<m.mat.length; i++)
        {
            for(int j=0; j<m.mat[0].length; j++)
            {
                if(m.mat[0].length-1-i<j)
                    size++;
            }
        }
        
        int a1[] = new int[size];
        int pos = 0;
        for(int i=0; i<m.mat.length; i++)
        {
            for(int j=0; j<m.mat[0].length; j++)
            {
                if(m.mat[0].length-1-i<j)
                    a1[pos++]=m.mat[i][j];
            }
        }
        
        return a1;
    }
}

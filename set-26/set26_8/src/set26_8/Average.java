/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set26_8;

/**
 *
 * @author abhil
 */
public class Average {
    
    public void getAverage(int m1[][], int m2[][])
    {
        int summat1 = 0;
        int summat2 = 0;
        for(int i=0; i<m1.length; i++)
        {
            for(int j=0; j<m1[0].length; j++)
                summat1 += m1[i][j];
        }
        
        for(int i=0; i<m2.length; i++)
        {
            for(int j=0; j<m2[0].length; j++)
                summat2 += m2[i][j];
        }
        
        double average = (double)(summat1 + summat2)/2;
        
        System.out.println("Average is "+average);
    }
}

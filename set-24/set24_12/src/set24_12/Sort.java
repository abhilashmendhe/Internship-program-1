/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_12;

/**
 *
 * @author abhil
 */
public class Sort {
    
    void getAscending(Array a1)
    {
        int ascen[] = a1.a;
        for(int i=0; i<ascen.length; i++)
        {
            for(int j=0; j<ascen.length-1; j++)
            {
                if(ascen[j]>ascen[j+1])
                {
                    int tmp = ascen[j];
                    ascen[j] = ascen[j+1];
                    ascen[j+1] = tmp;
                }
            }
        }
        System.out.println("Sorted element of arrays in ascending order");
        for(int i=0; i<ascen.length; i++)
            System.out.print(" "+ascen[i]);
    }
    
    void getDescending(Array a1)
    {
        int desce[] = a1.a;
        for(int i=0; i<desce.length; i++)
        {
            for(int j=0; j<desce.length-1; j++)
            {
                if(desce[j]<desce[j+1])
                {
                    int tmp = desce[j];
                    desce[j] = desce[j+1];
                    desce[j+1] = tmp;
                }
            }
        }
        System.out.println("\nSorted element of arrays in descending order");
        for(int i=0; i<desce.length; i++)
            System.out.print(" "+desce[i]);
    }
    
    
}

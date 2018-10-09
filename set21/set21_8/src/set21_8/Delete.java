/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_8;

/**
 *
 * @author abhi
 */
public class Delete {

    public int[] getArray(int b[], int element)
    {
        
        for(int i=0; i<b.length-1; i++)
        {
            if(element == b[i])
            {        
                b[i] = b[i+1];         
                element = b[i+1];
            }
            /*if(i==b.length-2)
            {
                if(element == b[i+1])
                    b[i] = b[i];
            }*/
        }
        return b;
    }
}

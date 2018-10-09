/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_7;

/**
 *
 * @author abhi
 */
public class Insert {

    public int[] getArray(int b[], int element, int position)
    {
        int pos = position - 1;
        for(int i=0; i<b.length; i++)
        {
            if(pos==b[i])
            {
                for(int j=b.length-1; j>pos; j--)
                    b[j] = b[j-1];
            }
        }
        b[pos] = element;
        return b;
    }
}

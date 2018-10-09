/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_9;

/**
 *
 * @author abhi
 */
public class ReverseArray {

    public int [] getArray(int b[])
    {
    for(int i=0; i<b.length/2; i++)
        {
            int tmp = b[i];
            b[i] = b[b.length-1-i];
            b[b.length-1-i] = tmp;
        }
        return b;
    }
}

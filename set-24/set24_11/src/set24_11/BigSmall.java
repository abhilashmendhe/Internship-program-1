/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_11;

/**
 *
 * @author abhil
 */
public class BigSmall {

    int[] getBigSmall(Array arr)
    {
        int big=arr.a1[0];
        int small=arr.a1[0];
        int swap[] = arr.a1;
        int pos1 = 0;
        int pos2 = 0;
        for(int i=0; i<arr.a1.length; i++)
        {
            if(big < arr.a1[i])
                big = arr.a1[i];
            if(small > arr.a1[i])
                small = arr.a1[i];
        
            if(big == arr.a1[i])
                pos1 = i;
            
            
            if(small == arr.a1[i])
                pos2 = i;
        }
        
        int tmp = swap[pos1];
        swap[pos1] = swap[pos2];
        swap[pos2] = tmp;
        
        return swap;
    }

   
}

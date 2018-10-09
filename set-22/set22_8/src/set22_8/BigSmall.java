/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_8;

/**
 *
 * @author abhil
 */
public class BigSmall {

   
    void getBigSum(int b[])
        {
            int big = b[0];
            int small = b[0];
            for(int i=0; i<b.length; i++)
            {
                if(big < b[i])
                    big = b[i];
                if(small > b[i])
                    small = b[i];
            }
            Data.big = big;
            Data.small = small;
            
            System.out.println("Biggest is "+Data.big);
            System.out.println("Smallest is "+Data.small);
        }
}

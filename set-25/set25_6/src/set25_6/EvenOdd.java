/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_6;

/**
 *
 * @author abhil
 */
public class EvenOdd {
    
    Datakeeper evenodd(int a[])
    {
        
        int evensize = 0;
        int oddsize = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
                evensize++;
            else
                oddsize++;
        }
        int even[] = new int[evensize];
        int odd[] = new int[oddsize];
        
        int pos1=0;
        int pos2=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
                even[pos1++]=a[i];
            else
                odd[pos2++]=a[i];
        }
        
        Datakeeper d = new Datakeeper();
        d.even=even;
        d.odd=odd;
        
        return d;
    }
}

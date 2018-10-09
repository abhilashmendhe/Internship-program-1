/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_4;

/**
 *
 * @author abhil
 */
public class SumOfArray {

    int a;
    
    void getData(int x)
    {
        a = x;
    }
    
    public int getSum(SumOfArray a[])
    {
        int sum = 0;
        
        for(int i=0; i<a.length; i++)
        {
            sum += a[i].a;
        }
        return sum;
    }
    
}

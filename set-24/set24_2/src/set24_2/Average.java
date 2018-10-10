/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_2;

/**
 *
 * @author abhil
 */
public class Average {
    
    double getAvg(int a, int b)
    {
        double av = (double)((a+b)/2);
        return av;
    }
    
    double getAvg(int a, int b, int c)
    {
        double av = (double)((a+b+c)/3);
        return av;
    }
    
    double getAvg(int a, int b, int c, int d)
    {
        double av = (double)((a+b+c+d)/4);
        return av;
    }
    
    double getAvg(int arr[])
    {
        double av = 0;
        for(int i=0; i<arr.length; i++)
        {
            av = (double)(av + arr[i]);
        }
        av = (double)(av/arr.length);
        return av;
    }
}

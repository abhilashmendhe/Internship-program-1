/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_5;

/**
 *
 * @author abhil
 */
public class GCD3 {
    
    int a,b;

    public GCD3(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    int getGCD(GCD3 g)
    {
        int gg = 0;
        int i=1;
        
        while((g.a+g.b)>i)
        {
            if(g.a % i==0 && g.b % i==0)
                gg = i;
            
            i++;
        }
        
        return gg;
    }
}

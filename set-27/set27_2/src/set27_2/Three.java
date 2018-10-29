/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set27_2;

/**
 *
 * @author abhil
 */
public class Three extends Two{

    public int a,b;
    
    void getData(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    void findProcess()
    {
        int t = 1;
        int t1 = 1;
        while(t < a+b)
        {
            if(a%t==0&&b%t==0)
                t1 = t;
            t++;
        }
        System.out.println("GCD is "+t1);
    }
}

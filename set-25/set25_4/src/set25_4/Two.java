/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_4;

/**
 *
 * @author abhil
 */
public class Two extends One {
    
    int b;
    
    void getData(int a, int b)
    {
      this.b = b;
      super.getData(a);
    }
    
    void getGCD()
    {
        int i=1;
        int g=1;
        while((a+b)>i)
        {
            if(a%i==0 && b%i==0)
                g = i;
                
            i++;
        }
        System.out.println("GCD is "+g);
    }
            
}

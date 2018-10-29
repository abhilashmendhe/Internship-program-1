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
public class Two extends One{
    
    public int a, b;
    
    void getData(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    void findProcess()
    {
        if(a>b)
            System.out.println("A is the greatest");
        else
            System.out.println("B is the greatest");
    }
    
}

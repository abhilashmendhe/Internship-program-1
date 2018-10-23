/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_9;

/**
 *
 * @author abhil
 */
public class C extends B{
    
    private int c;
    
    public void getC(int a)
    {
        c = a;
    }
    
    public void getBiggest()
    {
        if(retA() > retB() && retA() > c)
            System.out.println("A is the biggest");
        else if (retB() > retA() && retB() > c)
            System.out.println("B is the biggest");
        else
            System.out.println("C is the biggest");
    }
}

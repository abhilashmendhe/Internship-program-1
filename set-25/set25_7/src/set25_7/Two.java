/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_7;

/**
 *
 * @author abhil
 */
public class Two  extends One{
    
    int x;
    
    void getData(int a, int b)
    {
        super.getData(a);
        x = b;
    }
    
    void getDivisible()
    {
        if(super.x%5==0 && x%5==0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
    }
}

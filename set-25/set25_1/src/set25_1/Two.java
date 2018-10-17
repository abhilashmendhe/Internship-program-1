/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set25_1;

/**
 *
 * @author abhil
 */
public class Two extends One {
 
    int y;
    
    void getY(int b)
    {
        y = b;
    }
           
    void getBiggest()
    {
        if(x>y)
            System.out.println("X is the biggest");
        else
            System.out.println("Y is the biggest");
    }
}

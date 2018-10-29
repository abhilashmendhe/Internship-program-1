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
public class One {

    public int a,b;
    
    void getData(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    void findProcess()
    {
        int sum = a + b;
        System.out.println("Addition of two numbers are "+sum);
    }
}

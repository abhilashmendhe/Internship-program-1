/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_1;

/**
 *
 * @author abhi
 */
public class Add {

    public int a, b;
    
    public void getData(int x, int y)
    {
        a=x;
        b=y;
    }
    public int getSum()
    {
        return (a+b);
    }
    public void displaySum(int s)
    {
        System.out.println(s);
    }
}

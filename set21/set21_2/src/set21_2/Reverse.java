/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set21_2;

/**
 *
 * @author abhi
 */
public class Reverse {
    int num;
    
    public void getData(int n)
    {
        num = n;
    }
    
    public int getReverse()
    {
        int rev = 0;
        while(num>0)
        {
        int r = num % 10;
        rev = rev*10+r;
        num = num / 10;
        }
        return rev;
    }
    
    public void displayReverse(int reverse)
    {
        System.out.println(reverse);
    }
}

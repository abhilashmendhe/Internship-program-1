/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign15;

/**
 *
 * @author abhilash
 */
public class Assign15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 50, b = 10;
        int gcd = getGCD(a, b);
        System.out.println("GCD: "+gcd);
    }
    public static int getGCD(int a, int b)
    {
        if(a<b)
        {
            if(a%a==0 && b%a==0)
                return a;
            else
                return getGCD(a, b-a);
        }
        else
        {
            if(a%b==0 && b%b==0)
                return b;
            else
                return getGCD(a-b, b);
        }
    }
    
}

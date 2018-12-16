/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign9;

/**
 *
 * @author abhilash
 */
public class Assign9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int fact = getFactorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
    
    public static int getFactorial(int n)
    {
        if(n==1)
            return 1;
        else
            return (n * getFactorial(n-1));
                    
    }
    
}

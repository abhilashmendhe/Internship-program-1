/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign14;

/**
 *
 * @author abhilash
 */
public class Assign14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n = 3;
        double x = 1;
        System.out.println("Sum of series: "+getSum(x, n));
    }
    
    public static double getSum(double x, double n)
    {
        if(n==0)
            return 0;
        else
            return ((1/(x+n)) + getSum(x, n-1));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign12;

/**
 *
 * @author abhilash
 */
public class Assign12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n = 4;
        double sum = getSum(n);
        System.out.println("Sum of series is "+sum);
    }

    public static double getSum(double n)
    {
        if(n==0)
            return 0;
        else
            return ((n/Math.pow(n, 2)) + getSum(n-1));
    }
}

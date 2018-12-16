/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign11;

/**
 *
 * @author abhilash
 */
public class Assign11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int sum = getSum(n);
        System.out.println("Sum of series is "+sum);
    }

    public static int getSum(int n)
    {
        if(n==1)
            return 1;
        else
            return (n + getSum(n-1));
    }
}

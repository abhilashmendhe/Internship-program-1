/**
 * @(#)Sixth.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Sixth {

    public static void main(String args[])
    {
    	int num = 981;

    	int ans = getSumOfDigits(num);
    	System.out.println("Sum of digits is "+ans);
    }

    static int getSumOfDigits(int n)
    {
    	int sum = 0;

    	while(n>0)
    	{
    		int r = n % 10;
    		sum += r;
    		n = n / 10;
    	}
    	return sum;
    }

}
/**
 * @(#)First.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class First {

    public static void main(String args[])
    {
    	int n=1234;
    	int r = getReverse(n);
    	System.out.println("Reverse of a number is "+r);
    }

    static int getReverse(int num)
    {
    	int rev = 0;
    	while(num>0)
    	{
    		int r = num % 10;
    		rev = rev * 10 + r;
    		num = num / 10;
    	}

		return rev;
    }

}
/**
 * @(#)Second.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
public class Second {

	public static void main(String args[])
	{
		int n = 9871;
		getReverse(n);
	}

	static void getReverse(int num)
	{
		int rev = 0;
		while(num>0)
		{
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}

		System.out.println("Reverse is "+rev);
	}

}
/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set3;
public class Assign2 {


	public static void main(String args[])
	{
		int a=13,b=70,c=14;

		int ans = ( a > b && a > c)? a : ( b > a && b > c)? b : c;

		System.out.println("Biggest among 3 variables is "+ans);
	}
}
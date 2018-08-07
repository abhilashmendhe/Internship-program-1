/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set2;
public class Assign10 {

	public static void main(String args[])
	{
		double b=3,c=-5,A=4,B=2;

		double mod_b = Math.abs(b);

		double compute1 = Math.pow(2,2) / mod_b;
		double compute2 = (Math.sqrt( 3 * Math.pow(A,2))) + (Math.sqrt( 8 * B ));

		double ans = compute1 + compute2;

		System.out.println("Answer is "+ans);
	}


}
/**
 * @(#)Assign11.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */
package set2;

public class Assign11 {

	public static void main(String args[])
	{
		double x = 25, y = 2;

		double compute1 = x - Math.pow(y,3);
		//System.out.println(compute1);
		double compute2 = Math.sqrt(compute1);
//System.out.println(compute2);
		double compute3 = Math.sin(compute2);

		double compute4 = Math.exp(x);
//System.out.println(compute4);
		double ans = compute3 * compute4;

		System.out.println("Answer is "+ans);
	}

}
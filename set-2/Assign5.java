/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */
package set2;

public class Assign5 {

	public static void main(String args[])
	{
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;

		double mean = (a + b + c + d + e)/5;

		double a1 = Math.pow(mean - a,2);
		double b1 = Math.pow(mean - b,2);
		double c1 = Math.pow(mean - c,2);
		double d1 = Math.pow(mean - d,2);
		double e1 = Math.pow(mean - e,2);

		double var = (a1+b1+c1+d1+e1)/5;
		double stan_var = Math.sqrt(var);


		System.out.println(mean);
		System.out.println(stan_var);
	}


}
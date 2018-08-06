/**
 * @(#)SimpleInterest.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */
package set2;

public class SimpleInterest {

	public static void main(String args[])
	{
		int princ = 1000;
		int rate = 10;
		int time = 10;

		double simple_interest = (princ*rate*time)/100;

		System.out.println("Simple Interest is "+simple_interest);
	}

}
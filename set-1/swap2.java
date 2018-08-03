/**
 * @(#)swap2.java
 *
 *
 * @author
 * @version 1.00 2018/8/3
 */

package set1;

public class swap2 {

	public static void main(String args[]) {
		int a=111,b=234;

		System.out.println("After swap value of a is "+a);
		System.out.println("After swap value of b is "+b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap value of a is "+a);
		System.out.println("After swap value of b is "+b);
		}
}
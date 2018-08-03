/**
 * @(#)swap1.java
 *
 *
 * @author
 * @version 1.00 2018/8/3
 */

package set1;
public class swap1 {

	public static void main(String args[]){
		int a=123,b=2345,c;

		System.out.println("Before swap value of a is "+a);
		System.out.println("Before swap value of b is "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swap value of a is "+a);
		System.out.println("After swap value of b is "+b);
		}

}
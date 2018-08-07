/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set2;
public class Assign9 {

	public static void main(String args[]){
		int m=3,n=4,p=10;
		int x=7,y=8;
		int a=11,b=12,c=13;


		double compute1 = m + n + p;
		double compute2 = x+y;
		double compute3 = Math.pow(compute1,compute2);
		System.out.println("Compute2 value is "+compute3);
		double compute4 = Math.sqrt(compute3);
		double compute5 = (double)(a+b+c)/(m+n);
		System.out.println("Compute5 value is "+compute5);
		double answer = compute4 / compute5;

		System.out.println("Answer is "+ answer);
		}

}
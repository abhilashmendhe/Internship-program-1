/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;

public class Assign3 {

	public static void main(String args[]) {
System.out.println("Enter sides of trianlge");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//	double p = (double)(a+b+c)/2;
//		double compute = (double)Math.sqrt( p * (p-a) * (p-b) * (p-c));

//		System.out.println(compute);
//		if ( (a<=0 || b<=0 || c<=0) || (compute==0)){
//			System.out.println("Does not form a triangle");
//			}
		 if ( a==b && b==c && c==a){
			System.out.println("It's an equilateral triangle");
			}
		else if ( a==b || b==c || c==a){
			System.out.println("It's an isosceles triangle");
			}
		else {
			System.out.println("It's a scalene triangle");
			}
		}

}
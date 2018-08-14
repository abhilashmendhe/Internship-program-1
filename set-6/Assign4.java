/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;

public class Assign4 {

	public static void main(String args[]){
		System.out.println("Enter values a,b and c");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


		double disc = (double) ( b*b ) - ( 4 * a * c);

		if ( disc < 0)i89
			System.out.println("Roots are imaginary");

		else if (disc == 0)
			System.out.println("Roots are equal");

		else
			System.out.println("Roots are real");

		}

}
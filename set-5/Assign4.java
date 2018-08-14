/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/13
 */

package set5;

import java.util.*;

public class Assign4 {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		if ( a > 0){
			a += 10;
			System.out.println("Value of a entered is +ve integer therefore a is: "+a);
			}
		else {
			a += 100;
			System.out.println("Value of a entered is -ve integer therfore a is: "+a);
			}
		}
}
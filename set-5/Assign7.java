/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/8/13
 */

package set5;

import java.util.*;

public class Assign7 {

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers to find the biggest of all");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

	int big;

	if ( a > b ){

		if ( a > c ){
  			big = a;
  			System.out.println("A is biggest of all");
		}
		else
		{
			big = c;
		System.out.println("C is biggest of all");
		}
    }
	else {
		if ( b > c ){
			big = b;
			System.out.println("B is biggest of all");
			}
		else {
			big = c ;
			System.out.println("C is biggest of all");
		}
	}
	System.out.println(big+" is biggest of all");
    }

}
/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/13
 */
package set5;

import java.util.*;

public class Assign6 {

    public static void main(String args[]){

    	Scanner sc = new  Scanner(System.in);
System.out.println("Enter numbers to check the biggest of all");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();

		if ( (a > b && a > c) )
		{
			System.out.println("A is the biggest int");
		}
		else if ( (b > a && b > c) )
		{
			System.out.println("B is the biggest int");
		}
		else
		{
			System.out.println("C is the biggest int");
		}
    	}


}
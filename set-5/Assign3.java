/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/8/13
 */
package set5;

import java.util.*;

public class Assign3 {

    public static void main(String args[]){

    	Scanner sc = new Scanner(System.in);

		System.out.println("Take two nos.");
    	int a = sc.nextInt();
    	int b = sc.nextInt();

    	if ( a%3 == 0 && b%3 == 0){

			System.out.println("IF cond.");
    		System.out.println("Before Swap a is: "+a);
    		System.out.println("Before Swap b is: "+b);

    		int tmp;
    		tmp = a;
    		a = b;
    		b = tmp;

    		System.out.println("After Swap a is: "+a);
    		System.out.println("After Swap b is: "+b);
    		}

    	else {
			System.out.println("ELSE cond.");
    		System.out.println("Before Swap a is: "+a);
    		System.out.println("Before Swap b is: "+b);

    		a = a + b;
    		b = a - b;
    		a = a - b;

    		System.out.println("After Swap a is: "+a);
    		System.out.println("After Swap b is: "+b);

    		}

    	}


}
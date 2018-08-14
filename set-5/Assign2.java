/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/8/13
 */
package set5;

import java.util.*;

public class Assign2 {

    public static void main(String args[]){
    	System.out.println("Take two integers");
   		Scanner sc 	= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if ( b != 0)
		{
			double out = (double) a / b;
			System.out.println("Answer is "+out);
		}
    }

}
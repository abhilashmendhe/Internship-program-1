/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/8/16
 */

package set7;
import java.util.*;
public class Assign1 {

    public static void main(String args[])
    {
    	System.out.println("Enter number");
    	Scanner sc = new Scanner(System.in);

    	int a = sc.nextInt();


    	switch (a%2){


    		case 0:
    			System.out.println("Even");
    			break;
    		case 1:
    			System.out.println("Odd");
    			break;
    	}
    }


}
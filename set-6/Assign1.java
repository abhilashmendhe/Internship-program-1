/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;

public class Assign1 {

	public static void main(String args[]){
System.out.println("Enter an integer to check if it's and odd or even number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if ( a%2 == 0 ){
			System.out.println("It's an even number");
			}
		else {
			System.out.println("It's an odd number");
		}

		}

}
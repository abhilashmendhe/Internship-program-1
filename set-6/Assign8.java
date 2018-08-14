/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;

public class Assign8 {

	public static void main(String argsp[]){

		System.out.println("Enter salary");
		Scanner sc = new Scanner(System.in);

		int sal = sc.nextInt();

		if ( sal < 15000 )
			System.out.println("Peon");
		else if (sal >= 15001 && sal <= 25000)
			System.out.println("2nd Division clerk");
		else if (sal >= 25001 && sal <= 35000)
			System.out.println("1st Division clerk");
		else if (sal >= 35001 && sal <= 45000)
			System.out.println("Assistant Manager");
		else if (sal >= 45001 && sal <= 60000)
			System.out.println("Manager");
		else
			System.out.println("Invalid");

		}

}
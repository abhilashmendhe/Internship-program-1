/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;

public class Assign7 {

	public static void main(String args[])
	{
		System.out.println("Enter marks");
		Scanner sc = new Scanner(System.in);
		double marks = sc.nextInt();

		if ( marks >=0 && marks <= 35 )
			System.out.println("Fail");
		else if ( marks >=36 && marks <= 40 )
			System.out.println("Pass Class");

		else if ( marks >=41 && marks <= 50 )
			System.out.println("3rd Class");

		else if ( marks >=51 && marks <= 60 )
			System.out.println("2nd Class");

		else if ( marks >=61 && marks <= 70 )
			System.out.println("1st Class");
		else if ( marks >=71 && marks <= 100)
			System.out.println("Distinction");
		else
			System.out.println("Invalid");
	}
}
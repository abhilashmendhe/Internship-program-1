/**
 * @(#)Seventh.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
import java.util.*;
public class Seventh {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
		int f=1;
		do
		{
			System.out.println("Enter choice");

			System.out.println("'v' Voilet");
			System.out.println("'i' Indigo");
			System.out.println("'b' Blue");
			System.out.println("'g' Green");
			System.out.println("'y' Yellow");
			System.out.println("'o' Orange");
			System.out.println("'r' Red");
			char choice = sc.next().charAt(0);
			switch(choice)
			{
				case 'v':
					System.out.println("Violet");
					break;
				case 'i':
					System.out.println("Indigo");
					break;
				case 'b':
					System.out.println("Blue");
					break;
				case 'g':
					System.out.println("Green");
					break;
				case 'y':
					System.out.println("Yellow");
					break;
				case 'o':
					System.out.println("Orange");
					break;
				case 'r':
					System.out.println("Red");
					break;
				default:
					System.out.println("Invalid input");
					break;

			}
			System.out.println("Do you want to continue");
			System.out.println("Enter 1 for 'yes' or 0 for 'no'");
			f = sc.nextInt();

		}while(f != 0);
    }


}
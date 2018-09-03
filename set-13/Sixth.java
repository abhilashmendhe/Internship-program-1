/**
 * @(#)Sixth.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
import java.util.*;
public class Sixth {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
	//	String res = sc.next();
		int a=0,b=0;
		int f=1;
		boolean flag = false;
		do
		{
			System.out.println("Enter choice");

			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Modulus");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter two numbers for Addtion");
					a = sc.nextInt();
					b = sc.nextInt();
					int sum = a + b;
					System.out.println("Addition of numbers is: "+sum);
					break;
				case 2:
					System.out.println("Enter two numbers for Subtraction");
					a = sc.nextInt();
					b = sc.nextInt();
					int sub = a - b;
					System.out.println("Subtraction of numbers is: "+sub);
					break;
				case 3:
					System.out.println("Enter two numbers for Multiplication");
					a = sc.nextInt();
					b = sc.nextInt();
					int mul = a * b;
					System.out.println("Multiplication of numbers is: "+mul);
					break;
				case 4:
					System.out.println("Enter two numbers for Division");
					double c = sc.nextDouble();
					double d = sc.nextDouble();
					double div = c / d;
					System.out.println("Division of numbers is: "+div);
					break;
				case 5:
					System.out.println("Enter two numbers for Modulus");
					a = sc.nextInt();
					b = sc.nextInt();
					int mod = a % b;
					System.out.println("Addition of numbers is: "+mod);
					break;
				default:
					System.out.println("Invalid input");
					break;

			}
			System.out.println("Do you want to continue");
			System.out.print("Enter 1 for 'yes' or 0 for 'no': ");f = sc.nextInt();

		}while(f != 0);
    }

}
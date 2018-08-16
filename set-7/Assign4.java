/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/16
 */

package set7;
import java.util.*;
public class Assign4 {

    public static void main(String args[])
    {
    	System.out.println("Enter your choice");
    	System.out.println("-----------------");
    	System.out.println("1) Addition");
    	System.out.println("2) Subtraction");
    	System.out.println("3) Multiplication");
    	System.out.println("4) Division");
    	System.out.println("5) Modulus");
    	Scanner sc = new Scanner(System.in);
    	int ch = sc.nextInt();

    	switch(ch){

    		case 1:
    			System.out.println("Enter a and b");
    			int a = sc.nextInt();
    			int b = sc.nextInt();

    			int sum = a + b;
    			System.out.println("Addition is "+sum);
    			break;
    		case 2:
    			System.out.println("Enter c and d");
    			int c = sc.nextInt();
    			int d = sc.nextInt();

    			int sub = c - d;
    			System.out.println("Subtraction is "+sub);
    			break;

    		case 3:
    			System.out.println("Enter e and f");
    			int e = sc.nextInt();
    			int f = sc.nextInt();

    			int mul = e * f;
    			System.out.println("Multiplication is "+mul);
    			break;
    		case 4:
    			System.out.println("Enter g and h");
    			int g = sc.nextInt();
    			int h = sc.nextInt();

    			double div = (double) g / h;
    			System.out.println("Division is "+div);
    			break;
    		case 5:
    			System.out.println("Enter i and j");
    			int i = sc.nextInt();
    			int j = sc.nextInt();

    			int mod = i % j;
    			System.out.println("Modulus is "+mod);
				break;

			default:
				System.out.println("Invalid choice");
				break;
    		}
    }


}
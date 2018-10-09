/**
 * @(#)First_4.java
 *
 *
 * @author
 * @version 1.00 2018/10/4
 */
package Test_2;
import java.util.*;
public class First_4 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int i=0;
    	double a,b;
    	do{

    	System.out.println("MENU");
    	System.out.println("1) ADD");
    	System.out.println("2) SUBTRACT");
    	System.out.println("3) MULTIPLY");
    	System.out.println("4) DIVISION");
    	System.out.println("5) MODULUS");

		System.out.println("\nSelect choice from above menu");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Sum is "+(a+b));
				break;
			case 2:
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Subtraction is "+(a-b));
				break;
			case 3:
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Multiplication is "+(a*b));
				break;
			case 4:
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Division is "+(a/b));
				break;
			case 5:
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Modulus is "+(a%b));
				break;
			default:
				System.out.println("Invalid choice");
				break;
		}
    	System.out.println("To continue '1' else '0'");
    	i = sc.nextInt();
    	}while(i!=0);
    }


}
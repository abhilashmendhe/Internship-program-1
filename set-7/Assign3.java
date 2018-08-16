/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/8/16
 */

package set7;
import java.util.*;
public class Assign3 {

    public static void main(String args[]){

    	System.out.println("Enter your choice");
    	System.out.println("-----------------");
    	System.out.println("1) Square");
    	System.out.println("2) Rectangle");
    	System.out.println("3) Circle");
    	System.out.println("4) Triangle");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch(choice){
			 case 1:
			 	System.out.println("Enter one side");
			 	int r = sc.nextInt();
			 	int area = r * r;
			 	System.out.println("Area of square: "+area);
				break;
			case 2:
				System.out.println("Enter side a and b");
				int a = sc.nextInt();
				int b = sc.nextInt();

				int area1 = a * b;
				System.out.println("Area of rectangle: "+area1);
				break;
			case 3:
				System.out.println("Enter radius of circle");
				double pi = 3.14;
				int rr = sc.nextInt();
				double area2 = (double) rr * Math.pow(pi,2);
				System.out.println("Area of circle: "+area2);
				break;
			case 4:
				System.out.println("Enter sides a, b and c");
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = sc.nextInt();
				double p = (double) (x+y+z)/2;
				double ar = (double) Math.sqrt(p * (p-z) * (p-y) * (p-z));
				System.out.println("Area of triangle: "+ar);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
    	}

}
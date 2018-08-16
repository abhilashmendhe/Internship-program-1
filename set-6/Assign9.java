/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;
public class Assign9 {

    public static void main(String args[]){
    	System.out.println("Enter values");
     	Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if ( (a == 0) || (b == 0) || (c == 0)){
			System.out.println("Roots can not be identified");
		}
		else {
		double	disc = (b*b) - (4*a*c);
	//	System.out.println(disc);
			if ( disc > 0 ){
				double r1 = (- b + Math.sqrt(Math.abs(disc))) / (2*a);
				double r2 = (- b - Math.sqrt(Math.abs(disc))) / (2*a);

				System.out.println("R1: "+ r1);
				System.out.println("R2: "+ r2);
				}
			else if ( disc < 0 ){
				double real = -b / (2*a);
				double img = Math.sqrt(Math.abs(disc)) / (2*a);
				System.out.println("R1: "+real+" + i"+img);
				System.out.println("R2: "+real+" - i"+img);

				}
			else if ( disc == 0 ){
					double r1 = (- b)/ (2 * a);
					double r2 = r1;
//					System.out.println("R1: "+r1);
//					System.out.println("R1: "+r2);
					System.out.println("R1==R2: "+r1+"=="+r2);

				}
		}
    }

}
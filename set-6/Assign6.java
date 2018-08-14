/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;
public class Assign6 {

 public static void main(String args[]){
 	System.out.println("Enter x1,y1 and x2,y2");
    	Scanner sc = new Scanner(System.in);
    	int x1 = sc.nextInt();
    	int y1 = sc.nextInt();
    	int x2 = sc.nextInt();
    	int y2 = sc.nextInt();


    	if ( x1 == x2 )
    		System.out.println("Line is parallel to y-axis");

  		else
  			System.out.println("Line is not parallel to x-axis");
    	}


}
/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;
public class Assign2 {


    public static void main(String args[])
    {
    	System.out.println("Take two points x and y");
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();


		if ( x>0 && y>0 ){
			System.out.println("It's on first quadrant");
			}

		else if ( x<0 && y>0 ){
			System.out.println("It's on second quadrant");
			}
		else if ( x<0 && y>0 ){
			System.out.println("It's on second quadrant");
			}
		else if ( x<0 && y<0 ){
			System.out.println("It's on third quadrant");
			}
		else if ( x>0 && y<0 ){
			System.out.println("It's on fourth quadrant");
			}
		else if ( x==0 && y>0 ){
			System.out.println("It's on positive y-axis with x==0 ");
			}
		else if ( x==0 && y<0 ){
			System.out.println("It's on negative y-axis with x==0 ");
			}
		else if ( x>0 && y==0 ){
			System.out.println("It's on positve x-axis with y==0 ");
			}
		else if ( x<0 && y==0 ){
			System.out.println("It's on negative x-axis with y==0 ");
			}
		else {
			System.out.println("It's on origin");
		}

    }


}
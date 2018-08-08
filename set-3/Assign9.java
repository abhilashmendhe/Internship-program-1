/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/8/8
 */
// Write program to check if a line is parallel to X-axis

package set3;
public class Assign9 {

   	public static void main(String args[])
   	{
   		double x1=12, x2=1, y1=6, y2=6;

  		String ans = ( x1 == x2 && y1 == y2 ) ? "It's a point" : ( y1 == y2 ) ? "The line is parallel to X-axis" : "It's not parallel to X-axis";

  		System.out.println(ans);
   	}

}
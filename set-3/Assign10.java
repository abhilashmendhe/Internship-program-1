/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/8
 */

package set3;
public class Assign10 {

  public static void main(String args[]){
  		double x1=22,x2=22,y1=6,y2=5;
  		String ans = ( x1 == x2 && y1 == y2 ) ? "It's a point" :(x1 == x2) ? "The line is parallel to Y-axis" : "The line not parallel to Y-axis";
 	System.out.println(ans);
  	}

}
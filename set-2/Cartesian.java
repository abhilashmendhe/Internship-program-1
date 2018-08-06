/**
 * @(#)Cartesian.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */

package set2;
public class Cartesian {

    	public static void main(String args[])
    	{
    		int x1=7;
    		int x2=7;
    		int y1=7;
    		int y2=11;
    		double X1 = Math.pow((x2-x1),2);
    		double Y1 = Math.pow((y2-y1),2);
    		double distance = Math.sqrt(X1 + Y1);

    		System.out.println("Distance is "+distance);
    	}
}
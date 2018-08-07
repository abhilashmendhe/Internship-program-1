/**
 * @(#)Triangle3.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */

package set2;
public class Triangle3 {

    public static void main(String args[])
    {
    	double x1 = 7, x2 = 7;
    	double y1 = 5, y2 = 7;
    	double z1 = 11, z2 = 5;

		double dist_xy = Math.sqrt(Math.pow((x1-y1),2) + Math.pow((x2-y2),2));
		double dist_xz = Math.sqrt(Math.pow((x1-z1),2) + Math.pow((x2-z2),2));
		double dist_yz = Math.sqrt(Math.pow((y1-z1),2) + Math.pow((y2-z2),2));

    	double p = (dist_xy + dist_xz + dist_yz)/2;

    	double p1 = p - dist_xy;
		double p2 = p - dist_xz;
		double p3 = p - dist_yz;
		double Area = Math.sqrt(p * p1 * p2 * p3);

 		System.out.println("Area is "+Area);
    }


}
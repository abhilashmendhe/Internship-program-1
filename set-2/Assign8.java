/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */

package set2;
public class Assign8 {

    public static void main(String args[])
    {
    	int a=4,b=5,x=2,y=3;

    	double A1 = (a+b);
    	double B1 = (x+y);
    	double power = 1 / B1;

    	double ans = Math.pow((A1/B1),power);

    	System.out.println("Answer of equation is "+ans);
    }

}
/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set3;
public class Assign7 {

    public static void main(String args[]){

    	int a = 1, b = 2, c = 3;

		double p = (double)(a+b+c)/2;
		double compute = (double)Math.sqrt( p * (p-a) * (p-b) * (p-c));
    	String ans = ( (a <= 0 || b <= 0 || c <= 0) || (compute == 0) ) ? "Does not form a triangle!!!" : ( a == b && a == c && b == c ) ? "It's an equilateral triangle" :
    		         ( (a == b) || (b == c) || (c == a) ) ? "It's an isosceles triangle" : "It's an scales triangle";

        System.out.println(ans);
    	}


}

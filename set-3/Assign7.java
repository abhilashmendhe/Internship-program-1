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

    	int a = 3, b = 3, c = 4;

    	String ans = ( a == b && a == c && b == c ) ? "It's an equilateral triangle" :
    		         ( (a == b) || (b == c) || (c == a) ) ? "It's an isosceles triangle" : "It's an scales triangle";

        System.out.println(ans);
    	}


}
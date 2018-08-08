/**
 * @(#)Assign3.java
 *
 *
 * @author
 * @version 1.00 2018/8/7
 */

package set3;
public class Assign3 {

    public static void main(String args[])
    {
    	int year = 1;
    	String ans = ( year == 0 || year < 0 ) ? "Year zero or less than zero does not exist" : ( year % 4 == 0)? "Is a leap year" : "Is not a leap year";
    	System.out.println(ans);
    }


}
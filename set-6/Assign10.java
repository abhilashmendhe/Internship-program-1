/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/14
 */

package set6;
import java.util.*;
public class Assign10 {

    public static void main(String args[]){
	System.out.println("Enter input");
    	Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		int x = (int) ch;

		if ( x >= 65 && x <= 90 )
			System.out.println("Upper case letters");
		else if ( x >= 97 && x <= 122 )
			System.out.println("Lower case letters");
		else if ( x >= 48 && x <= 59 )
			System.out.println("Digits");
		else
			System.out.println("Some other character");
    }
}
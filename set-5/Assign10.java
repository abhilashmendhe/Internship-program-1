/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/13
 */
package set5;
import java.util.*;

public class Assign10 {

    public static void main(String args[])
    {
    	System.out.println("Enter a character");
    	Scanner sc = new Scanner(System.in);
    	char ch = sc.next().charAt(0);

    	if ( ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u'){
    		System.out.println("It's a vowel");
    		}
    	else {
    		System.out.println("It's a consonant");
    		}
    }


}
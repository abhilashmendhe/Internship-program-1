/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/16
 */

package set7;
import java.util.*;
public class Assign6 {

    public static void main(String args[]){

		System.out.println("Enter letters");
		System.out.println("-------------");
		System.out.println("Enter letter 'S'");
		System.out.println("Enter letter 'A'");
		System.out.println("Enter letter 'B'");
		System.out.println("Enter letter 'Y'");
		System.out.println("Enter letter 'F'");
    	Scanner sc = new Scanner(System.in);
    	char letter = sc.next().charAt(0);

		switch(letter){
			case 'S':
				System.out.println("SUPER");
				break;
			case 'A':
				System.out.println("Very Good");
				break;
			case 'B':
				System.out.println("FAIR");
				break;
			case 'Y':
				System.out.println("ABSENT");
				break;
			case 'F':
				System.out.println("FAIL");
				break;
			default:
				System.out.println("Invalid");
				break;
			}
    	}


}
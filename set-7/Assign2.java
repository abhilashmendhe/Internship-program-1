/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/8/16
 */

package set7;
import java.util.*;
public class Assign2 {

    public static void main(String args[])
    {
    	System.out.println("Enter character for rainbow colour");
    		Scanner sc = new Scanner(System.in);

    		char color = sc.next().charAt(0);

		switch(color){
			case 'v':
				System.out.println("Voilet");
				break;
			case 'i':
				System.out.println("Indigo");
				break;
			case 'b':
				System.out.println("Blue");
				break;
			case 'g':
				System.out.println("Green");
				break;
			case 'y':
				System.out.println("Yellow");
				break;
			case 'o':
				System.out.println("Orange");
				break;
			case 'r':
				System.out.println("Red");
				break;
			default:
				System.out.println("Invalid");
				break;
			}
    }

}
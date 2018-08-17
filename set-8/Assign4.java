/**
 * @(#)Assign4.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;
public class Assign4 {

    public static void main(String args[])
    {
    	System.out.println("Enter the number to print it's table");
    	//Scanner sc = new Scanner(System.in);
    	//int num = sc.nextInt();
    	//int table = 1;
    	for (int i=1; i<=10; i++)
    	{
    		for (int j=1; j<=10; j++){
    			System.out.print("      "+i*j);
    			}
    		System.out.println();
    	}
    }


}
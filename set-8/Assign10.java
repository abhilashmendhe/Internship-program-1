/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;
public class Assign10 {

    public static void main(String args[])
    {
    	System.out.println("Enter numbers");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();

    	for (int i=1; i<=n; i++)
    	{
    		System.out.println(i);
			if(i%3==0)
				System.out.println("-------------");
	  	}
 }
}




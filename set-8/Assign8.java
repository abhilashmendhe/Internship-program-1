/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;
public class Assign8 {

    public static void main(String args[])
    {
    	System.out.println("Enter number");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int s = 0;
    	for(int i=0; i<=n; i++)
    	{
			System.out.println(i);
    		i = i + (++i);
    	}
    }

}
/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/8/21
 */

package set10;
import java.util.*;
public class Assign10 {

    public static void main(String args[])
    {
    	System.out.println("Enter n");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int sum = 0;
    	for(int i=1;i<=n;i++)
    	{
    		int fact = 1;
    		for(int j=1;j<=i;j++)
    		{
    			fact *= j;
    		}
    		sum += fact;
    	}
    	System.out.println("Sum of series is "+sum);
    }


}
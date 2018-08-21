/**
 * @(#)Assign12.java
 *
 *
 * @author
 * @version 1.00 2018/8/21
 */

package set10;
import java.util.*;
public class Assign12 {

    public static void main(String args[])
    {
    	System.out.println("Enter n times to compute");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	double sum = 0;
    	for(int i=1; i<=n; i++)
    	{
    		double compute = 1;
    		for(int j=1; j<=i; j++)
    		{
    			compute = (double) 1/Math.pow(Math.pow(2,i),2);
    		}
    		sum += compute;
    	}
    	System.out.println("Sum of series is "+sum);
    }

}
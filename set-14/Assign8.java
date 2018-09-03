/**
 * @(#)Assign8.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign8 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	System.out.println("Enter elements in array");
    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	int sum_even=0;
    	int sum_odd=0;
    	for(int j=0; j<a.length; j++)
    	{
    		if(a[j]%2==0)
    		{
    			sum_even += a[j];
    		}
    		else
    		{
    			sum_odd += a[j];
    		}
    	}
    	System.out.println("Sum of even numbers are "+sum_even);
    	System.out.println("Sum of odd numbers are "+sum_odd);
    }


}
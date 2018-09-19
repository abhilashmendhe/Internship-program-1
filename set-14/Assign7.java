/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign7 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	int count_even = 0;
    	int count_odd = 0;
    	for(int j=0; j<a.length; j++)
    	{
    		if(a[j]%2==0)
    			count_even++;
    		else
    			count_odd++;

    	}
    	System.out.println("Count of even numbers are "+count_even);
    	System.out.println("Count of odd numbers are "+count_odd);
    }


}
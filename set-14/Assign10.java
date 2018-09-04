 /**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign10 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	int a[] = new int[n];
    	System.out.println("Enter elements");
    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	int count_positive = 0;
    	int count_negative = 0;
    	int count_zero = 0;

    	for(int j=0; j<a.length; j++)
    	{
    		if(a[j] > 0)
    		{
    			count_positive++;
    		}
    		else if(a[j] < 0)
    		{
    			count_negative++;
    		}
    		else
    		{
    			count_zero++;
    		}
    	}
    	System.out.println("Count of positve numbers: "+count_positive);
    	System.out.println("Count of negative numbers: "+count_negative);
    	System.out.println("Count of zero3 numbers: "+count_zero);
    }


}
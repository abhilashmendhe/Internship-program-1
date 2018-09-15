/**
 * @(#)Twelevth.java
 *
 *
 * @author
 * @version 1.00 2018/9/14
 */

package set18;
import java.util.*;
public class Twelevth {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	int a[] = new int[n];
    	System.out.println("Enter elements in array");
    	for(int i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

    	int c = getCountPrime(a);
    	System.out.println("Count of prime numbers: "+c);
    }

    static int getCountPrime(int b[])
    {
    	int count = 0;
    	for(int i=0; i<b.length; i++)
    	{
    		boolean f = true;

    		for(int j=2; j<b[i]; j++)
    		{
    			if(b[i]%j==0)
    			{
    				f = false;
    				break;
    			}
    		}
    	if(f)
    		count++;
    	}

    	return count;
    }

}
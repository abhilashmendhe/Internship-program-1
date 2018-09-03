/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/9/3
 */

package set14;
import java.util.*;
public class Assign6 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
		int a[] = new int[n];
    	double sum=0;
    	double mean = 0;
    	System.out.println("Enter elements");

    	for(int i=0; i<a.length; i++)
    	{
    		a[i] = sc.nextInt();
    	}
		int j;
		for(j=0; j<a.length; j++)
		{
			sum += a[j];
		}
		mean += (double)(sum/n);
		System.out.println("Mean is "+mean);

		double var = 0;

		for(int k=0; k<a.length; k++)
		{
			var += Math.pow((mean - a[k]),2);
		}
		System.out.println("Var si "+var);
		double compute = (double)(var/n);
		//System.out.println(compute);
		double sd = Math.sqrt(var/n);

		System.out.println("S.D. is "+sd);
    }


}
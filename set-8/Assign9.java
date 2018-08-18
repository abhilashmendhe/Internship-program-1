/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;
public class Assign9 {

    public static void main(String args[])
    {
    	System.out.println("Enter range to print");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int s=0;
    	double t=0;
    	System.out.println("--------------------");
    	for (int i=1; i<=n; i++)
    	{
    		s = s + i;
    	}

   		double mean = (double) s/n;
   		System.out.println("Mean is "+mean);
   		for(int i=1; i<=n; i++)
   		{
   		 t = t + Math.pow((mean-i),2);
   		}
   		//System.out.println(t);
   		double sd = (double) Math.sqrt(t/n);
   		System.out.println("SD = "+sd);
   		double r1 = (double) mean - sd;
   		double r2 = (double) mean + sd;
System.out.println(r1);
System.out.println(r2);
System.out.println("-----------------------");

   				System.out.println("Rnages: ");
   		for (int i=1; i<=n; i++)
   		{
   			if(i>=r1 && i<=r2)
   				System.out.print(" "+i);
   		}
    }



}

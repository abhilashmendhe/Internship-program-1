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
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int s=0;
    	double t=0;
    	for (int i=1; i<=n; i++)
    	{
    		s = s + i;
    	}

   		double m = (double) s/n;
   		System.out.println("mean "+m);
   		for(int i=1; i<=n; i++)
   		{
   		 t = t + Math.pow((m-i),2);
   		}
   		System.out.println(t);
   		double u = (double) Math.sqrt(t/n);
   		System.out.println("SD = "+u);
   		double r1 = (double) m - u;
   		double r2 = (double) m + u;
System.out.println(r1);
System.out.println(r2);
   		for (int i=1; i<=n; i++)
   		{
   			if(i>=r1 && i<=r2)
   				System.out.println(i);
   		}
    }



}
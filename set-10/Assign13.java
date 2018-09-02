/**
 * @(#)Assign13.java
 *
 *
 * @author
 * @version 1.00 2018/8/21
 */

package set10;
import java.util.*;
public class Assign13 {

    public static void main(String args[])
    {
    	System.out.println("Enter n");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
		int count=1;
		double a=1;
		double compute = 0;
		while(count<=n)
		{

			boolean f = true;
			for(int i=2; i<a; i++)
			{
				if(a%i==0)
				{
					f=false;
					break;
				}

			}
			if(f){
				//System.out.print(" "+a);
				compute += (1/a);
			count++;
			}
			a++;

		}
		System.out.println("Sum of following series is "+compute);

    }


}
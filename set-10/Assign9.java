/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/9/2
 */

package set10;
import java.util.*;
public class Assign9 {

    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");int n = sc.nextInt();
		double a = 0;
		double b = 1;
		double compute = 0;
		int i = 1;
		while(i<=n)
		{
			a = a + b;
			b++;
			if(i%2!=0)
			{
				compute += (1/a);
			}
			else
			{
				compute -= (1/a);
			}
			//System.out.print(" "+a);
			i++;
		}
		System.out.println("Sum of following series is "+compute);
    }


}
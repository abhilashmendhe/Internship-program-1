/**
 * @(#)Assign7.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */
package set8;
import java.util.*;
public class Assign7 {

public static void main(String args[])
    {
    	System.out.println("Enter n number");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
		int s = 0;

		for (int i=1; i<=n; i++)
		{
			boolean flag = true;
			for (int j=2; j<i; j++)
			{
				if(i%j == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.print(" "+i);
		}
    }
}
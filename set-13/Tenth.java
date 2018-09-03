/**
 * @(#)Tenth.java
 *
 *
 * @author
 * @version 1.00 2018/9/2
 */

package set13;
import java.util.*;
public class Tenth {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();
    	int i = 1;
    	do
    	{
    		if(i%2==0)
    		{
    			continue;
    		}
    		System.out.print(" "+i);
   		i++;
    	}while(i<=n);
    }


}
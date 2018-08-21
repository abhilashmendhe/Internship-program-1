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
		boolean f = true;
		double sum=0;
    	for(double i=1; i<=n; i++)
    	{
    		double compute = 0;
    		for(int j=2; j<i; j++)
    		{
    			if(i%j==0)
    			{
    				f=false;
    				break;
    			}
    			else
    			{
    				f=true;
    			}
    		}
    		if(f){
    			compute += 1/i;
    		}
//    		System.out.print(" "+i);
			sum += compute;
    	}System.out.println(sum);

    }


}
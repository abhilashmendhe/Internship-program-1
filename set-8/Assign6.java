/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;
public class Assign6 {

    public static void main(String args[])
    {
    	System.out.println("Enter number");
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
		boolean flag = true;
    	for (int i=2; i<num; i++)
    	{
    		if(num%i==0){
    			flag = false;
    			break;
    		}

        }
        if(flag)
        {
        	System.out.println("prime");
        }
        else
        {
        	System.out.println("Composite");
        }
    }

}
/**
 * @(#)Fourth_2.java
 *
 *
 * @author
 * @version 1.00 2018/10/4
 */

package Test_2;
import java.util.*;
public class Fourth_2 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter n: ");int n = sc.nextInt();

    	int a[] = new int[n];

    	int cn = 1;
    	do
    	{
    	System.out.println("Menu");
    	System.out.println("1) Push");
    	System.out.println("2) Pop");
    	System.out.println("3) Display");
    	System.out.println("\nEnter choice");
    	int ch = sc.nextInt();

    	switch(ch)
    	{
    		case 1:
    			if(a.length > n)
    				System.out.println("full!!");
    			else
    			{

    			}
    			break;
    	}

    	System.out.println("Enter '1' to continue or '0' to stop");
    	cn = sc.nextInt();
    	}while(cn!=1);




    }


}
/**
 * @(#)Assign6_bkup.java
 *
 *
 * @author
 * @version 1.00 2018/8/22
 */


public class Assign6_bkup {

    public static void main(String args[])
    {
    	int m=10/2;
    	int t = 0;
    	for(int i=0; i<9; i++)
    	{
    		for(int j=1; j<=9; j++)
    		{
    			if(j==(m-i-t) || j==(m+i+t))
    			{
    					System.out.print("*");

    			}
    			else
    				System.out.print(" ");
    				//break;
    		}
    		System.out.println();
    		t = t + 1;
    	}
    }

}
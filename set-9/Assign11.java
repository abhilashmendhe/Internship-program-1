/**
 * @(#)Assign11.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */


public class Assign11 {

    public static void main(String args[])
    {
    	int a = 0;
    	/*for (int i=5; i>=1; i--)
    	{
    		for(int j=1; j<=(5-i); j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=i; k>=1;k--){
				System.out.print(k);
    		}
			System.out.println();
    	}*/
    	for (int i=0; i<5; i++)
    	{
    		for(int j=1; j<=i; j++)
    		{
    			System.out.print(" ");
    		}

    		for(int k=5; k>i; k--)
    		{
    			System.out.print(k-i);
    		}
    		System.out.println();
    		//a += 1;
    	}
    }
}
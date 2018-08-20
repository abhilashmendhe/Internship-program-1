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
    	for (int i=5; i>=1; i--)
    	{
    		for(int j=1; j<=(5-i); j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=i; k>=1;k--){
				System.out.print(k);
    		}
			System.out.println();
    	}
    }
}
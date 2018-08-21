/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set9;
public class Assign5 {

    public static void main(String args[])
    {
    	for (int i=5; i>=1; i--)
    	{
    		for(int j=1; j<=(5-i); j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1; k<=i;k++){
				System.out.print("*");
    		}
			System.out.println();
    	}

    }

}
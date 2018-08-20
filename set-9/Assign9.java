/**
 * @(#)Assign9.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set9;
public class Assign9 {

    public static void main(String args[])
    {
    	int n=5;
    	int t = 0;

    	for (int i=1; i<=5; i++)
    	{
    		int blank = n - i;
    			t += 1;
    		for(int j=1; j<=blank; j++)
    		{
    		System.out.print(" ");
    		}
    		for(int k=1; k<=i;k++){

		System.out.print(t);
    		}
		System.out.println();
    	}
    }


}
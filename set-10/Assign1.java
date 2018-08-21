/**
 * @(#)Assign1.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set10;
public class Assign1 {

    public static void main(String args[])
    {
       int t = 0;
    	for (int i=1; i<=5; i++)
    	{
    		for(int j=1; j<=i; j++)
    		{
				t = ++t;
    			System.out.print(t+" ");
    		}
			System.out.println();
    	}
    }


}
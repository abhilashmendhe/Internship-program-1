/**
 * @(#)Assign6.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set10;
public class Assign6 {

    public static void main(String args[])
    {
    	int t=0;
		int add_s=0;
    	for(int i=1; i<=5; i++)
    	{

    		for(int a=5; a>=i; a--)
    		{
    			System.out.print(" ");
    		}
    		for(int j=1; j<=i; j++)
    		{
    			System.out.print(t+j);
    		}
    		System.out.println();
    		t=t+i;
     		add_s += 1;
    	}

    }


}
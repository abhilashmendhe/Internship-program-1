/**
 * @(#)Assign5.java
 *
 *
 * @author
 * @version 1.00 2018/8/20
 */

package set10;
public class Assign5 {

    public static void main(String args[])
    {

    	for(int i=1; i<=5; i++)
    	{
    		for (int j=1; j<=5; j++)
    		{
    			if(i==1 || j==1 || j==5 || i==5){
    			System.out.print("*");
    			}
    			else
    			{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }


}
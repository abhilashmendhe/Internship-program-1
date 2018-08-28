/**
 * @(#)Second.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Second {

    public static void main(String args[])
    {
    	int n=84281, Sum=0;

    	while(n>0)
    	{
    		int r = n%10;
    		Sum = Sum + r;
    		n=n/10;
    	}
    	System.out.println(Sum);
    }


}
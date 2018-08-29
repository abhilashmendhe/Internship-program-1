/**
 * @(#)Second.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
public class Second {

    public static void main(String args[])
    {
    	int i=1, n=100;

    	do
    	{
       		if(i%4==0 && i%5==0)
    		System.out.print(" "+i);
    		i++;
    	}while(i<=n);
    }

}
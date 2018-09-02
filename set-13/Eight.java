/**
 * @(#)Eight.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
public class Eight {

    public static void main(String args[])
    {
    	doubleq i=1,n=4;
    	double sum=0;
    	do{
    		sum =sum + (1/i);
    		i++;
    	}while(i<=n);
    	System.out.println(sum);
    }


}
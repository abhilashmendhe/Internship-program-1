/**
 * @(#)Tenth.java
 *
 *
 * @author
 * @version 1.00 2018/8/28
 */

package set12;
public class Tenth {

    public static void main(String args[])
    {
    	double fact = 1;
    	int i=1, n=4;
		double sum = 0;
		while(i<=n){
			fact = 1;
			int j = 1;
	    	while(j<=i)
    		{
    			fact *= j;
    			j++;
    		}
//    		System.out.println(w);
    		sum = sum + (i/fact);
			i++;
		}
		System.out.println(sum);
    }


}
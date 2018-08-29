/**
 * @(#)Fifth.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
public class Fifth {

    public static void main(String args[])
    {
    	int i=1;
    	int n1=10,n2=15;
    	int n3=20;
		int j=1;

	int tmp=0;
    while(j<n1 && j<n2 && j<n3)
    {
    	if(n1%j==0 && n2%j==0 && n3%j==0){
			tmp=j;
    	}
		j++;
    }
	System.out.println("GCD is "+tmp);
    }

}
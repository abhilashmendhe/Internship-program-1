/**
 * @(#)Fifth.java
 *
 *
 * @author
 * @version 1.00 2018/8/29
 */

package set13;
import java.util.*;
public class Fifth {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter first number: ");int n1=sc.nextInt();
    	System.out.print("\nEnter second number: ");int n2=sc.nextInt();

		int j=1;

	int tmp=0;
    while(j<n1 && j<n2)
    {
    	if(n1%j==0 && n2%j==0){
			tmp=j;
    	}
		j++;
    }
	System.out.println("GCD is "+tmp);
    }

}
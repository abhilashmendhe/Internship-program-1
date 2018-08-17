/**
 * @(#)Assign2.java
 *
 *
 * @author
 * @version 1.00 2018/8/17
 */

package set8;
import java.util.*;

public class Assign2 {

    public static void main(String args[])
    {
    	System.out.println("Enter n");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
		int t=0;

    	for(int i=1; i<=n; i++){
    		//System.out.println(i);
			t = t + i;
    		}
  	System.out.println(t);
    }

}
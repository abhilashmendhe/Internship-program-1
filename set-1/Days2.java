/**
 * @(#)Days2.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */
package set1;

public class Days2 {
public static void main(String args[]){
    	 int no_days = 510;
    	 int y1 = no_days / 365;
    	 int r1 = no_days % 365;
    	 int month = r1 / 30;
    	 int r2 = r1 % 30;
    	 int week = r2 / 7;
    	 int days = r2 % 7;
    	 System.out.println("Number of days "+no_days);
		System.out.println("Equals to ");
        System.out.println("Years "+y1);
		System.out.println("Months "+month);
		System.out.println("Weeks "+week);
		System.out.println("Days "+days);

    	}

}
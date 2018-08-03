/**
 * @(#)days.java
 *
 *
 * @author
 * @version 1.00 2018/8/3
 */

package set1;
public class days {

	public static void main(String args[]){
	int no_days = 50;
	int	year = no_days / 365;
	int	month = no_days / 30;
	int	week = (no_days % 30) / 7;
	int	days = (no_days % 30) % 7;

		System.out.println("Number of days equal to ");
		System.out.println("Year --- Month --- Week --- Days");

		System.out.println(year+" --- "+month+" --- "+week+" --- "+days);
		}

}
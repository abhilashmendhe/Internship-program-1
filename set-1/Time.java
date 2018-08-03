/**
 * @(#)Time.java
 *
 *
 * @author
 * @version 1.00 2018/8/3
 */

package set1;
public class Time {

	public static void main(String args[]){
			int no_sec = 86400;
			int hours = no_sec / 3600;
			int minutes = (no_sec % 3600) / 60;
			int secs = no_sec % 60 ;

			System.out.println("Number of seconds entered is equal to ");
			System.out.println("Hours:Minutes:Seconds");
			System.out.println(hours+":"+minutes+":"+secs);
		}

}
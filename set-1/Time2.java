/**
 * @(#)Time2.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */

package set1;
public class Time2 {

	public static void main(String args[]){
			int no_sec = 100;
			int hours = no_sec / 3600;
			int minutes = (no_sec % 3600) / 60;
			int secs = ((no_sec % 3600) % 60) % 60 ;

			System.out.println("Number of seconds entered is equal to ");
			System.out.println("Hours:Minutes:Seconds");
			System.out.println(hours+":"+minutes+":"+secs);
		}


}
/**
 * @(#)Time1.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */


public class Time1 {

	public static void main(String args[]){
		int no_sec = 100;
		int hours = no_sec / 3600;
		int r1 = no_sec % 3600;
		int minutes = r1 / 60;
		int r2 = r1 % 60;
		int secs = r2 % 60;
System.out.println("Hours "+hours);
		System.out.println("Min "+minutes);
		System.out.println("Seconds "+secs);

		}

}
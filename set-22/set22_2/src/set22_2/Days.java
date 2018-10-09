/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_2;

/**
 *
 * @author abhil
 */
public class Days {
    
    int year,month,week,day;
    
    public void getDays(int y,int m,int w,int d)
    {
        year = y;
        month = m;
        week = w;
        day = d;
    }
    
    Days getSum(Days d2)
    {
        Days dd = new Days();
        
        int S = (year*365+month*30+week*7+day)+((d2.year*365)+(d2.month*30)+(d2.week*7)+d2.day);
        
        dd.year = S/365;
        dd.month = (S%365)/30;
        dd.week = ((S%365)%30)/7;
        dd.day = ((S%365)%30)%7;

        
        return dd;
    }
   
    
    public void Display(Days d)
    {
        System.out.println("Year "+d.year);
        System.out.println("Month "+d.month);
        System.out.println("Week "+d.week);
        System.out.println("Day "+d.day);
    }
}

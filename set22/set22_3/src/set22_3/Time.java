/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set22_3;

/**
 *
 * @author abhil
 */
public class Time {

    int hr,min,sec;
    
    public void getData(int hr1,int min1,int sec1)
    {
        hr = hr1;
        min = min1;
        sec = sec1;
    }
    
    Time getDiffTime(Time t2)
    {
        int D = Math.abs((hr*3600+min*60+sec)-(t2.hr*3600+t2.min*60+t2.sec));
        Time time = new Time();
        
        time.hr = D/3600;
        time.min = (D%3600)/60;
        time.sec = (D%3600)%60;
        
        return time;
    }
    
    public void Display(Time t)
    {
        System.out.println("Hour "+t.hr);
        System.out.println("Min "+t.min);
        System.out.println("Sec "+t.sec);
    }
    
    
}

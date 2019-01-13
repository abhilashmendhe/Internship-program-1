/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date_time;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author abhilash
 */
public class CurrentTime {
    public String getTime()
    {
        String am_pm;
        Calendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR);
        int min = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);
        
        if(calendar.get(Calendar.AM_PM) == 0)
            am_pm = "AM";
        else
            am_pm = "PM";
        
        String ctime = hour+":"+min+":"+sec+" "+am_pm;
        return ctime;
                
                    
    }

}

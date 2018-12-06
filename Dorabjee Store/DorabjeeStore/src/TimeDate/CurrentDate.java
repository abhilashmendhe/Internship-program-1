/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author abhil
 */
public class CurrentDate {
    
    public String getDate()
    {
        Calendar cal = Calendar.getInstance();
        DateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy");
        String date = dateformat.format(cal.getTime());
        return date;
    }
}

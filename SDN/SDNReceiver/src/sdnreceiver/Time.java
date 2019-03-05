/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdnreceiver;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Time {
    public ArrayList convert_to_secs(ArrayList data)
    {
        ArrayList ret = new ArrayList();
        for(int i=0; i<data.size(); i++)
        {
            ArrayList tt = new ArrayList();
            String temp = (String)data.get(i);
            String time_Data[] = temp.split(",");
            String time[] = time_Data[3].split("_");
            String timesplit[] = time[0].trim().split(":");
           //System.out.println(time_Data[3]);
           int hr = Integer.parseInt(timesplit[0]);
           int min = Integer.parseInt(timesplit[1]);
           int sec = Integer.parseInt(timesplit[2]);
           int hr_to_sec = hr*3600;
           int min_to_sec = min*60;
           int total_sec = hr_to_sec+min_to_sec+sec;
           
           tt.add(time_Data[0]);
           tt.add(time_Data[1]);
           tt.add(time_Data[2]);
           tt.add(total_sec);
           ret.add(tt);
        }
        
        return ret;
    }
}

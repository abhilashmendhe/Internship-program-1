/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import jxl.read.biff.BiffException;

/**
 *
 * @author abhilash
 */
public class Mooc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, BiffException {
        // TODO code application logic here
        
        
//course_id, userid_DI, viewed, explored, certified, final_cc_cname_DI, LoE_DI, gender, grade, start_time_DI, last_event_DI, nevents, ndays_act, nplay_video, nchapters, nforum_posts, disengage

       
        
        ArrayList fetchalldata = new ReadDataSet().readcsv();
        System.out.println(fetchalldata);
    }
    
}

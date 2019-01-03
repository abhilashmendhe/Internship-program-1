/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancer;

import java.io.File;
import jxl.*;
import java.util.*;

/**
 *
 * @author abhilash
 */
public class ReadDataSet {
    
    public ArrayList readData()
    {
        ArrayList alldata = new ArrayList();
        try {
            
            Workbook wb = Workbook.getWorkbook(new File("/home/abhilash/breast_cancer.xls"));
            Sheet s = wb.getSheet(0);
            int row = s.getRows();
            int column = s.getColumns();
            
            
            for(int i=1; i<row; i++)
            {
                ArrayList temp = new ArrayList();
                for(int j=0; j<column; j++)
                {
                    Cell c = s.getCell(j, i);
                    temp.add(c.getContents());
//                    System.out.println(c.getContents());
                }
                alldata.add(temp);
            }
            
        } catch (Exception e) {
            System.out.println("Error in class ReadDataSets: "+e);
        }
        return alldata;
    }
}

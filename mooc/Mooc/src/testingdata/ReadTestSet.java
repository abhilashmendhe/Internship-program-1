/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingdata;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import sun.awt.OSInfo;

/**
 *
 * @author abhil
 */
public class ReadTestSet {
    public ArrayList readcsv(String path) throws IOException, BiffException 
    {
        Workbook wb = Workbook.getWorkbook(new File(path));
        Sheet s = wb.getSheet(0);
        int row = s.getRows();
        int col = s.getColumns();
        
        ArrayList addall = new ArrayList();
        
        for(int i=0; i<row; i++)
        {
            ArrayList temp = new ArrayList();
            
            for(int j=0; j<col; j++)
            {
                Cell c = s.getCell(j,i);
                temp.add(c.getContents());
            }
            //System.out.println(temp);
            addall.add(temp);
        }
        
        return addall;
    }
}

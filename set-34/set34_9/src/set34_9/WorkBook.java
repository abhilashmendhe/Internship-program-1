/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_9;

import java.io.File;
import jxl.*;
/**
 *
 * @author abhilash
 */
public class WorkBook {
    
    
    public void getData(String path)
    {
        
        try {
            
            Workbook wb = Workbook.getWorkbook(new File(path));
            Sheet s = wb.getSheet(0);
            
            int r = s.getRows();
            int c = s.getColumns();
            
            for(int i=0; i<r; i++)
            {
                for(int j=0; j<c; j++)
                {
                    Cell cc = s.getCell(i,j);
                    String cont = cc.getContents();
                    System.out.print(" "+cont+" | ");
                }
                System.out.println();
            }
        } catch (Exception e) {
        }
    }
    
}

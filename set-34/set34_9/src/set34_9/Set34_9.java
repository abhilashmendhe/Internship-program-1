/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set34_9;
import jxl.*;
/**
 *
 * @author abhilash
 */
public class Set34_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String path = "/home/abhilash/beer.xls";
        WorkBook wb = new WorkBook();
        wb.getData(path);
    }
    
}

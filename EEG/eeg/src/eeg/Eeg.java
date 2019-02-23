/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eeg;

import java.io.IOException;
import jxl.read.biff.BiffException;
import preprocess.Datakeeper;

/**
 *
 * @author abhilash
 */
public class Eeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, BiffException {
        // TODO code application logic here
        EEGFrame e = new EEGFrame();
        e.setVisible(true);
        e.setLocation(600,300);
    }
    
}

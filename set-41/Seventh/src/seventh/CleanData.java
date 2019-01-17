/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh;

import java.io.IOException;
import parsedContent.LinkProvider;

/**
 *
 * @author abhilash
 */
public class CleanData {
    public String cleanData(String url) throws IOException
    {
        String cleancontent = "";
        
        String webcontent = new LinkProvider().linking(url);
        
        cleancontent = webcontent.replace("'", " ");
        
        return cleancontent;
    }
}

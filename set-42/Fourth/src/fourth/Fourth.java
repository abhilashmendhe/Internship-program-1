/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

import java.io.IOException;

/**
 *
 * @author abhilash
 */
public class Fourth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String url = "http://www.puneritraveller.com/hillstation.html";
        String content = new LinkProvider().linking(url);
        System.out.println("Content");
        System.out.println("--------------");
        new DescendingOrder().getContentsinDescendingOrder(content);
        //System.out.println(content);
    }
    
}

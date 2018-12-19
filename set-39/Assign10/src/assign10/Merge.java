/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign10;

import javax.swing.JTextArea;

/**
 *
 * @author abhilash
 */
public class Merge extends Thread
{
    public void run()
    {
       
        while(true){
        try {
            
            
            if(!Frame.jTextField1.getText().isEmpty() && !Frame.jTextField2.getText().isEmpty())
            {
                Thread.sleep(2000);
                String ar1 = Frame.jTextField1.getText();
            String ar2 = Frame.jTextField2.getText();
            String me = Frame.jTextArea1.getText();
                String area = me + "\n" +ar1 +"\n"+ ar2 +"\n";
                Frame.jTextArea1.setText(area);
                Frame.jTextField1.setText(null);
                Frame.jTextField2.setText(null);
            }
        } catch (Exception e) {
            System.out.println("Error in class Merge.java");
        }
        }
    }
}

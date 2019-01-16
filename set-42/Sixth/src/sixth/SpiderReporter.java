/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth;

import java.net.URL;

/**
 *
 * @author abhilash
 */
public interface SpiderReporter {
    
  public boolean spiderFoundURL(URL base,URL url);
  public void spiderURLError(URL url);
  public void spiderFoundEMail(String email);
}

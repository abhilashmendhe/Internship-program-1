/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sixth;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.net.*;
import java.io.*;
import sixth.Spider;
import sixth.SpiderReporter;


public class LinkGenerator implements SpiderReporter {

    String url=null;

  /**
   * The constructor. Perform setup here.
   */
  public LinkGenerator()
  {

    //}}
  }
/**
   * The spider object being used
   */
  protected Spider spider;

  /**
   * The URL that the spider began with
   */
  protected URL base;

  /**
   * How many bad links have been found
   */
  protected int badLinksCount = 0;

  /**
   * How many good links have been found
   */
  protected int goodLinksCount = 0;



  /**
   * Called when the begin or cancel buttons are clicked
   *
   * @param event The event associated with the button.

   * Perform the background thread operation. This method
   * actually starts the background thread.
   */
  public void getData(String url) throws MalformedURLException
  {
    this.url=url;
      spider = new Spider(this);
      spider.clear();  // to clear previous cache
      base = new URL(url); // to load url String to URL pattern
      spider.addURL(base);
      spider.begin();

  }

  /**
   * Called by the spider when a URL is found. It is here
   * that links are validated.
   *
   * @param base The page that the link was found on.
   * @param url The actual link address.
   */
  public boolean spiderFoundURL(URL base,URL url)
  {
    UpdateCurrentStats cs = new UpdateCurrentStats();
    cs.msg = url.toString();


    if ( !checkLink(url) ) {
      UpdateErrors err = new UpdateErrors();
     // err.msg = url+"(on page " + base + ")\n";
      System.out.println(base);

      badLinksCount++;
      return false;
    }

    goodLinksCount++;
    if ( !url.getHost().equalsIgnoreCase(base.getHost()) )
      return false;
    else
      return true;
  }

  /**
   * Called when a URL error is found
   *
   * @param url The URL that resulted in an error.
   */
  public void spiderURLError(URL url)
  {
  }

  /**
   * Called internally to check whether a link is good
   *
   * @param url The link that is being checked.
   * @return True if the link was good, false otherwise.
   */
  protected boolean checkLink(URL url)
  {
    try {
      URLConnection connection = url.openConnection();
      connection.connect();
      return true;
    } catch ( IOException e ) {
      return false;
    }
  }

  /**
   * Called when the spider finds an e-mail address
   *
   * @param email The email address the spider found.
   */
  public void spiderFoundEMail(String email)
  {
  }
  /**
   * Internal class used to update the error information
   * in a Thread-Safe way
   *

   */

  class UpdateErrors implements Runnable {
    public String msg;
    public void run()
    {
        System.out.println("errors"+msg);

    }
  }
  /**
   * Used to update the current status information
   * in a "Thread-Safe" way
   *
   */

  class UpdateCurrentStats implements Runnable {
    public String msg;
    public void run()
    {
      //current.setText("Currently Processing: " + msg );
      //goodLinksLabel.setText("Good Links: " + goodLinksCount);
      //badLinksLabel.setText("Bad Links: " + badLinksCount);
        System.out.println("msg are --------------"+msg);


    }
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth;
import java.util.*;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
/**
 *
 * @author abhilash
 */
public class Spider {
    

  /**
   * A collection of URLs that resulted in an error
   */
  protected Collection workloadError = new ArrayList(3);

  /**
   * A collection of URLs that are waiting to be processed
   */
  protected Collection workloadWaiting = new ArrayList(3);

  /**
   * A collection of URLs that were processed
   */
  protected Collection workloadProcessed = new ArrayList(3);

  /**
   * The class that the spider should report its URLs to
   */
  public SpiderReporter report;

  /**
   * A flag that indicates whether this process
   * should be canceled
   */
  protected boolean cancel = false;

  /**
   * The constructor
   *
   * @param report A class that implements the SpiderReporter
   * interface, that will receive information that the
   * spider finds.
   */
  public Spider(SpiderReporter report)
  {
    this.report = report;
  }


  /**
   * Get the URLs that resulted in an error.
   *
   * @return A collection of URL's.
   */
  public Collection getWorkloadError()
  {
    return workloadError;
  }

  /**
   * Get the URLs that were waiting to be processed.
   * You should add one URL to this collection to
   * begin the spider.
   *
   * @return A collection of URLs.
   */
  public Collection getWorkloadWaiting()
  {
    return workloadWaiting;
  }

  /**
   * Get the URLs that were processed by this spider.
   *
   * @return A collection of URLs.
   */
  public Collection getWorkloadProcessed()
  {
    return workloadProcessed;
  }

  /**
   * Clear all of the workloads.
   */
  public void clear()
  {
    getWorkloadError().clear();
    getWorkloadWaiting().clear();
    getWorkloadProcessed().clear();
  }

  /**
   * Set a flag that will cause the begin
   * method to return before it is done.
   */
  public void cancel()
  {
    cancel = true;
  }

  /**
   * Add a URL for processing.
   *
   * @param url
   */
  public void addURL(URL url) throws InterruptedException
  {
    if ( getWorkloadWaiting().contains(url) )
      return;
    if ( getWorkloadError().contains(url) )
      return;
    if ( getWorkloadProcessed().contains(url) )
      return;
    log("" + url );// here we are calling log to print the links
    getWorkloadWaiting().add(url);
  }

  /**
   * Called internally to process a URL
   *
   * @param url The URL to be processed.
   */
  public void processURL(URL url) throws InterruptedException
  {
    try {
     // log("Processing: " + url );
      // get the URL's contents
      
      URLConnection connection = url.openConnection();
      if ( (connection.getContentType()!=null) &&
           !connection.getContentType().toLowerCase().startsWith("text/") ) {
        getWorkloadWaiting().remove(url);
        getWorkloadProcessed().add(url);
        log("Not processing because content type is: " +
             connection.getContentType() );
        return;
      }

      // read the URL
      InputStream is = connection.getInputStream();
      Reader r = new InputStreamReader(is);
      // parse the URL
      HTMLEditorKit.Parser parse = new HTMLParse().getParser();
      parse.parse(r,new Parser(url),true);
    } catch ( IOException e ) {
      getWorkloadWaiting().remove(url);
      getWorkloadError().add(url);
      log("Error: " + url );
      report.spiderURLError(url);
      return;
    }
    // mark URL as complete
    getWorkloadWaiting().remove(url);
    getWorkloadProcessed().add(url);
    //log("Complete: " + url );

  }

  /**
   * Called to start the spider
   */
  public void begin() throws InterruptedException
  {
    cancel = false;
    while ( !getWorkloadWaiting().isEmpty() && !cancel ) {
      Object list[] = getWorkloadWaiting().toArray();
      for ( int i=0;(i<list.length)&&!cancel;i++ )
        processURL((URL)list[i]);
    }
  }

/**
 * A HTML parser callback used by this class to detect links
 *

 */
  protected class Parser
  extends HTMLEditorKit.ParserCallback {
    protected URL base;

    public Parser(URL base)
    {
      this.base = base;
    }

    public void handleSimpleTag(HTML.Tag t,
                                MutableAttributeSet a,int pos)
    {
        try {
            // String href = (String)a.getAttribute(HTML.Attribute.HREF);
            String href = (String)a.getAttribute(HTML.Attribute.HREF);
            if( (href==null) && (t==HTML.Tag.FRAME) )
                href = (String)a.getAttribute(HTML.Attribute.SRC);
            
            if ( href==null )
                return;
            
            int i = href.indexOf('#');
            if ( i!=-1 )
                href = href.substring(0,i);
            
            if ( href.toLowerCase().startsWith("mailto:") ) {
                report.spiderFoundEMail(href);
                return;
            }
            
            handleLink(base,href);
        } catch (InterruptedException ex) {
            Logger.getLogger(Spider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleStartTag(HTML.Tag t,
                               MutableAttributeSet a,int pos)
    {
      handleSimpleTag(t,a,pos);    // handle the same way

    }

    protected void handleLink(URL base,String str) throws InterruptedException
    {
      try {
        URL url = new URL(base,str);
        if ( report.spiderFoundURL(base,url) )
          addURL(url);
      } catch ( MalformedURLException e ) {
        log("Found malformed URL: " + str );  // call to print
      }
    }
  }

  /**
   * Called internally to log information
   * This basic method just writes the log
   * out to the stdout.
   *
   * @param entry The information to be written to the log.
   */
  public void log(String entry) throws InterruptedException   //method to print
  {
         
        System.out.println(" URL IS : "+entry );
        Thread.sleep(5000);
  }
}

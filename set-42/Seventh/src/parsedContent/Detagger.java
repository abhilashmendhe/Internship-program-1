/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsedContent;

import java.io.IOException;
import java.io.Reader;
import javafx.scene.web.HTMLEditor;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

/**
 *
 * @author abhilash
 */
public class Detagger extends HTMLEditorKit.ParserCallback {
  StringBuffer txt;
  Reader reader;

  // empty default constructor
  public Detagger() {}

  // more convienient constructor
  public Detagger(Reader r) {
    setReader(r);
  }

  public void setReader(Reader r) { reader = r; }

  public void parse() throws IOException 
  {
    txt = new StringBuffer();
    ParserDelegator parserDelegator = new ParserDelegator();
    parserDelegator.parse(reader, this, true);
  }

  public void handleText(char[] text, int pos) {
    txt.append(text);
  }

  public String toString() {
    return txt.toString();
  }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

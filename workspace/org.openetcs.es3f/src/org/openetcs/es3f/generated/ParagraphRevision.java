
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>ParagraphRevision</i></h3>
  * <br>
  * This code is generated automatically. It is not meant
  * to be maintained or even read. As it is generated, 
  * it does not follow any coding standard. Please refrain
  * from performing any change directly on this generated 
  * code, as it might be overwritten anytime.
  * <br>
  * This documentation is provided for information purposes
  * only, in order to make the generated API somehow more
  * understandable. It is meant to be a maintenance guide,
  * as this code is not meant to be maintained at all.
  */
public class ParagraphRevision
extends org.openetcs.es3f.ModelElement
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getText().compareToIgnoreCase((String) search) == 0)return true;
if(getVersion().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aText;

public   String  getText() { return aText;}

public  void setText( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getText())));
} else {
  __setDirty ( __getDirty() || (getText() != null));
} // If
  aText = v;
}

private   String  aVersion;

public   String  getVersion() { return aVersion;}

public  void setVersion( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getVersion())));
} else {
  __setDirty ( __getDirty() || (getVersion() != null));
} // If
  aVersion = v;
}

public ParagraphRevision()
{
ParagraphRevision obj = this;
aText=(null);
aVersion=(null);
}

public void copyTo(ParagraphRevision other)
{
other.aText = aText;
other.aVersion = aVersion;
}

  boolean __dirty = false;

public void __setDirty(boolean val)
{
  __dirty = val;
}

public boolean __getDirty()
{
  return __dirty;
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void parseBody(xmlBContext ctxt)
throws xmlBException, xmlBRecoveryException
{
int indicator=0;
char quoteChar;
 String  tempStr;

ctxt.skipWhiteSpace();
// Indicator
// Parse PC data
this.setText(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
}


/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public  void parse(xmlBContext ctxt,  String  endingTag)
throws xmlBException, xmlBRecoveryException
{
int indicator = 0;
char quoteChar;
 String  tempStr = null;
boolean fl1468;
boolean fl1469;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1468 = false ; 
fl1469 = true ; 
while (fl1469) { // BeginLoop 
if (ctxt.lookAheadString("version=")){
indicator = 1468;
} else {
indicator = 1470;
} // If
switch (indicator) {
case 1468: {
// Handling attribute version
// Also handles alien attributes with prefix version
if (fl1468){
ctxt.fail ("Duplicate attribute: version");
} // If
fl1468 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVersion((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1470: {
// Taking ignorable attributes into account
if (ctxt.isAlNum()){
ctxt.skipTill ('=');
ctxt.advance();
ctxt.skipWhiteSpace();
quoteChar = ctxt.acceptQuote();
ctxt.skipTill (quoteChar);
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
} else {
if (!fl1468){
ctxt.fail ("Mandatory attribute missing: version in ParagraphRevision");
} // If
fl1469 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</ParagraphRevision>");
}

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
 public  void unParse(PrintWriter pw,
                    boolean typeId,
                     String  headingTag,
                     String  endingTag)
{
int i;

pw.print("<ParagraphRevision");
if (typeId){
pw.print(" xsi:type=\"ParagraphRevision\"");
} // If
pw.println();
pw.print(" version=\"");
acceptor.unParsePcData(pw, this.getVersion());
pw.print('"');
pw.println();
pw.print('>');
unParseBody(pw);
pw.print("</ParagraphRevision>");
pw.println();
}

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void unParseBody(PrintWriter pw)
{
int i;

// Unparsing PcData
acceptor.unParsePcData(pw, this.getText());
}
public  void dispatch(xmlBBaseVisitor v)
{
  ((Visitor)v).visit(this);
}

public  void dispatch(xmlBBaseVisitor v, boolean visitSubNodes)
{
  ((Visitor)v).visit(this, visitSubNodes);
}
/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void subElements(ArrayList l)
{
}

}


package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Shortcut</i></h3>
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
public class Shortcut
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getShortcutName().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aShortcutName;

public   String  getShortcutName() { return aShortcutName;}

public  void setShortcutName( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getShortcutName())));
} else {
  __setDirty ( __getDirty() || (getShortcutName() != null));
} // If
  aShortcutName = v;
}

public Shortcut()
{
Shortcut obj = this;
aShortcutName=(null);
}

public void copyTo(Shortcut other)
{
super.copyTo(other);
other.aShortcutName = aShortcutName;
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
boolean fl1228;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<ShortcutName")){
ctxt.skipWhiteSpace();
fl1228 = true ; 
while (fl1228) { // BeginLoop 
ctxt.skipWhiteSpace();
if (ctxt.isAlNum()){
ctxt.skipTill ('=');
ctxt.advance();
ctxt.skipWhiteSpace();
quoteChar = ctxt.acceptQuote();
ctxt.skipTill (quoteChar);
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
} else {
fl1228 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setShortcutName(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</ShortcutName>");
} // If
// End enclosed
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
boolean fl1229;
boolean fl1230;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1229 = false ; 
fl1230 = true ; 
while (fl1230) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 1229;
} else {
indicator = 1231;
} // If
switch (indicator) {
case 1229: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1229){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1229 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1231: {
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
fl1230 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString(endingTag);
// If formula empty
} // If
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
if (headingTag == null) {
  headingTag = "<Shortcut";
  endingTag = "</Shortcut>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Shortcut\"");
} // If
pw.println();
if (this.getName() != null){
pw.print(" Name=\"");
acceptor.unParsePcData(pw, this.getName());
pw.print('"');
pw.println();
} // If
pw.print('>');
pw.println();
unParseBody(pw);
pw.print(endingTag);
}

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void unParseBody(PrintWriter pw)
{
int i;

super.unParseBody(pw);
// Unparsing Enclosed
// Testing for empty content: ShortcutName
if (this.getShortcutName() != null){
pw.print("<ShortcutName>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getShortcutName());
pw.print("</ShortcutName>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: ShortcutName
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
 super.subElements(l);
}

}

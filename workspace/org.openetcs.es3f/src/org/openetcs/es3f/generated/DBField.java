
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>DBField</i></h3>
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
public class DBField
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getVariable().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aVariable;

public   String  getVariable() { return aVariable;}

public  void setVariable( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getVariable())));
} else {
  __setDirty ( __getDirty() || (getVariable() != null));
} // If
  aVariable = v;
}

private  int aValue;

public  int getValue() { return aValue;}

public  void setValue(int v) {
  __setDirty ( __getDirty() || (getValue() != v));
  aValue = v;
}

public DBField()
{
DBField obj = this;
aVariable=(null);
aValue=(0);
}

public void copyTo(DBField other)
{
super.copyTo(other);
other.aVariable = aVariable;
other.aValue = aValue;
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
boolean fl1062;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Variable")){
ctxt.skipWhiteSpace();
fl1062 = true ; 
while (fl1062) { // BeginLoop 
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
fl1062 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setVariable(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Variable>");
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
boolean fl1063;
boolean fl1064;
boolean fl1065;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1063 = false ; 
fl1064 = false ; 
fl1065 = true ; 
while (fl1065) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("alue=")){
indicator = 1063;
} else {
indicator = 1066;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1064;
} else {
indicator = 1066;
} // If
break;
} // Case
default:
indicator = 1066;
break;
} // Switch
switch (indicator) {
case 1063: {
// Handling attribute Value
// Also handles alien attributes with prefix Value
if (fl1063){
ctxt.fail ("Duplicate attribute: Value");
} // If
fl1063 = true ; 
quoteChar = ctxt.acceptQuote();
this.setValue(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1064: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1064){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1064 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1066: {
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
if (!fl1063){
this.setValue(0);
} // If
fl1065 = false ; 
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
  headingTag = "<DBField";
  endingTag = "</DBField>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"DBField\"");
} // If
pw.println();
if (this.getValue() != 0){
pw.print(" Value=\"");
acceptor.unParsePcData(pw, this.getValue());
pw.print('"');
pw.println();
} // If
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
// Testing for empty content: Variable
if (this.getVariable() != null){
pw.print("<Variable>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getVariable());
pw.print("</Variable>");
// No formula father defined
pw.println();
} // If
// After Testing for empty content: Variable
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

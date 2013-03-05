
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Expectation</i></h3>
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
public class Expectation
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getVariable().compareToIgnoreCase((String) search) == 0)return true;
if(getValue().compareToIgnoreCase((String) search) == 0)return true;
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

private   String  aValue;

public   String  getValue() { return aValue;}

public  void setValue( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getValue())));
} else {
  __setDirty ( __getDirty() || (getValue() != null));
} // If
  aValue = v;
}

private  boolean aBlocking;

public  boolean getBlocking() { return aBlocking;}

public  void setBlocking(boolean v) {
  __setDirty ( __getDirty() || (getBlocking() != v));
  aBlocking = v;
}

private  int aDeadLine;

public  int getDeadLine() { return aDeadLine;}

public  void setDeadLine(int v) {
  __setDirty ( __getDirty() || (getDeadLine() != v));
  aDeadLine = v;
}

public Expectation()
{
Expectation obj = this;
aVariable=(null);
aValue=(null);
aBlocking=(false);
aDeadLine=(0);
}

public void copyTo(Expectation other)
{
super.copyTo(other);
other.aVariable = aVariable;
other.aValue = aValue;
other.aBlocking = aBlocking;
other.aDeadLine = aDeadLine;
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

super.parseBody(ctxt);
// Indicator
// Parse PC data
this.setValue(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
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
boolean fl998;
boolean fl999;
boolean fl1000;
boolean fl1001;
boolean fl1002;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl998 = false ; 
fl999 = false ; 
fl1000 = false ; 
fl1001 = false ; 
fl1002 = true ; 
while (fl1002) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("ariable=")){
indicator = 998;
} else {
indicator = 1003;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1001;
} else {
indicator = 1003;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("eadLine=")){
indicator = 1000;
} else {
indicator = 1003;
} // If
break;
} // Case
case 'B':
{
ctxt.advance();
if (ctxt.lookAheadString("locking=")){
indicator = 999;
} else {
indicator = 1003;
} // If
break;
} // Case
default:
indicator = 1003;
break;
} // Switch
switch (indicator) {
case 998: {
// Handling attribute Variable
// Also handles alien attributes with prefix Variable
if (fl998){
ctxt.fail ("Duplicate attribute: Variable");
} // If
fl998 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVariable((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 999: {
// Handling attribute Blocking
// Also handles alien attributes with prefix Blocking
if (fl999){
ctxt.fail ("Duplicate attribute: Blocking");
} // If
fl999 = true ; 
quoteChar = ctxt.acceptQuote();
this.setBlocking(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1000: {
// Handling attribute DeadLine
// Also handles alien attributes with prefix DeadLine
if (fl1000){
ctxt.fail ("Duplicate attribute: DeadLine");
} // If
fl1000 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDeadLine(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1001: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1001){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1001 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1003: {
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
if (!fl998){
ctxt.fail ("Mandatory attribute missing: Variable in Expectation");
} // If
if (!fl999){
this.setBlocking( false);
} // If
if (!fl1000){
this.setDeadLine(0);
} // If
fl1002 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString(endingTag);
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
  headingTag = "<Expectation";
  endingTag = "</Expectation>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Expectation\"");
} // If
pw.println();
pw.print(" Variable=\"");
acceptor.unParsePcData(pw, this.getVariable());
pw.print('"');
pw.println();
if (this.getBlocking()){
pw.print(" Blocking=\"");
acceptor.unParsePcData(pw, this.getBlocking());
pw.print('"');
pw.println();
} // If
if (this.getDeadLine() != 0){
pw.print(" DeadLine=\"");
acceptor.unParsePcData(pw, this.getDeadLine());
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
// Unparsing PcData
acceptor.unParsePcData(pw, this.getValue());
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

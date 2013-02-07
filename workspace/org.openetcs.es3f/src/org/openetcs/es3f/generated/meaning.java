
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>meaning</i></h3>
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
public class meaning
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getBl().compareToIgnoreCase((String) search) == 0)return true;
if(getValue().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private  int aType;

public  int getType() { return aType;}

public  void setType(int v) {
  __setDirty ( __getDirty() || (getType() != v));
  aType = v;
}

public  String   getType_AsString()
{
  return acceptor.Enum_meaning_type_ToString (aType);
}

public  boolean setType_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_meaning_type(v);
if (temp >= 0){
aType = temp;
return true;
} // If
return false;
}

private   String  aBl;

public   String  getBl() { return aBl;}

public  void setBl( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getBl())));
} else {
  __setDirty ( __getDirty() || (getBl() != null));
} // If
  aBl = v;
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

public meaning()
{
meaning obj = this;
aType=(0);
aBl=(null);
aValue=(null);
}

public void copyTo(meaning other)
{
other.aType = aType;
other.aBl = aBl;
other.aValue = aValue;
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
boolean fl1446;
boolean fl1447;
boolean fl1448;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1446 = false ; 
fl1447 = false ; 
fl1448 = true ; 
while (fl1448) { // BeginLoop 
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
if (ctxt.lookAheadString("ype=")){
indicator = 1446;
} else {
indicator = 1449;
} // If
break;
} // Case
case 'b':
{
ctxt.advance();
if (ctxt.lookAhead2('l','=')){
indicator = 1447;
} else {
indicator = 1449;
} // If
break;
} // Case
default:
indicator = 1449;
break;
} // Switch
switch (indicator) {
case 1446: {
// Handling attribute type
// Also handles alien attributes with prefix type
if (fl1446){
ctxt.fail ("Duplicate attribute: type");
} // If
fl1446 = true ; 
quoteChar = ctxt.acceptQuote();
this.setType(acceptor.lAcceptEnum_meaning_type(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1447: {
// Handling attribute bl
// Also handles alien attributes with prefix bl
if (fl1447){
ctxt.fail ("Duplicate attribute: bl");
} // If
fl1447 = true ; 
quoteChar = ctxt.acceptQuote();
this.setBl((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1449: {
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
if (!fl1446){
ctxt.fail ("Mandatory attribute missing: type in meaning");
} // If
fl1448 = false ; 
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
ctxt.acceptString ("</meaning>");
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

pw.print("<meaning");
if (typeId){
pw.print(" xsi:type=\"meaning\"");
} // If
pw.println();
pw.print(" type=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_meaning_type_ToString(this.getType()));
pw.print('"');
pw.println();
if (this.getBl() != null){
pw.print(" bl=\"");
acceptor.unParsePcData(pw, this.getBl());
pw.print('"');
pw.println();
} // If
pw.print('>');
unParseBody(pw);
pw.print("</meaning>");
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
if (this.getValue() != null){
acceptor.unParsePcData(pw, this.getValue());
} // If
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

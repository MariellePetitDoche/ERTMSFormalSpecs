
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>value</i></h3>
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
public class value
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getUnits().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aUnits;

public   String  getUnits() { return aUnits;}

public  void setUnits( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getUnits())));
} else {
  __setDirty ( __getDirty() || (getUnits() != null));
} // If
  aUnits = v;
}

private  int aValue;

public  int getValue() { return aValue;}

public  void setValue(int v) {
  __setDirty ( __getDirty() || (getValue() != v));
  aValue = v;
}

public value()
{
value obj = this;
aUnits=(null);
aValue=(0);
}

public void copyTo(value other)
{
other.aUnits = aUnits;
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
ctxt.skipWhiteSpace();
// Parse PC data
this.setValue(ctxt.fetchInteger());
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
boolean fl1460;
boolean fl1461;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1460 = false ; 
fl1461 = true ; 
while (fl1461) { // BeginLoop 
if (ctxt.lookAheadString("units=")){
indicator = 1460;
} else {
indicator = 1462;
} // If
switch (indicator) {
case 1460: {
// Handling attribute units
// Also handles alien attributes with prefix units
if (fl1460){
ctxt.fail ("Duplicate attribute: units");
} // If
fl1460 = true ; 
quoteChar = ctxt.acceptQuote();
this.setUnits((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1462: {
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
if (!fl1460){
ctxt.fail ("Mandatory attribute missing: units in value");
} // If
fl1461 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</value>");
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

pw.print("<value");
if (typeId){
pw.print(" xsi:type=\"value\"");
} // If
pw.println();
pw.print(" units=\"");
acceptor.unParsePcData(pw, this.getUnits());
pw.print('"');
pw.println();
pw.print('>');
unParseBody(pw);
pw.print("</value>");
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
}

}

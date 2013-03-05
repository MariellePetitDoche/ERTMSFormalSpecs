
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>resolution_formula</i></h3>
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
public class resolution_formula
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  int aUnits;

public  int getUnits() { return aUnits;}

public  void setUnits(int v) {
  __setDirty ( __getDirty() || (getUnits() != v));
  aUnits = v;
}

public  String   getUnits_AsString()
{
  return acceptor.Enum_resolution_formula_units_ToString (aUnits);
}

public  boolean setUnits_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_resolution_formula_units(v);
if (temp >= 0){
aUnits = temp;
return true;
} // If
return false;
}

private  int aValue;

public  int getValue() { return aValue;}

public  void setValue(int v) {
  __setDirty ( __getDirty() || (getValue() != v));
  aValue = v;
}

public  String   getValue_AsString()
{
  return acceptor.Enum_resolution_formula_Value_ToString (aValue);
}

public  boolean setValue_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_resolution_formula_Value(v);
if (temp >= 0){
aValue = temp;
return true;
} // If
return false;
}

public resolution_formula()
{
resolution_formula obj = this;
aUnits=(0);
aValue=(0);
}

public void copyTo(resolution_formula other)
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
this.setValue(acceptor.lAcceptEnum_resolution_formula_Value(ctxt));
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
boolean fl1456;
boolean fl1457;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1456 = false ; 
fl1457 = true ; 
while (fl1457) { // BeginLoop 
if (ctxt.lookAheadString("units=")){
indicator = 1456;
} else {
indicator = 1458;
} // If
switch (indicator) {
case 1456: {
// Handling attribute units
// Also handles alien attributes with prefix units
if (fl1456){
ctxt.fail ("Duplicate attribute: units");
} // If
fl1456 = true ; 
quoteChar = ctxt.acceptQuote();
this.setUnits(acceptor.lAcceptEnum_resolution_formula_units(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1458: {
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
fl1457 = false ; 
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
ctxt.acceptString ("</resolution-formula>");
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

pw.print("<resolution-formula");
if (typeId){
pw.print(" xsi:type=\"resolution-formula\"");
} // If
pw.println();
if (this.getUnits() != 0){
pw.print(" units=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_resolution_formula_units_ToString(this.getUnits()));
pw.print('"');
pw.println();
} // If
pw.print('>');
unParseBody(pw);
pw.print("</resolution-formula>");
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
acceptor.unParsePcData(pw,
  acceptor.Enum_resolution_formula_Value_ToString(this.getValue()));
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

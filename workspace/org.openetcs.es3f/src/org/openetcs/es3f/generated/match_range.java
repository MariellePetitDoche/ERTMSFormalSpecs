
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>match_range</i></h3>
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
public class match_range
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getMinimum().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aMinimum;

public   String  getMinimum() { return aMinimum;}

public  void setMinimum( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getMinimum())));
} else {
  __setDirty ( __getDirty() || (getMinimum() != null));
} // If
  aMinimum = v;
}

private  int aMaximum;

public  int getMaximum() { return aMaximum;}

public  void setMaximum(int v) {
  __setDirty ( __getDirty() || (getMaximum() != v));
  aMaximum = v;
}

public  String   getMaximum_AsString()
{
  return acceptor.Enum_maximum_Value_ToString (aMaximum);
}

public  boolean setMaximum_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_maximum_Value(v);
if (temp >= 0){
aMaximum = temp;
return true;
} // If
return false;
}

public match_range()
{
match_range obj = this;
aMinimum=(null);
aMaximum=(0);
}

public void copyTo(match_range other)
{
other.aMinimum = aMinimum;
other.aMaximum = aMaximum;
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
boolean fl1453;
boolean fl1454;

ctxt.skipWhiteSpace();
ctxt.skipWhiteSpace();
// Enclosed
ctxt.acceptString ("<minimum");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
ctxt.skipWhiteSpace();
fl1453 = true ; 
while (fl1453) { // BeginLoop 
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
fl1453 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setMinimum(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</minimum>");
// End enclosed
ctxt.skipWhiteSpace();
// Enclosed
ctxt.acceptString ("<maximum");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
ctxt.skipWhiteSpace();
fl1454 = true ; 
while (fl1454) { // BeginLoop 
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
fl1454 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
ctxt.skipWhiteSpace();
// Parse PC data
this.setMaximum(acceptor.lAcceptEnum_maximum_Value(ctxt));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</maximum>");
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
boolean fl1455;

ctxt.skipWhiteSpace();
fl1455 = true ; 
while (fl1455) { // BeginLoop 
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
fl1455 = false ; 
} // If
} // While
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</match-range>");
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

pw.print("<match-range");
if (typeId){
pw.print(" xsi:type=\"match-range\"");
} // If
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</match-range>");
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

// Unparsing Enclosed
pw.print("<minimum>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getMinimum());
pw.print("</minimum>");
// Father is not a mixed
pw.println();
// Unparsing Enclosed
pw.print("<maximum>");
// Unparsing PcData
acceptor.unParsePcData(pw,
  acceptor.Enum_maximum_Value_ToString(this.getMaximum()));
pw.print("</maximum>");
// Father is not a mixed
pw.println();
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

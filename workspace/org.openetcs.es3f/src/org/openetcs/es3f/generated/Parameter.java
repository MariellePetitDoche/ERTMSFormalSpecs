
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Parameter</i></h3>
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
public class Parameter
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getTypeName().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aTypeName;

public   String  getTypeName() { return aTypeName;}

public  void setTypeName( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getTypeName())));
} else {
  __setDirty ( __getDirty() || (getTypeName() != null));
} // If
  aTypeName = v;
}

public Parameter()
{
Parameter obj = this;
aTypeName=(null);
}

public void copyTo(Parameter other)
{
super.copyTo(other);
other.aTypeName = aTypeName;
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
super.parseBody(ctxt);
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
boolean fl584;
boolean fl585;
boolean fl586;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl584 = false ; 
fl585 = false ; 
fl586 = true ; 
while (fl586) { // BeginLoop 
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("ype=")){
indicator = 584;
} else {
indicator = 587;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 585;
} else {
indicator = 587;
} // If
break;
} // Case
default:
indicator = 587;
break;
} // Switch
switch (indicator) {
case 584: {
// Handling attribute Type
// Also handles alien attributes with prefix Type
if (fl584){
ctxt.fail ("Duplicate attribute: Type");
} // If
fl584 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTypeName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 585: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl585){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl585 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 587: {
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
if (!fl584){
ctxt.fail ("Mandatory attribute missing: Type in Parameter");
} // If
fl586 = false ; 
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
  headingTag = "<Parameter";
  endingTag = "</Parameter>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Parameter\"");
} // If
pw.println();
pw.print(" Type=\"");
acceptor.unParsePcData(pw, this.getTypeName());
pw.print('"');
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

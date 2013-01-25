
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>StructureElement</i></h3>
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
public class StructureElement
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getTypeName().compareToIgnoreCase((String) search) == 0)return true;
if(getDefault().compareToIgnoreCase((String) search) == 0)return true;
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

private   String  aDefault;

public   String  getDefault() { return aDefault;}

public  void setDefault( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getDefault())));
} else {
  __setDirty ( __getDirty() || (getDefault() != null));
} // If
  aDefault = v;
}

private  int aMode;

public  int getMode() { return aMode;}

public  void setMode(int v) {
  __setDirty ( __getDirty() || (getMode() != v));
  aMode = v;
}

public  String   getMode_AsString()
{
  return acceptor.Enum_VariableModeEnumType_ToString (aMode);
}

public  boolean setMode_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_VariableModeEnumType(v);
if (temp >= 0){
aMode = temp;
return true;
} // If
return false;
}

public StructureElement()
{
StructureElement obj = this;
aTypeName=(null);
aDefault=(null);
aMode=(0);
}

public void copyTo(StructureElement other)
{
super.copyTo(other);
other.aTypeName = aTypeName;
other.aDefault = aDefault;
other.aMode = aMode;
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
boolean fl468;
boolean fl469;
boolean fl470;
boolean fl471;
boolean fl472;
boolean fl473;
boolean fl474;
boolean fl475;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl468 = false ; 
fl469 = false ; 
fl470 = false ; 
fl471 = false ; 
fl472 = false ; 
fl473 = false ; 
fl474 = false ; 
fl475 = true ; 
while (fl475) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 472;
} else {
indicator = 476;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("ypeName=")){
indicator = 468;
} else {
indicator = 476;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
switch (ctxt.current()) {
case 'e':
{
ctxt.advance();
if (ctxt.lookAheadString("edsRequirement=")){
indicator = 473;
} else {
indicator = 476;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 474;
} else {
indicator = 476;
} // If
break;
} // Case
default:
indicator = 476;
break;
} // Switch
break;
} // Case
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("ode=")){
indicator = 470;
} else {
indicator = 476;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 471;
} else {
indicator = 476;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efault=")){
indicator = 469;
} else {
indicator = 476;
} // If
break;
} // Case
default:
indicator = 476;
break;
} // Switch
switch (indicator) {
case 468: {
// Handling attribute TypeName
// Also handles alien attributes with prefix TypeName
if (fl468){
ctxt.fail ("Duplicate attribute: TypeName");
} // If
fl468 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTypeName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 469: {
// Handling attribute Default
// Also handles alien attributes with prefix Default
if (fl469){
ctxt.fail ("Duplicate attribute: Default");
} // If
fl469 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefault((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 470: {
// Handling attribute Mode
// Also handles alien attributes with prefix Mode
if (fl470){
ctxt.fail ("Duplicate attribute: Mode");
} // If
fl470 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMode(acceptor.lAcceptEnum_VariableModeEnumType(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 471: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl471){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl471 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 472: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl472){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl472 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 473: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl473){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl473 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 474: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl474){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl474 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 476: {
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
if (!fl468){
ctxt.fail ("Mandatory attribute missing: TypeName in StructureElement");
} // If
if (!fl469){
this.setDefault("");
} // If
if (!fl470){
this.setMode(acceptor.aInternal);
} // If
if (!fl471){
this.setImplemented( false);
} // If
if (!fl472){
this.setVerified( false);
} // If
if (!fl473){
this.setNeedsRequirement( true);
} // If
fl475 = false ; 
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
  headingTag = "<StructureElement";
  endingTag = "</StructureElement>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"StructureElement\"");
} // If
pw.println();
pw.print(" TypeName=\"");
acceptor.unParsePcData(pw, this.getTypeName());
pw.print('"');
pw.println();
if (this.getDefault() != null){
pw.print(" Default=\"");
acceptor.unParsePcData(pw, this.getDefault());
pw.print('"');
pw.println();
} // If
if (this.getMode() != 0){
pw.print(" Mode=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_VariableModeEnumType_ToString(this.getMode()));
pw.print('"');
pw.println();
} // If
if (this.getImplemented()){
pw.print(" Implemented=\"");
acceptor.unParsePcData(pw, this.getImplemented());
pw.print('"');
pw.println();
} // If
if (this.getVerified()){
pw.print(" Verified=\"");
acceptor.unParsePcData(pw, this.getVerified());
pw.print('"');
pw.println();
} // If
if (!this.getNeedsRequirement()){
pw.print(" NeedsRequirement=\"");
acceptor.unParsePcData(pw, this.getNeedsRequirement());
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

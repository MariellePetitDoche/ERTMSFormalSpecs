
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Collection</i></h3>
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
public class Collection
extends org.openetcs.es3f.DataDictionary.Types.Type
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

private  int aMaxSize;

public  int getMaxSize() { return aMaxSize;}

public  void setMaxSize(int v) {
  __setDirty ( __getDirty() || (getMaxSize() != v));
  aMaxSize = v;
}

public Collection()
{
Collection obj = this;
aTypeName=(null);
aMaxSize=(0);
}

public void copyTo(Collection other)
{
super.copyTo(other);
other.aTypeName = aTypeName;
other.aMaxSize = aMaxSize;
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
boolean fl524;
boolean fl525;
boolean fl526;
boolean fl527;
boolean fl528;
boolean fl529;
boolean fl530;
boolean fl531;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl524 = false ; 
fl525 = false ; 
fl526 = false ; 
fl527 = false ; 
fl528 = false ; 
fl529 = false ; 
fl530 = false ; 
fl531 = true ; 
while (fl531) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 528;
} else {
indicator = 532;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("ypeName=")){
indicator = 524;
} else {
indicator = 532;
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
indicator = 529;
} else {
indicator = 532;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 530;
} else {
indicator = 532;
} // If
break;
} // Case
default:
indicator = 532;
break;
} // Switch
break;
} // Case
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("axSize=")){
indicator = 525;
} else {
indicator = 532;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 527;
} else {
indicator = 532;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efault=")){
indicator = 526;
} else {
indicator = 532;
} // If
break;
} // Case
default:
indicator = 532;
break;
} // Switch
switch (indicator) {
case 524: {
// Handling attribute TypeName
// Also handles alien attributes with prefix TypeName
if (fl524){
ctxt.fail ("Duplicate attribute: TypeName");
} // If
fl524 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTypeName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 525: {
// Handling attribute MaxSize
// Also handles alien attributes with prefix MaxSize
if (fl525){
ctxt.fail ("Duplicate attribute: MaxSize");
} // If
fl525 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMaxSize(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 526: {
// Handling attribute Default
// Also handles alien attributes with prefix Default
if (fl526){
ctxt.fail ("Duplicate attribute: Default");
} // If
fl526 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefault((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 527: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl527){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl527 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 528: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl528){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl528 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 529: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl529){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl529 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 530: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl530){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl530 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 532: {
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
if (!fl524){
ctxt.fail ("Mandatory attribute missing: TypeName in Collection");
} // If
if (!fl525){
this.setMaxSize(10);
} // If
if (!fl527){
this.setImplemented( false);
} // If
if (!fl528){
this.setVerified( false);
} // If
if (!fl529){
this.setNeedsRequirement( true);
} // If
fl531 = false ; 
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
  headingTag = "<Collection";
  endingTag = "</Collection>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Collection\"");
} // If
pw.println();
pw.print(" TypeName=\"");
acceptor.unParsePcData(pw, this.getTypeName());
pw.print('"');
pw.println();
if (this.getMaxSize() != 10){
pw.print(" MaxSize=\"");
acceptor.unParsePcData(pw, this.getMaxSize());
pw.print('"');
pw.println();
} // If
if (this.getDefault() != null){
pw.print(" Default=\"");
acceptor.unParsePcData(pw, this.getDefault());
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


package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>ReqRelated</i></h3>
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
public abstract class ReqRelated
extends org.openetcs.es3f.DataDictionary.ReferencesParagraph
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  boolean aImplemented;

public  boolean getImplemented() { return aImplemented;}

public  void setImplemented(boolean v) {
  __setDirty ( __getDirty() || (getImplemented() != v));
  aImplemented = v;
}

private  boolean aVerified;

public  boolean getVerified() { return aVerified;}

public  void setVerified(boolean v) {
  __setDirty ( __getDirty() || (getVerified() != v));
  aVerified = v;
}

private  boolean aNeedsRequirement;

public  boolean getNeedsRequirement() { return aNeedsRequirement;}

public  void setNeedsRequirement(boolean v) {
  __setDirty ( __getDirty() || (getNeedsRequirement() != v));
  aNeedsRequirement = v;
}

public ReqRelated()
{
ReqRelated obj = this;
aImplemented=(false);
aVerified=(false);
aNeedsRequirement=(false);
}

public void copyTo(ReqRelated other)
{
super.copyTo(other);
other.aImplemented = aImplemented;
other.aVerified = aVerified;
other.aNeedsRequirement = aNeedsRequirement;
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
boolean fl122;
boolean fl123;
boolean fl124;
boolean fl125;
boolean fl126;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl122 = false ; 
fl123 = false ; 
fl124 = false ; 
fl125 = false ; 
fl126 = true ; 
while (fl126) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 123;
} else {
indicator = 127;
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
indicator = 124;
} else {
indicator = 127;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 125;
} else {
indicator = 127;
} // If
break;
} // Case
default:
indicator = 127;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 122;
} else {
indicator = 127;
} // If
break;
} // Case
default:
indicator = 127;
break;
} // Switch
switch (indicator) {
case 122: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl122){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl122 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 123: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl123){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl123 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 124: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl124){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl124 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 125: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl125){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl125 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 127: {
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
if (!fl122){
this.setImplemented( false);
} // If
if (!fl123){
this.setVerified( false);
} // If
if (!fl124){
this.setNeedsRequirement( true);
} // If
fl126 = false ; 
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
  headingTag = "<ReqRelated";
  endingTag = "</ReqRelated>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"ReqRelated\"");
} // If
pw.println();
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


package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>RuleDisabling</i></h3>
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
public class RuleDisabling
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getRule().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aRule;

public   String  getRule() { return aRule;}

public  void setRule( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getRule())));
} else {
  __setDirty ( __getDirty() || (getRule() != null));
} // If
  aRule = v;
}

public RuleDisabling()
{
RuleDisabling obj = this;
aRule=(null);
}

public void copyTo(RuleDisabling other)
{
super.copyTo(other);
other.aRule = aRule;
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
boolean fl181;
boolean fl182;
boolean fl183;
boolean fl184;
boolean fl185;
boolean fl186;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl181 = false ; 
fl182 = false ; 
fl183 = false ; 
fl184 = false ; 
fl185 = false ; 
fl186 = true ; 
while (fl186) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 183;
} else {
indicator = 187;
} // If
break;
} // Case
case 'R':
{
ctxt.advance();
if (ctxt.lookAheadString("ule=")){
indicator = 181;
} else {
indicator = 187;
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
indicator = 184;
} else {
indicator = 187;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 185;
} else {
indicator = 187;
} // If
break;
} // Case
default:
indicator = 187;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 182;
} else {
indicator = 187;
} // If
break;
} // Case
default:
indicator = 187;
break;
} // Switch
switch (indicator) {
case 181: {
// Handling attribute Rule
// Also handles alien attributes with prefix Rule
if (fl181){
ctxt.fail ("Duplicate attribute: Rule");
} // If
fl181 = true ; 
quoteChar = ctxt.acceptQuote();
this.setRule((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 182: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl182){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl182 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 183: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl183){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl183 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 184: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl184){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl184 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 185: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl185){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl185 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 187: {
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
if (!fl181){
ctxt.fail ("Mandatory attribute missing: Rule in RuleDisabling");
} // If
if (!fl182){
this.setImplemented( false);
} // If
if (!fl183){
this.setVerified( false);
} // If
if (!fl184){
this.setNeedsRequirement( true);
} // If
fl186 = false ; 
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
  headingTag = "<RuleDisabling";
  endingTag = "</RuleDisabling>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"RuleDisabling\"");
} // If
pw.println();
pw.print(" Rule=\"");
acceptor.unParsePcData(pw, this.getRule());
pw.print('"');
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

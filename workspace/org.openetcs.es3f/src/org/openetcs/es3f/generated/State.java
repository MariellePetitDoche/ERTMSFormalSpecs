
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>State</i></h3>
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
public class State
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  StateMachine aStateMachine;

public  StateMachine getStateMachine() { return aStateMachine;}

public  void setStateMachine(StateMachine v) {
  __setDirty ( __getDirty() || (getStateMachine() != v));
  aStateMachine = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  int aWidth;

public  int getWidth() { return aWidth;}

public  void setWidth(int v) {
  __setDirty ( __getDirty() || (getWidth() != v));
  aWidth = v;
}

private  int aHeight;

public  int getHeight() { return aHeight;}

public  void setHeight(int v) {
  __setDirty ( __getDirty() || (getHeight() != v));
  aHeight = v;
}

private  int aX;

public  int getX() { return aX;}

public  void setX(int v) {
  __setDirty ( __getDirty() || (getX() != v));
  aX = v;
}

private  int aY;

public  int getY() { return aY;}

public  void setY(int v) {
  __setDirty ( __getDirty() || (getY() != v));
  aY = v;
}

public State()
{
State obj = this;
aStateMachine=(null);
aWidth=(0);
aHeight=(0);
aX=(0);
aY=(0);
}

public void copyTo(State other)
{
super.copyTo(other);
other.aStateMachine = aStateMachine;
other.aWidth = aWidth;
other.aHeight = aHeight;
other.aX = aX;
other.aY = aY;
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
// Element Ref : StateMachine
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<StateMachine")){
// Parsing sub element
this.setStateMachine(acceptor.lAccept_StateMachine(ctxt,"</StateMachine>"));
setSon(this.getStateMachine());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
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
boolean fl690;
boolean fl691;
boolean fl692;
boolean fl693;
boolean fl694;
boolean fl695;
boolean fl696;
boolean fl697;
boolean fl698;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl690 = false ; 
fl691 = false ; 
fl692 = false ; 
fl693 = false ; 
fl694 = false ; 
fl695 = false ; 
fl696 = false ; 
fl697 = false ; 
fl698 = true ; 
while (fl698) { // BeginLoop 
switch (ctxt.current()) {
case 'Y':
{
ctxt.advance();
if (ctxt.lookAhead1('=')){
indicator = 691;
} else {
indicator = 699;
} // If
break;
} // Case
case 'X':
{
ctxt.advance();
if (ctxt.lookAhead1('=')){
indicator = 690;
} else {
indicator = 699;
} // If
break;
} // Case
case 'W':
{
ctxt.advance();
if (ctxt.lookAheadString("idth=")){
indicator = 692;
} else {
indicator = 699;
} // If
break;
} // Case
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 695;
} else {
indicator = 699;
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
indicator = 696;
} else {
indicator = 699;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 697;
} else {
indicator = 699;
} // If
break;
} // Case
default:
indicator = 699;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 694;
} else {
indicator = 699;
} // If
break;
} // Case
case 'H':
{
ctxt.advance();
if (ctxt.lookAheadString("eight=")){
indicator = 693;
} else {
indicator = 699;
} // If
break;
} // Case
default:
indicator = 699;
break;
} // Switch
switch (indicator) {
case 690: {
// Handling attribute X
// Also handles alien attributes with prefix X
if (fl690){
ctxt.fail ("Duplicate attribute: X");
} // If
fl690 = true ; 
quoteChar = ctxt.acceptQuote();
this.setX(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 691: {
// Handling attribute Y
// Also handles alien attributes with prefix Y
if (fl691){
ctxt.fail ("Duplicate attribute: Y");
} // If
fl691 = true ; 
quoteChar = ctxt.acceptQuote();
this.setY(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 692: {
// Handling attribute Width
// Also handles alien attributes with prefix Width
if (fl692){
ctxt.fail ("Duplicate attribute: Width");
} // If
fl692 = true ; 
quoteChar = ctxt.acceptQuote();
this.setWidth(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 693: {
// Handling attribute Height
// Also handles alien attributes with prefix Height
if (fl693){
ctxt.fail ("Duplicate attribute: Height");
} // If
fl693 = true ; 
quoteChar = ctxt.acceptQuote();
this.setHeight(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 694: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl694){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl694 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 695: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl695){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl695 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 696: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl696){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl696 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 697: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl697){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl697 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 699: {
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
if (!fl690){
this.setX(0);
} // If
if (!fl691){
this.setY(0);
} // If
if (!fl692){
this.setWidth(0);
} // If
if (!fl693){
this.setHeight(0);
} // If
if (!fl694){
this.setImplemented( false);
} // If
if (!fl695){
this.setVerified( false);
} // If
if (!fl696){
this.setNeedsRequirement( true);
} // If
fl698 = false ; 
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
  headingTag = "<State";
  endingTag = "</State>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"State\"");
} // If
pw.println();
if (this.getX() != 0){
pw.print(" X=\"");
acceptor.unParsePcData(pw, this.getX());
pw.print('"');
pw.println();
} // If
if (this.getY() != 0){
pw.print(" Y=\"");
acceptor.unParsePcData(pw, this.getY());
pw.print('"');
pw.println();
} // If
if (this.getWidth() != 0){
pw.print(" Width=\"");
acceptor.unParsePcData(pw, this.getWidth());
pw.print('"');
pw.println();
} // If
if (this.getHeight() != 0){
pw.print(" Height=\"");
acceptor.unParsePcData(pw, this.getHeight());
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
// Unparsing ElementRef
if (this.getStateMachine() != null){
unParse(pw, this.getStateMachine(),false,"<StateMachine","</StateMachine>");
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
 super.subElements(l);
l.add(this.getStateMachine());
}

}

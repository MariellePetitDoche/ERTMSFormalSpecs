
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>TypeSpec</i></h3>
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
public class TypeSpec
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getMinimum_value().compareToIgnoreCase((String) search) == 0)return true;
if(getMaximum_value().compareToIgnoreCase((String) search) == 0)return true;
if(getResolution_formula().compareToIgnoreCase((String) search) == 0)return true;
if(getId().compareToIgnoreCase((String) search) == 0)return true;
if(getBl().compareToIgnoreCase((String) search) == 0)return true;
if(getDescription().compareToIgnoreCase((String) search) == 0)return true;
if(getShort_description().compareToIgnoreCase((String) search) == 0)return true;
if(getReference().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private  int aLength;

public  int getLength() { return aLength;}

public  void setLength(int v) {
  __setDirty ( __getDirty() || (getLength() != v));
  aLength = v;
}

private   String  aMinimum_value;

public   String  getMinimum_value() { return aMinimum_value;}

public  void setMinimum_value( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getMinimum_value())));
} else {
  __setDirty ( __getDirty() || (getMinimum_value() != null));
} // If
  aMinimum_value = v;
}

private   String  aMaximum_value;

public   String  getMaximum_value() { return aMaximum_value;}

public  void setMaximum_value( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getMaximum_value())));
} else {
  __setDirty ( __getDirty() || (getMaximum_value() != null));
} // If
  aMaximum_value = v;
}

private   String  aResolution_formula;

public   String  getResolution_formula() { return aResolution_formula;}

public  void setResolution_formula( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getResolution_formula())));
} else {
  __setDirty ( __getDirty() || (getResolution_formula() != null));
} // If
  aResolution_formula = v;
}

private   String  aId;

public   String  getId() { return aId;}

public  void setId( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getId())));
} else {
  __setDirty ( __getDirty() || (getId() != null));
} // If
  aId = v;
}

private  int aErtms_type;

public  int getErtms_type() { return aErtms_type;}

public  void setErtms_type(int v) {
  __setDirty ( __getDirty() || (getErtms_type() != v));
  aErtms_type = v;
}

public  String   getErtms_type_AsString()
{
  return acceptor.Enum_TypeSpec_ertms_type_ToString (aErtms_type);
}

public  boolean setErtms_type_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_TypeSpec_ertms_type(v);
if (temp >= 0){
aErtms_type = temp;
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

private  Values aValues;

public  Values getValues() { return aValues;}

public  void setValues(Values v) {
  __setDirty ( __getDirty() || (getValues() != v));
  aValues = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  char_value aChar_value;

public  char_value getChar_value() { return aChar_value;}

public  void setChar_value(char_value v) {
  __setDirty ( __getDirty() || (getChar_value() != v));
  aChar_value = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private   String  aDescription;

public   String  getDescription() { return aDescription;}

public  void setDescription( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getDescription())));
} else {
  __setDirty ( __getDirty() || (getDescription() != null));
} // If
  aDescription = v;
}

private   String  aShort_description;

public   String  getShort_description() { return aShort_description;}

public  void setShort_description( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getShort_description())));
} else {
  __setDirty ( __getDirty() || (getShort_description() != null));
} // If
  aShort_description = v;
}

private   String  aReference;

public   String  getReference() { return aReference;}

public  void setReference( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getReference())));
} else {
  __setDirty ( __getDirty() || (getReference() != null));
} // If
  aReference = v;
}

public TypeSpec()
{
TypeSpec obj = this;
aLength=(0);
aMinimum_value=(null);
aMaximum_value=(null);
aResolution_formula=(null);
aId=(null);
aErtms_type=(0);
aBl=(null);
aValues=(null);
aChar_value=(null);
aDescription=(null);
aShort_description=(null);
aReference=(null);
}

public void copyTo(TypeSpec other)
{
other.aLength = aLength;
other.aMinimum_value = aMinimum_value;
other.aMaximum_value = aMaximum_value;
other.aResolution_formula = aResolution_formula;
other.aId = aId;
other.aErtms_type = aErtms_type;
other.aBl = aBl;
other.aValues = aValues;
other.aChar_value = aChar_value;
other.aDescription = aDescription;
other.aShort_description = aShort_description;
other.aReference = aReference;
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
boolean fl1386;
boolean fl1387;
boolean fl1388;
int fl1391;

ctxt.skipWhiteSpace();
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<short-description")){
ctxt.skipWhiteSpace();
fl1386 = true ; 
while (fl1386) { // BeginLoop 
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
fl1386 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setShort_description(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</short-description>");
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Description")){
ctxt.skipWhiteSpace();
fl1387 = true ; 
while (fl1387) { // BeginLoop 
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
fl1387 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Indicator
// Parse PC data
this.setDescription(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Description>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<reference")){
ctxt.skipWhiteSpace();
fl1388 = true ; 
while (fl1388) { // BeginLoop 
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
fl1388 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setReference(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</reference>");
} // If
// End enclosed
// Disjunct
ctxt.skipWhiteSpace();
// Nullable formula
fl1391 = ctxt.getPtr();
switch (ctxt.current()) {
case '<':
{
ctxt.advance();
switch (ctxt.current()) {
case 'c':
{
ctxt.advance();
if (ctxt.lookAheadString("har-value")){
indicator = 1390;
} else {
ctxt.moveBack(1);
indicator = 1392;
} // If
break;
} // Case
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("alues")){
indicator = 1389;
} else {
ctxt.moveBack(1);
indicator = 1392;
} // If
break;
} // Case
default:
indicator = 1392;
break;
} // Switch
break;
} // Case
default:
indicator = 1392;
break;
} // Switch
switch (indicator) {
// Dispatch Lablel
case 1389: {
ctxt.moveBack(7);
// Element Ref : Values
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<Values")){
// Parsing sub element
this.setValues(acceptor.lAccept_Values(ctxt,null));
setSon(this.getValues());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Dispatch Lablel
case 1390: {
ctxt.moveBack(11);
// Element Ref : char-value
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<char-value")){
// Parsing sub element
this.setChar_value(acceptor.lAccept_char_value(ctxt,null));
setSon(this.getChar_value());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Optional of PCdata
case 1392: {
ctxt.setPtr(fl1391);
// Doing nothing, optional disj
break;
} // End of dispatch label
} // Dispatch
// End Disjunct
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
boolean fl1397;
boolean fl1398;
boolean fl1399;
boolean fl1400;
boolean fl1401;
boolean fl1402;
boolean fl1403;
boolean fl1404;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1397 = false ; 
fl1398 = false ; 
fl1399 = false ; 
fl1400 = false ; 
fl1401 = false ; 
fl1402 = false ; 
fl1403 = false ; 
fl1404 = true ; 
while (fl1404) { // BeginLoop 
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("esolution_formula=")){
indicator = 1400;
} else {
indicator = 1405;
} // If
break;
} // Case
case 'm':
{
ctxt.advance();
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
if (ctxt.lookAheadString("nimum_value=")){
indicator = 1398;
} else {
indicator = 1405;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAheadString("ximum_value=")){
indicator = 1399;
} else {
indicator = 1405;
} // If
break;
} // Case
default:
indicator = 1405;
break;
} // Switch
break;
} // Case
case 'l':
{
ctxt.advance();
if (ctxt.lookAheadString("ength=")){
indicator = 1397;
} else {
indicator = 1405;
} // If
break;
} // Case
case 'i':
{
ctxt.advance();
if (ctxt.lookAhead2('d','=')){
indicator = 1401;
} else {
indicator = 1405;
} // If
break;
} // Case
case 'e':
{
ctxt.advance();
if (ctxt.lookAheadString("rtms-type=")){
indicator = 1402;
} else {
indicator = 1405;
} // If
break;
} // Case
case 'b':
{
ctxt.advance();
if (ctxt.lookAhead2('l','=')){
indicator = 1403;
} else {
indicator = 1405;
} // If
break;
} // Case
default:
indicator = 1405;
break;
} // Switch
switch (indicator) {
case 1397: {
// Handling attribute length
// Also handles alien attributes with prefix length
if (fl1397){
ctxt.fail ("Duplicate attribute: length");
} // If
fl1397 = true ; 
quoteChar = ctxt.acceptQuote();
this.setLength(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1398: {
// Handling attribute minimum_value
// Also handles alien attributes with prefix minimum_value
if (fl1398){
ctxt.fail ("Duplicate attribute: minimum_value");
} // If
fl1398 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMinimum_value((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1399: {
// Handling attribute maximum_value
// Also handles alien attributes with prefix maximum_value
if (fl1399){
ctxt.fail ("Duplicate attribute: maximum_value");
} // If
fl1399 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMaximum_value((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1400: {
// Handling attribute resolution_formula
// Also handles alien attributes with prefix resolution_formula
if (fl1400){
ctxt.fail ("Duplicate attribute: resolution_formula");
} // If
fl1400 = true ; 
quoteChar = ctxt.acceptQuote();
this.setResolution_formula((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1401: {
// Handling attribute id
// Also handles alien attributes with prefix id
if (fl1401){
ctxt.fail ("Duplicate attribute: id");
} // If
fl1401 = true ; 
quoteChar = ctxt.acceptQuote();
this.setId((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1402: {
// Handling attribute ertms-type
// Also handles alien attributes with prefix ertms-type
if (fl1402){
ctxt.fail ("Duplicate attribute: ertms-type");
} // If
fl1402 = true ; 
quoteChar = ctxt.acceptQuote();
this.setErtms_type(acceptor.lAcceptEnum_TypeSpec_ertms_type(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1403: {
// Handling attribute bl
// Also handles alien attributes with prefix bl
if (fl1403){
ctxt.fail ("Duplicate attribute: bl");
} // If
fl1403 = true ; 
quoteChar = ctxt.acceptQuote();
this.setBl((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1405: {
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
if (!fl1397){
ctxt.fail ("Mandatory attribute missing: length in TypeSpec");
} // If
fl1404 = false ; 
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
ctxt.acceptString ("</TypeSpec>");
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

pw.print("<TypeSpec");
if (typeId){
pw.print(" xsi:type=\"TypeSpec\"");
} // If
pw.println();
pw.print(" length=\"");
acceptor.unParsePcData(pw, this.getLength());
pw.print('"');
pw.println();
if (this.getMinimum_value() != null){
pw.print(" minimum_value=\"");
acceptor.unParsePcData(pw, this.getMinimum_value());
pw.print('"');
pw.println();
} // If
if (this.getMaximum_value() != null){
pw.print(" maximum_value=\"");
acceptor.unParsePcData(pw, this.getMaximum_value());
pw.print('"');
pw.println();
} // If
if (this.getResolution_formula() != null){
pw.print(" resolution_formula=\"");
acceptor.unParsePcData(pw, this.getResolution_formula());
pw.print('"');
pw.println();
} // If
if (this.getId() != null){
pw.print(" id=\"");
acceptor.unParsePcData(pw, this.getId());
pw.print('"');
pw.println();
} // If
if (this.getErtms_type() != 0){
pw.print(" ertms-type=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_TypeSpec_ertms_type_ToString(this.getErtms_type()));
pw.print('"');
pw.println();
} // If
if (this.getBl() != null){
pw.print(" bl=\"");
acceptor.unParsePcData(pw, this.getBl());
pw.print('"');
pw.println();
} // If
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</TypeSpec>");
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
// Testing for empty content: Short-description
if (this.getShort_description() != null){
pw.print("<short-description>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getShort_description());
pw.print("</short-description>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Short-description
// Unparsing Enclosed
// Testing for empty content: Description
if (this.getDescription() != null){
pw.print("<Description>");
// Unparsing PcData
if (this.getDescription() != null){
acceptor.unParsePcData(pw, this.getDescription());
} // If
pw.print("</Description>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Description
// Unparsing Enclosed
// Testing for empty content: Reference
if (this.getReference() != null){
pw.print("<reference>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getReference());
pw.print("</reference>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Reference
// Unparsing Disjunct
if (this.getValues() != null){
// Unparsing ElementRef
if (this.getValues() != null){
unParse(pw, this.getValues(), false, null, null);
} // If
} else {
if (this.getChar_value() != null){
// Unparsing ElementRef
if (this.getChar_value() != null){
unParse(pw, this.getChar_value(), false, null, null);
} // If
} // If
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
l.add(this.getValues());
l.add(this.getChar_value());
}

}

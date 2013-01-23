
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Range</i></h3>
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
public class Range
extends org.openetcs.es3f.DataDictionary.Types.Type
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getMinValue().compareToIgnoreCase((String) search) == 0)return true;
if(getMaxValue().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aMinValue;

public   String  getMinValue() { return aMinValue;}

public  void setMinValue( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getMinValue())));
} else {
  __setDirty ( __getDirty() || (getMinValue() != null));
} // If
  aMinValue = v;
}

private   String  aMaxValue;

public   String  getMaxValue() { return aMaxValue;}

public  void setMaxValue( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getMaxValue())));
} else {
  __setDirty ( __getDirty() || (getMaxValue() != null));
} // If
  aMaxValue = v;
}

private java.util.ArrayList  aSpecialValues;

/** Part of the list interface for SpecialValues
  * @return a collection of all the elements in SpecialValues
  */
public java.util.ArrayList  allSpecialValues()
  {
if (aSpecialValues == null){
    setAllSpecialValues( new java.util.ArrayList () );
} // If
    return aSpecialValues;
  }

/** Part of the list interface for SpecialValues
  * @return a collection of all the elements in SpecialValues
  */
private java.util.ArrayList  getSpecialValues()
  {
    return allSpecialValues();
  }

/** Part of the list interface for SpecialValues
  * @param coll a collection of elements which replaces 
  *        SpecialValues's current content.
  */
public void setAllSpecialValues(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSpecialValues = coll;
  }

/** Part of the list interface for SpecialValues
  * @param el a EnumValue to add to the collection in 
  *           SpecialValues
  * @seealso #appendSpecialValues(java.util.Collection )
  */
public void appendSpecialValues(EnumValue el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSpecialValues().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for SpecialValues
  * @param coll a collection ofEnumValues to add to the collection in 
  *           SpecialValues
  * @seealso #appendSpecialValues(EnumValue)
  */
public void appendSpecialValues(java.util.Collection  coll)
  {
  __setDirty(true);
  allSpecialValues().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for SpecialValues
  * This insertion function inserts a new element in the
  * collection in SpecialValues
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSpecialValues(int idx, EnumValue el)
  {
  __setDirty(true);
  allSpecialValues().add (idx, el);
  }

/** Part of the list interface for SpecialValues
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSpecialValues(xmlBBaseInter el)
  {
  return allSpecialValues().indexOf (el);
  }

/** Part of the list interface for SpecialValues
  * This deletion function removes an element from the
  * collection in SpecialValues
  * @param idx the index of the element to remove
  */
public void deleteSpecialValues(int idx)
  {
  __setDirty(true);
  allSpecialValues().remove(idx);
  }

public void SortSpecialValues()
  {
//-> hostname : EnumValue
Collections.sort(allSpecialValues(), new Comparator<EnumValue>() {
public int compare( EnumValue o1, EnumValue o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for SpecialValues
  * This deletion function removes an element from the
  * collection in SpecialValues
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSpecialValues(xmlBBaseInter obj)
  {
  int idx = indexOfSpecialValues(obj);
  if (idx >= 0) { deleteSpecialValues(idx);
   }
  }

/** Part of the list interface for SpecialValues
  * @return the number of elements in SpecialValues
  */
public int countSpecialValues()
  {
  return allSpecialValues().size();
  }

/** Part of the list interface for SpecialValues
  * This function returns an element from the
  * collection in SpecialValues based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public EnumValue getSpecialValues(int idx)
{
  return (EnumValue) ( allSpecialValues().get(idx));
}

private  int aPrecision;

public  int getPrecision() { return aPrecision;}

public  void setPrecision(int v) {
  __setDirty ( __getDirty() || (getPrecision() != v));
  aPrecision = v;
}

public  String   getPrecision_AsString()
{
  return acceptor.Enum_PrecisionEnum_ToString (aPrecision);
}

public  boolean setPrecision_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_PrecisionEnum(v);
if (temp >= 0){
aPrecision = temp;
return true;
} // If
return false;
}

public Range()
{
Range obj = this;
aMinValue=(null);
aMaxValue=(null);
aSpecialValues=(null);
aPrecision=(0);
}

public void copyTo(Range other)
{
super.copyTo(other);
other.aMinValue = aMinValue;
other.aMaxValue = aMaxValue;
other.aSpecialValues = aSpecialValues;
other.aPrecision = aPrecision;
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
boolean fl382;
EnumValue fl384;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SpecialValues")){
ctxt.skipWhiteSpace();
fl382 = true ; 
while (fl382) { // BeginLoop 
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
fl382 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl384 = null;
while(ctxt.lookAheadOpeningTag ("<EnumValue")) {
fl384 = acceptor.lAccept_EnumValue(ctxt, "</EnumValue>");
appendSpecialValues(fl384);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SpecialValues>");
} // If
} // If
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
boolean fl395;
boolean fl396;
boolean fl397;
boolean fl398;
boolean fl399;
boolean fl400;
boolean fl401;
boolean fl402;
boolean fl403;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl395 = false ; 
fl396 = false ; 
fl397 = false ; 
fl398 = false ; 
fl399 = false ; 
fl400 = false ; 
fl401 = false ; 
fl402 = false ; 
fl403 = true ; 
while (fl403) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 400;
} else {
indicator = 404;
} // If
break;
} // Case
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("recision=")){
indicator = 397;
} else {
indicator = 404;
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
indicator = 401;
} else {
indicator = 404;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 402;
} else {
indicator = 404;
} // If
break;
} // Case
default:
indicator = 404;
break;
} // Switch
break;
} // Case
case 'M':
{
ctxt.advance();
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
if (ctxt.lookAheadString("nValue=")){
indicator = 395;
} else {
indicator = 404;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAheadString("xValue=")){
indicator = 396;
} else {
indicator = 404;
} // If
break;
} // Case
default:
indicator = 404;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 399;
} else {
indicator = 404;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efault=")){
indicator = 398;
} else {
indicator = 404;
} // If
break;
} // Case
default:
indicator = 404;
break;
} // Switch
switch (indicator) {
case 395: {
// Handling attribute MinValue
// Also handles alien attributes with prefix MinValue
if (fl395){
ctxt.fail ("Duplicate attribute: MinValue");
} // If
fl395 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMinValue((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 396: {
// Handling attribute MaxValue
// Also handles alien attributes with prefix MaxValue
if (fl396){
ctxt.fail ("Duplicate attribute: MaxValue");
} // If
fl396 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMaxValue((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 397: {
// Handling attribute Precision
// Also handles alien attributes with prefix Precision
if (fl397){
ctxt.fail ("Duplicate attribute: Precision");
} // If
fl397 = true ; 
quoteChar = ctxt.acceptQuote();
this.setPrecision(acceptor.lAcceptEnum_PrecisionEnum(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 398: {
// Handling attribute Default
// Also handles alien attributes with prefix Default
if (fl398){
ctxt.fail ("Duplicate attribute: Default");
} // If
fl398 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefault((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 399: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl399){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl399 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 400: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl400){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl400 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 401: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl401){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl401 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 402: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl402){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl402 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 404: {
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
if (!fl395){
ctxt.fail ("Mandatory attribute missing: MinValue in Range");
} // If
if (!fl396){
ctxt.fail ("Mandatory attribute missing: MaxValue in Range");
} // If
if (!fl397){
this.setPrecision(acceptor.aIntegerPrecision);
} // If
if (!fl399){
this.setImplemented( false);
} // If
if (!fl400){
this.setVerified( false);
} // If
if (!fl401){
this.setNeedsRequirement( true);
} // If
fl403 = false ; 
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
  headingTag = "<Range";
  endingTag = "</Range>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Range\"");
} // If
pw.println();
pw.print(" MinValue=\"");
acceptor.unParsePcData(pw, this.getMinValue());
pw.print('"');
pw.println();
pw.print(" MaxValue=\"");
acceptor.unParsePcData(pw, this.getMaxValue());
pw.print('"');
pw.println();
if (this.getPrecision() != 0){
pw.print(" Precision=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_PrecisionEnum_ToString(this.getPrecision()));
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
// Unparsing Enclosed
// Testing for empty content: SpecialValues
if (countSpecialValues() > 0){
pw.print("<SpecialValues>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSpecialValues(), false, "<EnumValue", "</EnumValue>");
pw.print("</SpecialValues>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: SpecialValues
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
for (int i = 0; i < countSpecialValues(); i++) {
  l.add(getSpecialValues(i));
}
}

}

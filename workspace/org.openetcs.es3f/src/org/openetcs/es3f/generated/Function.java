
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Function</i></h3>
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
public class Function
extends org.openetcs.es3f.DataDictionary.Types.Type
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getTypeName().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private java.util.ArrayList  aParameters;

/** Part of the list interface for Parameters
  * @return a collection of all the elements in Parameters
  */
public java.util.ArrayList  allParameters()
  {
if (aParameters == null){
    setAllParameters( new java.util.ArrayList () );
} // If
    return aParameters;
  }

/** Part of the list interface for Parameters
  * @return a collection of all the elements in Parameters
  */
private java.util.ArrayList  getParameters()
  {
    return allParameters();
  }

/** Part of the list interface for Parameters
  * @param coll a collection of elements which replaces 
  *        Parameters's current content.
  */
public void setAllParameters(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aParameters = coll;
  }

/** Part of the list interface for Parameters
  * @param el a Parameter to add to the collection in 
  *           Parameters
  * @seealso #appendParameters(java.util.Collection )
  */
public void appendParameters(Parameter el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allParameters().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Parameters
  * @param coll a collection ofParameters to add to the collection in 
  *           Parameters
  * @seealso #appendParameters(Parameter)
  */
public void appendParameters(java.util.Collection  coll)
  {
  __setDirty(true);
  allParameters().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Parameters
  * This insertion function inserts a new element in the
  * collection in Parameters
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertParameters(int idx, Parameter el)
  {
  __setDirty(true);
  allParameters().add (idx, el);
  }

/** Part of the list interface for Parameters
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfParameters(xmlBBaseInter el)
  {
  return allParameters().indexOf (el);
  }

/** Part of the list interface for Parameters
  * This deletion function removes an element from the
  * collection in Parameters
  * @param idx the index of the element to remove
  */
public void deleteParameters(int idx)
  {
  __setDirty(true);
  allParameters().remove(idx);
  }

public void SortParameters()
  {
//-> hostname : Parameter
Collections.sort(allParameters(), new Comparator<Parameter>() {
public int compare( Parameter o1, Parameter o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Parameters
  * This deletion function removes an element from the
  * collection in Parameters
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeParameters(xmlBBaseInter obj)
  {
  int idx = indexOfParameters(obj);
  if (idx >= 0) { deleteParameters(idx);
   }
  }

/** Part of the list interface for Parameters
  * @return the number of elements in Parameters
  */
public int countParameters()
  {
  return allParameters().size();
  }

/** Part of the list interface for Parameters
  * This function returns an element from the
  * collection in Parameters based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Parameter getParameters(int idx)
{
  return (Parameter) ( allParameters().get(idx));
}

private java.util.ArrayList  aCases;

/** Part of the list interface for Cases
  * @return a collection of all the elements in Cases
  */
public java.util.ArrayList  allCases()
  {
if (aCases == null){
    setAllCases( new java.util.ArrayList () );
} // If
    return aCases;
  }

/** Part of the list interface for Cases
  * @return a collection of all the elements in Cases
  */
private java.util.ArrayList  getCases()
  {
    return allCases();
  }

/** Part of the list interface for Cases
  * @param coll a collection of elements which replaces 
  *        Cases's current content.
  */
public void setAllCases(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aCases = coll;
  }

/** Part of the list interface for Cases
  * @param el a Case to add to the collection in 
  *           Cases
  * @seealso #appendCases(java.util.Collection )
  */
public void appendCases(Case el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allCases().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Cases
  * @param coll a collection ofCases to add to the collection in 
  *           Cases
  * @seealso #appendCases(Case)
  */
public void appendCases(java.util.Collection  coll)
  {
  __setDirty(true);
  allCases().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Cases
  * This insertion function inserts a new element in the
  * collection in Cases
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertCases(int idx, Case el)
  {
  __setDirty(true);
  allCases().add (idx, el);
  }

/** Part of the list interface for Cases
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfCases(xmlBBaseInter el)
  {
  return allCases().indexOf (el);
  }

/** Part of the list interface for Cases
  * This deletion function removes an element from the
  * collection in Cases
  * @param idx the index of the element to remove
  */
public void deleteCases(int idx)
  {
  __setDirty(true);
  allCases().remove(idx);
  }

public void SortCases()
  {
//-> hostname : Case
Collections.sort(allCases(), new Comparator<Case>() {
public int compare( Case o1, Case o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Cases
  * This deletion function removes an element from the
  * collection in Cases
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeCases(xmlBBaseInter obj)
  {
  int idx = indexOfCases(obj);
  if (idx >= 0) { deleteCases(idx);
   }
  }

/** Part of the list interface for Cases
  * @return the number of elements in Cases
  */
public int countCases()
  {
  return allCases().size();
  }

/** Part of the list interface for Cases
  * This function returns an element from the
  * collection in Cases based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Case getCases(int idx)
{
  return (Case) ( allCases().get(idx));
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

public Function()
{
Function obj = this;
aParameters=(null);
aCases=(null);
aTypeName=(null);
}

public void copyTo(Function other)
{
super.copyTo(other);
other.aParameters = aParameters;
other.aCases = aCases;
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
boolean fl542;
Parameter fl544;
boolean fl555;
Case fl557;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Parameters")){
ctxt.skipWhiteSpace();
fl542 = true ; 
while (fl542) { // BeginLoop 
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
fl542 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl544 = null;
while(ctxt.lookAheadOpeningTag ("<Parameter")) {
fl544 = acceptor.lAccept_Parameter(ctxt, "</Parameter>");
appendParameters(fl544);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Parameters>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Enclosed
ctxt.acceptString ("<Cases");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
ctxt.skipWhiteSpace();
fl555 = true ; 
while (fl555) { // BeginLoop 
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
fl555 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl557 = null;
while(ctxt.lookAheadOpeningTag ("<Case")) {
fl557 = acceptor.lAccept_Case(ctxt, "</Case>");
appendCases(fl557);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Cases>");
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
boolean fl568;
boolean fl569;
boolean fl570;
boolean fl571;
boolean fl572;
boolean fl573;
boolean fl574;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl568 = false ; 
fl569 = false ; 
fl570 = false ; 
fl571 = false ; 
fl572 = false ; 
fl573 = false ; 
fl574 = true ; 
while (fl574) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 571;
} else {
indicator = 575;
} // If
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("ype=")){
indicator = 568;
} else {
indicator = 575;
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
indicator = 572;
} else {
indicator = 575;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 573;
} else {
indicator = 575;
} // If
break;
} // Case
default:
indicator = 575;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 570;
} else {
indicator = 575;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efault=")){
indicator = 569;
} else {
indicator = 575;
} // If
break;
} // Case
default:
indicator = 575;
break;
} // Switch
switch (indicator) {
case 568: {
// Handling attribute Type
// Also handles alien attributes with prefix Type
if (fl568){
ctxt.fail ("Duplicate attribute: Type");
} // If
fl568 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTypeName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 569: {
// Handling attribute Default
// Also handles alien attributes with prefix Default
if (fl569){
ctxt.fail ("Duplicate attribute: Default");
} // If
fl569 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefault((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 570: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl570){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl570 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 571: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl571){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl571 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 572: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl572){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl572 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 573: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl573){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl573 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 575: {
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
if (!fl570){
this.setImplemented( false);
} // If
if (!fl571){
this.setVerified( false);
} // If
if (!fl572){
this.setNeedsRequirement( true);
} // If
fl574 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString(endingTag);
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
  headingTag = "<Function";
  endingTag = "</Function>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Function\"");
} // If
pw.println();
if (this.getTypeName() != null){
pw.print(" Type=\"");
acceptor.unParsePcData(pw, this.getTypeName());
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
// Testing for empty content: Parameters
if (countParameters() > 0){
pw.print("<Parameters>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getParameters(), false, "<Parameter", "</Parameter>");
pw.print("</Parameters>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Parameters
// Unparsing Enclosed
pw.print("<Cases>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getCases(), false, "<Case", "</Case>");
pw.print("</Cases>");
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
 super.subElements(l);
for (int i = 0; i < countParameters(); i++) {
  l.add(getParameters(i));
}
for (int i = 0; i < countCases(); i++) {
  l.add(getCases(i));
}
}

}

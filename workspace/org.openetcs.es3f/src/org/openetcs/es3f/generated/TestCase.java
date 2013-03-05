
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>TestCase</i></h3>
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
public class TestCase
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  int aFeature;

public  int getFeature() { return aFeature;}

public  void setFeature(int v) {
  __setDirty ( __getDirty() || (getFeature() != v));
  aFeature = v;
}

private  int aCase;

public  int getCase() { return aCase;}

public  void setCase(int v) {
  __setDirty ( __getDirty() || (getCase() != v));
  aCase = v;
}

private java.util.ArrayList  aSteps;

/** Part of the list interface for Steps
  * @return a collection of all the elements in Steps
  */
public java.util.ArrayList  allSteps()
  {
if (aSteps == null){
    setAllSteps( new java.util.ArrayList () );
} // If
    return aSteps;
  }

/** Part of the list interface for Steps
  * @return a collection of all the elements in Steps
  */
private java.util.ArrayList  getSteps()
  {
    return allSteps();
  }

/** Part of the list interface for Steps
  * @param coll a collection of elements which replaces 
  *        Steps's current content.
  */
public void setAllSteps(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSteps = coll;
  }

/** Part of the list interface for Steps
  * @param el a Step to add to the collection in 
  *           Steps
  * @seealso #appendSteps(java.util.Collection )
  */
public void appendSteps(Step el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSteps().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Steps
  * @param coll a collection ofSteps to add to the collection in 
  *           Steps
  * @seealso #appendSteps(Step)
  */
public void appendSteps(java.util.Collection  coll)
  {
  __setDirty(true);
  allSteps().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Steps
  * This insertion function inserts a new element in the
  * collection in Steps
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSteps(int idx, Step el)
  {
  __setDirty(true);
  allSteps().add (idx, el);
  }

/** Part of the list interface for Steps
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSteps(xmlBBaseInter el)
  {
  return allSteps().indexOf (el);
  }

/** Part of the list interface for Steps
  * This deletion function removes an element from the
  * collection in Steps
  * @param idx the index of the element to remove
  */
public void deleteSteps(int idx)
  {
  __setDirty(true);
  allSteps().remove(idx);
  }

public void SortSteps()
  {
//-> hostname : Step
Collections.sort(allSteps(), new Comparator<Step>() {
public int compare( Step o1, Step o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Steps
  * This deletion function removes an element from the
  * collection in Steps
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSteps(xmlBBaseInter obj)
  {
  int idx = indexOfSteps(obj);
  if (idx >= 0) { deleteSteps(idx);
   }
  }

/** Part of the list interface for Steps
  * @return the number of elements in Steps
  */
public int countSteps()
  {
  return allSteps().size();
  }

/** Part of the list interface for Steps
  * This function returns an element from the
  * collection in Steps based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Step getSteps(int idx)
{
  return (Step) ( allSteps().get(idx));
}

public TestCase()
{
TestCase obj = this;
aFeature=(0);
aCase=(0);
aSteps=(null);
}

public void copyTo(TestCase other)
{
super.copyTo(other);
other.aFeature = aFeature;
other.aCase = aCase;
other.aSteps = aSteps;
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
boolean fl880;
Step fl882;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Steps")){
ctxt.skipWhiteSpace();
fl880 = true ; 
while (fl880) { // BeginLoop 
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
fl880 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl882 = null;
while(ctxt.lookAheadOpeningTag ("<Step")) {
fl882 = acceptor.lAccept_Step(ctxt, "</Step>");
appendSteps(fl882);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Steps>");
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
boolean fl893;
boolean fl894;
boolean fl895;
boolean fl896;
boolean fl897;
boolean fl898;
boolean fl899;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl893 = false ; 
fl894 = false ; 
fl895 = false ; 
fl896 = false ; 
fl897 = false ; 
fl898 = false ; 
fl899 = true ; 
while (fl899) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 896;
} else {
indicator = 900;
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
indicator = 897;
} else {
indicator = 900;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 898;
} else {
indicator = 900;
} // If
break;
} // Case
default:
indicator = 900;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 895;
} else {
indicator = 900;
} // If
break;
} // Case
case 'F':
{
ctxt.advance();
if (ctxt.lookAheadString("eature=")){
indicator = 893;
} else {
indicator = 900;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("ase=")){
indicator = 894;
} else {
indicator = 900;
} // If
break;
} // Case
default:
indicator = 900;
break;
} // Switch
switch (indicator) {
case 893: {
// Handling attribute Feature
// Also handles alien attributes with prefix Feature
if (fl893){
ctxt.fail ("Duplicate attribute: Feature");
} // If
fl893 = true ; 
quoteChar = ctxt.acceptQuote();
this.setFeature(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 894: {
// Handling attribute Case
// Also handles alien attributes with prefix Case
if (fl894){
ctxt.fail ("Duplicate attribute: Case");
} // If
fl894 = true ; 
quoteChar = ctxt.acceptQuote();
this.setCase(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 895: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl895){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl895 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 896: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl896){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl896 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 897: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl897){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl897 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 898: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl898){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl898 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 900: {
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
if (!fl893){
this.setFeature(9999);
} // If
if (!fl894){
this.setCase(9999);
} // If
if (!fl895){
this.setImplemented( false);
} // If
if (!fl896){
this.setVerified( false);
} // If
if (!fl897){
this.setNeedsRequirement( true);
} // If
fl899 = false ; 
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
  headingTag = "<TestCase";
  endingTag = "</TestCase>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"TestCase\"");
} // If
pw.println();
if (this.getFeature() != 9999){
pw.print(" Feature=\"");
acceptor.unParsePcData(pw, this.getFeature());
pw.print('"');
pw.println();
} // If
if (this.getCase() != 9999){
pw.print(" Case=\"");
acceptor.unParsePcData(pw, this.getCase());
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
// Testing for empty content: Steps
if (countSteps() > 0){
pw.print("<Steps>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSteps(), false, "<Step", "</Step>");
pw.print("</Steps>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Steps
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
for (int i = 0; i < countSteps(); i++) {
  l.add(getSteps(i));
}
}

}

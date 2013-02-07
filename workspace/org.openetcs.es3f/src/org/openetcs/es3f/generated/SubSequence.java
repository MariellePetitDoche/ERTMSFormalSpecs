
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>SubSequence</i></h3>
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
public class SubSequence
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getD_LRBG().compareToIgnoreCase((String) search) == 0)return true;
if(getLevel().compareToIgnoreCase((String) search) == 0)return true;
if(getMode().compareToIgnoreCase((String) search) == 0)return true;
if(getNID_LRBG().compareToIgnoreCase((String) search) == 0)return true;
if(getQ_DIRLRBG().compareToIgnoreCase((String) search) == 0)return true;
if(getQ_DIRTRAIN().compareToIgnoreCase((String) search) == 0)return true;
if(getQ_DLRBG().compareToIgnoreCase((String) search) == 0)return true;
if(getRBC_ID().compareToIgnoreCase((String) search) == 0)return true;
if(getRBCPhone().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aD_LRBG;

public   String  getD_LRBG() { return aD_LRBG;}

public  void setD_LRBG( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getD_LRBG())));
} else {
  __setDirty ( __getDirty() || (getD_LRBG() != null));
} // If
  aD_LRBG = v;
}

private   String  aLevel;

public   String  getLevel() { return aLevel;}

public  void setLevel( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getLevel())));
} else {
  __setDirty ( __getDirty() || (getLevel() != null));
} // If
  aLevel = v;
}

private   String  aMode;

public   String  getMode() { return aMode;}

public  void setMode( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getMode())));
} else {
  __setDirty ( __getDirty() || (getMode() != null));
} // If
  aMode = v;
}

private   String  aNID_LRBG;

public   String  getNID_LRBG() { return aNID_LRBG;}

public  void setNID_LRBG( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getNID_LRBG())));
} else {
  __setDirty ( __getDirty() || (getNID_LRBG() != null));
} // If
  aNID_LRBG = v;
}

private   String  aQ_DIRLRBG;

public   String  getQ_DIRLRBG() { return aQ_DIRLRBG;}

public  void setQ_DIRLRBG( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getQ_DIRLRBG())));
} else {
  __setDirty ( __getDirty() || (getQ_DIRLRBG() != null));
} // If
  aQ_DIRLRBG = v;
}

private   String  aQ_DIRTRAIN;

public   String  getQ_DIRTRAIN() { return aQ_DIRTRAIN;}

public  void setQ_DIRTRAIN( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getQ_DIRTRAIN())));
} else {
  __setDirty ( __getDirty() || (getQ_DIRTRAIN() != null));
} // If
  aQ_DIRTRAIN = v;
}

private   String  aQ_DLRBG;

public   String  getQ_DLRBG() { return aQ_DLRBG;}

public  void setQ_DLRBG( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getQ_DLRBG())));
} else {
  __setDirty ( __getDirty() || (getQ_DLRBG() != null));
} // If
  aQ_DLRBG = v;
}

private   String  aRBC_ID;

public   String  getRBC_ID() { return aRBC_ID;}

public  void setRBC_ID( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getRBC_ID())));
} else {
  __setDirty ( __getDirty() || (getRBC_ID() != null));
} // If
  aRBC_ID = v;
}

private   String  aRBCPhone;

public   String  getRBCPhone() { return aRBCPhone;}

public  void setRBCPhone( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getRBCPhone())));
} else {
  __setDirty ( __getDirty() || (getRBCPhone() != null));
} // If
  aRBCPhone = v;
}

private java.util.ArrayList  aTestCases;

/** Part of the list interface for TestCases
  * @return a collection of all the elements in TestCases
  */
public java.util.ArrayList  allTestCases()
  {
if (aTestCases == null){
    setAllTestCases( new java.util.ArrayList () );
} // If
    return aTestCases;
  }

/** Part of the list interface for TestCases
  * @return a collection of all the elements in TestCases
  */
private java.util.ArrayList  getTestCases()
  {
    return allTestCases();
  }

/** Part of the list interface for TestCases
  * @param coll a collection of elements which replaces 
  *        TestCases's current content.
  */
public void setAllTestCases(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aTestCases = coll;
  }

/** Part of the list interface for TestCases
  * @param el a TestCase to add to the collection in 
  *           TestCases
  * @seealso #appendTestCases(java.util.Collection )
  */
public void appendTestCases(TestCase el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allTestCases().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for TestCases
  * @param coll a collection ofTestCases to add to the collection in 
  *           TestCases
  * @seealso #appendTestCases(TestCase)
  */
public void appendTestCases(java.util.Collection  coll)
  {
  __setDirty(true);
  allTestCases().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for TestCases
  * This insertion function inserts a new element in the
  * collection in TestCases
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertTestCases(int idx, TestCase el)
  {
  __setDirty(true);
  allTestCases().add (idx, el);
  }

/** Part of the list interface for TestCases
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfTestCases(xmlBBaseInter el)
  {
  return allTestCases().indexOf (el);
  }

/** Part of the list interface for TestCases
  * This deletion function removes an element from the
  * collection in TestCases
  * @param idx the index of the element to remove
  */
public void deleteTestCases(int idx)
  {
  __setDirty(true);
  allTestCases().remove(idx);
  }

public void SortTestCases()
  {
//-> hostname : TestCase
Collections.sort(allTestCases(), new Comparator<TestCase>() {
public int compare( TestCase o1, TestCase o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for TestCases
  * This deletion function removes an element from the
  * collection in TestCases
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeTestCases(xmlBBaseInter obj)
  {
  int idx = indexOfTestCases(obj);
  if (idx >= 0) { deleteTestCases(idx);
   }
  }

/** Part of the list interface for TestCases
  * @return the number of elements in TestCases
  */
public int countTestCases()
  {
  return allTestCases().size();
  }

/** Part of the list interface for TestCases
  * This function returns an element from the
  * collection in TestCases based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public TestCase getTestCases(int idx)
{
  return (TestCase) ( allTestCases().get(idx));
}

public SubSequence()
{
SubSequence obj = this;
aD_LRBG=(null);
aLevel=(null);
aMode=(null);
aNID_LRBG=(null);
aQ_DIRLRBG=(null);
aQ_DIRTRAIN=(null);
aQ_DLRBG=(null);
aRBC_ID=(null);
aRBCPhone=(null);
aTestCases=(null);
}

public void copyTo(SubSequence other)
{
super.copyTo(other);
other.aD_LRBG = aD_LRBG;
other.aLevel = aLevel;
other.aMode = aMode;
other.aNID_LRBG = aNID_LRBG;
other.aQ_DIRLRBG = aQ_DIRLRBG;
other.aQ_DIRTRAIN = aQ_DIRTRAIN;
other.aQ_DLRBG = aQ_DLRBG;
other.aRBC_ID = aRBC_ID;
other.aRBCPhone = aRBCPhone;
other.aTestCases = aTestCases;
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
boolean fl840;
TestCase fl842;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<TestCases")){
ctxt.skipWhiteSpace();
fl840 = true ; 
while (fl840) { // BeginLoop 
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
fl840 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl842 = null;
while(ctxt.lookAheadOpeningTag ("<TestCase")) {
fl842 = acceptor.lAccept_TestCase(ctxt, "</TestCase>");
appendTestCases(fl842);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</TestCases>");
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
boolean fl853;
boolean fl854;
boolean fl855;
boolean fl856;
boolean fl857;
boolean fl858;
boolean fl859;
boolean fl860;
boolean fl861;
boolean fl862;
boolean fl863;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl853 = false ; 
fl854 = false ; 
fl855 = false ; 
fl856 = false ; 
fl857 = false ; 
fl858 = false ; 
fl859 = false ; 
fl860 = false ; 
fl861 = false ; 
fl862 = false ; 
fl863 = true ; 
while (fl863) { // BeginLoop 
switch (ctxt.current()) {
case 'R':
{
ctxt.advance();
if (ctxt.lookAhead2('B','C')){
switch (ctxt.current()) {
case '_':
{
ctxt.advance();
if (ctxt.lookAhead3('I','D','=')){
indicator = 860;
} else {
indicator = 864;
} // If
break;
} // Case
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("hone=")){
indicator = 861;
} else {
indicator = 864;
} // If
break;
} // Case
default:
indicator = 864;
break;
} // Switch
} else {
indicator = 864;
} // If
break;
} // Case
case 'Q':
{
ctxt.advance();
if (ctxt.lookAhead2('_','D')){
switch (ctxt.current()) {
case 'L':
{
ctxt.advance();
if (ctxt.lookAheadString("RBG=")){
indicator = 859;
} else {
indicator = 864;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead1('R')){
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("RAIN=")){
indicator = 858;
} else {
indicator = 864;
} // If
break;
} // Case
case 'L':
{
ctxt.advance();
if (ctxt.lookAheadString("RBG=")){
indicator = 857;
} else {
indicator = 864;
} // If
break;
} // Case
default:
indicator = 864;
break;
} // Switch
} else {
indicator = 864;
} // If
break;
} // Case
default:
indicator = 864;
break;
} // Switch
} else {
indicator = 864;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
switch (ctxt.current()) {
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 862;
} else {
indicator = 864;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("D_LRBG=")){
indicator = 856;
} else {
indicator = 864;
} // If
break;
} // Case
default:
indicator = 864;
break;
} // Switch
break;
} // Case
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("ode=")){
indicator = 855;
} else {
indicator = 864;
} // If
break;
} // Case
case 'L':
{
ctxt.advance();
if (ctxt.lookAheadString("evel=")){
indicator = 854;
} else {
indicator = 864;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("_LRBG=")){
indicator = 853;
} else {
indicator = 864;
} // If
break;
} // Case
default:
indicator = 864;
break;
} // Switch
switch (indicator) {
case 853: {
// Handling attribute D_LRBG
// Also handles alien attributes with prefix D_LRBG
if (fl853){
ctxt.fail ("Duplicate attribute: D_LRBG");
} // If
fl853 = true ; 
quoteChar = ctxt.acceptQuote();
this.setD_LRBG((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 854: {
// Handling attribute Level
// Also handles alien attributes with prefix Level
if (fl854){
ctxt.fail ("Duplicate attribute: Level");
} // If
fl854 = true ; 
quoteChar = ctxt.acceptQuote();
this.setLevel((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 855: {
// Handling attribute Mode
// Also handles alien attributes with prefix Mode
if (fl855){
ctxt.fail ("Duplicate attribute: Mode");
} // If
fl855 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMode((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 856: {
// Handling attribute NID_LRBG
// Also handles alien attributes with prefix NID_LRBG
if (fl856){
ctxt.fail ("Duplicate attribute: NID_LRBG");
} // If
fl856 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNID_LRBG((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 857: {
// Handling attribute Q_DIRLRBG
// Also handles alien attributes with prefix Q_DIRLRBG
if (fl857){
ctxt.fail ("Duplicate attribute: Q_DIRLRBG");
} // If
fl857 = true ; 
quoteChar = ctxt.acceptQuote();
this.setQ_DIRLRBG((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 858: {
// Handling attribute Q_DIRTRAIN
// Also handles alien attributes with prefix Q_DIRTRAIN
if (fl858){
ctxt.fail ("Duplicate attribute: Q_DIRTRAIN");
} // If
fl858 = true ; 
quoteChar = ctxt.acceptQuote();
this.setQ_DIRTRAIN((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 859: {
// Handling attribute Q_DLRBG
// Also handles alien attributes with prefix Q_DLRBG
if (fl859){
ctxt.fail ("Duplicate attribute: Q_DLRBG");
} // If
fl859 = true ; 
quoteChar = ctxt.acceptQuote();
this.setQ_DLRBG((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 860: {
// Handling attribute RBC_ID
// Also handles alien attributes with prefix RBC_ID
if (fl860){
ctxt.fail ("Duplicate attribute: RBC_ID");
} // If
fl860 = true ; 
quoteChar = ctxt.acceptQuote();
this.setRBC_ID((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 861: {
// Handling attribute RBCPhone
// Also handles alien attributes with prefix RBCPhone
if (fl861){
ctxt.fail ("Duplicate attribute: RBCPhone");
} // If
fl861 = true ; 
quoteChar = ctxt.acceptQuote();
this.setRBCPhone((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 862: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl862){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl862 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 864: {
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
if (!fl853){
this.setD_LRBG("");
} // If
if (!fl854){
this.setLevel("");
} // If
if (!fl855){
this.setMode("");
} // If
if (!fl856){
this.setNID_LRBG("");
} // If
if (!fl857){
this.setQ_DIRLRBG("");
} // If
if (!fl858){
this.setQ_DIRTRAIN("");
} // If
if (!fl859){
this.setQ_DLRBG("");
} // If
if (!fl860){
this.setRBC_ID("");
} // If
if (!fl861){
this.setRBCPhone("");
} // If
fl863 = false ; 
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
  headingTag = "<SubSequence";
  endingTag = "</SubSequence>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"SubSequence\"");
} // If
pw.println();
if (this.getD_LRBG() != null){
pw.print(" D_LRBG=\"");
acceptor.unParsePcData(pw, this.getD_LRBG());
pw.print('"');
pw.println();
} // If
if (this.getLevel() != null){
pw.print(" Level=\"");
acceptor.unParsePcData(pw, this.getLevel());
pw.print('"');
pw.println();
} // If
if (this.getMode() != null){
pw.print(" Mode=\"");
acceptor.unParsePcData(pw, this.getMode());
pw.print('"');
pw.println();
} // If
if (this.getNID_LRBG() != null){
pw.print(" NID_LRBG=\"");
acceptor.unParsePcData(pw, this.getNID_LRBG());
pw.print('"');
pw.println();
} // If
if (this.getQ_DIRLRBG() != null){
pw.print(" Q_DIRLRBG=\"");
acceptor.unParsePcData(pw, this.getQ_DIRLRBG());
pw.print('"');
pw.println();
} // If
if (this.getQ_DIRTRAIN() != null){
pw.print(" Q_DIRTRAIN=\"");
acceptor.unParsePcData(pw, this.getQ_DIRTRAIN());
pw.print('"');
pw.println();
} // If
if (this.getQ_DLRBG() != null){
pw.print(" Q_DLRBG=\"");
acceptor.unParsePcData(pw, this.getQ_DLRBG());
pw.print('"');
pw.println();
} // If
if (this.getRBC_ID() != null){
pw.print(" RBC_ID=\"");
acceptor.unParsePcData(pw, this.getRBC_ID());
pw.print('"');
pw.println();
} // If
if (this.getRBCPhone() != null){
pw.print(" RBCPhone=\"");
acceptor.unParsePcData(pw, this.getRBCPhone());
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
// Testing for empty content: TestCases
if (countTestCases() > 0){
pw.print("<TestCases>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getTestCases(), false, "<TestCase", "</TestCase>");
pw.print("</TestCases>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: TestCases
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
for (int i = 0; i < countTestCases(); i++) {
  l.add(getTestCases(i));
}
}

}

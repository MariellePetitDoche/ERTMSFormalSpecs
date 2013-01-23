
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Case</i></h3>
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
public class Case
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getExpression().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private java.util.ArrayList  aPreConditions;

/** Part of the list interface for PreConditions
  * @return a collection of all the elements in PreConditions
  */
public java.util.ArrayList  allPreConditions()
  {
if (aPreConditions == null){
    setAllPreConditions( new java.util.ArrayList () );
} // If
    return aPreConditions;
  }

/** Part of the list interface for PreConditions
  * @return a collection of all the elements in PreConditions
  */
private java.util.ArrayList  getPreConditions()
  {
    return allPreConditions();
  }

/** Part of the list interface for PreConditions
  * @param coll a collection of elements which replaces 
  *        PreConditions's current content.
  */
public void setAllPreConditions(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aPreConditions = coll;
  }

/** Part of the list interface for PreConditions
  * @param el a PreCondition to add to the collection in 
  *           PreConditions
  * @seealso #appendPreConditions(java.util.Collection )
  */
public void appendPreConditions(PreCondition el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allPreConditions().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for PreConditions
  * @param coll a collection ofPreConditions to add to the collection in 
  *           PreConditions
  * @seealso #appendPreConditions(PreCondition)
  */
public void appendPreConditions(java.util.Collection  coll)
  {
  __setDirty(true);
  allPreConditions().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for PreConditions
  * This insertion function inserts a new element in the
  * collection in PreConditions
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertPreConditions(int idx, PreCondition el)
  {
  __setDirty(true);
  allPreConditions().add (idx, el);
  }

/** Part of the list interface for PreConditions
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfPreConditions(xmlBBaseInter el)
  {
  return allPreConditions().indexOf (el);
  }

/** Part of the list interface for PreConditions
  * This deletion function removes an element from the
  * collection in PreConditions
  * @param idx the index of the element to remove
  */
public void deletePreConditions(int idx)
  {
  __setDirty(true);
  allPreConditions().remove(idx);
  }

public void SortPreConditions()
  {
//-> hostname : PreCondition
}
/** Part of the list interface for PreConditions
  * This deletion function removes an element from the
  * collection in PreConditions
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removePreConditions(xmlBBaseInter obj)
  {
  int idx = indexOfPreConditions(obj);
  if (idx >= 0) { deletePreConditions(idx);
   }
  }

/** Part of the list interface for PreConditions
  * @return the number of elements in PreConditions
  */
public int countPreConditions()
  {
  return allPreConditions().size();
  }

/** Part of the list interface for PreConditions
  * This function returns an element from the
  * collection in PreConditions based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public PreCondition getPreConditions(int idx)
{
  return (PreCondition) ( allPreConditions().get(idx));
}

private   String  aExpression;

public   String  getExpression() { return aExpression;}

public  void setExpression( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getExpression())));
} else {
  __setDirty ( __getDirty() || (getExpression() != null));
} // If
  aExpression = v;
}

public Case()
{
Case obj = this;
aPreConditions=(null);
aExpression=(null);
}

public void copyTo(Case other)
{
super.copyTo(other);
other.aPreConditions = aPreConditions;
other.aExpression = aExpression;
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
boolean fl591;
PreCondition fl593;
boolean fl604;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<PreConditions")){
ctxt.skipWhiteSpace();
fl591 = true ; 
while (fl591) { // BeginLoop 
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
fl591 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl593 = null;
while(ctxt.lookAheadOpeningTag ("<PreCondition")) {
fl593 = acceptor.lAccept_PreCondition(ctxt, null);
appendPreConditions(fl593);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</PreConditions>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Enclosed
ctxt.acceptString ("<Expression");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
ctxt.skipWhiteSpace();
fl604 = true ; 
while (fl604) { // BeginLoop 
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
fl604 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setExpression(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Expression>");
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
boolean fl605;
boolean fl606;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl605 = false ; 
fl606 = true ; 
while (fl606) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 605;
} else {
indicator = 607;
} // If
switch (indicator) {
case 605: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl605){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl605 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 607: {
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
fl606 = false ; 
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
  headingTag = "<Case";
  endingTag = "</Case>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Case\"");
} // If
pw.println();
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
// Testing for empty content: PreConditions
if (countPreConditions() > 0){
pw.print("<PreConditions>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getPreConditions(), false, null, null);
pw.print("</PreConditions>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: PreConditions
// Unparsing Enclosed
pw.print("<Expression>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getExpression());
pw.print("</Expression>");
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
for (int i = 0; i < countPreConditions(); i++) {
  l.add(getPreConditions(i));
}
}

}

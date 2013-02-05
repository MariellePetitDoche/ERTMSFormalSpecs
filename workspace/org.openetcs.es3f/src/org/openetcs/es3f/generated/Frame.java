
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Frame</i></h3>
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
public class Frame
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private java.util.ArrayList  aSubSequences;

/** Part of the list interface for SubSequences
  * @return a collection of all the elements in SubSequences
  */
public java.util.ArrayList  allSubSequences()
  {
if (aSubSequences == null){
    setAllSubSequences( new java.util.ArrayList () );
} // If
    return aSubSequences;
  }

/** Part of the list interface for SubSequences
  * @return a collection of all the elements in SubSequences
  */
private java.util.ArrayList  getSubSequences()
  {
    return allSubSequences();
  }

/** Part of the list interface for SubSequences
  * @param coll a collection of elements which replaces 
  *        SubSequences's current content.
  */
public void setAllSubSequences(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSubSequences = coll;
  }

/** Part of the list interface for SubSequences
  * @param el a SubSequence to add to the collection in 
  *           SubSequences
  * @seealso #appendSubSequences(java.util.Collection )
  */
public void appendSubSequences(SubSequence el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSubSequences().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for SubSequences
  * @param coll a collection ofSubSequences to add to the collection in 
  *           SubSequences
  * @seealso #appendSubSequences(SubSequence)
  */
public void appendSubSequences(java.util.Collection  coll)
  {
  __setDirty(true);
  allSubSequences().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for SubSequences
  * This insertion function inserts a new element in the
  * collection in SubSequences
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSubSequences(int idx, SubSequence el)
  {
  __setDirty(true);
  allSubSequences().add (idx, el);
  }

/** Part of the list interface for SubSequences
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSubSequences(xmlBBaseInter el)
  {
  return allSubSequences().indexOf (el);
  }

/** Part of the list interface for SubSequences
  * This deletion function removes an element from the
  * collection in SubSequences
  * @param idx the index of the element to remove
  */
public void deleteSubSequences(int idx)
  {
  __setDirty(true);
  allSubSequences().remove(idx);
  }

public void SortSubSequences()
  {
//-> hostname : SubSequence
Collections.sort(allSubSequences(), new Comparator<SubSequence>() {
public int compare( SubSequence o1, SubSequence o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for SubSequences
  * This deletion function removes an element from the
  * collection in SubSequences
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSubSequences(xmlBBaseInter obj)
  {
  int idx = indexOfSubSequences(obj);
  if (idx >= 0) { deleteSubSequences(idx);
   }
  }

/** Part of the list interface for SubSequences
  * @return the number of elements in SubSequences
  */
public int countSubSequences()
  {
  return allSubSequences().size();
  }

/** Part of the list interface for SubSequences
  * This function returns an element from the
  * collection in SubSequences based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public SubSequence getSubSequences(int idx)
{
  return (SubSequence) ( allSubSequences().get(idx));
}

public Frame()
{
Frame obj = this;
aSubSequences=(null);
}

public void copyTo(Frame other)
{
super.copyTo(other);
other.aSubSequences = aSubSequences;
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
boolean fl823;
SubSequence fl825;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SubSequences")){
ctxt.skipWhiteSpace();
fl823 = true ; 
while (fl823) { // BeginLoop 
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
fl823 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl825 = null;
while(ctxt.lookAheadOpeningTag ("<SubSequence")) {
fl825 = acceptor.lAccept_SubSequence(ctxt, "</SubSequence>");
appendSubSequences(fl825);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SubSequences>");
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
boolean fl836;
boolean fl837;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl836 = false ; 
fl837 = true ; 
while (fl837) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 836;
} else {
indicator = 838;
} // If
switch (indicator) {
case 836: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl836){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl836 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 838: {
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
fl837 = false ; 
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
  headingTag = "<Frame";
  endingTag = "</Frame>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Frame\"");
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
// Testing for empty content: SubSequences
if (countSubSequences() > 0){
pw.print("<SubSequences>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSubSequences(), false, "<SubSequence", "</SubSequence>");
pw.print("</SubSequences>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: SubSequences
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
for (int i = 0; i < countSubSequences(); i++) {
  l.add(getSubSequences(i));
}
}

}

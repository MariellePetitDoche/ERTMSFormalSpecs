
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>SubStep</i></h3>
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
public class SubStep
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private java.util.ArrayList  aActions;

/** Part of the list interface for Actions
  * @return a collection of all the elements in Actions
  */
public java.util.ArrayList  allActions()
  {
if (aActions == null){
    setAllActions( new java.util.ArrayList () );
} // If
    return aActions;
  }

/** Part of the list interface for Actions
  * @return a collection of all the elements in Actions
  */
private java.util.ArrayList  getActions()
  {
    return allActions();
  }

/** Part of the list interface for Actions
  * @param coll a collection of elements which replaces 
  *        Actions's current content.
  */
public void setAllActions(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aActions = coll;
  }

/** Part of the list interface for Actions
  * @param el a Action to add to the collection in 
  *           Actions
  * @seealso #appendActions(java.util.Collection )
  */
public void appendActions(Action el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allActions().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Actions
  * @param coll a collection ofActions to add to the collection in 
  *           Actions
  * @seealso #appendActions(Action)
  */
public void appendActions(java.util.Collection  coll)
  {
  __setDirty(true);
  allActions().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Actions
  * This insertion function inserts a new element in the
  * collection in Actions
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertActions(int idx, Action el)
  {
  __setDirty(true);
  allActions().add (idx, el);
  }

/** Part of the list interface for Actions
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfActions(xmlBBaseInter el)
  {
  return allActions().indexOf (el);
  }

/** Part of the list interface for Actions
  * This deletion function removes an element from the
  * collection in Actions
  * @param idx the index of the element to remove
  */
public void deleteActions(int idx)
  {
  __setDirty(true);
  allActions().remove(idx);
  }

public void SortActions()
  {
//-> hostname : Action
}
/** Part of the list interface for Actions
  * This deletion function removes an element from the
  * collection in Actions
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeActions(xmlBBaseInter obj)
  {
  int idx = indexOfActions(obj);
  if (idx >= 0) { deleteActions(idx);
   }
  }

/** Part of the list interface for Actions
  * @return the number of elements in Actions
  */
public int countActions()
  {
  return allActions().size();
  }

/** Part of the list interface for Actions
  * This function returns an element from the
  * collection in Actions based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Action getActions(int idx)
{
  return (Action) ( allActions().get(idx));
}

private java.util.ArrayList  aExpectations;

/** Part of the list interface for Expectations
  * @return a collection of all the elements in Expectations
  */
public java.util.ArrayList  allExpectations()
  {
if (aExpectations == null){
    setAllExpectations( new java.util.ArrayList () );
} // If
    return aExpectations;
  }

/** Part of the list interface for Expectations
  * @return a collection of all the elements in Expectations
  */
private java.util.ArrayList  getExpectations()
  {
    return allExpectations();
  }

/** Part of the list interface for Expectations
  * @param coll a collection of elements which replaces 
  *        Expectations's current content.
  */
public void setAllExpectations(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aExpectations = coll;
  }

/** Part of the list interface for Expectations
  * @param el a Expectation to add to the collection in 
  *           Expectations
  * @seealso #appendExpectations(java.util.Collection )
  */
public void appendExpectations(Expectation el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allExpectations().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Expectations
  * @param coll a collection ofExpectations to add to the collection in 
  *           Expectations
  * @seealso #appendExpectations(Expectation)
  */
public void appendExpectations(java.util.Collection  coll)
  {
  __setDirty(true);
  allExpectations().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Expectations
  * This insertion function inserts a new element in the
  * collection in Expectations
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertExpectations(int idx, Expectation el)
  {
  __setDirty(true);
  allExpectations().add (idx, el);
  }

/** Part of the list interface for Expectations
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfExpectations(xmlBBaseInter el)
  {
  return allExpectations().indexOf (el);
  }

/** Part of the list interface for Expectations
  * This deletion function removes an element from the
  * collection in Expectations
  * @param idx the index of the element to remove
  */
public void deleteExpectations(int idx)
  {
  __setDirty(true);
  allExpectations().remove(idx);
  }

public void SortExpectations()
  {
//-> hostname : Expectation
Collections.sort(allExpectations(), new Comparator<Expectation>() {
public int compare( Expectation o1, Expectation o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Expectations
  * This deletion function removes an element from the
  * collection in Expectations
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeExpectations(xmlBBaseInter obj)
  {
  int idx = indexOfExpectations(obj);
  if (idx >= 0) { deleteExpectations(idx);
   }
  }

/** Part of the list interface for Expectations
  * @return the number of elements in Expectations
  */
public int countExpectations()
  {
  return allExpectations().size();
  }

/** Part of the list interface for Expectations
  * This function returns an element from the
  * collection in Expectations based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Expectation getExpectations(int idx)
{
  return (Expectation) ( allExpectations().get(idx));
}

private  boolean aSkipEngine;

public  boolean getSkipEngine() { return aSkipEngine;}

public  void setSkipEngine(boolean v) {
  __setDirty ( __getDirty() || (getSkipEngine() != v));
  aSkipEngine = v;
}

public SubStep()
{
SubStep obj = this;
aActions=(null);
aExpectations=(null);
aSkipEngine=(false);
}

public void copyTo(SubStep other)
{
super.copyTo(other);
other.aActions = aActions;
other.aExpectations = aExpectations;
other.aSkipEngine = aSkipEngine;
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
boolean fl965;
Action fl967;
boolean fl978;
Expectation fl980;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Actions")){
ctxt.skipWhiteSpace();
fl965 = true ; 
while (fl965) { // BeginLoop 
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
fl965 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl967 = null;
while(ctxt.lookAheadOpeningTag ("<Action")) {
fl967 = acceptor.lAccept_Action(ctxt, null);
appendActions(fl967);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Actions>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Expectations")){
ctxt.skipWhiteSpace();
fl978 = true ; 
while (fl978) { // BeginLoop 
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
fl978 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl980 = null;
while(ctxt.lookAheadOpeningTag ("<Expectation")) {
fl980 = acceptor.lAccept_Expectation(ctxt, "</Expectation>");
appendExpectations(fl980);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Expectations>");
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
boolean fl991;
boolean fl992;
boolean fl993;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl991 = false ; 
fl992 = false ; 
fl993 = true ; 
while (fl993) { // BeginLoop 
switch (ctxt.current()) {
case 'S':
{
ctxt.advance();
if (ctxt.lookAheadString("kipEngine=")){
indicator = 991;
} else {
indicator = 994;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 992;
} else {
indicator = 994;
} // If
break;
} // Case
default:
indicator = 994;
break;
} // Switch
switch (indicator) {
case 991: {
// Handling attribute SkipEngine
// Also handles alien attributes with prefix SkipEngine
if (fl991){
ctxt.fail ("Duplicate attribute: SkipEngine");
} // If
fl991 = true ; 
quoteChar = ctxt.acceptQuote();
this.setSkipEngine(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 992: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl992){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl992 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 994: {
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
if (!fl991){
this.setSkipEngine( false);
} // If
fl993 = false ; 
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
  headingTag = "<SubStep";
  endingTag = "</SubStep>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"SubStep\"");
} // If
pw.println();
if (this.getSkipEngine()){
pw.print(" SkipEngine=\"");
acceptor.unParsePcData(pw, this.getSkipEngine());
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
// Testing for empty content: Actions
if (countActions() > 0){
pw.print("<Actions>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getActions(), false, null, null);
pw.print("</Actions>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Actions
// Unparsing Enclosed
// Testing for empty content: Expectations
if (countExpectations() > 0){
pw.print("<Expectations>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getExpectations(), false, "<Expectation", "</Expectation>");
pw.print("</Expectations>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Expectations
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
for (int i = 0; i < countActions(); i++) {
  l.add(getActions(i));
}
for (int i = 0; i < countExpectations(); i++) {
  l.add(getExpectations(i));
}
}

}

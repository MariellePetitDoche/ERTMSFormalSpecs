
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>StateMachine</i></h3>
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
public class StateMachine
extends org.openetcs.es3f.DataDictionary.Types.Type
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getInitialState().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aInitialState;

public   String  getInitialState() { return aInitialState;}

public  void setInitialState( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getInitialState())));
} else {
  __setDirty ( __getDirty() || (getInitialState() != null));
} // If
  aInitialState = v;
}

private java.util.ArrayList  aStates;

/** Part of the list interface for States
  * @return a collection of all the elements in States
  */
public java.util.ArrayList  allStates()
  {
if (aStates == null){
    setAllStates( new java.util.ArrayList () );
} // If
    return aStates;
  }

/** Part of the list interface for States
  * @return a collection of all the elements in States
  */
private java.util.ArrayList  getStates()
  {
    return allStates();
  }

/** Part of the list interface for States
  * @param coll a collection of elements which replaces 
  *        States's current content.
  */
public void setAllStates(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aStates = coll;
  }

/** Part of the list interface for States
  * @param el a State to add to the collection in 
  *           States
  * @seealso #appendStates(java.util.Collection )
  */
public void appendStates(State el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allStates().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for States
  * @param coll a collection ofStates to add to the collection in 
  *           States
  * @seealso #appendStates(State)
  */
public void appendStates(java.util.Collection  coll)
  {
  __setDirty(true);
  allStates().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for States
  * This insertion function inserts a new element in the
  * collection in States
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertStates(int idx, State el)
  {
  __setDirty(true);
  allStates().add (idx, el);
  }

/** Part of the list interface for States
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfStates(xmlBBaseInter el)
  {
  return allStates().indexOf (el);
  }

/** Part of the list interface for States
  * This deletion function removes an element from the
  * collection in States
  * @param idx the index of the element to remove
  */
public void deleteStates(int idx)
  {
  __setDirty(true);
  allStates().remove(idx);
  }

public void SortStates()
  {
//-> hostname : State
Collections.sort(allStates(), new Comparator<State>() {
public int compare( State o1, State o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for States
  * This deletion function removes an element from the
  * collection in States
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeStates(xmlBBaseInter obj)
  {
  int idx = indexOfStates(obj);
  if (idx >= 0) { deleteStates(idx);
   }
  }

/** Part of the list interface for States
  * @return the number of elements in States
  */
public int countStates()
  {
  return allStates().size();
  }

/** Part of the list interface for States
  * This function returns an element from the
  * collection in States based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public State getStates(int idx)
{
  return (State) ( allStates().get(idx));
}

private java.util.ArrayList  aRules;

/** Part of the list interface for Rules
  * @return a collection of all the elements in Rules
  */
public java.util.ArrayList  allRules()
  {
if (aRules == null){
    setAllRules( new java.util.ArrayList () );
} // If
    return aRules;
  }

/** Part of the list interface for Rules
  * @return a collection of all the elements in Rules
  */
private java.util.ArrayList  getRules()
  {
    return allRules();
  }

/** Part of the list interface for Rules
  * @param coll a collection of elements which replaces 
  *        Rules's current content.
  */
public void setAllRules(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aRules = coll;
  }

/** Part of the list interface for Rules
  * @param el a Rule to add to the collection in 
  *           Rules
  * @seealso #appendRules(java.util.Collection )
  */
public void appendRules(Rule el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allRules().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Rules
  * @param coll a collection ofRules to add to the collection in 
  *           Rules
  * @seealso #appendRules(Rule)
  */
public void appendRules(java.util.Collection  coll)
  {
  __setDirty(true);
  allRules().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Rules
  * This insertion function inserts a new element in the
  * collection in Rules
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertRules(int idx, Rule el)
  {
  __setDirty(true);
  allRules().add (idx, el);
  }

/** Part of the list interface for Rules
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfRules(xmlBBaseInter el)
  {
  return allRules().indexOf (el);
  }

/** Part of the list interface for Rules
  * This deletion function removes an element from the
  * collection in Rules
  * @param idx the index of the element to remove
  */
public void deleteRules(int idx)
  {
  __setDirty(true);
  allRules().remove(idx);
  }

public void SortRules()
  {
//-> hostname : Rule
Collections.sort(allRules(), new Comparator<Rule>() {
public int compare( Rule o1, Rule o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Rules
  * This deletion function removes an element from the
  * collection in Rules
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeRules(xmlBBaseInter obj)
  {
  int idx = indexOfRules(obj);
  if (idx >= 0) { deleteRules(idx);
   }
  }

/** Part of the list interface for Rules
  * @return the number of elements in Rules
  */
public int countRules()
  {
  return allRules().size();
  }

/** Part of the list interface for Rules
  * This function returns an element from the
  * collection in Rules based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Rule getRules(int idx)
{
  return (Rule) ( allRules().get(idx));
}

public StateMachine()
{
StateMachine obj = this;
aInitialState=(null);
aStates=(null);
aRules=(null);
}

public void copyTo(StateMachine other)
{
super.copyTo(other);
other.aInitialState = aInitialState;
other.aStates = aStates;
other.aRules = aRules;
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
boolean fl647;
State fl649;
boolean fl660;
Rule fl662;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<States")){
ctxt.skipWhiteSpace();
fl647 = true ; 
while (fl647) { // BeginLoop 
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
fl647 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl649 = null;
while(ctxt.lookAheadOpeningTag ("<State")) {
fl649 = acceptor.lAccept_State(ctxt, "</State>");
appendStates(fl649);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</States>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Rules")){
ctxt.skipWhiteSpace();
fl660 = true ; 
while (fl660) { // BeginLoop 
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
fl660 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl662 = null;
while(ctxt.lookAheadOpeningTag ("<Rule")) {
fl662 = acceptor.lAccept_Rule(ctxt, "</Rule>");
appendRules(fl662);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Rules>");
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
boolean fl673;
boolean fl674;
boolean fl675;
boolean fl676;
boolean fl677;
boolean fl678;
boolean fl679;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl673 = false ; 
fl674 = false ; 
fl675 = false ; 
fl676 = false ; 
fl677 = false ; 
fl678 = false ; 
fl679 = true ; 
while (fl679) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 676;
} else {
indicator = 680;
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
indicator = 677;
} else {
indicator = 680;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 678;
} else {
indicator = 680;
} // If
break;
} // Case
default:
indicator = 680;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
switch (ctxt.current()) {
case 'n':
{
ctxt.advance();
if (ctxt.lookAheadString("itialState=")){
indicator = 673;
} else {
indicator = 680;
} // If
break;
} // Case
case 'm':
{
ctxt.advance();
if (ctxt.lookAheadString("plemented=")){
indicator = 675;
} else {
indicator = 680;
} // If
break;
} // Case
default:
indicator = 680;
break;
} // Switch
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efault=")){
indicator = 674;
} else {
indicator = 680;
} // If
break;
} // Case
default:
indicator = 680;
break;
} // Switch
switch (indicator) {
case 673: {
// Handling attribute InitialState
// Also handles alien attributes with prefix InitialState
if (fl673){
ctxt.fail ("Duplicate attribute: InitialState");
} // If
fl673 = true ; 
quoteChar = ctxt.acceptQuote();
this.setInitialState((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 674: {
// Handling attribute Default
// Also handles alien attributes with prefix Default
if (fl674){
ctxt.fail ("Duplicate attribute: Default");
} // If
fl674 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefault((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 675: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl675){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl675 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 676: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl676){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl676 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 677: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl677){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl677 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 678: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl678){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl678 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 680: {
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
if (!fl673){
ctxt.fail ("Mandatory attribute missing: InitialState in StateMachine");
} // If
if (!fl675){
this.setImplemented( false);
} // If
if (!fl676){
this.setVerified( false);
} // If
if (!fl677){
this.setNeedsRequirement( true);
} // If
fl679 = false ; 
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
  headingTag = "<StateMachine";
  endingTag = "</StateMachine>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"StateMachine\"");
} // If
pw.println();
pw.print(" InitialState=\"");
acceptor.unParsePcData(pw, this.getInitialState());
pw.print('"');
pw.println();
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
// Testing for empty content: States
if (countStates() > 0){
pw.print("<States>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getStates(), false, "<State", "</State>");
pw.print("</States>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: States
// Unparsing Enclosed
// Testing for empty content: Rules
if (countRules() > 0){
pw.print("<Rules>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getRules(), false, "<Rule", "</Rule>");
pw.print("</Rules>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Rules
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
for (int i = 0; i < countStates(); i++) {
  l.add(getStates(i));
}
for (int i = 0; i < countRules(); i++) {
  l.add(getRules(i));
}
}

}

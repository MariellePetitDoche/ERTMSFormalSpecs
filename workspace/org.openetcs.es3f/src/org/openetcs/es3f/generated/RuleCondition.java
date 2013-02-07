
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>RuleCondition</i></h3>
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
public class RuleCondition
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
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

private java.util.ArrayList  aSubRules;

/** Part of the list interface for SubRules
  * @return a collection of all the elements in SubRules
  */
public java.util.ArrayList  allSubRules()
  {
if (aSubRules == null){
    setAllSubRules( new java.util.ArrayList () );
} // If
    return aSubRules;
  }

/** Part of the list interface for SubRules
  * @return a collection of all the elements in SubRules
  */
private java.util.ArrayList  getSubRules()
  {
    return allSubRules();
  }

/** Part of the list interface for SubRules
  * @param coll a collection of elements which replaces 
  *        SubRules's current content.
  */
public void setAllSubRules(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSubRules = coll;
  }

/** Part of the list interface for SubRules
  * @param el a Rule to add to the collection in 
  *           SubRules
  * @seealso #appendSubRules(java.util.Collection )
  */
public void appendSubRules(Rule el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSubRules().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for SubRules
  * @param coll a collection ofRules to add to the collection in 
  *           SubRules
  * @seealso #appendSubRules(Rule)
  */
public void appendSubRules(java.util.Collection  coll)
  {
  __setDirty(true);
  allSubRules().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for SubRules
  * This insertion function inserts a new element in the
  * collection in SubRules
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSubRules(int idx, Rule el)
  {
  __setDirty(true);
  allSubRules().add (idx, el);
  }

/** Part of the list interface for SubRules
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSubRules(xmlBBaseInter el)
  {
  return allSubRules().indexOf (el);
  }

/** Part of the list interface for SubRules
  * This deletion function removes an element from the
  * collection in SubRules
  * @param idx the index of the element to remove
  */
public void deleteSubRules(int idx)
  {
  __setDirty(true);
  allSubRules().remove(idx);
  }

public void SortSubRules()
  {
//-> hostname : Rule
Collections.sort(allSubRules(), new Comparator<Rule>() {
public int compare( Rule o1, Rule o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for SubRules
  * This deletion function removes an element from the
  * collection in SubRules
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSubRules(xmlBBaseInter obj)
  {
  int idx = indexOfSubRules(obj);
  if (idx >= 0) { deleteSubRules(idx);
   }
  }

/** Part of the list interface for SubRules
  * @return the number of elements in SubRules
  */
public int countSubRules()
  {
  return allSubRules().size();
  }

/** Part of the list interface for SubRules
  * This function returns an element from the
  * collection in SubRules based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Rule getSubRules(int idx)
{
  return (Rule) ( allSubRules().get(idx));
}

public RuleCondition()
{
RuleCondition obj = this;
aPreConditions=(null);
aActions=(null);
aSubRules=(null);
}

public void copyTo(RuleCondition other)
{
super.copyTo(other);
other.aPreConditions = aPreConditions;
other.aActions = aActions;
other.aSubRules = aSubRules;
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
boolean fl770;
PreCondition fl772;
boolean fl783;
Action fl785;
boolean fl796;
Rule fl798;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<PreConditions")){
ctxt.skipWhiteSpace();
fl770 = true ; 
while (fl770) { // BeginLoop 
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
fl770 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl772 = null;
while(ctxt.lookAheadOpeningTag ("<PreCondition")) {
fl772 = acceptor.lAccept_PreCondition(ctxt, null);
appendPreConditions(fl772);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</PreConditions>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Actions")){
ctxt.skipWhiteSpace();
fl783 = true ; 
while (fl783) { // BeginLoop 
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
fl783 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl785 = null;
while(ctxt.lookAheadOpeningTag ("<Action")) {
fl785 = acceptor.lAccept_Action(ctxt, null);
appendActions(fl785);
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
if (ctxt.lookAheadOpeningTag("<SubRules")){
ctxt.skipWhiteSpace();
fl796 = true ; 
while (fl796) { // BeginLoop 
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
fl796 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl798 = null;
while(ctxt.lookAheadOpeningTag ("<Rule")) {
fl798 = acceptor.lAccept_Rule(ctxt, "</Rule>");
appendSubRules(fl798);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SubRules>");
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
boolean fl809;
boolean fl810;
boolean fl811;
boolean fl812;
boolean fl813;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl809 = false ; 
fl810 = false ; 
fl811 = false ; 
fl812 = false ; 
fl813 = true ; 
while (fl813) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 810;
} else {
indicator = 814;
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
indicator = 811;
} else {
indicator = 814;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 812;
} else {
indicator = 814;
} // If
break;
} // Case
default:
indicator = 814;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 809;
} else {
indicator = 814;
} // If
break;
} // Case
default:
indicator = 814;
break;
} // Switch
switch (indicator) {
case 809: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl809){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl809 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 810: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl810){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl810 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 811: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl811){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl811 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 812: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl812){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl812 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 814: {
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
if (!fl809){
this.setImplemented( false);
} // If
if (!fl810){
this.setVerified( false);
} // If
if (!fl811){
this.setNeedsRequirement( true);
} // If
fl813 = false ; 
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
  headingTag = "<RuleCondition";
  endingTag = "</RuleCondition>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"RuleCondition\"");
} // If
pw.println();
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
pw.print("<PreConditions>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getPreConditions(), false, null, null);
pw.print("</PreConditions>");
// Father is not a mixed
pw.println();
// Unparsing Enclosed
pw.print("<Actions>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getActions(), false, null, null);
pw.print("</Actions>");
// Father is not a mixed
pw.println();
// Unparsing Enclosed
// Testing for empty content: SubRules
if (countSubRules() > 0){
pw.print("<SubRules>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSubRules(), false, "<Rule", "</Rule>");
pw.print("</SubRules>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: SubRules
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
for (int i = 0; i < countActions(); i++) {
  l.add(getActions(i));
}
for (int i = 0; i < countSubRules(); i++) {
  l.add(getSubRules(i));
}
}

}

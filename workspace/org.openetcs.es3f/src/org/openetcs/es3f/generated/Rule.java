
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Rule</i></h3>
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
public class Rule
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  int aPriority;

public  int getPriority() { return aPriority;}

public  void setPriority(int v) {
  __setDirty ( __getDirty() || (getPriority() != v));
  aPriority = v;
}

public  String   getPriority_AsString()
{
  return acceptor.Enum_RulePriority_ToString (aPriority);
}

public  boolean setPriority_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_RulePriority(v);
if (temp >= 0){
aPriority = temp;
return true;
} // If
return false;
}

private java.util.ArrayList  aConditions;

/** Part of the list interface for Conditions
  * @return a collection of all the elements in Conditions
  */
public java.util.ArrayList  allConditions()
  {
if (aConditions == null){
    setAllConditions( new java.util.ArrayList () );
} // If
    return aConditions;
  }

/** Part of the list interface for Conditions
  * @return a collection of all the elements in Conditions
  */
private java.util.ArrayList  getConditions()
  {
    return allConditions();
  }

/** Part of the list interface for Conditions
  * @param coll a collection of elements which replaces 
  *        Conditions's current content.
  */
public void setAllConditions(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aConditions = coll;
  }

/** Part of the list interface for Conditions
  * @param el a RuleCondition to add to the collection in 
  *           Conditions
  * @seealso #appendConditions(java.util.Collection )
  */
public void appendConditions(RuleCondition el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allConditions().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Conditions
  * @param coll a collection ofRuleConditions to add to the collection in 
  *           Conditions
  * @seealso #appendConditions(RuleCondition)
  */
public void appendConditions(java.util.Collection  coll)
  {
  __setDirty(true);
  allConditions().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Conditions
  * This insertion function inserts a new element in the
  * collection in Conditions
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertConditions(int idx, RuleCondition el)
  {
  __setDirty(true);
  allConditions().add (idx, el);
  }

/** Part of the list interface for Conditions
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfConditions(xmlBBaseInter el)
  {
  return allConditions().indexOf (el);
  }

/** Part of the list interface for Conditions
  * This deletion function removes an element from the
  * collection in Conditions
  * @param idx the index of the element to remove
  */
public void deleteConditions(int idx)
  {
  __setDirty(true);
  allConditions().remove(idx);
  }

public void SortConditions()
  {
//-> hostname : RuleCondition
Collections.sort(allConditions(), new Comparator<RuleCondition>() {
public int compare( RuleCondition o1, RuleCondition o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Conditions
  * This deletion function removes an element from the
  * collection in Conditions
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeConditions(xmlBBaseInter obj)
  {
  int idx = indexOfConditions(obj);
  if (idx >= 0) { deleteConditions(idx);
   }
  }

/** Part of the list interface for Conditions
  * @return the number of elements in Conditions
  */
public int countConditions()
  {
  return allConditions().size();
  }

/** Part of the list interface for Conditions
  * This function returns an element from the
  * collection in Conditions based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public RuleCondition getConditions(int idx)
{
  return (RuleCondition) ( allConditions().get(idx));
}

public Rule()
{
Rule obj = this;
aPriority=(0);
aConditions=(null);
}

public void copyTo(Rule other)
{
super.copyTo(other);
other.aPriority = aPriority;
other.aConditions = aConditions;
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
boolean fl742;
boolean fl743;
RuleCondition fl745;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SubRules")){
ctxt.skipWhiteSpace();
fl742 = true ; 
while (fl742) { // BeginLoop 
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
fl742 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
acceptor.lAcceptPcData(ctxt, 0, '<', xmlBContext.WS_PRESERVE);
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SubRules>");
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Conditions")){
ctxt.skipWhiteSpace();
fl743 = true ; 
while (fl743) { // BeginLoop 
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
fl743 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl745 = null;
while(ctxt.lookAheadOpeningTag ("<RuleCondition")) {
fl745 = acceptor.lAccept_RuleCondition(ctxt, "</RuleCondition>");
appendConditions(fl745);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Conditions>");
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
boolean fl756;
boolean fl757;
boolean fl758;
boolean fl759;
boolean fl760;
boolean fl761;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl756 = false ; 
fl757 = false ; 
fl758 = false ; 
fl759 = false ; 
fl760 = false ; 
fl761 = true ; 
while (fl761) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 758;
} else {
indicator = 762;
} // If
break;
} // Case
case 'P':
{
ctxt.advance();
if (ctxt.lookAheadString("riority=")){
indicator = 756;
} else {
indicator = 762;
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
indicator = 759;
} else {
indicator = 762;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 760;
} else {
indicator = 762;
} // If
break;
} // Case
default:
indicator = 762;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 757;
} else {
indicator = 762;
} // If
break;
} // Case
default:
indicator = 762;
break;
} // Switch
switch (indicator) {
case 756: {
// Handling attribute Priority
// Also handles alien attributes with prefix Priority
if (fl756){
ctxt.fail ("Duplicate attribute: Priority");
} // If
fl756 = true ; 
quoteChar = ctxt.acceptQuote();
this.setPriority(acceptor.lAcceptEnum_RulePriority(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 757: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl757){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl757 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 758: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl758){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl758 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 759: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl759){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl759 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 760: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl760){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl760 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 762: {
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
if (!fl757){
this.setImplemented( false);
} // If
if (!fl758){
this.setVerified( false);
} // If
if (!fl759){
this.setNeedsRequirement( true);
} // If
fl761 = false ; 
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
  headingTag = "<Rule";
  endingTag = "</Rule>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Rule\"");
} // If
pw.println();
if (this.getPriority() != 0){
pw.print(" Priority=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_RulePriority_ToString(this.getPriority()));
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
pw.print("<SubRules>");
// Unparsing PcData
pw.print("</SubRules>");
// Father is not a mixed
pw.println();
// Unparsing Enclosed
// Testing for empty content: Conditions
if (countConditions() > 0){
pw.print("<Conditions>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getConditions(), false, "<RuleCondition", "</RuleCondition>");
pw.print("</Conditions>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Conditions
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
for (int i = 0; i < countConditions(); i++) {
  l.add(getConditions(i));
}
}

}

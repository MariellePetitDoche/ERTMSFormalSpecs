
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Procedure</i></h3>
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
public class Procedure
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  StateMachine aStateMachine;

public  StateMachine getStateMachine() { return aStateMachine;}

public  void setStateMachine(StateMachine v) {
  __setDirty ( __getDirty() || (getStateMachine() != v));
  aStateMachine = v;
  if ( v != null ) { 
    v.setFather(this);
  }
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

public Procedure()
{
Procedure obj = this;
aStateMachine=(null);
aRules=(null);
aParameters=(null);
}

public void copyTo(Procedure other)
{
super.copyTo(other);
other.aStateMachine = aStateMachine;
other.aRules = aRules;
other.aParameters = aParameters;
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
boolean fl609;
Parameter fl611;
boolean fl622;
Rule fl624;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Parameters")){
ctxt.skipWhiteSpace();
fl609 = true ; 
while (fl609) { // BeginLoop 
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
fl609 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl611 = null;
while(ctxt.lookAheadOpeningTag ("<Parameter")) {
fl611 = acceptor.lAccept_Parameter(ctxt, "</Parameter>");
appendParameters(fl611);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Parameters>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Rules")){
ctxt.skipWhiteSpace();
fl622 = true ; 
while (fl622) { // BeginLoop 
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
fl622 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl624 = null;
while(ctxt.lookAheadOpeningTag ("<Rule")) {
fl624 = acceptor.lAccept_Rule(ctxt, "</Rule>");
appendRules(fl624);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Rules>");
} // If
} // If
// End enclosed
// Element Ref : StateMachine
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<StateMachine")){
// Parsing sub element
this.setStateMachine(acceptor.lAccept_StateMachine(ctxt,"</StateMachine>"));
setSon(this.getStateMachine());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
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
boolean fl635;
boolean fl636;
boolean fl637;
boolean fl638;
boolean fl639;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl635 = false ; 
fl636 = false ; 
fl637 = false ; 
fl638 = false ; 
fl639 = true ; 
while (fl639) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 636;
} else {
indicator = 640;
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
indicator = 637;
} else {
indicator = 640;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 638;
} else {
indicator = 640;
} // If
break;
} // Case
default:
indicator = 640;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 635;
} else {
indicator = 640;
} // If
break;
} // Case
default:
indicator = 640;
break;
} // Switch
switch (indicator) {
case 635: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl635){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl635 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 636: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl636){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl636 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 637: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl637){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl637 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 638: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl638){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl638 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 640: {
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
if (!fl635){
this.setImplemented( false);
} // If
if (!fl636){
this.setVerified( false);
} // If
if (!fl637){
this.setNeedsRequirement( true);
} // If
fl639 = false ; 
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
  headingTag = "<Procedure";
  endingTag = "</Procedure>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Procedure\"");
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
// Unparsing ElementRef
if (this.getStateMachine() != null){
unParse(pw, this.getStateMachine(),false,"<StateMachine","</StateMachine>");
} // If
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
l.add(this.getStateMachine());
for (int i = 0; i < countRules(); i++) {
  l.add(getRules(i));
}
for (int i = 0; i < countParameters(); i++) {
  l.add(getParameters(i));
}
}

}

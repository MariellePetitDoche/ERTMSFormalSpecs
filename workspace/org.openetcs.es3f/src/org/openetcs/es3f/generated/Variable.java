
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Variable</i></h3>
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
public class Variable
extends org.openetcs.es3f.DataDictionary.ReqRelated
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getTypeName().compareToIgnoreCase((String) search) == 0)return true;
if(getDefaultValue().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
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

private   String  aDefaultValue;

public   String  getDefaultValue() { return aDefaultValue;}

public  void setDefaultValue( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getDefaultValue())));
} else {
  __setDirty ( __getDirty() || (getDefaultValue() != null));
} // If
  aDefaultValue = v;
}

private  int aVariableMode;

public  int getVariableMode() { return aVariableMode;}

public  void setVariableMode(int v) {
  __setDirty ( __getDirty() || (getVariableMode() != v));
  aVariableMode = v;
}

public  String   getVariableMode_AsString()
{
  return acceptor.Enum_VariableModeEnumType_ToString (aVariableMode);
}

public  boolean setVariableMode_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_VariableModeEnumType(v);
if (temp >= 0){
aVariableMode = temp;
return true;
} // If
return false;
}

private java.util.ArrayList  aSubVariables;

/** Part of the list interface for SubVariables
  * @return a collection of all the elements in SubVariables
  */
public java.util.ArrayList  allSubVariables()
  {
if (aSubVariables == null){
    setAllSubVariables( new java.util.ArrayList () );
} // If
    return aSubVariables;
  }

/** Part of the list interface for SubVariables
  * @return a collection of all the elements in SubVariables
  */
private java.util.ArrayList  getSubVariables()
  {
    return allSubVariables();
  }

/** Part of the list interface for SubVariables
  * @param coll a collection of elements which replaces 
  *        SubVariables's current content.
  */
public void setAllSubVariables(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSubVariables = coll;
  }

/** Part of the list interface for SubVariables
  * @param el a Variable to add to the collection in 
  *           SubVariables
  * @seealso #appendSubVariables(java.util.Collection )
  */
public void appendSubVariables(Variable el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSubVariables().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for SubVariables
  * @param coll a collection ofVariables to add to the collection in 
  *           SubVariables
  * @seealso #appendSubVariables(Variable)
  */
public void appendSubVariables(java.util.Collection  coll)
  {
  __setDirty(true);
  allSubVariables().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for SubVariables
  * This insertion function inserts a new element in the
  * collection in SubVariables
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSubVariables(int idx, Variable el)
  {
  __setDirty(true);
  allSubVariables().add (idx, el);
  }

/** Part of the list interface for SubVariables
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSubVariables(xmlBBaseInter el)
  {
  return allSubVariables().indexOf (el);
  }

/** Part of the list interface for SubVariables
  * This deletion function removes an element from the
  * collection in SubVariables
  * @param idx the index of the element to remove
  */
public void deleteSubVariables(int idx)
  {
  __setDirty(true);
  allSubVariables().remove(idx);
  }

public void SortSubVariables()
  {
//-> hostname : Variable
Collections.sort(allSubVariables(), new Comparator<Variable>() {
public int compare( Variable o1, Variable o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for SubVariables
  * This deletion function removes an element from the
  * collection in SubVariables
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSubVariables(xmlBBaseInter obj)
  {
  int idx = indexOfSubVariables(obj);
  if (idx >= 0) { deleteSubVariables(idx);
   }
  }

/** Part of the list interface for SubVariables
  * @return the number of elements in SubVariables
  */
public int countSubVariables()
  {
  return allSubVariables().size();
  }

/** Part of the list interface for SubVariables
  * This function returns an element from the
  * collection in SubVariables based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Variable getSubVariables(int idx)
{
  return (Variable) ( allSubVariables().get(idx));
}

public Variable()
{
Variable obj = this;
aTypeName=(null);
aDefaultValue=(null);
aVariableMode=(0);
aSubVariables=(null);
}

public void copyTo(Variable other)
{
super.copyTo(other);
other.aTypeName = aTypeName;
other.aDefaultValue = aDefaultValue;
other.aVariableMode = aVariableMode;
other.aSubVariables = aSubVariables;
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
boolean fl710;
Variable fl712;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SubVariables")){
ctxt.skipWhiteSpace();
fl710 = true ; 
while (fl710) { // BeginLoop 
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
fl710 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl712 = null;
while(ctxt.lookAheadOpeningTag ("<Variable")) {
fl712 = acceptor.lAccept_Variable(ctxt, "</Variable>");
appendSubVariables(fl712);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SubVariables>");
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
boolean fl723;
boolean fl724;
boolean fl725;
boolean fl726;
boolean fl727;
boolean fl728;
boolean fl729;
boolean fl730;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl723 = false ; 
fl724 = false ; 
fl725 = false ; 
fl726 = false ; 
fl727 = false ; 
fl728 = false ; 
fl729 = false ; 
fl730 = true ; 
while (fl730) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
switch (ctxt.current()) {
case 'e':
{
ctxt.advance();
if (ctxt.lookAheadString("rified=")){
indicator = 727;
} else {
indicator = 731;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAheadString("riableMode=")){
indicator = 725;
} else {
indicator = 731;
} // If
break;
} // Case
default:
indicator = 731;
break;
} // Switch
break;
} // Case
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("ype=")){
indicator = 723;
} else {
indicator = 731;
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
indicator = 728;
} else {
indicator = 731;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 729;
} else {
indicator = 731;
} // If
break;
} // Case
default:
indicator = 731;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 726;
} else {
indicator = 731;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efaultValue=")){
indicator = 724;
} else {
indicator = 731;
} // If
break;
} // Case
default:
indicator = 731;
break;
} // Switch
switch (indicator) {
case 723: {
// Handling attribute Type
// Also handles alien attributes with prefix Type
if (fl723){
ctxt.fail ("Duplicate attribute: Type");
} // If
fl723 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTypeName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 724: {
// Handling attribute DefaultValue
// Also handles alien attributes with prefix DefaultValue
if (fl724){
ctxt.fail ("Duplicate attribute: DefaultValue");
} // If
fl724 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefaultValue((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 725: {
// Handling attribute VariableMode
// Also handles alien attributes with prefix VariableMode
if (fl725){
ctxt.fail ("Duplicate attribute: VariableMode");
} // If
fl725 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVariableMode(acceptor.lAcceptEnum_VariableModeEnumType(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 726: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl726){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl726 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 727: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl727){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl727 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 728: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl728){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl728 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 729: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl729){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl729 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 731: {
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
if (!fl725){
this.setVariableMode(acceptor.aInternal);
} // If
if (!fl726){
this.setImplemented( false);
} // If
if (!fl727){
this.setVerified( false);
} // If
if (!fl728){
this.setNeedsRequirement( true);
} // If
fl730 = false ; 
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
  headingTag = "<Variable";
  endingTag = "</Variable>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Variable\"");
} // If
pw.println();
if (this.getTypeName() != null){
pw.print(" Type=\"");
acceptor.unParsePcData(pw, this.getTypeName());
pw.print('"');
pw.println();
} // If
if (this.getDefaultValue() != null){
pw.print(" DefaultValue=\"");
acceptor.unParsePcData(pw, this.getDefaultValue());
pw.print('"');
pw.println();
} // If
if (this.getVariableMode() != 0){
pw.print(" VariableMode=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_VariableModeEnumType_ToString(this.getVariableMode()));
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
// Testing for empty content: SubVariables
if (countSubVariables() > 0){
pw.print("<SubVariables>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSubVariables(), false, "<Variable", "</Variable>");
pw.print("</SubVariables>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: SubVariables
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
for (int i = 0; i < countSubVariables(); i++) {
  l.add(getSubVariables(i));
}
}

}

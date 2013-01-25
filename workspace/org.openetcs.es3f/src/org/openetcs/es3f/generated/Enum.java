
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Enum</i></h3>
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
public class Enum
extends org.openetcs.es3f.DataDictionary.Types.Type
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private java.util.ArrayList  aValues;

/** Part of the list interface for Values
  * @return a collection of all the elements in Values
  */
public java.util.ArrayList  allValues()
  {
if (aValues == null){
    setAllValues( new java.util.ArrayList () );
} // If
    return aValues;
  }

/** Part of the list interface for Values
  * @return a collection of all the elements in Values
  */
private java.util.ArrayList  getValues()
  {
    return allValues();
  }

/** Part of the list interface for Values
  * @param coll a collection of elements which replaces 
  *        Values's current content.
  */
public void setAllValues(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aValues = coll;
  }

/** Part of the list interface for Values
  * @param el a EnumValue to add to the collection in 
  *           Values
  * @seealso #appendValues(java.util.Collection )
  */
public void appendValues(EnumValue el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allValues().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Values
  * @param coll a collection ofEnumValues to add to the collection in 
  *           Values
  * @seealso #appendValues(EnumValue)
  */
public void appendValues(java.util.Collection  coll)
  {
  __setDirty(true);
  allValues().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Values
  * This insertion function inserts a new element in the
  * collection in Values
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertValues(int idx, EnumValue el)
  {
  __setDirty(true);
  allValues().add (idx, el);
  }

/** Part of the list interface for Values
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfValues(xmlBBaseInter el)
  {
  return allValues().indexOf (el);
  }

/** Part of the list interface for Values
  * This deletion function removes an element from the
  * collection in Values
  * @param idx the index of the element to remove
  */
public void deleteValues(int idx)
  {
  __setDirty(true);
  allValues().remove(idx);
  }

public void SortValues()
  {
//-> hostname : EnumValue
Collections.sort(allValues(), new Comparator<EnumValue>() {
public int compare( EnumValue o1, EnumValue o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Values
  * This deletion function removes an element from the
  * collection in Values
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeValues(xmlBBaseInter obj)
  {
  int idx = indexOfValues(obj);
  if (idx >= 0) { deleteValues(idx);
   }
  }

/** Part of the list interface for Values
  * @return the number of elements in Values
  */
public int countValues()
  {
  return allValues().size();
  }

/** Part of the list interface for Values
  * This function returns an element from the
  * collection in Values based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public EnumValue getValues(int idx)
{
  return (EnumValue) ( allValues().get(idx));
}

private java.util.ArrayList  aSubEnums;

/** Part of the list interface for SubEnums
  * @return a collection of all the elements in SubEnums
  */
public java.util.ArrayList  allSubEnums()
  {
if (aSubEnums == null){
    setAllSubEnums( new java.util.ArrayList () );
} // If
    return aSubEnums;
  }

/** Part of the list interface for SubEnums
  * @return a collection of all the elements in SubEnums
  */
private java.util.ArrayList  getSubEnums()
  {
    return allSubEnums();
  }

/** Part of the list interface for SubEnums
  * @param coll a collection of elements which replaces 
  *        SubEnums's current content.
  */
public void setAllSubEnums(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSubEnums = coll;
  }

/** Part of the list interface for SubEnums
  * @param el a Enum to add to the collection in 
  *           SubEnums
  * @seealso #appendSubEnums(java.util.Collection )
  */
public void appendSubEnums(Enum el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSubEnums().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for SubEnums
  * @param coll a collection ofEnums to add to the collection in 
  *           SubEnums
  * @seealso #appendSubEnums(Enum)
  */
public void appendSubEnums(java.util.Collection  coll)
  {
  __setDirty(true);
  allSubEnums().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for SubEnums
  * This insertion function inserts a new element in the
  * collection in SubEnums
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSubEnums(int idx, Enum el)
  {
  __setDirty(true);
  allSubEnums().add (idx, el);
  }

/** Part of the list interface for SubEnums
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSubEnums(xmlBBaseInter el)
  {
  return allSubEnums().indexOf (el);
  }

/** Part of the list interface for SubEnums
  * This deletion function removes an element from the
  * collection in SubEnums
  * @param idx the index of the element to remove
  */
public void deleteSubEnums(int idx)
  {
  __setDirty(true);
  allSubEnums().remove(idx);
  }

public void SortSubEnums()
  {
//-> hostname : Enum
Collections.sort(allSubEnums(), new Comparator<Enum>() {
public int compare( Enum o1, Enum o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for SubEnums
  * This deletion function removes an element from the
  * collection in SubEnums
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSubEnums(xmlBBaseInter obj)
  {
  int idx = indexOfSubEnums(obj);
  if (idx >= 0) { deleteSubEnums(idx);
   }
  }

/** Part of the list interface for SubEnums
  * @return the number of elements in SubEnums
  */
public int countSubEnums()
  {
  return allSubEnums().size();
  }

/** Part of the list interface for SubEnums
  * This function returns an element from the
  * collection in SubEnums based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Enum getSubEnums(int idx)
{
  return (Enum) ( allSubEnums().get(idx));
}

public Enum()
{
Enum obj = this;
aValues=(null);
aSubEnums=(null);
}

public void copyTo(Enum other)
{
super.copyTo(other);
other.aValues = aValues;
other.aSubEnums = aSubEnums;
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
boolean fl335;
EnumValue fl337;
boolean fl348;
Enum fl350;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Values")){
ctxt.skipWhiteSpace();
fl335 = true ; 
while (fl335) { // BeginLoop 
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
fl335 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl337 = null;
while(ctxt.lookAheadOpeningTag ("<EnumValue")) {
fl337 = acceptor.lAccept_EnumValue(ctxt, "</EnumValue>");
appendValues(fl337);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Values>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SubEnums")){
ctxt.skipWhiteSpace();
fl348 = true ; 
while (fl348) { // BeginLoop 
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
fl348 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl350 = null;
while(ctxt.lookAheadOpeningTag ("<Enum")) {
fl350 = acceptor.lAccept_Enum(ctxt, "</Enum>");
appendSubEnums(fl350);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SubEnums>");
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
boolean fl361;
boolean fl362;
boolean fl363;
boolean fl364;
boolean fl365;
boolean fl366;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl361 = false ; 
fl362 = false ; 
fl363 = false ; 
fl364 = false ; 
fl365 = false ; 
fl366 = true ; 
while (fl366) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 363;
} else {
indicator = 367;
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
indicator = 364;
} else {
indicator = 367;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 365;
} else {
indicator = 367;
} // If
break;
} // Case
default:
indicator = 367;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 362;
} else {
indicator = 367;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efault=")){
indicator = 361;
} else {
indicator = 367;
} // If
break;
} // Case
default:
indicator = 367;
break;
} // Switch
switch (indicator) {
case 361: {
// Handling attribute Default
// Also handles alien attributes with prefix Default
if (fl361){
ctxt.fail ("Duplicate attribute: Default");
} // If
fl361 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefault((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 362: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl362){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl362 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 363: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl363){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl363 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 364: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl364){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl364 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 365: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl365){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl365 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 367: {
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
if (!fl362){
this.setImplemented( false);
} // If
if (!fl363){
this.setVerified( false);
} // If
if (!fl364){
this.setNeedsRequirement( true);
} // If
fl366 = false ; 
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
  headingTag = "<Enum";
  endingTag = "</Enum>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Enum\"");
} // If
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
// Testing for empty content: Values
if (countValues() > 0){
pw.print("<Values>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getValues(), false, "<EnumValue", "</EnumValue>");
pw.print("</Values>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Values
// Unparsing Enclosed
// Testing for empty content: SubEnums
if (countSubEnums() > 0){
pw.print("<SubEnums>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSubEnums(), false, "<Enum", "</Enum>");
pw.print("</SubEnums>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: SubEnums
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
for (int i = 0; i < countValues(); i++) {
  l.add(getValues(i));
}
for (int i = 0; i < countSubEnums(); i++) {
  l.add(getSubEnums(i));
}
}

}

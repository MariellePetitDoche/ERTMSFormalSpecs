
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Structure</i></h3>
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
public class Structure
extends org.openetcs.es3f.DataDictionary.Types.Type
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private java.util.ArrayList  aElements;

/** Part of the list interface for Elements
  * @return a collection of all the elements in Elements
  */
public java.util.ArrayList  allElements()
  {
if (aElements == null){
    setAllElements( new java.util.ArrayList () );
} // If
    return aElements;
  }

/** Part of the list interface for Elements
  * @return a collection of all the elements in Elements
  */
private java.util.ArrayList  getElements()
  {
    return allElements();
  }

/** Part of the list interface for Elements
  * @param coll a collection of elements which replaces 
  *        Elements's current content.
  */
public void setAllElements(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aElements = coll;
  }

/** Part of the list interface for Elements
  * @param el a StructureElement to add to the collection in 
  *           Elements
  * @seealso #appendElements(java.util.Collection )
  */
public void appendElements(StructureElement el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allElements().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Elements
  * @param coll a collection ofStructureElements to add to the collection in 
  *           Elements
  * @seealso #appendElements(StructureElement)
  */
public void appendElements(java.util.Collection  coll)
  {
  __setDirty(true);
  allElements().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Elements
  * This insertion function inserts a new element in the
  * collection in Elements
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertElements(int idx, StructureElement el)
  {
  __setDirty(true);
  allElements().add (idx, el);
  }

/** Part of the list interface for Elements
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfElements(xmlBBaseInter el)
  {
  return allElements().indexOf (el);
  }

/** Part of the list interface for Elements
  * This deletion function removes an element from the
  * collection in Elements
  * @param idx the index of the element to remove
  */
public void deleteElements(int idx)
  {
  __setDirty(true);
  allElements().remove(idx);
  }

public void SortElements()
  {
//-> hostname : StructureElement
Collections.sort(allElements(), new Comparator<StructureElement>() {
public int compare( StructureElement o1, StructureElement o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Elements
  * This deletion function removes an element from the
  * collection in Elements
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeElements(xmlBBaseInter obj)
  {
  int idx = indexOfElements(obj);
  if (idx >= 0) { deleteElements(idx);
   }
  }

/** Part of the list interface for Elements
  * @return the number of elements in Elements
  */
public int countElements()
  {
  return allElements().size();
  }

/** Part of the list interface for Elements
  * This function returns an element from the
  * collection in Elements based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public StructureElement getElements(int idx)
{
  return (StructureElement) ( allElements().get(idx));
}

private java.util.ArrayList  aProcedures;

/** Part of the list interface for Procedures
  * @return a collection of all the elements in Procedures
  */
public java.util.ArrayList  allProcedures()
  {
if (aProcedures == null){
    setAllProcedures( new java.util.ArrayList () );
} // If
    return aProcedures;
  }

/** Part of the list interface for Procedures
  * @return a collection of all the elements in Procedures
  */
private java.util.ArrayList  getProcedures()
  {
    return allProcedures();
  }

/** Part of the list interface for Procedures
  * @param coll a collection of elements which replaces 
  *        Procedures's current content.
  */
public void setAllProcedures(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aProcedures = coll;
  }

/** Part of the list interface for Procedures
  * @param el a StructureProcedure to add to the collection in 
  *           Procedures
  * @seealso #appendProcedures(java.util.Collection )
  */
public void appendProcedures(StructureProcedure el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allProcedures().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Procedures
  * @param coll a collection ofStructureProcedures to add to the collection in 
  *           Procedures
  * @seealso #appendProcedures(StructureProcedure)
  */
public void appendProcedures(java.util.Collection  coll)
  {
  __setDirty(true);
  allProcedures().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Procedures
  * This insertion function inserts a new element in the
  * collection in Procedures
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertProcedures(int idx, StructureProcedure el)
  {
  __setDirty(true);
  allProcedures().add (idx, el);
  }

/** Part of the list interface for Procedures
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfProcedures(xmlBBaseInter el)
  {
  return allProcedures().indexOf (el);
  }

/** Part of the list interface for Procedures
  * This deletion function removes an element from the
  * collection in Procedures
  * @param idx the index of the element to remove
  */
public void deleteProcedures(int idx)
  {
  __setDirty(true);
  allProcedures().remove(idx);
  }

public void SortProcedures()
  {
//-> hostname : StructureProcedure
Collections.sort(allProcedures(), new Comparator<StructureProcedure>() {
public int compare( StructureProcedure o1, StructureProcedure o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Procedures
  * This deletion function removes an element from the
  * collection in Procedures
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeProcedures(xmlBBaseInter obj)
  {
  int idx = indexOfProcedures(obj);
  if (idx >= 0) { deleteProcedures(idx);
   }
  }

/** Part of the list interface for Procedures
  * @return the number of elements in Procedures
  */
public int countProcedures()
  {
  return allProcedures().size();
  }

/** Part of the list interface for Procedures
  * This function returns an element from the
  * collection in Procedures based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public StructureProcedure getProcedures(int idx)
{
  return (StructureProcedure) ( allProcedures().get(idx));
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

public Structure()
{
Structure obj = this;
aElements=(null);
aProcedures=(null);
aRules=(null);
}

public void copyTo(Structure other)
{
super.copyTo(other);
other.aElements = aElements;
other.aProcedures = aProcedures;
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
boolean fl416;
Rule fl418;
boolean fl429;
StructureProcedure fl431;
StructureElement fl443;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Rules")){
ctxt.skipWhiteSpace();
fl416 = true ; 
while (fl416) { // BeginLoop 
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
fl416 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl418 = null;
while(ctxt.lookAheadOpeningTag ("<Rule")) {
fl418 = acceptor.lAccept_Rule(ctxt, "</Rule>");
appendRules(fl418);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Rules>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Procedures")){
ctxt.skipWhiteSpace();
fl429 = true ; 
while (fl429) { // BeginLoop 
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
fl429 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl431 = null;
while(ctxt.lookAheadOpeningTag ("<StructureProcedure")) {
fl431 = acceptor.lAccept_StructureProcedure(ctxt, "</StructureProcedure>");
appendProcedures(fl431);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Procedures>");
} // If
} // If
// End enclosed
// Repeat
ctxt.skipWhiteSpace();
fl443 = null;
while(ctxt.lookAheadOpeningTag ("<StructureElement")) {
fl443 = acceptor.lAccept_StructureElement(ctxt, "</StructureElement>");
appendElements(fl443);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
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
boolean fl454;
boolean fl455;
boolean fl456;
boolean fl457;
boolean fl458;
boolean fl459;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl454 = false ; 
fl455 = false ; 
fl456 = false ; 
fl457 = false ; 
fl458 = false ; 
fl459 = true ; 
while (fl459) { // BeginLoop 
switch (ctxt.current()) {
case 'V':
{
ctxt.advance();
if (ctxt.lookAheadString("erified=")){
indicator = 456;
} else {
indicator = 460;
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
indicator = 457;
} else {
indicator = 460;
} // If
break;
} // Case
case 'a':
{
ctxt.advance();
if (ctxt.lookAhead3('m','e','=')){
indicator = 458;
} else {
indicator = 460;
} // If
break;
} // Case
default:
indicator = 460;
break;
} // Switch
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 455;
} else {
indicator = 460;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("efault=")){
indicator = 454;
} else {
indicator = 460;
} // If
break;
} // Case
default:
indicator = 460;
break;
} // Switch
switch (indicator) {
case 454: {
// Handling attribute Default
// Also handles alien attributes with prefix Default
if (fl454){
ctxt.fail ("Duplicate attribute: Default");
} // If
fl454 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDefault((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 455: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl455){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl455 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 456: {
// Handling attribute Verified
// Also handles alien attributes with prefix Verified
if (fl456){
ctxt.fail ("Duplicate attribute: Verified");
} // If
fl456 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVerified(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 457: {
// Handling attribute NeedsRequirement
// Also handles alien attributes with prefix NeedsRequirement
if (fl457){
ctxt.fail ("Duplicate attribute: NeedsRequirement");
} // If
fl457 = true ; 
quoteChar = ctxt.acceptQuote();
this.setNeedsRequirement(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 458: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl458){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl458 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 460: {
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
if (!fl455){
this.setImplemented( false);
} // If
if (!fl456){
this.setVerified( false);
} // If
if (!fl457){
this.setNeedsRequirement( true);
} // If
fl459 = false ; 
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
  headingTag = "<Structure";
  endingTag = "</Structure>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Structure\"");
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
// Unparsing Enclosed
// Testing for empty content: Procedures
if (countProcedures() > 0){
pw.print("<Procedures>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getProcedures(), false, "<StructureProcedure", "</StructureProcedure>");
pw.print("</Procedures>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Procedures
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getElements(), false, "<StructureElement", "</StructureElement>");
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
for (int i = 0; i < countElements(); i++) {
  l.add(getElements(i));
}
for (int i = 0; i < countProcedures(); i++) {
  l.add(getProcedures(i));
}
for (int i = 0; i < countRules(); i++) {
  l.add(getRules(i));
}
}

}

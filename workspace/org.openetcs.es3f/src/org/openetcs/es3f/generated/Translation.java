
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Translation</i></h3>
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
public class Translation
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getComment().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private java.util.ArrayList  aSourceTexts;

/** Part of the list interface for SourceTexts
  * @return a collection of all the elements in SourceTexts
  */
public java.util.ArrayList  allSourceTexts()
  {
if (aSourceTexts == null){
    setAllSourceTexts( new java.util.ArrayList () );
} // If
    return aSourceTexts;
  }

/** Part of the list interface for SourceTexts
  * @return a collection of all the elements in SourceTexts
  */
private java.util.ArrayList  getSourceTexts()
  {
    return allSourceTexts();
  }

/** Part of the list interface for SourceTexts
  * @param coll a collection of elements which replaces 
  *        SourceTexts's current content.
  */
public void setAllSourceTexts(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSourceTexts = coll;
  }

/** Part of the list interface for SourceTexts
  * @param el a SourceText to add to the collection in 
  *           SourceTexts
  * @seealso #appendSourceTexts(java.util.Collection )
  */
public void appendSourceTexts(SourceText el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSourceTexts().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for SourceTexts
  * @param coll a collection ofSourceTexts to add to the collection in 
  *           SourceTexts
  * @seealso #appendSourceTexts(SourceText)
  */
public void appendSourceTexts(java.util.Collection  coll)
  {
  __setDirty(true);
  allSourceTexts().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for SourceTexts
  * This insertion function inserts a new element in the
  * collection in SourceTexts
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSourceTexts(int idx, SourceText el)
  {
  __setDirty(true);
  allSourceTexts().add (idx, el);
  }

/** Part of the list interface for SourceTexts
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSourceTexts(xmlBBaseInter el)
  {
  return allSourceTexts().indexOf (el);
  }

/** Part of the list interface for SourceTexts
  * This deletion function removes an element from the
  * collection in SourceTexts
  * @param idx the index of the element to remove
  */
public void deleteSourceTexts(int idx)
  {
  __setDirty(true);
  allSourceTexts().remove(idx);
  }

public void SortSourceTexts()
  {
//-> hostname : SourceText
Collections.sort(allSourceTexts(), new Comparator<SourceText>() {
public int compare( SourceText o1, SourceText o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for SourceTexts
  * This deletion function removes an element from the
  * collection in SourceTexts
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSourceTexts(xmlBBaseInter obj)
  {
  int idx = indexOfSourceTexts(obj);
  if (idx >= 0) { deleteSourceTexts(idx);
   }
  }

/** Part of the list interface for SourceTexts
  * @return the number of elements in SourceTexts
  */
public int countSourceTexts()
  {
  return allSourceTexts().size();
  }

/** Part of the list interface for SourceTexts
  * This function returns an element from the
  * collection in SourceTexts based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public SourceText getSourceTexts(int idx)
{
  return (SourceText) ( allSourceTexts().get(idx));
}

private  boolean aImplemented;

public  boolean getImplemented() { return aImplemented;}

public  void setImplemented(boolean v) {
  __setDirty ( __getDirty() || (getImplemented() != v));
  aImplemented = v;
}

private java.util.ArrayList  aSubSteps;

/** Part of the list interface for SubSteps
  * @return a collection of all the elements in SubSteps
  */
public java.util.ArrayList  allSubSteps()
  {
if (aSubSteps == null){
    setAllSubSteps( new java.util.ArrayList () );
} // If
    return aSubSteps;
  }

/** Part of the list interface for SubSteps
  * @return a collection of all the elements in SubSteps
  */
private java.util.ArrayList  getSubSteps()
  {
    return allSubSteps();
  }

/** Part of the list interface for SubSteps
  * @param coll a collection of elements which replaces 
  *        SubSteps's current content.
  */
public void setAllSubSteps(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSubSteps = coll;
  }

/** Part of the list interface for SubSteps
  * @param el a SubStep to add to the collection in 
  *           SubSteps
  * @seealso #appendSubSteps(java.util.Collection )
  */
public void appendSubSteps(SubStep el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSubSteps().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for SubSteps
  * @param coll a collection ofSubSteps to add to the collection in 
  *           SubSteps
  * @seealso #appendSubSteps(SubStep)
  */
public void appendSubSteps(java.util.Collection  coll)
  {
  __setDirty(true);
  allSubSteps().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for SubSteps
  * This insertion function inserts a new element in the
  * collection in SubSteps
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSubSteps(int idx, SubStep el)
  {
  __setDirty(true);
  allSubSteps().add (idx, el);
  }

/** Part of the list interface for SubSteps
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSubSteps(xmlBBaseInter el)
  {
  return allSubSteps().indexOf (el);
  }

/** Part of the list interface for SubSteps
  * This deletion function removes an element from the
  * collection in SubSteps
  * @param idx the index of the element to remove
  */
public void deleteSubSteps(int idx)
  {
  __setDirty(true);
  allSubSteps().remove(idx);
  }

public void SortSubSteps()
  {
//-> hostname : SubStep
Collections.sort(allSubSteps(), new Comparator<SubStep>() {
public int compare( SubStep o1, SubStep o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for SubSteps
  * This deletion function removes an element from the
  * collection in SubSteps
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSubSteps(xmlBBaseInter obj)
  {
  int idx = indexOfSubSteps(obj);
  if (idx >= 0) { deleteSubSteps(idx);
   }
  }

/** Part of the list interface for SubSteps
  * @return the number of elements in SubSteps
  */
public int countSubSteps()
  {
  return allSubSteps().size();
  }

/** Part of the list interface for SubSteps
  * This function returns an element from the
  * collection in SubSteps based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public SubStep getSubSteps(int idx)
{
  return (SubStep) ( allSubSteps().get(idx));
}

private   String  aComment;

public   String  getComment() { return aComment;}

public  void setComment( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getComment())));
} else {
  __setDirty ( __getDirty() || (getComment() != null));
} // If
  aComment = v;
}

public Translation()
{
Translation obj = this;
aSourceTexts=(null);
aImplemented=(false);
aSubSteps=(null);
aComment=(null);
}

public void copyTo(Translation other)
{
super.copyTo(other);
other.aSourceTexts = aSourceTexts;
other.aImplemented = aImplemented;
other.aSubSteps = aSubSteps;
other.aComment = aComment;
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
boolean fl1130;
SourceText fl1132;
boolean fl1143;
SubStep fl1145;
boolean fl1156;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SourceTexts")){
ctxt.skipWhiteSpace();
fl1130 = true ; 
while (fl1130) { // BeginLoop 
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
fl1130 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1132 = null;
while(ctxt.lookAheadOpeningTag ("<SourceText")) {
fl1132 = acceptor.lAccept_SourceText(ctxt, "</SourceText>");
appendSourceTexts(fl1132);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SourceTexts>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SubSteps")){
ctxt.skipWhiteSpace();
fl1143 = true ; 
while (fl1143) { // BeginLoop 
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
fl1143 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1145 = null;
while(ctxt.lookAheadOpeningTag ("<SubStep")) {
fl1145 = acceptor.lAccept_SubStep(ctxt, "</SubStep>");
appendSubSteps(fl1145);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</SubSteps>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Comment")){
ctxt.skipWhiteSpace();
fl1156 = true ; 
while (fl1156) { // BeginLoop 
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
fl1156 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setComment(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Comment>");
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
boolean fl1157;
boolean fl1158;
boolean fl1159;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1157 = false ; 
fl1158 = false ; 
fl1159 = true ; 
while (fl1159) { // BeginLoop 
switch (ctxt.current()) {
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1158;
} else {
indicator = 1160;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAheadString("mplemented=")){
indicator = 1157;
} else {
indicator = 1160;
} // If
break;
} // Case
default:
indicator = 1160;
break;
} // Switch
switch (indicator) {
case 1157: {
// Handling attribute Implemented
// Also handles alien attributes with prefix Implemented
if (fl1157){
ctxt.fail ("Duplicate attribute: Implemented");
} // If
fl1157 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplemented(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1158: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1158){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1158 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1160: {
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
if (!fl1157){
this.setImplemented( false);
} // If
fl1159 = false ; 
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
  headingTag = "<Translation";
  endingTag = "</Translation>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Translation\"");
} // If
pw.println();
if (this.getImplemented()){
pw.print(" Implemented=\"");
acceptor.unParsePcData(pw, this.getImplemented());
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
// Testing for empty content: SourceTexts
if (countSourceTexts() > 0){
pw.print("<SourceTexts>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSourceTexts(), false, "<SourceText", "</SourceText>");
pw.print("</SourceTexts>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: SourceTexts
// Unparsing Enclosed
// Testing for empty content: SubSteps
if (countSubSteps() > 0){
pw.print("<SubSteps>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSubSteps(), false, "<SubStep", "</SubStep>");
pw.print("</SubSteps>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: SubSteps
// Unparsing Enclosed
// Testing for empty content: Comment
if (this.getComment() != null){
pw.print("<Comment>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getComment());
pw.print("</Comment>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Comment
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
for (int i = 0; i < countSourceTexts(); i++) {
  l.add(getSourceTexts(i));
}
for (int i = 0; i < countSubSteps(); i++) {
  l.add(getSubSteps(i));
}
}

}

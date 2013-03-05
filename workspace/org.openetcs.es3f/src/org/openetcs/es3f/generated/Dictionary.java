
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Dictionary</i></h3>
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
public class Dictionary
extends org.openetcs.es3f.ModelElement
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getXsi().compareToIgnoreCase((String) search) == 0)return true;
if(getXsiLocation().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private  Specification aSpecification;

public  Specification getSpecification() { return aSpecification;}

public  void setSpecification(Specification v) {
  __setDirty ( __getDirty() || (getSpecification() != v));
  aSpecification = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private java.util.ArrayList  aRuleDisablings;

/** Part of the list interface for RuleDisablings
  * @return a collection of all the elements in RuleDisablings
  */
public java.util.ArrayList  allRuleDisablings()
  {
if (aRuleDisablings == null){
    setAllRuleDisablings( new java.util.ArrayList () );
} // If
    return aRuleDisablings;
  }

/** Part of the list interface for RuleDisablings
  * @return a collection of all the elements in RuleDisablings
  */
private java.util.ArrayList  getRuleDisablings()
  {
    return allRuleDisablings();
  }

/** Part of the list interface for RuleDisablings
  * @param coll a collection of elements which replaces 
  *        RuleDisablings's current content.
  */
public void setAllRuleDisablings(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aRuleDisablings = coll;
  }

/** Part of the list interface for RuleDisablings
  * @param el a RuleDisabling to add to the collection in 
  *           RuleDisablings
  * @seealso #appendRuleDisablings(java.util.Collection )
  */
public void appendRuleDisablings(RuleDisabling el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allRuleDisablings().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for RuleDisablings
  * @param coll a collection ofRuleDisablings to add to the collection in 
  *           RuleDisablings
  * @seealso #appendRuleDisablings(RuleDisabling)
  */
public void appendRuleDisablings(java.util.Collection  coll)
  {
  __setDirty(true);
  allRuleDisablings().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for RuleDisablings
  * This insertion function inserts a new element in the
  * collection in RuleDisablings
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertRuleDisablings(int idx, RuleDisabling el)
  {
  __setDirty(true);
  allRuleDisablings().add (idx, el);
  }

/** Part of the list interface for RuleDisablings
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfRuleDisablings(xmlBBaseInter el)
  {
  return allRuleDisablings().indexOf (el);
  }

/** Part of the list interface for RuleDisablings
  * This deletion function removes an element from the
  * collection in RuleDisablings
  * @param idx the index of the element to remove
  */
public void deleteRuleDisablings(int idx)
  {
  __setDirty(true);
  allRuleDisablings().remove(idx);
  }

public void SortRuleDisablings()
  {
//-> hostname : RuleDisabling
Collections.sort(allRuleDisablings(), new Comparator<RuleDisabling>() {
public int compare( RuleDisabling o1, RuleDisabling o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for RuleDisablings
  * This deletion function removes an element from the
  * collection in RuleDisablings
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeRuleDisablings(xmlBBaseInter obj)
  {
  int idx = indexOfRuleDisablings(obj);
  if (idx >= 0) { deleteRuleDisablings(idx);
   }
  }

/** Part of the list interface for RuleDisablings
  * @return the number of elements in RuleDisablings
  */
public int countRuleDisablings()
  {
  return allRuleDisablings().size();
  }

/** Part of the list interface for RuleDisablings
  * This function returns an element from the
  * collection in RuleDisablings based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public RuleDisabling getRuleDisablings(int idx)
{
  return (RuleDisabling) ( allRuleDisablings().get(idx));
}

private java.util.ArrayList  aNameSpaces;

/** Part of the list interface for NameSpaces
  * @return a collection of all the elements in NameSpaces
  */
public java.util.ArrayList  allNameSpaces()
  {
if (aNameSpaces == null){
    setAllNameSpaces( new java.util.ArrayList () );
} // If
    return aNameSpaces;
  }

/** Part of the list interface for NameSpaces
  * @return a collection of all the elements in NameSpaces
  */
private java.util.ArrayList  getNameSpaces()
  {
    return allNameSpaces();
  }

/** Part of the list interface for NameSpaces
  * @param coll a collection of elements which replaces 
  *        NameSpaces's current content.
  */
public void setAllNameSpaces(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aNameSpaces = coll;
  }

/** Part of the list interface for NameSpaces
  * @param el a NameSpace to add to the collection in 
  *           NameSpaces
  * @seealso #appendNameSpaces(java.util.Collection )
  */
public void appendNameSpaces(NameSpace el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allNameSpaces().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for NameSpaces
  * @param coll a collection ofNameSpaces to add to the collection in 
  *           NameSpaces
  * @seealso #appendNameSpaces(NameSpace)
  */
public void appendNameSpaces(java.util.Collection  coll)
  {
  __setDirty(true);
  allNameSpaces().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for NameSpaces
  * This insertion function inserts a new element in the
  * collection in NameSpaces
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertNameSpaces(int idx, NameSpace el)
  {
  __setDirty(true);
  allNameSpaces().add (idx, el);
  }

/** Part of the list interface for NameSpaces
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfNameSpaces(xmlBBaseInter el)
  {
  return allNameSpaces().indexOf (el);
  }

/** Part of the list interface for NameSpaces
  * This deletion function removes an element from the
  * collection in NameSpaces
  * @param idx the index of the element to remove
  */
public void deleteNameSpaces(int idx)
  {
  __setDirty(true);
  allNameSpaces().remove(idx);
  }

public void SortNameSpaces()
  {
//-> hostname : NameSpace
Collections.sort(allNameSpaces(), new Comparator<NameSpace>() {
public int compare( NameSpace o1, NameSpace o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for NameSpaces
  * This deletion function removes an element from the
  * collection in NameSpaces
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeNameSpaces(xmlBBaseInter obj)
  {
  int idx = indexOfNameSpaces(obj);
  if (idx >= 0) { deleteNameSpaces(idx);
   }
  }

/** Part of the list interface for NameSpaces
  * @return the number of elements in NameSpaces
  */
public int countNameSpaces()
  {
  return allNameSpaces().size();
  }

/** Part of the list interface for NameSpaces
  * This function returns an element from the
  * collection in NameSpaces based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public NameSpace getNameSpaces(int idx)
{
  return (NameSpace) ( allNameSpaces().get(idx));
}

private java.util.ArrayList  aTests;

/** Part of the list interface for Tests
  * @return a collection of all the elements in Tests
  */
public java.util.ArrayList  allTests()
  {
if (aTests == null){
    setAllTests( new java.util.ArrayList () );
} // If
    return aTests;
  }

/** Part of the list interface for Tests
  * @return a collection of all the elements in Tests
  */
private java.util.ArrayList  getTests()
  {
    return allTests();
  }

/** Part of the list interface for Tests
  * @param coll a collection of elements which replaces 
  *        Tests's current content.
  */
public void setAllTests(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aTests = coll;
  }

/** Part of the list interface for Tests
  * @param el a Frame to add to the collection in 
  *           Tests
  * @seealso #appendTests(java.util.Collection )
  */
public void appendTests(Frame el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allTests().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Tests
  * @param coll a collection ofFrames to add to the collection in 
  *           Tests
  * @seealso #appendTests(Frame)
  */
public void appendTests(java.util.Collection  coll)
  {
  __setDirty(true);
  allTests().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Tests
  * This insertion function inserts a new element in the
  * collection in Tests
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertTests(int idx, Frame el)
  {
  __setDirty(true);
  allTests().add (idx, el);
  }

/** Part of the list interface for Tests
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfTests(xmlBBaseInter el)
  {
  return allTests().indexOf (el);
  }

/** Part of the list interface for Tests
  * This deletion function removes an element from the
  * collection in Tests
  * @param idx the index of the element to remove
  */
public void deleteTests(int idx)
  {
  __setDirty(true);
  allTests().remove(idx);
  }

public void SortTests()
  {
//-> hostname : Frame
Collections.sort(allTests(), new Comparator<Frame>() {
public int compare( Frame o1, Frame o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Tests
  * This deletion function removes an element from the
  * collection in Tests
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeTests(xmlBBaseInter obj)
  {
  int idx = indexOfTests(obj);
  if (idx >= 0) { deleteTests(idx);
   }
  }

/** Part of the list interface for Tests
  * @return the number of elements in Tests
  */
public int countTests()
  {
  return allTests().size();
  }

/** Part of the list interface for Tests
  * This function returns an element from the
  * collection in Tests based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Frame getTests(int idx)
{
  return (Frame) ( allTests().get(idx));
}

private  TranslationDictionary aTranslationDictionary;

public  TranslationDictionary getTranslationDictionary() { return aTranslationDictionary;}

public  void setTranslationDictionary(TranslationDictionary v) {
  __setDirty ( __getDirty() || (getTranslationDictionary() != v));
  aTranslationDictionary = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  ShortcutDictionary aShortcutDictionary;

public  ShortcutDictionary getShortcutDictionary() { return aShortcutDictionary;}

public  void setShortcutDictionary(ShortcutDictionary v) {
  __setDirty ( __getDirty() || (getShortcutDictionary() != v));
  aShortcutDictionary = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private   String  aXsi;

public   String  getXsi() { return aXsi;}

public  void setXsi( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getXsi())));
} else {
  __setDirty ( __getDirty() || (getXsi() != null));
} // If
  aXsi = v;
}

private   String  aXsiLocation;

public   String  getXsiLocation() { return aXsiLocation;}

public  void setXsiLocation( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getXsiLocation())));
} else {
  __setDirty ( __getDirty() || (getXsiLocation() != null));
} // If
  aXsiLocation = v;
}

public Dictionary()
{
Dictionary obj = this;
aSpecification=(null);
aRuleDisablings=(null);
aNameSpaces=(null);
aTests=(null);
aTranslationDictionary=(null);
aShortcutDictionary=(null);
aXsi=(null);
aXsiLocation=(null);
}

public void copyTo(Dictionary other)
{
other.aSpecification = aSpecification;
other.aRuleDisablings = aRuleDisablings;
other.aNameSpaces = aNameSpaces;
other.aTests = aTests;
other.aTranslationDictionary = aTranslationDictionary;
other.aShortcutDictionary = aShortcutDictionary;
other.aXsi = aXsi;
other.aXsiLocation = aXsiLocation;
}

  boolean __dirty = false;

public void __setDirty(boolean val)
{
  __dirty = val;
}

public boolean __getDirty()
{
  return __dirty;
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
boolean fl134;
RuleDisabling fl136;
boolean fl147;
NameSpace fl149;
boolean fl160;
Frame fl162;

ctxt.skipWhiteSpace();
// Element Ref : Specification
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<Specification")){
// Parsing sub element
this.setSpecification(acceptor.lAccept_Specification(ctxt,"</Specification>"));
setSon(this.getSpecification());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<RuleDisabling")){
ctxt.skipWhiteSpace();
fl134 = true ; 
while (fl134) { // BeginLoop 
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
fl134 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl136 = null;
while(ctxt.lookAheadOpeningTag ("<RuleDisabling")) {
fl136 = acceptor.lAccept_RuleDisabling(ctxt, "</RuleDisabling>");
appendRuleDisablings(fl136);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</RuleDisabling>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Enclosed
ctxt.acceptString ("<NameSpaces");
if (ctxt.isAlNum()){
ctxt.fail ("White space expected after TAG");
} // If
ctxt.skipWhiteSpace();
fl147 = true ; 
while (fl147) { // BeginLoop 
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
fl147 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl149 = null;
while(ctxt.lookAheadOpeningTag ("<NameSpace")) {
fl149 = acceptor.lAccept_NameSpace(ctxt, "</NameSpace>");
appendNameSpaces(fl149);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</NameSpaces>");
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Tests")){
ctxt.skipWhiteSpace();
fl160 = true ; 
while (fl160) { // BeginLoop 
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
fl160 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl162 = null;
while(ctxt.lookAheadOpeningTag ("<Frame")) {
fl162 = acceptor.lAccept_Frame(ctxt, "</Frame>");
appendTests(fl162);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Tests>");
} // If
} // If
// End enclosed
// Element Ref : TranslationDictionary
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<TranslationDictionary")){
// Parsing sub element
this.setTranslationDictionary(acceptor.lAccept_TranslationDictionary(ctxt,"</TranslationDictionary>"));
setSon(this.getTranslationDictionary());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
// Element Ref : ShortcutDictionary
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<ShortcutDictionary")){
// Parsing sub element
this.setShortcutDictionary(acceptor.lAccept_ShortcutDictionary(ctxt,"</ShortcutDictionary>"));
setSon(this.getShortcutDictionary());
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
boolean fl173;
boolean fl174;
boolean fl175;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl173 = false ; 
fl174 = false ; 
fl175 = true ; 
while (fl175) { // BeginLoop 
switch (ctxt.current()) {
case 'x':
{
ctxt.advance();
switch (ctxt.current()) {
case 's':
{
ctxt.advance();
if (ctxt.lookAheadString("i:noNamespaceSchemaLocation=")){
indicator = 174;
} else {
indicator = 176;
} // If
break;
} // Case
case 'm':
{
ctxt.advance();
if (ctxt.lookAheadString("lns:xsi=")){
indicator = 173;
} else {
indicator = 176;
} // If
break;
} // Case
default:
indicator = 176;
break;
} // Switch
break;
} // Case
default:
indicator = 176;
break;
} // Switch
switch (indicator) {
case 173: {
// Handling attribute xmlns:xsi
// Also handles alien attributes with prefix xmlns:xsi
if (fl173){
ctxt.fail ("Duplicate attribute: xmlns:xsi");
} // If
fl173 = true ; 
quoteChar = ctxt.acceptQuote();
this.setXsi((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 174: {
// Handling attribute xsi:noNamespaceSchemaLocation
// Also handles alien attributes with prefix xsi:noNamespaceSchemaLocation
if (fl174){
ctxt.fail ("Duplicate attribute: xsi:noNamespaceSchemaLocation");
} // If
fl174 = true ; 
quoteChar = ctxt.acceptQuote();
this.setXsiLocation((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 176: {
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
if (!fl173){
ctxt.fail ("Mandatory attribute missing: xmlns:xsi in Dictionary");
} // If
if (!fl174){
ctxt.fail ("Mandatory attribute missing: xsi:noNamespaceSchemaLocation in Dictionary");
} // If
fl175 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</Dictionary>");
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

pw.print("<Dictionary");
if (typeId){
pw.print(" xsi:type=\"Dictionary\"");
} // If
pw.println();
pw.print(" xmlns:xsi=\"");
acceptor.unParsePcData(pw, this.getXsi());
pw.print('"');
pw.println();
pw.print(" xsi:noNamespaceSchemaLocation=\"");
acceptor.unParsePcData(pw, this.getXsiLocation());
pw.print('"');
pw.println();
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</Dictionary>");
pw.println();
}

/** <i>This method is used by XMLBooster-generated code
  * internally. Please refrain from using it, as it
  * might produce unexpected results, and might change
  * or even disappear in the future.</i>
  */
public void unParseBody(PrintWriter pw)
{
int i;

// Unparsing ElementRef
if (this.getSpecification() != null){
unParse(pw, this.getSpecification(),false,"<Specification","</Specification>");
} // If
// Unparsing Enclosed
// Testing for empty content: RuleDisablings
if (countRuleDisablings() > 0){
pw.print("<RuleDisabling>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getRuleDisablings(), false, "<RuleDisabling", "</RuleDisabling>");
pw.print("</RuleDisabling>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: RuleDisablings
// Unparsing Enclosed
pw.print("<NameSpaces>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getNameSpaces(), false, "<NameSpace", "</NameSpace>");
pw.print("</NameSpaces>");
// Father is not a mixed
pw.println();
// Unparsing Enclosed
// Testing for empty content: Tests
if (countTests() > 0){
pw.print("<Tests>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getTests(), false, "<Frame", "</Frame>");
pw.print("</Tests>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Tests
// Unparsing ElementRef
if (this.getTranslationDictionary() != null){
unParse(pw, this.getTranslationDictionary(),false,"<TranslationDictionary","</TranslationDictionary>");
} // If
// Unparsing ElementRef
if (this.getShortcutDictionary() != null){
unParse(pw, this.getShortcutDictionary(),false,"<ShortcutDictionary","</ShortcutDictionary>");
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
l.add(this.getSpecification());
for (int i = 0; i < countRuleDisablings(); i++) {
  l.add(getRuleDisablings(i));
}
for (int i = 0; i < countNameSpaces(); i++) {
  l.add(getNameSpaces(i));
}
for (int i = 0; i < countTests(); i++) {
  l.add(getTests(i));
}
l.add(this.getTranslationDictionary());
l.add(this.getShortcutDictionary());
}

}

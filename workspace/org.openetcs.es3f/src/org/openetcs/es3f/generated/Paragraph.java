
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Paragraph</i></h3>
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
public class Paragraph
extends org.openetcs.es3f.DataDictionary.ReferencesParagraph
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getId().compareToIgnoreCase((String) search) == 0)return true;
if(getBl().compareToIgnoreCase((String) search) == 0)return true;
if(getText().compareToIgnoreCase((String) search) == 0)return true;
if(getVersion().compareToIgnoreCase((String) search) == 0)return true;
if(getFunctionalBlockName().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aId;

public   String  getId() { return aId;}

public  void setId( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getId())));
} else {
  __setDirty ( __getDirty() || (getId() != null));
} // If
  aId = v;
}

private  int aType;

public  int getType() { return aType;}

public  void setType(int v) {
  __setDirty ( __getDirty() || (getType() != v));
  aType = v;
}

public  String   getType_AsString()
{
  return acceptor.Enum_Paragraph_type_ToString (aType);
}

public  boolean setType_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_Paragraph_type(v);
if (temp >= 0){
aType = temp;
return true;
} // If
return false;
}

private  int aScope;

public  int getScope() { return aScope;}

public  void setScope(int v) {
  __setDirty ( __getDirty() || (getScope() != v));
  aScope = v;
}

public  String   getScope_AsString()
{
  return acceptor.Enum_Paragraph_scope_ToString (aScope);
}

public  boolean setScope_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_Paragraph_scope(v);
if (temp >= 0){
aScope = temp;
return true;
} // If
return false;
}

private   String  aBl;

public   String  getBl() { return aBl;}

public  void setBl( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getBl())));
} else {
  __setDirty ( __getDirty() || (getBl() != null));
} // If
  aBl = v;
}

private  boolean aOptional;

public  boolean getOptional() { return aOptional;}

public  void setOptional(boolean v) {
  __setDirty ( __getDirty() || (getOptional() != v));
  aOptional = v;
}

private java.util.ArrayList  aTypeSpecs;

/** Part of the list interface for TypeSpecs
  * @return a collection of all the elements in TypeSpecs
  */
public java.util.ArrayList  allTypeSpecs()
  {
if (aTypeSpecs == null){
    setAllTypeSpecs( new java.util.ArrayList () );
} // If
    return aTypeSpecs;
  }

/** Part of the list interface for TypeSpecs
  * @return a collection of all the elements in TypeSpecs
  */
private java.util.ArrayList  getTypeSpecs()
  {
    return allTypeSpecs();
  }

/** Part of the list interface for TypeSpecs
  * @param coll a collection of elements which replaces 
  *        TypeSpecs's current content.
  */
public void setAllTypeSpecs(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aTypeSpecs = coll;
  }

/** Part of the list interface for TypeSpecs
  * @param el a TypeSpec to add to the collection in 
  *           TypeSpecs
  * @seealso #appendTypeSpecs(java.util.Collection )
  */
public void appendTypeSpecs(TypeSpec el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allTypeSpecs().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for TypeSpecs
  * @param coll a collection ofTypeSpecs to add to the collection in 
  *           TypeSpecs
  * @seealso #appendTypeSpecs(TypeSpec)
  */
public void appendTypeSpecs(java.util.Collection  coll)
  {
  __setDirty(true);
  allTypeSpecs().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for TypeSpecs
  * This insertion function inserts a new element in the
  * collection in TypeSpecs
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertTypeSpecs(int idx, TypeSpec el)
  {
  __setDirty(true);
  allTypeSpecs().add (idx, el);
  }

/** Part of the list interface for TypeSpecs
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfTypeSpecs(xmlBBaseInter el)
  {
  return allTypeSpecs().indexOf (el);
  }

/** Part of the list interface for TypeSpecs
  * This deletion function removes an element from the
  * collection in TypeSpecs
  * @param idx the index of the element to remove
  */
public void deleteTypeSpecs(int idx)
  {
  __setDirty(true);
  allTypeSpecs().remove(idx);
  }

public void SortTypeSpecs()
  {
//-> hostname : TypeSpec
}
/** Part of the list interface for TypeSpecs
  * This deletion function removes an element from the
  * collection in TypeSpecs
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeTypeSpecs(xmlBBaseInter obj)
  {
  int idx = indexOfTypeSpecs(obj);
  if (idx >= 0) { deleteTypeSpecs(idx);
   }
  }

/** Part of the list interface for TypeSpecs
  * @return the number of elements in TypeSpecs
  */
public int countTypeSpecs()
  {
  return allTypeSpecs().size();
  }

/** Part of the list interface for TypeSpecs
  * This function returns an element from the
  * collection in TypeSpecs based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public TypeSpec getTypeSpecs(int idx)
{
  return (TypeSpec) ( allTypeSpecs().get(idx));
}

private   String  aText;

public   String  getText() { return aText;}

public  void setText( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getText())));
} else {
  __setDirty ( __getDirty() || (getText() != null));
} // If
  aText = v;
}

private   String  aVersion;

public   String  getVersion() { return aVersion;}

public  void setVersion( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getVersion())));
} else {
  __setDirty ( __getDirty() || (getVersion() != null));
} // If
  aVersion = v;
}

private  boolean aReviewed;

public  boolean getReviewed() { return aReviewed;}

public  void setReviewed(boolean v) {
  __setDirty ( __getDirty() || (getReviewed() != v));
  aReviewed = v;
}

private  int aImplementationStatus;

public  int getImplementationStatus() { return aImplementationStatus;}

public  void setImplementationStatus(int v) {
  __setDirty ( __getDirty() || (getImplementationStatus() != v));
  aImplementationStatus = v;
}

public  String   getImplementationStatus_AsString()
{
  return acceptor.Enum_SPEC_IMPLEMENTED_ENUM_ToString (aImplementationStatus);
}

public  boolean setImplementationStatus_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_SPEC_IMPLEMENTED_ENUM(v);
if (temp >= 0){
aImplementationStatus = temp;
return true;
} // If
return false;
}

private java.util.ArrayList  aParagraphs;

/** Part of the list interface for Paragraphs
  * @return a collection of all the elements in Paragraphs
  */
public java.util.ArrayList  allParagraphs()
  {
if (aParagraphs == null){
    setAllParagraphs( new java.util.ArrayList () );
} // If
    return aParagraphs;
  }

/** Part of the list interface for Paragraphs
  * @return a collection of all the elements in Paragraphs
  */
private java.util.ArrayList  getParagraphs()
  {
    return allParagraphs();
  }

/** Part of the list interface for Paragraphs
  * @param coll a collection of elements which replaces 
  *        Paragraphs's current content.
  */
public void setAllParagraphs(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aParagraphs = coll;
  }

/** Part of the list interface for Paragraphs
  * @param el a Paragraph to add to the collection in 
  *           Paragraphs
  * @seealso #appendParagraphs(java.util.Collection )
  */
public void appendParagraphs(Paragraph el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allParagraphs().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Paragraphs
  * @param coll a collection ofParagraphs to add to the collection in 
  *           Paragraphs
  * @seealso #appendParagraphs(Paragraph)
  */
public void appendParagraphs(java.util.Collection  coll)
  {
  __setDirty(true);
  allParagraphs().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Paragraphs
  * This insertion function inserts a new element in the
  * collection in Paragraphs
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertParagraphs(int idx, Paragraph el)
  {
  __setDirty(true);
  allParagraphs().add (idx, el);
  }

/** Part of the list interface for Paragraphs
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfParagraphs(xmlBBaseInter el)
  {
  return allParagraphs().indexOf (el);
  }

/** Part of the list interface for Paragraphs
  * This deletion function removes an element from the
  * collection in Paragraphs
  * @param idx the index of the element to remove
  */
public void deleteParagraphs(int idx)
  {
  __setDirty(true);
  allParagraphs().remove(idx);
  }

public void SortParagraphs()
  {
//-> hostname : Paragraph
Collections.sort(allParagraphs(), new Comparator<Paragraph>() {
public int compare( Paragraph o1, Paragraph o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Paragraphs
  * This deletion function removes an element from the
  * collection in Paragraphs
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeParagraphs(xmlBBaseInter obj)
  {
  int idx = indexOfParagraphs(obj);
  if (idx >= 0) { deleteParagraphs(idx);
   }
  }

/** Part of the list interface for Paragraphs
  * @return the number of elements in Paragraphs
  */
public int countParagraphs()
  {
  return allParagraphs().size();
  }

/** Part of the list interface for Paragraphs
  * This function returns an element from the
  * collection in Paragraphs based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Paragraph getParagraphs(int idx)
{
  return (Paragraph) ( allParagraphs().get(idx));
}

private  ParagraphRevision aRevision;

public  ParagraphRevision getRevision() { return aRevision;}

public  void setRevision(ParagraphRevision v) {
  __setDirty ( __getDirty() || (getRevision() != v));
  aRevision = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  Message aMessage;

public  Message getMessage() { return aMessage;}

public  void setMessage(Message v) {
  __setDirty ( __getDirty() || (getMessage() != v));
  aMessage = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  boolean aMoreInfoRequired;

public  boolean getMoreInfoRequired() { return aMoreInfoRequired;}

public  void setMoreInfoRequired(boolean v) {
  __setDirty ( __getDirty() || (getMoreInfoRequired() != v));
  aMoreInfoRequired = v;
}

private  boolean aSpecIssue;

public  boolean getSpecIssue() { return aSpecIssue;}

public  void setSpecIssue(boolean v) {
  __setDirty ( __getDirty() || (getSpecIssue() != v));
  aSpecIssue = v;
}

private  boolean aFunctionalBlock;

public  boolean getFunctionalBlock() { return aFunctionalBlock;}

public  void setFunctionalBlock(boolean v) {
  __setDirty ( __getDirty() || (getFunctionalBlock() != v));
  aFunctionalBlock = v;
}

private   String  aFunctionalBlockName;

public   String  getFunctionalBlockName() { return aFunctionalBlockName;}

public  void setFunctionalBlockName( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getFunctionalBlockName())));
} else {
  __setDirty ( __getDirty() || (getFunctionalBlockName() != null));
} // If
  aFunctionalBlockName = v;
}

public Paragraph()
{
Paragraph obj = this;
aId=(null);
aType=(0);
aScope=(0);
aBl=(null);
aOptional=(false);
aTypeSpecs=(null);
aText=(null);
aVersion=(null);
aReviewed=(false);
aImplementationStatus=(0);
aParagraphs=(null);
aRevision=(null);
aMessage=(null);
aMoreInfoRequired=(false);
aSpecIssue=(false);
aFunctionalBlock=(false);
aFunctionalBlockName=(null);
}

public void copyTo(Paragraph other)
{
super.copyTo(other);
other.aId = aId;
other.aType = aType;
other.aScope = aScope;
other.aBl = aBl;
other.aOptional = aOptional;
other.aTypeSpecs = aTypeSpecs;
other.aText = aText;
other.aVersion = aVersion;
other.aReviewed = aReviewed;
other.aImplementationStatus = aImplementationStatus;
other.aParagraphs = aParagraphs;
other.aRevision = aRevision;
other.aMessage = aMessage;
other.aMoreInfoRequired = aMoreInfoRequired;
other.aSpecIssue = aSpecIssue;
other.aFunctionalBlock = aFunctionalBlock;
other.aFunctionalBlockName = aFunctionalBlockName;
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
boolean fl1283;
Paragraph fl1285;
TypeSpec fl1297;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
// Indicator
// Parse PC data
this.setText(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
// Element Ref : Message
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<Message")){
// Parsing sub element
this.setMessage(acceptor.lAccept_Message(ctxt,null));
setSon(this.getMessage());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
// Element Ref : ParagraphRevision
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<ParagraphRevision")){
// Parsing sub element
this.setRevision(acceptor.lAccept_ParagraphRevision(ctxt,null));
setSon(this.getRevision());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Sub")){
ctxt.skipWhiteSpace();
fl1283 = true ; 
while (fl1283) { // BeginLoop 
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
fl1283 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1285 = null;
while(ctxt.lookAheadOpeningTag ("<Paragraph")) {
fl1285 = acceptor.lAccept_Paragraph(ctxt, "</Paragraph>");
appendParagraphs(fl1285);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Sub>");
} // If
} // If
// End enclosed
// Repeat
ctxt.skipWhiteSpace();
fl1297 = null;
while(ctxt.lookAheadOpeningTag ("<TypeSpec")) {
fl1297 = acceptor.lAccept_TypeSpec(ctxt, null);
appendTypeSpecs(fl1297);
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
boolean fl1308;
boolean fl1309;
boolean fl1310;
boolean fl1311;
boolean fl1312;
boolean fl1313;
boolean fl1314;
boolean fl1315;
boolean fl1316;
boolean fl1317;
boolean fl1318;
boolean fl1319;
boolean fl1320;
boolean fl1321;
boolean fl1322;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1308 = false ; 
fl1309 = false ; 
fl1310 = false ; 
fl1311 = false ; 
fl1312 = false ; 
fl1313 = false ; 
fl1314 = false ; 
fl1315 = false ; 
fl1316 = false ; 
fl1317 = false ; 
fl1318 = false ; 
fl1319 = false ; 
fl1320 = false ; 
fl1321 = false ; 
fl1322 = true ; 
while (fl1322) { // BeginLoop 
switch (ctxt.current()) {
case 'v':
{
ctxt.advance();
if (ctxt.lookAheadString("ersion=")){
indicator = 1316;
} else {
indicator = 1323;
} // If
break;
} // Case
case 't':
{
ctxt.advance();
if (ctxt.lookAheadString("ype=")){
indicator = 1309;
} else {
indicator = 1323;
} // If
break;
} // Case
case 's':
{
ctxt.advance();
switch (ctxt.current()) {
case 't':
{
ctxt.advance();
if (ctxt.lookAheadString("atus=")){
indicator = 1315;
} else {
indicator = 1323;
} // If
break;
} // Case
case 'p':
{
ctxt.advance();
if (ctxt.lookAheadString("ecIssue=")){
indicator = 1318;
} else {
indicator = 1323;
} // If
break;
} // Case
case 'c':
{
ctxt.advance();
if (ctxt.lookAheadString("ope=")){
indicator = 1310;
} else {
indicator = 1323;
} // If
break;
} // Case
default:
indicator = 1323;
break;
} // Switch
break;
} // Case
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("eviewed=")){
indicator = 1314;
} else {
indicator = 1323;
} // If
break;
} // Case
case 'o':
{
ctxt.advance();
if (ctxt.lookAheadString("ptional=")){
indicator = 1312;
} else {
indicator = 1323;
} // If
break;
} // Case
case 'n':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1313;
} else {
indicator = 1323;
} // If
break;
} // Case
case 'i':
{
ctxt.advance();
switch (ctxt.current()) {
case 'n':
{
ctxt.advance();
if (ctxt.lookAheadString("foRequired=")){
indicator = 1317;
} else {
indicator = 1323;
} // If
break;
} // Case
case 'd':
{
ctxt.advance();
if (ctxt.lookAhead1('=')){
indicator = 1308;
} else {
indicator = 1323;
} // If
break;
} // Case
default:
indicator = 1323;
break;
} // Switch
break;
} // Case
case 'f':
{
ctxt.advance();
if (ctxt.lookAheadString("unctionalBlock")){
switch (ctxt.current()) {
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1320;
} else {
indicator = 1323;
} // If
break;
} // Case
case '=':
{
ctxt.advance();
indicator = 1319;
break;
} // Case
default:
indicator = 1323;
break;
} // Switch
} else {
indicator = 1323;
} // If
break;
} // Case
case 'b':
{
ctxt.advance();
if (ctxt.lookAhead2('l','=')){
indicator = 1311;
} else {
indicator = 1323;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1321;
} else {
indicator = 1323;
} // If
break;
} // Case
default:
indicator = 1323;
break;
} // Switch
switch (indicator) {
case 1308: {
// Handling attribute id
// Also handles alien attributes with prefix id
if (fl1308){
ctxt.fail ("Duplicate attribute: id");
} // If
fl1308 = true ; 
quoteChar = ctxt.acceptQuote();
this.setId((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1309: {
// Handling attribute type
// Also handles alien attributes with prefix type
if (fl1309){
ctxt.fail ("Duplicate attribute: type");
} // If
fl1309 = true ; 
quoteChar = ctxt.acceptQuote();
this.setType(acceptor.lAcceptEnum_Paragraph_type(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1310: {
// Handling attribute scope
// Also handles alien attributes with prefix scope
if (fl1310){
ctxt.fail ("Duplicate attribute: scope");
} // If
fl1310 = true ; 
quoteChar = ctxt.acceptQuote();
this.setScope(acceptor.lAcceptEnum_Paragraph_scope(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1311: {
// Handling attribute bl
// Also handles alien attributes with prefix bl
if (fl1311){
ctxt.fail ("Duplicate attribute: bl");
} // If
fl1311 = true ; 
quoteChar = ctxt.acceptQuote();
this.setBl((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1312: {
// Handling attribute optional
// Also handles alien attributes with prefix optional
if (fl1312){
ctxt.fail ("Duplicate attribute: optional");
} // If
fl1312 = true ; 
quoteChar = ctxt.acceptQuote();
this.setOptional(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1313: {
// Handling attribute name
// Also handles alien attributes with prefix name
if (fl1313){
ctxt.fail ("Duplicate attribute: name");
} // If
fl1313 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1314: {
// Handling attribute reviewed
// Also handles alien attributes with prefix reviewed
if (fl1314){
ctxt.fail ("Duplicate attribute: reviewed");
} // If
fl1314 = true ; 
quoteChar = ctxt.acceptQuote();
this.setReviewed(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1315: {
// Handling attribute status
// Also handles alien attributes with prefix status
if (fl1315){
ctxt.fail ("Duplicate attribute: status");
} // If
fl1315 = true ; 
quoteChar = ctxt.acceptQuote();
this.setImplementationStatus(acceptor.lAcceptEnum_SPEC_IMPLEMENTED_ENUM(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1316: {
// Handling attribute version
// Also handles alien attributes with prefix version
if (fl1316){
ctxt.fail ("Duplicate attribute: version");
} // If
fl1316 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVersion((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1317: {
// Handling attribute infoRequired
// Also handles alien attributes with prefix infoRequired
if (fl1317){
ctxt.fail ("Duplicate attribute: infoRequired");
} // If
fl1317 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMoreInfoRequired(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1318: {
// Handling attribute specIssue
// Also handles alien attributes with prefix specIssue
if (fl1318){
ctxt.fail ("Duplicate attribute: specIssue");
} // If
fl1318 = true ; 
quoteChar = ctxt.acceptQuote();
this.setSpecIssue(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1319: {
// Handling attribute functionalBlock
// Also handles alien attributes with prefix functionalBlock
if (fl1319){
ctxt.fail ("Duplicate attribute: functionalBlock");
} // If
fl1319 = true ; 
quoteChar = ctxt.acceptQuote();
this.setFunctionalBlock(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1320: {
// Handling attribute functionalBlockName
// Also handles alien attributes with prefix functionalBlockName
if (fl1320){
ctxt.fail ("Duplicate attribute: functionalBlockName");
} // If
fl1320 = true ; 
quoteChar = ctxt.acceptQuote();
this.setFunctionalBlockName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1321: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1321){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1321 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1323: {
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
if (!fl1308){
ctxt.fail ("Mandatory attribute missing: id in Paragraph");
} // If
if (!fl1309){
this.setType(acceptor.aREQUIREMENT);
} // If
if (!fl1310){
this.setScope(acceptor.aOBU_AND_TRACK);
} // If
if (!fl1311){
this.setBl("");
} // If
if (!fl1312){
this.setOptional( true);
} // If
if (!fl1313){
this.setName("");
} // If
if (!fl1314){
this.setReviewed( false);
} // If
if (!fl1315){
this.setImplementationStatus(acceptor.Impl_NA);
} // If
if (!fl1316){
this.setVersion("3.0.0");
} // If
if (!fl1317){
this.setMoreInfoRequired( false);
} // If
if (!fl1318){
this.setSpecIssue( false);
} // If
if (!fl1319){
this.setFunctionalBlock( false);
} // If
if (!fl1320){
this.setFunctionalBlockName("");
} // If
fl1322 = false ; 
} // If
break;
} // End of dispatch label
} // Dispatch
} // While
}
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString(endingTag);
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
  headingTag = "<Paragraph";
  endingTag = "</Paragraph>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Paragraph\"");
} // If
pw.println();
pw.print(" id=\"");
acceptor.unParsePcData(pw, this.getId());
pw.print('"');
pw.println();
if (this.getType() != 0){
pw.print(" type=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_Paragraph_type_ToString(this.getType()));
pw.print('"');
pw.println();
} // If
if (this.getScope() != 0){
pw.print(" scope=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_Paragraph_scope_ToString(this.getScope()));
pw.print('"');
pw.println();
} // If
if (this.getBl() != null){
pw.print(" bl=\"");
acceptor.unParsePcData(pw, this.getBl());
pw.print('"');
pw.println();
} // If
if (!this.getOptional()){
pw.print(" optional=\"");
acceptor.unParsePcData(pw, this.getOptional());
pw.print('"');
pw.println();
} // If
if (this.getName() != null){
pw.print(" name=\"");
acceptor.unParsePcData(pw, this.getName());
pw.print('"');
pw.println();
} // If
if (this.getReviewed()){
pw.print(" reviewed=\"");
acceptor.unParsePcData(pw, this.getReviewed());
pw.print('"');
pw.println();
} // If
if (this.getImplementationStatus() != 0){
pw.print(" status=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_SPEC_IMPLEMENTED_ENUM_ToString(this.getImplementationStatus()));
pw.print('"');
pw.println();
} // If
if (this.getVersion() != null){
pw.print(" version=\"");
acceptor.unParsePcData(pw, this.getVersion());
pw.print('"');
pw.println();
} // If
if (this.getMoreInfoRequired()){
pw.print(" infoRequired=\"");
acceptor.unParsePcData(pw, this.getMoreInfoRequired());
pw.print('"');
pw.println();
} // If
if (this.getSpecIssue()){
pw.print(" specIssue=\"");
acceptor.unParsePcData(pw, this.getSpecIssue());
pw.print('"');
pw.println();
} // If
if (this.getFunctionalBlock()){
pw.print(" functionalBlock=\"");
acceptor.unParsePcData(pw, this.getFunctionalBlock());
pw.print('"');
pw.println();
} // If
if (this.getFunctionalBlockName() != null){
pw.print(" functionalBlockName=\"");
acceptor.unParsePcData(pw, this.getFunctionalBlockName());
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
// Unparsing PcData
acceptor.unParsePcData(pw, this.getText());
// Unparsing ElementRef
if (this.getMessage() != null){
unParse(pw, this.getMessage(), false, null, null);
} // If
// Unparsing ElementRef
if (this.getRevision() != null){
unParse(pw, this.getRevision(), false, null, null);
} // If
// Unparsing Enclosed
// Testing for empty content: Paragraphs
if (countParagraphs() > 0){
pw.print("<Sub>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getParagraphs(), false, "<Paragraph", "</Paragraph>");
pw.print("</Sub>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Paragraphs
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getTypeSpecs(), false, null, null);
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
for (int i = 0; i < countTypeSpecs(); i++) {
  l.add(getTypeSpecs(i));
}
for (int i = 0; i < countParagraphs(); i++) {
  l.add(getParagraphs(i));
}
l.add(this.getRevision());
l.add(this.getMessage());
}

}

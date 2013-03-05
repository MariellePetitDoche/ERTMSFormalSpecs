
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Step</i></h3>
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
public class Step
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getDescription().compareToIgnoreCase((String) search) == 0)return true;
if(getComment().compareToIgnoreCase((String) search) == 0)return true;
if(getUserComment().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private  int aTCS_Order;

public  int getTCS_Order() { return aTCS_Order;}

public  void setTCS_Order(int v) {
  __setDirty ( __getDirty() || (getTCS_Order() != v));
  aTCS_Order = v;
}

private  int aDistance;

public  int getDistance() { return aDistance;}

public  void setDistance(int v) {
  __setDirty ( __getDirty() || (getDistance() != v));
  aDistance = v;
}

private   String  aDescription;

public   String  getDescription() { return aDescription;}

public  void setDescription( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getDescription())));
} else {
  __setDirty ( __getDirty() || (getDescription() != null));
} // If
  aDescription = v;
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

private   String  aUserComment;

public   String  getUserComment() { return aUserComment;}

public  void setUserComment( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getUserComment())));
} else {
  __setDirty ( __getDirty() || (getUserComment() != null));
} // If
  aUserComment = v;
}

private  int aIO;

public  int getIO() { return aIO;}

public  void setIO(int v) {
  __setDirty ( __getDirty() || (getIO() != v));
  aIO = v;
}

public  String   getIO_AsString()
{
  return acceptor.Enum_ST_IO_ToString (aIO);
}

public  boolean setIO_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_ST_IO(v);
if (temp >= 0){
aIO = temp;
return true;
} // If
return false;
}

private  int aInterface;

public  int getInterface() { return aInterface;}

public  void setInterface(int v) {
  __setDirty ( __getDirty() || (getInterface() != v));
  aInterface = v;
}

public  String   getInterface_AsString()
{
  return acceptor.Enum_ST_INTERFACE_ToString (aInterface);
}

public  boolean setInterface_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_ST_INTERFACE(v);
if (temp >= 0){
aInterface = temp;
return true;
} // If
return false;
}

private  int aLevelIN;

public  int getLevelIN() { return aLevelIN;}

public  void setLevelIN(int v) {
  __setDirty ( __getDirty() || (getLevelIN() != v));
  aLevelIN = v;
}

public  String   getLevelIN_AsString()
{
  return acceptor.Enum_ST_LEVEL_ToString (aLevelIN);
}

public  boolean setLevelIN_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_ST_LEVEL(v);
if (temp >= 0){
aLevelIN = temp;
return true;
} // If
return false;
}

private  int aLevelOUT;

public  int getLevelOUT() { return aLevelOUT;}

public  void setLevelOUT(int v) {
  __setDirty ( __getDirty() || (getLevelOUT() != v));
  aLevelOUT = v;
}

public  String   getLevelOUT_AsString()
{
  return acceptor.Enum_ST_LEVEL_ToString (aLevelOUT);
}

public  boolean setLevelOUT_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_ST_LEVEL(v);
if (temp >= 0){
aLevelOUT = temp;
return true;
} // If
return false;
}

private  int aModeIN;

public  int getModeIN() { return aModeIN;}

public  void setModeIN(int v) {
  __setDirty ( __getDirty() || (getModeIN() != v));
  aModeIN = v;
}

public  String   getModeIN_AsString()
{
  return acceptor.Enum_ST_MODE_ToString (aModeIN);
}

public  boolean setModeIN_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_ST_MODE(v);
if (temp >= 0){
aModeIN = temp;
return true;
} // If
return false;
}

private  int aModeOUT;

public  int getModeOUT() { return aModeOUT;}

public  void setModeOUT(int v) {
  __setDirty ( __getDirty() || (getModeOUT() != v));
  aModeOUT = v;
}

public  String   getModeOUT_AsString()
{
  return acceptor.Enum_ST_MODE_ToString (aModeOUT);
}

public  boolean setModeOUT_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_ST_MODE(v);
if (temp >= 0){
aModeOUT = temp;
return true;
} // If
return false;
}

private  boolean aTranslationRequired;

public  boolean getTranslationRequired() { return aTranslationRequired;}

public  void setTranslationRequired(boolean v) {
  __setDirty ( __getDirty() || (getTranslationRequired() != v));
  aTranslationRequired = v;
}

private  boolean aTranslated;

public  boolean getTranslated() { return aTranslated;}

public  void setTranslated(boolean v) {
  __setDirty ( __getDirty() || (getTranslated() != v));
  aTranslated = v;
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

private java.util.ArrayList  aMessages;

/** Part of the list interface for Messages
  * @return a collection of all the elements in Messages
  */
public java.util.ArrayList  allMessages()
  {
if (aMessages == null){
    setAllMessages( new java.util.ArrayList () );
} // If
    return aMessages;
  }

/** Part of the list interface for Messages
  * @return a collection of all the elements in Messages
  */
private java.util.ArrayList  getMessages()
  {
    return allMessages();
  }

/** Part of the list interface for Messages
  * @param coll a collection of elements which replaces 
  *        Messages's current content.
  */
public void setAllMessages(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aMessages = coll;
  }

/** Part of the list interface for Messages
  * @param el a DBMessage to add to the collection in 
  *           Messages
  * @seealso #appendMessages(java.util.Collection )
  */
public void appendMessages(DBMessage el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allMessages().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Messages
  * @param coll a collection ofDBMessages to add to the collection in 
  *           Messages
  * @seealso #appendMessages(DBMessage)
  */
public void appendMessages(java.util.Collection  coll)
  {
  __setDirty(true);
  allMessages().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Messages
  * This insertion function inserts a new element in the
  * collection in Messages
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertMessages(int idx, DBMessage el)
  {
  __setDirty(true);
  allMessages().add (idx, el);
  }

/** Part of the list interface for Messages
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfMessages(xmlBBaseInter el)
  {
  return allMessages().indexOf (el);
  }

/** Part of the list interface for Messages
  * This deletion function removes an element from the
  * collection in Messages
  * @param idx the index of the element to remove
  */
public void deleteMessages(int idx)
  {
  __setDirty(true);
  allMessages().remove(idx);
  }

public void SortMessages()
  {
//-> hostname : DBMessage
Collections.sort(allMessages(), new Comparator<DBMessage>() {
public int compare( DBMessage o1, DBMessage o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Messages
  * This deletion function removes an element from the
  * collection in Messages
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeMessages(xmlBBaseInter obj)
  {
  int idx = indexOfMessages(obj);
  if (idx >= 0) { deleteMessages(idx);
   }
  }

/** Part of the list interface for Messages
  * @return the number of elements in Messages
  */
public int countMessages()
  {
  return allMessages().size();
  }

/** Part of the list interface for Messages
  * This function returns an element from the
  * collection in Messages based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public DBMessage getMessages(int idx)
{
  return (DBMessage) ( allMessages().get(idx));
}

public Step()
{
Step obj = this;
aTCS_Order=(0);
aDistance=(0);
aDescription=(null);
aComment=(null);
aUserComment=(null);
aIO=(0);
aInterface=(0);
aLevelIN=(0);
aLevelOUT=(0);
aModeIN=(0);
aModeOUT=(0);
aTranslationRequired=(false);
aTranslated=(false);
aSubSteps=(null);
aMessages=(null);
}

public void copyTo(Step other)
{
super.copyTo(other);
other.aTCS_Order = aTCS_Order;
other.aDistance = aDistance;
other.aDescription = aDescription;
other.aComment = aComment;
other.aUserComment = aUserComment;
other.aIO = aIO;
other.aInterface = aInterface;
other.aLevelIN = aLevelIN;
other.aLevelOUT = aLevelOUT;
other.aModeIN = aModeIN;
other.aModeOUT = aModeOUT;
other.aTranslationRequired = aTranslationRequired;
other.aTranslated = aTranslated;
other.aSubSteps = aSubSteps;
other.aMessages = aMessages;
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
boolean fl909;
boolean fl910;
boolean fl911;
boolean fl912;
SubStep fl914;
boolean fl925;
DBMessage fl927;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Description")){
ctxt.skipWhiteSpace();
fl909 = true ; 
while (fl909) { // BeginLoop 
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
fl909 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setDescription(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Description>");
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Comment")){
ctxt.skipWhiteSpace();
fl910 = true ; 
while (fl910) { // BeginLoop 
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
fl910 = false ; 
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
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<UserComment")){
ctxt.skipWhiteSpace();
fl911 = true ; 
while (fl911) { // BeginLoop 
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
fl911 = false ; 
} // If
} // While
ctxt.accept('>');
// Indicator
// Parse PC data
this.setUserComment(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
ctxt.skipWhiteSpace();
ctxt.acceptString ("</UserComment>");
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<SubSteps")){
ctxt.skipWhiteSpace();
fl912 = true ; 
while (fl912) { // BeginLoop 
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
fl912 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl914 = null;
while(ctxt.lookAheadOpeningTag ("<SubStep")) {
fl914 = acceptor.lAccept_SubStep(ctxt, "</SubStep>");
appendSubSteps(fl914);
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
if (ctxt.lookAheadOpeningTag("<Messsages")){
ctxt.skipWhiteSpace();
fl925 = true ; 
while (fl925) { // BeginLoop 
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
fl925 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl927 = null;
while(ctxt.lookAheadOpeningTag ("<DBMessage")) {
fl927 = acceptor.lAccept_DBMessage(ctxt, "</DBMessage>");
appendMessages(fl927);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Messsages>");
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
boolean fl938;
boolean fl939;
boolean fl940;
boolean fl941;
boolean fl942;
boolean fl943;
boolean fl944;
boolean fl945;
boolean fl946;
boolean fl947;
boolean fl948;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl938 = false ; 
fl939 = false ; 
fl940 = false ; 
fl941 = false ; 
fl942 = false ; 
fl943 = false ; 
fl944 = false ; 
fl945 = false ; 
fl946 = false ; 
fl947 = false ; 
fl948 = true ; 
while (fl948) { // BeginLoop 
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
switch (ctxt.current()) {
case 'r':
{
ctxt.advance();
if (ctxt.lookAheadString("anslat")){
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
if (ctxt.lookAheadString("onRequired=")){
indicator = 945;
} else {
indicator = 949;
} // If
break;
} // Case
case 'e':
{
ctxt.advance();
if (ctxt.lookAhead2('d','=')){
indicator = 946;
} else {
indicator = 949;
} // If
break;
} // Case
default:
indicator = 949;
break;
} // Switch
} else {
indicator = 949;
} // If
break;
} // Case
case 'C':
{
ctxt.advance();
if (ctxt.lookAheadString("S_Order=")){
indicator = 938;
} else {
indicator = 949;
} // If
break;
} // Case
default:
indicator = 949;
break;
} // Switch
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 947;
} else {
indicator = 949;
} // If
break;
} // Case
case 'M':
{
ctxt.advance();
if (ctxt.lookAhead3('o','d','e')){
switch (ctxt.current()) {
case 'O':
{
ctxt.advance();
if (ctxt.lookAhead3('U','T','=')){
indicator = 944;
} else {
indicator = 949;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead2('N','=')){
indicator = 943;
} else {
indicator = 949;
} // If
break;
} // Case
default:
indicator = 949;
break;
} // Switch
} else {
indicator = 949;
} // If
break;
} // Case
case 'L':
{
ctxt.advance();
if (ctxt.lookAheadString("evel")){
switch (ctxt.current()) {
case 'O':
{
ctxt.advance();
if (ctxt.lookAhead3('U','T','=')){
indicator = 942;
} else {
indicator = 949;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead2('N','=')){
indicator = 941;
} else {
indicator = 949;
} // If
break;
} // Case
default:
indicator = 949;
break;
} // Switch
} else {
indicator = 949;
} // If
break;
} // Case
case 'I':
{
ctxt.advance();
if (ctxt.lookAhead2('O','=')){
indicator = 940;
} else {
indicator = 949;
} // If
break;
} // Case
case 'D':
{
ctxt.advance();
if (ctxt.lookAheadString("istance=")){
indicator = 939;
} else {
indicator = 949;
} // If
break;
} // Case
default:
indicator = 949;
break;
} // Switch
switch (indicator) {
case 938: {
// Handling attribute TCS_Order
// Also handles alien attributes with prefix TCS_Order
if (fl938){
ctxt.fail ("Duplicate attribute: TCS_Order");
} // If
fl938 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTCS_Order(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 939: {
// Handling attribute Distance
// Also handles alien attributes with prefix Distance
if (fl939){
ctxt.fail ("Duplicate attribute: Distance");
} // If
fl939 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDistance(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 940: {
// Handling attribute IO
// Also handles alien attributes with prefix IO
if (fl940){
ctxt.fail ("Duplicate attribute: IO");
} // If
fl940 = true ; 
quoteChar = ctxt.acceptQuote();
this.setIO(acceptor.lAcceptEnum_ST_IO(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 941: {
// Handling attribute LevelIN
// Also handles alien attributes with prefix LevelIN
if (fl941){
ctxt.fail ("Duplicate attribute: LevelIN");
} // If
fl941 = true ; 
quoteChar = ctxt.acceptQuote();
this.setLevelIN(acceptor.lAcceptEnum_ST_LEVEL(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 942: {
// Handling attribute LevelOUT
// Also handles alien attributes with prefix LevelOUT
if (fl942){
ctxt.fail ("Duplicate attribute: LevelOUT");
} // If
fl942 = true ; 
quoteChar = ctxt.acceptQuote();
this.setLevelOUT(acceptor.lAcceptEnum_ST_LEVEL(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 943: {
// Handling attribute ModeIN
// Also handles alien attributes with prefix ModeIN
if (fl943){
ctxt.fail ("Duplicate attribute: ModeIN");
} // If
fl943 = true ; 
quoteChar = ctxt.acceptQuote();
this.setModeIN(acceptor.lAcceptEnum_ST_MODE(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 944: {
// Handling attribute ModeOUT
// Also handles alien attributes with prefix ModeOUT
if (fl944){
ctxt.fail ("Duplicate attribute: ModeOUT");
} // If
fl944 = true ; 
quoteChar = ctxt.acceptQuote();
this.setModeOUT(acceptor.lAcceptEnum_ST_MODE(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 945: {
// Handling attribute TranslationRequired
// Also handles alien attributes with prefix TranslationRequired
if (fl945){
ctxt.fail ("Duplicate attribute: TranslationRequired");
} // If
fl945 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTranslationRequired(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 946: {
// Handling attribute Translated
// Also handles alien attributes with prefix Translated
if (fl946){
ctxt.fail ("Duplicate attribute: Translated");
} // If
fl946 = true ; 
quoteChar = ctxt.acceptQuote();
this.setTranslated(acceptor.lAcceptBoolean(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 947: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl947){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl947 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 949: {
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
if (!fl938){
this.setTCS_Order(0);
} // If
if (!fl939){
this.setDistance(0);
} // If
if (!fl940){
this.setIO(acceptor.StIO_NA);
} // If
if (!fl941){
this.setLevelIN(acceptor.StLevel_NA);
} // If
if (!fl942){
this.setLevelOUT(acceptor.StLevel_NA);
} // If
if (!fl943){
this.setModeIN(acceptor.Mode_NA);
} // If
if (!fl944){
this.setModeOUT(acceptor.Mode_NA);
} // If
if (!fl945){
this.setTranslationRequired( true);
} // If
if (!fl946){
this.setTranslated( false);
} // If
fl948 = false ; 
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
  headingTag = "<Step";
  endingTag = "</Step>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Step\"");
} // If
pw.println();
if (this.getTCS_Order() != 0){
pw.print(" TCS_Order=\"");
acceptor.unParsePcData(pw, this.getTCS_Order());
pw.print('"');
pw.println();
} // If
if (this.getDistance() != 0){
pw.print(" Distance=\"");
acceptor.unParsePcData(pw, this.getDistance());
pw.print('"');
pw.println();
} // If
if (this.getIO() != 0){
pw.print(" IO=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_ST_IO_ToString(this.getIO()));
pw.print('"');
pw.println();
} // If
if (this.getLevelIN() != 0){
pw.print(" LevelIN=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_ST_LEVEL_ToString(this.getLevelIN()));
pw.print('"');
pw.println();
} // If
if (this.getLevelOUT() != 0){
pw.print(" LevelOUT=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_ST_LEVEL_ToString(this.getLevelOUT()));
pw.print('"');
pw.println();
} // If
if (this.getModeIN() != 0){
pw.print(" ModeIN=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_ST_MODE_ToString(this.getModeIN()));
pw.print('"');
pw.println();
} // If
if (this.getModeOUT() != 0){
pw.print(" ModeOUT=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_ST_MODE_ToString(this.getModeOUT()));
pw.print('"');
pw.println();
} // If
if (!this.getTranslationRequired()){
pw.print(" TranslationRequired=\"");
acceptor.unParsePcData(pw, this.getTranslationRequired());
pw.print('"');
pw.println();
} // If
if (this.getTranslated()){
pw.print(" Translated=\"");
acceptor.unParsePcData(pw, this.getTranslated());
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
// Testing for empty content: Description
if (this.getDescription() != null){
pw.print("<Description>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getDescription());
pw.print("</Description>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Description
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
// Unparsing Enclosed
// Testing for empty content: UserComment
if (this.getUserComment() != null){
pw.print("<UserComment>");
// Unparsing PcData
acceptor.unParsePcData(pw, this.getUserComment());
pw.print("</UserComment>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: UserComment
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
// Testing for empty content: Messages
if (countMessages() > 0){
pw.print("<Messsages>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getMessages(), false, "<DBMessage", "</DBMessage>");
pw.print("</Messsages>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Messages
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
for (int i = 0; i < countSubSteps(); i++) {
  l.add(getSubSteps(i));
}
for (int i = 0; i < countMessages(); i++) {
  l.add(getMessages(i));
}
}

}

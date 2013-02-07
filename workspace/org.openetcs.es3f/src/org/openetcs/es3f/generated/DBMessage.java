
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>DBMessage</i></h3>
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
public class DBMessage
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  int aMessageOrder;

public  int getMessageOrder() { return aMessageOrder;}

public  void setMessageOrder(int v) {
  __setDirty ( __getDirty() || (getMessageOrder() != v));
  aMessageOrder = v;
}

private  int aMessageType;

public  int getMessageType() { return aMessageType;}

public  void setMessageType(int v) {
  __setDirty ( __getDirty() || (getMessageType() != v));
  aMessageType = v;
}

public  String   getMessageType_AsString()
{
  return acceptor.Enum_DBMessageType_ToString (aMessageType);
}

public  boolean setMessageType_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_DBMessageType(v);
if (temp >= 0){
aMessageType = temp;
return true;
} // If
return false;
}

private java.util.ArrayList  aFields;

/** Part of the list interface for Fields
  * @return a collection of all the elements in Fields
  */
public java.util.ArrayList  allFields()
  {
if (aFields == null){
    setAllFields( new java.util.ArrayList () );
} // If
    return aFields;
  }

/** Part of the list interface for Fields
  * @return a collection of all the elements in Fields
  */
private java.util.ArrayList  getFields()
  {
    return allFields();
  }

/** Part of the list interface for Fields
  * @param coll a collection of elements which replaces 
  *        Fields's current content.
  */
public void setAllFields(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aFields = coll;
  }

/** Part of the list interface for Fields
  * @param el a DBField to add to the collection in 
  *           Fields
  * @seealso #appendFields(java.util.Collection )
  */
public void appendFields(DBField el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allFields().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Fields
  * @param coll a collection ofDBFields to add to the collection in 
  *           Fields
  * @seealso #appendFields(DBField)
  */
public void appendFields(java.util.Collection  coll)
  {
  __setDirty(true);
  allFields().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Fields
  * This insertion function inserts a new element in the
  * collection in Fields
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertFields(int idx, DBField el)
  {
  __setDirty(true);
  allFields().add (idx, el);
  }

/** Part of the list interface for Fields
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfFields(xmlBBaseInter el)
  {
  return allFields().indexOf (el);
  }

/** Part of the list interface for Fields
  * This deletion function removes an element from the
  * collection in Fields
  * @param idx the index of the element to remove
  */
public void deleteFields(int idx)
  {
  __setDirty(true);
  allFields().remove(idx);
  }

public void SortFields()
  {
//-> hostname : DBField
Collections.sort(allFields(), new Comparator<DBField>() {
public int compare( DBField o1, DBField o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Fields
  * This deletion function removes an element from the
  * collection in Fields
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeFields(xmlBBaseInter obj)
  {
  int idx = indexOfFields(obj);
  if (idx >= 0) { deleteFields(idx);
   }
  }

/** Part of the list interface for Fields
  * @return the number of elements in Fields
  */
public int countFields()
  {
  return allFields().size();
  }

/** Part of the list interface for Fields
  * This function returns an element from the
  * collection in Fields based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public DBField getFields(int idx)
{
  return (DBField) ( allFields().get(idx));
}

private java.util.ArrayList  aPackets;

/** Part of the list interface for Packets
  * @return a collection of all the elements in Packets
  */
public java.util.ArrayList  allPackets()
  {
if (aPackets == null){
    setAllPackets( new java.util.ArrayList () );
} // If
    return aPackets;
  }

/** Part of the list interface for Packets
  * @return a collection of all the elements in Packets
  */
private java.util.ArrayList  getPackets()
  {
    return allPackets();
  }

/** Part of the list interface for Packets
  * @param coll a collection of elements which replaces 
  *        Packets's current content.
  */
public void setAllPackets(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aPackets = coll;
  }

/** Part of the list interface for Packets
  * @param el a DBPacket to add to the collection in 
  *           Packets
  * @seealso #appendPackets(java.util.Collection )
  */
public void appendPackets(DBPacket el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allPackets().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Packets
  * @param coll a collection ofDBPackets to add to the collection in 
  *           Packets
  * @seealso #appendPackets(DBPacket)
  */
public void appendPackets(java.util.Collection  coll)
  {
  __setDirty(true);
  allPackets().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Packets
  * This insertion function inserts a new element in the
  * collection in Packets
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertPackets(int idx, DBPacket el)
  {
  __setDirty(true);
  allPackets().add (idx, el);
  }

/** Part of the list interface for Packets
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfPackets(xmlBBaseInter el)
  {
  return allPackets().indexOf (el);
  }

/** Part of the list interface for Packets
  * This deletion function removes an element from the
  * collection in Packets
  * @param idx the index of the element to remove
  */
public void deletePackets(int idx)
  {
  __setDirty(true);
  allPackets().remove(idx);
  }

public void SortPackets()
  {
//-> hostname : DBPacket
Collections.sort(allPackets(), new Comparator<DBPacket>() {
public int compare( DBPacket o1, DBPacket o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Packets
  * This deletion function removes an element from the
  * collection in Packets
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removePackets(xmlBBaseInter obj)
  {
  int idx = indexOfPackets(obj);
  if (idx >= 0) { deletePackets(idx);
   }
  }

/** Part of the list interface for Packets
  * @return the number of elements in Packets
  */
public int countPackets()
  {
  return allPackets().size();
  }

/** Part of the list interface for Packets
  * This function returns an element from the
  * collection in Packets based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public DBPacket getPackets(int idx)
{
  return (DBPacket) ( allPackets().get(idx));
}

public DBMessage()
{
DBMessage obj = this;
aMessageOrder=(0);
aMessageType=(0);
aFields=(null);
aPackets=(null);
}

public void copyTo(DBMessage other)
{
super.copyTo(other);
other.aMessageOrder = aMessageOrder;
other.aMessageType = aMessageType;
other.aFields = aFields;
other.aPackets = aPackets;
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
boolean fl1009;
DBField fl1011;
boolean fl1022;
DBPacket fl1024;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Fields")){
ctxt.skipWhiteSpace();
fl1009 = true ; 
while (fl1009) { // BeginLoop 
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
fl1009 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1011 = null;
while(ctxt.lookAheadOpeningTag ("<DBField")) {
fl1011 = acceptor.lAccept_DBField(ctxt, "</DBField>");
appendFields(fl1011);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Fields>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Packets")){
ctxt.skipWhiteSpace();
fl1022 = true ; 
while (fl1022) { // BeginLoop 
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
fl1022 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1024 = null;
while(ctxt.lookAheadOpeningTag ("<DBPacket")) {
fl1024 = acceptor.lAccept_DBPacket(ctxt, "</DBPacket>");
appendPackets(fl1024);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Packets>");
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
boolean fl1035;
boolean fl1036;
boolean fl1037;
boolean fl1038;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1035 = false ; 
fl1036 = false ; 
fl1037 = false ; 
fl1038 = true ; 
while (fl1038) { // BeginLoop 
switch (ctxt.current()) {
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1037;
} else {
indicator = 1039;
} // If
break;
} // Case
case 'M':
{
ctxt.advance();
if (ctxt.lookAheadString("essage")){
switch (ctxt.current()) {
case 'T':
{
ctxt.advance();
if (ctxt.lookAheadString("ype=")){
indicator = 1036;
} else {
indicator = 1039;
} // If
break;
} // Case
case 'O':
{
ctxt.advance();
if (ctxt.lookAheadString("rder=")){
indicator = 1035;
} else {
indicator = 1039;
} // If
break;
} // Case
default:
indicator = 1039;
break;
} // Switch
} else {
indicator = 1039;
} // If
break;
} // Case
default:
indicator = 1039;
break;
} // Switch
switch (indicator) {
case 1035: {
// Handling attribute MessageOrder
// Also handles alien attributes with prefix MessageOrder
if (fl1035){
ctxt.fail ("Duplicate attribute: MessageOrder");
} // If
fl1035 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMessageOrder(ctxt.fetchInteger());
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1036: {
// Handling attribute MessageType
// Also handles alien attributes with prefix MessageType
if (fl1036){
ctxt.fail ("Duplicate attribute: MessageType");
} // If
fl1036 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMessageType(acceptor.lAcceptEnum_DBMessageType(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1037: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1037){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1037 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1039: {
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
if (!fl1035){
this.setMessageOrder(0);
} // If
if (!fl1036){
this.setMessageType(acceptor.aEUROBALISE);
} // If
fl1038 = false ; 
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
  headingTag = "<DBMessage";
  endingTag = "</DBMessage>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"DBMessage\"");
} // If
pw.println();
if (this.getMessageOrder() != 0){
pw.print(" MessageOrder=\"");
acceptor.unParsePcData(pw, this.getMessageOrder());
pw.print('"');
pw.println();
} // If
if (this.getMessageType() != 0){
pw.print(" MessageType=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_DBMessageType_ToString(this.getMessageType()));
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
// Testing for empty content: Fields
if (countFields() > 0){
pw.print("<Fields>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getFields(), false, "<DBField", "</DBField>");
pw.print("</Fields>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Fields
// Unparsing Enclosed
// Testing for empty content: Packets
if (countPackets() > 0){
pw.print("<Packets>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getPackets(), false, "<DBPacket", "</DBPacket>");
pw.print("</Packets>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Packets
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
for (int i = 0; i < countFields(); i++) {
  l.add(getFields(i));
}
for (int i = 0; i < countPackets(); i++) {
  l.add(getPackets(i));
}
}

}

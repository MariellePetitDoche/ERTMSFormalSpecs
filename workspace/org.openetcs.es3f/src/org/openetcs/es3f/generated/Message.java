
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Message</i></h3>
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
public class Message
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getDescription().compareToIgnoreCase((String) search) == 0)return true;
if(getBl().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
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

private  int aMedia;

public  int getMedia() { return aMedia;}

public  void setMedia(int v) {
  __setDirty ( __getDirty() || (getMedia() != v));
  aMedia = v;
}

public  String   getMedia_AsString()
{
  return acceptor.Enum_Message_media_ToString (aMedia);
}

public  boolean setMedia_AsString( String  v)
{
 int temp = acceptor.StringTo_Enum_Message_media(v);
if (temp >= 0){
aMedia = temp;
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

private java.util.ArrayList  aMsgVariables;

/** Part of the list interface for MsgVariables
  * @return a collection of all the elements in MsgVariables
  */
public java.util.ArrayList  allMsgVariables()
  {
if (aMsgVariables == null){
    setAllMsgVariables( new java.util.ArrayList () );
} // If
    return aMsgVariables;
  }

/** Part of the list interface for MsgVariables
  * @return a collection of all the elements in MsgVariables
  */
private java.util.ArrayList  getMsgVariables()
  {
    return allMsgVariables();
  }

/** Part of the list interface for MsgVariables
  * @param coll a collection of elements which replaces 
  *        MsgVariables's current content.
  */
public void setAllMsgVariables(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aMsgVariables = coll;
  }

/** Part of the list interface for MsgVariables
  * @param el a MsgVariable to add to the collection in 
  *           MsgVariables
  * @seealso #appendMsgVariables(java.util.Collection )
  */
public void appendMsgVariables(MsgVariable el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allMsgVariables().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for MsgVariables
  * @param coll a collection ofMsgVariables to add to the collection in 
  *           MsgVariables
  * @seealso #appendMsgVariables(MsgVariable)
  */
public void appendMsgVariables(java.util.Collection  coll)
  {
  __setDirty(true);
  allMsgVariables().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for MsgVariables
  * This insertion function inserts a new element in the
  * collection in MsgVariables
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertMsgVariables(int idx, MsgVariable el)
  {
  __setDirty(true);
  allMsgVariables().add (idx, el);
  }

/** Part of the list interface for MsgVariables
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfMsgVariables(xmlBBaseInter el)
  {
  return allMsgVariables().indexOf (el);
  }

/** Part of the list interface for MsgVariables
  * This deletion function removes an element from the
  * collection in MsgVariables
  * @param idx the index of the element to remove
  */
public void deleteMsgVariables(int idx)
  {
  __setDirty(true);
  allMsgVariables().remove(idx);
  }

public void SortMsgVariables()
  {
//-> hostname : MsgVariable
Collections.sort(allMsgVariables(), new Comparator<MsgVariable>() {
public int compare( MsgVariable o1, MsgVariable o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for MsgVariables
  * This deletion function removes an element from the
  * collection in MsgVariables
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeMsgVariables(xmlBBaseInter obj)
  {
  int idx = indexOfMsgVariables(obj);
  if (idx >= 0) { deleteMsgVariables(idx);
   }
  }

/** Part of the list interface for MsgVariables
  * @return the number of elements in MsgVariables
  */
public int countMsgVariables()
  {
  return allMsgVariables().size();
  }

/** Part of the list interface for MsgVariables
  * This function returns an element from the
  * collection in MsgVariables based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public MsgVariable getMsgVariables(int idx)
{
  return (MsgVariable) ( allMsgVariables().get(idx));
}

public Message()
{
Message obj = this;
aDescription=(null);
aMedia=(0);
aBl=(null);
aMsgVariables=(null);
}

public void copyTo(Message other)
{
other.aDescription = aDescription;
other.aMedia = aMedia;
other.aBl = aBl;
other.aMsgVariables = aMsgVariables;
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
MsgVariable fl1343;

ctxt.skipWhiteSpace();
// Repeat
ctxt.skipWhiteSpace();
fl1343 = null;
while(ctxt.lookAheadOpeningTag ("<MsgVariable")) {
fl1343 = acceptor.lAccept_MsgVariable(ctxt, null);
appendMsgVariables(fl1343);
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
boolean fl1354;
boolean fl1355;
boolean fl1356;
boolean fl1357;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1354 = false ; 
fl1355 = false ; 
fl1356 = false ; 
fl1357 = true ; 
while (fl1357) { // BeginLoop 
switch (ctxt.current()) {
case 'm':
{
ctxt.advance();
if (ctxt.lookAheadString("edia=")){
indicator = 1355;
} else {
indicator = 1358;
} // If
break;
} // Case
case 'd':
{
ctxt.advance();
if (ctxt.lookAheadString("escription=")){
indicator = 1354;
} else {
indicator = 1358;
} // If
break;
} // Case
case 'b':
{
ctxt.advance();
if (ctxt.lookAhead2('l','=')){
indicator = 1356;
} else {
indicator = 1358;
} // If
break;
} // Case
default:
indicator = 1358;
break;
} // Switch
switch (indicator) {
case 1354: {
// Handling attribute description
// Also handles alien attributes with prefix description
if (fl1354){
ctxt.fail ("Duplicate attribute: description");
} // If
fl1354 = true ; 
quoteChar = ctxt.acceptQuote();
this.setDescription((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1355: {
// Handling attribute media
// Also handles alien attributes with prefix media
if (fl1355){
ctxt.fail ("Duplicate attribute: media");
} // If
fl1355 = true ; 
quoteChar = ctxt.acceptQuote();
this.setMedia(acceptor.lAcceptEnum_Message_media(ctxt));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1356: {
// Handling attribute bl
// Also handles alien attributes with prefix bl
if (fl1356){
ctxt.fail ("Duplicate attribute: bl");
} // If
fl1356 = true ; 
quoteChar = ctxt.acceptQuote();
this.setBl((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1358: {
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
if (!fl1354){
ctxt.fail ("Mandatory attribute missing: description in Message");
} // If
if (!fl1355){
ctxt.fail ("Mandatory attribute missing: media in Message");
} // If
fl1357 = false ; 
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
ctxt.acceptString ("</Message>");
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

pw.print("<Message");
if (typeId){
pw.print(" xsi:type=\"Message\"");
} // If
pw.println();
pw.print(" description=\"");
acceptor.unParsePcData(pw, this.getDescription());
pw.print('"');
pw.println();
pw.print(" media=\"");
acceptor.unParsePcData(pw,
  acceptor.Enum_Message_media_ToString(this.getMedia()));
pw.print('"');
pw.println();
if (this.getBl() != null){
pw.print(" bl=\"");
acceptor.unParsePcData(pw, this.getBl());
pw.print('"');
pw.println();
} // If
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</Message>");
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

// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getMsgVariables(), false, null, null);
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
for (int i = 0; i < countMsgVariables(); i++) {
  l.add(getMsgVariables(i));
}
}

}


package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>DBPacket</i></h3>
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
public class DBPacket
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
}
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

public DBPacket()
{
DBPacket obj = this;
aFields=(null);
}

public void copyTo(DBPacket other)
{
super.copyTo(other);
other.aFields = aFields;
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
boolean fl1045;
DBField fl1047;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Fields")){
ctxt.skipWhiteSpace();
fl1045 = true ; 
while (fl1045) { // BeginLoop 
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
fl1045 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1047 = null;
while(ctxt.lookAheadOpeningTag ("<DBField")) {
fl1047 = acceptor.lAccept_DBField(ctxt, "</DBField>");
appendFields(fl1047);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Fields>");
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
boolean fl1058;
boolean fl1059;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1058 = false ; 
fl1059 = true ; 
while (fl1059) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 1058;
} else {
indicator = 1060;
} // If
switch (indicator) {
case 1058: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1058){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1058 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1060: {
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
fl1059 = false ; 
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
  headingTag = "<DBPacket";
  endingTag = "</DBPacket>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"DBPacket\"");
} // If
pw.println();
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
// No formula father defined
pw.println();
} // If
// After Testing for empty content: Fields
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
}

}

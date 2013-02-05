
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Chapter</i></h3>
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
public class Chapter
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getId().compareToIgnoreCase((String) search) == 0)return true;
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

public Chapter()
{
Chapter obj = this;
aId=(null);
aParagraphs=(null);
aTypeSpecs=(null);
}

public void copyTo(Chapter other)
{
super.copyTo(other);
other.aId = aId;
other.aParagraphs = aParagraphs;
other.aTypeSpecs = aTypeSpecs;
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
Paragraph fl1253;
TypeSpec fl1265;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
// Repeat
ctxt.skipWhiteSpace();
fl1253 = null;
while(ctxt.lookAheadOpeningTag ("<Paragraph")) {
fl1253 = acceptor.lAccept_Paragraph(ctxt, "</Paragraph>");
appendParagraphs(fl1253);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
// Repeat
ctxt.skipWhiteSpace();
fl1265 = null;
while(ctxt.lookAheadOpeningTag ("<TypeSpec")) {
fl1265 = acceptor.lAccept_TypeSpec(ctxt, null);
appendTypeSpecs(fl1265);
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
boolean fl1276;
boolean fl1277;
boolean fl1278;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1276 = false ; 
fl1277 = false ; 
fl1278 = true ; 
while (fl1278) { // BeginLoop 
switch (ctxt.current()) {
case 'i':
{
ctxt.advance();
if (ctxt.lookAhead2('d','=')){
indicator = 1276;
} else {
indicator = 1279;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1277;
} else {
indicator = 1279;
} // If
break;
} // Case
default:
indicator = 1279;
break;
} // Switch
switch (indicator) {
case 1276: {
// Handling attribute id
// Also handles alien attributes with prefix id
if (fl1276){
ctxt.fail ("Duplicate attribute: id");
} // If
fl1276 = true ; 
quoteChar = ctxt.acceptQuote();
this.setId((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1277: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1277){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1277 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1279: {
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
if (!fl1276){
ctxt.fail ("Mandatory attribute missing: id in Chapter");
} // If
fl1278 = false ; 
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
  headingTag = "<Chapter";
  endingTag = "</Chapter>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Chapter\"");
} // If
pw.println();
pw.print(" id=\"");
acceptor.unParsePcData(pw, this.getId());
pw.print('"');
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
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getParagraphs(), false, "<Paragraph", "</Paragraph>");
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
for (int i = 0; i < countParagraphs(); i++) {
  l.add(getParagraphs(i));
}
for (int i = 0; i < countTypeSpecs(); i++) {
  l.add(getTypeSpecs(i));
}
}

}

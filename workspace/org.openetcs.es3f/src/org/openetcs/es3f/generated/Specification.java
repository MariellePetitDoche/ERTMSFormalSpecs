
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Specification</i></h3>
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
public class Specification
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getVersion().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
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

private java.util.ArrayList  aChapters;

/** Part of the list interface for Chapters
  * @return a collection of all the elements in Chapters
  */
public java.util.ArrayList  allChapters()
  {
if (aChapters == null){
    setAllChapters( new java.util.ArrayList () );
} // If
    return aChapters;
  }

/** Part of the list interface for Chapters
  * @return a collection of all the elements in Chapters
  */
private java.util.ArrayList  getChapters()
  {
    return allChapters();
  }

/** Part of the list interface for Chapters
  * @param coll a collection of elements which replaces 
  *        Chapters's current content.
  */
public void setAllChapters(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aChapters = coll;
  }

/** Part of the list interface for Chapters
  * @param el a Chapter to add to the collection in 
  *           Chapters
  * @seealso #appendChapters(java.util.Collection )
  */
public void appendChapters(Chapter el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allChapters().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Chapters
  * @param coll a collection ofChapters to add to the collection in 
  *           Chapters
  * @seealso #appendChapters(Chapter)
  */
public void appendChapters(java.util.Collection  coll)
  {
  __setDirty(true);
  allChapters().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Chapters
  * This insertion function inserts a new element in the
  * collection in Chapters
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertChapters(int idx, Chapter el)
  {
  __setDirty(true);
  allChapters().add (idx, el);
  }

/** Part of the list interface for Chapters
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfChapters(xmlBBaseInter el)
  {
  return allChapters().indexOf (el);
  }

/** Part of the list interface for Chapters
  * This deletion function removes an element from the
  * collection in Chapters
  * @param idx the index of the element to remove
  */
public void deleteChapters(int idx)
  {
  __setDirty(true);
  allChapters().remove(idx);
  }

public void SortChapters()
  {
//-> hostname : Chapter
Collections.sort(allChapters(), new Comparator<Chapter>() {
public int compare( Chapter o1, Chapter o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Chapters
  * This deletion function removes an element from the
  * collection in Chapters
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeChapters(xmlBBaseInter obj)
  {
  int idx = indexOfChapters(obj);
  if (idx >= 0) { deleteChapters(idx);
   }
  }

/** Part of the list interface for Chapters
  * @return the number of elements in Chapters
  */
public int countChapters()
  {
  return allChapters().size();
  }

/** Part of the list interface for Chapters
  * This function returns an element from the
  * collection in Chapters based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Chapter getChapters(int idx)
{
  return (Chapter) ( allChapters().get(idx));
}

public Specification()
{
Specification obj = this;
aVersion=(null);
aChapters=(null);
}

public void copyTo(Specification other)
{
super.copyTo(other);
other.aVersion = aVersion;
other.aChapters = aChapters;
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
Chapter fl1234;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
// Repeat
ctxt.skipWhiteSpace();
fl1234 = null;
while(ctxt.lookAheadOpeningTag ("<Chapter")) {
fl1234 = acceptor.lAccept_Chapter(ctxt, "</Chapter>");
appendChapters(fl1234);
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
boolean fl1245;
boolean fl1246;
boolean fl1247;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1245 = false ; 
fl1246 = false ; 
fl1247 = true ; 
while (fl1247) { // BeginLoop 
switch (ctxt.current()) {
case 'v':
{
ctxt.advance();
if (ctxt.lookAheadString("ersion=")){
indicator = 1245;
} else {
indicator = 1248;
} // If
break;
} // Case
case 'N':
{
ctxt.advance();
if (ctxt.lookAheadString("ame=")){
indicator = 1246;
} else {
indicator = 1248;
} // If
break;
} // Case
default:
indicator = 1248;
break;
} // Switch
switch (indicator) {
case 1245: {
// Handling attribute version
// Also handles alien attributes with prefix version
if (fl1245){
ctxt.fail ("Duplicate attribute: version");
} // If
fl1245 = true ; 
quoteChar = ctxt.acceptQuote();
this.setVersion((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
case 1246: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1246){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1246 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1248: {
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
fl1247 = false ; 
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
  headingTag = "<Specification";
  endingTag = "</Specification>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"Specification\"");
} // If
pw.println();
if (this.getVersion() != null){
pw.print(" version=\"");
acceptor.unParsePcData(pw, this.getVersion());
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
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getChapters(), false, "<Chapter", "</Chapter>");
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
for (int i = 0; i < countChapters(); i++) {
  l.add(getChapters(i));
}
}

}

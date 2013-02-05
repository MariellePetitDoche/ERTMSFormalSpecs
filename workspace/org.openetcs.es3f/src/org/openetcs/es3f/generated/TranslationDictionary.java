
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>TranslationDictionary</i></h3>
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
public class TranslationDictionary
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private java.util.ArrayList  aFolders;

/** Part of the list interface for Folders
  * @return a collection of all the elements in Folders
  */
public java.util.ArrayList  allFolders()
  {
if (aFolders == null){
    setAllFolders( new java.util.ArrayList () );
} // If
    return aFolders;
  }

/** Part of the list interface for Folders
  * @return a collection of all the elements in Folders
  */
private java.util.ArrayList  getFolders()
  {
    return allFolders();
  }

/** Part of the list interface for Folders
  * @param coll a collection of elements which replaces 
  *        Folders's current content.
  */
public void setAllFolders(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aFolders = coll;
  }

/** Part of the list interface for Folders
  * @param el a Folder to add to the collection in 
  *           Folders
  * @seealso #appendFolders(java.util.Collection )
  */
public void appendFolders(Folder el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allFolders().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Folders
  * @param coll a collection ofFolders to add to the collection in 
  *           Folders
  * @seealso #appendFolders(Folder)
  */
public void appendFolders(java.util.Collection  coll)
  {
  __setDirty(true);
  allFolders().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Folders
  * This insertion function inserts a new element in the
  * collection in Folders
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertFolders(int idx, Folder el)
  {
  __setDirty(true);
  allFolders().add (idx, el);
  }

/** Part of the list interface for Folders
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfFolders(xmlBBaseInter el)
  {
  return allFolders().indexOf (el);
  }

/** Part of the list interface for Folders
  * This deletion function removes an element from the
  * collection in Folders
  * @param idx the index of the element to remove
  */
public void deleteFolders(int idx)
  {
  __setDirty(true);
  allFolders().remove(idx);
  }

public void SortFolders()
  {
//-> hostname : Folder
Collections.sort(allFolders(), new Comparator<Folder>() {
public int compare( Folder o1, Folder o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Folders
  * This deletion function removes an element from the
  * collection in Folders
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeFolders(xmlBBaseInter obj)
  {
  int idx = indexOfFolders(obj);
  if (idx >= 0) { deleteFolders(idx);
   }
  }

/** Part of the list interface for Folders
  * @return the number of elements in Folders
  */
public int countFolders()
  {
  return allFolders().size();
  }

/** Part of the list interface for Folders
  * This function returns an element from the
  * collection in Folders based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Folder getFolders(int idx)
{
  return (Folder) ( allFolders().get(idx));
}

private java.util.ArrayList  aTranslations;

/** Part of the list interface for Translations
  * @return a collection of all the elements in Translations
  */
public java.util.ArrayList  allTranslations()
  {
if (aTranslations == null){
    setAllTranslations( new java.util.ArrayList () );
} // If
    return aTranslations;
  }

/** Part of the list interface for Translations
  * @return a collection of all the elements in Translations
  */
private java.util.ArrayList  getTranslations()
  {
    return allTranslations();
  }

/** Part of the list interface for Translations
  * @param coll a collection of elements which replaces 
  *        Translations's current content.
  */
public void setAllTranslations(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aTranslations = coll;
  }

/** Part of the list interface for Translations
  * @param el a Translation to add to the collection in 
  *           Translations
  * @seealso #appendTranslations(java.util.Collection )
  */
public void appendTranslations(Translation el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allTranslations().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Translations
  * @param coll a collection ofTranslations to add to the collection in 
  *           Translations
  * @seealso #appendTranslations(Translation)
  */
public void appendTranslations(java.util.Collection  coll)
  {
  __setDirty(true);
  allTranslations().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Translations
  * This insertion function inserts a new element in the
  * collection in Translations
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertTranslations(int idx, Translation el)
  {
  __setDirty(true);
  allTranslations().add (idx, el);
  }

/** Part of the list interface for Translations
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfTranslations(xmlBBaseInter el)
  {
  return allTranslations().indexOf (el);
  }

/** Part of the list interface for Translations
  * This deletion function removes an element from the
  * collection in Translations
  * @param idx the index of the element to remove
  */
public void deleteTranslations(int idx)
  {
  __setDirty(true);
  allTranslations().remove(idx);
  }

public void SortTranslations()
  {
//-> hostname : Translation
Collections.sort(allTranslations(), new Comparator<Translation>() {
public int compare( Translation o1, Translation o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Translations
  * This deletion function removes an element from the
  * collection in Translations
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeTranslations(xmlBBaseInter obj)
  {
  int idx = indexOfTranslations(obj);
  if (idx >= 0) { deleteTranslations(idx);
   }
  }

/** Part of the list interface for Translations
  * @return the number of elements in Translations
  */
public int countTranslations()
  {
  return allTranslations().size();
  }

/** Part of the list interface for Translations
  * This function returns an element from the
  * collection in Translations based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Translation getTranslations(int idx)
{
  return (Translation) ( allTranslations().get(idx));
}

public TranslationDictionary()
{
TranslationDictionary obj = this;
aFolders=(null);
aTranslations=(null);
}

public void copyTo(TranslationDictionary other)
{
super.copyTo(other);
other.aFolders = aFolders;
other.aTranslations = aTranslations;
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
boolean fl1070;
Folder fl1072;
boolean fl1083;
Translation fl1085;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Folders")){
ctxt.skipWhiteSpace();
fl1070 = true ; 
while (fl1070) { // BeginLoop 
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
fl1070 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1072 = null;
while(ctxt.lookAheadOpeningTag ("<Folder")) {
fl1072 = acceptor.lAccept_Folder(ctxt, "</Folder>");
appendFolders(fl1072);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Folders>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Translations")){
ctxt.skipWhiteSpace();
fl1083 = true ; 
while (fl1083) { // BeginLoop 
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
fl1083 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1085 = null;
while(ctxt.lookAheadOpeningTag ("<Translation")) {
fl1085 = acceptor.lAccept_Translation(ctxt, "</Translation>");
appendTranslations(fl1085);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Translations>");
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
boolean fl1096;
boolean fl1097;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1096 = false ; 
fl1097 = true ; 
while (fl1097) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 1096;
} else {
indicator = 1098;
} // If
switch (indicator) {
case 1096: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1096){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1096 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1098: {
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
fl1097 = false ; 
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
  headingTag = "<TranslationDictionary";
  endingTag = "</TranslationDictionary>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"TranslationDictionary\"");
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
// Testing for empty content: Folders
if (countFolders() > 0){
pw.print("<Folders>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getFolders(), false, "<Folder", "</Folder>");
pw.print("</Folders>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Folders
// Unparsing Enclosed
// Testing for empty content: Translations
if (countTranslations() > 0){
pw.print("<Translations>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getTranslations(), false, "<Translation", "</Translation>");
pw.print("</Translations>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Translations
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
for (int i = 0; i < countFolders(); i++) {
  l.add(getFolders(i));
}
for (int i = 0; i < countTranslations(); i++) {
  l.add(getTranslations(i));
}
}

}

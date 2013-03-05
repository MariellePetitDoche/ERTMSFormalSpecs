
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>ShortcutDictionary</i></h3>
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
public class ShortcutDictionary
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
  * @param el a ShortcutFolder to add to the collection in 
  *           Folders
  * @seealso #appendFolders(java.util.Collection )
  */
public void appendFolders(ShortcutFolder el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allFolders().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Folders
  * @param coll a collection ofShortcutFolders to add to the collection in 
  *           Folders
  * @seealso #appendFolders(ShortcutFolder)
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
public void insertFolders(int idx, ShortcutFolder el)
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
//-> hostname : ShortcutFolder
Collections.sort(allFolders(), new Comparator<ShortcutFolder>() {
public int compare( ShortcutFolder o1, ShortcutFolder o2) {
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
public ShortcutFolder getFolders(int idx)
{
  return (ShortcutFolder) ( allFolders().get(idx));
}

private java.util.ArrayList  aShortcuts;

/** Part of the list interface for Shortcuts
  * @return a collection of all the elements in Shortcuts
  */
public java.util.ArrayList  allShortcuts()
  {
if (aShortcuts == null){
    setAllShortcuts( new java.util.ArrayList () );
} // If
    return aShortcuts;
  }

/** Part of the list interface for Shortcuts
  * @return a collection of all the elements in Shortcuts
  */
private java.util.ArrayList  getShortcuts()
  {
    return allShortcuts();
  }

/** Part of the list interface for Shortcuts
  * @param coll a collection of elements which replaces 
  *        Shortcuts's current content.
  */
public void setAllShortcuts(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aShortcuts = coll;
  }

/** Part of the list interface for Shortcuts
  * @param el a Shortcut to add to the collection in 
  *           Shortcuts
  * @seealso #appendShortcuts(java.util.Collection )
  */
public void appendShortcuts(Shortcut el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allShortcuts().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Shortcuts
  * @param coll a collection ofShortcuts to add to the collection in 
  *           Shortcuts
  * @seealso #appendShortcuts(Shortcut)
  */
public void appendShortcuts(java.util.Collection  coll)
  {
  __setDirty(true);
  allShortcuts().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Shortcuts
  * This insertion function inserts a new element in the
  * collection in Shortcuts
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertShortcuts(int idx, Shortcut el)
  {
  __setDirty(true);
  allShortcuts().add (idx, el);
  }

/** Part of the list interface for Shortcuts
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfShortcuts(xmlBBaseInter el)
  {
  return allShortcuts().indexOf (el);
  }

/** Part of the list interface for Shortcuts
  * This deletion function removes an element from the
  * collection in Shortcuts
  * @param idx the index of the element to remove
  */
public void deleteShortcuts(int idx)
  {
  __setDirty(true);
  allShortcuts().remove(idx);
  }

public void SortShortcuts()
  {
//-> hostname : Shortcut
Collections.sort(allShortcuts(), new Comparator<Shortcut>() {
public int compare( Shortcut o1, Shortcut o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Shortcuts
  * This deletion function removes an element from the
  * collection in Shortcuts
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeShortcuts(xmlBBaseInter obj)
  {
  int idx = indexOfShortcuts(obj);
  if (idx >= 0) { deleteShortcuts(idx);
   }
  }

/** Part of the list interface for Shortcuts
  * @return the number of elements in Shortcuts
  */
public int countShortcuts()
  {
  return allShortcuts().size();
  }

/** Part of the list interface for Shortcuts
  * This function returns an element from the
  * collection in Shortcuts based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Shortcut getShortcuts(int idx)
{
  return (Shortcut) ( allShortcuts().get(idx));
}

public ShortcutDictionary()
{
ShortcutDictionary obj = this;
aFolders=(null);
aShortcuts=(null);
}

public void copyTo(ShortcutDictionary other)
{
super.copyTo(other);
other.aFolders = aFolders;
other.aShortcuts = aShortcuts;
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
boolean fl1168;
ShortcutFolder fl1170;
boolean fl1181;
Shortcut fl1183;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Folders")){
ctxt.skipWhiteSpace();
fl1168 = true ; 
while (fl1168) { // BeginLoop 
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
fl1168 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1170 = null;
while(ctxt.lookAheadOpeningTag ("<ShortcutFolder")) {
fl1170 = acceptor.lAccept_ShortcutFolder(ctxt, "</ShortcutFolder>");
appendFolders(fl1170);
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
if (ctxt.lookAheadOpeningTag("<Shortcuts")){
ctxt.skipWhiteSpace();
fl1181 = true ; 
while (fl1181) { // BeginLoop 
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
fl1181 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl1183 = null;
while(ctxt.lookAheadOpeningTag ("<Shortcut")) {
fl1183 = acceptor.lAccept_Shortcut(ctxt, "</Shortcut>");
appendShortcuts(fl1183);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Shortcuts>");
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
boolean fl1194;
boolean fl1195;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl1194 = false ; 
fl1195 = true ; 
while (fl1195) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 1194;
} else {
indicator = 1196;
} // If
switch (indicator) {
case 1194: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl1194){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl1194 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 1196: {
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
fl1195 = false ; 
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
  headingTag = "<ShortcutDictionary";
  endingTag = "</ShortcutDictionary>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"ShortcutDictionary\"");
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
unParse(pw, this.getFolders(), false, "<ShortcutFolder", "</ShortcutFolder>");
pw.print("</Folders>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Folders
// Unparsing Enclosed
// Testing for empty content: Shortcuts
if (countShortcuts() > 0){
pw.print("<Shortcuts>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getShortcuts(), false, "<Shortcut", "</Shortcut>");
pw.print("</Shortcuts>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Shortcuts
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
for (int i = 0; i < countShortcuts(); i++) {
  l.add(getShortcuts(i));
}
}

}

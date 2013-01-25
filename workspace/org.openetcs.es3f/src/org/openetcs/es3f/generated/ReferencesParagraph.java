
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>ReferencesParagraph</i></h3>
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
public abstract class ReferencesParagraph
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getComment().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private java.util.ArrayList  aRequirements;

/** Part of the list interface for Requirements
  * @return a collection of all the elements in Requirements
  */
public java.util.ArrayList  allRequirements()
  {
if (aRequirements == null){
    setAllRequirements( new java.util.ArrayList () );
} // If
    return aRequirements;
  }

/** Part of the list interface for Requirements
  * @return a collection of all the elements in Requirements
  */
private java.util.ArrayList  getRequirements()
  {
    return allRequirements();
  }

/** Part of the list interface for Requirements
  * @param coll a collection of elements which replaces 
  *        Requirements's current content.
  */
public void setAllRequirements(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aRequirements = coll;
  }

/** Part of the list interface for Requirements
  * @param el a ReqRef to add to the collection in 
  *           Requirements
  * @seealso #appendRequirements(java.util.Collection )
  */
public void appendRequirements(ReqRef el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allRequirements().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Requirements
  * @param coll a collection ofReqRefs to add to the collection in 
  *           Requirements
  * @seealso #appendRequirements(ReqRef)
  */
public void appendRequirements(java.util.Collection  coll)
  {
  __setDirty(true);
  allRequirements().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Requirements
  * This insertion function inserts a new element in the
  * collection in Requirements
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertRequirements(int idx, ReqRef el)
  {
  __setDirty(true);
  allRequirements().add (idx, el);
  }

/** Part of the list interface for Requirements
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfRequirements(xmlBBaseInter el)
  {
  return allRequirements().indexOf (el);
  }

/** Part of the list interface for Requirements
  * This deletion function removes an element from the
  * collection in Requirements
  * @param idx the index of the element to remove
  */
public void deleteRequirements(int idx)
  {
  __setDirty(true);
  allRequirements().remove(idx);
  }

public void SortRequirements()
  {
//-> hostname : ReqRef
}
/** Part of the list interface for Requirements
  * This deletion function removes an element from the
  * collection in Requirements
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeRequirements(xmlBBaseInter obj)
  {
  int idx = indexOfRequirements(obj);
  if (idx >= 0) { deleteRequirements(idx);
   }
  }

/** Part of the list interface for Requirements
  * @return the number of elements in Requirements
  */
public int countRequirements()
  {
  return allRequirements().size();
  }

/** Part of the list interface for Requirements
  * This function returns an element from the
  * collection in Requirements based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public ReqRef getRequirements(int idx)
{
  return (ReqRef) ( allRequirements().get(idx));
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

public ReferencesParagraph()
{
ReferencesParagraph obj = this;
aRequirements=(null);
aComment=(null);
}

public void copyTo(ReferencesParagraph other)
{
super.copyTo(other);
other.aRequirements = aRequirements;
other.aComment = aComment;
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
ReqRef fl106;
boolean fl117;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
// Repeat
ctxt.skipWhiteSpace();
fl106 = null;
while(ctxt.lookAheadOpeningTag ("<ReqRef")) {
fl106 = acceptor.lAccept_ReqRef(ctxt, null);
appendRequirements(fl106);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Comment")){
ctxt.skipWhiteSpace();
fl117 = true ; 
while (fl117) { // BeginLoop 
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
fl117 = false ; 
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
boolean fl118;
boolean fl119;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl118 = false ; 
fl119 = true ; 
while (fl119) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 118;
} else {
indicator = 120;
} // If
switch (indicator) {
case 118: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl118){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl118 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 120: {
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
fl119 = false ; 
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
  headingTag = "<ReferencesParagraph";
  endingTag = "</ReferencesParagraph>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"ReferencesParagraph\"");
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
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getRequirements(), false, null, null);
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
for (int i = 0; i < countRequirements(); i++) {
  l.add(getRequirements(i));
}
}

}

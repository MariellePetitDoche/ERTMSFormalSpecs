
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>ReqRef</i></h3>
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
public class ReqRef
extends org.openetcs.es3f.ModelElement
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getId().compareToIgnoreCase((String) search) == 0)return true;
if(getComment().compareToIgnoreCase((String) search) == 0)return true;
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

public ReqRef()
{
ReqRef obj = this;
aId=(null);
aComment=(null);
}

public void copyTo(ReqRef other)
{
other.aId = aId;
other.aComment = aComment;
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
boolean fl316;

ctxt.skipWhiteSpace();
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Comment")){
ctxt.skipWhiteSpace();
fl316 = true ; 
while (fl316) { // BeginLoop 
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
fl316 = false ; 
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
boolean fl317;
boolean fl318;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl317 = false ; 
fl318 = true ; 
while (fl318) { // BeginLoop 
if (ctxt.lookAhead3('I','d','=')){
indicator = 317;
} else {
indicator = 319;
} // If
switch (indicator) {
case 317: {
// Handling attribute Id
// Also handles alien attributes with prefix Id
if (fl317){
ctxt.fail ("Duplicate attribute: Id");
} // If
fl317 = true ; 
quoteChar = ctxt.acceptQuote();
this.setId((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 319: {
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
if (!fl317){
ctxt.fail ("Mandatory attribute missing: Id in ReqRef");
} // If
fl318 = false ; 
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
ctxt.acceptString ("</ReqRef>");
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

pw.print("<ReqRef");
if (typeId){
pw.print(" xsi:type=\"ReqRef\"");
} // If
pw.println();
pw.print(" Id=\"");
acceptor.unParsePcData(pw, this.getId());
pw.print('"');
pw.println();
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</ReqRef>");
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
}

}

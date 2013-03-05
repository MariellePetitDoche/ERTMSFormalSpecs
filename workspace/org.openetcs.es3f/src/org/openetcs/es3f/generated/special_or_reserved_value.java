
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>special_or_reserved_value</i></h3>
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
public class special_or_reserved_value
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  mask aMask;

public  mask getMask() { return aMask;}

public  void setMask(mask v) {
  __setDirty ( __getDirty() || (getMask() != v));
  aMask = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  match aMatch;

public  match getMatch() { return aMatch;}

public  void setMatch(match v) {
  __setDirty ( __getDirty() || (getMatch() != v));
  aMatch = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  match_range aMatch_range;

public  match_range getMatch_range() { return aMatch_range;}

public  void setMatch_range(match_range v) {
  __setDirty ( __getDirty() || (getMatch_range() != v));
  aMatch_range = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  meaning aMeaning;

public  meaning getMeaning() { return aMeaning;}

public  void setMeaning(meaning v) {
  __setDirty ( __getDirty() || (getMeaning() != v));
  aMeaning = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  value aValue;

public  value getValue() { return aValue;}

public  void setValue(value v) {
  __setDirty ( __getDirty() || (getValue() != v));
  aValue = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

public special_or_reserved_value()
{
special_or_reserved_value obj = this;
aMask=(null);
aMatch=(null);
aMatch_range=(null);
aMeaning=(null);
aValue=(null);
}

public void copyTo(special_or_reserved_value other)
{
other.aMask = aMask;
other.aMatch = aMatch;
other.aMatch_range = aMatch_range;
other.aMeaning = aMeaning;
other.aValue = aValue;
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
int fl1438;

ctxt.skipWhiteSpace();
// Element Ref : mask
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<mask")){
// Parsing sub element
this.setMask(acceptor.lAccept_mask(ctxt,null));
setSon(this.getMask());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
// Disjunct
ctxt.skipWhiteSpace();
// Nullable formula
fl1438 = ctxt.getPtr();
switch (ctxt.current()) {
case '<':
{
ctxt.advance();
if (ctxt.lookAheadString("match")){
switch (ctxt.current()) {
case '-':
{
ctxt.advance();
if (ctxt.lookAheadString("range")){
indicator = 1437;
} else {
ctxt.moveBack(1);
indicator = 1436;
} // If
break;
} // Case
default:
indicator = 1436;
break;
} // Switch
} else {
ctxt.moveBack(1);
indicator = 1439;
} // If
break;
} // Case
default:
indicator = 1439;
break;
} // Switch
switch (indicator) {
// Dispatch Lablel
case 1436: {
ctxt.moveBack(6);
// Element Ref : match
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<match")){
// Parsing sub element
this.setMatch(acceptor.lAccept_match(ctxt,null));
setSon(this.getMatch());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Dispatch Lablel
case 1437: {
ctxt.moveBack(12);
// Element Ref : match-range
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<match-range")){
// Parsing sub element
this.setMatch_range(acceptor.lAccept_match_range(ctxt,null));
setSon(this.getMatch_range());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Optional of PCdata
case 1439: {
ctxt.setPtr(fl1438);
// Doing nothing, optional disj
break;
} // End of dispatch label
} // Dispatch
// End Disjunct
// Element Ref : meaning
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<meaning")){
// Parsing sub element
this.setMeaning(acceptor.lAccept_meaning(ctxt,null));
setSon(this.getMeaning());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
// Element Ref : value
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<value")){
// Parsing sub element
this.setValue(acceptor.lAccept_value(ctxt,null));
setSon(this.getValue());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
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
boolean fl1443;

ctxt.skipWhiteSpace();
fl1443 = true ; 
while (fl1443) { // BeginLoop 
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
fl1443 = false ; 
} // If
} // While
ctxt.skipWhiteSpace();
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</special-or-reserved-value>");
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

pw.print("<special-or-reserved-value");
if (typeId){
pw.print(" xsi:type=\"special-or-reserved-value\"");
} // If
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</special-or-reserved-value>");
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

// Unparsing ElementRef
if (this.getMask() != null){
unParse(pw, this.getMask(), false, null, null);
} // If
// Unparsing Disjunct
if (this.getMatch() != null){
// Unparsing ElementRef
if (this.getMatch() != null){
unParse(pw, this.getMatch(), false, null, null);
} // If
} else {
if (this.getMatch_range() != null){
// Unparsing ElementRef
if (this.getMatch_range() != null){
unParse(pw, this.getMatch_range(), false, null, null);
} // If
} // If
} // If
// Unparsing ElementRef
if (this.getMeaning() != null){
unParse(pw, this.getMeaning(), false, null, null);
} // If
// Unparsing ElementRef
if (this.getValue() != null){
unParse(pw, this.getValue(), false, null, null);
} // If
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
l.add(this.getMask());
l.add(this.getMatch());
l.add(this.getMatch_range());
l.add(this.getMeaning());
l.add(this.getValue());
}

}


package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Values</i></h3>
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
public class Values
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private  resolution_formula aResolution_formula_1;

public  resolution_formula getResolution_formula_1() { return aResolution_formula_1;}

public  void setResolution_formula_1(resolution_formula v) {
  __setDirty ( __getDirty() || (getResolution_formula_1() != v));
  aResolution_formula_1 = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  special_or_reserved_values aSpecial_or_reserved_values;

public  special_or_reserved_values getSpecial_or_reserved_values() { return aSpecial_or_reserved_values;}

public  void setSpecial_or_reserved_values(special_or_reserved_values v) {
  __setDirty ( __getDirty() || (getSpecial_or_reserved_values() != v));
  aSpecial_or_reserved_values = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

private  special_or_reserved_value aSpecial_or_reserved_value;

public  special_or_reserved_value getSpecial_or_reserved_value() { return aSpecial_or_reserved_value;}

public  void setSpecial_or_reserved_value(special_or_reserved_value v) {
  __setDirty ( __getDirty() || (getSpecial_or_reserved_value() != v));
  aSpecial_or_reserved_value = v;
  if ( v != null ) { 
    v.setFather(this);
  }
}

public Values()
{
Values obj = this;
aResolution_formula_1=(null);
aSpecial_or_reserved_values=(null);
aSpecial_or_reserved_value=(null);
}

public void copyTo(Values other)
{
other.aResolution_formula_1 = aResolution_formula_1;
other.aSpecial_or_reserved_values = aSpecial_or_reserved_values;
other.aSpecial_or_reserved_value = aSpecial_or_reserved_value;
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
int fl1417;

ctxt.skipWhiteSpace();
// Element Ref : resolution-formula
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<resolution-formula")){
// Parsing sub element
this.setResolution_formula_1(acceptor.lAccept_resolution_formula(ctxt,null));
setSon(this.getResolution_formula_1());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
// Disjunct
ctxt.skipWhiteSpace();
// Nullable formula
fl1417 = ctxt.getPtr();
switch (ctxt.current()) {
case '<':
{
ctxt.advance();
if (ctxt.lookAheadString("special-or-reserved-value")){
switch (ctxt.current()) {
case 's':
{
ctxt.advance();
indicator = 1415;
break;
} // Case
default:
indicator = 1416;
break;
} // Switch
} else {
ctxt.moveBack(1);
indicator = 1418;
} // If
break;
} // Case
default:
indicator = 1418;
break;
} // Switch
switch (indicator) {
// Dispatch Lablel
case 1415: {
ctxt.moveBack(27);
// Element Ref : special-or-reserved-values
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<special-or-reserved-values")){
// Parsing sub element
this.setSpecial_or_reserved_values(acceptor.lAccept_special_or_reserved_values(ctxt,null));
setSon(this.getSpecial_or_reserved_values());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Dispatch Lablel
case 1416: {
ctxt.moveBack(26);
// Element Ref : special-or-reserved-value
ctxt.skipWhiteSpace();
// If optional...
if (ctxt.lookAheadOpeningTag("<special-or-reserved-value")){
// Parsing sub element
this.setSpecial_or_reserved_value(acceptor.lAccept_special_or_reserved_value(ctxt,null));
setSon(this.getSpecial_or_reserved_value());
// Endif optional...
} // If
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Optional of PCdata
case 1418: {
ctxt.setPtr(fl1417);
// Doing nothing, optional disj
break;
} // End of dispatch label
} // Dispatch
// End Disjunct
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
boolean fl1422;

ctxt.skipWhiteSpace();
fl1422 = true ; 
while (fl1422) { // BeginLoop 
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
fl1422 = false ; 
} // If
} // While
ctxt.skipWhiteSpace();
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</Values>");
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

pw.print("<Values");
if (typeId){
pw.print(" xsi:type=\"Values\"");
} // If
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</Values>");
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
if (this.getResolution_formula_1() != null){
unParse(pw, this.getResolution_formula_1(), false, null, null);
} // If
// Unparsing Disjunct
if (this.getSpecial_or_reserved_values() != null){
// Unparsing ElementRef
if (this.getSpecial_or_reserved_values() != null){
unParse(pw, this.getSpecial_or_reserved_values(), false, null, null);
} // If
} else {
if (this.getSpecial_or_reserved_value() != null){
// Unparsing ElementRef
if (this.getSpecial_or_reserved_value() != null){
unParse(pw, this.getSpecial_or_reserved_value(), false, null, null);
} // If
} // If
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
l.add(this.getResolution_formula_1());
l.add(this.getSpecial_or_reserved_values());
l.add(this.getSpecial_or_reserved_value());
}

}

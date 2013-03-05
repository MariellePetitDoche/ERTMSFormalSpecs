
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>match</i></h3>
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
public class match
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
if(getValue().compareToIgnoreCase((String) search) == 0)return true;
}
return false;
}

private   String  aValue;

public   String  getValue() { return aValue;}

public  void setValue( String  v) {
if (v != null){
  __setDirty ( __getDirty() || !(v.equals(getValue())));
} else {
  __setDirty ( __getDirty() || (getValue() != null));
} // If
  aValue = v;
}

public match()
{
match obj = this;
aValue=(null);
}

public void copyTo(match other)
{
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

// Indicator
// Parse PC data
this.setValue(acceptor.lAcceptPcData(ctxt, -1, '<',xmlBContext.WS_PRESERVE));
// Regexp
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
boolean fl1445;

ctxt.skipWhiteSpace();
fl1445 = true ; 
while (fl1445) { // BeginLoop 
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
fl1445 = false ; 
} // If
} // While
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</match>");
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

pw.print("<match");
if (typeId){
pw.print(" xsi:type=\"match\"");
} // If
pw.print('>');
unParseBody(pw);
pw.print("</match>");
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

// Unparsing PcData
acceptor.unParsePcData(pw, this.getValue());
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

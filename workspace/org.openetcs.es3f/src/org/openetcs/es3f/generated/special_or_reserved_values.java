
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>special_or_reserved_values</i></h3>
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
public class special_or_reserved_values
extends xmlBBase
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private java.util.ArrayList  aSpecial_or_reserved_values;

/** Part of the list interface for Special_or_reserved_values
  * @return a collection of all the elements in Special_or_reserved_values
  */
public java.util.ArrayList  allSpecial_or_reserved_values()
  {
if (aSpecial_or_reserved_values == null){
    setAllSpecial_or_reserved_values( new java.util.ArrayList () );
} // If
    return aSpecial_or_reserved_values;
  }

/** Part of the list interface for Special_or_reserved_values
  * @return a collection of all the elements in Special_or_reserved_values
  */
private java.util.ArrayList  getSpecial_or_reserved_values()
  {
    return allSpecial_or_reserved_values();
  }

/** Part of the list interface for Special_or_reserved_values
  * @param coll a collection of elements which replaces 
  *        Special_or_reserved_values's current content.
  */
public void setAllSpecial_or_reserved_values(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aSpecial_or_reserved_values = coll;
  }

/** Part of the list interface for Special_or_reserved_values
  * @param el a special_or_reserved_value to add to the collection in 
  *           Special_or_reserved_values
  * @seealso #appendSpecial_or_reserved_values(java.util.Collection )
  */
public void appendSpecial_or_reserved_values(special_or_reserved_value el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allSpecial_or_reserved_values().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Special_or_reserved_values
  * @param coll a collection ofspecial_or_reserved_values to add to the collection in 
  *           Special_or_reserved_values
  * @seealso #appendSpecial_or_reserved_values(special_or_reserved_value)
  */
public void appendSpecial_or_reserved_values(java.util.Collection  coll)
  {
  __setDirty(true);
  allSpecial_or_reserved_values().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Special_or_reserved_values
  * This insertion function inserts a new element in the
  * collection in Special_or_reserved_values
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertSpecial_or_reserved_values(int idx, special_or_reserved_value el)
  {
  __setDirty(true);
  allSpecial_or_reserved_values().add (idx, el);
  }

/** Part of the list interface for Special_or_reserved_values
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfSpecial_or_reserved_values(xmlBBaseInter el)
  {
  return allSpecial_or_reserved_values().indexOf (el);
  }

/** Part of the list interface for Special_or_reserved_values
  * This deletion function removes an element from the
  * collection in Special_or_reserved_values
  * @param idx the index of the element to remove
  */
public void deleteSpecial_or_reserved_values(int idx)
  {
  __setDirty(true);
  allSpecial_or_reserved_values().remove(idx);
  }

public void SortSpecial_or_reserved_values()
  {
//-> hostname : special_or_reserved_value
}
/** Part of the list interface for Special_or_reserved_values
  * This deletion function removes an element from the
  * collection in Special_or_reserved_values
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeSpecial_or_reserved_values(xmlBBaseInter obj)
  {
  int idx = indexOfSpecial_or_reserved_values(obj);
  if (idx >= 0) { deleteSpecial_or_reserved_values(idx);
   }
  }

/** Part of the list interface for Special_or_reserved_values
  * @return the number of elements in Special_or_reserved_values
  */
public int countSpecial_or_reserved_values()
  {
  return allSpecial_or_reserved_values().size();
  }

/** Part of the list interface for Special_or_reserved_values
  * This function returns an element from the
  * collection in Special_or_reserved_values based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public special_or_reserved_value getSpecial_or_reserved_values(int idx)
{
  return (special_or_reserved_value) ( allSpecial_or_reserved_values().get(idx));
}

public special_or_reserved_values()
{
special_or_reserved_values obj = this;
aSpecial_or_reserved_values=(null);
}

public void copyTo(special_or_reserved_values other)
{
other.aSpecial_or_reserved_values = aSpecial_or_reserved_values;
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
special_or_reserved_value fl1424;

ctxt.skipWhiteSpace();
// Repeat
ctxt.skipWhiteSpace();
fl1424 = null;
while(ctxt.lookAheadOpeningTag ("<special-or-reserved-value")) {
fl1424 = acceptor.lAccept_special_or_reserved_value(ctxt, null);
appendSpecial_or_reserved_values(fl1424);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
if (fl1424 == null){
ctxt.fail ("At least one element expected in repetition");
} // If
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
boolean fl1435;

ctxt.skipWhiteSpace();
fl1435 = true ; 
while (fl1435) { // BeginLoop 
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
fl1435 = false ; 
} // If
} // While
ctxt.skipWhiteSpace();
ctxt.accept('>');
parseBody(ctxt);
ctxt.acceptString ("</special-or-reserved-values>");
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

pw.print("<special-or-reserved-values");
if (typeId){
pw.print(" xsi:type=\"special-or-reserved-values\"");
} // If
pw.print('>');
pw.println();
unParseBody(pw);
pw.print("</special-or-reserved-values>");
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

// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getSpecial_or_reserved_values(), false, null, null);
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
for (int i = 0; i < countSpecial_or_reserved_values(); i++) {
  l.add(getSpecial_or_reserved_values(i));
}
}

}

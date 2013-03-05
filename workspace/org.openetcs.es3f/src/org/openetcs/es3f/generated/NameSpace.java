
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>NameSpace</i></h3>
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
public class NameSpace
extends org.openetcs.es3f.DataDictionary.Namable
{
public  boolean find(Object search){
if (search instanceof String ) {
}
return false;
}

private java.util.ArrayList  aNameSpaces;

/** Part of the list interface for NameSpaces
  * @return a collection of all the elements in NameSpaces
  */
public java.util.ArrayList  allNameSpaces()
  {
if (aNameSpaces == null){
    setAllNameSpaces( new java.util.ArrayList () );
} // If
    return aNameSpaces;
  }

/** Part of the list interface for NameSpaces
  * @return a collection of all the elements in NameSpaces
  */
private java.util.ArrayList  getNameSpaces()
  {
    return allNameSpaces();
  }

/** Part of the list interface for NameSpaces
  * @param coll a collection of elements which replaces 
  *        NameSpaces's current content.
  */
public void setAllNameSpaces(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aNameSpaces = coll;
  }

/** Part of the list interface for NameSpaces
  * @param el a NameSpace to add to the collection in 
  *           NameSpaces
  * @seealso #appendNameSpaces(java.util.Collection )
  */
public void appendNameSpaces(NameSpace el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allNameSpaces().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for NameSpaces
  * @param coll a collection ofNameSpaces to add to the collection in 
  *           NameSpaces
  * @seealso #appendNameSpaces(NameSpace)
  */
public void appendNameSpaces(java.util.Collection  coll)
  {
  __setDirty(true);
  allNameSpaces().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for NameSpaces
  * This insertion function inserts a new element in the
  * collection in NameSpaces
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertNameSpaces(int idx, NameSpace el)
  {
  __setDirty(true);
  allNameSpaces().add (idx, el);
  }

/** Part of the list interface for NameSpaces
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfNameSpaces(xmlBBaseInter el)
  {
  return allNameSpaces().indexOf (el);
  }

/** Part of the list interface for NameSpaces
  * This deletion function removes an element from the
  * collection in NameSpaces
  * @param idx the index of the element to remove
  */
public void deleteNameSpaces(int idx)
  {
  __setDirty(true);
  allNameSpaces().remove(idx);
  }

public void SortNameSpaces()
  {
//-> hostname : NameSpace
Collections.sort(allNameSpaces(), new Comparator<NameSpace>() {
public int compare( NameSpace o1, NameSpace o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for NameSpaces
  * This deletion function removes an element from the
  * collection in NameSpaces
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeNameSpaces(xmlBBaseInter obj)
  {
  int idx = indexOfNameSpaces(obj);
  if (idx >= 0) { deleteNameSpaces(idx);
   }
  }

/** Part of the list interface for NameSpaces
  * @return the number of elements in NameSpaces
  */
public int countNameSpaces()
  {
  return allNameSpaces().size();
  }

/** Part of the list interface for NameSpaces
  * This function returns an element from the
  * collection in NameSpaces based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public NameSpace getNameSpaces(int idx)
{
  return (NameSpace) ( allNameSpaces().get(idx));
}

private java.util.ArrayList  aRanges;

/** Part of the list interface for Ranges
  * @return a collection of all the elements in Ranges
  */
public java.util.ArrayList  allRanges()
  {
if (aRanges == null){
    setAllRanges( new java.util.ArrayList () );
} // If
    return aRanges;
  }

/** Part of the list interface for Ranges
  * @return a collection of all the elements in Ranges
  */
private java.util.ArrayList  getRanges()
  {
    return allRanges();
  }

/** Part of the list interface for Ranges
  * @param coll a collection of elements which replaces 
  *        Ranges's current content.
  */
public void setAllRanges(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aRanges = coll;
  }

/** Part of the list interface for Ranges
  * @param el a Range to add to the collection in 
  *           Ranges
  * @seealso #appendRanges(java.util.Collection )
  */
public void appendRanges(Range el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allRanges().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Ranges
  * @param coll a collection ofRanges to add to the collection in 
  *           Ranges
  * @seealso #appendRanges(Range)
  */
public void appendRanges(java.util.Collection  coll)
  {
  __setDirty(true);
  allRanges().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Ranges
  * This insertion function inserts a new element in the
  * collection in Ranges
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertRanges(int idx, Range el)
  {
  __setDirty(true);
  allRanges().add (idx, el);
  }

/** Part of the list interface for Ranges
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfRanges(xmlBBaseInter el)
  {
  return allRanges().indexOf (el);
  }

/** Part of the list interface for Ranges
  * This deletion function removes an element from the
  * collection in Ranges
  * @param idx the index of the element to remove
  */
public void deleteRanges(int idx)
  {
  __setDirty(true);
  allRanges().remove(idx);
  }

public void SortRanges()
  {
//-> hostname : Range
Collections.sort(allRanges(), new Comparator<Range>() {
public int compare( Range o1, Range o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Ranges
  * This deletion function removes an element from the
  * collection in Ranges
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeRanges(xmlBBaseInter obj)
  {
  int idx = indexOfRanges(obj);
  if (idx >= 0) { deleteRanges(idx);
   }
  }

/** Part of the list interface for Ranges
  * @return the number of elements in Ranges
  */
public int countRanges()
  {
  return allRanges().size();
  }

/** Part of the list interface for Ranges
  * This function returns an element from the
  * collection in Ranges based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Range getRanges(int idx)
{
  return (Range) ( allRanges().get(idx));
}

private java.util.ArrayList  aEnumerations;

/** Part of the list interface for Enumerations
  * @return a collection of all the elements in Enumerations
  */
public java.util.ArrayList  allEnumerations()
  {
if (aEnumerations == null){
    setAllEnumerations( new java.util.ArrayList () );
} // If
    return aEnumerations;
  }

/** Part of the list interface for Enumerations
  * @return a collection of all the elements in Enumerations
  */
private java.util.ArrayList  getEnumerations()
  {
    return allEnumerations();
  }

/** Part of the list interface for Enumerations
  * @param coll a collection of elements which replaces 
  *        Enumerations's current content.
  */
public void setAllEnumerations(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aEnumerations = coll;
  }

/** Part of the list interface for Enumerations
  * @param el a Enum to add to the collection in 
  *           Enumerations
  * @seealso #appendEnumerations(java.util.Collection )
  */
public void appendEnumerations(Enum el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allEnumerations().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Enumerations
  * @param coll a collection ofEnums to add to the collection in 
  *           Enumerations
  * @seealso #appendEnumerations(Enum)
  */
public void appendEnumerations(java.util.Collection  coll)
  {
  __setDirty(true);
  allEnumerations().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Enumerations
  * This insertion function inserts a new element in the
  * collection in Enumerations
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertEnumerations(int idx, Enum el)
  {
  __setDirty(true);
  allEnumerations().add (idx, el);
  }

/** Part of the list interface for Enumerations
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfEnumerations(xmlBBaseInter el)
  {
  return allEnumerations().indexOf (el);
  }

/** Part of the list interface for Enumerations
  * This deletion function removes an element from the
  * collection in Enumerations
  * @param idx the index of the element to remove
  */
public void deleteEnumerations(int idx)
  {
  __setDirty(true);
  allEnumerations().remove(idx);
  }

public void SortEnumerations()
  {
//-> hostname : Enum
Collections.sort(allEnumerations(), new Comparator<Enum>() {
public int compare( Enum o1, Enum o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Enumerations
  * This deletion function removes an element from the
  * collection in Enumerations
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeEnumerations(xmlBBaseInter obj)
  {
  int idx = indexOfEnumerations(obj);
  if (idx >= 0) { deleteEnumerations(idx);
   }
  }

/** Part of the list interface for Enumerations
  * @return the number of elements in Enumerations
  */
public int countEnumerations()
  {
  return allEnumerations().size();
  }

/** Part of the list interface for Enumerations
  * This function returns an element from the
  * collection in Enumerations based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Enum getEnumerations(int idx)
{
  return (Enum) ( allEnumerations().get(idx));
}

private java.util.ArrayList  aStructures;

/** Part of the list interface for Structures
  * @return a collection of all the elements in Structures
  */
public java.util.ArrayList  allStructures()
  {
if (aStructures == null){
    setAllStructures( new java.util.ArrayList () );
} // If
    return aStructures;
  }

/** Part of the list interface for Structures
  * @return a collection of all the elements in Structures
  */
private java.util.ArrayList  getStructures()
  {
    return allStructures();
  }

/** Part of the list interface for Structures
  * @param coll a collection of elements which replaces 
  *        Structures's current content.
  */
public void setAllStructures(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aStructures = coll;
  }

/** Part of the list interface for Structures
  * @param el a Structure to add to the collection in 
  *           Structures
  * @seealso #appendStructures(java.util.Collection )
  */
public void appendStructures(Structure el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allStructures().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Structures
  * @param coll a collection ofStructures to add to the collection in 
  *           Structures
  * @seealso #appendStructures(Structure)
  */
public void appendStructures(java.util.Collection  coll)
  {
  __setDirty(true);
  allStructures().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Structures
  * This insertion function inserts a new element in the
  * collection in Structures
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertStructures(int idx, Structure el)
  {
  __setDirty(true);
  allStructures().add (idx, el);
  }

/** Part of the list interface for Structures
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfStructures(xmlBBaseInter el)
  {
  return allStructures().indexOf (el);
  }

/** Part of the list interface for Structures
  * This deletion function removes an element from the
  * collection in Structures
  * @param idx the index of the element to remove
  */
public void deleteStructures(int idx)
  {
  __setDirty(true);
  allStructures().remove(idx);
  }

public void SortStructures()
  {
//-> hostname : Structure
Collections.sort(allStructures(), new Comparator<Structure>() {
public int compare( Structure o1, Structure o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Structures
  * This deletion function removes an element from the
  * collection in Structures
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeStructures(xmlBBaseInter obj)
  {
  int idx = indexOfStructures(obj);
  if (idx >= 0) { deleteStructures(idx);
   }
  }

/** Part of the list interface for Structures
  * @return the number of elements in Structures
  */
public int countStructures()
  {
  return allStructures().size();
  }

/** Part of the list interface for Structures
  * This function returns an element from the
  * collection in Structures based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Structure getStructures(int idx)
{
  return (Structure) ( allStructures().get(idx));
}

private java.util.ArrayList  aCollections;

/** Part of the list interface for Collections
  * @return a collection of all the elements in Collections
  */
public java.util.ArrayList  allCollections()
  {
if (aCollections == null){
    setAllCollections( new java.util.ArrayList () );
} // If
    return aCollections;
  }

/** Part of the list interface for Collections
  * @return a collection of all the elements in Collections
  */
private java.util.ArrayList  getCollections()
  {
    return allCollections();
  }

/** Part of the list interface for Collections
  * @param coll a collection of elements which replaces 
  *        Collections's current content.
  */
public void setAllCollections(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aCollections = coll;
  }

/** Part of the list interface for Collections
  * @param el a Collection to add to the collection in 
  *           Collections
  * @seealso #appendCollections(java.util.Collection )
  */
public void appendCollections(Collection el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allCollections().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Collections
  * @param coll a collection ofCollections to add to the collection in 
  *           Collections
  * @seealso #appendCollections(Collection)
  */
public void appendCollections(java.util.Collection  coll)
  {
  __setDirty(true);
  allCollections().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Collections
  * This insertion function inserts a new element in the
  * collection in Collections
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertCollections(int idx, Collection el)
  {
  __setDirty(true);
  allCollections().add (idx, el);
  }

/** Part of the list interface for Collections
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfCollections(xmlBBaseInter el)
  {
  return allCollections().indexOf (el);
  }

/** Part of the list interface for Collections
  * This deletion function removes an element from the
  * collection in Collections
  * @param idx the index of the element to remove
  */
public void deleteCollections(int idx)
  {
  __setDirty(true);
  allCollections().remove(idx);
  }

public void SortCollections()
  {
//-> hostname : Collection
Collections.sort(allCollections(), new Comparator<Collection>() {
public int compare( Collection o1, Collection o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Collections
  * This deletion function removes an element from the
  * collection in Collections
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeCollections(xmlBBaseInter obj)
  {
  int idx = indexOfCollections(obj);
  if (idx >= 0) { deleteCollections(idx);
   }
  }

/** Part of the list interface for Collections
  * @return the number of elements in Collections
  */
public int countCollections()
  {
  return allCollections().size();
  }

/** Part of the list interface for Collections
  * This function returns an element from the
  * collection in Collections based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Collection getCollections(int idx)
{
  return (Collection) ( allCollections().get(idx));
}

private java.util.ArrayList  aFunctions;

/** Part of the list interface for Functions
  * @return a collection of all the elements in Functions
  */
public java.util.ArrayList  allFunctions()
  {
if (aFunctions == null){
    setAllFunctions( new java.util.ArrayList () );
} // If
    return aFunctions;
  }

/** Part of the list interface for Functions
  * @return a collection of all the elements in Functions
  */
private java.util.ArrayList  getFunctions()
  {
    return allFunctions();
  }

/** Part of the list interface for Functions
  * @param coll a collection of elements which replaces 
  *        Functions's current content.
  */
public void setAllFunctions(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aFunctions = coll;
  }

/** Part of the list interface for Functions
  * @param el a Function to add to the collection in 
  *           Functions
  * @seealso #appendFunctions(java.util.Collection )
  */
public void appendFunctions(Function el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allFunctions().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Functions
  * @param coll a collection ofFunctions to add to the collection in 
  *           Functions
  * @seealso #appendFunctions(Function)
  */
public void appendFunctions(java.util.Collection  coll)
  {
  __setDirty(true);
  allFunctions().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Functions
  * This insertion function inserts a new element in the
  * collection in Functions
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertFunctions(int idx, Function el)
  {
  __setDirty(true);
  allFunctions().add (idx, el);
  }

/** Part of the list interface for Functions
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfFunctions(xmlBBaseInter el)
  {
  return allFunctions().indexOf (el);
  }

/** Part of the list interface for Functions
  * This deletion function removes an element from the
  * collection in Functions
  * @param idx the index of the element to remove
  */
public void deleteFunctions(int idx)
  {
  __setDirty(true);
  allFunctions().remove(idx);
  }

public void SortFunctions()
  {
//-> hostname : Function
Collections.sort(allFunctions(), new Comparator<Function>() {
public int compare( Function o1, Function o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Functions
  * This deletion function removes an element from the
  * collection in Functions
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeFunctions(xmlBBaseInter obj)
  {
  int idx = indexOfFunctions(obj);
  if (idx >= 0) { deleteFunctions(idx);
   }
  }

/** Part of the list interface for Functions
  * @return the number of elements in Functions
  */
public int countFunctions()
  {
  return allFunctions().size();
  }

/** Part of the list interface for Functions
  * This function returns an element from the
  * collection in Functions based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Function getFunctions(int idx)
{
  return (Function) ( allFunctions().get(idx));
}

private java.util.ArrayList  aProcedures;

/** Part of the list interface for Procedures
  * @return a collection of all the elements in Procedures
  */
public java.util.ArrayList  allProcedures()
  {
if (aProcedures == null){
    setAllProcedures( new java.util.ArrayList () );
} // If
    return aProcedures;
  }

/** Part of the list interface for Procedures
  * @return a collection of all the elements in Procedures
  */
private java.util.ArrayList  getProcedures()
  {
    return allProcedures();
  }

/** Part of the list interface for Procedures
  * @param coll a collection of elements which replaces 
  *        Procedures's current content.
  */
public void setAllProcedures(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aProcedures = coll;
  }

/** Part of the list interface for Procedures
  * @param el a Procedure to add to the collection in 
  *           Procedures
  * @seealso #appendProcedures(java.util.Collection )
  */
public void appendProcedures(Procedure el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allProcedures().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Procedures
  * @param coll a collection ofProcedures to add to the collection in 
  *           Procedures
  * @seealso #appendProcedures(Procedure)
  */
public void appendProcedures(java.util.Collection  coll)
  {
  __setDirty(true);
  allProcedures().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Procedures
  * This insertion function inserts a new element in the
  * collection in Procedures
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertProcedures(int idx, Procedure el)
  {
  __setDirty(true);
  allProcedures().add (idx, el);
  }

/** Part of the list interface for Procedures
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfProcedures(xmlBBaseInter el)
  {
  return allProcedures().indexOf (el);
  }

/** Part of the list interface for Procedures
  * This deletion function removes an element from the
  * collection in Procedures
  * @param idx the index of the element to remove
  */
public void deleteProcedures(int idx)
  {
  __setDirty(true);
  allProcedures().remove(idx);
  }

public void SortProcedures()
  {
//-> hostname : Procedure
Collections.sort(allProcedures(), new Comparator<Procedure>() {
public int compare( Procedure o1, Procedure o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Procedures
  * This deletion function removes an element from the
  * collection in Procedures
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeProcedures(xmlBBaseInter obj)
  {
  int idx = indexOfProcedures(obj);
  if (idx >= 0) { deleteProcedures(idx);
   }
  }

/** Part of the list interface for Procedures
  * @return the number of elements in Procedures
  */
public int countProcedures()
  {
  return allProcedures().size();
  }

/** Part of the list interface for Procedures
  * This function returns an element from the
  * collection in Procedures based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Procedure getProcedures(int idx)
{
  return (Procedure) ( allProcedures().get(idx));
}

private java.util.ArrayList  aVariables;

/** Part of the list interface for Variables
  * @return a collection of all the elements in Variables
  */
public java.util.ArrayList  allVariables()
  {
if (aVariables == null){
    setAllVariables( new java.util.ArrayList () );
} // If
    return aVariables;
  }

/** Part of the list interface for Variables
  * @return a collection of all the elements in Variables
  */
private java.util.ArrayList  getVariables()
  {
    return allVariables();
  }

/** Part of the list interface for Variables
  * @param coll a collection of elements which replaces 
  *        Variables's current content.
  */
public void setAllVariables(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aVariables = coll;
  }

/** Part of the list interface for Variables
  * @param el a Variable to add to the collection in 
  *           Variables
  * @seealso #appendVariables(java.util.Collection )
  */
public void appendVariables(Variable el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allVariables().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Variables
  * @param coll a collection ofVariables to add to the collection in 
  *           Variables
  * @seealso #appendVariables(Variable)
  */
public void appendVariables(java.util.Collection  coll)
  {
  __setDirty(true);
  allVariables().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Variables
  * This insertion function inserts a new element in the
  * collection in Variables
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertVariables(int idx, Variable el)
  {
  __setDirty(true);
  allVariables().add (idx, el);
  }

/** Part of the list interface for Variables
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfVariables(xmlBBaseInter el)
  {
  return allVariables().indexOf (el);
  }

/** Part of the list interface for Variables
  * This deletion function removes an element from the
  * collection in Variables
  * @param idx the index of the element to remove
  */
public void deleteVariables(int idx)
  {
  __setDirty(true);
  allVariables().remove(idx);
  }

public void SortVariables()
  {
//-> hostname : Variable
Collections.sort(allVariables(), new Comparator<Variable>() {
public int compare( Variable o1, Variable o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Variables
  * This deletion function removes an element from the
  * collection in Variables
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeVariables(xmlBBaseInter obj)
  {
  int idx = indexOfVariables(obj);
  if (idx >= 0) { deleteVariables(idx);
   }
  }

/** Part of the list interface for Variables
  * @return the number of elements in Variables
  */
public int countVariables()
  {
  return allVariables().size();
  }

/** Part of the list interface for Variables
  * This function returns an element from the
  * collection in Variables based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Variable getVariables(int idx)
{
  return (Variable) ( allVariables().get(idx));
}

private java.util.ArrayList  aRules;

/** Part of the list interface for Rules
  * @return a collection of all the elements in Rules
  */
public java.util.ArrayList  allRules()
  {
if (aRules == null){
    setAllRules( new java.util.ArrayList () );
} // If
    return aRules;
  }

/** Part of the list interface for Rules
  * @return a collection of all the elements in Rules
  */
private java.util.ArrayList  getRules()
  {
    return allRules();
  }

/** Part of the list interface for Rules
  * @param coll a collection of elements which replaces 
  *        Rules's current content.
  */
public void setAllRules(java.util.ArrayList  coll)
  {
  __setDirty(true);
    aRules = coll;
  }

/** Part of the list interface for Rules
  * @param el a Rule to add to the collection in 
  *           Rules
  * @seealso #appendRules(java.util.Collection )
  */
public void appendRules(Rule el)
  {
  __setDirty(true);
  el.__setDirty(true);
  allRules().add(el);
  acceptor.connectSon (this, el);
  }

/** Part of the list interface for Rules
  * @param coll a collection ofRules to add to the collection in 
  *           Rules
  * @seealso #appendRules(Rule)
  */
public void appendRules(java.util.Collection  coll)
  {
  __setDirty(true);
  allRules().addAll(coll);
  acceptor.connectSons (this, coll);
  }

/** Part of the list interface for Rules
  * This insertion function inserts a new element in the
  * collection in Rules
  * @param idx the index where the insertion must take place
  * @param el the element to insert
  */
public void insertRules(int idx, Rule el)
  {
  __setDirty(true);
  allRules().add (idx, el);
  }

/** Part of the list interface for Rules
  * This function returns the index of an element in
  * the collection.
  * @param obj the object to look for
  * @return the index where it is found, or -1 if it is not.
  */
public int indexOfRules(xmlBBaseInter el)
  {
  return allRules().indexOf (el);
  }

/** Part of the list interface for Rules
  * This deletion function removes an element from the
  * collection in Rules
  * @param idx the index of the element to remove
  */
public void deleteRules(int idx)
  {
  __setDirty(true);
  allRules().remove(idx);
  }

public void SortRules()
  {
//-> hostname : Rule
Collections.sort(allRules(), new Comparator<Rule>() {
public int compare( Rule o1, Rule o2) {
if(o1 == null || o2 == null) return 1;
if(o1.getName() == null || o2.getName() == null) return 1;
return o1.getName().compareToIgnoreCase(o2.getName());
}});
}
/** Part of the list interface for Rules
  * This deletion function removes an element from the
  * collection in Rules
  * If the object given in parameter is not found in the
  * the collection, this function does nothing.
  * @param obj the object to remove
  */
public void removeRules(xmlBBaseInter obj)
  {
  int idx = indexOfRules(obj);
  if (idx >= 0) { deleteRules(idx);
   }
  }

/** Part of the list interface for Rules
  * @return the number of elements in Rules
  */
public int countRules()
  {
  return allRules().size();
  }

/** Part of the list interface for Rules
  * This function returns an element from the
  * collection in Rules based on an index.
  * @param idx the index of the element to extract
  * @return the extracted element
  */
public Rule getRules(int idx)
{
  return (Rule) ( allRules().get(idx));
}

public NameSpace()
{
NameSpace obj = this;
aNameSpaces=(null);
aRanges=(null);
aEnumerations=(null);
aStructures=(null);
aCollections=(null);
aFunctions=(null);
aProcedures=(null);
aVariables=(null);
aRules=(null);
}

public void copyTo(NameSpace other)
{
super.copyTo(other);
other.aNameSpaces = aNameSpaces;
other.aRanges = aRanges;
other.aEnumerations = aEnumerations;
other.aStructures = aStructures;
other.aCollections = aCollections;
other.aFunctions = aFunctions;
other.aProcedures = aProcedures;
other.aVariables = aVariables;
other.aRules = aRules;
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
boolean fl195;
NameSpace fl197;
boolean fl208;
Range fl210;
boolean fl221;
Enum fl223;
boolean fl234;
Structure fl236;
boolean fl247;
Collection fl249;
boolean fl260;
Function fl262;
boolean fl273;
Procedure fl275;
boolean fl286;
Variable fl288;
boolean fl299;
Rule fl301;

ctxt.skipWhiteSpace();
super.parseBody(ctxt);
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<NameSpaces")){
ctxt.skipWhiteSpace();
fl195 = true ; 
while (fl195) { // BeginLoop 
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
fl195 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl197 = null;
while(ctxt.lookAheadOpeningTag ("<NameSpace")) {
fl197 = acceptor.lAccept_NameSpace(ctxt, "</NameSpace>");
appendNameSpaces(fl197);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</NameSpaces>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Ranges")){
ctxt.skipWhiteSpace();
fl208 = true ; 
while (fl208) { // BeginLoop 
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
fl208 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl210 = null;
while(ctxt.lookAheadOpeningTag ("<Range")) {
fl210 = acceptor.lAccept_Range(ctxt, "</Range>");
appendRanges(fl210);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Ranges>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Enumerations")){
ctxt.skipWhiteSpace();
fl221 = true ; 
while (fl221) { // BeginLoop 
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
fl221 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl223 = null;
while(ctxt.lookAheadOpeningTag ("<Enum")) {
fl223 = acceptor.lAccept_Enum(ctxt, "</Enum>");
appendEnumerations(fl223);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Enumerations>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Structures")){
ctxt.skipWhiteSpace();
fl234 = true ; 
while (fl234) { // BeginLoop 
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
fl234 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl236 = null;
while(ctxt.lookAheadOpeningTag ("<Structure")) {
fl236 = acceptor.lAccept_Structure(ctxt, "</Structure>");
appendStructures(fl236);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Structures>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Collections")){
ctxt.skipWhiteSpace();
fl247 = true ; 
while (fl247) { // BeginLoop 
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
fl247 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl249 = null;
while(ctxt.lookAheadOpeningTag ("<Collection")) {
fl249 = acceptor.lAccept_Collection(ctxt, "</Collection>");
appendCollections(fl249);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Collections>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Functions")){
ctxt.skipWhiteSpace();
fl260 = true ; 
while (fl260) { // BeginLoop 
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
fl260 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl262 = null;
while(ctxt.lookAheadOpeningTag ("<Function")) {
fl262 = acceptor.lAccept_Function(ctxt, "</Function>");
appendFunctions(fl262);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Functions>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Procedures")){
ctxt.skipWhiteSpace();
fl273 = true ; 
while (fl273) { // BeginLoop 
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
fl273 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl275 = null;
while(ctxt.lookAheadOpeningTag ("<Procedure")) {
fl275 = acceptor.lAccept_Procedure(ctxt, "</Procedure>");
appendProcedures(fl275);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Procedures>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Variables")){
ctxt.skipWhiteSpace();
fl286 = true ; 
while (fl286) { // BeginLoop 
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
fl286 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl288 = null;
while(ctxt.lookAheadOpeningTag ("<Variable")) {
fl288 = acceptor.lAccept_Variable(ctxt, "</Variable>");
appendVariables(fl288);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Variables>");
} // If
} // If
// End enclosed
ctxt.skipWhiteSpace();
// Optional Enclosed
if (ctxt.lookAheadOpeningTag("<Rules")){
ctxt.skipWhiteSpace();
fl299 = true ; 
while (fl299) { // BeginLoop 
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
fl299 = false ; 
} // If
} // While
if (ctxt.current() == '/'){
ctxt.advance();
ctxt.accept('>');
} else {
ctxt.accept('>');
// Repeat
ctxt.skipWhiteSpace();
fl301 = null;
while(ctxt.lookAheadOpeningTag ("<Rule")) {
fl301 = acceptor.lAccept_Rule(ctxt, "</Rule>");
appendRules(fl301);
ctxt.skipWhiteSpace();
} // -- monomorphic Loop
// EndRepeat
ctxt.skipWhiteSpace();
ctxt.acceptString ("</Rules>");
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
boolean fl312;
boolean fl313;

ctxt.skipWhiteSpace();
{
// Accept Attributes
fl312 = false ; 
fl313 = true ; 
while (fl313) { // BeginLoop 
if (ctxt.lookAheadString("Name=")){
indicator = 312;
} else {
indicator = 314;
} // If
switch (indicator) {
case 312: {
// Handling attribute Name
// Also handles alien attributes with prefix Name
if (fl312){
ctxt.fail ("Duplicate attribute: Name");
} // If
fl312 = true ; 
quoteChar = ctxt.acceptQuote();
this.setName((acceptor.lAcceptPcData(ctxt,-1, quoteChar, xmlBContext.WS_PRESERVE)));
ctxt.accept(quoteChar);
ctxt.skipWhiteSpace();
break;
} // End of dispatch label
// Final default label
case 314: {
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
fl313 = false ; 
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
  headingTag = "<NameSpace";
  endingTag = "</NameSpace>";
}

pw.print(headingTag);
if (typeId){
pw.print(" xsi:type=\"NameSpace\"");
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
// Testing for empty content: NameSpaces
if (countNameSpaces() > 0){
pw.print("<NameSpaces>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getNameSpaces(), false, "<NameSpace", "</NameSpace>");
pw.print("</NameSpaces>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: NameSpaces
// Unparsing Enclosed
// Testing for empty content: Ranges
if (countRanges() > 0){
pw.print("<Ranges>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getRanges(), false, "<Range", "</Range>");
pw.print("</Ranges>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Ranges
// Unparsing Enclosed
// Testing for empty content: Enumerations
if (countEnumerations() > 0){
pw.print("<Enumerations>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getEnumerations(), false, "<Enum", "</Enum>");
pw.print("</Enumerations>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Enumerations
// Unparsing Enclosed
// Testing for empty content: Structures
if (countStructures() > 0){
pw.print("<Structures>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getStructures(), false, "<Structure", "</Structure>");
pw.print("</Structures>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Structures
// Unparsing Enclosed
// Testing for empty content: Collections
if (countCollections() > 0){
pw.print("<Collections>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getCollections(), false, "<Collection", "</Collection>");
pw.print("</Collections>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Collections
// Unparsing Enclosed
// Testing for empty content: Functions
if (countFunctions() > 0){
pw.print("<Functions>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getFunctions(), false, "<Function", "</Function>");
pw.print("</Functions>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Functions
// Unparsing Enclosed
// Testing for empty content: Procedures
if (countProcedures() > 0){
pw.print("<Procedures>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getProcedures(), false, "<Procedure", "</Procedure>");
pw.print("</Procedures>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Procedures
// Unparsing Enclosed
// Testing for empty content: Variables
if (countVariables() > 0){
pw.print("<Variables>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getVariables(), false, "<Variable", "</Variable>");
pw.print("</Variables>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Variables
// Unparsing Enclosed
// Testing for empty content: Rules
if (countRules() > 0){
pw.print("<Rules>");
pw.println();
// Unparsing Repeat
// Unparsing repetition
unParse(pw, this.getRules(), false, "<Rule", "</Rule>");
pw.print("</Rules>");
// Father is not a mixed
pw.println();
} // If
// After Testing for empty content: Rules
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
for (int i = 0; i < countNameSpaces(); i++) {
  l.add(getNameSpaces(i));
}
for (int i = 0; i < countRanges(); i++) {
  l.add(getRanges(i));
}
for (int i = 0; i < countEnumerations(); i++) {
  l.add(getEnumerations(i));
}
for (int i = 0; i < countStructures(); i++) {
  l.add(getStructures(i));
}
for (int i = 0; i < countCollections(); i++) {
  l.add(getCollections(i));
}
for (int i = 0; i < countFunctions(); i++) {
  l.add(getFunctions(i));
}
for (int i = 0; i < countProcedures(); i++) {
  l.add(getProcedures(i));
}
for (int i = 0; i < countVariables(); i++) {
  l.add(getVariables(i));
}
for (int i = 0; i < countRules(); i++) {
  l.add(getRules(i));
}
}

}

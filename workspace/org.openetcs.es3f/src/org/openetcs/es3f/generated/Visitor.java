
package org.openetcs.es3f.generated;

import com.raincode.xmlbooster.xmlb.*;
import com.raincode.xmlbooster.xmls.*;
import java.io.*;
import java.util.*;

/** <h3>XMLBooster-generated code (Version 2.20.1.0)
  * for class <I>Visitor</i></h3>
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
public class Visitor
extends xmlBBaseVisitor
{
public  void visit(Namable obj)
{
  visit(obj, true);
}

public  void visit(Namable obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(ReferencesParagraph obj)
{
  visit(obj, true);
}

public  void visit(ReferencesParagraph obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(ReqRelated obj)
{
  visit(obj, true);
}

public  void visit(ReqRelated obj, boolean visitSubNodes)
{
visit ((ReferencesParagraph) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Dictionary obj)
{
  visit(obj, true);
}

public  void visit(Dictionary obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(RuleDisabling obj)
{
  visit(obj, true);
}

public  void visit(RuleDisabling obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(NameSpace obj)
{
  visit(obj, true);
}

public  void visit(NameSpace obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(ReqRef obj)
{
  visit(obj, true);
}

public  void visit(ReqRef obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Type obj)
{
  visit(obj, true);
}

public  void visit(Type obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Enum obj)
{
  visit(obj, true);
}

public  void visit(Enum obj, boolean visitSubNodes)
{
visit ((Type) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(EnumValue obj)
{
  visit(obj, true);
}

public  void visit(EnumValue obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Range obj)
{
  visit(obj, true);
}

public  void visit(Range obj, boolean visitSubNodes)
{
visit ((Type) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Structure obj)
{
  visit(obj, true);
}

public  void visit(Structure obj, boolean visitSubNodes)
{
visit ((Type) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(StructureElement obj)
{
  visit(obj, true);
}

public  void visit(StructureElement obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(StructureProcedure obj)
{
  visit(obj, true);
}

public  void visit(StructureProcedure obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Collection obj)
{
  visit(obj, true);
}

public  void visit(Collection obj, boolean visitSubNodes)
{
visit ((Type) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Function obj)
{
  visit(obj, true);
}

public  void visit(Function obj, boolean visitSubNodes)
{
visit ((Type) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Parameter obj)
{
  visit(obj, true);
}

public  void visit(Parameter obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Case obj)
{
  visit(obj, true);
}

public  void visit(Case obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Procedure obj)
{
  visit(obj, true);
}

public  void visit(Procedure obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(StateMachine obj)
{
  visit(obj, true);
}

public  void visit(StateMachine obj, boolean visitSubNodes)
{
visit ((Type) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(State obj)
{
  visit(obj, true);
}

public  void visit(State obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Variable obj)
{
  visit(obj, true);
}

public  void visit(Variable obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Rule obj)
{
  visit(obj, true);
}

public  void visit(Rule obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(RuleCondition obj)
{
  visit(obj, true);
}

public  void visit(RuleCondition obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(PreCondition obj)
{
  visit(obj, true);
}

public  void visit(PreCondition obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Action obj)
{
  visit(obj, true);
}

public  void visit(Action obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Frame obj)
{
  visit(obj, true);
}

public  void visit(Frame obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(SubSequence obj)
{
  visit(obj, true);
}

public  void visit(SubSequence obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(TestCase obj)
{
  visit(obj, true);
}

public  void visit(TestCase obj, boolean visitSubNodes)
{
visit ((ReqRelated) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Step obj)
{
  visit(obj, true);
}

public  void visit(Step obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(SubStep obj)
{
  visit(obj, true);
}

public  void visit(SubStep obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Expectation obj)
{
  visit(obj, true);
}

public  void visit(Expectation obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(DBMessage obj)
{
  visit(obj, true);
}

public  void visit(DBMessage obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(DBPacket obj)
{
  visit(obj, true);
}

public  void visit(DBPacket obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(DBField obj)
{
  visit(obj, true);
}

public  void visit(DBField obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(TranslationDictionary obj)
{
  visit(obj, true);
}

public  void visit(TranslationDictionary obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Folder obj)
{
  visit(obj, true);
}

public  void visit(Folder obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Translation obj)
{
  visit(obj, true);
}

public  void visit(Translation obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(SourceText obj)
{
  visit(obj, true);
}

public  void visit(SourceText obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(ShortcutDictionary obj)
{
  visit(obj, true);
}

public  void visit(ShortcutDictionary obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(ShortcutFolder obj)
{
  visit(obj, true);
}

public  void visit(ShortcutFolder obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Shortcut obj)
{
  visit(obj, true);
}

public  void visit(Shortcut obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Specification obj)
{
  visit(obj, true);
}

public  void visit(Specification obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Chapter obj)
{
  visit(obj, true);
}

public  void visit(Chapter obj, boolean visitSubNodes)
{
visit ((Namable) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Paragraph obj)
{
  visit(obj, true);
}

public  void visit(Paragraph obj, boolean visitSubNodes)
{
visit ((ReferencesParagraph) obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Message obj)
{
  visit(obj, true);
}

public  void visit(Message obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(MsgVariable obj)
{
  visit(obj, true);
}

public  void visit(MsgVariable obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(TypeSpec obj)
{
  visit(obj, true);
}

public  void visit(TypeSpec obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(Values obj)
{
  visit(obj, true);
}

public  void visit(Values obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(special_or_reserved_values obj)
{
  visit(obj, true);
}

public  void visit(special_or_reserved_values obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(special_or_reserved_value obj)
{
  visit(obj, true);
}

public  void visit(special_or_reserved_value obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(mask obj)
{
  visit(obj, true);
}

public  void visit(mask obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(match obj)
{
  visit(obj, true);
}

public  void visit(match obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(meaning obj)
{
  visit(obj, true);
}

public  void visit(meaning obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(match_range obj)
{
  visit(obj, true);
}

public  void visit(match_range obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(resolution_formula obj)
{
  visit(obj, true);
}

public  void visit(resolution_formula obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(value obj)
{
  visit(obj, true);
}

public  void visit(value obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(char_value obj)
{
  visit(obj, true);
}

public  void visit(char_value obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void visit(ParagraphRevision obj)
{
  visit(obj, true);
}

public  void visit(ParagraphRevision obj, boolean visitSubNodes)
{
visit ((xmlBBaseInter)obj, false);
if (visitSubNodes){
xmlBBaseInter Subs[] = acceptor.subElements((xmlBBaseInter)obj);
if (Subs != null){
for (int i=0; i<Subs.length; i++) {
  dispatch(Subs[i], true);
} // If
} // If
}
}

public  void dispatch(xmlBBaseInter obj)
{
  dispatch (obj, true);
}

public  void dispatch(xmlBBaseInter obj, boolean visitSubNodes)
{
if (obj == null){
return;
} // If
((xmlBBase)obj).dispatch(this, visitSubNodes);
} // End of dispatch methods

}

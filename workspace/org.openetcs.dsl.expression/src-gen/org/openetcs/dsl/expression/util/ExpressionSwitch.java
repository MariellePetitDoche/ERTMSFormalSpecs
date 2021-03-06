/**
 */
package org.openetcs.dsl.expression.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.openetcs.dsl.expression.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openetcs.dsl.expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpressionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpressionPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ExpressionPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.PHRASE:
      {
        Phrase phrase = (Phrase)theEObject;
        T result = casePhrase(phrase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = casePhrase(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = casePhrase(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.SINGLE_STATEMENT:
      {
        SingleStatement singleStatement = (SingleStatement)theEObject;
        T result = caseSingleStatement(singleStatement);
        if (result == null) result = caseStatement(singleStatement);
        if (result == null) result = casePhrase(singleStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.SELF_STATEMENT:
      {
        SelfStatement selfStatement = (SelfStatement)theEObject;
        T result = caseSelfStatement(selfStatement);
        if (result == null) result = caseStatement(selfStatement);
        if (result == null) result = casePhrase(selfStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.MULTI_STATEMENT:
      {
        MultiStatement multiStatement = (MultiStatement)theEObject;
        T result = caseMultiStatement(multiStatement);
        if (result == null) result = caseStatement(multiStatement);
        if (result == null) result = casePhrase(multiStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = caseExpression(unaryExpression);
        if (result == null) result = casePhrase(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = caseUnaryExpression(term);
        if (result == null) result = caseExpression(term);
        if (result == null) result = casePhrase(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.DESIGNATOR:
      {
        Designator designator = (Designator)theEObject;
        T result = caseDesignator(designator);
        if (result == null) result = caseTerm(designator);
        if (result == null) result = caseUnaryExpression(designator);
        if (result == null) result = caseExpression(designator);
        if (result == null) result = casePhrase(designator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = casePhrase(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = casePhrase(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.EQUALITY_EXPRESSION:
      {
        EqualityExpression equalityExpression = (EqualityExpression)theEObject;
        T result = caseEqualityExpression(equalityExpression);
        if (result == null) result = caseExpression(equalityExpression);
        if (result == null) result = casePhrase(equalityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.DASH_OPERATION:
      {
        DashOperation dashOperation = (DashOperation)theEObject;
        T result = caseDashOperation(dashOperation);
        if (result == null) result = caseExpression(dashOperation);
        if (result == null) result = casePhrase(dashOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.POINT_OPERATION:
      {
        PointOperation pointOperation = (PointOperation)theEObject;
        T result = casePointOperation(pointOperation);
        if (result == null) result = caseExpression(pointOperation);
        if (result == null) result = casePhrase(pointOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.POW_OPERATION:
      {
        PowOperation powOperation = (PowOperation)theEObject;
        T result = casePowOperation(powOperation);
        if (result == null) result = caseExpression(powOperation);
        if (result == null) result = casePhrase(powOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseTerm(stringValue);
        if (result == null) result = caseUnaryExpression(stringValue);
        if (result == null) result = caseExpression(stringValue);
        if (result == null) result = casePhrase(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.INTEGER_VALUE:
      {
        IntegerValue integerValue = (IntegerValue)theEObject;
        T result = caseIntegerValue(integerValue);
        if (result == null) result = caseTerm(integerValue);
        if (result == null) result = caseUnaryExpression(integerValue);
        if (result == null) result = caseExpression(integerValue);
        if (result == null) result = casePhrase(integerValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpressionPackage.DOUBLE_VALUE:
      {
        DoubleValue doubleValue = (DoubleValue)theEObject;
        T result = caseDoubleValue(doubleValue);
        if (result == null) result = caseTerm(doubleValue);
        if (result == null) result = caseUnaryExpression(doubleValue);
        if (result == null) result = caseExpression(doubleValue);
        if (result == null) result = casePhrase(doubleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phrase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phrase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhrase(Phrase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleStatement(SingleStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Self Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Self Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelfStatement(SelfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiStatement(MultiStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Designator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Designator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDesignator(Designator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualityExpression(EqualityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dash Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dash Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDashOperation(DashOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointOperation(PointOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pow Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pow Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowOperation(PowOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValue(IntegerValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleValue(DoubleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ExpressionSwitch

/**
 */
package org.openetcs.dsl.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.Expression;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.MultiStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.impl.MultiStatementImpl#getDesgnator <em>Desgnator</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.impl.MultiStatementImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiStatementImpl extends StatementImpl implements MultiStatement
{
  /**
   * The cached value of the '{@link #getDesgnator() <em>Desgnator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesgnator()
   * @generated
   * @ordered
   */
  protected Designator desgnator;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExpressionPackage.Literals.MULTI_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Designator getDesgnator()
  {
    return desgnator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesgnator(Designator newDesgnator, NotificationChain msgs)
  {
    Designator oldDesgnator = desgnator;
    desgnator = newDesgnator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.MULTI_STATEMENT__DESGNATOR, oldDesgnator, newDesgnator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesgnator(Designator newDesgnator)
  {
    if (newDesgnator != desgnator)
    {
      NotificationChain msgs = null;
      if (desgnator != null)
        msgs = ((InternalEObject)desgnator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.MULTI_STATEMENT__DESGNATOR, null, msgs);
      if (newDesgnator != null)
        msgs = ((InternalEObject)newDesgnator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.MULTI_STATEMENT__DESGNATOR, null, msgs);
      msgs = basicSetDesgnator(newDesgnator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.MULTI_STATEMENT__DESGNATOR, newDesgnator, newDesgnator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, ExpressionPackage.MULTI_STATEMENT__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExpressionPackage.MULTI_STATEMENT__DESGNATOR:
        return basicSetDesgnator(null, msgs);
      case ExpressionPackage.MULTI_STATEMENT__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExpressionPackage.MULTI_STATEMENT__DESGNATOR:
        return getDesgnator();
      case ExpressionPackage.MULTI_STATEMENT__EXPRESSIONS:
        return getExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpressionPackage.MULTI_STATEMENT__DESGNATOR:
        setDesgnator((Designator)newValue);
        return;
      case ExpressionPackage.MULTI_STATEMENT__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExpressionPackage.MULTI_STATEMENT__DESGNATOR:
        setDesgnator((Designator)null);
        return;
      case ExpressionPackage.MULTI_STATEMENT__EXPRESSIONS:
        getExpressions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExpressionPackage.MULTI_STATEMENT__DESGNATOR:
        return desgnator != null;
      case ExpressionPackage.MULTI_STATEMENT__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MultiStatementImpl

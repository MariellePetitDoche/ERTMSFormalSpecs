/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.ecore.EClass;

import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TermImpl extends UnaryExpressionImpl implements Term
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermImpl()
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
    return ExpressionPackage.Literals.TERM;
  }

} //TermImpl

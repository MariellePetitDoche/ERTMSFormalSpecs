/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.MultiStatement#getDesgnator <em>Desgnator</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.MultiStatement#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getMultiStatement()
 * @model
 * @generated
 */
public interface MultiStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Desgnator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desgnator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desgnator</em>' containment reference.
   * @see #setDesgnator(Designator)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getMultiStatement_Desgnator()
   * @model containment="true"
   * @generated
   */
  Designator getDesgnator();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.MultiStatement#getDesgnator <em>Desgnator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desgnator</em>' containment reference.
   * @see #getDesgnator()
   * @generated
   */
  void setDesgnator(Designator value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.openetcs.dsl.expression.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.openetcs.dsl.expression.ExpressionPackage#getMultiStatement_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // MultiStatement

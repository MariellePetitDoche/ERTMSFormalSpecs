/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.SingleStatement#getDesgnator <em>Desgnator</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.SingleStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getSingleStatement()
 * @model
 * @generated
 */
public interface SingleStatement extends Statement
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
   * @see org.openetcs.dsl.expression.ExpressionPackage#getSingleStatement_Desgnator()
   * @model containment="true"
   * @generated
   */
  Designator getDesgnator();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.SingleStatement#getDesgnator <em>Desgnator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desgnator</em>' containment reference.
   * @see #getDesgnator()
   * @generated
   */
  void setDesgnator(Designator value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getSingleStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.SingleStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // SingleStatement

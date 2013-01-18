/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.Model#getPhrase <em>Phrase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Phrase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phrase</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phrase</em>' containment reference.
   * @see #setPhrase(Phrase)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getModel_Phrase()
   * @model containment="true"
   * @generated
   */
  Phrase getPhrase();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Model#getPhrase <em>Phrase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phrase</em>' containment reference.
   * @see #getPhrase()
   * @generated
   */
  void setPhrase(Phrase value);

} // Model

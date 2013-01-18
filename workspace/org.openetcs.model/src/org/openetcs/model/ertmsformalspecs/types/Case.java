/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.eclipse.emf.ecore.EObject;
import org.openetcs.model.ertmsformalspecs.behaviour.PreCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Case#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Case#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Case#getParentFunction <em>Parent Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentCase <em>Parent Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getCase_PreConditions()
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentCase
	 * @model opposite="parentCase" containment="true"
	 * @generated
	 */
	EList<PreCondition> getPreConditions();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getCase_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Case#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Parent Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Function#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Function</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Function</em>' container reference.
	 * @see #setParentFunction(Function)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getCase_ParentFunction()
	 * @see org.openetcs.model.ertmsformalspecs.types.Function#getCases
	 * @model opposite="cases" transient="false"
	 * @generated
	 */
	Function getParentFunction();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Case#getParentFunction <em>Parent Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Function</em>' container reference.
	 * @see #getParentFunction()
	 * @generated
	 */
	void setParentFunction(Function value);

} // Case

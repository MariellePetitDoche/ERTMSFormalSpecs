/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.openetcs.model.ertmsformalspecs.types.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentProcedure <em>Parent Procedure</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Parameter#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentFunction <em>Parent Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Procedure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Procedure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Procedure</em>' container reference.
	 * @see #setParentProcedure(Procedure)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getParameter_ParentProcedure()
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Procedure getParentProcedure();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentProcedure <em>Parent Procedure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Procedure</em>' container reference.
	 * @see #getParentProcedure()
	 * @generated
	 */
	void setParentProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getParameter_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Parameter#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Function</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Function</em>' container reference.
	 * @see #setParentFunction(Function)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getParameter_ParentFunction()
	 * @see org.openetcs.model.ertmsformalspecs.types.Function#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Function getParentFunction();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentFunction <em>Parent Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Function</em>' container reference.
	 * @see #getParentFunction()
	 * @generated
	 */
	void setParentFunction(Function value);

} // Parameter

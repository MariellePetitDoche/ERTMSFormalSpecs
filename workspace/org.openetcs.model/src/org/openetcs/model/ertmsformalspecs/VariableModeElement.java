/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Mode Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.VariableModeElement#getVariableMode <em>Variable Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getVariableModeElement()
 * @model
 * @generated
 */
public interface VariableModeElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.VariableMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Mode</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.VariableMode
	 * @see #setVariableMode(VariableMode)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getVariableModeElement_VariableMode()
	 * @model
	 * @generated
	 */
	VariableMode getVariableMode();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.VariableModeElement#getVariableMode <em>Variable Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Mode</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.VariableMode
	 * @see #getVariableMode()
	 * @generated
	 */
	void setVariableMode(VariableMode value);

} // VariableModeElement

/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolution Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getResolutionFormula()
 * @model
 * @generated
 */
public interface ResolutionFormula extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit
	 * @see #setUnit(ResolutionFormulaUnit)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getResolutionFormula_Unit()
	 * @model
	 * @generated
	 */
	ResolutionFormulaUnit getUnit();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ResolutionFormulaUnit value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue
	 * @see #setValue(ResolutionFormulaValue)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getResolutionFormula_Value()
	 * @model
	 * @generated
	 */
	ResolutionFormulaValue getValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ResolutionFormulaValue value);

} // ResolutionFormula

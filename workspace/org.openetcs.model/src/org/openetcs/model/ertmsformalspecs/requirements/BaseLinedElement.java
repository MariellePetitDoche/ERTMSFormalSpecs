/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

import org.eclipse.emf.ecore.EObject;
import org.openetcs.model.ertmsformalspecs.BaseLine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Lined Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement#getBaseline <em>Baseline</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getBaseLinedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BaseLinedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baseline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseline</em>' reference.
	 * @see #setBaseline(BaseLine)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getBaseLinedElement_Baseline()
	 * @model
	 * @generated
	 */
	BaseLine getBaseline();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement#getBaseline <em>Baseline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline</em>' reference.
	 * @see #getBaseline()
	 * @generated
	 */
	void setBaseline(BaseLine value);

} // BaseLinedElement

/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baselines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Baselines#getAvailableBaselines <em>Available Baselines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getBaselines()
 * @model
 * @generated
 */
public interface Baselines extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Baselines</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.BaseLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Baselines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Baselines</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getBaselines_AvailableBaselines()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseLine> getAvailableBaselines();

} // Baselines

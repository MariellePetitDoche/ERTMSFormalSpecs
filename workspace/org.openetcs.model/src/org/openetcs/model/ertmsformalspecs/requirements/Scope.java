/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isOnBoardUnit <em>On Board Unit</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isTrackSide <em>Track Side</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject {
	/**
	 * Returns the value of the '<em><b>On Board Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Board Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Board Unit</em>' attribute.
	 * @see #setOnBoardUnit(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getScope_OnBoardUnit()
	 * @model
	 * @generated
	 */
	boolean isOnBoardUnit();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isOnBoardUnit <em>On Board Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Board Unit</em>' attribute.
	 * @see #isOnBoardUnit()
	 * @generated
	 */
	void setOnBoardUnit(boolean value);

	/**
	 * Returns the value of the '<em><b>Track Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Side</em>' attribute.
	 * @see #setTrackSide(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getScope_TrackSide()
	 * @model
	 * @generated
	 */
	boolean isTrackSide();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isTrackSide <em>Track Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Side</em>' attribute.
	 * @see #isTrackSide()
	 * @generated
	 */
	void setTrackSide(boolean value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getScope_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // Scope

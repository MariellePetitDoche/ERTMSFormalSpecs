/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Blocks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.FunctionalBlocks#getAvailableFunctionalBlocks <em>Available Functional Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getFunctionalBlocks()
 * @model
 * @generated
 */
public interface FunctionalBlocks extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Functional Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Functional Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Functional Blocks</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getFunctionalBlocks_AvailableFunctionalBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalBlock> getAvailableFunctionalBlocks();

} // FunctionalBlocks

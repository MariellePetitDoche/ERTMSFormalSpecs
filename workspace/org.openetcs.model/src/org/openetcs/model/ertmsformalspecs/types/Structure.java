/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.Procedure;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Structure#getElements <em>Elements</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Structure#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Structure#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends Type {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.types.StructureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getStructure_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureElement> getElements();

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Procedure}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getStructure_Procedures()
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getParentStructure
	 * @model opposite="parentStructure" containment="true"
	 * @generated
	 */
	EList<Procedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getStructure_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Structure

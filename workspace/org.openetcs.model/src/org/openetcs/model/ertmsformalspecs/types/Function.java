/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Function#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Type, TypedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentFunction <em>Parent Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getFunction_Parameters()
	 * @see org.openetcs.model.ertmsformalspecs.Parameter#getParentFunction
	 * @model opposite="parentFunction" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.types.Case}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Case#getParentFunction <em>Parent Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getFunction_Cases()
	 * @see org.openetcs.model.ertmsformalspecs.types.Case#getParentFunction
	 * @model opposite="parentFunction" containment="true"
	 * @generated
	 */
	EList<Case> getCases();

} // Function

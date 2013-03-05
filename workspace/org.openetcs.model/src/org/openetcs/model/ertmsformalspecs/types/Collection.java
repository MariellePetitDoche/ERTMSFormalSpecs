/**
 */
package org.openetcs.model.ertmsformalspecs.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Collection#getMaximumSize <em>Maximum Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends Type, TypedElement {
	/**
	 * Returns the value of the '<em><b>Maximum Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Size</em>' attribute.
	 * @see #setMaximumSize(int)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getCollection_MaximumSize()
	 * @model
	 * @generated
	 */
	int getMaximumSize();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Collection#getMaximumSize <em>Maximum Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Size</em>' attribute.
	 * @see #getMaximumSize()
	 * @generated
	 */
	void setMaximumSize(int value);

} // Collection

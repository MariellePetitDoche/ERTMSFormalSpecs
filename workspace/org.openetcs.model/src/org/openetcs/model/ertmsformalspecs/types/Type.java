/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import org.openetcs.model.ertmsformalspecs.DefaultValueElement;
import org.openetcs.model.ertmsformalspecs.Namespace;
import org.openetcs.model.ertmsformalspecs.ReqRelated;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Type#getParentNamespace <em>Parent Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends ReqRelated, DefaultValueElement {
	/**
	 * Returns the value of the '<em><b>Parent Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Namespace#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Namespace</em>' container reference.
	 * @see #setParentNamespace(Namespace)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getType_ParentNamespace()
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getTypes
	 * @model opposite="types" transient="false"
	 * @generated
	 */
	Namespace getParentNamespace();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Type#getParentNamespace <em>Parent Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Namespace</em>' container reference.
	 * @see #getParentNamespace()
	 * @generated
	 */
	void setParentNamespace(Namespace value);

} // Type

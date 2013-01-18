/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentMessage <em>Parent Message</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentPacket <em>Parent Packet</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestField#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestField#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestField()
 * @model
 * @generated
 */
public interface TestField extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Message</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Message</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Message</em>' container reference.
	 * @see #setParentMessage(TestMessage)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestField_ParentMessage()
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	TestMessage getParentMessage();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentMessage <em>Parent Message</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Message</em>' container reference.
	 * @see #getParentMessage()
	 * @generated
	 */
	void setParentMessage(TestMessage value);

	/**
	 * Returns the value of the '<em><b>Parent Packet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.TestPacket#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Packet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Packet</em>' container reference.
	 * @see #setParentPacket(TestPacket)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestField_ParentPacket()
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPacket#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	TestPacket getParentPacket();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentPacket <em>Parent Packet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Packet</em>' container reference.
	 * @see #getParentPacket()
	 * @generated
	 */
	void setParentPacket(TestPacket value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestField_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestField_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // TestField

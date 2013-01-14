/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getOrder <em>Order</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getFields <em>Fields</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getPackets <em>Packets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestMessage()
 * @model
 * @generated
 */
public interface TestMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.Step#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Step</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Step</em>' container reference.
	 * @see #setParentStep(Step)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestMessage_ParentStep()
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getMessages
	 * @model opposite="messages" transient="false"
	 * @generated
	 */
	Step getParentStep();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getParentStep <em>Parent Step</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Step</em>' container reference.
	 * @see #getParentStep()
	 * @generated
	 */
	void setParentStep(Step value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestMessage_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.TestField}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentMessage <em>Parent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestMessage_Fields()
	 * @see org.openetcs.model.ertmsformalspecs.test.TestField#getParentMessage
	 * @model opposite="parentMessage" containment="true"
	 * @generated
	 */
	EList<TestField> getFields();

	/**
	 * Returns the value of the '<em><b>Packets</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.TestPacket}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.TestPacket#getParentMessage <em>Parent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packets</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestMessage_Packets()
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPacket#getParentMessage
	 * @model opposite="parentMessage" containment="true"
	 * @generated
	 */
	EList<TestPacket> getPackets();

} // TestMessage

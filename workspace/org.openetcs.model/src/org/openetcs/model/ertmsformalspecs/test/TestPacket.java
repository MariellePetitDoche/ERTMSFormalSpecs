/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestPacket#getParentMessage <em>Parent Message</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestPacket#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestPacket()
 * @model
 * @generated
 */
public interface TestPacket extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Message</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Message</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Message</em>' container reference.
	 * @see #setParentMessage(TestMessage)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestPacket_ParentMessage()
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage#getPackets
	 * @model opposite="packets" transient="false"
	 * @generated
	 */
	TestMessage getParentMessage();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestPacket#getParentMessage <em>Parent Message</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Message</em>' container reference.
	 * @see #getParentMessage()
	 * @generated
	 */
	void setParentMessage(TestMessage value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.TestField}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentPacket <em>Parent Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestPacket_Fields()
	 * @see org.openetcs.model.ertmsformalspecs.test.TestField#getParentPacket
	 * @model opposite="parentPacket" containment="true"
	 * @generated
	 */
	EList<TestField> getFields();

} // TestPacket

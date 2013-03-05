/**
 */
package org.openetcs.model.ertmsformalspecs.test.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openetcs.model.ertmsformalspecs.test.TestField;
import org.openetcs.model.ertmsformalspecs.test.TestMessage;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.test.TestPacket;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl#getParentMessage <em>Parent Message</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl#getParentPacket <em>Parent Packet</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestFieldImpl extends EObjectImpl implements TestField {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMessage getParentMessage() {
		if (eContainerFeatureID() != TestPackage.TEST_FIELD__PARENT_MESSAGE) return null;
		return (TestMessage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentMessage(TestMessage newParentMessage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentMessage, TestPackage.TEST_FIELD__PARENT_MESSAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMessage(TestMessage newParentMessage) {
		if (newParentMessage != eInternalContainer() || (eContainerFeatureID() != TestPackage.TEST_FIELD__PARENT_MESSAGE && newParentMessage != null)) {
			if (EcoreUtil.isAncestor(this, newParentMessage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentMessage != null)
				msgs = ((InternalEObject)newParentMessage).eInverseAdd(this, TestPackage.TEST_MESSAGE__FIELDS, TestMessage.class, msgs);
			msgs = basicSetParentMessage(newParentMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD__PARENT_MESSAGE, newParentMessage, newParentMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPacket getParentPacket() {
		if (eContainerFeatureID() != TestPackage.TEST_FIELD__PARENT_PACKET) return null;
		return (TestPacket)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentPacket(TestPacket newParentPacket, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentPacket, TestPackage.TEST_FIELD__PARENT_PACKET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentPacket(TestPacket newParentPacket) {
		if (newParentPacket != eInternalContainer() || (eContainerFeatureID() != TestPackage.TEST_FIELD__PARENT_PACKET && newParentPacket != null)) {
			if (EcoreUtil.isAncestor(this, newParentPacket))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentPacket != null)
				msgs = ((InternalEObject)newParentPacket).eInverseAdd(this, TestPackage.TEST_PACKET__FIELDS, TestPacket.class, msgs);
			msgs = basicSetParentPacket(newParentPacket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD__PARENT_PACKET, newParentPacket, newParentPacket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_FIELD__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_FIELD__PARENT_MESSAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentMessage((TestMessage)otherEnd, msgs);
			case TestPackage.TEST_FIELD__PARENT_PACKET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentPacket((TestPacket)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_FIELD__PARENT_MESSAGE:
				return basicSetParentMessage(null, msgs);
			case TestPackage.TEST_FIELD__PARENT_PACKET:
				return basicSetParentPacket(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TestPackage.TEST_FIELD__PARENT_MESSAGE:
				return eInternalContainer().eInverseRemove(this, TestPackage.TEST_MESSAGE__FIELDS, TestMessage.class, msgs);
			case TestPackage.TEST_FIELD__PARENT_PACKET:
				return eInternalContainer().eInverseRemove(this, TestPackage.TEST_PACKET__FIELDS, TestPacket.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.TEST_FIELD__NAME:
				return getName();
			case TestPackage.TEST_FIELD__PARENT_MESSAGE:
				return getParentMessage();
			case TestPackage.TEST_FIELD__PARENT_PACKET:
				return getParentPacket();
			case TestPackage.TEST_FIELD__VARIABLE:
				return getVariable();
			case TestPackage.TEST_FIELD__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.TEST_FIELD__NAME:
				setName((String)newValue);
				return;
			case TestPackage.TEST_FIELD__PARENT_MESSAGE:
				setParentMessage((TestMessage)newValue);
				return;
			case TestPackage.TEST_FIELD__PARENT_PACKET:
				setParentPacket((TestPacket)newValue);
				return;
			case TestPackage.TEST_FIELD__VARIABLE:
				setVariable((String)newValue);
				return;
			case TestPackage.TEST_FIELD__VALUE:
				setValue((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestPackage.TEST_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD__PARENT_MESSAGE:
				setParentMessage((TestMessage)null);
				return;
			case TestPackage.TEST_FIELD__PARENT_PACKET:
				setParentPacket((TestPacket)null);
				return;
			case TestPackage.TEST_FIELD__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case TestPackage.TEST_FIELD__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestPackage.TEST_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.TEST_FIELD__PARENT_MESSAGE:
				return getParentMessage() != null;
			case TestPackage.TEST_FIELD__PARENT_PACKET:
				return getParentPacket() != null;
			case TestPackage.TEST_FIELD__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case TestPackage.TEST_FIELD__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", variable: ");
		result.append(variable);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TestFieldImpl

/**
 */
package org.openetcs.model.ertmsformalspecs.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.test.Step;
import org.openetcs.model.ertmsformalspecs.test.TestField;
import org.openetcs.model.ertmsformalspecs.test.TestMessage;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.test.TestPacket;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl#getPackets <em>Packets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestMessageImpl extends EObjectImpl implements TestMessage {
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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TestField> fields;

	/**
	 * The cached value of the '{@link #getPackets() <em>Packets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackets()
	 * @generated
	 * @ordered
	 */
	protected EList<TestPacket> packets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getParentStep() {
		if (eContainerFeatureID() != TestPackage.TEST_MESSAGE__PARENT_STEP) return null;
		return (Step)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStep(Step newParentStep, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStep, TestPackage.TEST_MESSAGE__PARENT_STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStep(Step newParentStep) {
		if (newParentStep != eInternalContainer() || (eContainerFeatureID() != TestPackage.TEST_MESSAGE__PARENT_STEP && newParentStep != null)) {
			if (EcoreUtil.isAncestor(this, newParentStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStep != null)
				msgs = ((InternalEObject)newParentStep).eInverseAdd(this, TestPackage.STEP__MESSAGES, Step.class, msgs);
			msgs = basicSetParentStep(newParentStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_MESSAGE__PARENT_STEP, newParentStep, newParentStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.TEST_MESSAGE__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<TestField>(TestField.class, this, TestPackage.TEST_MESSAGE__FIELDS, TestPackage.TEST_FIELD__PARENT_MESSAGE);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestPacket> getPackets() {
		if (packets == null) {
			packets = new EObjectContainmentWithInverseEList<TestPacket>(TestPacket.class, this, TestPackage.TEST_MESSAGE__PACKETS, TestPackage.TEST_PACKET__PARENT_MESSAGE);
		}
		return packets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.TEST_MESSAGE__PARENT_STEP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStep((Step)otherEnd, msgs);
			case TestPackage.TEST_MESSAGE__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
			case TestPackage.TEST_MESSAGE__PACKETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackets()).basicAdd(otherEnd, msgs);
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
			case TestPackage.TEST_MESSAGE__PARENT_STEP:
				return basicSetParentStep(null, msgs);
			case TestPackage.TEST_MESSAGE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case TestPackage.TEST_MESSAGE__PACKETS:
				return ((InternalEList<?>)getPackets()).basicRemove(otherEnd, msgs);
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
			case TestPackage.TEST_MESSAGE__PARENT_STEP:
				return eInternalContainer().eInverseRemove(this, TestPackage.STEP__MESSAGES, Step.class, msgs);
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
			case TestPackage.TEST_MESSAGE__NAME:
				return getName();
			case TestPackage.TEST_MESSAGE__PARENT_STEP:
				return getParentStep();
			case TestPackage.TEST_MESSAGE__ORDER:
				return getOrder();
			case TestPackage.TEST_MESSAGE__FIELDS:
				return getFields();
			case TestPackage.TEST_MESSAGE__PACKETS:
				return getPackets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.TEST_MESSAGE__NAME:
				setName((String)newValue);
				return;
			case TestPackage.TEST_MESSAGE__PARENT_STEP:
				setParentStep((Step)newValue);
				return;
			case TestPackage.TEST_MESSAGE__ORDER:
				setOrder((Integer)newValue);
				return;
			case TestPackage.TEST_MESSAGE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends TestField>)newValue);
				return;
			case TestPackage.TEST_MESSAGE__PACKETS:
				getPackets().clear();
				getPackets().addAll((Collection<? extends TestPacket>)newValue);
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
			case TestPackage.TEST_MESSAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.TEST_MESSAGE__PARENT_STEP:
				setParentStep((Step)null);
				return;
			case TestPackage.TEST_MESSAGE__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case TestPackage.TEST_MESSAGE__FIELDS:
				getFields().clear();
				return;
			case TestPackage.TEST_MESSAGE__PACKETS:
				getPackets().clear();
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
			case TestPackage.TEST_MESSAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.TEST_MESSAGE__PARENT_STEP:
				return getParentStep() != null;
			case TestPackage.TEST_MESSAGE__ORDER:
				return order != ORDER_EDEFAULT;
			case TestPackage.TEST_MESSAGE__FIELDS:
				return fields != null && !fields.isEmpty();
			case TestPackage.TEST_MESSAGE__PACKETS:
				return packets != null && !packets.isEmpty();
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
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //TestMessageImpl

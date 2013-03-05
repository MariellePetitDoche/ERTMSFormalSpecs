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
import org.openetcs.model.ertmsformalspecs.test.Expectation;
import org.openetcs.model.ertmsformalspecs.test.SubStep;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl#getParentSubStep <em>Parent Sub Step</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl#isBlocking <em>Blocking</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl#getDeadline <em>Deadline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpectationImpl extends EObjectImpl implements Expectation {
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
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isBlocking() <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlocking() <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocking()
	 * @generated
	 * @ordered
	 */
	protected boolean blocking = BLOCKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final int DEADLINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected int deadline = DEADLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.EXPECTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.EXPECTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubStep getParentSubStep() {
		if (eContainerFeatureID() != TestPackage.EXPECTATION__PARENT_SUB_STEP) return null;
		return (SubStep)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSubStep(SubStep newParentSubStep, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSubStep, TestPackage.EXPECTATION__PARENT_SUB_STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSubStep(SubStep newParentSubStep) {
		if (newParentSubStep != eInternalContainer() || (eContainerFeatureID() != TestPackage.EXPECTATION__PARENT_SUB_STEP && newParentSubStep != null)) {
			if (EcoreUtil.isAncestor(this, newParentSubStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSubStep != null)
				msgs = ((InternalEObject)newParentSubStep).eInverseAdd(this, TestPackage.SUB_STEP__EXPECTATIONS, SubStep.class, msgs);
			msgs = basicSetParentSubStep(newParentSubStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.EXPECTATION__PARENT_SUB_STEP, newParentSubStep, newParentSubStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.EXPECTATION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlocking() {
		return blocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocking(boolean newBlocking) {
		boolean oldBlocking = blocking;
		blocking = newBlocking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.EXPECTATION__BLOCKING, oldBlocking, blocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(int newDeadline) {
		int oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.EXPECTATION__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.EXPECTATION__PARENT_SUB_STEP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSubStep((SubStep)otherEnd, msgs);
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
			case TestPackage.EXPECTATION__PARENT_SUB_STEP:
				return basicSetParentSubStep(null, msgs);
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
			case TestPackage.EXPECTATION__PARENT_SUB_STEP:
				return eInternalContainer().eInverseRemove(this, TestPackage.SUB_STEP__EXPECTATIONS, SubStep.class, msgs);
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
			case TestPackage.EXPECTATION__NAME:
				return getName();
			case TestPackage.EXPECTATION__PARENT_SUB_STEP:
				return getParentSubStep();
			case TestPackage.EXPECTATION__EXPRESSION:
				return getExpression();
			case TestPackage.EXPECTATION__BLOCKING:
				return isBlocking();
			case TestPackage.EXPECTATION__DEADLINE:
				return getDeadline();
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
			case TestPackage.EXPECTATION__NAME:
				setName((String)newValue);
				return;
			case TestPackage.EXPECTATION__PARENT_SUB_STEP:
				setParentSubStep((SubStep)newValue);
				return;
			case TestPackage.EXPECTATION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case TestPackage.EXPECTATION__BLOCKING:
				setBlocking((Boolean)newValue);
				return;
			case TestPackage.EXPECTATION__DEADLINE:
				setDeadline((Integer)newValue);
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
			case TestPackage.EXPECTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.EXPECTATION__PARENT_SUB_STEP:
				setParentSubStep((SubStep)null);
				return;
			case TestPackage.EXPECTATION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case TestPackage.EXPECTATION__BLOCKING:
				setBlocking(BLOCKING_EDEFAULT);
				return;
			case TestPackage.EXPECTATION__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
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
			case TestPackage.EXPECTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.EXPECTATION__PARENT_SUB_STEP:
				return getParentSubStep() != null;
			case TestPackage.EXPECTATION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case TestPackage.EXPECTATION__BLOCKING:
				return blocking != BLOCKING_EDEFAULT;
			case TestPackage.EXPECTATION__DEADLINE:
				return deadline != DEADLINE_EDEFAULT;
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
		result.append(", expression: ");
		result.append(expression);
		result.append(", blocking: ");
		result.append(blocking);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(')');
		return result.toString();
	}

} //ExpectationImpl

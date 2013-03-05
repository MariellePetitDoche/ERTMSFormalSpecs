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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl;

import org.openetcs.model.ertmsformalspecs.test.SingleTestCase;
import org.openetcs.model.ertmsformalspecs.test.Step;
import org.openetcs.model.ertmsformalspecs.test.SubSequence;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl#getParentSubSequence <em>Parent Sub Sequence</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleTestCaseImpl extends ReqRelatedImpl implements SingleTestCase {
	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final int FEATURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected int feature = FEATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected static final int CASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
	protected int case_ = CASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.SINGLE_TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSequence getParentSubSequence() {
		if (eContainerFeatureID() != TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE) return null;
		return (SubSequence)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSubSequence(SubSequence newParentSubSequence, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSubSequence, TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSubSequence(SubSequence newParentSubSequence) {
		if (newParentSubSequence != eInternalContainer() || (eContainerFeatureID() != TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE && newParentSubSequence != null)) {
			if (EcoreUtil.isAncestor(this, newParentSubSequence))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSubSequence != null)
				msgs = ((InternalEObject)newParentSubSequence).eInverseAdd(this, TestPackage.SUB_SEQUENCE__TEST_CASES, SubSequence.class, msgs);
			msgs = basicSetParentSubSequence(newParentSubSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE, newParentSubSequence, newParentSubSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(int newFeature) {
		int oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SINGLE_TEST_CASE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCase() {
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase(int newCase) {
		int oldCase = case_;
		case_ = newCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SINGLE_TEST_CASE__CASE, oldCase, case_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentWithInverseEList<Step>(Step.class, this, TestPackage.SINGLE_TEST_CASE__STEPS, TestPackage.STEP__PARENT_TEST_CASE);
		}
		return steps;
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
			case TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSubSequence((SubSequence)otherEnd, msgs);
			case TestPackage.SINGLE_TEST_CASE__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
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
			case TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE:
				return basicSetParentSubSequence(null, msgs);
			case TestPackage.SINGLE_TEST_CASE__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE:
				return eInternalContainer().eInverseRemove(this, TestPackage.SUB_SEQUENCE__TEST_CASES, SubSequence.class, msgs);
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
			case TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE:
				return getParentSubSequence();
			case TestPackage.SINGLE_TEST_CASE__FEATURE:
				return getFeature();
			case TestPackage.SINGLE_TEST_CASE__CASE:
				return getCase();
			case TestPackage.SINGLE_TEST_CASE__STEPS:
				return getSteps();
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
			case TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE:
				setParentSubSequence((SubSequence)newValue);
				return;
			case TestPackage.SINGLE_TEST_CASE__FEATURE:
				setFeature((Integer)newValue);
				return;
			case TestPackage.SINGLE_TEST_CASE__CASE:
				setCase((Integer)newValue);
				return;
			case TestPackage.SINGLE_TEST_CASE__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
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
			case TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE:
				setParentSubSequence((SubSequence)null);
				return;
			case TestPackage.SINGLE_TEST_CASE__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case TestPackage.SINGLE_TEST_CASE__CASE:
				setCase(CASE_EDEFAULT);
				return;
			case TestPackage.SINGLE_TEST_CASE__STEPS:
				getSteps().clear();
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
			case TestPackage.SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE:
				return getParentSubSequence() != null;
			case TestPackage.SINGLE_TEST_CASE__FEATURE:
				return feature != FEATURE_EDEFAULT;
			case TestPackage.SINGLE_TEST_CASE__CASE:
				return case_ != CASE_EDEFAULT;
			case TestPackage.SINGLE_TEST_CASE__STEPS:
				return steps != null && !steps.isEmpty();
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
		result.append(" (feature: ");
		result.append(feature);
		result.append(", case: ");
		result.append(case_);
		result.append(')');
		return result.toString();
	}

} //SingleTestCaseImpl

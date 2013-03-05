/**
 */
package org.openetcs.model.ertmsformalspecs.types.impl;

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
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.PreCondition;
import org.openetcs.model.ertmsformalspecs.types.Case;
import org.openetcs.model.ertmsformalspecs.types.Function;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.CaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.CaseImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.CaseImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.CaseImpl#getParentFunction <em>Parent Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseImpl extends EObjectImpl implements Case {
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
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PreCondition> preConditions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.CASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreCondition> getPreConditions() {
		if (preConditions == null) {
			preConditions = new EObjectContainmentWithInverseEList<PreCondition>(PreCondition.class, this, TypesPackage.CASE__PRE_CONDITIONS, BehaviourPackage.PRE_CONDITION__PARENT_CASE);
		}
		return preConditions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CASE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getParentFunction() {
		if (eContainerFeatureID() != TypesPackage.CASE__PARENT_FUNCTION) return null;
		return (Function)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFunction(Function newParentFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFunction, TypesPackage.CASE__PARENT_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFunction(Function newParentFunction) {
		if (newParentFunction != eInternalContainer() || (eContainerFeatureID() != TypesPackage.CASE__PARENT_FUNCTION && newParentFunction != null)) {
			if (EcoreUtil.isAncestor(this, newParentFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFunction != null)
				msgs = ((InternalEObject)newParentFunction).eInverseAdd(this, TypesPackage.FUNCTION__CASES, Function.class, msgs);
			msgs = basicSetParentFunction(newParentFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.CASE__PARENT_FUNCTION, newParentFunction, newParentFunction));
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
			case TypesPackage.CASE__PRE_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreConditions()).basicAdd(otherEnd, msgs);
			case TypesPackage.CASE__PARENT_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFunction((Function)otherEnd, msgs);
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
			case TypesPackage.CASE__PRE_CONDITIONS:
				return ((InternalEList<?>)getPreConditions()).basicRemove(otherEnd, msgs);
			case TypesPackage.CASE__PARENT_FUNCTION:
				return basicSetParentFunction(null, msgs);
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
			case TypesPackage.CASE__PARENT_FUNCTION:
				return eInternalContainer().eInverseRemove(this, TypesPackage.FUNCTION__CASES, Function.class, msgs);
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
			case TypesPackage.CASE__NAME:
				return getName();
			case TypesPackage.CASE__PRE_CONDITIONS:
				return getPreConditions();
			case TypesPackage.CASE__EXPRESSION:
				return getExpression();
			case TypesPackage.CASE__PARENT_FUNCTION:
				return getParentFunction();
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
			case TypesPackage.CASE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.CASE__PRE_CONDITIONS:
				getPreConditions().clear();
				getPreConditions().addAll((Collection<? extends PreCondition>)newValue);
				return;
			case TypesPackage.CASE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case TypesPackage.CASE__PARENT_FUNCTION:
				setParentFunction((Function)newValue);
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
			case TypesPackage.CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesPackage.CASE__PRE_CONDITIONS:
				getPreConditions().clear();
				return;
			case TypesPackage.CASE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case TypesPackage.CASE__PARENT_FUNCTION:
				setParentFunction((Function)null);
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
			case TypesPackage.CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesPackage.CASE__PRE_CONDITIONS:
				return preConditions != null && !preConditions.isEmpty();
			case TypesPackage.CASE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case TypesPackage.CASE__PARENT_FUNCTION:
				return getParentFunction() != null;
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
		result.append(')');
		return result.toString();
	}

} //CaseImpl

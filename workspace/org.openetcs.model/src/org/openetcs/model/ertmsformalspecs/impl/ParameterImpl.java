/**
 */
package org.openetcs.model.ertmsformalspecs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Parameter;
import org.openetcs.model.ertmsformalspecs.Procedure;
import org.openetcs.model.ertmsformalspecs.types.Function;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ParameterImpl#getParentProcedure <em>Parent Procedure</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ParameterImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ParameterImpl#getParentFunction <em>Parent Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
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
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getParentProcedure() {
		if (eContainerFeatureID() != ModelPackage.PARAMETER__PARENT_PROCEDURE) return null;
		return (Procedure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentProcedure(Procedure newParentProcedure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentProcedure, ModelPackage.PARAMETER__PARENT_PROCEDURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProcedure(Procedure newParentProcedure) {
		if (newParentProcedure != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PARAMETER__PARENT_PROCEDURE && newParentProcedure != null)) {
			if (EcoreUtil.isAncestor(this, newParentProcedure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentProcedure != null)
				msgs = ((InternalEObject)newParentProcedure).eInverseAdd(this, ModelPackage.PROCEDURE__PARAMETERS, Procedure.class, msgs);
			msgs = basicSetParentProcedure(newParentProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__PARENT_PROCEDURE, newParentProcedure, newParentProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getParentFunction() {
		if (eContainerFeatureID() != ModelPackage.PARAMETER__PARENT_FUNCTION) return null;
		return (Function)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFunction(Function newParentFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFunction, ModelPackage.PARAMETER__PARENT_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFunction(Function newParentFunction) {
		if (newParentFunction != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PARAMETER__PARENT_FUNCTION && newParentFunction != null)) {
			if (EcoreUtil.isAncestor(this, newParentFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFunction != null)
				msgs = ((InternalEObject)newParentFunction).eInverseAdd(this, TypesPackage.FUNCTION__PARAMETERS, Function.class, msgs);
			msgs = basicSetParentFunction(newParentFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PARAMETER__PARENT_FUNCTION, newParentFunction, newParentFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PARAMETER__PARENT_PROCEDURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentProcedure((Procedure)otherEnd, msgs);
			case ModelPackage.PARAMETER__PARENT_FUNCTION:
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
			case ModelPackage.PARAMETER__PARENT_PROCEDURE:
				return basicSetParentProcedure(null, msgs);
			case ModelPackage.PARAMETER__PARENT_FUNCTION:
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
			case ModelPackage.PARAMETER__PARENT_PROCEDURE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.PROCEDURE__PARAMETERS, Procedure.class, msgs);
			case ModelPackage.PARAMETER__PARENT_FUNCTION:
				return eInternalContainer().eInverseRemove(this, TypesPackage.FUNCTION__PARAMETERS, Function.class, msgs);
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
			case ModelPackage.PARAMETER__NAME:
				return getName();
			case ModelPackage.PARAMETER__PARENT_PROCEDURE:
				return getParentProcedure();
			case ModelPackage.PARAMETER__TYPE_NAME:
				return getTypeName();
			case ModelPackage.PARAMETER__PARENT_FUNCTION:
				return getParentFunction();
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
			case ModelPackage.PARAMETER__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PARAMETER__PARENT_PROCEDURE:
				setParentProcedure((Procedure)newValue);
				return;
			case ModelPackage.PARAMETER__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ModelPackage.PARAMETER__PARENT_FUNCTION:
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
			case ModelPackage.PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PARAMETER__PARENT_PROCEDURE:
				setParentProcedure((Procedure)null);
				return;
			case ModelPackage.PARAMETER__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ModelPackage.PARAMETER__PARENT_FUNCTION:
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
			case ModelPackage.PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PARAMETER__PARENT_PROCEDURE:
				return getParentProcedure() != null;
			case ModelPackage.PARAMETER__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ModelPackage.PARAMETER__PARENT_FUNCTION:
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
		result.append(", typeName: ");
		result.append(typeName);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl

/**
 */
package org.openetcs.model.ertmsformalspecs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.VariableMode;
import org.openetcs.model.ertmsformalspecs.VariableModeElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Mode Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableModeElementImpl#getVariableMode <em>Variable Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableModeElementImpl extends EObjectImpl implements VariableModeElement {
	/**
	 * The default value of the '{@link #getVariableMode() <em>Variable Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableMode()
	 * @generated
	 * @ordered
	 */
	protected static final VariableMode VARIABLE_MODE_EDEFAULT = VariableMode.INCOMING;

	/**
	 * The cached value of the '{@link #getVariableMode() <em>Variable Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableMode()
	 * @generated
	 * @ordered
	 */
	protected VariableMode variableMode = VARIABLE_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableModeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VARIABLE_MODE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableMode getVariableMode() {
		return variableMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableMode(VariableMode newVariableMode) {
		VariableMode oldVariableMode = variableMode;
		variableMode = newVariableMode == null ? VARIABLE_MODE_EDEFAULT : newVariableMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE, oldVariableMode, variableMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE:
				return getVariableMode();
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
			case ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE:
				setVariableMode((VariableMode)newValue);
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
			case ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE:
				setVariableMode(VARIABLE_MODE_EDEFAULT);
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
			case ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE:
				return variableMode != VARIABLE_MODE_EDEFAULT;
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
		result.append(" (variableMode: ");
		result.append(variableMode);
		result.append(')');
		return result.toString();
	}

} //VariableModeElementImpl

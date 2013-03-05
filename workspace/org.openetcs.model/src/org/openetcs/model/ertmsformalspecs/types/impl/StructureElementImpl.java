/**
 */
package org.openetcs.model.ertmsformalspecs.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openetcs.model.ertmsformalspecs.DefaultValueElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.VariableMode;
import org.openetcs.model.ertmsformalspecs.VariableModeElement;
import org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl;
import org.openetcs.model.ertmsformalspecs.types.StructureElement;
import org.openetcs.model.ertmsformalspecs.types.TypedElement;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.StructureElementImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.StructureElementImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.StructureElementImpl#getVariableMode <em>Variable Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureElementImpl extends ReqRelatedImpl implements StructureElement {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

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
	protected StructureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.STRUCTURE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_ELEMENT__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_ELEMENT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_ELEMENT__VARIABLE_MODE, oldVariableMode, variableMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_ELEMENT__TYPE_NAME:
				return getTypeName();
			case TypesPackage.STRUCTURE_ELEMENT__DEFAULT_VALUE:
				return getDefaultValue();
			case TypesPackage.STRUCTURE_ELEMENT__VARIABLE_MODE:
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
			case TypesPackage.STRUCTURE_ELEMENT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case TypesPackage.STRUCTURE_ELEMENT__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case TypesPackage.STRUCTURE_ELEMENT__VARIABLE_MODE:
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
			case TypesPackage.STRUCTURE_ELEMENT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case TypesPackage.STRUCTURE_ELEMENT__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case TypesPackage.STRUCTURE_ELEMENT__VARIABLE_MODE:
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
			case TypesPackage.STRUCTURE_ELEMENT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case TypesPackage.STRUCTURE_ELEMENT__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case TypesPackage.STRUCTURE_ELEMENT__VARIABLE_MODE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.STRUCTURE_ELEMENT__TYPE_NAME: return TypesPackage.TYPED_ELEMENT__TYPE_NAME;
				default: return -1;
			}
		}
		if (baseClass == DefaultValueElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.STRUCTURE_ELEMENT__DEFAULT_VALUE: return ModelPackage.DEFAULT_VALUE_ELEMENT__DEFAULT_VALUE;
				default: return -1;
			}
		}
		if (baseClass == VariableModeElement.class) {
			switch (derivedFeatureID) {
				case TypesPackage.STRUCTURE_ELEMENT__VARIABLE_MODE: return ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case TypesPackage.TYPED_ELEMENT__TYPE_NAME: return TypesPackage.STRUCTURE_ELEMENT__TYPE_NAME;
				default: return -1;
			}
		}
		if (baseClass == DefaultValueElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.DEFAULT_VALUE_ELEMENT__DEFAULT_VALUE: return TypesPackage.STRUCTURE_ELEMENT__DEFAULT_VALUE;
				default: return -1;
			}
		}
		if (baseClass == VariableModeElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE: return TypesPackage.STRUCTURE_ELEMENT__VARIABLE_MODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", variableMode: ");
		result.append(variableMode);
		result.append(')');
		return result.toString();
	}

} //StructureElementImpl

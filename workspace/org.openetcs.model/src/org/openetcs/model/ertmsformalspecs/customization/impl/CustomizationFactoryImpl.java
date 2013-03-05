/**
 */
package org.openetcs.model.ertmsformalspecs.customization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openetcs.model.ertmsformalspecs.customization.*;
import org.openetcs.model.ertmsformalspecs.customization.CustomizationFactory;
import org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage;
import org.openetcs.model.ertmsformalspecs.customization.RuleDisabling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomizationFactoryImpl extends EFactoryImpl implements CustomizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomizationFactory init() {
		try {
			CustomizationFactory theCustomizationFactory = (CustomizationFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/openetcs/ertmsformalspecs/customization"); 
			if (theCustomizationFactory != null) {
				return theCustomizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CustomizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomizationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CustomizationPackage.RULE_DISABLING: return createRuleDisabling();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDisabling createRuleDisabling() {
		RuleDisablingImpl ruleDisabling = new RuleDisablingImpl();
		return ruleDisabling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomizationPackage getCustomizationPackage() {
		return (CustomizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CustomizationPackage getPackage() {
		return CustomizationPackage.eINSTANCE;
	}

} //CustomizationFactoryImpl

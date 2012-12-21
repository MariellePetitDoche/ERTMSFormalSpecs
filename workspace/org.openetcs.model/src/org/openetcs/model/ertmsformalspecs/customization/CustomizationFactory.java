/**
 */
package org.openetcs.model.ertmsformalspecs.customization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage
 * @generated
 */
public interface CustomizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomizationFactory eINSTANCE = org.openetcs.model.ertmsformalspecs.customization.impl.CustomizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rule Disabling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Disabling</em>'.
	 * @generated
	 */
	RuleDisabling createRuleDisabling();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CustomizationPackage getCustomizationPackage();

} //CustomizationFactory

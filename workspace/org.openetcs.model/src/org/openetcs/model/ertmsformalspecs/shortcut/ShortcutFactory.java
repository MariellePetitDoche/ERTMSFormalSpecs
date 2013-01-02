/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage
 * @generated
 */
public interface ShortcutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShortcutFactory eINSTANCE = org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	ShortcutFolder createShortcutFolder();

	/**
	 * Returns a new object of class '<em>Shortcut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shortcut</em>'.
	 * @generated
	 */
	Shortcut createShortcut();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ShortcutPackage getShortcutPackage();

} //ShortcutFactory

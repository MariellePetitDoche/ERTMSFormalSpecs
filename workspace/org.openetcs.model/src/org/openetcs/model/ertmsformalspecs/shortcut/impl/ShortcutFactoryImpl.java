/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openetcs.model.ertmsformalspecs.shortcut.*;
import org.openetcs.model.ertmsformalspecs.shortcut.Shortcut;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFactory;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShortcutFactoryImpl extends EFactoryImpl implements ShortcutFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShortcutFactory init() {
		try {
			ShortcutFactory theShortcutFactory = (ShortcutFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/openetcs/ertmsformalspecs/shortcut"); 
			if (theShortcutFactory != null) {
				return theShortcutFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShortcutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutFactoryImpl() {
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
			case ShortcutPackage.SHORTCUT_FOLDER: return createShortcutFolder();
			case ShortcutPackage.SHORTCUT: return createShortcut();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutFolder createShortcutFolder() {
		ShortcutFolderImpl shortcutFolder = new ShortcutFolderImpl();
		return shortcutFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shortcut createShortcut() {
		ShortcutImpl shortcut = new ShortcutImpl();
		return shortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutPackage getShortcutPackage() {
		return (ShortcutPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShortcutPackage getPackage() {
		return ShortcutPackage.eINSTANCE;
	}

} //ShortcutFactoryImpl

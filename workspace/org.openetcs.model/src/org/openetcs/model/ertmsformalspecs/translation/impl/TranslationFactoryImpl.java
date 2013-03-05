/**
 */
package org.openetcs.model.ertmsformalspecs.translation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openetcs.model.ertmsformalspecs.translation.*;
import org.openetcs.model.ertmsformalspecs.translation.SourceText;
import org.openetcs.model.ertmsformalspecs.translation.Translation;
import org.openetcs.model.ertmsformalspecs.translation.TranslationFactory;
import org.openetcs.model.ertmsformalspecs.translation.TranslationFolder;
import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TranslationFactoryImpl extends EFactoryImpl implements TranslationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TranslationFactory init() {
		try {
			TranslationFactory theTranslationFactory = (TranslationFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/openetcs/ertmsformalspecs/translation"); 
			if (theTranslationFactory != null) {
				return theTranslationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TranslationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationFactoryImpl() {
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
			case TranslationPackage.TRANSLATION_FOLDER: return createTranslationFolder();
			case TranslationPackage.TRANSLATION: return createTranslation();
			case TranslationPackage.SOURCE_TEXT: return createSourceText();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationFolder createTranslationFolder() {
		TranslationFolderImpl translationFolder = new TranslationFolderImpl();
		return translationFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceText createSourceText() {
		SourceTextImpl sourceText = new SourceTextImpl();
		return sourceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationPackage getTranslationPackage() {
		return (TranslationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TranslationPackage getPackage() {
		return TranslationPackage.eINSTANCE;
	}

} //TranslationFactoryImpl

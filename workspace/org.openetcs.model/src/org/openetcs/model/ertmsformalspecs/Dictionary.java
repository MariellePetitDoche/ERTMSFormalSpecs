/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.customization.RuleDisabling;
import org.openetcs.model.ertmsformalspecs.requirements.Specification;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder;
import org.openetcs.model.ertmsformalspecs.test.Frame;
import org.openetcs.model.ertmsformalspecs.translation.TranslationFolder;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Dictionary#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Dictionary#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Dictionary#getTests <em>Tests</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Dictionary#getRuleDisablings <em>Rule Disablings</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Dictionary#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Dictionary#getShortcuts <em>Shortcuts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends NamedElement, CommentedElement {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.requirements.Specification#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Specification)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getDictionary_Specification()
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Specification#getParentDictionary
	 * @model opposite="parentDictionary" containment="true"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Namespace}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getDictionary_Namespaces()
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getParentDictionary
	 * @model opposite="parentDictionary" containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespaces();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.Frame}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.Frame#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getDictionary_Tests()
	 * @see org.openetcs.model.ertmsformalspecs.test.Frame#getParentDictionary
	 * @model opposite="parentDictionary" containment="true"
	 * @generated
	 */
	EList<Frame> getTests();

	/**
	 * Returns the value of the '<em><b>Rule Disablings</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Disablings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Disablings</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getDictionary_RuleDisablings()
	 * @see org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getParentDictionary
	 * @model opposite="parentDictionary" containment="true"
	 * @generated
	 */
	EList<RuleDisabling> getRuleDisablings();

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationFolder)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getDictionary_Translations()
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentDictionary
	 * @model opposite="parentDictionary" containment="true"
	 * @generated
	 */
	TranslationFolder getTranslations();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationFolder value);

	/**
	 * Returns the value of the '<em><b>Shortcuts</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortcuts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortcuts</em>' containment reference.
	 * @see #setShortcuts(ShortcutFolder)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getDictionary_Shortcuts()
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentDictionary
	 * @model opposite="parentDictionary" containment="true"
	 * @generated
	 */
	ShortcutFolder getShortcuts();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getShortcuts <em>Shortcuts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shortcuts</em>' containment reference.
	 * @see #getShortcuts()
	 * @generated
	 */
	void setShortcuts(ShortcutFolder value);

} // Dictionary

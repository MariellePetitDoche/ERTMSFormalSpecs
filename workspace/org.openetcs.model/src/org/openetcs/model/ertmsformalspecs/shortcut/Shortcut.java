/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut;

import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shortcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcut()
 * @model
 * @generated
 */
public interface Shortcut extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getShortcuts <em>Shortcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Folder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Folder</em>' container reference.
	 * @see #setParentFolder(ShortcutFolder)
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcut_ParentFolder()
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getShortcuts
	 * @model opposite="shortcuts" transient="false"
	 * @generated
	 */
	ShortcutFolder getParentFolder();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getParentFolder <em>Parent Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Folder</em>' container reference.
	 * @see #getParentFolder()
	 * @generated
	 */
	void setParentFolder(ShortcutFolder value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(NamedElement)
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcut_Ref()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getRef();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(NamedElement value);

} // Shortcut

/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getShortcuts <em>Shortcuts</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcutFolder()
 * @model
 * @generated
 */
public interface ShortcutFolder extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Folders</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folders</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcutFolder_SubFolders()
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentFolder
	 * @model opposite="parentFolder" containment="true"
	 * @generated
	 */
	EList<ShortcutFolder> getSubFolders();

	/**
	 * Returns the value of the '<em><b>Parent Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Folder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Folder</em>' container reference.
	 * @see #setParentFolder(ShortcutFolder)
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcutFolder_ParentFolder()
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getSubFolders
	 * @model opposite="subFolders" transient="false"
	 * @generated
	 */
	ShortcutFolder getParentFolder();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentFolder <em>Parent Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Folder</em>' container reference.
	 * @see #getParentFolder()
	 * @generated
	 */
	void setParentFolder(ShortcutFolder value);

	/**
	 * Returns the value of the '<em><b>Shortcuts</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortcuts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortcuts</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcutFolder_Shortcuts()
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getParentFolder
	 * @model opposite="parentFolder" containment="true"
	 * @generated
	 */
	EList<Shortcut> getShortcuts();

	/**
	 * Returns the value of the '<em><b>Parent Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getShortcuts <em>Shortcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Dictionary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #setParentDictionary(Dictionary)
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#getShortcutFolder_ParentDictionary()
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getShortcuts
	 * @model opposite="shortcuts" transient="false"
	 * @generated
	 */
	Dictionary getParentDictionary();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentDictionary <em>Parent Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #getParentDictionary()
	 * @generated
	 */
	void setParentDictionary(Dictionary value);

} // ShortcutFolder

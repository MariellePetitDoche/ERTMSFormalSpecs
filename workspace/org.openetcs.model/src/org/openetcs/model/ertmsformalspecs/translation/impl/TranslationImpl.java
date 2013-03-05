/**
 */
package org.openetcs.model.ertmsformalspecs.translation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.test.SubStep;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.translation.SourceText;
import org.openetcs.model.ertmsformalspecs.translation.Translation;
import org.openetcs.model.ertmsformalspecs.translation.TranslationFolder;
import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl#isImplemented <em>Implemented</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TranslationImpl extends EObjectImpl implements Translation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceText> sources;

	/**
	 * The cached value of the '{@link #getSubSteps() <em>Sub Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SubStep> subSteps;

	/**
	 * The default value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplemented()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLEMENTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplemented()
	 * @generated
	 * @ordered
	 */
	protected boolean implemented = IMPLEMENTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TranslationPackage.Literals.TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.TRANSLATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.TRANSLATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationFolder getParentFolder() {
		if (eContainerFeatureID() != TranslationPackage.TRANSLATION__PARENT_FOLDER) return null;
		return (TranslationFolder)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFolder(TranslationFolder newParentFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFolder, TranslationPackage.TRANSLATION__PARENT_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFolder(TranslationFolder newParentFolder) {
		if (newParentFolder != eInternalContainer() || (eContainerFeatureID() != TranslationPackage.TRANSLATION__PARENT_FOLDER && newParentFolder != null)) {
			if (EcoreUtil.isAncestor(this, newParentFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFolder != null)
				msgs = ((InternalEObject)newParentFolder).eInverseAdd(this, TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS, TranslationFolder.class, msgs);
			msgs = basicSetParentFolder(newParentFolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.TRANSLATION__PARENT_FOLDER, newParentFolder, newParentFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceText> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentWithInverseEList<SourceText>(SourceText.class, this, TranslationPackage.TRANSLATION__SOURCES, TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubStep> getSubSteps() {
		if (subSteps == null) {
			subSteps = new EObjectContainmentWithInverseEList<SubStep>(SubStep.class, this, TranslationPackage.TRANSLATION__SUB_STEPS, TestPackage.SUB_STEP__PARENT_TRANSLATION);
		}
		return subSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplemented() {
		return implemented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplemented(boolean newImplemented) {
		boolean oldImplemented = implemented;
		implemented = newImplemented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.TRANSLATION__IMPLEMENTED, oldImplemented, implemented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TranslationPackage.TRANSLATION__PARENT_FOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFolder((TranslationFolder)otherEnd, msgs);
			case TranslationPackage.TRANSLATION__SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSources()).basicAdd(otherEnd, msgs);
			case TranslationPackage.TRANSLATION__SUB_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubSteps()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TranslationPackage.TRANSLATION__PARENT_FOLDER:
				return basicSetParentFolder(null, msgs);
			case TranslationPackage.TRANSLATION__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case TranslationPackage.TRANSLATION__SUB_STEPS:
				return ((InternalEList<?>)getSubSteps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TranslationPackage.TRANSLATION__PARENT_FOLDER:
				return eInternalContainer().eInverseRemove(this, TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS, TranslationFolder.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TranslationPackage.TRANSLATION__NAME:
				return getName();
			case TranslationPackage.TRANSLATION__COMMENT:
				return getComment();
			case TranslationPackage.TRANSLATION__PARENT_FOLDER:
				return getParentFolder();
			case TranslationPackage.TRANSLATION__SOURCES:
				return getSources();
			case TranslationPackage.TRANSLATION__SUB_STEPS:
				return getSubSteps();
			case TranslationPackage.TRANSLATION__IMPLEMENTED:
				return isImplemented();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TranslationPackage.TRANSLATION__NAME:
				setName((String)newValue);
				return;
			case TranslationPackage.TRANSLATION__COMMENT:
				setComment((String)newValue);
				return;
			case TranslationPackage.TRANSLATION__PARENT_FOLDER:
				setParentFolder((TranslationFolder)newValue);
				return;
			case TranslationPackage.TRANSLATION__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends SourceText>)newValue);
				return;
			case TranslationPackage.TRANSLATION__SUB_STEPS:
				getSubSteps().clear();
				getSubSteps().addAll((Collection<? extends SubStep>)newValue);
				return;
			case TranslationPackage.TRANSLATION__IMPLEMENTED:
				setImplemented((Boolean)newValue);
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
			case TranslationPackage.TRANSLATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TranslationPackage.TRANSLATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TranslationPackage.TRANSLATION__PARENT_FOLDER:
				setParentFolder((TranslationFolder)null);
				return;
			case TranslationPackage.TRANSLATION__SOURCES:
				getSources().clear();
				return;
			case TranslationPackage.TRANSLATION__SUB_STEPS:
				getSubSteps().clear();
				return;
			case TranslationPackage.TRANSLATION__IMPLEMENTED:
				setImplemented(IMPLEMENTED_EDEFAULT);
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
			case TranslationPackage.TRANSLATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TranslationPackage.TRANSLATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TranslationPackage.TRANSLATION__PARENT_FOLDER:
				return getParentFolder() != null;
			case TranslationPackage.TRANSLATION__SOURCES:
				return sources != null && !sources.isEmpty();
			case TranslationPackage.TRANSLATION__SUB_STEPS:
				return subSteps != null && !subSteps.isEmpty();
			case TranslationPackage.TRANSLATION__IMPLEMENTED:
				return implemented != IMPLEMENTED_EDEFAULT;
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
		if (baseClass == CommentedElement.class) {
			switch (derivedFeatureID) {
				case TranslationPackage.TRANSLATION__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
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
		if (baseClass == CommentedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return TranslationPackage.TRANSLATION__COMMENT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(", implemented: ");
		result.append(implemented);
		result.append(')');
		return result.toString();
	}

} //TranslationImpl

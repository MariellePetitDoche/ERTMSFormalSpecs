/**
 */
package org.openetcs.model.ertmsformalspecs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Namespace;
import org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage;
import org.openetcs.model.ertmsformalspecs.customization.RuleDisabling;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;
import org.openetcs.model.ertmsformalspecs.requirements.Specification;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage;
import org.openetcs.model.ertmsformalspecs.test.Frame;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.translation.TranslationFolder;
import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getRuleDisablings <em>Rule Disablings</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl#getShortcuts <em>Shortcuts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DictionaryImpl extends EObjectImpl implements Dictionary {
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
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification specification;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespaces;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Frame> tests;

	/**
	 * The cached value of the '{@link #getRuleDisablings() <em>Rule Disablings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleDisablings()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleDisabling> ruleDisablings;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationFolder translations;

	/**
	 * The cached value of the '{@link #getShortcuts() <em>Shortcuts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortcuts()
	 * @generated
	 * @ordered
	 */
	protected ShortcutFolder shortcuts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictionaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DICTIONARY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
		Specification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY, Specification.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY, Specification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentWithInverseEList<Namespace>(Namespace.class, this, ModelPackage.DICTIONARY__NAMESPACES, ModelPackage.NAMESPACE__PARENT_DICTIONARY);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Frame> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentWithInverseEList<Frame>(Frame.class, this, ModelPackage.DICTIONARY__TESTS, TestPackage.FRAME__PARENT_DICTIONARY);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleDisabling> getRuleDisablings() {
		if (ruleDisablings == null) {
			ruleDisablings = new EObjectContainmentWithInverseEList<RuleDisabling>(RuleDisabling.class, this, ModelPackage.DICTIONARY__RULE_DISABLINGS, CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY);
		}
		return ruleDisablings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationFolder getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationFolder newTranslations, NotificationChain msgs) {
		TranslationFolder oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationFolder newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY, TranslationFolder.class, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY, TranslationFolder.class, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutFolder getShortcuts() {
		return shortcuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShortcuts(ShortcutFolder newShortcuts, NotificationChain msgs) {
		ShortcutFolder oldShortcuts = shortcuts;
		shortcuts = newShortcuts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__SHORTCUTS, oldShortcuts, newShortcuts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortcuts(ShortcutFolder newShortcuts) {
		if (newShortcuts != shortcuts) {
			NotificationChain msgs = null;
			if (shortcuts != null)
				msgs = ((InternalEObject)shortcuts).eInverseRemove(this, ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY, ShortcutFolder.class, msgs);
			if (newShortcuts != null)
				msgs = ((InternalEObject)newShortcuts).eInverseAdd(this, ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY, ShortcutFolder.class, msgs);
			msgs = basicSetShortcuts(newShortcuts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DICTIONARY__SHORTCUTS, newShortcuts, newShortcuts));
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
			case ModelPackage.DICTIONARY__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DICTIONARY__SPECIFICATION, null, msgs);
				return basicSetSpecification((Specification)otherEnd, msgs);
			case ModelPackage.DICTIONARY__NAMESPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamespaces()).basicAdd(otherEnd, msgs);
			case ModelPackage.DICTIONARY__TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTests()).basicAdd(otherEnd, msgs);
			case ModelPackage.DICTIONARY__RULE_DISABLINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuleDisablings()).basicAdd(otherEnd, msgs);
			case ModelPackage.DICTIONARY__TRANSLATIONS:
				if (translations != null)
					msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DICTIONARY__TRANSLATIONS, null, msgs);
				return basicSetTranslations((TranslationFolder)otherEnd, msgs);
			case ModelPackage.DICTIONARY__SHORTCUTS:
				if (shortcuts != null)
					msgs = ((InternalEObject)shortcuts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DICTIONARY__SHORTCUTS, null, msgs);
				return basicSetShortcuts((ShortcutFolder)otherEnd, msgs);
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
			case ModelPackage.DICTIONARY__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case ModelPackage.DICTIONARY__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
			case ModelPackage.DICTIONARY__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case ModelPackage.DICTIONARY__RULE_DISABLINGS:
				return ((InternalEList<?>)getRuleDisablings()).basicRemove(otherEnd, msgs);
			case ModelPackage.DICTIONARY__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case ModelPackage.DICTIONARY__SHORTCUTS:
				return basicSetShortcuts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DICTIONARY__NAME:
				return getName();
			case ModelPackage.DICTIONARY__COMMENT:
				return getComment();
			case ModelPackage.DICTIONARY__SPECIFICATION:
				return getSpecification();
			case ModelPackage.DICTIONARY__NAMESPACES:
				return getNamespaces();
			case ModelPackage.DICTIONARY__TESTS:
				return getTests();
			case ModelPackage.DICTIONARY__RULE_DISABLINGS:
				return getRuleDisablings();
			case ModelPackage.DICTIONARY__TRANSLATIONS:
				return getTranslations();
			case ModelPackage.DICTIONARY__SHORTCUTS:
				return getShortcuts();
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
			case ModelPackage.DICTIONARY__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.DICTIONARY__COMMENT:
				setComment((String)newValue);
				return;
			case ModelPackage.DICTIONARY__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case ModelPackage.DICTIONARY__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends Namespace>)newValue);
				return;
			case ModelPackage.DICTIONARY__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Frame>)newValue);
				return;
			case ModelPackage.DICTIONARY__RULE_DISABLINGS:
				getRuleDisablings().clear();
				getRuleDisablings().addAll((Collection<? extends RuleDisabling>)newValue);
				return;
			case ModelPackage.DICTIONARY__TRANSLATIONS:
				setTranslations((TranslationFolder)newValue);
				return;
			case ModelPackage.DICTIONARY__SHORTCUTS:
				setShortcuts((ShortcutFolder)newValue);
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
			case ModelPackage.DICTIONARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.DICTIONARY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ModelPackage.DICTIONARY__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case ModelPackage.DICTIONARY__NAMESPACES:
				getNamespaces().clear();
				return;
			case ModelPackage.DICTIONARY__TESTS:
				getTests().clear();
				return;
			case ModelPackage.DICTIONARY__RULE_DISABLINGS:
				getRuleDisablings().clear();
				return;
			case ModelPackage.DICTIONARY__TRANSLATIONS:
				setTranslations((TranslationFolder)null);
				return;
			case ModelPackage.DICTIONARY__SHORTCUTS:
				setShortcuts((ShortcutFolder)null);
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
			case ModelPackage.DICTIONARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.DICTIONARY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ModelPackage.DICTIONARY__SPECIFICATION:
				return specification != null;
			case ModelPackage.DICTIONARY__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
			case ModelPackage.DICTIONARY__TESTS:
				return tests != null && !tests.isEmpty();
			case ModelPackage.DICTIONARY__RULE_DISABLINGS:
				return ruleDisablings != null && !ruleDisablings.isEmpty();
			case ModelPackage.DICTIONARY__TRANSLATIONS:
				return translations != null;
			case ModelPackage.DICTIONARY__SHORTCUTS:
				return shortcuts != null;
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
				case ModelPackage.DICTIONARY__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
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
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return ModelPackage.DICTIONARY__COMMENT;
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
		result.append(')');
		return result.toString();
	}

} //DictionaryImpl

/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.impl;

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
import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;
import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;
import org.openetcs.model.ertmsformalspecs.requirements.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationImpl extends EObjectImpl implements Specification {
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
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected BaseLine baseline;

	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> paragraphs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseLine getBaseline() {
		if (baseline != null && baseline.eIsProxy()) {
			InternalEObject oldBaseline = (InternalEObject)baseline;
			baseline = (BaseLine)eResolveProxy(oldBaseline);
			if (baseline != oldBaseline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.SPECIFICATION__BASELINE, oldBaseline, baseline));
			}
		}
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseLine basicGetBaseline() {
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseline(BaseLine newBaseline) {
		BaseLine oldBaseline = baseline;
		baseline = newBaseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SPECIFICATION__BASELINE, oldBaseline, baseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentWithInverseEList<Paragraph>(Paragraph.class, this, RequirementsPackage.SPECIFICATION__PARAGRAPHS, RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getParentDictionary() {
		if (eContainerFeatureID() != RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY) return null;
		return (Dictionary)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDictionary(Dictionary newParentDictionary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentDictionary, RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDictionary(Dictionary newParentDictionary) {
		if (newParentDictionary != eInternalContainer() || (eContainerFeatureID() != RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY && newParentDictionary != null)) {
			if (EcoreUtil.isAncestor(this, newParentDictionary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentDictionary != null)
				msgs = ((InternalEObject)newParentDictionary).eInverseAdd(this, ModelPackage.DICTIONARY__SPECIFICATION, Dictionary.class, msgs);
			msgs = basicSetParentDictionary(newParentDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY, newParentDictionary, newParentDictionary));
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
			case RequirementsPackage.SPECIFICATION__PARAGRAPHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParagraphs()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentDictionary((Dictionary)otherEnd, msgs);
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
			case RequirementsPackage.SPECIFICATION__PARAGRAPHS:
				return ((InternalEList<?>)getParagraphs()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY:
				return basicSetParentDictionary(null, msgs);
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
			case RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DICTIONARY__SPECIFICATION, Dictionary.class, msgs);
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
			case RequirementsPackage.SPECIFICATION__NAME:
				return getName();
			case RequirementsPackage.SPECIFICATION__BASELINE:
				if (resolve) return getBaseline();
				return basicGetBaseline();
			case RequirementsPackage.SPECIFICATION__PARAGRAPHS:
				return getParagraphs();
			case RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY:
				return getParentDictionary();
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
			case RequirementsPackage.SPECIFICATION__NAME:
				setName((String)newValue);
				return;
			case RequirementsPackage.SPECIFICATION__BASELINE:
				setBaseline((BaseLine)newValue);
				return;
			case RequirementsPackage.SPECIFICATION__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)newValue);
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
			case RequirementsPackage.SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RequirementsPackage.SPECIFICATION__BASELINE:
				setBaseline((BaseLine)null);
				return;
			case RequirementsPackage.SPECIFICATION__PARAGRAPHS:
				getParagraphs().clear();
				return;
			case RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)null);
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
			case RequirementsPackage.SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RequirementsPackage.SPECIFICATION__BASELINE:
				return baseline != null;
			case RequirementsPackage.SPECIFICATION__PARAGRAPHS:
				return paragraphs != null && !paragraphs.isEmpty();
			case RequirementsPackage.SPECIFICATION__PARENT_DICTIONARY:
				return getParentDictionary() != null;
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
		if (baseClass == BaseLinedElement.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.SPECIFICATION__BASELINE: return RequirementsPackage.BASE_LINED_ELEMENT__BASELINE;
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
		if (baseClass == BaseLinedElement.class) {
			switch (baseFeatureID) {
				case RequirementsPackage.BASE_LINED_ELEMENT__BASELINE: return RequirementsPackage.SPECIFICATION__BASELINE;
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
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl

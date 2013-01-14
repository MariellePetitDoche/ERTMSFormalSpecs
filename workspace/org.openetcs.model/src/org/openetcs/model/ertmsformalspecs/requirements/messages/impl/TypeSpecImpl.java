/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;
import org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getResolutionFormula <em>Resolution Formula</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getErtmsType <em>Ertms Type</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getReferenceParagraph <em>Reference Paragraph</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSpecImpl extends EObjectImpl implements TypeSpec {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected String minimumValue = MINIMUM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected String maximumValue = MAXIMUM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolutionFormula() <em>Resolution Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolutionFormula() <em>Resolution Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionFormula()
	 * @generated
	 * @ordered
	 */
	protected String resolutionFormula = RESOLUTION_FORMULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getErtmsType() <em>Ertms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErtmsType()
	 * @generated
	 * @ordered
	 */
	protected static final EErtmsType ERTMS_TYPE_EDEFAULT = EErtmsType.DISTANCE;

	/**
	 * The cached value of the '{@link #getErtmsType() <em>Ertms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErtmsType()
	 * @generated
	 * @ordered
	 */
	protected EErtmsType ertmsType = ERTMS_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Value value;

	/**
	 * The cached value of the '{@link #getReferenceParagraph() <em>Reference Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceParagraph()
	 * @generated
	 * @ordered
	 */
	protected Paragraph referenceParagraph;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected BaseLine version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagesPackage.Literals.TYPE_SPEC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MessagesPackage.TYPE_SPEC__BASELINE, oldBaseline, baseline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__BASELINE, oldBaseline, baseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(String newMinimumValue) {
		String oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__MINIMUM_VALUE, oldMinimumValue, minimumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumValue() {
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValue(String newMaximumValue) {
		String oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__MAXIMUM_VALUE, oldMaximumValue, maximumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolutionFormula() {
		return resolutionFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionFormula(String newResolutionFormula) {
		String oldResolutionFormula = resolutionFormula;
		resolutionFormula = newResolutionFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__RESOLUTION_FORMULA, oldResolutionFormula, resolutionFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErtmsType getErtmsType() {
		return ertmsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErtmsType(EErtmsType newErtmsType) {
		EErtmsType oldErtmsType = ertmsType;
		ertmsType = newErtmsType == null ? ERTMS_TYPE_EDEFAULT : newErtmsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__ERTMS_TYPE, oldErtmsType, ertmsType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Value newValue, NotificationChain msgs) {
		Value oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Value newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.TYPE_SPEC__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.TYPE_SPEC__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getReferenceParagraph() {
		if (referenceParagraph != null && referenceParagraph.eIsProxy()) {
			InternalEObject oldReferenceParagraph = (InternalEObject)referenceParagraph;
			referenceParagraph = (Paragraph)eResolveProxy(oldReferenceParagraph);
			if (referenceParagraph != oldReferenceParagraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MessagesPackage.TYPE_SPEC__REFERENCE_PARAGRAPH, oldReferenceParagraph, referenceParagraph));
			}
		}
		return referenceParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph basicGetReferenceParagraph() {
		return referenceParagraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceParagraph(Paragraph newReferenceParagraph) {
		Paragraph oldReferenceParagraph = referenceParagraph;
		referenceParagraph = newReferenceParagraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__REFERENCE_PARAGRAPH, oldReferenceParagraph, referenceParagraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseLine getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (BaseLine)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MessagesPackage.TYPE_SPEC__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseLine basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(BaseLine newVersion) {
		BaseLine oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_SPEC__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessagesPackage.TYPE_SPEC__VALUE:
				return basicSetValue(null, msgs);
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
			case MessagesPackage.TYPE_SPEC__BASELINE:
				if (resolve) return getBaseline();
				return basicGetBaseline();
			case MessagesPackage.TYPE_SPEC__ID:
				return getId();
			case MessagesPackage.TYPE_SPEC__SHORT_DESCRIPTION:
				return getShortDescription();
			case MessagesPackage.TYPE_SPEC__DESCRIPTION:
				return getDescription();
			case MessagesPackage.TYPE_SPEC__LENGTH:
				return getLength();
			case MessagesPackage.TYPE_SPEC__MINIMUM_VALUE:
				return getMinimumValue();
			case MessagesPackage.TYPE_SPEC__MAXIMUM_VALUE:
				return getMaximumValue();
			case MessagesPackage.TYPE_SPEC__RESOLUTION_FORMULA:
				return getResolutionFormula();
			case MessagesPackage.TYPE_SPEC__ERTMS_TYPE:
				return getErtmsType();
			case MessagesPackage.TYPE_SPEC__VALUE:
				return getValue();
			case MessagesPackage.TYPE_SPEC__REFERENCE_PARAGRAPH:
				if (resolve) return getReferenceParagraph();
				return basicGetReferenceParagraph();
			case MessagesPackage.TYPE_SPEC__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MessagesPackage.TYPE_SPEC__BASELINE:
				setBaseline((BaseLine)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__ID:
				setId((String)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__LENGTH:
				setLength((Integer)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__MINIMUM_VALUE:
				setMinimumValue((String)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__MAXIMUM_VALUE:
				setMaximumValue((String)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__RESOLUTION_FORMULA:
				setResolutionFormula((String)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__ERTMS_TYPE:
				setErtmsType((EErtmsType)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__VALUE:
				setValue((Value)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__REFERENCE_PARAGRAPH:
				setReferenceParagraph((Paragraph)newValue);
				return;
			case MessagesPackage.TYPE_SPEC__VERSION:
				setVersion((BaseLine)newValue);
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
			case MessagesPackage.TYPE_SPEC__BASELINE:
				setBaseline((BaseLine)null);
				return;
			case MessagesPackage.TYPE_SPEC__ID:
				setId(ID_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__MINIMUM_VALUE:
				setMinimumValue(MINIMUM_VALUE_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__RESOLUTION_FORMULA:
				setResolutionFormula(RESOLUTION_FORMULA_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__ERTMS_TYPE:
				setErtmsType(ERTMS_TYPE_EDEFAULT);
				return;
			case MessagesPackage.TYPE_SPEC__VALUE:
				setValue((Value)null);
				return;
			case MessagesPackage.TYPE_SPEC__REFERENCE_PARAGRAPH:
				setReferenceParagraph((Paragraph)null);
				return;
			case MessagesPackage.TYPE_SPEC__VERSION:
				setVersion((BaseLine)null);
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
			case MessagesPackage.TYPE_SPEC__BASELINE:
				return baseline != null;
			case MessagesPackage.TYPE_SPEC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case MessagesPackage.TYPE_SPEC__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
			case MessagesPackage.TYPE_SPEC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MessagesPackage.TYPE_SPEC__LENGTH:
				return length != LENGTH_EDEFAULT;
			case MessagesPackage.TYPE_SPEC__MINIMUM_VALUE:
				return MINIMUM_VALUE_EDEFAULT == null ? minimumValue != null : !MINIMUM_VALUE_EDEFAULT.equals(minimumValue);
			case MessagesPackage.TYPE_SPEC__MAXIMUM_VALUE:
				return MAXIMUM_VALUE_EDEFAULT == null ? maximumValue != null : !MAXIMUM_VALUE_EDEFAULT.equals(maximumValue);
			case MessagesPackage.TYPE_SPEC__RESOLUTION_FORMULA:
				return RESOLUTION_FORMULA_EDEFAULT == null ? resolutionFormula != null : !RESOLUTION_FORMULA_EDEFAULT.equals(resolutionFormula);
			case MessagesPackage.TYPE_SPEC__ERTMS_TYPE:
				return ertmsType != ERTMS_TYPE_EDEFAULT;
			case MessagesPackage.TYPE_SPEC__VALUE:
				return value != null;
			case MessagesPackage.TYPE_SPEC__REFERENCE_PARAGRAPH:
				return referenceParagraph != null;
			case MessagesPackage.TYPE_SPEC__VERSION:
				return version != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", shortDescription: ");
		result.append(shortDescription);
		result.append(", description: ");
		result.append(description);
		result.append(", length: ");
		result.append(length);
		result.append(", minimumValue: ");
		result.append(minimumValue);
		result.append(", maximumValue: ");
		result.append(maximumValue);
		result.append(", resolutionFormula: ");
		result.append(resolutionFormula);
		result.append(", ertmsType: ");
		result.append(ertmsType);
		result.append(')');
		return result.toString();
	}

} //TypeSpecImpl

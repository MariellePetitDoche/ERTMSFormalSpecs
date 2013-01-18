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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.openetcs.model.ertmsformalspecs.ReferencesParagraph;
import org.openetcs.model.ertmsformalspecs.ReqRef;
import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;
import org.openetcs.model.ertmsformalspecs.requirements.EParagraphType;
import org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock;
import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;
import org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;
import org.openetcs.model.ertmsformalspecs.requirements.Scope;
import org.openetcs.model.ertmsformalspecs.requirements.Specification;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Message;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getProcessInfo <em>Process Info</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getFunctionalBlock <em>Functional Block</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getParentSpecification <em>Parent Specification</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getSubParagraphs <em>Sub Paragraphs</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getParentParagraph <em>Parent Paragraph</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getTypeSpecs <em>Type Specs</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParagraphImpl extends EObjectImpl implements Paragraph {
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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<ReqRef> requirements;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EParagraphType TYPE_EDEFAULT = EParagraphType.TITLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EParagraphType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * The cached value of the '{@link #getProcessInfo() <em>Process Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessInfo()
	 * @generated
	 * @ordered
	 */
	protected ProcessInformation processInfo;

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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctionalBlock() <em>Functional Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalBlock()
	 * @generated
	 * @ordered
	 */
	protected FunctionalBlock functionalBlock;

	/**
	 * The cached value of the '{@link #getSubParagraphs() <em>Sub Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragraph> subParagraphs;

	/**
	 * The cached value of the '{@link #getTypeSpecs() <em>Type Specs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSpecs()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeSpec> typeSpecs;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

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
	protected ParagraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.PARAGRAPH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqRef> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<ReqRef>(ReqRef.class, this, RequirementsPackage.PARAGRAPH__REQUIREMENTS);
		}
		return requirements;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.PARAGRAPH__BASELINE, oldBaseline, baseline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__BASELINE, oldBaseline, baseline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParagraphType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EParagraphType newType) {
		EParagraphType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PARAGRAPH__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PARAGRAPH__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInformation getProcessInfo() {
		return processInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessInfo(ProcessInformation newProcessInfo, NotificationChain msgs) {
		ProcessInformation oldProcessInfo = processInfo;
		processInfo = newProcessInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__PROCESS_INFO, oldProcessInfo, newProcessInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessInfo(ProcessInformation newProcessInfo) {
		if (newProcessInfo != processInfo) {
			NotificationChain msgs = null;
			if (processInfo != null)
				msgs = ((InternalEObject)processInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PARAGRAPH__PROCESS_INFO, null, msgs);
			if (newProcessInfo != null)
				msgs = ((InternalEObject)newProcessInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PARAGRAPH__PROCESS_INFO, null, msgs);
			msgs = basicSetProcessInfo(newProcessInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__PROCESS_INFO, newProcessInfo, newProcessInfo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalBlock getFunctionalBlock() {
		if (functionalBlock != null && functionalBlock.eIsProxy()) {
			InternalEObject oldFunctionalBlock = (InternalEObject)functionalBlock;
			functionalBlock = (FunctionalBlock)eResolveProxy(oldFunctionalBlock);
			if (functionalBlock != oldFunctionalBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.PARAGRAPH__FUNCTIONAL_BLOCK, oldFunctionalBlock, functionalBlock));
			}
		}
		return functionalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalBlock basicGetFunctionalBlock() {
		return functionalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalBlock(FunctionalBlock newFunctionalBlock) {
		FunctionalBlock oldFunctionalBlock = functionalBlock;
		functionalBlock = newFunctionalBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__FUNCTIONAL_BLOCK, oldFunctionalBlock, functionalBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getParentSpecification() {
		if (eContainerFeatureID() != RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION) return null;
		return (Specification)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSpecification(Specification newParentSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSpecification, RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSpecification(Specification newParentSpecification) {
		if (newParentSpecification != eInternalContainer() || (eContainerFeatureID() != RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION && newParentSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newParentSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSpecification != null)
				msgs = ((InternalEObject)newParentSpecification).eInverseAdd(this, RequirementsPackage.SPECIFICATION__PARAGRAPHS, Specification.class, msgs);
			msgs = basicSetParentSpecification(newParentSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION, newParentSpecification, newParentSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragraph> getSubParagraphs() {
		if (subParagraphs == null) {
			subParagraphs = new EObjectContainmentWithInverseEList<Paragraph>(Paragraph.class, this, RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS, RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH);
		}
		return subParagraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getParentParagraph() {
		if (eContainerFeatureID() != RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH) return null;
		return (Paragraph)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentParagraph(Paragraph newParentParagraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentParagraph, RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentParagraph(Paragraph newParentParagraph) {
		if (newParentParagraph != eInternalContainer() || (eContainerFeatureID() != RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH && newParentParagraph != null)) {
			if (EcoreUtil.isAncestor(this, newParentParagraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentParagraph != null)
				msgs = ((InternalEObject)newParentParagraph).eInverseAdd(this, RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS, Paragraph.class, msgs);
			msgs = basicSetParentParagraph(newParentParagraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH, newParentParagraph, newParentParagraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeSpec> getTypeSpecs() {
		if (typeSpecs == null) {
			typeSpecs = new EObjectContainmentEList<TypeSpec>(TypeSpec.class, this, RequirementsPackage.PARAGRAPH__TYPE_SPECS);
		}
		return typeSpecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PARAGRAPH__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RequirementsPackage.PARAGRAPH__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__MESSAGE, newMessage, newMessage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequirementsPackage.PARAGRAPH__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PARAGRAPH__VERSION, oldVersion, version));
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
			case RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSpecification((Specification)otherEnd, msgs);
			case RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubParagraphs()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentParagraph((Paragraph)otherEnd, msgs);
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
			case RequirementsPackage.PARAGRAPH__SCOPE:
				return basicSetScope(null, msgs);
			case RequirementsPackage.PARAGRAPH__PROCESS_INFO:
				return basicSetProcessInfo(null, msgs);
			case RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION:
				return basicSetParentSpecification(null, msgs);
			case RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS:
				return ((InternalEList<?>)getSubParagraphs()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH:
				return basicSetParentParagraph(null, msgs);
			case RequirementsPackage.PARAGRAPH__TYPE_SPECS:
				return ((InternalEList<?>)getTypeSpecs()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.PARAGRAPH__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, RequirementsPackage.SPECIFICATION__PARAGRAPHS, Specification.class, msgs);
			case RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH:
				return eInternalContainer().eInverseRemove(this, RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS, Paragraph.class, msgs);
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
			case RequirementsPackage.PARAGRAPH__BASELINE:
				if (resolve) return getBaseline();
				return basicGetBaseline();
			case RequirementsPackage.PARAGRAPH__COMMENT:
				return getComment();
			case RequirementsPackage.PARAGRAPH__NAME:
				return getName();
			case RequirementsPackage.PARAGRAPH__REQUIREMENTS:
				return getRequirements();
			case RequirementsPackage.PARAGRAPH__TYPE:
				return getType();
			case RequirementsPackage.PARAGRAPH__SCOPE:
				return getScope();
			case RequirementsPackage.PARAGRAPH__PROCESS_INFO:
				return getProcessInfo();
			case RequirementsPackage.PARAGRAPH__ID:
				return getId();
			case RequirementsPackage.PARAGRAPH__TEXT:
				return getText();
			case RequirementsPackage.PARAGRAPH__FUNCTIONAL_BLOCK:
				if (resolve) return getFunctionalBlock();
				return basicGetFunctionalBlock();
			case RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION:
				return getParentSpecification();
			case RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS:
				return getSubParagraphs();
			case RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH:
				return getParentParagraph();
			case RequirementsPackage.PARAGRAPH__TYPE_SPECS:
				return getTypeSpecs();
			case RequirementsPackage.PARAGRAPH__MESSAGE:
				return getMessage();
			case RequirementsPackage.PARAGRAPH__VERSION:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.PARAGRAPH__BASELINE:
				setBaseline((BaseLine)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__COMMENT:
				setComment((String)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__NAME:
				setName((String)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ReqRef>)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__TYPE:
				setType((EParagraphType)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__SCOPE:
				setScope((Scope)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__PROCESS_INFO:
				setProcessInfo((ProcessInformation)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__ID:
				setId((String)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__TEXT:
				setText((String)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__FUNCTIONAL_BLOCK:
				setFunctionalBlock((FunctionalBlock)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION:
				setParentSpecification((Specification)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS:
				getSubParagraphs().clear();
				getSubParagraphs().addAll((Collection<? extends Paragraph>)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH:
				setParentParagraph((Paragraph)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__TYPE_SPECS:
				getTypeSpecs().clear();
				getTypeSpecs().addAll((Collection<? extends TypeSpec>)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__MESSAGE:
				setMessage((Message)newValue);
				return;
			case RequirementsPackage.PARAGRAPH__VERSION:
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
			case RequirementsPackage.PARAGRAPH__BASELINE:
				setBaseline((BaseLine)null);
				return;
			case RequirementsPackage.PARAGRAPH__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case RequirementsPackage.PARAGRAPH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RequirementsPackage.PARAGRAPH__REQUIREMENTS:
				getRequirements().clear();
				return;
			case RequirementsPackage.PARAGRAPH__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RequirementsPackage.PARAGRAPH__SCOPE:
				setScope((Scope)null);
				return;
			case RequirementsPackage.PARAGRAPH__PROCESS_INFO:
				setProcessInfo((ProcessInformation)null);
				return;
			case RequirementsPackage.PARAGRAPH__ID:
				setId(ID_EDEFAULT);
				return;
			case RequirementsPackage.PARAGRAPH__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case RequirementsPackage.PARAGRAPH__FUNCTIONAL_BLOCK:
				setFunctionalBlock((FunctionalBlock)null);
				return;
			case RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION:
				setParentSpecification((Specification)null);
				return;
			case RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS:
				getSubParagraphs().clear();
				return;
			case RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH:
				setParentParagraph((Paragraph)null);
				return;
			case RequirementsPackage.PARAGRAPH__TYPE_SPECS:
				getTypeSpecs().clear();
				return;
			case RequirementsPackage.PARAGRAPH__MESSAGE:
				setMessage((Message)null);
				return;
			case RequirementsPackage.PARAGRAPH__VERSION:
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
			case RequirementsPackage.PARAGRAPH__BASELINE:
				return baseline != null;
			case RequirementsPackage.PARAGRAPH__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case RequirementsPackage.PARAGRAPH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RequirementsPackage.PARAGRAPH__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case RequirementsPackage.PARAGRAPH__TYPE:
				return type != TYPE_EDEFAULT;
			case RequirementsPackage.PARAGRAPH__SCOPE:
				return scope != null;
			case RequirementsPackage.PARAGRAPH__PROCESS_INFO:
				return processInfo != null;
			case RequirementsPackage.PARAGRAPH__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case RequirementsPackage.PARAGRAPH__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case RequirementsPackage.PARAGRAPH__FUNCTIONAL_BLOCK:
				return functionalBlock != null;
			case RequirementsPackage.PARAGRAPH__PARENT_SPECIFICATION:
				return getParentSpecification() != null;
			case RequirementsPackage.PARAGRAPH__SUB_PARAGRAPHS:
				return subParagraphs != null && !subParagraphs.isEmpty();
			case RequirementsPackage.PARAGRAPH__PARENT_PARAGRAPH:
				return getParentParagraph() != null;
			case RequirementsPackage.PARAGRAPH__TYPE_SPECS:
				return typeSpecs != null && !typeSpecs.isEmpty();
			case RequirementsPackage.PARAGRAPH__MESSAGE:
				return message != null;
			case RequirementsPackage.PARAGRAPH__VERSION:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentedElement.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.PARAGRAPH__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.PARAGRAPH__NAME: return ModelPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.PARAGRAPH__REQUIREMENTS: return ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS;
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
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return RequirementsPackage.PARAGRAPH__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.NAMED_ELEMENT__NAME: return RequirementsPackage.PARAGRAPH__NAME;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (baseFeatureID) {
				case ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS: return RequirementsPackage.PARAGRAPH__REQUIREMENTS;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", id: ");
		result.append(id);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //ParagraphImpl

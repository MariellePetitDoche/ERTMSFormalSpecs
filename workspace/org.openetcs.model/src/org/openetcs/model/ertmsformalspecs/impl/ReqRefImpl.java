/**
 */
package org.openetcs.model.ertmsformalspecs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.ReqRef;
import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ReqRefImpl#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ReqRefImpl#getParagraphId <em>Paragraph Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqRefImpl extends CommentedElementImpl implements ReqRef {
	/**
	 * The cached value of the '{@link #getParagraph() <em>Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraph()
	 * @generated
	 * @ordered
	 */
	protected Paragraph paragraph;

	/**
	 * The default value of the '{@link #getParagraphId() <em>Paragraph Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAGRAPH_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParagraphId() <em>Paragraph Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphId()
	 * @generated
	 * @ordered
	 */
	protected String paragraphId = PARAGRAPH_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REQ_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph getParagraph() {
		if (paragraph != null && paragraph.eIsProxy()) {
			InternalEObject oldParagraph = (InternalEObject)paragraph;
			paragraph = (Paragraph)eResolveProxy(oldParagraph);
			if (paragraph != oldParagraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.REQ_REF__PARAGRAPH, oldParagraph, paragraph));
			}
		}
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph basicGetParagraph() {
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraph(Paragraph newParagraph) {
		Paragraph oldParagraph = paragraph;
		paragraph = newParagraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQ_REF__PARAGRAPH, oldParagraph, paragraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParagraphId() {
		return paragraphId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphId(String newParagraphId) {
		String oldParagraphId = paragraphId;
		paragraphId = newParagraphId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQ_REF__PARAGRAPH_ID, oldParagraphId, paragraphId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REQ_REF__PARAGRAPH:
				if (resolve) return getParagraph();
				return basicGetParagraph();
			case ModelPackage.REQ_REF__PARAGRAPH_ID:
				return getParagraphId();
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
			case ModelPackage.REQ_REF__PARAGRAPH:
				setParagraph((Paragraph)newValue);
				return;
			case ModelPackage.REQ_REF__PARAGRAPH_ID:
				setParagraphId((String)newValue);
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
			case ModelPackage.REQ_REF__PARAGRAPH:
				setParagraph((Paragraph)null);
				return;
			case ModelPackage.REQ_REF__PARAGRAPH_ID:
				setParagraphId(PARAGRAPH_ID_EDEFAULT);
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
			case ModelPackage.REQ_REF__PARAGRAPH:
				return paragraph != null;
			case ModelPackage.REQ_REF__PARAGRAPH_ID:
				return PARAGRAPH_ID_EDEFAULT == null ? paragraphId != null : !PARAGRAPH_ID_EDEFAULT.equals(paragraphId);
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
		result.append(" (paragraphId: ");
		result.append(paragraphId);
		result.append(')');
		return result.toString();
	}

} //ReqRefImpl

/**
 */
package org.openetcs.model.ertmsformalspecs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openetcs.model.ertmsformalspecs.FunctionalBlocks;
import org.openetcs.model.ertmsformalspecs.ModelPackage;

import org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Blocks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.FunctionalBlocksImpl#getAvailableFunctionalBlocks <em>Available Functional Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalBlocksImpl extends EObjectImpl implements FunctionalBlocks {
	/**
	 * The cached value of the '{@link #getAvailableFunctionalBlocks() <em>Available Functional Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFunctionalBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalBlock> availableFunctionalBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalBlocksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUNCTIONAL_BLOCKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalBlock> getAvailableFunctionalBlocks() {
		if (availableFunctionalBlocks == null) {
			availableFunctionalBlocks = new EObjectContainmentEList<FunctionalBlock>(FunctionalBlock.class, this, ModelPackage.FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS);
		}
		return availableFunctionalBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS:
				return ((InternalEList<?>)getAvailableFunctionalBlocks()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS:
				return getAvailableFunctionalBlocks();
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
			case ModelPackage.FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS:
				getAvailableFunctionalBlocks().clear();
				getAvailableFunctionalBlocks().addAll((Collection<? extends FunctionalBlock>)newValue);
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
			case ModelPackage.FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS:
				getAvailableFunctionalBlocks().clear();
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
			case ModelPackage.FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS:
				return availableFunctionalBlocks != null && !availableFunctionalBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalBlocksImpl

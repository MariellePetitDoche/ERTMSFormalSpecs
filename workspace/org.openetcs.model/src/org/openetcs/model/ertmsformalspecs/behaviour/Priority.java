/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Priority</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getPriority()
 * @model
 * @generated
 */
public enum Priority implements Enumerator {
	/**
	 * The '<em><b>Verification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICATION(0, "Verification", "Verification"),

	/**
	 * The '<em><b>Update Internal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_INTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_INTERNAL(0, "UpdateInternal", "UpdateInternal"),

	/**
	 * The '<em><b>Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSING(0, "Processing", "Processing"),

	/**
	 * The '<em><b>Update Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_OUT(0, "UpdateOut", "UpdateOut"),

	/**
	 * The '<em><b>Clean Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAN_UP_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAN_UP(0, "CleanUp", "CleanUp");

	/**
	 * The '<em><b>Verification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERIFICATION
	 * @model name="Verification"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFICATION_VALUE = 0;

	/**
	 * The '<em><b>Update Internal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update Internal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_INTERNAL
	 * @model name="UpdateInternal"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_INTERNAL_VALUE = 0;

	/**
	 * The '<em><b>Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Processing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSING
	 * @model name="Processing"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSING_VALUE = 0;

	/**
	 * The '<em><b>Update Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_OUT
	 * @model name="UpdateOut"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_OUT_VALUE = 0;

	/**
	 * The '<em><b>Clean Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clean Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEAN_UP
	 * @model name="CleanUp"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAN_UP_VALUE = 0;

	/**
	 * An array of all the '<em><b>Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Priority[] VALUES_ARRAY =
		new Priority[] {
			VERIFICATION,
			UPDATE_INTERNAL,
			PROCESSING,
			UPDATE_OUT,
			CLEAN_UP,
		};

	/**
	 * A public read-only list of all the '<em><b>Priority</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Priority> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Priority</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Priority get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Priority result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Priority getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Priority result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Priority get(int value) {
		switch (value) {
			case VERIFICATION_VALUE: return VERIFICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Priority(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Priority

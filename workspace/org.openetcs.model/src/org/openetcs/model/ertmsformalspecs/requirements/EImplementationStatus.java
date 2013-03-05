/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EImplementation Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getEImplementationStatus()
 * @model
 * @generated
 */
public enum EImplementationStatus implements Enumerator {
	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA_VALUE
	 * @generated
	 * @ordered
	 */
	NA(0, "NA", "NA"),

	/**
	 * The '<em><b>Not Implementable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_IMPLEMENTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_IMPLEMENTABLE(0, "NotImplementable", "NotImplementable"),

	/**
	 * The '<em><b>Implemented</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTED(0, "Implemented", "Implemented"),

	/**
	 * The '<em><b>New Revision Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_REVISION_AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_REVISION_AVAILABLE(0, "NewRevisionAvailable", "NewRevisionAvailable");

	/**
	 * The '<em><b>NA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NA_VALUE = 0;

	/**
	 * The '<em><b>Not Implementable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Implementable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_IMPLEMENTABLE
	 * @model name="NotImplementable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_IMPLEMENTABLE_VALUE = 0;

	/**
	 * The '<em><b>Implemented</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implemented</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTED
	 * @model name="Implemented"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTED_VALUE = 0;

	/**
	 * The '<em><b>New Revision Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New Revision Available</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW_REVISION_AVAILABLE
	 * @model name="NewRevisionAvailable"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_REVISION_AVAILABLE_VALUE = 0;

	/**
	 * An array of all the '<em><b>EImplementation Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EImplementationStatus[] VALUES_ARRAY =
		new EImplementationStatus[] {
			NA,
			NOT_IMPLEMENTABLE,
			IMPLEMENTED,
			NEW_REVISION_AVAILABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>EImplementation Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EImplementationStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EImplementation Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EImplementationStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EImplementationStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EImplementation Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EImplementationStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EImplementationStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EImplementation Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EImplementationStatus get(int value) {
		switch (value) {
			case NA_VALUE: return NA;
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
	private EImplementationStatus(int value, String name, String literal) {
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
	
} //EImplementationStatus

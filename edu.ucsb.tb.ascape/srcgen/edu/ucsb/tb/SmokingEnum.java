package edu.ucsb.tb;

/**
 * <!-- begin-user-doc -->
 * Smoking Java Implementation.
 * 
 * Generated by AMF for model: TBmodel.metaabm in project: edu.ucsb.tb.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public enum SmokingEnum {
	nonSmoker("Non Smoker"), smoker("Smoker");

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SmokingEnum(String name) {
		this.name = name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return name;
	}
}
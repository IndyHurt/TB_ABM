package edu.ucsb.tb;

/**
 * <!-- begin-user-doc -->
 * TB Status Java Implementation.
 * Where the individual is in the disease cycle.  
 * Generated by AMF for model: TBmodel.metaabm in project: edu.ucsb.tb.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public enum TBStatusEnum {
	suseptible("Suseptible"), latent("Latent"), active("Active"), dead("Dead");

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
	private TBStatusEnum(String name) {
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

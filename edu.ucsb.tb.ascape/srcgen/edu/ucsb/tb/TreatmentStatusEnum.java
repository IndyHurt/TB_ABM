package edu.ucsb.tb;

/**
 * <!-- begin-user-doc -->
 * Treatment Status Java Implementation.
 * 
 * Generated by AMF for model: TBmodel.metaabm in project: edu.ucsb.tb.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public enum TreatmentStatusEnum {
	notInfected("Not Infected"), noTreatment("No Treatment"), localHealer(
			"Local Healer"), clinicalTreatment("Clinical Treatment"), nonCompliantClinicalTreatment(
			"Non Compliant Clinical Treatment"), dOTSTreatment("DOTS Treatment"), nonCompliantDOTSTreatment(
			"Non Compliant DOTS Treatment");

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
	private TreatmentStatusEnum(String name) {
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

package edu.ucsb.tb;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.ascape.model.Agent;
import org.ascape.model.Cell;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;
import org.ascape.model.event.ScapeEvent;
import org.ascape.model.rule.Rule;
import org.ascape.model.rule.ExecuteThenUpdate;
import org.ascape.model.space.CollectionSpace;
import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Coordinate2DDiscrete;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Singleton;
import org.ascape.model.space.Location;
import org.ascape.util.Conditional;

/**
 * <!-- begin-user-doc -->
 * Work Location Java Implementation.
 * 
 * Generated by AMF for model: TBmodel.metaabm in project: edu.ucsb.tb.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkLocation extends CellOccupant {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int workID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * Constructs a new Work Location.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkLocation() {
	}
	//todo, make this a useful value for evaluating compatibility of different versions of generated classes

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 89989998L;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static long nextUniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private long uniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUID() {
		if (uniqueID == 0) {
			uniqueID = nextUniqueID++;
		}
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Clones the agent, ensuring that a unique id is assigned.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object clone() {
		try {
			WorkLocation clone = (WorkLocation) super.clone();
			clone.uniqueID = 0;
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBmodel getTBmodel() {
		return (TBmodel) getScape().getScape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return Color.LIGHT_GRAY;
	}
	/**
	 * <!-- begin-user-doc -->
	 * Initialize Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void intializeNonFramework() {
		setWorkID(getTBmodel().getNextWorkID());
		final Object workLocation = (Object) ((org.ascape.model.space.Discrete) getTBmodel()
				.getVillage().getSpace()).findRandomAvailable();
		if (workLocation != null) {
			if (getHostScape() != ((Agent) workLocation).getScape()) {
				die();
				getTBmodel().getWorkLocationScape().add(this);
			}
			moveTo(((HostCell) workLocation));
		}
		int incrementNextWorkID = getTBmodel().getNextWorkID() + 1;

		getTBmodel().setNextWorkID(incrementNextWorkID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * Gets the Work ID property for Work Location.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWorkID() {
		return workID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Work ID property for Work Location.
	 * 
	 * @param _workID the new Work ID value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkID(int _workID) {
		workID = _workID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "Work Location " + getUID();
		} else {
			return name;
		}
	}
}

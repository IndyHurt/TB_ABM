package edu.ucsb.tb;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.ascape.util.vis.DrawFeature;

import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

/**
 * <!-- begin-user-doc -->
 * Map Location Style 2D Java Implementation.
 * 
 * Generated by AMF for model: TBmodel.metaabm in project: edu.ucsb.tb.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class MapLocationStyle2D extends DrawFeature {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void draw(Graphics g, Object object, int width, int height) {
		Shape shape = null;
		MapLocation actions = (MapLocation) object;
		MapLocation defaultTBmodelAgentStyle = actions;
		double tBBacterialPresenseDivideActiveBacterialTransmissionRate = defaultTBmodelAgentStyle
				.getTBBacterialPresense()
				/ defaultTBmodelAgentStyle.getTBmodel()
						.getActiveBacterialTransmissionRate();

		java.awt.Color defaultTBmodelAgentColor = new java.awt.Color(
				(float) 0,
				(float) tBBacterialPresenseDivideActiveBacterialTransmissionRate,
				(float) 0)

		;

		g.setColor(defaultTBmodelAgentColor);
		shape = new Rectangle2D.Double(0, 0, width, height);
		((Graphics2D) g).fill(shape);
	}
}
package edu.ucsb.tb;

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.GraphicsAdapter;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.core.runtime.IAdapterFactory;

import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * <!-- begin-user-doc -->
 * TBmodel Java Implementation.
 * This model is investigates the dynamics of tuberculosis disease transmission within a population.
 * Generated by AMF for model: TBmodel.metaabm in project: edu.ucsb.tb 
 * <!-- end-user-doc -->
 * @generated
 */
public class TBmodelGraphicsAdapter extends GraphicsAdapter {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static IGraphicsAdapter singleton;

	IColorProvider[] tBmodelColorProviders = new IColorProvider[]{};
	IColorProvider[] individualColorProviders = new IColorProvider[]{IndividualStyle2DColorProvider
			.getDefault()};
	IColorProvider[] houseColorProviders = new IColorProvider[]{HouseStyle2DColorProvider
			.getDefault()};
	IColorProvider[] mapLocationColorProviders = new IColorProvider[]{MapLocationStyle2DColorProvider
			.getDefault()};
	IColorProvider[] workLocationColorProviders = new IColorProvider[]{WorkLocationStyle2DColorProvider
			.getDefault()};

	IFigureProvider[] tBmodelFigureProviders = new IFigureProvider[]{};
	IFigureProvider[] individualFigureProviders = new IFigureProvider[]{IndividualStyle2DFigureProvider
			.getDefault()};
	IFigureProvider[] houseFigureProviders = new IFigureProvider[]{HouseStyle2DFigureProvider
			.getDefault()};
	IFigureProvider[] mapLocationFigureProviders = new IFigureProvider[]{MapLocationStyle2DFigureProvider
			.getDefault()};
	IFigureProvider[] workLocationFigureProviders = new IFigureProvider[]{WorkLocationStyle2DFigureProvider
			.getDefault()};

	/**
	 * <!-- begin-user-doc -->
	 * @param type
	 * @return
	 * @see org.eclipse.amp.agf.IGraphicsAdapter#getColorsForClass(java.lang.Class)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IColorProvider[] getColorsForClass(Class type) {
		if (type == TBmodel.class) {
			return tBmodelColorProviders;
		}
		if (type == Individual.class) {
			return individualColorProviders;
		}
		if (type == House.class) {
			return houseColorProviders;
		}
		if (type == MapLocation.class) {
			return mapLocationColorProviders;
		}
		if (type == WorkLocation.class) {
			return workLocationColorProviders;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param type
	 * @return
	 * @see org.eclipse.amp.agf.IGraphicsAdapter#getFiguresForClass(java.lang.Class)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFigureProvider[] getFiguresForClass(Class type) {
		if (type == TBmodel.class) {
			return tBmodelFigureProviders;
		}
		if (type == Individual.class) {
			return individualFigureProviders;
		}
		if (type == House.class) {
			return houseFigureProviders;
		}
		if (type == MapLocation.class) {
			return mapLocationFigureProviders;
		}
		if (type == WorkLocation.class) {
			return workLocationFigureProviders;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @param type
	 * @return
	 * @see org.eclipse.amp.agf.IGraphicsAdapter#getLabelsForClass(java.lang.Class)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILabelProvider[] getLabelsForClass(Class type) {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IGraphicsAdapter getDefault() {
		if (singleton == null) {
			singleton = new TBmodelGraphicsAdapter();
		}
		return singleton;
	}
}

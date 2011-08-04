package edu.ucsb.tb;

import org.ascape.view.vis.ChartView;
import org.ascape.view.vis.GEFView;
import org.eclipse.amp.agf3d.IGraphics3DAdapted;
import org.eclipse.amp.agf3d.IGraphics3DAdapter;
import org.eclipse.amp.agf3d.IShape3DProvider;
import org.eclipse.amp.agf3d.Shapes3D;
import org.eclipse.amp.escape.ascape.adapt.AscapeDefaultGraphics3DAdapter;
import org.eclipse.amp.escape.ascape.agf3d.GEF3DView;

import edu.ucsb.tb.TBmodel;

public class TBCustomChartOnly extends TBmodel {
	public void createGraphicViews() {
		createChartViews();
	}

}

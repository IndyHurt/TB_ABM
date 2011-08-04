package edu.ucsb.tb;

import org.ascape.view.vis.ChartView;
import org.eclipse.amp.agf3d.IGraphics3DAdapted;
import org.eclipse.amp.agf3d.IGraphics3DAdapter;
import org.eclipse.amp.agf3d.IShape3DProvider;
import org.eclipse.amp.agf3d.Shapes3D;
import org.eclipse.amp.escape.ascape.adapt.AscapeDefaultGraphics3DAdapter;
import org.eclipse.amp.escape.ascape.agf3d.GEF3DView;

import edu.ucsb.tb.TBmodel;

public class TBCustom3D extends TBmodel implements IGraphics3DAdapted {
    public void createGraphicViews() {
        addView(new GEF3DView());
        addView(new ChartView());
    }

    private static final IShape3DProvider[] HUMAN_SHAPE_PROVIDERS = new IShape3DProvider[] { Shapes3D.HUMAN_SHAPE_PROVIDER};
    private static final IShape3DProvider[] HOUSE_SHAPE_PROVIDERS = new IShape3DProvider[] { Shapes3D.CUBE_SHAPE_PROVIDER};

    IGraphics3DAdapter adapter = new AscapeDefaultGraphics3DAdapter() {
        public IShape3DProvider[] getShapes(Object object) {
            if (object instanceof Individual) {
                return HUMAN_SHAPE_PROVIDERS;
            }
            return super.getShapes(object);
        };
    };

    /**
     * @return
     * @see org.eclipse.amp.agf3d.IGraphics3DAdapted#getGraphics3DAdapter()
     */
    public IGraphics3DAdapter getGraphics3DAdapter() {
        return adapter;
    }
}

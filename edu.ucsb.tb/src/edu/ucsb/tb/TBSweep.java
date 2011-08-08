package edu.ucsb.tb;

import java.io.File;
import java.io.IOException;

import org.ascape.model.space.SpatialTemporalException;
import org.ascape.util.sweep.SweepDimension;
import org.ascape.util.sweep.SweepGroup;
import org.ascape.view.nonvis.DataOutputView;
import org.ascape.view.nonvis.SweepControlView;

public class TBSweep extends TBmodel {
	
	public void createViews() {
		 super.createViews();
		DataOutputView output;
		try {
			output = new DataOutputView(new File(
					"/Users/milesparker/git/TB_ABM/edu.ucsb.tb/results/Data.txt"));
			addView(output);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		SweepControlView sv = new SweepControlView();
		SweepGroup sweep = sv.getSweepGroup();

		sweep.addMember(new SweepDimension(this, "AvoidTBLocations", 0, 1, 1));

		sweep.setRunsPer(10);
		try {
			setStopPeriod(2000);
		} catch (SpatialTemporalException e) {
			e.printStackTrace();
		}
		addView(sv);
	}
	
	@Override
	public void createGraphicViews() {
	}
}

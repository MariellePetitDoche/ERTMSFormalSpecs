package org.openetcs.ui.internal.statechart.provider;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class StateChartDiagramTypeProvider extends AbstractDiagramTypeProvider {

	 public StateChartDiagramTypeProvider() {
	      super();
	      setFeatureProvider(new StateChartFeatureProvider(this));
	   }

}

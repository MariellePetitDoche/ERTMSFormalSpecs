package org.openetcs.ui.internal.statechart.provider;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.pattern.DefaultFeatureProviderWithPatterns;
import org.openetcs.ui.internal.statechart.pattern.StatePattern;
import org.openetcs.ui.internal.statechart.pattern.TransitionPattern;

public class StateChartFeatureProvider extends
		DefaultFeatureProviderWithPatterns {

	public StateChartFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		addPattern(new StatePattern());
		addConnectionPattern(new TransitionPattern());
	}

}

package org.openetcs.ui.internal.statechart.editor;

import org.eclipse.emf.ecp.graphiti.GraphitiDiagramEditor;

public class StateChartEditor extends GraphitiDiagramEditor {
	
	public static final String EDITOR_ID="org.openetcs.ui.statechart.editor";
	
	public StateChartEditor() {
		super();
	}

	@Override
	public boolean isDirty() {
		return false;
	}
}

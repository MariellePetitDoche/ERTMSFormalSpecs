package org.openetcs.ui.internal.statechart.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecp.graphiti.GraphitiDiagramEditorInput;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openetcs.model.ertmsformalspecs.StateMachine;
import org.openetcs.ui.internal.statechart.editor.StateChartEditor;
import org.openetcs.ui.internal.statechart.pattern.AddOldElementsFeature;

public class OpenStatechartHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil
				.getCurrentSelection(event);

		Object selObject = selection.getFirstElement();
		if (!EObject.class.isInstance(selObject))
			return null;

		TransactionalEditingDomain editingDomain = (TransactionalEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor((EObject) selObject);

		ResourceSet resourceSet = editingDomain.getResourceSet();
		final StateMachine stateMachine = (StateMachine) selObject;
		// create temporal resource
		final Resource resource = resourceSet.createResource(URI.createURI(
				"VIRTUAL_URI", false));

		final Diagram createDiagram = Graphiti.getPeCreateService()
				.createDiagram("org.openetcs.ui.statechart.diagramType",
						stateMachine.getComment(), true);
		createDiagram.setName(stateMachine.getComment());
		// add the diagram to the resource
		editingDomain.getCommandStack().execute(
				new RecordingCommand(editingDomain) {

					@Override
					protected void doExecute() {
						resource.getContents().add(createDiagram);
					}
				});


		
		
		GraphitiDiagramEditorInput input = new GraphitiDiagramEditorInput(createDiagram,
				(EObject) selObject);
		
		try {
			// Needs IEditorInput (GraphitiDiagramEditorInput) for "openEditor"
			StateChartEditor editor=(StateChartEditor) PlatformUI
					.getWorkbench()
					.getActiveWorkbenchWindow()
					.getActivePage()
					.openEditor(input,
							StateChartEditor.EDITOR_ID, true);
			
			String providerId = GraphitiUi.getExtensionManager()
					.getDiagramTypeProviderId(createDiagram.getDiagramTypeId());
			final IDiagramTypeProvider dtp = GraphitiUi.getExtensionManager()
					.createDiagramTypeProvider(createDiagram, providerId);
			
			AddContext context=new AddContext();
			
			context.setTargetContainer(createDiagram);
			
			editor.executeFeature(new AddOldElementsFeature(dtp.getFeatureProvider()), context);
			
		} catch (PartInitException e) {
			System.out.println("Error");

		}
		

		return null;
	}

}

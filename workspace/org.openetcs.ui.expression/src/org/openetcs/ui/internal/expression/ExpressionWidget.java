package org.openetcs.ui.internal.expression;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPAttributeWidget;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.openetcs.ui.internal.expression.XtextEmbeddedEditorProvider.XtextStuff;
import org.xtext.example.mydsl.ui.internal.MyDsl1Activator;

import com.google.inject.Injector;

public class ExpressionWidget extends ECPAttributeWidget {

	private InternalProject project;

	public ExpressionWidget(DataBindingContext dbc, EditingDomain editingDomain,InternalProject project) {
		super(dbc,editingDomain);
		this.project = project;
	}

	private StyledText text;
	private XtextEmbeddedEditorProvider provider;
	private Resource resource;

	@Override
	public void bindValue(IObservableValue modelValue,
			ControlDecoration controlDecoration) {
		IObservableValue value = SWTObservables.observeText(text, SWT.FocusOut);
		getDbc().bindValue(value, modelValue, new UpdateValueStrategy() {

			@Override
			public Object convert(Object value) {
				return xtextToXmi((String) value);
			}

		}, new UpdateValueStrategy() {
			@Override
			public Object convert(Object value) {
				return xmiToXtext((String) value);
			}
		});
	}

	@Override
	public void dispose() {
	}

	@Override
	public Control getControl() {
		return text;
	}

	@Override
	public void setEditable(boolean arg0) {
		text.setEditable(arg0);
	}

	@SuppressWarnings("restriction")
	@Override
	public Control createWidget(FormToolkit toolkit, Composite composite,
			int style) {
		provider = getInjector().getInstance(XtextEmbeddedEditorProvider.class);
		XtextStuff xtextStuff = provider.getXtextEmbeddedEditor(
				composite, project);

		final ISourceViewer viewer = xtextStuff.embeddedEditor.getViewer();
		resource=xtextStuff.resource;
		text = viewer.getTextWidget();
		return text;
	}
	
	 URI virtualURI = URI.createURI("VirtualURI");
	private String xtextToXmi(String xtext) {
		if(xtext==null||xtext.isEmpty())
			return xtext;

		ResourceSet resourceSet2 = new ResourceSetImpl();
		Resource resource2 = resourceSet2
				.createResource(virtualURI);
		Map<Object,Object> loadOptions=new HashMap<Object,Object>();
		loadOptions.put(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		loadOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		Map<Object,Object> saveOptions=new HashMap<Object,Object>();
		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		try {
			resource2.getContents().addAll(resource.getContents());
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			
			resource2.save(baos, saveOptions);
			String result= baos.toString("UTF-8");
			return result;
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(),e));
		}
		return xtext;
	}

	private String xmiToXtext(String xmi) {
		if(xmi==null||xmi.isEmpty())
			return xmi;
		XtextResourceSet resSetresXtext = new XtextResourceSet();
		Resource resXtext=provider.getResourceFactory().createResource(virtualURI);
		resSetresXtext.getResources().add(resXtext);
		
		ResourceSet resourceSetXmi = new ResourceSetImpl();
		Resource resourceXmi = resourceSetXmi
				.createResource(virtualURI);

		Map<Object,Object> saveOptions=new HashMap<Object,Object>();
		saveOptions.put(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		ProjectSpace projectSpace = EMFStoreProvider.INSTANCE.getProjectSpace(project);
		resSetresXtext.addLoadOption("EMFStoreProject", projectSpace.getProject());
		
		Map<Object,Object> loadOptions=new HashMap<Object,Object>();
		loadOptions.put(XMIResource.OPTION_ENCODING, "UTF-8");
		
		
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(
					xmi.getBytes("UTF-8"));
			resourceXmi.load(bais, loadOptions);
			EcoreUtil.resolveAll(resourceXmi.getContents().get(0));
			resXtext.getContents().addAll(resourceXmi.getContents());
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			
			resXtext.save(baos, saveOptions);
			String result= baos.toString("UTF-8");
			return result;
		} catch (IOException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(),e));
		}
		return xmi;
	}

	private Injector getInjector() {
		return org.xtext.example.mydsl.ui.internal.MyDsl1Activator
				.getInstance().getInjector(
						MyDsl1Activator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL1);
	}
}

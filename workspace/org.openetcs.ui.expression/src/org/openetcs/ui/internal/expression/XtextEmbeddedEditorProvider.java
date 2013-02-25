package org.openetcs.ui.internal.expression;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecp.emfstore.core.internal.EMFStoreProvider;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * The provider for creating the Xtext {@link EmbeddedEditor}, this class must
 * be instantiated through an {@link Injector}.
 * 
 * @author Lorenzo Bettini
 *
 */
@SuppressWarnings("restriction")
public class XtextEmbeddedEditorProvider {

	public class XtextStuff{
		EmbeddedEditor embeddedEditor;
		Resource resource;
	}
	
	@Inject
	protected EmbeddedEditorFactory editorFactory;

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	@Inject
	private XtextResourceFactory resourceFactory;

	public XtextResourceFactory getResourceFactory() {
		return resourceFactory;
	}
	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	public String fileExtension;

	/**
	 * The constructor.
	 */
	public XtextEmbeddedEditorProvider() {
	}
	private Resource resource;
	public XtextStuff getXtextEmbeddedEditor(Composite parent, final InternalProject project) {
		
		IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {
			
			

			@Override
			public XtextResource createResource() {
				//TODO change to ESLocalProject
				XtextResourceSet xtextResourceSet = resourceSetProvider.get();
				ProjectSpace projectSpace = EMFStoreProvider.INSTANCE.getProjectSpace(project);
				xtextResourceSet.addLoadOption("ProjectElements", projectSpace.getProject().getAllModelElements());
				resource = resourceFactory
						.createResource(computeUnusedUri(xtextResourceSet));
				xtextResourceSet.getResources().add(resource);
				return (XtextResource) resource;
			}
		};

		EmbeddedEditor editor = editorFactory.newEditor(resourceProvider)
				.showErrorAndWarningAnnotations().withParent(parent);
		editor.createPartialEditor(true);
		
		XtextStuff stuff=new XtextStuff();
		stuff.embeddedEditor=editor;
		stuff.resource=resource;
		resource=null;
		return stuff;
	}
	public static URI computeUnusedUri(ResourceSet resourceSet) {
		String name = "__synthetic";
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			URI syntheticUri = URI.createURI(name + i); // + "."
//					+ fileExtension
			if (resourceSet.getResource(syntheticUri, false) == null)
				return syntheticUri;
		}
		throw new IllegalStateException();
	}
}
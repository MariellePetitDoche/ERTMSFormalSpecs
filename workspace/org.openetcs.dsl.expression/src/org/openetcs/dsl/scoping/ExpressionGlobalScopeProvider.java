package org.openetcs.dsl.scoping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.openetcs.model.ertmsformalspecs.Namespace;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

public class ExpressionGlobalScopeProvider extends DefaultGlobalScopeProvider {

	@SuppressWarnings("unchecked")
	@Override
	public IScope getScope(Resource resource, EReference reference,
			Predicate<IEObjectDescription> filter) {
		Set<EObject> elements = (Set<EObject>) resource.getResourceSet()
				.getLoadOptions().get("ProjectElements");

		List<IEObjectDescription> descs = new ArrayList<IEObjectDescription>();
		if (elements != null) {
			for (EObject eObject : elements) {
				if(ModelPackage.eINSTANCE.getDictionary().equals(eObject.eClass()))
					continue;
				String text = getText(eObject);
				QualifiedName parentQualifier=getQualifiedName(eObject);
//				if(parentQualifier==null)
					parentQualifier=QualifiedName.create(text);
//				else
//					parentQualifier=parentQualifier.append(text);
				IEObjectDescription desc = EObjectDescription.create(parentQualifier
						, eObject);
				descs.add(desc);
			}
			return new SimpleScope(descs, true);
		}
		return super.getScope(resource, reference, filter);

	}

	private QualifiedName getQualifiedName(EObject eObject) {
		if (ModelPackage.eINSTANCE.getDictionary().equals(eObject.eClass())) {
			return null;
		}
		QualifiedName qn = getQualifiedName(eObject.eContainer());
		String text = getText(eObject);
		if (qn == null) {
			qn = QualifiedName.create(text);
		}
		else if(ModelPackage.eINSTANCE.getNamespace().equals(eObject.eClass())){
			qn=qn.append(text);
		}
		else if(ModelPackage.eINSTANCE.getProcedure().equals(eObject.eClass())){
			qn=qn.append(text);
		}
			
		
		return qn;
	}

	private String getText(EObject eObject) {
		String text=null;
		if (eObject instanceof NamedElement)
			text= ((NamedElement) eObject).getName();
		else if (eObject instanceof CommentedElement)
			text= ((CommentedElement) eObject).getComment();
		else
			text=eObject.eClass().getName();
		if(text==null)
			text="";
		text = text.replace(' ', '_');
		return text;
	}
}

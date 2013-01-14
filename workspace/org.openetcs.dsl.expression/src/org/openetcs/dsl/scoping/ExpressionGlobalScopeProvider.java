package org.openetcs.dsl.scoping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.NamedElement;

import com.google.common.base.Predicate;

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
				String text = eObject.toString();
				if (text == null)
					continue;
				if (eObject instanceof NamedElement)
					text = ((NamedElement) eObject).getName();
				else if (eObject instanceof CommentedElement)
					text = ((CommentedElement) eObject).getComment();
				text = text.replace(' ', '_');

				IEObjectDescription desc = EObjectDescription.create(
						QualifiedName.create(text), eObject);
				descs.add(desc);
			}
			return new SimpleScope(descs, true);
		}
		return super.getScope(resource, reference, filter);

	}
}

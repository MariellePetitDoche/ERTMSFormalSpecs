package org.openetcs.es3f.importer;

import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.*;
import org.openetcs.model.ertmsformalspecs.behaviour.*;
import org.openetcs.model.ertmsformalspecs.customization.*;
import org.openetcs.model.ertmsformalspecs.requirements.*;
import org.openetcs.model.ertmsformalspecs.requirements.messages.*;
import org.openetcs.model.ertmsformalspecs.shortcut.*;
import org.openetcs.model.ertmsformalspecs.test.*;
import org.openetcs.model.ertmsformalspecs.translation.*;
import org.openetcs.model.ertmsformalspecs.types.*;
import org.openetcs.model.ertmsformalspecs.util.*;
import org.openetcs.es3f.importer.utils.*;

public class NameSpace
	extends org.openetcs.es3f.importer.generated.NameSpace
{
	private static final long serialVersionUID = 2829494552401902688L;

	public org.openetcs.model.ertmsformalspecs.Namespace convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.Namespace retVal = ModelFactory.eINSTANCE.createNamespace();;
		
		retVal.setName(getName());
		if ( allNameSpaces() != null )
		{
			for ( Object obj: allNameSpaces())
			{
				retVal.getSubNamespaces().add(((NameSpace) obj).convert2EMF( project ));	
			}
		}
		if ( allRanges() != null )
		{
			for ( Object obj: allRanges())
			{
				retVal.getTypes().add(((Range) obj).convert2EMF( project ));	
			}
		}
		if ( allEnumerations() != null )
		{
			for ( Object obj: allEnumerations())
			{
				retVal.getTypes().add(((Enum) obj).convert2EMF( project ));	
			}
		}
		if ( allStructures() != null )
		{
			for ( Object obj: allStructures())
			{
				retVal.getTypes().add(((Structure) obj).convert2EMF( project ));	
			}
		}
		if ( allCollections() != null )
		{
			for ( Object obj: allCollections())
			{
				retVal.getTypes().add(((Collection) obj).convert2EMF( project ));	
			}
		}
		if ( allFunctions() != null )
		{
			for ( Object obj: allFunctions())
			{
				retVal.getTypes().add(((Function) obj).convert2EMF( project ));	
			}
		}
		if ( allProcedures() != null )
		{
			for ( Object obj: allProcedures())
			{
				retVal.getProcedures().add(((Procedure) obj).convert2EMF( project ));	
			}
		}
		if ( allVariables() != null )
		{
			for ( Object obj: allVariables())
			{
				retVal.getVariables().add(((Variable) obj).convert2EMF( project ));	
			}
		}
		if ( allRules() != null )
		{
			for ( Object obj: allRules())
			{
				retVal.getRules().add(((Rule) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}

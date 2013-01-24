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
import org.openetcs.es3f.utils.*;

public class Structure
	extends org.openetcs.es3f.generated.Structure
{
	private static final long serialVersionUID = 2829494552401902694L;

	public org.openetcs.model.ertmsformalspecs.types.Structure convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.types.Structure retVal = TypesFactory.eINSTANCE.createStructure();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		retVal.setDefaultValue(getDefault());
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());
		if ( allRules() != null )
		{
			for ( Object obj: allRules())
			{
				retVal.getRules().add(((Rule) obj).convert2EMF( project ));	
			}
		}
		if ( allProcedures() != null )
		{
			for ( Object obj: allProcedures())
			{
				retVal.getProcedures().add(((StructureProcedure) obj).convert2EMF( project ));	
			}
		}
		if ( allElements() != null )
		{
			for ( Object obj: allElements())
			{
				retVal.getElements().add(((StructureElement) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}

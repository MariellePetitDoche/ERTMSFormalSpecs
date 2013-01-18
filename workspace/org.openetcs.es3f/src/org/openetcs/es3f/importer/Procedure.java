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

public class Procedure
	extends org.openetcs.es3f.importer.generated.Procedure
{
	private static final long serialVersionUID = 2829494552401902701L;

	public org.openetcs.model.ertmsformalspecs.Procedure convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.Procedure retVal = ModelFactory.eINSTANCE.createProcedure();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());
		if ( allParameters() != null )
		{
			for ( Object obj: allParameters())
			{
				retVal.getParameters().add(((Parameter) obj).convert2EMF( project ));	
			}
		}
		if ( allRules() != null )
		{
			for ( Object obj: allRules())
			{
				retVal.getRules().add(((Rule) obj).convert2EMF( project ));	
			}
		}
		if ( getStateMachine() != null )
		{
			retVal.setStateMachine(((StateMachine) getStateMachine()).convert2EMF( project ));	
		}

		return retVal;
	}
}

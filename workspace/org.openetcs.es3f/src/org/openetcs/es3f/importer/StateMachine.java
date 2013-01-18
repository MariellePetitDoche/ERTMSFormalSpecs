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

public class StateMachine
	extends org.openetcs.es3f.importer.generated.StateMachine
{
	private static final long serialVersionUID = 2829494552401902702L;

	public org.openetcs.model.ertmsformalspecs.StateMachine convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.StateMachine retVal = ModelFactory.eINSTANCE.createStateMachine();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		retVal.setDefaultValue(getDefault());
		retVal.setInitialState(getInitialState());
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());
		if ( allStates() != null )
		{
			for ( Object obj: allStates())
			{
				retVal.getStates().add(((State) obj).convert2EMF( project ));	
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

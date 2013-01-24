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

public class Rule
	extends org.openetcs.es3f.generated.Rule
{
	private static final long serialVersionUID = 2829494552401902705L;

	public org.openetcs.model.ertmsformalspecs.behaviour.Rule convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.behaviour.Rule retVal = BehaviourFactory.eINSTANCE.createRule();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		retVal.setPriority(Priority.getByName(getPriority_AsString()));
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());
		if ( allConditions() != null )
		{
			for ( Object obj: allConditions())
			{
				retVal.getConditions().add(((RuleCondition) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}

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

public class RuleCondition
	extends org.openetcs.es3f.generated.RuleCondition
{
	private static final long serialVersionUID = 2829494552401902706L;

	public org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition retVal = BehaviourFactory.eINSTANCE.createRuleCondition();;
		
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
		if ( allPreConditions() != null )
		{
			for ( Object obj: allPreConditions())
			{
				retVal.getPreconditions().add(((PreCondition) obj).convert2EMF( project ));	
			}
		}
		if ( allActions() != null )
		{
			for ( Object obj: allActions())
			{
				retVal.getActions().add(((Action) obj).convert2EMF( project ));	
			}
		}
		if ( allSubRules() != null )
		{
			for ( Object obj: allSubRules())
			{
				retVal.getSubRules().add(((Rule) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}

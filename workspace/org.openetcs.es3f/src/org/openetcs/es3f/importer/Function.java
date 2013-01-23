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

public class Function
	extends org.openetcs.es3f.generated.Function
{
	private static final long serialVersionUID = 2829494552401902698L;

	public org.openetcs.model.ertmsformalspecs.types.Function convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.types.Function retVal = TypesFactory.eINSTANCE.createFunction();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		retVal.setDefaultValue(getDefault());
		retVal.setTypeName(getTypeName());
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
		if ( allCases() != null )
		{
			for ( Object obj: allCases())
			{
				retVal.getCases().add(((Case) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}

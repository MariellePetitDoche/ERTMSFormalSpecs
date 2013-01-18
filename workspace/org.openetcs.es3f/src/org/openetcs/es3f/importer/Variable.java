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

public class Variable
	extends org.openetcs.es3f.importer.generated.Variable
{
	private static final long serialVersionUID = 2829494552401902704L;

	public org.openetcs.model.ertmsformalspecs.Variable convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.Variable retVal = ModelFactory.eINSTANCE.createVariable();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		retVal.setTypeName(getTypeName());
		retVal.setDefaultValue(getDefaultValue());
		retVal.setVariableMode(VariableMode.getByName(getVariableMode_AsString()));
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());
		if ( allSubVariables() != null )
		{
			for ( Object obj: allSubVariables())
			{
				retVal.getSubVariables().add(((Variable) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}

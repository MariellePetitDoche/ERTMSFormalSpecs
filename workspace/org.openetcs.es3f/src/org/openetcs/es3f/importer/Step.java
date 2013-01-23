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

public class Step
	extends org.openetcs.es3f.generated.Step
{
	private static final long serialVersionUID = 2829494552401902712L;

	public org.openetcs.model.ertmsformalspecs.test.Step convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.test.Step retVal = TestFactory.eINSTANCE.createStep();;
		
		retVal.setName(getName());
		retVal.setTcsOrder(getTCS_Order());
		retVal.setDistance(getDistance());
		retVal.setIo(StepIO.getByName(getIO_AsString()));
		retVal.setLevelIn(StepLevel.getByName(getLevelIN_AsString()));
		retVal.setLevelOut(StepLevel.getByName(getLevelOUT_AsString()));
		retVal.setModeIn(StepMode.getByName(getModeIN_AsString()));
		retVal.setModeOut(StepMode.getByName(getModeOUT_AsString()));
		retVal.setTranslationRequired(getTranslationRequired());
		retVal.setTranslated(getTranslated());
		if ( allSubSteps() != null )
		{
			for ( Object obj: allSubSteps())
			{
				retVal.getSubSteps().add(((SubStep) obj).convert2EMF( project ));	
			}
		}
		if ( allMessages() != null )
		{
			for ( Object obj: allMessages())
			{
				retVal.getMessages().add(((DBMessage) obj).convert2EMF( project ));	
			}
		}
		retVal.setDescription(getDescription());
		retVal.setComment(getComment());
		retVal.setUserComment(getUserComment());

		return retVal;
	}
}

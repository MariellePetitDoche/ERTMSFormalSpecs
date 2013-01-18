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

public class SubSequence
	extends org.openetcs.es3f.importer.generated.SubSequence
{
	private static final long serialVersionUID = 2829494552401902710L;

	public org.openetcs.model.ertmsformalspecs.test.SubSequence convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.test.SubSequence retVal = TestFactory.eINSTANCE.createSubSequence();;
		
		retVal.setName(getName());
		retVal.setDLRBG(getD_LRBG());
		retVal.setLevel(getLevel());
		retVal.setMode(getMode());
		retVal.setNidLRBG(getNID_LRBG());
		retVal.setQDirLRBG(getQ_DIRLRBG());
		retVal.setQDirTrain(getQ_DIRTRAIN());
		retVal.setQDLRBG(getQ_DLRBG());
		retVal.setRbcId(getRBC_ID());
		retVal.setRbcPhone(getRBCPhone());
		if ( allTestCases() != null )
		{
			for ( Object obj: allTestCases())
			{
				retVal.getTestCases().add(((TestCase) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}

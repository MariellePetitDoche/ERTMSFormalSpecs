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

public class resolution_formula
	extends org.openetcs.es3f.importer.generated.resolution_formula
{
	private static final long serialVersionUID = 2829494552401902738L;

	public org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula retVal = MessagesFactory.eINSTANCE.createResolutionFormula();;
		
		retVal.setUnit(ResolutionFormulaUnit.getByName(getUnits_AsString()));
		retVal.setValue(ResolutionFormulaValue.getByName(getValue_AsString()));

		return retVal;
	}
}

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

public class TypeSpec
	extends org.openetcs.es3f.importer.generated.TypeSpec
{
	private static final long serialVersionUID = 2829494552401902730L;

	public org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec retVal = MessagesFactory.eINSTANCE.createTypeSpec();;
		
		retVal.setLength(getLength());
		retVal.setMinimumValue(getMinimum_value());
		retVal.setMaximumValue(getMaximum_value());
		retVal.setResolutionFormula(getResolution_formula());
		retVal.setId(getId());
		retVal.setDescription(getDescription());

		// Handles the translation of Bl
		// Handles the translation of Values
		ManualTranslation.translateTypeSpec ( project, this, retVal );

		return retVal;
	}
}

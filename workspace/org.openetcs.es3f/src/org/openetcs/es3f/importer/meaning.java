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

public class meaning
	extends org.openetcs.es3f.generated.meaning
{
	private static final long serialVersionUID = 2829494552401902736L;

	public org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning retVal = MessagesFactory.eINSTANCE.createMeaning();;
		
		retVal.setType(EMeaningType.getByName(getType_AsString()));
		retVal.setValue(getValue());

		// Handles the translation of Bl
		ManualTranslation.importmeaning ( project, this, retVal );

		return retVal;
	}
}

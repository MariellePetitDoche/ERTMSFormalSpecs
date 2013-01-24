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

public class Dictionary
	extends org.openetcs.es3f.generated.Dictionary
{
	private static final long serialVersionUID = 2829494552401902686L;

	public org.openetcs.model.ertmsformalspecs.Dictionary convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.Dictionary retVal = ModelFactory.eINSTANCE.createDictionary();;
		
		if ( getSpecification() != null )
		{
			retVal.setSpecification(((Specification) getSpecification()).convert2EMF( project ));	
		}
		if ( allRuleDisablings() != null )
		{
			for ( Object obj: allRuleDisablings())
			{
				retVal.getRuleDisablings().add(((RuleDisabling) obj).convert2EMF( project ));	
			}
		}
		if ( allNameSpaces() != null )
		{
			for ( Object obj: allNameSpaces())
			{
				retVal.getNamespaces().add(((NameSpace) obj).convert2EMF( project ));	
			}
		}
		if ( allTests() != null )
		{
			for ( Object obj: allTests())
			{
				retVal.getTests().add(((Frame) obj).convert2EMF( project ));	
			}
		}
		if ( getTranslationDictionary() != null )
		{
			retVal.setTranslations(((TranslationDictionary) getTranslationDictionary()).convert2EMF( project ));	
		}
		if ( getShortcutDictionary() != null )
		{
			retVal.setShortcuts(((ShortcutDictionary) getShortcutDictionary()).convert2EMF( project ));	
		}

		// Handles the translation of Xsi
		// Handles the translation of XsiLocation
		ManualTranslation.importDictionary ( project, this, retVal );

		return retVal;
	}
}

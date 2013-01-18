package org.openetcs.es3f.importer.utils;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.ModelFactory;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsFactory;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory;
import org.openetcs.es3f.importer.generated.acceptor;

public class ManualTranslation {

	private static org.openetcs.model.ertmsformalspecs.NamedElement getNamedElement ( ECPProject project, String name, EClass expectedClass )
	{
		org.openetcs.model.ertmsformalspecs.NamedElement retVal = null;

		List<Object> elements=project.getElements();
		for(Object object:elements){
			EObject eObject=(EObject)object;
			TreeIterator<EObject> iterator = eObject.eAllContents();
			for ( EObject current = eObject; iterator.hasNext(); current = iterator.next())
			{
				if (expectedClass.equals(current.eClass()))
				{
					org.openetcs.model.ertmsformalspecs.NamedElement namedElement = (org.openetcs.model.ertmsformalspecs.NamedElement) current;
					if ( namedElement.getName().equals(name) )
					{
						retVal = namedElement;
						break;
					}
				}
			}
			
			if (retVal != null)
			{
				break;
			}
		}
		
		return retVal;
	}
		
	private static org.openetcs.model.ertmsformalspecs.BaseLine getBaseline ( ECPProject project, String name )
	{
		org.openetcs.model.ertmsformalspecs.BaseLine retVal = null;
		
		List<Object> elements=project.getElements();
		for(Object object:elements){
			EObject eObject=(EObject)object;
			if (ModelPackage.eINSTANCE.getBaselines().equals(eObject.eClass())){
				org.openetcs.model.ertmsformalspecs.Baselines baselines = (org.openetcs.model.ertmsformalspecs.Baselines) eObject;
			
				for(org.openetcs.model.ertmsformalspecs.BaseLine baseline : baselines.getAvailableBaselines())
				{
					if ( baseline.getName().equals(name))
					{
						retVal = baseline;
						break;
					}
				}
				
				if ( retVal == null )
				{
					retVal = ModelFactory.eINSTANCE.createBaseLine();
					retVal.setName(name);
					
					baselines.getAvailableBaselines().add(retVal);
				}
			}
		}
		
		return retVal;
	}

	private static org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock getFunctionalBlock ( ECPProject project, String name)
	{
		org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock retVal = null;
		
		List<Object> elements=project.getElements();
		for(Object object:elements){
			EObject eObject=(EObject)object;
			if (ModelPackage.eINSTANCE.getFunctionalBlocks().equals(eObject.eClass())){
				org.openetcs.model.ertmsformalspecs.FunctionalBlocks functionalBlocks = (org.openetcs.model.ertmsformalspecs.FunctionalBlocks) eObject;
			
				for(org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock functionalBlock: functionalBlocks.getAvailableFunctionalBlocks())
				{
					if ( functionalBlock.getName().equals(name))
					{
						retVal = functionalBlock;
						break;
					}
				}
				
				if ( retVal == null )
				{
					retVal = RequirementsFactory.eINSTANCE.createFunctionalBlock();
					retVal.setName(name);
					functionalBlocks.getAvailableFunctionalBlocks().add(retVal);
				}
			}
		}

		return retVal;
	}

	private static org.openetcs.model.ertmsformalspecs.requirements.Scope getScope (int scope, Boolean optional)
	{
		org.openetcs.model.ertmsformalspecs.requirements.Scope retVal = RequirementsFactory.eINSTANCE.createScope();;
		
		retVal.setOnBoardUnit(
				scope == acceptor.aOBU || 
				scope == acceptor.aOBU_AND_TRACK 
				);
		
		retVal.setTrackSide(
				scope == acceptor.aTRACK || 
				scope == acceptor.aOBU_AND_TRACK 
				);
		
		retVal.setOptional(optional);
		
		return retVal;
	}
	
	public static void translateMessage(
			ECPProject project, 
			org.openetcs.es3f.importer.Message message,
			org.openetcs.model.ertmsformalspecs.requirements.messages.Message retVal) 
	{
		retVal.setBaseline(getBaseline(project, message.getBl()));
		
		org.openetcs.model.ertmsformalspecs.requirements.messages.Media media = MessagesFactory.eINSTANCE.createMedia();
		media.setBalise(
				message.getMedia() == acceptor.aAny || 
				message.getMedia() == acceptor.aAny_ || 
				message.getMedia() == acceptor.aBalise ||
				message.getMedia() == acceptor.aBalise_RBC || 
				message.getMedia() == acceptor.aBalise_RBC_RIU || 
				message.getMedia() == acceptor.aBalise_loop ||
				message.getMedia() == acceptor.aBalise_loop_RIU  
				);
		
		media.setLoop(
				message.getMedia() == acceptor.aAny || 
				message.getMedia() == acceptor.aAny_ || 
				message.getMedia() == acceptor.aLoop || 
				message.getMedia() == acceptor.aBalise_loop || 
				message.getMedia() == acceptor.aBalise_loop_RIU  
				);
		
		media.setRbc(
				message.getMedia() == acceptor.aAny || 
				message.getMedia() == acceptor.aAny_ || 
				message.getMedia() == acceptor.aRBC || 
				message.getMedia() == acceptor.aRBC_RIU || 
				message.getMedia() == acceptor.aBalise_RBC || 
				message.getMedia() == acceptor.aBalise_RBC_RIU 
				);
		
		media.setRiu(
				message.getMedia() == acceptor.aAny || 
				message.getMedia() == acceptor.aAny_ || 
				message.getMedia() == acceptor.aBalise_loop_RIU ||
				message.getMedia() == acceptor.aBalise_RBC_RIU ||
				message.getMedia() == acceptor.aRIU ||
				message.getMedia() == acceptor.aRBC_RIU
				);
		
		retVal.setMedia(media);
	}

	public static void translateDictionary(
			ECPProject project,
			org.openetcs.es3f.importer.Dictionary dictionary,
			org.openetcs.model.ertmsformalspecs.Dictionary retVal) 
	{
		// Nothing to do : handles XSI and XSI location
	}

	public static void translatemeaning(
			ECPProject project, 
			org.openetcs.es3f.importer.meaning meaning,
			org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning retVal) 
	{
		retVal.setBaseline(getBaseline(project, meaning.getBl()));
	}

	public static void translateMsgVariable(
			ECPProject project,
			org.openetcs.es3f.importer.MsgVariable msgVariable, 
			org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable retVal) 
	{
		retVal.setBaseline(getBaseline(project, msgVariable.getBl()));		
	}

	public static void translateSpecification(
			ECPProject project,
			org.openetcs.es3f.importer.Specification specification,
			org.openetcs.model.ertmsformalspecs.requirements.Specification retVal) 
	{
		retVal.setBaseline(getBaseline(project, specification.getVersion()));		
	}

	public static void translateTypeSpec(
			ECPProject project,
			org.openetcs.es3f.importer.TypeSpec typeSpec,
			org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec retVal) 
	{
		retVal.setBaseline(getBaseline(project, typeSpec.getBl()));	
		if ( typeSpec.getValues() != null )
		{
			
		}
	}

	public static void translateShortcut(
			ECPProject project, 
			org.openetcs.es3f.importer.Shortcut shortcut,
			org.openetcs.model.ertmsformalspecs.shortcut.Shortcut retVal) 
	{
		retVal.setRef(getNamedElement(project, shortcut.getShortcutName(), ModelPackage.eINSTANCE.getNamedElement()));
	}

	public static void translateReqRef(
			ECPProject project, 
			org.openetcs.es3f.importer.ReqRef reqRef,
			org.openetcs.model.ertmsformalspecs.ReqRef retVal) 
	{
		retVal.setParagraph((org.openetcs.model.ertmsformalspecs.requirements.Paragraph)getNamedElement(project, reqRef.getId(), RequirementsPackage.eINSTANCE.getParagraph()));
	}

	public static void translateRuleDisabling(
			ECPProject project,
			org.openetcs.es3f.importer.RuleDisabling ruleDisabling,
			org.openetcs.model.ertmsformalspecs.customization.RuleDisabling retVal) 
	{
		retVal.setRule((org.openetcs.model.ertmsformalspecs.behaviour.Rule)getNamedElement(project, ruleDisabling.getRule(), BehaviourPackage.eINSTANCE.getRule()));
	}

	public static void translateParagraph(
			ECPProject project,
			org.openetcs.es3f.importer.Paragraph paragraph,
			org.openetcs.model.ertmsformalspecs.requirements.Paragraph retVal) 
	{
		retVal.setBaseline(getBaseline(project, paragraph.getBl()));
		retVal.setVersion(getBaseline(project, paragraph.getVersion()));
		// Revision is no more present in the EMF model (not used in the original model)
		retVal.setScope(getScope(paragraph.getScope(),  paragraph.getOptional()));
		
		// Handles the functional block
		if ( paragraph.getFunctionalBlock() )
		{
			retVal.setFunctionalBlock(getFunctionalBlock(project, paragraph.getFunctionalBlockName()));
		}
		
		// Handles the process information
		org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation processInformation = RequirementsFactory.eINSTANCE.createProcessInformation();
		processInformation.setReviewed(paragraph.getReviewed());
		processInformation.setImplementationStatus(org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus.getByName(paragraph.getImplementationStatus_AsString()));
		processInformation.setMoreInfoRequired(paragraph.getMoreInfoRequired());
		processInformation.setSpecIssue(paragraph.getSpecIssue());
		retVal.setProcessInfo(processInformation);
	}

	public static void translatematch_range(
			ECPProject project,
			org.openetcs.es3f.importer.match_range match_range, 
			org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange retVal) 
	{
		retVal.setMaximum(match_range.getMaximum_AsString());
	}
}

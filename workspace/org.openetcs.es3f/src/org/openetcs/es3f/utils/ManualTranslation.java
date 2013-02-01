package org.openetcs.es3f.utils;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelFactory;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.ReqRef;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.customization.RuleDisabling;
import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsFactory;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;
import org.openetcs.model.ertmsformalspecs.requirements.Specification;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec;
import org.openetcs.model.ertmsformalspecs.shortcut.Shortcut;
import org.openetcs.es3f.exporter.Exporter;
import org.openetcs.es3f.generated.Expectation;
import org.openetcs.es3f.generated.acceptor;
import org.openetcs.es3f.generated.special_or_reserved_value;
import org.openetcs.es3f.importer.Importer;

public class ManualTranslation {

	private class Assoc<T>
	{
		public String Id;
		public T      Element;
		public Assoc ( T t, String id)
		{
			Element = t;
			Id = id;
		}
	}
	
	private java.util.HashMap<String, Paragraph> Paragraphs = null;
	private java.util.List<Assoc<ReqRef>> ReqRef2RelatedParagraph = null; 
	private java.util.List<Assoc<TypeSpec>> TypeSpec2RelatedParagraph = null;
	

	/**
	 * Constructor
	 */
	public ManualTranslation()
	{
		Paragraphs = new HashMap<String, Paragraph>();
		ReqRef2RelatedParagraph = new java.util.ArrayList<Assoc<ReqRef>>();
		TypeSpec2RelatedParagraph = new java.util.ArrayList<Assoc<TypeSpec>>();
	}

	/**
	 * Performs the cross references for all ReqRef and TypeSpec to their related paragraphs
	 * @param project
	 */
	public void crossReference(ECPProject project) {
		for ( Assoc<ReqRef> assoc : ReqRef2RelatedParagraph)
		{
			assoc.Element.setParagraph(Paragraphs.get(assoc.Id));			
		}
		
		for ( Assoc<TypeSpec> assoc : TypeSpec2RelatedParagraph)
		{
			assoc.Element.setReferenceParagraph(Paragraphs.get(assoc.Id));			
		}
	}

	private org.openetcs.model.ertmsformalspecs.NamedElement getNamedElement ( ECPProject project, String name, EClass expectedClass )
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
					if ( namedElement.getName() != null && namedElement.getName().equals(name) )
					{
						retVal = namedElement;
						break;
					}
				}
			}
		}
		
		return retVal;
	}
		
	private org.openetcs.model.ertmsformalspecs.BaseLine getBaseline ( ECPProject project, String name )
	{
		org.openetcs.model.ertmsformalspecs.Baselines baselines = null;
		
		List<Object> elements=project.getElements();
		for(Object object:elements){
			EObject eObject=(EObject)object;
			if (ModelPackage.eINSTANCE.getBaselines().equals(eObject.eClass())){
				baselines = (org.openetcs.model.ertmsformalspecs.Baselines) eObject;
			
				for(org.openetcs.model.ertmsformalspecs.BaseLine baseline : baselines.getAvailableBaselines())
				{
					if ( baseline.getName().equals(name))
					{
						return baseline;
					}
				}		
			}
		}
						
		return null;
	}
	
	private org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock getFunctionalBlock ( ECPProject project, String name)
	{
		org.openetcs.model.ertmsformalspecs.FunctionalBlocks functionalBlocks = null;
		
		List<Object> elements=project.getElements();
		for(Object object:elements){
			EObject eObject=(EObject)object;
			if (ModelPackage.eINSTANCE.getFunctionalBlocks().equals(eObject.eClass())){
				functionalBlocks = (org.openetcs.model.ertmsformalspecs.FunctionalBlocks) eObject;
			
				for(org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock functionalBlock: functionalBlocks.getAvailableFunctionalBlocks())
				{
					if ( functionalBlock.getName().equals(name))
					{
						return functionalBlock;
					}
				}
			}
		}
		
		return null;
	}

	private org.openetcs.model.ertmsformalspecs.requirements.Scope getScope (int scope, Boolean optional)
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
	
	private String getName(org.openetcs.model.ertmsformalspecs.NamedElement item) 
	{
		String retVal = "";
		
		if ( item != null )
		{
			retVal = item.getName();
		}
		
		return retVal;
	}
	
	public void importMessage(
			ECPProject project, 
			org.openetcs.es3f.generated.Message message,
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
	
	public void exportMessage(
			org.openetcs.model.ertmsformalspecs.requirements.messages.Message message, 
			org.openetcs.es3f.generated.Message retVal)
	{
		retVal.setBl(getName(message.getBaseline()));
		if ( message.getMedia().isBalise())
		{
			if  (message.getMedia().isLoop())
			{
				if ( message.getMedia().isRbc())
				{
					if ( message.getMedia().isRiu())
					{
						// Balise message
						// loop message
						// RBC message
						// RIU message
						retVal.setMedia(acceptor.aAny);
					}
					else 
					{
						// Balise message
						// loop message
						// RBC message
						// not RIU message
						// !!! Enumeration does not accept such configuration
						retVal.setMedia(acceptor.aAny);						
					}
				}
				else if ( message.getMedia().isRiu())
				{
					// Balise message
					// loop message
					// Not RBC message
					// RIU message
					retVal.setMedia(acceptor.aBalise_loop_RIU);						
				}
				else {
					// Balise message
					// loop message
					// Not RBC message
					// Not RIU message
					retVal.setMedia(acceptor.aBalise_loop);						
				}
			}
			else if ( message.getMedia().isRbc())
			{
				// Balise message
				// Not loop message
				// RBC message
				if ( message.getMedia().isRiu())
				{
					retVal.setMedia(acceptor.aBalise_RBC_RIU);											
				}
				else 
				{
					retVal.setMedia(acceptor.aBalise_RBC);																
				}
			}
			else if ( message.getMedia().isRiu())
			{
				// Balise message
				// Not loop message
				// Not RBC message
				// Not RIU message
				retVal.setMedia(acceptor.aBalise);
			}
		}
		else if  (message.getMedia().isLoop())
		{
			if ( message.getMedia().isRbc())
			{
				if ( message.getMedia().isRiu())
				{
					// Not balise message
					// Loop message
					// RBC message
					// RIU message
					// !!! Enumeration does not accept such configuration
					retVal.setMedia(acceptor.aAny);					
				}
				else {
					// Not balise message
					// Loop message
					// RBC message
					// Not RIU message
					// !!! Enumeration does not accept such configuration
					retVal.setMedia(acceptor.aAny);					
				}
			}
			else if ( message.getMedia().isRiu()){
				// Not balise message
				// Loop message
				// Not RBC message
				// RIU message
				// !!! Enumeration does not accept such configuration
				retVal.setMedia(acceptor.aAny);					
			}
			else {
				// Not balise message
				// Loop message
				// Not RBC message
				// Not a RIU message
				// !!! Enumeration does not accept such configuration
				retVal.setMedia(acceptor.aLoop);					
			}
		}
		else if ( message.getMedia().isRbc())
		{
			// Not balise message
			// Not loop message
			// RBC message
			if ( message.getMedia().isRiu())
			{
				// Not balise message
				// Not loop message
				// RBC message
				// RIU message
				retVal.setMedia(acceptor.aRBC_RIU);									
			}
			else {
				// Not balise message
				// Not loop message
				// RBC message
				// NOt RIU message
				retVal.setMedia(acceptor.aRBC);					
			}
		}
		else if ( message.getMedia().isRiu())
		{
			// Not balise message
			// Not loop message
			// Not RBC message
			// RIU message
			retVal.setMedia(acceptor.aRIU);					
		}
		else {
			// Not balise message
			// Not loop message
			// Not RBC message
			// Not RIU message
			retVal.setMedia(acceptor.aAny_);					
		}
	}
	
	public void importDictionary(
			ECPProject project,
			org.openetcs.es3f.generated.Dictionary dictionary,
			org.openetcs.model.ertmsformalspecs.Dictionary retVal) 
	{
		// Nothing to do : handles XSI and XSI location
	}
	
	public void exportDictionary(
			org.openetcs.model.ertmsformalspecs.Dictionary source,
			org.openetcs.es3f.generated.Dictionary retVal) 
	{
		retVal.setXsi("http://www.w3.org/2001/XMLSchema-instance");
		retVal.setXsiLocation("DataDictionary.xsd");
	}

	public void importmeaning(
			ECPProject project, 
			org.openetcs.es3f.generated.meaning meaning,
			org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning retVal) 
	{
		retVal.setBaseline(getBaseline(project, meaning.getBl()));
	}

	public void exportmeaning(
			org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning meaning, 
			org.openetcs.es3f.generated.meaning retVal)
	{
		retVal.setBl(getName(meaning.getBaseline()));
	}

	public void importMsgVariable(
			ECPProject project,
			org.openetcs.es3f.generated.MsgVariable msgVariable, 
			org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable retVal) 
	{
		retVal.setBaseline(getBaseline(project, msgVariable.getBl()));		
	}

	public void exportMsgVariable(
			org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable messageVariable,
			org.openetcs.es3f.generated.MsgVariable retVal) 
	{
		if ( messageVariable.getBaseline() != null )
		{
			retVal.setBl(getName(messageVariable.getBaseline()));		
		}
		else 
		{
			retVal.setBl(null);
		}
	}

	public void importSpecification(
			ECPProject project,
			org.openetcs.es3f.generated.Specification specification,
			org.openetcs.model.ertmsformalspecs.requirements.Specification retVal) 
	{
		retVal.setBaseline(getBaseline(project, specification.getVersion()));		
	}
	
	public void exportSpecification(
			org.openetcs.model.ertmsformalspecs.requirements.Specification source,
			org.openetcs.es3f.generated.Specification retVal) 
	{
		retVal.setVersion(getName(source.getBaseline()));
	}

	public void importTypeSpec(
			ECPProject project,
			org.openetcs.es3f.generated.TypeSpec typeSpec,
			org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec retVal) 
	{
		retVal.setShortDescription(typeSpec.getShort_description());
		retVal.setBaseline(getBaseline(project, typeSpec.getBl()));	
		retVal.setErtmsType(Importer.importEErtmsType(typeSpec.getErtms_type()));
		
		// Crosslink with the paragraph
		TypeSpec2RelatedParagraph.add(new Assoc<TypeSpec>(retVal,  typeSpec.getReference()));
		
		// TODO : Handle type spec values
		if ( typeSpec.getValues() != null )
		{
			// retVal.setValue(Importer.importvalue(project, typeSpec.getValues()));
		}
	}

	public void exportTypeSpec(
			org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec typeSpec, 
			org.openetcs.es3f.generated.TypeSpec retVal)
	{
		retVal.setShort_description(typeSpec.getShortDescription());
		
		if ( typeSpec.getBaseline() != null )
		{
			retVal.setBl(getName(typeSpec.getBaseline()));
		}
		else {
			retVal.setBl(null);
		}
		retVal.setErtms_type(Exporter.exportEErtmsType(typeSpec.getErtmsType()));
		
		// TODO : Use the paragraph when available
		if ( typeSpec.getReferenceParagraph() != null )
		{
			retVal.setReference(typeSpec.getReferenceParagraph().getId());
		}
		
		// TODO : Also handles the values
	}

	public void importShortcut(
			ECPProject project, 
			org.openetcs.es3f.generated.Shortcut shortcut,
			org.openetcs.model.ertmsformalspecs.shortcut.Shortcut retVal) 
	{
		retVal.setRef(getNamedElement(project, shortcut.getShortcutName(), ModelPackage.eINSTANCE.getNamedElement()));
	}
	
	public void exportShortcut(
			org.openetcs.model.ertmsformalspecs.shortcut.Shortcut source,
			org.openetcs.es3f.generated.Shortcut retVal) 
	{
		retVal.setShortcutName(getName(source.getRef()));
	}
	
	public void importReqRef(
			ECPProject project, 
			org.openetcs.es3f.generated.ReqRef reqRef,
			org.openetcs.model.ertmsformalspecs.ReqRef retVal) 
	{
		// Crosslink with paragraphs
		ReqRef2RelatedParagraph.add(new Assoc<ReqRef>(retVal, reqRef.getId()));
	}

	public void exportReqRef(
			org.openetcs.model.ertmsformalspecs.ReqRef source,
			org.openetcs.es3f.generated.ReqRef retVal) 
	{
		if ( source.getParagraph() != null )
		{
			retVal.setId(source.getParagraph().getId());
		}
	}

	public void importRuleDisabling(
			ECPProject project,
			org.openetcs.es3f.generated.RuleDisabling ruleDisabling,
			org.openetcs.model.ertmsformalspecs.customization.RuleDisabling retVal) 
	{
		retVal.setRule((org.openetcs.model.ertmsformalspecs.behaviour.Rule)getNamedElement(project, ruleDisabling.getRule(), BehaviourPackage.eINSTANCE.getRule()));
	}
	
	public void exportRuleDisabling(
			org.openetcs.model.ertmsformalspecs.customization.RuleDisabling source,
			org.openetcs.es3f.generated.RuleDisabling retVal) 
	{
		retVal.setRule(getName(source.getRule()));
	}

	public void importParagraph(
			ECPProject project,
			org.openetcs.es3f.generated.Paragraph paragraph,
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
		
		Paragraphs.put(retVal.getId(), retVal);
	}
	
	public void exportParagraph(
			org.openetcs.model.ertmsformalspecs.requirements.Paragraph source,
			org.openetcs.es3f.generated.Paragraph retVal) 
	{
		// Handles the translation of Scope
		if ( source.getScope().isOnBoardUnit())
		{
			if ( source.getScope().isTrackSide())
			{
				retVal.setScope(acceptor.aOBU_AND_TRACK);
			}
			else {
				retVal.setScope(acceptor.aOBU);
			}
		}
		else {
			if ( source.getScope().isTrackSide())
			{
				retVal.setScope(acceptor.aTRACK);
			}
			else {
				retVal.setScope(0);
			}
		}
		
		// Handles the translation of Bl
		if ( source.getBaseline()!=null)
		{
			retVal.setBl(getName(source.getBaseline()));
		}
		else {
			retVal.setBl(null);			
		}
		
		// Handles the translation of Optional
		retVal.setOptional(source.getScope().isOptional());
		
		// Handles the translation of Version
		retVal.setVersion(getName(source.getVersion()));
		
		// Handles the translation of Reviewed
		retVal.setReviewed(source.getProcessInfo().isReviewed());
		
		// Handles the translation of ImplementationStatus
		retVal.setImplementationStatus(Exporter.exportEImplementationStatus(source.getProcessInfo().getImplementationStatus()));
		
		// Handles the translation of Revision
		retVal.setRevision(null);
		
		// Handles the translation of MoreInfoRequired
		retVal.setMoreInfoRequired(source.getProcessInfo().isMoreInfoRequired());
		
		// Handles the translation of SpecIssue
		retVal.setSpecIssue(source.getProcessInfo().isSpecIssue());
		
		// Handles the translation of FunctionalBlock
		// Handles the translation of FunctionalBlockName
		if ( source.getFunctionalBlock() != null )
		{
			retVal.setFunctionalBlock(true);
			retVal.setFunctionalBlockName(source.getFunctionalBlock().getName());
		}
		else {
			retVal.setFunctionalBlock(false);
			retVal.setFunctionalBlockName("");
		}		
	}

	public void importmatch_range(
			ECPProject project,
			org.openetcs.es3f.generated.match_range match_range, 
			org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange retVal) 
	{
		retVal.setMaximum(match_range.getMaximum_AsString());
	}
	
	public void exportmatch_range(
			org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange matchRange,
			org.openetcs.es3f.generated.match_range retVal) 
	{
		retVal.setMaximum_AsString(matchRange.getMaximum());
	}

	public void importspecial_or_reserved_value(
			ECPProject project,
			org.openetcs.es3f.generated.special_or_reserved_value special_or_reserved_value,
			org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue retVal) 
	{
		if ( special_or_reserved_value.getMatch() != null )
		{
			retVal.setMatch(Importer.importmatch(project, this, special_or_reserved_value.getMatch()));
		}
		
		if ( special_or_reserved_value.getMatch_range() != null)
		{
			retVal.setMatch(Importer.importmatch_range(project, this, special_or_reserved_value.getMatch_range()));
		}
	}

	public void exportspecial_or_reserved_value(
			org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue source,
			org.openetcs.es3f.generated.special_or_reserved_value retVal )
	{
		if ( MessagesPackage.eINSTANCE.getMatch().equals(source.getMatch().eClass()))
		{
			org.openetcs.model.ertmsformalspecs.requirements.messages.Match match = (org.openetcs.model.ertmsformalspecs.requirements.messages.Match) source.getMatch();
			retVal.setMatch(Exporter.exportmatch(this, match));
		}
		
		if ( MessagesPackage.eINSTANCE.getMatchRange().equals(source.getMatch().eClass()))
		{
			org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange matchRange = (org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange) source.getMatch();
			retVal.setMatch_range(Exporter.exportmatch_range(this, matchRange));
		}
	}

	public void importExpectation(ECPProject project,
			org.openetcs.es3f.generated.Expectation source,
			org.openetcs.model.ertmsformalspecs.test.Expectation retVal) 
	{
		// Northing to do : Variable is no more used.
	}

	public void exportExpectation(
			org.openetcs.model.ertmsformalspecs.test.Expectation source,
			org.openetcs.es3f.generated.Expectation retVal) 
	{
		// Northing to do : Variable is no more used.
	}
}

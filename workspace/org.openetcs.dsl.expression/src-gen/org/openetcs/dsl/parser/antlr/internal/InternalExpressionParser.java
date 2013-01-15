package org.openetcs.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.openetcs.dsl.services.ExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'OR'", "'AND'", "'=='", "'!='", "'<='", "'>='", "'not in'", "'in'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=7;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g"; }



     	private ExpressionGrammarAccess grammarAccess;
     	
        public InternalExpressionParser(TokenStream input, ExpressionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExpressionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:76:1: ruleModel returns [EObject current=null] : ( (lv_expression_0_0= ruleExpression ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:79:28: ( ( (lv_expression_0_0= ruleExpression ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:80:1: ( (lv_expression_0_0= ruleExpression ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:80:1: ( (lv_expression_0_0= ruleExpression ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:81:1: (lv_expression_0_0= ruleExpression )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:81:1: (lv_expression_0_0= ruleExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:82:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleModel130);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:106:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:107:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:108:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression165);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:115:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:118:28: (this_Or_0= ruleOr )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:120:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression221);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:136:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:137:2: (iv_ruleOr= ruleOr EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:138:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr255);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:145:1: ruleOr returns [EObject current=null] : ( () ( (lv_left_1_0= ruleAnd ) ) (otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:148:28: ( ( () ( (lv_left_1_0= ruleAnd ) ) (otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )? ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:149:1: ( () ( (lv_left_1_0= ruleAnd ) ) (otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )? )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:149:1: ( () ( (lv_left_1_0= ruleAnd ) ) (otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )? )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:149:2: () ( (lv_left_1_0= ruleAnd ) ) (otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )?
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:149:2: ()
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:150:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOrAccess().getOrAction_0(),
                        current);
                

            }

            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:155:2: ( (lv_left_1_0= ruleAnd ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:156:1: (lv_left_1_0= ruleAnd )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:156:1: (lv_left_1_0= ruleAnd )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:157:3: lv_left_1_0= ruleAnd
            {
             
            	        newCompositeNode(grammarAccess.getOrAccess().getLeftAndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnd_in_ruleOr320);
            lv_left_1_0=ruleAnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_1_0, 
                    		"And");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:173:2: (otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:173:4: otherlv_2= 'OR' ( (lv_right_3_0= ruleAnd ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOr333); 

                        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getORKeyword_2_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:177:1: ( (lv_right_3_0= ruleAnd ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:178:1: (lv_right_3_0= ruleAnd )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:178:1: (lv_right_3_0= ruleAnd )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:179:3: lv_right_3_0= ruleAnd
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnd_in_ruleOr354);
                    lv_right_3_0=ruleAnd();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"And");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:203:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:204:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:205:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd392);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd402); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:212:1: ruleAnd returns [EObject current=null] : ( () ( (lv_left_1_0= ruleEquality ) ) (otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:215:28: ( ( () ( (lv_left_1_0= ruleEquality ) ) (otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )? ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:216:1: ( () ( (lv_left_1_0= ruleEquality ) ) (otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )? )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:216:1: ( () ( (lv_left_1_0= ruleEquality ) ) (otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )? )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:216:2: () ( (lv_left_1_0= ruleEquality ) ) (otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )?
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:216:2: ()
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:217:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAndAccess().getAndAction_0(),
                        current);
                

            }

            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:222:2: ( (lv_left_1_0= ruleEquality ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:223:1: (lv_left_1_0= ruleEquality )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:223:1: (lv_left_1_0= ruleEquality )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:224:3: lv_left_1_0= ruleEquality
            {
             
            	        newCompositeNode(grammarAccess.getAndAccess().getLeftEqualityParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd457);
            lv_left_1_0=ruleEquality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_1_0, 
                    		"Equality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:240:2: (otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:240:4: otherlv_2= 'AND' ( (lv_right_3_0= ruleEquality ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAnd470); 

                        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getANDKeyword_2_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:244:1: ( (lv_right_3_0= ruleEquality ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:245:1: (lv_right_3_0= ruleEquality )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:245:1: (lv_right_3_0= ruleEquality )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:246:3: lv_right_3_0= ruleEquality
                    {
                     
                    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEquality_in_ruleAnd491);
                    lv_right_3_0=ruleEquality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAndRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Equality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:270:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:271:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:272:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality529);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:279:1: ruleEquality returns [EObject current=null] : ( () ( (lv_left_1_0= rulePrimaryExpression ) ) ( (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) ) | (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) ) | (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) ) | (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) ) | (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) ) )? ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_5_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_11_0 = null;

        EObject lv_right_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:282:28: ( ( () ( (lv_left_1_0= rulePrimaryExpression ) ) ( (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) ) | (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) ) | (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) ) | (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) ) | (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) ) )? ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:283:1: ( () ( (lv_left_1_0= rulePrimaryExpression ) ) ( (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) ) | (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) ) | (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) ) | (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) ) | (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) ) )? )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:283:1: ( () ( (lv_left_1_0= rulePrimaryExpression ) ) ( (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) ) | (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) ) | (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) ) | (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) ) | (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) ) )? )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:283:2: () ( (lv_left_1_0= rulePrimaryExpression ) ) ( (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) ) | (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) ) | (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) ) | (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) ) | (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) ) )?
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:283:2: ()
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:284:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEqualityAccess().getEqualityAction_0(),
                        current);
                

            }

            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:289:2: ( (lv_left_1_0= rulePrimaryExpression ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:290:1: (lv_left_1_0= rulePrimaryExpression )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:290:1: (lv_left_1_0= rulePrimaryExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:291:3: lv_left_1_0= rulePrimaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityAccess().getLeftPrimaryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEquality594);
            lv_left_1_0=rulePrimaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_1_0, 
                    		"PrimaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:307:2: ( (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) ) | (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) ) | (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) ) | (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) ) | (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) ) )?
            int alt3=7;
            switch ( input.LA(1) ) {
                case 14:
                    {
                    alt3=1;
                    }
                    break;
                case 15:
                    {
                    alt3=2;
                    }
                    break;
                case 16:
                    {
                    alt3=3;
                    }
                    break;
                case 17:
                    {
                    alt3=4;
                    }
                    break;
                case 18:
                    {
                    alt3=5;
                    }
                    break;
                case 19:
                    {
                    alt3=6;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:307:3: (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:307:3: (otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:307:5: otherlv_2= '==' ( (lv_right_3_0= rulePrimaryExpression ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEquality608); 

                        	newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_2_0_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:311:1: ( (lv_right_3_0= rulePrimaryExpression ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:312:1: (lv_right_3_0= rulePrimaryExpression )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:312:1: (lv_right_3_0= rulePrimaryExpression )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:313:3: lv_right_3_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightPrimaryExpressionParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEquality629);
                    lv_right_3_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:330:6: (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:330:6: (otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:330:8: otherlv_4= '!=' ( (lv_right_5_0= rulePrimaryExpression ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleEquality649); 

                        	newLeafNode(otherlv_4, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_2_1_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:334:1: ( (lv_right_5_0= rulePrimaryExpression ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:335:1: (lv_right_5_0= rulePrimaryExpression )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:335:1: (lv_right_5_0= rulePrimaryExpression )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:336:3: lv_right_5_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightPrimaryExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEquality670);
                    lv_right_5_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_5_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:353:6: (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:353:6: (otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:353:8: otherlv_6= '<=' ( (lv_right_7_0= rulePrimaryExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleEquality690); 

                        	newLeafNode(otherlv_6, grammarAccess.getEqualityAccess().getLessThanSignEqualsSignKeyword_2_2_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:357:1: ( (lv_right_7_0= rulePrimaryExpression ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:358:1: (lv_right_7_0= rulePrimaryExpression )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:358:1: (lv_right_7_0= rulePrimaryExpression )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:359:3: lv_right_7_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightPrimaryExpressionParserRuleCall_2_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEquality711);
                    lv_right_7_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_7_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:376:6: (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:376:6: (otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:376:8: otherlv_8= '>=' ( (lv_right_9_0= rulePrimaryExpression ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEquality731); 

                        	newLeafNode(otherlv_8, grammarAccess.getEqualityAccess().getGreaterThanSignEqualsSignKeyword_2_3_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:380:1: ( (lv_right_9_0= rulePrimaryExpression ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:381:1: (lv_right_9_0= rulePrimaryExpression )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:381:1: (lv_right_9_0= rulePrimaryExpression )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:382:3: lv_right_9_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightPrimaryExpressionParserRuleCall_2_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEquality752);
                    lv_right_9_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_9_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:399:6: (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:399:6: (otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:399:8: otherlv_10= 'not in' ( (lv_right_11_0= rulePrimaryExpression ) )
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleEquality772); 

                        	newLeafNode(otherlv_10, grammarAccess.getEqualityAccess().getNotInKeyword_2_4_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:403:1: ( (lv_right_11_0= rulePrimaryExpression ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:404:1: (lv_right_11_0= rulePrimaryExpression )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:404:1: (lv_right_11_0= rulePrimaryExpression )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:405:3: lv_right_11_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightPrimaryExpressionParserRuleCall_2_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEquality793);
                    lv_right_11_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_11_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:422:6: (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:422:6: (otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:422:8: otherlv_12= 'in' ( (lv_right_13_0= rulePrimaryExpression ) )
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleEquality813); 

                        	newLeafNode(otherlv_12, grammarAccess.getEqualityAccess().getInKeyword_2_5_0());
                        
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:426:1: ( (lv_right_13_0= rulePrimaryExpression ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:427:1: (lv_right_13_0= rulePrimaryExpression )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:427:1: (lv_right_13_0= rulePrimaryExpression )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:428:3: lv_right_13_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightPrimaryExpressionParserRuleCall_2_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEquality834);
                    lv_right_13_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_13_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:452:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:453:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:454:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression873);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression883); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:461:1: rulePrimaryExpression returns [EObject current=null] : this_UnaryExpression_0= ruleUnaryExpression ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:464:28: (this_UnaryExpression_0= ruleUnaryExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:466:5: this_UnaryExpression_0= ruleUnaryExpression
            {
             
                    newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression929);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;

             
                    current = this_UnaryExpression_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:482:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:483:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:484:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression963);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression973); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:491:1: ruleUnaryExpression returns [EObject current=null] : this_Term_0= ruleTerm ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:494:28: (this_Term_0= ruleTerm )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:496:5: this_Term_0= ruleTerm
            {
             
                    newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleUnaryExpression1019);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleTerm"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:512:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:513:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:514:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1053);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1063); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:521:1: ruleTerm returns [EObject current=null] : (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        EObject this_Designator_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:524:28: ( (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:525:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:525:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:526:5: this_Designator_0= ruleDesignator
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDesignator_in_ruleTerm1110);
                    this_Designator_0=ruleDesignator();

                    state._fsp--;

                     
                            current = this_Designator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:535:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:535:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:535:7: () ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:535:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:536:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getStringValueAction_1_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:541:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:542:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:542:1: (lv_value_2_0= RULE_STRING )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:543:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerm1142); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:560:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:560:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:560:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:560:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:561:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getIntegerValueAction_2_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:566:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:567:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:567:1: (lv_value_4_0= RULE_INT )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:568:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerm1181); 

                    			newLeafNode(lv_value_4_0, grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:585:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:585:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:585:7: () ( (lv_value_6_0= RULE_DOUBLE ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:585:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:586:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getDoubleValueAction_3_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:591:2: ( (lv_value_6_0= RULE_DOUBLE ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:592:1: (lv_value_6_0= RULE_DOUBLE )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:592:1: (lv_value_6_0= RULE_DOUBLE )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:593:3: lv_value_6_0= RULE_DOUBLE
                    {
                    lv_value_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTerm1220); 

                    			newLeafNode(lv_value_6_0, grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleDesignator"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:617:1: entryRuleDesignator returns [EObject current=null] : iv_ruleDesignator= ruleDesignator EOF ;
    public final EObject entryRuleDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignator = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:618:2: (iv_ruleDesignator= ruleDesignator EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:619:2: iv_ruleDesignator= ruleDesignator EOF
            {
             newCompositeNode(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator1262);
            iv_ruleDesignator=ruleDesignator();

            state._fsp--;

             current =iv_ruleDesignator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator1272); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:626:1: ruleDesignator returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDesignator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:629:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:630:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:630:1: ( (otherlv_0= RULE_ID ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:631:1: (otherlv_0= RULE_ID )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:631:1: (otherlv_0= RULE_ID )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:632:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignatorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDesignator1316); 

            		newLeafNode(otherlv_0, grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesignator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr320 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleOr333 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd457 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAnd470 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEquality594 = new BitSet(new long[]{0x00000000000FC002L});
    public static final BitSet FOLLOW_14_in_ruleEquality608 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEquality629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEquality649 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEquality670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleEquality690 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEquality711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEquality731 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEquality752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEquality772 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEquality793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEquality813 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEquality834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleUnaryExpression1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleTerm1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerm1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerm1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTerm1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDesignator1316 = new BitSet(new long[]{0x0000000000000002L});

}
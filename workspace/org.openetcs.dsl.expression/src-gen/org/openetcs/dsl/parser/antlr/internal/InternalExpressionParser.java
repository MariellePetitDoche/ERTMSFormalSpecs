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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<-'", "'CurrentState'", "'('", "')'", "'OR'", "'AND'", "'=='", "'!='", "'<='", "'>='", "'in'", "'not in'", "'+'", "'-'", "'*'", "'/'", "'^'", "'NOT ('"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:76:1: ruleModel returns [EObject current=null] : ( (lv_phrase_0_0= rulePhrase ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_phrase_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:79:28: ( ( (lv_phrase_0_0= rulePhrase ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:80:1: ( (lv_phrase_0_0= rulePhrase ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:80:1: ( (lv_phrase_0_0= rulePhrase ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:81:1: (lv_phrase_0_0= rulePhrase )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:81:1: (lv_phrase_0_0= rulePhrase )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:82:3: lv_phrase_0_0= rulePhrase
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePhrase_in_ruleModel130);
            lv_phrase_0_0=rulePhrase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"phrase",
                    		lv_phrase_0_0, 
                    		"Phrase");
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


    // $ANTLR start "entryRulePhrase"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:106:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:107:2: (iv_rulePhrase= rulePhrase EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:108:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase165);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase175); 

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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:115:1: rulePhrase returns [EObject current=null] : (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_Statement_1 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:118:28: ( (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:119:1: (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:119:1: (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==12||LA1_1==14) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=16 && LA1_1<=28)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case 14:
            case 29:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:120:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePhrase222);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:130:5: this_Statement_1= ruleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getPhraseAccess().getStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_rulePhrase249);
                    this_Statement_1=ruleStatement();

                    state._fsp--;

                     
                            current = this_Statement_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:146:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:147:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:148:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression284);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression294); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:155:1: ruleExpression returns [EObject current=null] : this_EvaluationExpression_0= ruleEvaluationExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvaluationExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:158:28: (this_EvaluationExpression_0= ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:160:5: this_EvaluationExpression_0= ruleEvaluationExpression
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getEvaluationExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleEvaluationExpression_in_ruleExpression340);
            this_EvaluationExpression_0=ruleEvaluationExpression();

            state._fsp--;

             
                    current = this_EvaluationExpression_0; 
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


    // $ANTLR start "entryRuleEvaluationExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:176:1: entryRuleEvaluationExpression returns [EObject current=null] : iv_ruleEvaluationExpression= ruleEvaluationExpression EOF ;
    public final EObject entryRuleEvaluationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:177:2: (iv_ruleEvaluationExpression= ruleEvaluationExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:178:2: iv_ruleEvaluationExpression= ruleEvaluationExpression EOF
            {
             newCompositeNode(grammarAccess.getEvaluationExpressionRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression374);
            iv_ruleEvaluationExpression=ruleEvaluationExpression();

            state._fsp--;

             current =iv_ruleEvaluationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpression384); 

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
    // $ANTLR end "entryRuleEvaluationExpression"


    // $ANTLR start "ruleEvaluationExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:185:1: ruleEvaluationExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleEvaluationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:188:28: (this_OrExpression_0= ruleOrExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:190:5: this_OrExpression_0= ruleOrExpression
            {
             
                    newCompositeNode(grammarAccess.getEvaluationExpressionAccess().getOrExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleEvaluationExpression430);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;

             
                    current = this_OrExpression_0; 
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
    // $ANTLR end "ruleEvaluationExpression"


    // $ANTLR start "entryRuleStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:206:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:207:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:208:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement464);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement474); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:215:1: ruleStatement returns [EObject current=null] : (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SingleStatement_0 = null;

        EObject this_SelfStatement_1 = null;

        EObject this_MultiStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:218:28: ( (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:219:1: (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:219:1: (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==14) ) {
                    alt2=3;
                }
                else if ( (LA2_1==12) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:220:5: this_SingleStatement_0= ruleSingleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSingleStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleStatement_in_ruleStatement521);
                    this_SingleStatement_0=ruleSingleStatement();

                    state._fsp--;

                     
                            current = this_SingleStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:230:5: this_SelfStatement_1= ruleSelfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSelfStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelfStatement_in_ruleStatement548);
                    this_SelfStatement_1=ruleSelfStatement();

                    state._fsp--;

                     
                            current = this_SelfStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:240:5: this_MultiStatement_2= ruleMultiStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMultiStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMultiStatement_in_ruleStatement575);
                    this_MultiStatement_2=ruleMultiStatement();

                    state._fsp--;

                     
                            current = this_MultiStatement_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSingleStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:256:1: entryRuleSingleStatement returns [EObject current=null] : iv_ruleSingleStatement= ruleSingleStatement EOF ;
    public final EObject entryRuleSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:257:2: (iv_ruleSingleStatement= ruleSingleStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:258:2: iv_ruleSingleStatement= ruleSingleStatement EOF
            {
             newCompositeNode(grammarAccess.getSingleStatementRule()); 
            pushFollow(FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement610);
            iv_ruleSingleStatement=ruleSingleStatement();

            state._fsp--;

             current =iv_ruleSingleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStatement620); 

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
    // $ANTLR end "entryRuleSingleStatement"


    // $ANTLR start "ruleSingleStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:265:1: ruleSingleStatement returns [EObject current=null] : ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSingleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_desgnator_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:268:28: ( ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:269:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:269:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:269:2: ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:269:2: ( (lv_desgnator_0_0= ruleDesignator ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:270:1: (lv_desgnator_0_0= ruleDesignator )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:270:1: (lv_desgnator_0_0= ruleDesignator )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:271:3: lv_desgnator_0_0= ruleDesignator
            {
             
            	        newCompositeNode(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignator_in_ruleSingleStatement666);
            lv_desgnator_0_0=ruleDesignator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleStatementRule());
            	        }
                   		set(
                   			current, 
                   			"desgnator",
                    		lv_desgnator_0_0, 
                    		"Designator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSingleStatement678); 

                	newLeafNode(otherlv_1, grammarAccess.getSingleStatementAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:291:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:292:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:292:1: (lv_expression_2_0= ruleExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:293:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSingleStatement699);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSingleStatement"


    // $ANTLR start "entryRuleSelfStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:317:1: entryRuleSelfStatement returns [EObject current=null] : iv_ruleSelfStatement= ruleSelfStatement EOF ;
    public final EObject entryRuleSelfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:318:2: (iv_ruleSelfStatement= ruleSelfStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:319:2: iv_ruleSelfStatement= ruleSelfStatement EOF
            {
             newCompositeNode(grammarAccess.getSelfStatementRule()); 
            pushFollow(FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement735);
            iv_ruleSelfStatement=ruleSelfStatement();

            state._fsp--;

             current =iv_ruleSelfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfStatement745); 

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
    // $ANTLR end "entryRuleSelfStatement"


    // $ANTLR start "ruleSelfStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:326:1: ruleSelfStatement returns [EObject current=null] : (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSelfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:329:28: ( (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:330:1: (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:330:1: (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:330:3: otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSelfStatement782); 

                	newLeafNode(otherlv_0, grammarAccess.getSelfStatementAccess().getCurrentStateKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSelfStatement794); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfStatementAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:338:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:339:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:339:1: (lv_expression_2_0= ruleExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:340:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSelfStatement815);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelfStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSelfStatement"


    // $ANTLR start "entryRuleMultiStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:364:1: entryRuleMultiStatement returns [EObject current=null] : iv_ruleMultiStatement= ruleMultiStatement EOF ;
    public final EObject entryRuleMultiStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:365:2: (iv_ruleMultiStatement= ruleMultiStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:366:2: iv_ruleMultiStatement= ruleMultiStatement EOF
            {
             newCompositeNode(grammarAccess.getMultiStatementRule()); 
            pushFollow(FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement851);
            iv_ruleMultiStatement=ruleMultiStatement();

            state._fsp--;

             current =iv_ruleMultiStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiStatement861); 

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
    // $ANTLR end "entryRuleMultiStatement"


    // $ANTLR start "ruleMultiStatement"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:373:1: ruleMultiStatement returns [EObject current=null] : ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' ) ;
    public final EObject ruleMultiStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_desgnator_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:376:28: ( ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:377:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:377:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:377:2: ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')'
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:377:2: ( (lv_desgnator_0_0= ruleDesignator ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:378:1: (lv_desgnator_0_0= ruleDesignator )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:378:1: (lv_desgnator_0_0= ruleDesignator )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:379:3: lv_desgnator_0_0= ruleDesignator
            {
             
            	        newCompositeNode(grammarAccess.getMultiStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignator_in_ruleMultiStatement907);
            lv_desgnator_0_0=ruleDesignator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiStatementRule());
            	        }
                   		set(
                   			current, 
                   			"desgnator",
                    		lv_desgnator_0_0, 
                    		"Designator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMultiStatement919); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:399:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==14||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:400:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:400:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:401:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiStatementAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleMultiStatement940);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleMultiStatement953); 

                	newLeafNode(otherlv_3, grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMultiStatement"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:429:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:430:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:431:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression989);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression999); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:438:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:441:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:442:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:442:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:443:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1046);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:451:1: ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:451:2: () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:451:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:452:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:457:2: ( (lv_op_2_0= 'OR' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:458:1: (lv_op_2_0= 'OR' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:458:1: (lv_op_2_0= 'OR' )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:459:3: lv_op_2_0= 'OR'
            	    {
            	    lv_op_2_0=(Token)match(input,16,FOLLOW_16_in_ruleOrExpression1073); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "OR");
            	    	    

            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:472:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:473:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:473:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:474:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1107);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:498:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:499:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:500:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1145);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1155); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:507:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:510:28: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:511:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:511:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:512:5: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1202);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;

             
                    current = this_EqualityExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:520:1: ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:520:2: () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:520:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:521:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:526:2: ( (lv_op_2_0= 'AND' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:527:1: (lv_op_2_0= 'AND' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:527:1: (lv_op_2_0= 'AND' )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:528:3: lv_op_2_0= 'AND'
            	    {
            	    lv_op_2_0=(Token)match(input,17,FOLLOW_17_in_ruleAndExpression1229); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "AND");
            	    	    

            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:541:2: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:542:1: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:542:1: (lv_right_3_0= ruleEqualityExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:543:3: lv_right_3_0= ruleEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1263);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"EqualityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:567:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:568:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:569:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1301);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression1311); 

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:576:1: ruleEqualityExpression returns [EObject current=null] : (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_DashOperation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:579:28: ( (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:580:1: (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:580:1: (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:581:5: this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityExpressionAccess().getDashOperationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDashOperation_in_ruleEqualityExpression1358);
            this_DashOperation_0=ruleDashOperation();

            state._fsp--;

             
                    current = this_DashOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:589:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:589:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:589:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:590:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:595:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:596:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:596:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:597:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:597:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' )
            	    int alt6=6;
            	    switch ( input.LA(1) ) {
            	    case 18:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt6=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:598:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,18,FOLLOW_18_in_ruleEqualityExpression1387); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:610:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,19,FOLLOW_19_in_ruleEqualityExpression1416); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:622:8: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,20,FOLLOW_20_in_ruleEqualityExpression1445); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:634:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,21,FOLLOW_21_in_ruleEqualityExpression1474); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:646:8: lv_op_2_5= 'in'
            	            {
            	            lv_op_2_5=(Token)match(input,22,FOLLOW_22_in_ruleEqualityExpression1503); 

            	                    newLeafNode(lv_op_2_5, grammarAccess.getEqualityExpressionAccess().getOpInKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:658:8: lv_op_2_6= 'not in'
            	            {
            	            lv_op_2_6=(Token)match(input,23,FOLLOW_23_in_ruleEqualityExpression1532); 

            	                    newLeafNode(lv_op_2_6, grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_1_1_0_5());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:673:2: ( (lv_right_3_0= ruleDashOperation ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:674:1: (lv_right_3_0= ruleDashOperation )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:674:1: (lv_right_3_0= ruleDashOperation )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:675:3: lv_right_3_0= ruleDashOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightDashOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDashOperation_in_ruleEqualityExpression1569);
            	    lv_right_3_0=ruleDashOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"DashOperation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleDashOperation"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:699:1: entryRuleDashOperation returns [EObject current=null] : iv_ruleDashOperation= ruleDashOperation EOF ;
    public final EObject entryRuleDashOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashOperation = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:700:2: (iv_ruleDashOperation= ruleDashOperation EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:701:2: iv_ruleDashOperation= ruleDashOperation EOF
            {
             newCompositeNode(grammarAccess.getDashOperationRule()); 
            pushFollow(FOLLOW_ruleDashOperation_in_entryRuleDashOperation1607);
            iv_ruleDashOperation=ruleDashOperation();

            state._fsp--;

             current =iv_ruleDashOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDashOperation1617); 

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
    // $ANTLR end "entryRuleDashOperation"


    // $ANTLR start "ruleDashOperation"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:708:1: ruleDashOperation returns [EObject current=null] : (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* ) ;
    public final EObject ruleDashOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PointOperation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:711:28: ( (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:712:1: (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:712:1: (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:713:5: this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDashOperationAccess().getPointOperationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePointOperation_in_ruleDashOperation1664);
            this_PointOperation_0=rulePointOperation();

            state._fsp--;

             
                    current = this_PointOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:721:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:721:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:721:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:722:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:727:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:728:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:728:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:729:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:729:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==24) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==25) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:730:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,24,FOLLOW_24_in_ruleDashOperation1693); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getDashOperationAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDashOperationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:742:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,25,FOLLOW_25_in_ruleDashOperation1722); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getDashOperationAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDashOperationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:757:2: ( (lv_right_3_0= rulePointOperation ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:758:1: (lv_right_3_0= rulePointOperation )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:758:1: (lv_right_3_0= rulePointOperation )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:759:3: lv_right_3_0= rulePointOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDashOperationAccess().getRightPointOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePointOperation_in_ruleDashOperation1759);
            	    lv_right_3_0=rulePointOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDashOperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PointOperation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleDashOperation"


    // $ANTLR start "entryRulePointOperation"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:783:1: entryRulePointOperation returns [EObject current=null] : iv_rulePointOperation= rulePointOperation EOF ;
    public final EObject entryRulePointOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointOperation = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:784:2: (iv_rulePointOperation= rulePointOperation EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:785:2: iv_rulePointOperation= rulePointOperation EOF
            {
             newCompositeNode(grammarAccess.getPointOperationRule()); 
            pushFollow(FOLLOW_rulePointOperation_in_entryRulePointOperation1797);
            iv_rulePointOperation=rulePointOperation();

            state._fsp--;

             current =iv_rulePointOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointOperation1807); 

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
    // $ANTLR end "entryRulePointOperation"


    // $ANTLR start "rulePointOperation"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:792:1: rulePointOperation returns [EObject current=null] : (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* ) ;
    public final EObject rulePointOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PowOperation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:795:28: ( (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:796:1: (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:796:1: (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:797:5: this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPointOperationAccess().getPowOperationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePowOperation_in_rulePointOperation1854);
            this_PowOperation_0=rulePowOperation();

            state._fsp--;

             
                    current = this_PowOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:805:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:805:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:805:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:806:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:811:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:812:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:812:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:813:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:813:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==26) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==27) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:814:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_rulePointOperation1883); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPointOperationAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPointOperationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:826:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_rulePointOperation1912); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getPointOperationAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPointOperationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:841:2: ( (lv_right_3_0= rulePowOperation ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:842:1: (lv_right_3_0= rulePowOperation )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:842:1: (lv_right_3_0= rulePowOperation )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:843:3: lv_right_3_0= rulePowOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPointOperationAccess().getRightPowOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePowOperation_in_rulePointOperation1949);
            	    lv_right_3_0=rulePowOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPointOperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PowOperation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "rulePointOperation"


    // $ANTLR start "entryRulePowOperation"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:867:1: entryRulePowOperation returns [EObject current=null] : iv_rulePowOperation= rulePowOperation EOF ;
    public final EObject entryRulePowOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowOperation = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:868:2: (iv_rulePowOperation= rulePowOperation EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:869:2: iv_rulePowOperation= rulePowOperation EOF
            {
             newCompositeNode(grammarAccess.getPowOperationRule()); 
            pushFollow(FOLLOW_rulePowOperation_in_entryRulePowOperation1987);
            iv_rulePowOperation=rulePowOperation();

            state._fsp--;

             current =iv_rulePowOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePowOperation1997); 

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
    // $ANTLR end "entryRulePowOperation"


    // $ANTLR start "rulePowOperation"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:876:1: rulePowOperation returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject rulePowOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:879:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:880:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:880:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:881:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPowOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_rulePowOperation2044);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:889:1: ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:889:2: () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:889:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:890:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:895:2: ( (lv_op_2_0= '^' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:896:1: (lv_op_2_0= '^' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:896:1: (lv_op_2_0= '^' )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:897:3: lv_op_2_0= '^'
            	    {
            	    lv_op_2_0=(Token)match(input,28,FOLLOW_28_in_rulePowOperation2071); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPowOperationRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	    	    

            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:910:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:911:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:911:1: (lv_right_3_0= rulePrimaryExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:912:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePowOperation2105);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPowOperationRule());
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
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "rulePowOperation"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:936:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:937:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:938:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2143);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2153); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:945:1: rulePrimaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UnaryExpression_0 = null;

        EObject this_EvaluationExpression_2 = null;

        EObject this_EvaluationExpression_5 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:948:28: ( (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:949:1: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:949:1: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 14:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:950:5: this_UnaryExpression_0= ruleUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression2200);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;

                     
                            current = this_UnaryExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:959:6: (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:959:6: (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:959:8: otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression2218); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2240);
                    this_EvaluationExpression_2=ruleEvaluationExpression();

                    state._fsp--;

                     
                            current = this_EvaluationExpression_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression2251); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:977:6: (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:977:6: (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:977:8: otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_rulePrimaryExpression2271); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2293);
                    this_EvaluationExpression_5=ruleEvaluationExpression();

                    state._fsp--;

                     
                            current = this_EvaluationExpression_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression2304); 

                        	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                        

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1002:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1003:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1004:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2341);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression2351); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1011:1: ruleUnaryExpression returns [EObject current=null] : this_Term_0= ruleTerm ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1014:28: (this_Term_0= ruleTerm )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1016:5: this_Term_0= ruleTerm
            {
             
                    newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleUnaryExpression2397);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1032:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1033:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1034:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2431);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2441); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1041:1: ruleTerm returns [EObject current=null] : (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        EObject this_Designator_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1044:28: ( (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1045:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1045:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1046:5: this_Designator_0= ruleDesignator
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDesignator_in_ruleTerm2488);
                    this_Designator_0=ruleDesignator();

                    state._fsp--;

                     
                            current = this_Designator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1055:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1055:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1055:7: () ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1055:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1056:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getStringValueAction_1_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1061:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1062:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1062:1: (lv_value_2_0= RULE_STRING )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1063:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerm2520); 

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
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1080:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1080:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1080:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1080:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1081:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getIntegerValueAction_2_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1086:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1087:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1087:1: (lv_value_4_0= RULE_INT )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1088:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerm2559); 

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
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1105:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1105:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1105:7: () ( (lv_value_6_0= RULE_DOUBLE ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1105:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1106:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getDoubleValueAction_3_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1111:2: ( (lv_value_6_0= RULE_DOUBLE ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1112:1: (lv_value_6_0= RULE_DOUBLE )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1112:1: (lv_value_6_0= RULE_DOUBLE )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1113:3: lv_value_6_0= RULE_DOUBLE
                    {
                    lv_value_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTerm2598); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1137:1: entryRuleDesignator returns [EObject current=null] : iv_ruleDesignator= ruleDesignator EOF ;
    public final EObject entryRuleDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignator = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1138:2: (iv_ruleDesignator= ruleDesignator EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1139:2: iv_ruleDesignator= ruleDesignator EOF
            {
             newCompositeNode(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator2640);
            iv_ruleDesignator=ruleDesignator();

            state._fsp--;

             current =iv_ruleDesignator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator2650); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1146:1: ruleDesignator returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDesignator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1149:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1150:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1150:1: ( (otherlv_0= RULE_ID ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1151:1: (otherlv_0= RULE_ID )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1151:1: (otherlv_0= RULE_ID )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1152:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignatorRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDesignator2694); 

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
    public static final BitSet FOLLOW_rulePhrase_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePhrase222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rulePhrase249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_ruleExpression340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpression384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleEvaluationExpression430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_ruleStatement521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_ruleStatement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_ruleStatement575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStatement620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleSingleStatement666 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSingleStatement678 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSingleStatement699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfStatement745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSelfStatement782 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSelfStatement794 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelfStatement815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiStatement861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleMultiStatement907 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMultiStatement919 = new BitSet(new long[]{0x000000002000C0F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMultiStatement940 = new BitSet(new long[]{0x000000002000C0F0L});
    public static final BitSet FOLLOW_15_in_ruleMultiStatement953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1046 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleOrExpression1073 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1107 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1202 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleAndExpression1229 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1263 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_ruleEqualityExpression1358 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_18_in_ruleEqualityExpression1387 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_19_in_ruleEqualityExpression1416 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_20_in_ruleEqualityExpression1445 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_21_in_ruleEqualityExpression1474 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_22_in_ruleEqualityExpression1503 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_23_in_ruleEqualityExpression1532 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_ruleDashOperation_in_ruleEqualityExpression1569 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_entryRuleDashOperation1607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDashOperation1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_ruleDashOperation1664 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleDashOperation1693 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_25_in_ruleDashOperation1722 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_rulePointOperation_in_ruleDashOperation1759 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_entryRulePointOperation1797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointOperation1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_rulePointOperation1854 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_rulePointOperation1883 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_27_in_rulePointOperation1912 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_rulePowOperation_in_rulePointOperation1949 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_entryRulePowOperation1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowOperation1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePowOperation2044 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_rulePowOperation2071 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePowOperation2105 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression2218 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2240 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePrimaryExpression2271 = new BitSet(new long[]{0x00000000200040F0L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2293 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleUnaryExpression2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleTerm2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerm2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerm2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTerm2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator2640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDesignator2694 = new BitSet(new long[]{0x0000000000000002L});

}
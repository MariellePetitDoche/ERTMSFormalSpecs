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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'<-'", "'CurrentState'", "'('", "')'", "'OR'", "'AND'", "'=='", "'!='", "'<='", "'>='", "'in'", "'not in'", "'+'", "'-'", "'*'", "'/'", "'^'", "'NOT ('"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_DOUBLE=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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


    // $ANTLR start "entryRuleFQN"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:106:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:107:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:108:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN166);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN177); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:115:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:118:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:119:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:119:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:119:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN217); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:126:1: (kw= '.' this_ID_2= RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:127:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleFQN236); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN251); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRulePhrase"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:147:1: entryRulePhrase returns [EObject current=null] : iv_rulePhrase= rulePhrase EOF ;
    public final EObject entryRulePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhrase = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:148:2: (iv_rulePhrase= rulePhrase EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:149:2: iv_rulePhrase= rulePhrase EOF
            {
             newCompositeNode(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase298);
            iv_rulePhrase=rulePhrase();

            state._fsp--;

             current =iv_rulePhrase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase308); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:156:1: rulePhrase returns [EObject current=null] : (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement ) ;
    public final EObject rulePhrase() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_Statement_1 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:159:28: ( (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:160:1: (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:160:1: (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:161:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePhrase355);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:171:5: this_Statement_1= ruleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getPhraseAccess().getStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStatement_in_rulePhrase382);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:187:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:188:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:189:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression417);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression427); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:196:1: ruleExpression returns [EObject current=null] : this_EvaluationExpression_0= ruleEvaluationExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EvaluationExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:199:28: (this_EvaluationExpression_0= ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:201:5: this_EvaluationExpression_0= ruleEvaluationExpression
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getEvaluationExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleEvaluationExpression_in_ruleExpression473);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:217:1: entryRuleEvaluationExpression returns [EObject current=null] : iv_ruleEvaluationExpression= ruleEvaluationExpression EOF ;
    public final EObject entryRuleEvaluationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:218:2: (iv_ruleEvaluationExpression= ruleEvaluationExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:219:2: iv_ruleEvaluationExpression= ruleEvaluationExpression EOF
            {
             newCompositeNode(grammarAccess.getEvaluationExpressionRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression507);
            iv_ruleEvaluationExpression=ruleEvaluationExpression();

            state._fsp--;

             current =iv_ruleEvaluationExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpression517); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:226:1: ruleEvaluationExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleEvaluationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:229:28: (this_OrExpression_0= ruleOrExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:231:5: this_OrExpression_0= ruleOrExpression
            {
             
                    newCompositeNode(grammarAccess.getEvaluationExpressionAccess().getOrExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleEvaluationExpression563);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:247:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:248:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:249:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement597);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement607); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:256:1: ruleStatement returns [EObject current=null] : (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SingleStatement_0 = null;

        EObject this_SelfStatement_1 = null;

        EObject this_MultiStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:259:28: ( (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:260:1: (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:260:1: (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:261:5: this_SingleStatement_0= ruleSingleStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSingleStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSingleStatement_in_ruleStatement654);
                    this_SingleStatement_0=ruleSingleStatement();

                    state._fsp--;

                     
                            current = this_SingleStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:271:5: this_SelfStatement_1= ruleSelfStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSelfStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelfStatement_in_ruleStatement681);
                    this_SelfStatement_1=ruleSelfStatement();

                    state._fsp--;

                     
                            current = this_SelfStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:281:5: this_MultiStatement_2= ruleMultiStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMultiStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMultiStatement_in_ruleStatement708);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:297:1: entryRuleSingleStatement returns [EObject current=null] : iv_ruleSingleStatement= ruleSingleStatement EOF ;
    public final EObject entryRuleSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:298:2: (iv_ruleSingleStatement= ruleSingleStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:299:2: iv_ruleSingleStatement= ruleSingleStatement EOF
            {
             newCompositeNode(grammarAccess.getSingleStatementRule()); 
            pushFollow(FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement743);
            iv_ruleSingleStatement=ruleSingleStatement();

            state._fsp--;

             current =iv_ruleSingleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStatement753); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:306:1: ruleSingleStatement returns [EObject current=null] : ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSingleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_desgnator_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:309:28: ( ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:310:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:310:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:310:2: ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:310:2: ( (lv_desgnator_0_0= ruleDesignator ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:311:1: (lv_desgnator_0_0= ruleDesignator )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:311:1: (lv_desgnator_0_0= ruleDesignator )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:312:3: lv_desgnator_0_0= ruleDesignator
            {
             
            	        newCompositeNode(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignator_in_ruleSingleStatement799);
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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSingleStatement811); 

                	newLeafNode(otherlv_1, grammarAccess.getSingleStatementAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:332:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:333:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:333:1: (lv_expression_2_0= ruleExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:334:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSingleStatement832);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:358:1: entryRuleSelfStatement returns [EObject current=null] : iv_ruleSelfStatement= ruleSelfStatement EOF ;
    public final EObject entryRuleSelfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:359:2: (iv_ruleSelfStatement= ruleSelfStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:360:2: iv_ruleSelfStatement= ruleSelfStatement EOF
            {
             newCompositeNode(grammarAccess.getSelfStatementRule()); 
            pushFollow(FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement868);
            iv_ruleSelfStatement=ruleSelfStatement();

            state._fsp--;

             current =iv_ruleSelfStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfStatement878); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:367:1: ruleSelfStatement returns [EObject current=null] : (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSelfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:370:28: ( (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:371:1: (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:371:1: (otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:371:3: otherlv_0= 'CurrentState' otherlv_1= '<-' ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSelfStatement915); 

                	newLeafNode(otherlv_0, grammarAccess.getSelfStatementAccess().getCurrentStateKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleSelfStatement927); 

                	newLeafNode(otherlv_1, grammarAccess.getSelfStatementAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:379:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:380:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:380:1: (lv_expression_2_0= ruleExpression )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:381:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSelfStatement948);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:405:1: entryRuleMultiStatement returns [EObject current=null] : iv_ruleMultiStatement= ruleMultiStatement EOF ;
    public final EObject entryRuleMultiStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiStatement = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:406:2: (iv_ruleMultiStatement= ruleMultiStatement EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:407:2: iv_ruleMultiStatement= ruleMultiStatement EOF
            {
             newCompositeNode(grammarAccess.getMultiStatementRule()); 
            pushFollow(FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement984);
            iv_ruleMultiStatement=ruleMultiStatement();

            state._fsp--;

             current =iv_ruleMultiStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiStatement994); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:414:1: ruleMultiStatement returns [EObject current=null] : ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' ) ;
    public final EObject ruleMultiStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_desgnator_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:417:28: ( ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:418:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:418:1: ( ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:418:2: ( (lv_desgnator_0_0= ruleDesignator ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')'
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:418:2: ( (lv_desgnator_0_0= ruleDesignator ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:419:1: (lv_desgnator_0_0= ruleDesignator )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:419:1: (lv_desgnator_0_0= ruleDesignator )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:420:3: lv_desgnator_0_0= ruleDesignator
            {
             
            	        newCompositeNode(grammarAccess.getMultiStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDesignator_in_ruleMultiStatement1040);
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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleMultiStatement1052); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1());
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:440:1: ( (lv_expressions_2_0= ruleExpression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_DOUBLE)||LA4_0==15||LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:441:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:441:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:442:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiStatementAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleMultiStatement1073);
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
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMultiStatement1086); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:470:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:471:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:472:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1122);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1132); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:479:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:482:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:483:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:483:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:484:5: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1179);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:492:1: ( () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:492:2: () ( (lv_op_2_0= 'OR' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:492:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:493:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:498:2: ( (lv_op_2_0= 'OR' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:499:1: (lv_op_2_0= 'OR' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:499:1: (lv_op_2_0= 'OR' )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:500:3: lv_op_2_0= 'OR'
            	    {
            	    lv_op_2_0=(Token)match(input,17,FOLLOW_17_in_ruleOrExpression1206); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "OR");
            	    	    

            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:513:2: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:514:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:514:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:515:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1240);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:539:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:540:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:541:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1278);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1288); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:548:1: ruleAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:551:28: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:552:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:552:1: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:553:5: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1335);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;

             
                    current = this_EqualityExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:561:1: ( () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:561:2: () ( (lv_op_2_0= 'AND' ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:561:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:562:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:567:2: ( (lv_op_2_0= 'AND' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:568:1: (lv_op_2_0= 'AND' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:568:1: (lv_op_2_0= 'AND' )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:569:3: lv_op_2_0= 'AND'
            	    {
            	    lv_op_2_0=(Token)match(input,18,FOLLOW_18_in_ruleAndExpression1362); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "AND");
            	    	    

            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:582:2: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:583:1: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:583:1: (lv_right_3_0= ruleEqualityExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:584:3: lv_right_3_0= ruleEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1396);
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
            	    break loop6;
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:608:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:609:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:610:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1434);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression1444); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:617:1: ruleEqualityExpression returns [EObject current=null] : (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* ) ;
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
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:620:28: ( (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:621:1: (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:621:1: (this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:622:5: this_DashOperation_0= ruleDashOperation ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityExpressionAccess().getDashOperationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDashOperation_in_ruleEqualityExpression1491);
            this_DashOperation_0=ruleDashOperation();

            state._fsp--;

             
                    current = this_DashOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:630:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:630:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) ) ( (lv_right_3_0= ruleDashOperation ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:630:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:631:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:636:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:637:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:637:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:638:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:638:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<=' | lv_op_2_4= '>=' | lv_op_2_5= 'in' | lv_op_2_6= 'not in' )
            	    int alt7=6;
            	    switch ( input.LA(1) ) {
            	    case 19:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt7=5;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt7=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:639:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,19,FOLLOW_19_in_ruleEqualityExpression1520); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:651:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,20,FOLLOW_20_in_ruleEqualityExpression1549); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:663:8: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,21,FOLLOW_21_in_ruleEqualityExpression1578); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:675:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,22,FOLLOW_22_in_ruleEqualityExpression1607); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:687:8: lv_op_2_5= 'in'
            	            {
            	            lv_op_2_5=(Token)match(input,23,FOLLOW_23_in_ruleEqualityExpression1636); 

            	                    newLeafNode(lv_op_2_5, grammarAccess.getEqualityExpressionAccess().getOpInKeyword_1_1_0_4());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:699:8: lv_op_2_6= 'not in'
            	            {
            	            lv_op_2_6=(Token)match(input,24,FOLLOW_24_in_ruleEqualityExpression1665); 

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

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:714:2: ( (lv_right_3_0= ruleDashOperation ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:715:1: (lv_right_3_0= ruleDashOperation )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:715:1: (lv_right_3_0= ruleDashOperation )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:716:3: lv_right_3_0= ruleDashOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightDashOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDashOperation_in_ruleEqualityExpression1702);
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
            	    break loop8;
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:740:1: entryRuleDashOperation returns [EObject current=null] : iv_ruleDashOperation= ruleDashOperation EOF ;
    public final EObject entryRuleDashOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashOperation = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:741:2: (iv_ruleDashOperation= ruleDashOperation EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:742:2: iv_ruleDashOperation= ruleDashOperation EOF
            {
             newCompositeNode(grammarAccess.getDashOperationRule()); 
            pushFollow(FOLLOW_ruleDashOperation_in_entryRuleDashOperation1740);
            iv_ruleDashOperation=ruleDashOperation();

            state._fsp--;

             current =iv_ruleDashOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDashOperation1750); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:749:1: ruleDashOperation returns [EObject current=null] : (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* ) ;
    public final EObject ruleDashOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PointOperation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:752:28: ( (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:753:1: (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:753:1: (this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:754:5: this_PointOperation_0= rulePointOperation ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDashOperationAccess().getPointOperationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePointOperation_in_ruleDashOperation1797);
            this_PointOperation_0=rulePointOperation();

            state._fsp--;

             
                    current = this_PointOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:762:1: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:762:2: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= rulePointOperation ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:762:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:763:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:768:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:769:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:769:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:770:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:770:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==25) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==26) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:771:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_25_in_ruleDashOperation1826); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getDashOperationAccess().getOpPlusSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDashOperationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:783:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,26,FOLLOW_26_in_ruleDashOperation1855); 

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

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:798:2: ( (lv_right_3_0= rulePointOperation ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:799:1: (lv_right_3_0= rulePointOperation )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:799:1: (lv_right_3_0= rulePointOperation )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:800:3: lv_right_3_0= rulePointOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDashOperationAccess().getRightPointOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePointOperation_in_ruleDashOperation1892);
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
            	    break loop10;
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:824:1: entryRulePointOperation returns [EObject current=null] : iv_rulePointOperation= rulePointOperation EOF ;
    public final EObject entryRulePointOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointOperation = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:825:2: (iv_rulePointOperation= rulePointOperation EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:826:2: iv_rulePointOperation= rulePointOperation EOF
            {
             newCompositeNode(grammarAccess.getPointOperationRule()); 
            pushFollow(FOLLOW_rulePointOperation_in_entryRulePointOperation1930);
            iv_rulePointOperation=rulePointOperation();

            state._fsp--;

             current =iv_rulePointOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointOperation1940); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:833:1: rulePointOperation returns [EObject current=null] : (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* ) ;
    public final EObject rulePointOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PowOperation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:836:28: ( (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:837:1: (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:837:1: (this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:838:5: this_PowOperation_0= rulePowOperation ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPointOperationAccess().getPowOperationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePowOperation_in_rulePointOperation1987);
            this_PowOperation_0=rulePowOperation();

            state._fsp--;

             
                    current = this_PowOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:846:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:846:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePowOperation ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:846:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:847:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:852:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:853:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:853:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:854:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:854:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==27) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==28) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:855:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,27,FOLLOW_27_in_rulePointOperation2016); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getPointOperationAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPointOperationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:867:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,28,FOLLOW_28_in_rulePointOperation2045); 

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

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:882:2: ( (lv_right_3_0= rulePowOperation ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:883:1: (lv_right_3_0= rulePowOperation )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:883:1: (lv_right_3_0= rulePowOperation )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:884:3: lv_right_3_0= rulePowOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPointOperationAccess().getRightPowOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePowOperation_in_rulePointOperation2082);
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
    // $ANTLR end "rulePointOperation"


    // $ANTLR start "entryRulePowOperation"
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:908:1: entryRulePowOperation returns [EObject current=null] : iv_rulePowOperation= rulePowOperation EOF ;
    public final EObject entryRulePowOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowOperation = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:909:2: (iv_rulePowOperation= rulePowOperation EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:910:2: iv_rulePowOperation= rulePowOperation EOF
            {
             newCompositeNode(grammarAccess.getPowOperationRule()); 
            pushFollow(FOLLOW_rulePowOperation_in_entryRulePowOperation2120);
            iv_rulePowOperation=rulePowOperation();

            state._fsp--;

             current =iv_rulePowOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePowOperation2130); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:917:1: rulePowOperation returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject rulePowOperation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:920:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:921:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:921:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:922:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPowOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_rulePowOperation2177);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:930:1: ( () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:930:2: () ( (lv_op_2_0= '^' ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:930:2: ()
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:931:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:936:2: ( (lv_op_2_0= '^' ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:937:1: (lv_op_2_0= '^' )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:937:1: (lv_op_2_0= '^' )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:938:3: lv_op_2_0= '^'
            	    {
            	    lv_op_2_0=(Token)match(input,29,FOLLOW_29_in_rulePowOperation2204); 

            	            newLeafNode(lv_op_2_0, grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPowOperationRule());
            	    	        }
            	           		setWithLastConsumed(current, "op", lv_op_2_0, "^");
            	    	    

            	    }


            	    }

            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:951:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:952:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:952:1: (lv_right_3_0= rulePrimaryExpression )
            	    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:953:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePowOperation2238);
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
            	    break loop13;
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:977:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:978:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:979:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2276);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2286); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:986:1: rulePrimaryExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) ) ;
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
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:989:28: ( (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:990:1: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:990:1: (this_UnaryExpression_0= ruleUnaryExpression | (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' ) | (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt14=1;
                }
                break;
            case 15:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:991:5: this_UnaryExpression_0= ruleUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression2333);
                    this_UnaryExpression_0=ruleUnaryExpression();

                    state._fsp--;

                     
                            current = this_UnaryExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1000:6: (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1000:6: (otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')' )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1000:8: otherlv_1= '(' this_EvaluationExpression_2= ruleEvaluationExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_rulePrimaryExpression2351); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2373);
                    this_EvaluationExpression_2=ruleEvaluationExpression();

                    state._fsp--;

                     
                            current = this_EvaluationExpression_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression2384); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1018:6: (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1018:6: (otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')' )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1018:8: otherlv_4= 'NOT (' this_EvaluationExpression_5= ruleEvaluationExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePrimaryExpression2404); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2426);
                    this_EvaluationExpression_5=ruleEvaluationExpression();

                    state._fsp--;

                     
                            current = this_EvaluationExpression_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression2437); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1043:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1044:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1045:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2474);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression2484); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1052:1: ruleUnaryExpression returns [EObject current=null] : this_Term_0= ruleTerm ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1055:28: (this_Term_0= ruleTerm )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1057:5: this_Term_0= ruleTerm
            {
             
                    newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleUnaryExpression2530);
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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1073:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1074:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1075:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2564);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2574); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1082:1: ruleTerm returns [EObject current=null] : (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;
        EObject this_Designator_0 = null;


         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1085:28: ( (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1086:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1086:1: (this_Designator_0= ruleDesignator | ( () ( (lv_value_2_0= RULE_STRING ) ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_DOUBLE ) ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case RULE_INT:
                {
                alt15=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1087:5: this_Designator_0= ruleDesignator
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDesignator_in_ruleTerm2621);
                    this_Designator_0=ruleDesignator();

                    state._fsp--;

                     
                            current = this_Designator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1096:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1096:6: ( () ( (lv_value_2_0= RULE_STRING ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1096:7: () ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1096:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1097:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getStringValueAction_1_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1102:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1103:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1103:1: (lv_value_2_0= RULE_STRING )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1104:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerm2653); 

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
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1121:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1121:6: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1121:7: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1121:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1122:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getIntegerValueAction_2_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1127:2: ( (lv_value_4_0= RULE_INT ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1128:1: (lv_value_4_0= RULE_INT )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1128:1: (lv_value_4_0= RULE_INT )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1129:3: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTerm2692); 

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
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1146:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1146:6: ( () ( (lv_value_6_0= RULE_DOUBLE ) ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1146:7: () ( (lv_value_6_0= RULE_DOUBLE ) )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1146:7: ()
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1147:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTermAccess().getDoubleValueAction_3_0(),
                                current);
                        

                    }

                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1152:2: ( (lv_value_6_0= RULE_DOUBLE ) )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1153:1: (lv_value_6_0= RULE_DOUBLE )
                    {
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1153:1: (lv_value_6_0= RULE_DOUBLE )
                    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1154:3: lv_value_6_0= RULE_DOUBLE
                    {
                    lv_value_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTerm2731); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1178:1: entryRuleDesignator returns [EObject current=null] : iv_ruleDesignator= ruleDesignator EOF ;
    public final EObject entryRuleDesignator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignator = null;


        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1179:2: (iv_ruleDesignator= ruleDesignator EOF )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1180:2: iv_ruleDesignator= ruleDesignator EOF
            {
             newCompositeNode(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator2773);
            iv_ruleDesignator=ruleDesignator();

            state._fsp--;

             current =iv_ruleDesignator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator2783); 

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
    // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1187:1: ruleDesignator returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleDesignator() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1190:28: ( ( ( ruleFQN ) ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1191:1: ( ( ruleFQN ) )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1191:1: ( ( ruleFQN ) )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1192:1: ( ruleFQN )
            {
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1192:1: ( ruleFQN )
            // ../org.openetcs.dsl.expression/src-gen/org/openetcs/dsl/parser/antlr/internal/InternalExpression.g:1193:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignatorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleDesignator2830);
            ruleFQN();

            state._fsp--;

             
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
    // $ANTLR end "ruleDesignator"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA2_minS =
        "\1\4\1\14\2\uffff\1\4\1\14";
    static final String DFA2_maxS =
        "\1\36\1\35\2\uffff\1\4\1\35";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2\2\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\3\2\6\uffff\1\3\1\2\16\uffff\1\2",
            "\1\4\1\3\1\uffff\1\3\1\uffff\15\2",
            "",
            "",
            "\1\5",
            "\1\4\1\3\1\uffff\1\3\1\uffff\15\2"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "160:1: (this_Expression_0= ruleExpression | this_Statement_1= ruleStatement )";
        }
    }
    static final String DFA3_eotS =
        "\7\uffff";
    static final String DFA3_eofS =
        "\7\uffff";
    static final String DFA3_minS =
        "\1\4\1\14\1\uffff\1\4\2\uffff\1\14";
    static final String DFA3_maxS =
        "\1\16\1\17\1\uffff\1\4\2\uffff\1\17";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA3_specialS =
        "\7\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\11\uffff\1\2",
            "\1\3\1\5\1\uffff\1\4",
            "",
            "\1\6",
            "",
            "",
            "\1\3\1\5\1\uffff\1\4"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "260:1: (this_SingleStatement_0= ruleSingleStatement | this_SelfStatement_1= ruleSelfStatement | this_MultiStatement_2= ruleMultiStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN217 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleFQN236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN251 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePhrase355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rulePhrase382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_ruleExpression473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpression517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleEvaluationExpression563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_ruleStatement654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_ruleStatement681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_ruleStatement708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStatement753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleSingleStatement799 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleStatement811 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSingleStatement832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfStatement878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSelfStatement915 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSelfStatement927 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSelfStatement948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiStatement994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleMultiStatement1040 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMultiStatement1052 = new BitSet(new long[]{0x00000000400180F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMultiStatement1073 = new BitSet(new long[]{0x00000000400180F0L});
    public static final BitSet FOLLOW_16_in_ruleMultiStatement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1179 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOrExpression1206 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1240 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1335 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAndExpression1362 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1396 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_ruleEqualityExpression1491 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_19_in_ruleEqualityExpression1520 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_20_in_ruleEqualityExpression1549 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_21_in_ruleEqualityExpression1578 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_22_in_ruleEqualityExpression1607 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_23_in_ruleEqualityExpression1636 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_24_in_ruleEqualityExpression1665 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_ruleDashOperation_in_ruleEqualityExpression1702 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_entryRuleDashOperation1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDashOperation1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_ruleDashOperation1797 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleDashOperation1826 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_26_in_ruleDashOperation1855 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_rulePointOperation_in_ruleDashOperation1892 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_entryRulePointOperation1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointOperation1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_rulePointOperation1987 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_rulePointOperation2016 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_28_in_rulePointOperation2045 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_rulePowOperation_in_rulePointOperation2082 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_entryRulePowOperation2120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowOperation2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePowOperation2177 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePowOperation2204 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePowOperation2238 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rulePrimaryExpression2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimaryExpression2351 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2373 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePrimaryExpression2404 = new BitSet(new long[]{0x00000000400080F0L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rulePrimaryExpression2426 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleUnaryExpression2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_ruleTerm2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerm2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTerm2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTerm2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator2773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleDesignator2830 = new BitSet(new long[]{0x0000000000000002L});

}
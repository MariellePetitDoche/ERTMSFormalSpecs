package org.openetcs.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.openetcs.dsl.services.ExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<='", "'>='", "'in'", "'not in'", "'+'", "'-'", "'*'", "'/'", "'<-'", "'CurrentState'", "'('", "')'", "'NOT ('", "'OR'", "'AND'", "'^'"
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
    public String getGrammarFileName() { return "../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g"; }


     
     	private ExpressionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:61:1: ( ruleModel EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:69:1: ruleModel : ( ( rule__Model__PhraseAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:73:2: ( ( ( rule__Model__PhraseAssignment ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:74:1: ( ( rule__Model__PhraseAssignment ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:74:1: ( ( rule__Model__PhraseAssignment ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:75:1: ( rule__Model__PhraseAssignment )
            {
             before(grammarAccess.getModelAccess().getPhraseAssignment()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:76:1: ( rule__Model__PhraseAssignment )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:76:2: rule__Model__PhraseAssignment
            {
            pushFollow(FOLLOW_rule__Model__PhraseAssignment_in_ruleModel94);
            rule__Model__PhraseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPhraseAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePhrase"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:88:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:89:1: ( rulePhrase EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:90:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase121);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:97:1: rulePhrase : ( ( rule__Phrase__Alternatives ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:101:2: ( ( ( rule__Phrase__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:102:1: ( ( rule__Phrase__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:102:1: ( ( rule__Phrase__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:103:1: ( rule__Phrase__Alternatives )
            {
             before(grammarAccess.getPhraseAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:104:1: ( rule__Phrase__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:104:2: rule__Phrase__Alternatives
            {
            pushFollow(FOLLOW_rule__Phrase__Alternatives_in_rulePhrase154);
            rule__Phrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:116:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:117:1: ( ruleExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:118:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression181);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:125:1: ruleExpression : ( ruleEvaluationExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:129:2: ( ( ruleEvaluationExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:130:1: ( ruleEvaluationExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:130:1: ( ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:131:1: ruleEvaluationExpression
            {
             before(grammarAccess.getExpressionAccess().getEvaluationExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_ruleExpression214);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getEvaluationExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEvaluationExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:144:1: entryRuleEvaluationExpression : ruleEvaluationExpression EOF ;
    public final void entryRuleEvaluationExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:145:1: ( ruleEvaluationExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:146:1: ruleEvaluationExpression EOF
            {
             before(grammarAccess.getEvaluationExpressionRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression240);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpression247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvaluationExpression"


    // $ANTLR start "ruleEvaluationExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:153:1: ruleEvaluationExpression : ( ruleOrExpression ) ;
    public final void ruleEvaluationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:157:2: ( ( ruleOrExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:158:1: ( ruleOrExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:158:1: ( ruleOrExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:159:1: ruleOrExpression
            {
             before(grammarAccess.getEvaluationExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleOrExpression_in_ruleEvaluationExpression273);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationExpressionAccess().getOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluationExpression"


    // $ANTLR start "entryRuleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:172:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:173:1: ( ruleStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:174:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement299);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement306); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:181:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:185:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:186:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:186:1: ( ( rule__Statement__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:187:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:188:1: ( rule__Statement__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:188:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement332);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSingleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:200:1: entryRuleSingleStatement : ruleSingleStatement EOF ;
    public final void entryRuleSingleStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:201:1: ( ruleSingleStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:202:1: ruleSingleStatement EOF
            {
             before(grammarAccess.getSingleStatementRule()); 
            pushFollow(FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement359);
            ruleSingleStatement();

            state._fsp--;

             after(grammarAccess.getSingleStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStatement366); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleStatement"


    // $ANTLR start "ruleSingleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:209:1: ruleSingleStatement : ( ( rule__SingleStatement__Group__0 ) ) ;
    public final void ruleSingleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:213:2: ( ( ( rule__SingleStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:214:1: ( ( rule__SingleStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:214:1: ( ( rule__SingleStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:215:1: ( rule__SingleStatement__Group__0 )
            {
             before(grammarAccess.getSingleStatementAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:216:1: ( rule__SingleStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:216:2: rule__SingleStatement__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__0_in_ruleSingleStatement392);
            rule__SingleStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleStatement"


    // $ANTLR start "entryRuleSelfStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:228:1: entryRuleSelfStatement : ruleSelfStatement EOF ;
    public final void entryRuleSelfStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:229:1: ( ruleSelfStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:230:1: ruleSelfStatement EOF
            {
             before(grammarAccess.getSelfStatementRule()); 
            pushFollow(FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement419);
            ruleSelfStatement();

            state._fsp--;

             after(grammarAccess.getSelfStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfStatement426); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelfStatement"


    // $ANTLR start "ruleSelfStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:237:1: ruleSelfStatement : ( ( rule__SelfStatement__Group__0 ) ) ;
    public final void ruleSelfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:241:2: ( ( ( rule__SelfStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:242:1: ( ( rule__SelfStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:242:1: ( ( rule__SelfStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:243:1: ( rule__SelfStatement__Group__0 )
            {
             before(grammarAccess.getSelfStatementAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:244:1: ( rule__SelfStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:244:2: rule__SelfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__0_in_ruleSelfStatement452);
            rule__SelfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelfStatement"


    // $ANTLR start "entryRuleMultiStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:256:1: entryRuleMultiStatement : ruleMultiStatement EOF ;
    public final void entryRuleMultiStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:257:1: ( ruleMultiStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:258:1: ruleMultiStatement EOF
            {
             before(grammarAccess.getMultiStatementRule()); 
            pushFollow(FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement479);
            ruleMultiStatement();

            state._fsp--;

             after(grammarAccess.getMultiStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiStatement486); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiStatement"


    // $ANTLR start "ruleMultiStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:265:1: ruleMultiStatement : ( ( rule__MultiStatement__Group__0 ) ) ;
    public final void ruleMultiStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:269:2: ( ( ( rule__MultiStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:270:1: ( ( rule__MultiStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:270:1: ( ( rule__MultiStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:271:1: ( rule__MultiStatement__Group__0 )
            {
             before(grammarAccess.getMultiStatementAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:272:1: ( rule__MultiStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:272:2: rule__MultiStatement__Group__0
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__0_in_ruleMultiStatement512);
            rule__MultiStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiStatement"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:284:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:285:1: ( ruleOrExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:286:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression539);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression546); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:293:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:297:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:298:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:298:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:299:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:300:1: ( rule__OrExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:300:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression572);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:312:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:313:1: ( ruleAndExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:314:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression599);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression606); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:321:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:325:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:326:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:326:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:327:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:328:1: ( rule__AndExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:328:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression632);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:340:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:341:1: ( ruleEqualityExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:342:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression659);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression666); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:349:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:353:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:354:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:354:1: ( ( rule__EqualityExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:355:1: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:356:1: ( rule__EqualityExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:356:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression692);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleDashOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:368:1: entryRuleDashOperation : ruleDashOperation EOF ;
    public final void entryRuleDashOperation() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:369:1: ( ruleDashOperation EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:370:1: ruleDashOperation EOF
            {
             before(grammarAccess.getDashOperationRule()); 
            pushFollow(FOLLOW_ruleDashOperation_in_entryRuleDashOperation719);
            ruleDashOperation();

            state._fsp--;

             after(grammarAccess.getDashOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDashOperation726); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDashOperation"


    // $ANTLR start "ruleDashOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:377:1: ruleDashOperation : ( ( rule__DashOperation__Group__0 ) ) ;
    public final void ruleDashOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:381:2: ( ( ( rule__DashOperation__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:382:1: ( ( rule__DashOperation__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:382:1: ( ( rule__DashOperation__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:383:1: ( rule__DashOperation__Group__0 )
            {
             before(grammarAccess.getDashOperationAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:384:1: ( rule__DashOperation__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:384:2: rule__DashOperation__Group__0
            {
            pushFollow(FOLLOW_rule__DashOperation__Group__0_in_ruleDashOperation752);
            rule__DashOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDashOperation"


    // $ANTLR start "entryRulePointOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:396:1: entryRulePointOperation : rulePointOperation EOF ;
    public final void entryRulePointOperation() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:397:1: ( rulePointOperation EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:398:1: rulePointOperation EOF
            {
             before(grammarAccess.getPointOperationRule()); 
            pushFollow(FOLLOW_rulePointOperation_in_entryRulePointOperation779);
            rulePointOperation();

            state._fsp--;

             after(grammarAccess.getPointOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointOperation786); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePointOperation"


    // $ANTLR start "rulePointOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:405:1: rulePointOperation : ( ( rule__PointOperation__Group__0 ) ) ;
    public final void rulePointOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:409:2: ( ( ( rule__PointOperation__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:410:1: ( ( rule__PointOperation__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:410:1: ( ( rule__PointOperation__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:411:1: ( rule__PointOperation__Group__0 )
            {
             before(grammarAccess.getPointOperationAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:412:1: ( rule__PointOperation__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:412:2: rule__PointOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PointOperation__Group__0_in_rulePointOperation812);
            rule__PointOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointOperation"


    // $ANTLR start "entryRulePowOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:424:1: entryRulePowOperation : rulePowOperation EOF ;
    public final void entryRulePowOperation() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:425:1: ( rulePowOperation EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:426:1: rulePowOperation EOF
            {
             before(grammarAccess.getPowOperationRule()); 
            pushFollow(FOLLOW_rulePowOperation_in_entryRulePowOperation839);
            rulePowOperation();

            state._fsp--;

             after(grammarAccess.getPowOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePowOperation846); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePowOperation"


    // $ANTLR start "rulePowOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:433:1: rulePowOperation : ( ( rule__PowOperation__Group__0 ) ) ;
    public final void rulePowOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:437:2: ( ( ( rule__PowOperation__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:438:1: ( ( rule__PowOperation__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:438:1: ( ( rule__PowOperation__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:439:1: ( rule__PowOperation__Group__0 )
            {
             before(grammarAccess.getPowOperationAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:440:1: ( rule__PowOperation__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:440:2: rule__PowOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PowOperation__Group__0_in_rulePowOperation872);
            rule__PowOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePowOperation"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:452:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:453:1: ( rulePrimaryExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:454:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression899);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression906); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:461:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:465:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:466:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:466:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:467:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:468:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:468:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression932);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:480:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:481:1: ( ruleUnaryExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:482:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression959);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression966); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:489:1: ruleUnaryExpression : ( ruleTerm ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:493:2: ( ( ruleTerm ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:494:1: ( ruleTerm )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:494:1: ( ruleTerm )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:495:1: ruleTerm
            {
             before(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 
            pushFollow(FOLLOW_ruleTerm_in_ruleUnaryExpression992);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleTerm"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:508:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:509:1: ( ruleTerm EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:510:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1018);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1025); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:517:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:521:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:522:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:522:1: ( ( rule__Term__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:523:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:524:1: ( rule__Term__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:524:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm1051);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleDesignator"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:536:1: entryRuleDesignator : ruleDesignator EOF ;
    public final void entryRuleDesignator() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:537:1: ( ruleDesignator EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:538:1: ruleDesignator EOF
            {
             before(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator1078);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getDesignatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator1085); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:545:1: ruleDesignator : ( ( rule__Designator__ValueAssignment ) ) ;
    public final void ruleDesignator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:549:2: ( ( ( rule__Designator__ValueAssignment ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:550:1: ( ( rule__Designator__ValueAssignment ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:550:1: ( ( rule__Designator__ValueAssignment ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:551:1: ( rule__Designator__ValueAssignment )
            {
             before(grammarAccess.getDesignatorAccess().getValueAssignment()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:552:1: ( rule__Designator__ValueAssignment )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:552:2: rule__Designator__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1111);
            rule__Designator__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDesignatorAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDesignator"


    // $ANTLR start "rule__Phrase__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:564:1: rule__Phrase__Alternatives : ( ( ruleExpression ) | ( ruleStatement ) );
    public final void rule__Phrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:568:1: ( ( ruleExpression ) | ( ruleStatement ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==22||LA1_1==24) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=12 && LA1_1<=21)||(LA1_1>=27 && LA1_1<=29)) ) {
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
            case 24:
            case 26:
                {
                alt1=1;
                }
                break;
            case 23:
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
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:569:1: ( ruleExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:569:1: ( ruleExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:570:1: ruleExpression
                    {
                     before(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1147);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:575:6: ( ruleStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:575:6: ( ruleStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:576:1: ruleStatement
                    {
                     before(grammarAccess.getPhraseAccess().getStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__Phrase__Alternatives1164);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getPhraseAccess().getStatementParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phrase__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:586:1: rule__Statement__Alternatives : ( ( ruleSingleStatement ) | ( ruleSelfStatement ) | ( ruleMultiStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:590:1: ( ( ruleSingleStatement ) | ( ruleSelfStatement ) | ( ruleMultiStatement ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==22) ) {
                    alt2=1;
                }
                else if ( (LA2_1==24) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:591:1: ( ruleSingleStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:591:1: ( ruleSingleStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:592:1: ruleSingleStatement
                    {
                     before(grammarAccess.getStatementAccess().getSingleStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleStatement_in_rule__Statement__Alternatives1196);
                    ruleSingleStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSingleStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:597:6: ( ruleSelfStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:597:6: ( ruleSelfStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:598:1: ruleSelfStatement
                    {
                     before(grammarAccess.getStatementAccess().getSelfStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSelfStatement_in_rule__Statement__Alternatives1213);
                    ruleSelfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelfStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:603:6: ( ruleMultiStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:603:6: ( ruleMultiStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:604:1: ruleMultiStatement
                    {
                     before(grammarAccess.getStatementAccess().getMultiStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMultiStatement_in_rule__Statement__Alternatives1230);
                    ruleMultiStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMultiStatementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__EqualityExpression__OpAlternatives_1_1_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:614:1: rule__EqualityExpression__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) );
    public final void rule__EqualityExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:618:1: ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:619:1: ( '==' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:619:1: ( '==' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:620:1: '=='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_1_1_01263); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:627:6: ( '!=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:627:6: ( '!=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:628:1: '!='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_1_1_01283); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:635:6: ( '<=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:635:6: ( '<=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:636:1: '<='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_1_1_01303); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:643:6: ( '>=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:643:6: ( '>=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:644:1: '>='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_1_1_01323); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:651:6: ( 'in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:651:6: ( 'in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:652:1: 'in'
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_1_1_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_1_1_01343); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:659:6: ( 'not in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:659:6: ( 'not in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:660:1: 'not in'
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_1_1_0_5()); 
                    match(input,17,FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_1_1_01363); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_1_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__DashOperation__OpAlternatives_1_1_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:672:1: rule__DashOperation__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__DashOperation__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:676:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:677:1: ( '+' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:677:1: ( '+' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:678:1: '+'
                    {
                     before(grammarAccess.getDashOperationAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__DashOperation__OpAlternatives_1_1_01398); 
                     after(grammarAccess.getDashOperationAccess().getOpPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:685:6: ( '-' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:685:6: ( '-' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:686:1: '-'
                    {
                     before(grammarAccess.getDashOperationAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__DashOperation__OpAlternatives_1_1_01418); 
                     after(grammarAccess.getDashOperationAccess().getOpHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PointOperation__OpAlternatives_1_1_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:698:1: rule__PointOperation__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__PointOperation__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:702:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:703:1: ( '*' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:703:1: ( '*' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:704:1: '*'
                    {
                     before(grammarAccess.getPointOperationAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__PointOperation__OpAlternatives_1_1_01453); 
                     after(grammarAccess.getPointOperationAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:711:6: ( '/' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:711:6: ( '/' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:712:1: '/'
                    {
                     before(grammarAccess.getPointOperationAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__PointOperation__OpAlternatives_1_1_01473); 
                     after(grammarAccess.getPointOperationAccess().getOpSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:724:1: rule__PrimaryExpression__Alternatives : ( ( ruleUnaryExpression ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:728:1: ( ( ruleUnaryExpression ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:729:1: ( ruleUnaryExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:729:1: ( ruleUnaryExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:730:1: ruleUnaryExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives1507);
                    ruleUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:735:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:735:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:736:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:737:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:737:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1524);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:741:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:741:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:742:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:743:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:743:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1542);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:752:1: rule__Term__Alternatives : ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:756:1: ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:757:1: ( ruleDesignator )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:757:1: ( ruleDesignator )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:758:1: ruleDesignator
                    {
                     before(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDesignator_in_rule__Term__Alternatives1575);
                    ruleDesignator();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:763:6: ( ( rule__Term__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:763:6: ( ( rule__Term__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:764:1: ( rule__Term__Group_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:765:1: ( rule__Term__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:765:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives1592);
                    rule__Term__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:769:6: ( ( rule__Term__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:769:6: ( ( rule__Term__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:770:1: ( rule__Term__Group_2__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_2()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:771:1: ( rule__Term__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:771:2: rule__Term__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives1610);
                    rule__Term__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:775:6: ( ( rule__Term__Group_3__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:775:6: ( ( rule__Term__Group_3__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:776:1: ( rule__Term__Group_3__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_3()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:777:1: ( rule__Term__Group_3__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:777:2: rule__Term__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives1628);
                    rule__Term__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__SingleStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:788:1: rule__SingleStatement__Group__0 : rule__SingleStatement__Group__0__Impl rule__SingleStatement__Group__1 ;
    public final void rule__SingleStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:792:1: ( rule__SingleStatement__Group__0__Impl rule__SingleStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:793:2: rule__SingleStatement__Group__0__Impl rule__SingleStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__0__Impl_in_rule__SingleStatement__Group__01659);
            rule__SingleStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStatement__Group__1_in_rule__SingleStatement__Group__01662);
            rule__SingleStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__Group__0"


    // $ANTLR start "rule__SingleStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:800:1: rule__SingleStatement__Group__0__Impl : ( ( rule__SingleStatement__DesgnatorAssignment_0 ) ) ;
    public final void rule__SingleStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:804:1: ( ( ( rule__SingleStatement__DesgnatorAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:1: ( ( rule__SingleStatement__DesgnatorAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:1: ( ( rule__SingleStatement__DesgnatorAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:806:1: ( rule__SingleStatement__DesgnatorAssignment_0 )
            {
             before(grammarAccess.getSingleStatementAccess().getDesgnatorAssignment_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:807:1: ( rule__SingleStatement__DesgnatorAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:807:2: rule__SingleStatement__DesgnatorAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleStatement__DesgnatorAssignment_0_in_rule__SingleStatement__Group__0__Impl1689);
            rule__SingleStatement__DesgnatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStatementAccess().getDesgnatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__Group__0__Impl"


    // $ANTLR start "rule__SingleStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:817:1: rule__SingleStatement__Group__1 : rule__SingleStatement__Group__1__Impl rule__SingleStatement__Group__2 ;
    public final void rule__SingleStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:821:1: ( rule__SingleStatement__Group__1__Impl rule__SingleStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:822:2: rule__SingleStatement__Group__1__Impl rule__SingleStatement__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__1__Impl_in_rule__SingleStatement__Group__11719);
            rule__SingleStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStatement__Group__2_in_rule__SingleStatement__Group__11722);
            rule__SingleStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__Group__1"


    // $ANTLR start "rule__SingleStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:829:1: rule__SingleStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__SingleStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:833:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:834:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:834:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:835:1: '<-'
            {
             before(grammarAccess.getSingleStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__SingleStatement__Group__1__Impl1750); 
             after(grammarAccess.getSingleStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__Group__1__Impl"


    // $ANTLR start "rule__SingleStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:848:1: rule__SingleStatement__Group__2 : rule__SingleStatement__Group__2__Impl ;
    public final void rule__SingleStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:852:1: ( rule__SingleStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:853:2: rule__SingleStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__2__Impl_in_rule__SingleStatement__Group__21781);
            rule__SingleStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__Group__2"


    // $ANTLR start "rule__SingleStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:859:1: rule__SingleStatement__Group__2__Impl : ( ( rule__SingleStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SingleStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:863:1: ( ( ( rule__SingleStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:864:1: ( ( rule__SingleStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:864:1: ( ( rule__SingleStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:865:1: ( rule__SingleStatement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSingleStatementAccess().getExpressionAssignment_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:866:1: ( rule__SingleStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:866:2: rule__SingleStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__SingleStatement__ExpressionAssignment_2_in_rule__SingleStatement__Group__2__Impl1808);
            rule__SingleStatement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleStatementAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__Group__2__Impl"


    // $ANTLR start "rule__SelfStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:882:1: rule__SelfStatement__Group__0 : rule__SelfStatement__Group__0__Impl rule__SelfStatement__Group__1 ;
    public final void rule__SelfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:886:1: ( rule__SelfStatement__Group__0__Impl rule__SelfStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:887:2: rule__SelfStatement__Group__0__Impl rule__SelfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__0__Impl_in_rule__SelfStatement__Group__01844);
            rule__SelfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfStatement__Group__1_in_rule__SelfStatement__Group__01847);
            rule__SelfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfStatement__Group__0"


    // $ANTLR start "rule__SelfStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:894:1: rule__SelfStatement__Group__0__Impl : ( 'CurrentState' ) ;
    public final void rule__SelfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:898:1: ( ( 'CurrentState' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:899:1: ( 'CurrentState' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:899:1: ( 'CurrentState' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:900:1: 'CurrentState'
            {
             before(grammarAccess.getSelfStatementAccess().getCurrentStateKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__SelfStatement__Group__0__Impl1875); 
             after(grammarAccess.getSelfStatementAccess().getCurrentStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfStatement__Group__0__Impl"


    // $ANTLR start "rule__SelfStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:913:1: rule__SelfStatement__Group__1 : rule__SelfStatement__Group__1__Impl rule__SelfStatement__Group__2 ;
    public final void rule__SelfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:917:1: ( rule__SelfStatement__Group__1__Impl rule__SelfStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:918:2: rule__SelfStatement__Group__1__Impl rule__SelfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__1__Impl_in_rule__SelfStatement__Group__11906);
            rule__SelfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfStatement__Group__2_in_rule__SelfStatement__Group__11909);
            rule__SelfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfStatement__Group__1"


    // $ANTLR start "rule__SelfStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:925:1: rule__SelfStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__SelfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:929:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:930:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:930:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:931:1: '<-'
            {
             before(grammarAccess.getSelfStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__SelfStatement__Group__1__Impl1937); 
             after(grammarAccess.getSelfStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfStatement__Group__1__Impl"


    // $ANTLR start "rule__SelfStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:944:1: rule__SelfStatement__Group__2 : rule__SelfStatement__Group__2__Impl ;
    public final void rule__SelfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:948:1: ( rule__SelfStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:949:2: rule__SelfStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__2__Impl_in_rule__SelfStatement__Group__21968);
            rule__SelfStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfStatement__Group__2"


    // $ANTLR start "rule__SelfStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:955:1: rule__SelfStatement__Group__2__Impl : ( ( rule__SelfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SelfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:959:1: ( ( ( rule__SelfStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:960:1: ( ( rule__SelfStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:960:1: ( ( rule__SelfStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:961:1: ( rule__SelfStatement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSelfStatementAccess().getExpressionAssignment_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:962:1: ( rule__SelfStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:962:2: rule__SelfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__SelfStatement__ExpressionAssignment_2_in_rule__SelfStatement__Group__2__Impl1995);
            rule__SelfStatement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelfStatementAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfStatement__Group__2__Impl"


    // $ANTLR start "rule__MultiStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:978:1: rule__MultiStatement__Group__0 : rule__MultiStatement__Group__0__Impl rule__MultiStatement__Group__1 ;
    public final void rule__MultiStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:982:1: ( rule__MultiStatement__Group__0__Impl rule__MultiStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:983:2: rule__MultiStatement__Group__0__Impl rule__MultiStatement__Group__1
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__0__Impl_in_rule__MultiStatement__Group__02031);
            rule__MultiStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiStatement__Group__1_in_rule__MultiStatement__Group__02034);
            rule__MultiStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__0"


    // $ANTLR start "rule__MultiStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:990:1: rule__MultiStatement__Group__0__Impl : ( ( rule__MultiStatement__DesgnatorAssignment_0 ) ) ;
    public final void rule__MultiStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:994:1: ( ( ( rule__MultiStatement__DesgnatorAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:995:1: ( ( rule__MultiStatement__DesgnatorAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:995:1: ( ( rule__MultiStatement__DesgnatorAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:996:1: ( rule__MultiStatement__DesgnatorAssignment_0 )
            {
             before(grammarAccess.getMultiStatementAccess().getDesgnatorAssignment_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:997:1: ( rule__MultiStatement__DesgnatorAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:997:2: rule__MultiStatement__DesgnatorAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiStatement__DesgnatorAssignment_0_in_rule__MultiStatement__Group__0__Impl2061);
            rule__MultiStatement__DesgnatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiStatementAccess().getDesgnatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__0__Impl"


    // $ANTLR start "rule__MultiStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1007:1: rule__MultiStatement__Group__1 : rule__MultiStatement__Group__1__Impl rule__MultiStatement__Group__2 ;
    public final void rule__MultiStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1011:1: ( rule__MultiStatement__Group__1__Impl rule__MultiStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1012:2: rule__MultiStatement__Group__1__Impl rule__MultiStatement__Group__2
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__1__Impl_in_rule__MultiStatement__Group__12091);
            rule__MultiStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiStatement__Group__2_in_rule__MultiStatement__Group__12094);
            rule__MultiStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__1"


    // $ANTLR start "rule__MultiStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1019:1: rule__MultiStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MultiStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1023:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1024:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1024:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1025:1: '('
            {
             before(grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__MultiStatement__Group__1__Impl2122); 
             after(grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__1__Impl"


    // $ANTLR start "rule__MultiStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1038:1: rule__MultiStatement__Group__2 : rule__MultiStatement__Group__2__Impl rule__MultiStatement__Group__3 ;
    public final void rule__MultiStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1042:1: ( rule__MultiStatement__Group__2__Impl rule__MultiStatement__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1043:2: rule__MultiStatement__Group__2__Impl rule__MultiStatement__Group__3
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__2__Impl_in_rule__MultiStatement__Group__22153);
            rule__MultiStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiStatement__Group__3_in_rule__MultiStatement__Group__22156);
            rule__MultiStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__2"


    // $ANTLR start "rule__MultiStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1050:1: rule__MultiStatement__Group__2__Impl : ( ( rule__MultiStatement__ExpressionsAssignment_2 )* ) ;
    public final void rule__MultiStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1054:1: ( ( ( rule__MultiStatement__ExpressionsAssignment_2 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1055:1: ( ( rule__MultiStatement__ExpressionsAssignment_2 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1055:1: ( ( rule__MultiStatement__ExpressionsAssignment_2 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1056:1: ( rule__MultiStatement__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getMultiStatementAccess().getExpressionsAssignment_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1057:1: ( rule__MultiStatement__ExpressionsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)||LA8_0==24||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1057:2: rule__MultiStatement__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MultiStatement__ExpressionsAssignment_2_in_rule__MultiStatement__Group__2__Impl2183);
            	    rule__MultiStatement__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMultiStatementAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__2__Impl"


    // $ANTLR start "rule__MultiStatement__Group__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1067:1: rule__MultiStatement__Group__3 : rule__MultiStatement__Group__3__Impl ;
    public final void rule__MultiStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1071:1: ( rule__MultiStatement__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1072:2: rule__MultiStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__3__Impl_in_rule__MultiStatement__Group__32214);
            rule__MultiStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__3"


    // $ANTLR start "rule__MultiStatement__Group__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1078:1: rule__MultiStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MultiStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1082:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1083:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1083:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1084:1: ')'
            {
             before(grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__MultiStatement__Group__3__Impl2242); 
             after(grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__Group__3__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1105:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1109:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1110:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02281);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02284);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1117:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1121:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1122:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1122:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1123:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2311);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1134:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1138:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1139:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12340);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1145:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1149:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1150:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1150:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1151:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1152:1: ( rule__OrExpression__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1152:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2367);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1166:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1170:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1171:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02402);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02405);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1178:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1182:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1183:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1183:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1184:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1185:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1187:1: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1197:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1201:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1202:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12463);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12466);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1209:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OpAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1213:1: ( ( ( rule__OrExpression__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1214:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1214:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1215:1: ( rule__OrExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1216:1: ( rule__OrExpression__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1216:2: rule__OrExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__OpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2493);
            rule__OrExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1226:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1230:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1231:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22523);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1237:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1241:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1242:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1242:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1243:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1244:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1244:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2550);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1260:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1264:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1265:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02586);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02589);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1272:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1276:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1277:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1277:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1278:1: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl2616);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1289:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1293:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1294:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12645);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1300:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1304:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1305:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1305:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1306:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1307:1: ( rule__AndExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1307:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2672);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1321:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1325:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1326:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__02707);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__02710);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1333:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1337:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1338:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1338:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1339:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1340:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1342:1: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1352:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1356:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1357:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__12768);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__12771);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1364:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1368:1: ( ( ( rule__AndExpression__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1369:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1369:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1370:1: ( rule__AndExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1371:1: ( rule__AndExpression__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1371:2: rule__AndExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__OpAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl2798);
            rule__AndExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1381:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1385:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1386:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__22828);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1392:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1396:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1397:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1397:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1398:1: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1399:1: ( rule__AndExpression__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1399:2: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl2855);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1415:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1419:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1420:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__02891);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__02894);
            rule__EqualityExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1427:1: rule__EqualityExpression__Group__0__Impl : ( ruleDashOperation ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1431:1: ( ( ruleDashOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1432:1: ( ruleDashOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1432:1: ( ruleDashOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1433:1: ruleDashOperation
            {
             before(grammarAccess.getEqualityExpressionAccess().getDashOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDashOperation_in_rule__EqualityExpression__Group__0__Impl2921);
            ruleDashOperation();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getDashOperationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1444:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1448:1: ( rule__EqualityExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1449:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__12950);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1455:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1459:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1460:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1460:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1461:1: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1462:1: ( rule__EqualityExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1462:2: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl2977);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1476:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1480:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1481:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__03012);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__03015);
            rule__EqualityExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1488:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1492:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1493:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1493:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1494:1: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1495:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1497:1: 
            {
            }

             after(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1507:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1511:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1512:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__13073);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__2_in_rule__EqualityExpression__Group_1__13076);
            rule__EqualityExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1519:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OpAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1523:1: ( ( ( rule__EqualityExpression__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1524:1: ( ( rule__EqualityExpression__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1524:1: ( ( rule__EqualityExpression__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1525:1: ( rule__EqualityExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1526:1: ( rule__EqualityExpression__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1526:2: rule__EqualityExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl3103);
            rule__EqualityExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1536:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1540:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1541:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__2__Impl_in_rule__EqualityExpression__Group_1__23133);
            rule__EqualityExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__2"


    // $ANTLR start "rule__EqualityExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1547:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1551:1: ( ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1552:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1552:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1553:1: ( rule__EqualityExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1554:1: ( rule__EqualityExpression__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1554:2: rule__EqualityExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EqualityExpression__RightAssignment_1_2_in_rule__EqualityExpression__Group_1__2__Impl3160);
            rule__EqualityExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__DashOperation__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1570:1: rule__DashOperation__Group__0 : rule__DashOperation__Group__0__Impl rule__DashOperation__Group__1 ;
    public final void rule__DashOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1574:1: ( rule__DashOperation__Group__0__Impl rule__DashOperation__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1575:2: rule__DashOperation__Group__0__Impl rule__DashOperation__Group__1
            {
            pushFollow(FOLLOW_rule__DashOperation__Group__0__Impl_in_rule__DashOperation__Group__03196);
            rule__DashOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DashOperation__Group__1_in_rule__DashOperation__Group__03199);
            rule__DashOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group__0"


    // $ANTLR start "rule__DashOperation__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1582:1: rule__DashOperation__Group__0__Impl : ( rulePointOperation ) ;
    public final void rule__DashOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1586:1: ( ( rulePointOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1587:1: ( rulePointOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1587:1: ( rulePointOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1588:1: rulePointOperation
            {
             before(grammarAccess.getDashOperationAccess().getPointOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePointOperation_in_rule__DashOperation__Group__0__Impl3226);
            rulePointOperation();

            state._fsp--;

             after(grammarAccess.getDashOperationAccess().getPointOperationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group__0__Impl"


    // $ANTLR start "rule__DashOperation__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1599:1: rule__DashOperation__Group__1 : rule__DashOperation__Group__1__Impl ;
    public final void rule__DashOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1603:1: ( rule__DashOperation__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1604:2: rule__DashOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DashOperation__Group__1__Impl_in_rule__DashOperation__Group__13255);
            rule__DashOperation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group__1"


    // $ANTLR start "rule__DashOperation__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1610:1: rule__DashOperation__Group__1__Impl : ( ( rule__DashOperation__Group_1__0 )* ) ;
    public final void rule__DashOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1614:1: ( ( ( rule__DashOperation__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1615:1: ( ( rule__DashOperation__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1615:1: ( ( rule__DashOperation__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1616:1: ( rule__DashOperation__Group_1__0 )*
            {
             before(grammarAccess.getDashOperationAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1617:1: ( rule__DashOperation__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=18 && LA12_0<=19)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1617:2: rule__DashOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DashOperation__Group_1__0_in_rule__DashOperation__Group__1__Impl3282);
            	    rule__DashOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDashOperationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group__1__Impl"


    // $ANTLR start "rule__DashOperation__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1631:1: rule__DashOperation__Group_1__0 : rule__DashOperation__Group_1__0__Impl rule__DashOperation__Group_1__1 ;
    public final void rule__DashOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1635:1: ( rule__DashOperation__Group_1__0__Impl rule__DashOperation__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1636:2: rule__DashOperation__Group_1__0__Impl rule__DashOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__DashOperation__Group_1__0__Impl_in_rule__DashOperation__Group_1__03317);
            rule__DashOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DashOperation__Group_1__1_in_rule__DashOperation__Group_1__03320);
            rule__DashOperation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group_1__0"


    // $ANTLR start "rule__DashOperation__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1643:1: rule__DashOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__DashOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1647:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1648:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1648:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1649:1: ()
            {
             before(grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1650:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1652:1: 
            {
            }

             after(grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group_1__0__Impl"


    // $ANTLR start "rule__DashOperation__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1662:1: rule__DashOperation__Group_1__1 : rule__DashOperation__Group_1__1__Impl rule__DashOperation__Group_1__2 ;
    public final void rule__DashOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1666:1: ( rule__DashOperation__Group_1__1__Impl rule__DashOperation__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1667:2: rule__DashOperation__Group_1__1__Impl rule__DashOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__DashOperation__Group_1__1__Impl_in_rule__DashOperation__Group_1__13378);
            rule__DashOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DashOperation__Group_1__2_in_rule__DashOperation__Group_1__13381);
            rule__DashOperation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group_1__1"


    // $ANTLR start "rule__DashOperation__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1674:1: rule__DashOperation__Group_1__1__Impl : ( ( rule__DashOperation__OpAssignment_1_1 ) ) ;
    public final void rule__DashOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1678:1: ( ( ( rule__DashOperation__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1679:1: ( ( rule__DashOperation__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1679:1: ( ( rule__DashOperation__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1680:1: ( rule__DashOperation__OpAssignment_1_1 )
            {
             before(grammarAccess.getDashOperationAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1681:1: ( rule__DashOperation__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1681:2: rule__DashOperation__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DashOperation__OpAssignment_1_1_in_rule__DashOperation__Group_1__1__Impl3408);
            rule__DashOperation__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group_1__1__Impl"


    // $ANTLR start "rule__DashOperation__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1691:1: rule__DashOperation__Group_1__2 : rule__DashOperation__Group_1__2__Impl ;
    public final void rule__DashOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1695:1: ( rule__DashOperation__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1696:2: rule__DashOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DashOperation__Group_1__2__Impl_in_rule__DashOperation__Group_1__23438);
            rule__DashOperation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group_1__2"


    // $ANTLR start "rule__DashOperation__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1702:1: rule__DashOperation__Group_1__2__Impl : ( ( rule__DashOperation__RightAssignment_1_2 ) ) ;
    public final void rule__DashOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1706:1: ( ( ( rule__DashOperation__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1707:1: ( ( rule__DashOperation__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1707:1: ( ( rule__DashOperation__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1708:1: ( rule__DashOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getDashOperationAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1709:1: ( rule__DashOperation__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1709:2: rule__DashOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DashOperation__RightAssignment_1_2_in_rule__DashOperation__Group_1__2__Impl3465);
            rule__DashOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group_1__2__Impl"


    // $ANTLR start "rule__PointOperation__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1725:1: rule__PointOperation__Group__0 : rule__PointOperation__Group__0__Impl rule__PointOperation__Group__1 ;
    public final void rule__PointOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1729:1: ( rule__PointOperation__Group__0__Impl rule__PointOperation__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1730:2: rule__PointOperation__Group__0__Impl rule__PointOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PointOperation__Group__0__Impl_in_rule__PointOperation__Group__03501);
            rule__PointOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PointOperation__Group__1_in_rule__PointOperation__Group__03504);
            rule__PointOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group__0"


    // $ANTLR start "rule__PointOperation__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1737:1: rule__PointOperation__Group__0__Impl : ( rulePowOperation ) ;
    public final void rule__PointOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1741:1: ( ( rulePowOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1742:1: ( rulePowOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1742:1: ( rulePowOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1743:1: rulePowOperation
            {
             before(grammarAccess.getPointOperationAccess().getPowOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePowOperation_in_rule__PointOperation__Group__0__Impl3531);
            rulePowOperation();

            state._fsp--;

             after(grammarAccess.getPointOperationAccess().getPowOperationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group__0__Impl"


    // $ANTLR start "rule__PointOperation__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1754:1: rule__PointOperation__Group__1 : rule__PointOperation__Group__1__Impl ;
    public final void rule__PointOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1758:1: ( rule__PointOperation__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1759:2: rule__PointOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PointOperation__Group__1__Impl_in_rule__PointOperation__Group__13560);
            rule__PointOperation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group__1"


    // $ANTLR start "rule__PointOperation__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1765:1: rule__PointOperation__Group__1__Impl : ( ( rule__PointOperation__Group_1__0 )* ) ;
    public final void rule__PointOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1769:1: ( ( ( rule__PointOperation__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1770:1: ( ( rule__PointOperation__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1770:1: ( ( rule__PointOperation__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1771:1: ( rule__PointOperation__Group_1__0 )*
            {
             before(grammarAccess.getPointOperationAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1772:1: ( rule__PointOperation__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=20 && LA13_0<=21)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1772:2: rule__PointOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PointOperation__Group_1__0_in_rule__PointOperation__Group__1__Impl3587);
            	    rule__PointOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPointOperationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group__1__Impl"


    // $ANTLR start "rule__PointOperation__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1786:1: rule__PointOperation__Group_1__0 : rule__PointOperation__Group_1__0__Impl rule__PointOperation__Group_1__1 ;
    public final void rule__PointOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1790:1: ( rule__PointOperation__Group_1__0__Impl rule__PointOperation__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1791:2: rule__PointOperation__Group_1__0__Impl rule__PointOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__PointOperation__Group_1__0__Impl_in_rule__PointOperation__Group_1__03622);
            rule__PointOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PointOperation__Group_1__1_in_rule__PointOperation__Group_1__03625);
            rule__PointOperation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group_1__0"


    // $ANTLR start "rule__PointOperation__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1798:1: rule__PointOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PointOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1802:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1803:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1803:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1804:1: ()
            {
             before(grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1805:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1807:1: 
            {
            }

             after(grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group_1__0__Impl"


    // $ANTLR start "rule__PointOperation__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1817:1: rule__PointOperation__Group_1__1 : rule__PointOperation__Group_1__1__Impl rule__PointOperation__Group_1__2 ;
    public final void rule__PointOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1821:1: ( rule__PointOperation__Group_1__1__Impl rule__PointOperation__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1822:2: rule__PointOperation__Group_1__1__Impl rule__PointOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__PointOperation__Group_1__1__Impl_in_rule__PointOperation__Group_1__13683);
            rule__PointOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PointOperation__Group_1__2_in_rule__PointOperation__Group_1__13686);
            rule__PointOperation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group_1__1"


    // $ANTLR start "rule__PointOperation__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1829:1: rule__PointOperation__Group_1__1__Impl : ( ( rule__PointOperation__OpAssignment_1_1 ) ) ;
    public final void rule__PointOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1833:1: ( ( ( rule__PointOperation__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1834:1: ( ( rule__PointOperation__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1834:1: ( ( rule__PointOperation__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1835:1: ( rule__PointOperation__OpAssignment_1_1 )
            {
             before(grammarAccess.getPointOperationAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1836:1: ( rule__PointOperation__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1836:2: rule__PointOperation__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PointOperation__OpAssignment_1_1_in_rule__PointOperation__Group_1__1__Impl3713);
            rule__PointOperation__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group_1__1__Impl"


    // $ANTLR start "rule__PointOperation__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1846:1: rule__PointOperation__Group_1__2 : rule__PointOperation__Group_1__2__Impl ;
    public final void rule__PointOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1850:1: ( rule__PointOperation__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1851:2: rule__PointOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PointOperation__Group_1__2__Impl_in_rule__PointOperation__Group_1__23743);
            rule__PointOperation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group_1__2"


    // $ANTLR start "rule__PointOperation__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1857:1: rule__PointOperation__Group_1__2__Impl : ( ( rule__PointOperation__RightAssignment_1_2 ) ) ;
    public final void rule__PointOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1861:1: ( ( ( rule__PointOperation__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1862:1: ( ( rule__PointOperation__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1862:1: ( ( rule__PointOperation__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1863:1: ( rule__PointOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getPointOperationAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1864:1: ( rule__PointOperation__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1864:2: rule__PointOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PointOperation__RightAssignment_1_2_in_rule__PointOperation__Group_1__2__Impl3770);
            rule__PointOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group_1__2__Impl"


    // $ANTLR start "rule__PowOperation__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1880:1: rule__PowOperation__Group__0 : rule__PowOperation__Group__0__Impl rule__PowOperation__Group__1 ;
    public final void rule__PowOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1884:1: ( rule__PowOperation__Group__0__Impl rule__PowOperation__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1885:2: rule__PowOperation__Group__0__Impl rule__PowOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PowOperation__Group__0__Impl_in_rule__PowOperation__Group__03806);
            rule__PowOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowOperation__Group__1_in_rule__PowOperation__Group__03809);
            rule__PowOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group__0"


    // $ANTLR start "rule__PowOperation__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1892:1: rule__PowOperation__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__PowOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1896:1: ( ( rulePrimaryExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1897:1: ( rulePrimaryExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1897:1: ( rulePrimaryExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1898:1: rulePrimaryExpression
            {
             before(grammarAccess.getPowOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__PowOperation__Group__0__Impl3836);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPowOperationAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group__0__Impl"


    // $ANTLR start "rule__PowOperation__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1909:1: rule__PowOperation__Group__1 : rule__PowOperation__Group__1__Impl ;
    public final void rule__PowOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1913:1: ( rule__PowOperation__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1914:2: rule__PowOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PowOperation__Group__1__Impl_in_rule__PowOperation__Group__13865);
            rule__PowOperation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group__1"


    // $ANTLR start "rule__PowOperation__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1920:1: rule__PowOperation__Group__1__Impl : ( ( rule__PowOperation__Group_1__0 )* ) ;
    public final void rule__PowOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1924:1: ( ( ( rule__PowOperation__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1925:1: ( ( rule__PowOperation__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1925:1: ( ( rule__PowOperation__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1926:1: ( rule__PowOperation__Group_1__0 )*
            {
             before(grammarAccess.getPowOperationAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1927:1: ( rule__PowOperation__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1927:2: rule__PowOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PowOperation__Group_1__0_in_rule__PowOperation__Group__1__Impl3892);
            	    rule__PowOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPowOperationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group__1__Impl"


    // $ANTLR start "rule__PowOperation__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1941:1: rule__PowOperation__Group_1__0 : rule__PowOperation__Group_1__0__Impl rule__PowOperation__Group_1__1 ;
    public final void rule__PowOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1945:1: ( rule__PowOperation__Group_1__0__Impl rule__PowOperation__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1946:2: rule__PowOperation__Group_1__0__Impl rule__PowOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__PowOperation__Group_1__0__Impl_in_rule__PowOperation__Group_1__03927);
            rule__PowOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowOperation__Group_1__1_in_rule__PowOperation__Group_1__03930);
            rule__PowOperation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group_1__0"


    // $ANTLR start "rule__PowOperation__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1953:1: rule__PowOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PowOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1957:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1958:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1958:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1959:1: ()
            {
             before(grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1960:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1962:1: 
            {
            }

             after(grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group_1__0__Impl"


    // $ANTLR start "rule__PowOperation__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1972:1: rule__PowOperation__Group_1__1 : rule__PowOperation__Group_1__1__Impl rule__PowOperation__Group_1__2 ;
    public final void rule__PowOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1976:1: ( rule__PowOperation__Group_1__1__Impl rule__PowOperation__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1977:2: rule__PowOperation__Group_1__1__Impl rule__PowOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__PowOperation__Group_1__1__Impl_in_rule__PowOperation__Group_1__13988);
            rule__PowOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowOperation__Group_1__2_in_rule__PowOperation__Group_1__13991);
            rule__PowOperation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group_1__1"


    // $ANTLR start "rule__PowOperation__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1984:1: rule__PowOperation__Group_1__1__Impl : ( ( rule__PowOperation__OpAssignment_1_1 ) ) ;
    public final void rule__PowOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1988:1: ( ( ( rule__PowOperation__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1989:1: ( ( rule__PowOperation__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1989:1: ( ( rule__PowOperation__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1990:1: ( rule__PowOperation__OpAssignment_1_1 )
            {
             before(grammarAccess.getPowOperationAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1991:1: ( rule__PowOperation__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1991:2: rule__PowOperation__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PowOperation__OpAssignment_1_1_in_rule__PowOperation__Group_1__1__Impl4018);
            rule__PowOperation__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPowOperationAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group_1__1__Impl"


    // $ANTLR start "rule__PowOperation__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2001:1: rule__PowOperation__Group_1__2 : rule__PowOperation__Group_1__2__Impl ;
    public final void rule__PowOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2005:1: ( rule__PowOperation__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2006:2: rule__PowOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PowOperation__Group_1__2__Impl_in_rule__PowOperation__Group_1__24048);
            rule__PowOperation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group_1__2"


    // $ANTLR start "rule__PowOperation__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2012:1: rule__PowOperation__Group_1__2__Impl : ( ( rule__PowOperation__RightAssignment_1_2 ) ) ;
    public final void rule__PowOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2016:1: ( ( ( rule__PowOperation__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2017:1: ( ( rule__PowOperation__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2017:1: ( ( rule__PowOperation__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2018:1: ( rule__PowOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getPowOperationAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2019:1: ( rule__PowOperation__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2019:2: rule__PowOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PowOperation__RightAssignment_1_2_in_rule__PowOperation__Group_1__2__Impl4075);
            rule__PowOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPowOperationAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2035:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2039:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2040:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__04111);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__04114);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2047:1: rule__PrimaryExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2051:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2052:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2052:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2053:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__PrimaryExpression__Group_1__0__Impl4142); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2066:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2070:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2071:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__14173);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__14176);
            rule__PrimaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2078:1: rule__PrimaryExpression__Group_1__1__Impl : ( ruleEvaluationExpression ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2082:1: ( ( ruleEvaluationExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2083:1: ( ruleEvaluationExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2083:1: ( ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2084:1: ruleEvaluationExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_1__1__Impl4203);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2095:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2099:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2100:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__24232);
            rule__PrimaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2106:1: rule__PrimaryExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2110:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2111:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2111:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2112:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,25,FOLLOW_25_in_rule__PrimaryExpression__Group_1__2__Impl4260); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2131:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2135:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2136:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__04297);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__04300);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2143:1: rule__PrimaryExpression__Group_2__0__Impl : ( 'NOT (' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2147:1: ( ( 'NOT (' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2148:1: ( 'NOT (' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2148:1: ( 'NOT (' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2149:1: 'NOT ('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__PrimaryExpression__Group_2__0__Impl4328); 
             after(grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2162:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2166:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2167:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__14359);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__14362);
            rule__PrimaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2174:1: rule__PrimaryExpression__Group_2__1__Impl : ( ruleEvaluationExpression ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2178:1: ( ( ruleEvaluationExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2179:1: ( ruleEvaluationExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2179:1: ( ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2180:1: ruleEvaluationExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_2__1__Impl4389);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2191:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2195:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2196:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__24418);
            rule__PrimaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2202:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2206:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2207:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2207:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2208:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_25_in_rule__PrimaryExpression__Group_2__2__Impl4446); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2227:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2231:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2232:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04483);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04486);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2239:1: rule__Term__Group_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2243:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2244:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2244:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2245:1: ()
            {
             before(grammarAccess.getTermAccess().getStringValueAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2246:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2248:1: 
            {
            }

             after(grammarAccess.getTermAccess().getStringValueAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2258:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2262:1: ( rule__Term__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2263:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14544);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2269:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__ValueAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2273:1: ( ( ( rule__Term__ValueAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2274:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2274:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2275:1: ( rule__Term__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getValueAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2276:1: ( rule__Term__ValueAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2276:2: rule__Term__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl4571);
            rule__Term__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2290:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2294:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2295:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__04605);
            rule__Term__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__04608);
            rule__Term__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0"


    // $ANTLR start "rule__Term__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2302:1: rule__Term__Group_2__0__Impl : ( () ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2306:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2307:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2307:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2308:1: ()
            {
             before(grammarAccess.getTermAccess().getIntegerValueAction_2_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2309:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2311:1: 
            {
            }

             after(grammarAccess.getTermAccess().getIntegerValueAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0__Impl"


    // $ANTLR start "rule__Term__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2321:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2325:1: ( rule__Term__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2326:2: rule__Term__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__14666);
            rule__Term__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__1"


    // $ANTLR start "rule__Term__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2332:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__ValueAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2336:1: ( ( ( rule__Term__ValueAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2337:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2337:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2338:1: ( rule__Term__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTermAccess().getValueAssignment_2_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2339:1: ( rule__Term__ValueAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2339:2: rule__Term__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl4693);
            rule__Term__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__1__Impl"


    // $ANTLR start "rule__Term__Group_3__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2353:1: rule__Term__Group_3__0 : rule__Term__Group_3__0__Impl rule__Term__Group_3__1 ;
    public final void rule__Term__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2357:1: ( rule__Term__Group_3__0__Impl rule__Term__Group_3__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2358:2: rule__Term__Group_3__0__Impl rule__Term__Group_3__1
            {
            pushFollow(FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__04727);
            rule__Term__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__04730);
            rule__Term__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__0"


    // $ANTLR start "rule__Term__Group_3__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2365:1: rule__Term__Group_3__0__Impl : ( () ) ;
    public final void rule__Term__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2369:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2370:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2370:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2371:1: ()
            {
             before(grammarAccess.getTermAccess().getDoubleValueAction_3_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2372:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2374:1: 
            {
            }

             after(grammarAccess.getTermAccess().getDoubleValueAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__0__Impl"


    // $ANTLR start "rule__Term__Group_3__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2384:1: rule__Term__Group_3__1 : rule__Term__Group_3__1__Impl ;
    public final void rule__Term__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2388:1: ( rule__Term__Group_3__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2389:2: rule__Term__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__14788);
            rule__Term__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__1"


    // $ANTLR start "rule__Term__Group_3__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2395:1: rule__Term__Group_3__1__Impl : ( ( rule__Term__ValueAssignment_3_1 ) ) ;
    public final void rule__Term__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2399:1: ( ( ( rule__Term__ValueAssignment_3_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2400:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2400:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2401:1: ( rule__Term__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTermAccess().getValueAssignment_3_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2402:1: ( rule__Term__ValueAssignment_3_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2402:2: rule__Term__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl4815);
            rule__Term__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__1__Impl"


    // $ANTLR start "rule__Model__PhraseAssignment"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2417:1: rule__Model__PhraseAssignment : ( rulePhrase ) ;
    public final void rule__Model__PhraseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2421:1: ( ( rulePhrase ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2422:1: ( rulePhrase )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2422:1: ( rulePhrase )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2423:1: rulePhrase
            {
             before(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment4854);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PhraseAssignment"


    // $ANTLR start "rule__SingleStatement__DesgnatorAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2432:1: rule__SingleStatement__DesgnatorAssignment_0 : ( ruleDesignator ) ;
    public final void rule__SingleStatement__DesgnatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2436:1: ( ( ruleDesignator ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2437:1: ( ruleDesignator )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2437:1: ( ruleDesignator )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2438:1: ruleDesignator
            {
             before(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDesignator_in_rule__SingleStatement__DesgnatorAssignment_04885);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__DesgnatorAssignment_0"


    // $ANTLR start "rule__SingleStatement__ExpressionAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2447:1: rule__SingleStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__SingleStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2451:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2452:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2452:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2453:1: ruleExpression
            {
             before(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SingleStatement__ExpressionAssignment_24916);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__SelfStatement__ExpressionAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2462:1: rule__SelfStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__SelfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2466:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2467:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2467:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2468:1: ruleExpression
            {
             before(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SelfStatement__ExpressionAssignment_24947);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__MultiStatement__DesgnatorAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2477:1: rule__MultiStatement__DesgnatorAssignment_0 : ( ruleDesignator ) ;
    public final void rule__MultiStatement__DesgnatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2481:1: ( ( ruleDesignator ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2482:1: ( ruleDesignator )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2482:1: ( ruleDesignator )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2483:1: ruleDesignator
            {
             before(grammarAccess.getMultiStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDesignator_in_rule__MultiStatement__DesgnatorAssignment_04978);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getMultiStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__DesgnatorAssignment_0"


    // $ANTLR start "rule__MultiStatement__ExpressionsAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2492:1: rule__MultiStatement__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__MultiStatement__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2496:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2497:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2497:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2498:1: ruleExpression
            {
             before(grammarAccess.getMultiStatementAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__MultiStatement__ExpressionsAssignment_25009);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMultiStatementAccess().getExpressionsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiStatement__ExpressionsAssignment_2"


    // $ANTLR start "rule__OrExpression__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2507:1: rule__OrExpression__OpAssignment_1_1 : ( ( 'OR' ) ) ;
    public final void rule__OrExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2511:1: ( ( ( 'OR' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2512:1: ( ( 'OR' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2512:1: ( ( 'OR' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2513:1: ( 'OR' )
            {
             before(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2514:1: ( 'OR' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2515:1: 'OR'
            {
             before(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__OrExpression__OpAssignment_1_15045); 
             after(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 

            }

             after(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OpAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2530:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2534:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2535:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2535:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2536:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_25084);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2545:1: rule__AndExpression__OpAssignment_1_1 : ( ( 'AND' ) ) ;
    public final void rule__AndExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2549:1: ( ( ( 'AND' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2550:1: ( ( 'AND' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2550:1: ( ( 'AND' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2551:1: ( 'AND' )
            {
             before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2552:1: ( 'AND' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2553:1: 'AND'
            {
             before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 
            match(input,28,FOLLOW_28_in_rule__AndExpression__OpAssignment_1_15120); 
             after(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 

            }

             after(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OpAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2568:1: rule__AndExpression__RightAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2572:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2573:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2573:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2574:1: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__RightAssignment_1_25159);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2583:1: rule__EqualityExpression__OpAssignment_1_1 : ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__EqualityExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2587:1: ( ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2588:1: ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2588:1: ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2589:1: ( rule__EqualityExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2590:1: ( rule__EqualityExpression__OpAlternatives_1_1_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2590:2: rule__EqualityExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAlternatives_1_1_0_in_rule__EqualityExpression__OpAssignment_1_15190);
            rule__EqualityExpression__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__OpAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2599:1: rule__EqualityExpression__RightAssignment_1_2 : ( ruleDashOperation ) ;
    public final void rule__EqualityExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2603:1: ( ( ruleDashOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2604:1: ( ruleDashOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2604:1: ( ruleDashOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2605:1: ruleDashOperation
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightDashOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDashOperation_in_rule__EqualityExpression__RightAssignment_1_25223);
            ruleDashOperation();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getRightDashOperationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__RightAssignment_1_2"


    // $ANTLR start "rule__DashOperation__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2614:1: rule__DashOperation__OpAssignment_1_1 : ( ( rule__DashOperation__OpAlternatives_1_1_0 ) ) ;
    public final void rule__DashOperation__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2618:1: ( ( ( rule__DashOperation__OpAlternatives_1_1_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2619:1: ( ( rule__DashOperation__OpAlternatives_1_1_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2619:1: ( ( rule__DashOperation__OpAlternatives_1_1_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2620:1: ( rule__DashOperation__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getDashOperationAccess().getOpAlternatives_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2621:1: ( rule__DashOperation__OpAlternatives_1_1_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2621:2: rule__DashOperation__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__DashOperation__OpAlternatives_1_1_0_in_rule__DashOperation__OpAssignment_1_15254);
            rule__DashOperation__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__OpAssignment_1_1"


    // $ANTLR start "rule__DashOperation__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2630:1: rule__DashOperation__RightAssignment_1_2 : ( rulePointOperation ) ;
    public final void rule__DashOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2634:1: ( ( rulePointOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2635:1: ( rulePointOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2635:1: ( rulePointOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2636:1: rulePointOperation
            {
             before(grammarAccess.getDashOperationAccess().getRightPointOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePointOperation_in_rule__DashOperation__RightAssignment_1_25287);
            rulePointOperation();

            state._fsp--;

             after(grammarAccess.getDashOperationAccess().getRightPointOperationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__RightAssignment_1_2"


    // $ANTLR start "rule__PointOperation__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2645:1: rule__PointOperation__OpAssignment_1_1 : ( ( rule__PointOperation__OpAlternatives_1_1_0 ) ) ;
    public final void rule__PointOperation__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2649:1: ( ( ( rule__PointOperation__OpAlternatives_1_1_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2650:1: ( ( rule__PointOperation__OpAlternatives_1_1_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2650:1: ( ( rule__PointOperation__OpAlternatives_1_1_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2651:1: ( rule__PointOperation__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getPointOperationAccess().getOpAlternatives_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2652:1: ( rule__PointOperation__OpAlternatives_1_1_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2652:2: rule__PointOperation__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__PointOperation__OpAlternatives_1_1_0_in_rule__PointOperation__OpAssignment_1_15318);
            rule__PointOperation__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__OpAssignment_1_1"


    // $ANTLR start "rule__PointOperation__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2661:1: rule__PointOperation__RightAssignment_1_2 : ( rulePowOperation ) ;
    public final void rule__PointOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2665:1: ( ( rulePowOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2666:1: ( rulePowOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2666:1: ( rulePowOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2667:1: rulePowOperation
            {
             before(grammarAccess.getPointOperationAccess().getRightPowOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePowOperation_in_rule__PointOperation__RightAssignment_1_25351);
            rulePowOperation();

            state._fsp--;

             after(grammarAccess.getPointOperationAccess().getRightPowOperationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__RightAssignment_1_2"


    // $ANTLR start "rule__PowOperation__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2676:1: rule__PowOperation__OpAssignment_1_1 : ( ( '^' ) ) ;
    public final void rule__PowOperation__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2680:1: ( ( ( '^' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2681:1: ( ( '^' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2681:1: ( ( '^' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2682:1: ( '^' )
            {
             before(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2683:1: ( '^' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2684:1: '^'
            {
             before(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            match(input,29,FOLLOW_29_in_rule__PowOperation__OpAssignment_1_15387); 
             after(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 

            }

             after(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__OpAssignment_1_1"


    // $ANTLR start "rule__PowOperation__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2699:1: rule__PowOperation__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PowOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2703:1: ( ( rulePrimaryExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2704:1: ( rulePrimaryExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2704:1: ( rulePrimaryExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2705:1: rulePrimaryExpression
            {
             before(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__PowOperation__RightAssignment_1_25426);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__RightAssignment_1_2"


    // $ANTLR start "rule__Term__ValueAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2714:1: rule__Term__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Term__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2718:1: ( ( RULE_STRING ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2719:1: ( RULE_STRING )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2719:1: ( RULE_STRING )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2720:1: RULE_STRING
            {
             before(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_15457); 
             after(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__ValueAssignment_1_1"


    // $ANTLR start "rule__Term__ValueAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2729:1: rule__Term__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Term__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2733:1: ( ( RULE_INT ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2734:1: ( RULE_INT )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2734:1: ( RULE_INT )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2735:1: RULE_INT
            {
             before(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_15488); 
             after(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__ValueAssignment_2_1"


    // $ANTLR start "rule__Term__ValueAssignment_3_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2744:1: rule__Term__ValueAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Term__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2748:1: ( ( RULE_DOUBLE ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2749:1: ( RULE_DOUBLE )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2749:1: ( RULE_DOUBLE )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2750:1: RULE_DOUBLE
            {
             before(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_15519); 
             after(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__ValueAssignment_3_1"


    // $ANTLR start "rule__Designator__ValueAssignment"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2759:1: rule__Designator__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Designator__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2763:1: ( ( ( RULE_ID ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2764:1: ( ( RULE_ID ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2764:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2765:1: ( RULE_ID )
            {
             before(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2766:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2767:1: RULE_ID
            {
             before(grammarAccess.getDesignatorAccess().getValueEObjectIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Designator__ValueAssignment5554); 
             after(grammarAccess.getDesignatorAccess().getValueEObjectIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Designator__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PhraseAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phrase__Alternatives_in_rulePhrase154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_ruleExpression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpression247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleEvaluationExpression273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStatement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__0_in_ruleSingleStatement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfStatement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__0_in_ruleSelfStatement452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiStatement486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__0_in_ruleMultiStatement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_entryRuleDashOperation719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDashOperation726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__0_in_ruleDashOperation752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_entryRulePointOperation779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointOperation786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__0_in_rulePointOperation812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_entryRulePowOperation839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowOperation846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__0_in_rulePowOperation872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleUnaryExpression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Phrase__Alternatives1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_rule__Statement__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_rule__Statement__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_rule__Statement__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_1_1_01263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_1_1_01283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_1_1_01303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_1_1_01323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_1_1_01343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_1_1_01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DashOperation__OpAlternatives_1_1_01398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DashOperation__OpAlternatives_1_1_01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PointOperation__OpAlternatives_1_1_01453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PointOperation__OpAlternatives_1_1_01473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__Term__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__0__Impl_in_rule__SingleStatement__Group__01659 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__1_in_rule__SingleStatement__Group__01662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__DesgnatorAssignment_0_in_rule__SingleStatement__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__1__Impl_in_rule__SingleStatement__Group__11719 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__2_in_rule__SingleStatement__Group__11722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SingleStatement__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__2__Impl_in_rule__SingleStatement__Group__21781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__ExpressionAssignment_2_in_rule__SingleStatement__Group__2__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__0__Impl_in_rule__SelfStatement__Group__01844 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__1_in_rule__SelfStatement__Group__01847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SelfStatement__Group__0__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__1__Impl_in_rule__SelfStatement__Group__11906 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__2_in_rule__SelfStatement__Group__11909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SelfStatement__Group__1__Impl1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__2__Impl_in_rule__SelfStatement__Group__21968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__ExpressionAssignment_2_in_rule__SelfStatement__Group__2__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__0__Impl_in_rule__MultiStatement__Group__02031 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__1_in_rule__MultiStatement__Group__02034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__DesgnatorAssignment_0_in_rule__MultiStatement__Group__0__Impl2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__1__Impl_in_rule__MultiStatement__Group__12091 = new BitSet(new long[]{0x00000000070000F0L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__2_in_rule__MultiStatement__Group__12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MultiStatement__Group__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__2__Impl_in_rule__MultiStatement__Group__22153 = new BitSet(new long[]{0x00000000070000F0L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__3_in_rule__MultiStatement__Group__22156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__ExpressionsAssignment_2_in_rule__MultiStatement__Group__2__Impl2183 = new BitSet(new long[]{0x00000000050000F2L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__3__Impl_in_rule__MultiStatement__Group__32214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MultiStatement__Group__3__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02281 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2367 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02402 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12463 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02586 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2672 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__02707 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__02710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__12768 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__12771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OpAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__22828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__02891 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__02894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_rule__EqualityExpression__Group__0__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl2977 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__03012 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__03015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__13073 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__2_in_rule__EqualityExpression__Group_1__13076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__2__Impl_in_rule__EqualityExpression__Group_1__23133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__RightAssignment_1_2_in_rule__EqualityExpression__Group_1__2__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__0__Impl_in_rule__DashOperation__Group__03196 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__1_in_rule__DashOperation__Group__03199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_rule__DashOperation__Group__0__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__1__Impl_in_rule__DashOperation__Group__13255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__0_in_rule__DashOperation__Group__1__Impl3282 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__0__Impl_in_rule__DashOperation__Group_1__03317 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__1_in_rule__DashOperation__Group_1__03320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__1__Impl_in_rule__DashOperation__Group_1__13378 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__2_in_rule__DashOperation__Group_1__13381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__OpAssignment_1_1_in_rule__DashOperation__Group_1__1__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__2__Impl_in_rule__DashOperation__Group_1__23438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__RightAssignment_1_2_in_rule__DashOperation__Group_1__2__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__0__Impl_in_rule__PointOperation__Group__03501 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__1_in_rule__PointOperation__Group__03504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_rule__PointOperation__Group__0__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__1__Impl_in_rule__PointOperation__Group__13560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__0_in_rule__PointOperation__Group__1__Impl3587 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__0__Impl_in_rule__PointOperation__Group_1__03622 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__1_in_rule__PointOperation__Group_1__03625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__1__Impl_in_rule__PointOperation__Group_1__13683 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__2_in_rule__PointOperation__Group_1__13686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__OpAssignment_1_1_in_rule__PointOperation__Group_1__1__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__2__Impl_in_rule__PointOperation__Group_1__23743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__RightAssignment_1_2_in_rule__PointOperation__Group_1__2__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__0__Impl_in_rule__PowOperation__Group__03806 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__1_in_rule__PowOperation__Group__03809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__PowOperation__Group__0__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__1__Impl_in_rule__PowOperation__Group__13865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__0_in_rule__PowOperation__Group__1__Impl3892 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__0__Impl_in_rule__PowOperation__Group_1__03927 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__1_in_rule__PowOperation__Group_1__03930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__1__Impl_in_rule__PowOperation__Group_1__13988 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__2_in_rule__PowOperation__Group_1__13991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__OpAssignment_1_1_in_rule__PowOperation__Group_1__1__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__2__Impl_in_rule__PowOperation__Group_1__24048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__RightAssignment_1_2_in_rule__PowOperation__Group_1__2__Impl4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__04111 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__04114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PrimaryExpression__Group_1__0__Impl4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__14173 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__14176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_1__1__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__24232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimaryExpression__Group_1__2__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__04297 = new BitSet(new long[]{0x00000000050000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__04300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimaryExpression__Group_2__0__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__14359 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_2__1__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__24418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimaryExpression__Group_2__2__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__04605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__04608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__04727 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__04730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__14788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__SingleStatement__DesgnatorAssignment_04885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SingleStatement__ExpressionAssignment_24916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SelfStatement__ExpressionAssignment_24947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__MultiStatement__DesgnatorAssignment_04978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__MultiStatement__ExpressionsAssignment_25009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OrExpression__OpAssignment_1_15045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_25084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AndExpression__OpAssignment_1_15120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__RightAssignment_1_25159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAlternatives_1_1_0_in_rule__EqualityExpression__OpAssignment_1_15190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_rule__EqualityExpression__RightAssignment_1_25223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__OpAlternatives_1_1_0_in_rule__DashOperation__OpAssignment_1_15254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_rule__DashOperation__RightAssignment_1_25287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__OpAlternatives_1_1_0_in_rule__PointOperation__OpAssignment_1_15318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_rule__PointOperation__RightAssignment_1_25351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PowOperation__OpAssignment_1_15387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__PowOperation__RightAssignment_1_25426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_15457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_15488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_15519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Designator__ValueAssignment5554 = new BitSet(new long[]{0x0000000000000002L});

}
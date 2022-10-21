package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.ReqTxtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqTxtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'the'", "'shall'", "'When'", "'when'", "'Where'", "'where'", "'If'", "'if'", "'While'", "'while'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalReqTxtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReqTxtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReqTxtParser.tokenNames; }
    public String getGrammarFileName() { return "InternalReqTxt.g"; }



     	private ReqTxtGrammarAccess grammarAccess;

        public InternalReqTxtParser(TokenStream input, ReqTxtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ReqTxtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalReqTxt.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalReqTxt.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalReqTxt.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalReqTxt.g:71:1: ruleModel returns [EObject current=null] : ( (lv_reqs_0_0= ruleReqDes ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_reqs_0_0 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:77:2: ( ( (lv_reqs_0_0= ruleReqDes ) )* )
            // InternalReqTxt.g:78:2: ( (lv_reqs_0_0= ruleReqDes ) )*
            {
            // InternalReqTxt.g:78:2: ( (lv_reqs_0_0= ruleReqDes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||(LA1_0>=15 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalReqTxt.g:79:3: (lv_reqs_0_0= ruleReqDes )
            	    {
            	    // InternalReqTxt.g:79:3: (lv_reqs_0_0= ruleReqDes )
            	    // InternalReqTxt.g:80:4: lv_reqs_0_0= ruleReqDes
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getReqsReqDesParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_reqs_0_0=ruleReqDes();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"reqs",
            	    					lv_reqs_0_0,
            	    					"org.xtext.ReqTxt.ReqDes");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleReqDes"
    // InternalReqTxt.g:100:1: entryRuleReqDes returns [EObject current=null] : iv_ruleReqDes= ruleReqDes EOF ;
    public final EObject entryRuleReqDes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReqDes = null;


        try {
            // InternalReqTxt.g:100:47: (iv_ruleReqDes= ruleReqDes EOF )
            // InternalReqTxt.g:101:2: iv_ruleReqDes= ruleReqDes EOF
            {
             newCompositeNode(grammarAccess.getReqDesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReqDes=ruleReqDes();

            state._fsp--;

             current =iv_ruleReqDes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReqDes"


    // $ANTLR start "ruleReqDes"
    // InternalReqTxt.g:107:1: ruleReqDes returns [EObject current=null] : ( ( (lv_name_0_0= ruleCondition ) ) ruleResponse otherlv_2= '.' ) ;
    public final EObject ruleReqDes() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:113:2: ( ( ( (lv_name_0_0= ruleCondition ) ) ruleResponse otherlv_2= '.' ) )
            // InternalReqTxt.g:114:2: ( ( (lv_name_0_0= ruleCondition ) ) ruleResponse otherlv_2= '.' )
            {
            // InternalReqTxt.g:114:2: ( ( (lv_name_0_0= ruleCondition ) ) ruleResponse otherlv_2= '.' )
            // InternalReqTxt.g:115:3: ( (lv_name_0_0= ruleCondition ) ) ruleResponse otherlv_2= '.'
            {
            // InternalReqTxt.g:115:3: ( (lv_name_0_0= ruleCondition ) )
            // InternalReqTxt.g:116:4: (lv_name_0_0= ruleCondition )
            {
            // InternalReqTxt.g:116:4: (lv_name_0_0= ruleCondition )
            // InternalReqTxt.g:117:5: lv_name_0_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getReqDesAccess().getNameConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReqDesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.ReqTxt.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getReqDesAccess().getResponseParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            ruleResponse();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReqDesAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleReqDes"


    // $ANTLR start "entryRuleCondition"
    // InternalReqTxt.g:149:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalReqTxt.g:149:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalReqTxt.g:150:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalReqTxt.g:156:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConWhen_0= ruleConWhen | this_ConWhile_1= ruleConWhile | this_ConWhere_2= ruleConWhere | this_ConIf_3= ruleConIf )* ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConWhen_0 = null;

        AntlrDatatypeRuleToken this_ConWhile_1 = null;

        AntlrDatatypeRuleToken this_ConWhere_2 = null;

        AntlrDatatypeRuleToken this_ConIf_3 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:162:2: ( (this_ConWhen_0= ruleConWhen | this_ConWhile_1= ruleConWhile | this_ConWhere_2= ruleConWhere | this_ConIf_3= ruleConIf )* )
            // InternalReqTxt.g:163:2: (this_ConWhen_0= ruleConWhen | this_ConWhile_1= ruleConWhile | this_ConWhere_2= ruleConWhere | this_ConIf_3= ruleConIf )*
            {
            // InternalReqTxt.g:163:2: (this_ConWhen_0= ruleConWhen | this_ConWhile_1= ruleConWhile | this_ConWhere_2= ruleConWhere | this_ConIf_3= ruleConIf )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 15:
                case 16:
                    {
                    alt2=1;
                    }
                    break;
                case 21:
                case 22:
                    {
                    alt2=2;
                    }
                    break;
                case 17:
                case 18:
                    {
                    alt2=3;
                    }
                    break;
                case 19:
                case 20:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalReqTxt.g:164:3: this_ConWhen_0= ruleConWhen
            	    {

            	    			newCompositeNode(grammarAccess.getConditionAccess().getConWhenParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_6);
            	    this_ConWhen_0=ruleConWhen();

            	    state._fsp--;


            	    			current.merge(this_ConWhen_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalReqTxt.g:175:3: this_ConWhile_1= ruleConWhile
            	    {

            	    			newCompositeNode(grammarAccess.getConditionAccess().getConWhileParserRuleCall_1());
            	    		
            	    pushFollow(FOLLOW_6);
            	    this_ConWhile_1=ruleConWhile();

            	    state._fsp--;


            	    			current.merge(this_ConWhile_1);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalReqTxt.g:186:3: this_ConWhere_2= ruleConWhere
            	    {

            	    			newCompositeNode(grammarAccess.getConditionAccess().getConWhereParserRuleCall_2());
            	    		
            	    pushFollow(FOLLOW_6);
            	    this_ConWhere_2=ruleConWhere();

            	    state._fsp--;


            	    			current.merge(this_ConWhere_2);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalReqTxt.g:197:3: this_ConIf_3= ruleConIf
            	    {

            	    			newCompositeNode(grammarAccess.getConditionAccess().getConIfParserRuleCall_3());
            	    		
            	    pushFollow(FOLLOW_6);
            	    this_ConIf_3=ruleConIf();

            	    state._fsp--;


            	    			current.merge(this_ConIf_3);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConWhen"
    // InternalReqTxt.g:211:1: entryRuleConWhen returns [String current=null] : iv_ruleConWhen= ruleConWhen EOF ;
    public final String entryRuleConWhen() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConWhen = null;


        try {
            // InternalReqTxt.g:211:47: (iv_ruleConWhen= ruleConWhen EOF )
            // InternalReqTxt.g:212:2: iv_ruleConWhen= ruleConWhen EOF
            {
             newCompositeNode(grammarAccess.getConWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConWhen=ruleConWhen();

            state._fsp--;

             current =iv_ruleConWhen.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConWhen"


    // $ANTLR start "ruleConWhen"
    // InternalReqTxt.g:218:1: ruleConWhen returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WHEN_0= ruleWHEN this_PreTrigger_1= rulePreTrigger (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleConWhen() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_WHEN_0 = null;

        AntlrDatatypeRuleToken this_PreTrigger_1 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:224:2: ( (this_WHEN_0= ruleWHEN this_PreTrigger_1= rulePreTrigger (kw= ',' )? ) )
            // InternalReqTxt.g:225:2: (this_WHEN_0= ruleWHEN this_PreTrigger_1= rulePreTrigger (kw= ',' )? )
            {
            // InternalReqTxt.g:225:2: (this_WHEN_0= ruleWHEN this_PreTrigger_1= rulePreTrigger (kw= ',' )? )
            // InternalReqTxt.g:226:3: this_WHEN_0= ruleWHEN this_PreTrigger_1= rulePreTrigger (kw= ',' )?
            {

            			newCompositeNode(grammarAccess.getConWhenAccess().getWHENParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_WHEN_0=ruleWHEN();

            state._fsp--;


            			current.merge(this_WHEN_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getConWhenAccess().getPreTriggerParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_PreTrigger_1=rulePreTrigger();

            state._fsp--;


            			current.merge(this_PreTrigger_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalReqTxt.g:246:3: (kw= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalReqTxt.g:247:4: kw= ','
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConWhenAccess().getCommaKeyword_2());
                    			

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
    // $ANTLR end "ruleConWhen"


    // $ANTLR start "entryRuleConIf"
    // InternalReqTxt.g:257:1: entryRuleConIf returns [String current=null] : iv_ruleConIf= ruleConIf EOF ;
    public final String entryRuleConIf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConIf = null;


        try {
            // InternalReqTxt.g:257:45: (iv_ruleConIf= ruleConIf EOF )
            // InternalReqTxt.g:258:2: iv_ruleConIf= ruleConIf EOF
            {
             newCompositeNode(grammarAccess.getConIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConIf=ruleConIf();

            state._fsp--;

             current =iv_ruleConIf.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConIf"


    // $ANTLR start "ruleConIf"
    // InternalReqTxt.g:264:1: ruleConIf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IF_0= ruleIF this_PreTrigger_1= rulePreTrigger (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleConIf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IF_0 = null;

        AntlrDatatypeRuleToken this_PreTrigger_1 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:270:2: ( (this_IF_0= ruleIF this_PreTrigger_1= rulePreTrigger (kw= ',' )? ) )
            // InternalReqTxt.g:271:2: (this_IF_0= ruleIF this_PreTrigger_1= rulePreTrigger (kw= ',' )? )
            {
            // InternalReqTxt.g:271:2: (this_IF_0= ruleIF this_PreTrigger_1= rulePreTrigger (kw= ',' )? )
            // InternalReqTxt.g:272:3: this_IF_0= ruleIF this_PreTrigger_1= rulePreTrigger (kw= ',' )?
            {

            			newCompositeNode(grammarAccess.getConIfAccess().getIFParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_IF_0=ruleIF();

            state._fsp--;


            			current.merge(this_IF_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getConIfAccess().getPreTriggerParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_PreTrigger_1=rulePreTrigger();

            state._fsp--;


            			current.merge(this_PreTrigger_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalReqTxt.g:292:3: (kw= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalReqTxt.g:293:4: kw= ','
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConIfAccess().getCommaKeyword_2());
                    			

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
    // $ANTLR end "ruleConIf"


    // $ANTLR start "entryRuleConWhile"
    // InternalReqTxt.g:303:1: entryRuleConWhile returns [String current=null] : iv_ruleConWhile= ruleConWhile EOF ;
    public final String entryRuleConWhile() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConWhile = null;


        try {
            // InternalReqTxt.g:303:48: (iv_ruleConWhile= ruleConWhile EOF )
            // InternalReqTxt.g:304:2: iv_ruleConWhile= ruleConWhile EOF
            {
             newCompositeNode(grammarAccess.getConWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConWhile=ruleConWhile();

            state._fsp--;

             current =iv_ruleConWhile.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConWhile"


    // $ANTLR start "ruleConWhile"
    // InternalReqTxt.g:310:1: ruleConWhile returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WHILE_0= ruleWHILE this_State_1= ruleState (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleConWhile() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_WHILE_0 = null;

        AntlrDatatypeRuleToken this_State_1 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:316:2: ( (this_WHILE_0= ruleWHILE this_State_1= ruleState (kw= ',' )? ) )
            // InternalReqTxt.g:317:2: (this_WHILE_0= ruleWHILE this_State_1= ruleState (kw= ',' )? )
            {
            // InternalReqTxt.g:317:2: (this_WHILE_0= ruleWHILE this_State_1= ruleState (kw= ',' )? )
            // InternalReqTxt.g:318:3: this_WHILE_0= ruleWHILE this_State_1= ruleState (kw= ',' )?
            {

            			newCompositeNode(grammarAccess.getConWhileAccess().getWHILEParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_WHILE_0=ruleWHILE();

            state._fsp--;


            			current.merge(this_WHILE_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getConWhileAccess().getStateParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_State_1=ruleState();

            state._fsp--;


            			current.merge(this_State_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalReqTxt.g:338:3: (kw= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalReqTxt.g:339:4: kw= ','
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConWhileAccess().getCommaKeyword_2());
                    			

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
    // $ANTLR end "ruleConWhile"


    // $ANTLR start "entryRuleConWhere"
    // InternalReqTxt.g:349:1: entryRuleConWhere returns [String current=null] : iv_ruleConWhere= ruleConWhere EOF ;
    public final String entryRuleConWhere() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConWhere = null;


        try {
            // InternalReqTxt.g:349:48: (iv_ruleConWhere= ruleConWhere EOF )
            // InternalReqTxt.g:350:2: iv_ruleConWhere= ruleConWhere EOF
            {
             newCompositeNode(grammarAccess.getConWhereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConWhere=ruleConWhere();

            state._fsp--;

             current =iv_ruleConWhere.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConWhere"


    // $ANTLR start "ruleConWhere"
    // InternalReqTxt.g:356:1: ruleConWhere returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_WHERE_0= ruleWHERE this_Feature_1= ruleFeature (kw= ',' )? ) ;
    public final AntlrDatatypeRuleToken ruleConWhere() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_WHERE_0 = null;

        AntlrDatatypeRuleToken this_Feature_1 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:362:2: ( (this_WHERE_0= ruleWHERE this_Feature_1= ruleFeature (kw= ',' )? ) )
            // InternalReqTxt.g:363:2: (this_WHERE_0= ruleWHERE this_Feature_1= ruleFeature (kw= ',' )? )
            {
            // InternalReqTxt.g:363:2: (this_WHERE_0= ruleWHERE this_Feature_1= ruleFeature (kw= ',' )? )
            // InternalReqTxt.g:364:3: this_WHERE_0= ruleWHERE this_Feature_1= ruleFeature (kw= ',' )?
            {

            			newCompositeNode(grammarAccess.getConWhereAccess().getWHEREParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_WHERE_0=ruleWHERE();

            state._fsp--;


            			current.merge(this_WHERE_0);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getConWhereAccess().getFeatureParserRuleCall_1());
            		
            pushFollow(FOLLOW_8);
            this_Feature_1=ruleFeature();

            state._fsp--;


            			current.merge(this_Feature_1);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalReqTxt.g:384:3: (kw= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalReqTxt.g:385:4: kw= ','
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConWhereAccess().getCommaKeyword_2());
                    			

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
    // $ANTLR end "ruleConWhere"


    // $ANTLR start "entryRuleResponse"
    // InternalReqTxt.g:395:1: entryRuleResponse returns [String current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final String entryRuleResponse() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResponse = null;


        try {
            // InternalReqTxt.g:395:48: (iv_ruleResponse= ruleResponse EOF )
            // InternalReqTxt.g:396:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalReqTxt.g:402:1: ruleResponse returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'the' )? this_SysName_1= ruleSysName kw= 'shall' this_SysRes_3= ruleSysRes ) ;
    public final AntlrDatatypeRuleToken ruleResponse() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_SysName_1 = null;

        AntlrDatatypeRuleToken this_SysRes_3 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:408:2: ( ( (kw= 'the' )? this_SysName_1= ruleSysName kw= 'shall' this_SysRes_3= ruleSysRes ) )
            // InternalReqTxt.g:409:2: ( (kw= 'the' )? this_SysName_1= ruleSysName kw= 'shall' this_SysRes_3= ruleSysRes )
            {
            // InternalReqTxt.g:409:2: ( (kw= 'the' )? this_SysName_1= ruleSysName kw= 'shall' this_SysRes_3= ruleSysRes )
            // InternalReqTxt.g:410:3: (kw= 'the' )? this_SysName_1= ruleSysName kw= 'shall' this_SysRes_3= ruleSysRes
            {
            // InternalReqTxt.g:410:3: (kw= 'the' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalReqTxt.g:411:4: kw= 'the'
                    {
                    kw=(Token)match(input,13,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getResponseAccess().getTheKeyword_0());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getResponseAccess().getSysNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_10);
            this_SysName_1=ruleSysName();

            state._fsp--;


            			current.merge(this_SysName_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,14,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getResponseAccess().getShallKeyword_2());
            		

            			newCompositeNode(grammarAccess.getResponseAccess().getSysResParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_SysRes_3=ruleSysRes();

            state._fsp--;


            			current.merge(this_SysRes_3);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRulePreTrigger"
    // InternalReqTxt.g:446:1: entryRulePreTrigger returns [String current=null] : iv_rulePreTrigger= rulePreTrigger EOF ;
    public final String entryRulePreTrigger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreTrigger = null;


        try {
            // InternalReqTxt.g:446:50: (iv_rulePreTrigger= rulePreTrigger EOF )
            // InternalReqTxt.g:447:2: iv_rulePreTrigger= rulePreTrigger EOF
            {
             newCompositeNode(grammarAccess.getPreTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreTrigger=rulePreTrigger();

            state._fsp--;

             current =iv_rulePreTrigger.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePreTrigger"


    // $ANTLR start "rulePreTrigger"
    // InternalReqTxt.g:453:1: rulePreTrigger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OTHER_0= ruleOTHER ;
    public final AntlrDatatypeRuleToken rulePreTrigger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OTHER_0 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:459:2: (this_OTHER_0= ruleOTHER )
            // InternalReqTxt.g:460:2: this_OTHER_0= ruleOTHER
            {

            		newCompositeNode(grammarAccess.getPreTriggerAccess().getOTHERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OTHER_0=ruleOTHER();

            state._fsp--;


            		current.merge(this_OTHER_0);
            	

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
    // $ANTLR end "rulePreTrigger"


    // $ANTLR start "entryRuleState"
    // InternalReqTxt.g:473:1: entryRuleState returns [String current=null] : iv_ruleState= ruleState EOF ;
    public final String entryRuleState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleState = null;


        try {
            // InternalReqTxt.g:473:45: (iv_ruleState= ruleState EOF )
            // InternalReqTxt.g:474:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalReqTxt.g:480:1: ruleState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OTHER_0= ruleOTHER ;
    public final AntlrDatatypeRuleToken ruleState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OTHER_0 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:486:2: (this_OTHER_0= ruleOTHER )
            // InternalReqTxt.g:487:2: this_OTHER_0= ruleOTHER
            {

            		newCompositeNode(grammarAccess.getStateAccess().getOTHERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OTHER_0=ruleOTHER();

            state._fsp--;


            		current.merge(this_OTHER_0);
            	

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFeature"
    // InternalReqTxt.g:500:1: entryRuleFeature returns [String current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final String entryRuleFeature() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFeature = null;


        try {
            // InternalReqTxt.g:500:47: (iv_ruleFeature= ruleFeature EOF )
            // InternalReqTxt.g:501:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalReqTxt.g:507:1: ruleFeature returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OTHER_0= ruleOTHER ;
    public final AntlrDatatypeRuleToken ruleFeature() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OTHER_0 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:513:2: (this_OTHER_0= ruleOTHER )
            // InternalReqTxt.g:514:2: this_OTHER_0= ruleOTHER
            {

            		newCompositeNode(grammarAccess.getFeatureAccess().getOTHERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OTHER_0=ruleOTHER();

            state._fsp--;


            		current.merge(this_OTHER_0);
            	

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleSysName"
    // InternalReqTxt.g:527:1: entryRuleSysName returns [String current=null] : iv_ruleSysName= ruleSysName EOF ;
    public final String entryRuleSysName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSysName = null;


        try {
            // InternalReqTxt.g:527:47: (iv_ruleSysName= ruleSysName EOF )
            // InternalReqTxt.g:528:2: iv_ruleSysName= ruleSysName EOF
            {
             newCompositeNode(grammarAccess.getSysNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSysName=ruleSysName();

            state._fsp--;

             current =iv_ruleSysName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSysName"


    // $ANTLR start "ruleSysName"
    // InternalReqTxt.g:534:1: ruleSysName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OTHER_0= ruleOTHER ;
    public final AntlrDatatypeRuleToken ruleSysName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OTHER_0 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:540:2: (this_OTHER_0= ruleOTHER )
            // InternalReqTxt.g:541:2: this_OTHER_0= ruleOTHER
            {

            		newCompositeNode(grammarAccess.getSysNameAccess().getOTHERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OTHER_0=ruleOTHER();

            state._fsp--;


            		current.merge(this_OTHER_0);
            	

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
    // $ANTLR end "ruleSysName"


    // $ANTLR start "entryRuleSysRes"
    // InternalReqTxt.g:554:1: entryRuleSysRes returns [String current=null] : iv_ruleSysRes= ruleSysRes EOF ;
    public final String entryRuleSysRes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSysRes = null;


        try {
            // InternalReqTxt.g:554:46: (iv_ruleSysRes= ruleSysRes EOF )
            // InternalReqTxt.g:555:2: iv_ruleSysRes= ruleSysRes EOF
            {
             newCompositeNode(grammarAccess.getSysResRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSysRes=ruleSysRes();

            state._fsp--;

             current =iv_ruleSysRes.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSysRes"


    // $ANTLR start "ruleSysRes"
    // InternalReqTxt.g:561:1: ruleSysRes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_OTHER_0= ruleOTHER ;
    public final AntlrDatatypeRuleToken ruleSysRes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_OTHER_0 = null;



        	enterRule();

        try {
            // InternalReqTxt.g:567:2: (this_OTHER_0= ruleOTHER )
            // InternalReqTxt.g:568:2: this_OTHER_0= ruleOTHER
            {

            		newCompositeNode(grammarAccess.getSysResAccess().getOTHERParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OTHER_0=ruleOTHER();

            state._fsp--;


            		current.merge(this_OTHER_0);
            	

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
    // $ANTLR end "ruleSysRes"


    // $ANTLR start "entryRuleWHEN"
    // InternalReqTxt.g:581:1: entryRuleWHEN returns [String current=null] : iv_ruleWHEN= ruleWHEN EOF ;
    public final String entryRuleWHEN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWHEN = null;


        try {
            // InternalReqTxt.g:581:44: (iv_ruleWHEN= ruleWHEN EOF )
            // InternalReqTxt.g:582:2: iv_ruleWHEN= ruleWHEN EOF
            {
             newCompositeNode(grammarAccess.getWHENRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWHEN=ruleWHEN();

            state._fsp--;

             current =iv_ruleWHEN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWHEN"


    // $ANTLR start "ruleWHEN"
    // InternalReqTxt.g:588:1: ruleWHEN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'When' | kw= 'when' ) ;
    public final AntlrDatatypeRuleToken ruleWHEN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReqTxt.g:594:2: ( (kw= 'When' | kw= 'when' ) )
            // InternalReqTxt.g:595:2: (kw= 'When' | kw= 'when' )
            {
            // InternalReqTxt.g:595:2: (kw= 'When' | kw= 'when' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalReqTxt.g:596:3: kw= 'When'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWHENAccess().getWhenKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqTxt.g:602:3: kw= 'when'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWHENAccess().getWhenKeyword_1());
                    		

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
    // $ANTLR end "ruleWHEN"


    // $ANTLR start "entryRuleWHERE"
    // InternalReqTxt.g:611:1: entryRuleWHERE returns [String current=null] : iv_ruleWHERE= ruleWHERE EOF ;
    public final String entryRuleWHERE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWHERE = null;


        try {
            // InternalReqTxt.g:611:45: (iv_ruleWHERE= ruleWHERE EOF )
            // InternalReqTxt.g:612:2: iv_ruleWHERE= ruleWHERE EOF
            {
             newCompositeNode(grammarAccess.getWHERERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWHERE=ruleWHERE();

            state._fsp--;

             current =iv_ruleWHERE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWHERE"


    // $ANTLR start "ruleWHERE"
    // InternalReqTxt.g:618:1: ruleWHERE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Where' | kw= 'where' ) ;
    public final AntlrDatatypeRuleToken ruleWHERE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReqTxt.g:624:2: ( (kw= 'Where' | kw= 'where' ) )
            // InternalReqTxt.g:625:2: (kw= 'Where' | kw= 'where' )
            {
            // InternalReqTxt.g:625:2: (kw= 'Where' | kw= 'where' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalReqTxt.g:626:3: kw= 'Where'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWHEREAccess().getWhereKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqTxt.g:632:3: kw= 'where'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWHEREAccess().getWhereKeyword_1());
                    		

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
    // $ANTLR end "ruleWHERE"


    // $ANTLR start "entryRuleIF"
    // InternalReqTxt.g:641:1: entryRuleIF returns [String current=null] : iv_ruleIF= ruleIF EOF ;
    public final String entryRuleIF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIF = null;


        try {
            // InternalReqTxt.g:641:42: (iv_ruleIF= ruleIF EOF )
            // InternalReqTxt.g:642:2: iv_ruleIF= ruleIF EOF
            {
             newCompositeNode(grammarAccess.getIFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIF=ruleIF();

            state._fsp--;

             current =iv_ruleIF.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIF"


    // $ANTLR start "ruleIF"
    // InternalReqTxt.g:648:1: ruleIF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'If' | kw= 'if' ) ;
    public final AntlrDatatypeRuleToken ruleIF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReqTxt.g:654:2: ( (kw= 'If' | kw= 'if' ) )
            // InternalReqTxt.g:655:2: (kw= 'If' | kw= 'if' )
            {
            // InternalReqTxt.g:655:2: (kw= 'If' | kw= 'if' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalReqTxt.g:656:3: kw= 'If'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIFAccess().getIfKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqTxt.g:662:3: kw= 'if'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIFAccess().getIfKeyword_1());
                    		

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
    // $ANTLR end "ruleIF"


    // $ANTLR start "entryRuleWHILE"
    // InternalReqTxt.g:671:1: entryRuleWHILE returns [String current=null] : iv_ruleWHILE= ruleWHILE EOF ;
    public final String entryRuleWHILE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWHILE = null;


        try {
            // InternalReqTxt.g:671:45: (iv_ruleWHILE= ruleWHILE EOF )
            // InternalReqTxt.g:672:2: iv_ruleWHILE= ruleWHILE EOF
            {
             newCompositeNode(grammarAccess.getWHILERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWHILE=ruleWHILE();

            state._fsp--;

             current =iv_ruleWHILE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWHILE"


    // $ANTLR start "ruleWHILE"
    // InternalReqTxt.g:678:1: ruleWHILE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'While' | kw= 'while' ) ;
    public final AntlrDatatypeRuleToken ruleWHILE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalReqTxt.g:684:2: ( (kw= 'While' | kw= 'while' ) )
            // InternalReqTxt.g:685:2: (kw= 'While' | kw= 'while' )
            {
            // InternalReqTxt.g:685:2: (kw= 'While' | kw= 'while' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalReqTxt.g:686:3: kw= 'While'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWHILEAccess().getWhileKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalReqTxt.g:692:3: kw= 'while'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getWHILEAccess().getWhileKeyword_1());
                    		

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
    // $ANTLR end "ruleWHILE"


    // $ANTLR start "entryRuleOTHER"
    // InternalReqTxt.g:701:1: entryRuleOTHER returns [String current=null] : iv_ruleOTHER= ruleOTHER EOF ;
    public final String entryRuleOTHER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOTHER = null;


        try {
            // InternalReqTxt.g:701:45: (iv_ruleOTHER= ruleOTHER EOF )
            // InternalReqTxt.g:702:2: iv_ruleOTHER= ruleOTHER EOF
            {
             newCompositeNode(grammarAccess.getOTHERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOTHER=ruleOTHER();

            state._fsp--;

             current =iv_ruleOTHER.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOTHER"


    // $ANTLR start "ruleOTHER"
    // InternalReqTxt.g:708:1: ruleOTHER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleOTHER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalReqTxt.g:714:2: ( (this_ID_0= RULE_ID )+ )
            // InternalReqTxt.g:715:2: (this_ID_0= RULE_ID )+
            {
            // InternalReqTxt.g:715:2: (this_ID_0= RULE_ID )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalReqTxt.g:716:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getOTHERAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


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
    // $ANTLR end "ruleOTHER"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000007FA012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000007FA810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007F8002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007FA010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007FE010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});

}
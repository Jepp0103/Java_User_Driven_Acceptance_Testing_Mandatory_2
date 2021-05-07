package org.example.domainmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "'and'", "'when'", "'shipping'", "'to'", "'then'", "'ordering'", "','", "'querying'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;

        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDomainmodel.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDomainmodel.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDomainmodel.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalDomainmodel.g:71:1: ruleModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:77:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalDomainmodel.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalDomainmodel.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalDomainmodel.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalDomainmodel.g:80:4: lv_declarations_0_0= ruleDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"declarations",
            	    					lv_declarations_0_0,
            	    					"org.example.domainmodel.Domainmodel.Declaration");
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


    // $ANTLR start "entryRuleDeclaration"
    // InternalDomainmodel.g:100:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalDomainmodel.g:100:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalDomainmodel.g:101:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDomainmodel.g:107:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_conditionandaction_0_0= ruleConditionandAction ) ) ( (lv_story_1_0= ruleStory ) ) ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_conditionandaction_0_0 = null;

        EObject lv_story_1_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:113:2: ( ( ( (lv_conditionandaction_0_0= ruleConditionandAction ) ) ( (lv_story_1_0= ruleStory ) ) ) )
            // InternalDomainmodel.g:114:2: ( ( (lv_conditionandaction_0_0= ruleConditionandAction ) ) ( (lv_story_1_0= ruleStory ) ) )
            {
            // InternalDomainmodel.g:114:2: ( ( (lv_conditionandaction_0_0= ruleConditionandAction ) ) ( (lv_story_1_0= ruleStory ) ) )
            // InternalDomainmodel.g:115:3: ( (lv_conditionandaction_0_0= ruleConditionandAction ) ) ( (lv_story_1_0= ruleStory ) )
            {
            // InternalDomainmodel.g:115:3: ( (lv_conditionandaction_0_0= ruleConditionandAction ) )
            // InternalDomainmodel.g:116:4: (lv_conditionandaction_0_0= ruleConditionandAction )
            {
            // InternalDomainmodel.g:116:4: (lv_conditionandaction_0_0= ruleConditionandAction )
            // InternalDomainmodel.g:117:5: lv_conditionandaction_0_0= ruleConditionandAction
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getConditionandactionConditionandActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_conditionandaction_0_0=ruleConditionandAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"conditionandaction",
            						lv_conditionandaction_0_0,
            						"org.example.domainmodel.Domainmodel.ConditionandAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:134:3: ( (lv_story_1_0= ruleStory ) )
            // InternalDomainmodel.g:135:4: (lv_story_1_0= ruleStory )
            {
            // InternalDomainmodel.g:135:4: (lv_story_1_0= ruleStory )
            // InternalDomainmodel.g:136:5: lv_story_1_0= ruleStory
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getStoryStoryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_story_1_0=ruleStory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"story",
            						lv_story_1_0,
            						"org.example.domainmodel.Domainmodel.Story");
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleConditionandAction"
    // InternalDomainmodel.g:157:1: entryRuleConditionandAction returns [EObject current=null] : iv_ruleConditionandAction= ruleConditionandAction EOF ;
    public final EObject entryRuleConditionandAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionandAction = null;


        try {
            // InternalDomainmodel.g:157:59: (iv_ruleConditionandAction= ruleConditionandAction EOF )
            // InternalDomainmodel.g:158:2: iv_ruleConditionandAction= ruleConditionandAction EOF
            {
             newCompositeNode(grammarAccess.getConditionandActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionandAction=ruleConditionandAction();

            state._fsp--;

             current =iv_ruleConditionandAction; 
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
    // $ANTLR end "entryRuleConditionandAction"


    // $ANTLR start "ruleConditionandAction"
    // InternalDomainmodel.g:164:1: ruleConditionandAction returns [EObject current=null] : (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'when' ) ;
    public final EObject ruleConditionandAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:170:2: ( (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'when' ) )
            // InternalDomainmodel.g:171:2: (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'when' )
            {
            // InternalDomainmodel.g:171:2: (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'when' )
            // InternalDomainmodel.g:172:3: otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= 'when'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionandActionAccess().getGivenKeyword_0());
            		
            // InternalDomainmodel.g:176:3: ( (lv_conditions_1_0= ruleCondition ) )
            // InternalDomainmodel.g:177:4: (lv_conditions_1_0= ruleCondition )
            {
            // InternalDomainmodel.g:177:4: (lv_conditions_1_0= ruleCondition )
            // InternalDomainmodel.g:178:5: lv_conditions_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_conditions_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionandActionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"org.example.domainmodel.Domainmodel.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:195:3: (otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainmodel.g:196:4: otherlv_2= 'and' ( (lv_conditions_3_0= ruleCondition ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionandActionAccess().getAndKeyword_2_0());
            	    			
            	    // InternalDomainmodel.g:200:4: ( (lv_conditions_3_0= ruleCondition ) )
            	    // InternalDomainmodel.g:201:5: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalDomainmodel.g:201:5: (lv_conditions_3_0= ruleCondition )
            	    // InternalDomainmodel.g:202:6: lv_conditions_3_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionandActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_3_0,
            	    							"org.example.domainmodel.Domainmodel.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionandActionAccess().getWhenKeyword_3());
            		

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
    // $ANTLR end "ruleConditionandAction"


    // $ANTLR start "entryRuleStory"
    // InternalDomainmodel.g:228:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalDomainmodel.g:228:46: (iv_ruleStory= ruleStory EOF )
            // InternalDomainmodel.g:229:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
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
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalDomainmodel.g:235:1: ruleStory returns [EObject current=null] : (this_Ship_0= ruleShip | this_Ordermaterials_1= ruleOrdermaterials | this_Queryitems_2= ruleQueryitems ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        EObject this_Ship_0 = null;

        EObject this_Ordermaterials_1 = null;

        EObject this_Queryitems_2 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:241:2: ( (this_Ship_0= ruleShip | this_Ordermaterials_1= ruleOrdermaterials | this_Queryitems_2= ruleQueryitems ) )
            // InternalDomainmodel.g:242:2: (this_Ship_0= ruleShip | this_Ordermaterials_1= ruleOrdermaterials | this_Queryitems_2= ruleQueryitems )
            {
            // InternalDomainmodel.g:242:2: (this_Ship_0= ruleShip | this_Ordermaterials_1= ruleOrdermaterials | this_Queryitems_2= ruleQueryitems )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:243:3: this_Ship_0= ruleShip
                    {

                    			newCompositeNode(grammarAccess.getStoryAccess().getShipParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ship_0=ruleShip();

                    state._fsp--;


                    			current = this_Ship_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:252:3: this_Ordermaterials_1= ruleOrdermaterials
                    {

                    			newCompositeNode(grammarAccess.getStoryAccess().getOrdermaterialsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ordermaterials_1=ruleOrdermaterials();

                    state._fsp--;


                    			current = this_Ordermaterials_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:261:3: this_Queryitems_2= ruleQueryitems
                    {

                    			newCompositeNode(grammarAccess.getStoryAccess().getQueryitemsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Queryitems_2=ruleQueryitems();

                    state._fsp--;


                    			current = this_Queryitems_2;
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
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleShip"
    // InternalDomainmodel.g:273:1: entryRuleShip returns [EObject current=null] : iv_ruleShip= ruleShip EOF ;
    public final EObject entryRuleShip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShip = null;


        try {
            // InternalDomainmodel.g:273:45: (iv_ruleShip= ruleShip EOF )
            // InternalDomainmodel.g:274:2: iv_ruleShip= ruleShip EOF
            {
             newCompositeNode(grammarAccess.getShipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShip=ruleShip();

            state._fsp--;

             current =iv_ruleShip; 
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
    // $ANTLR end "entryRuleShip"


    // $ANTLR start "ruleShip"
    // InternalDomainmodel.g:280:1: ruleShip returns [EObject current=null] : (otherlv_0= 'shipping' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'to' ( (lv_address_3_0= ruleAddress ) ) otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) (otherlv_6= 'and' ( (lv_reaction_7_0= ruleReaction ) ) )* ) ;
    public final EObject ruleShip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_item_1_0 = null;

        EObject lv_address_3_0 = null;

        EObject lv_reaction_5_0 = null;

        EObject lv_reaction_7_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:286:2: ( (otherlv_0= 'shipping' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'to' ( (lv_address_3_0= ruleAddress ) ) otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) (otherlv_6= 'and' ( (lv_reaction_7_0= ruleReaction ) ) )* ) )
            // InternalDomainmodel.g:287:2: (otherlv_0= 'shipping' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'to' ( (lv_address_3_0= ruleAddress ) ) otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) (otherlv_6= 'and' ( (lv_reaction_7_0= ruleReaction ) ) )* )
            {
            // InternalDomainmodel.g:287:2: (otherlv_0= 'shipping' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'to' ( (lv_address_3_0= ruleAddress ) ) otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) (otherlv_6= 'and' ( (lv_reaction_7_0= ruleReaction ) ) )* )
            // InternalDomainmodel.g:288:3: otherlv_0= 'shipping' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'to' ( (lv_address_3_0= ruleAddress ) ) otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) (otherlv_6= 'and' ( (lv_reaction_7_0= ruleReaction ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getShipAccess().getShippingKeyword_0());
            		
            // InternalDomainmodel.g:292:3: ( (lv_item_1_0= ruleItem ) )
            // InternalDomainmodel.g:293:4: (lv_item_1_0= ruleItem )
            {
            // InternalDomainmodel.g:293:4: (lv_item_1_0= ruleItem )
            // InternalDomainmodel.g:294:5: lv_item_1_0= ruleItem
            {

            					newCompositeNode(grammarAccess.getShipAccess().getItemItemParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_item_1_0=ruleItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipRule());
            					}
            					add(
            						current,
            						"item",
            						lv_item_1_0,
            						"org.example.domainmodel.Domainmodel.Item");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getShipAccess().getToKeyword_2());
            		
            // InternalDomainmodel.g:315:3: ( (lv_address_3_0= ruleAddress ) )
            // InternalDomainmodel.g:316:4: (lv_address_3_0= ruleAddress )
            {
            // InternalDomainmodel.g:316:4: (lv_address_3_0= ruleAddress )
            // InternalDomainmodel.g:317:5: lv_address_3_0= ruleAddress
            {

            					newCompositeNode(grammarAccess.getShipAccess().getAddressAddressParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_address_3_0=ruleAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipRule());
            					}
            					add(
            						current,
            						"address",
            						lv_address_3_0,
            						"org.example.domainmodel.Domainmodel.Address");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getShipAccess().getThenKeyword_4());
            		
            // InternalDomainmodel.g:338:3: ( (lv_reaction_5_0= ruleReaction ) )
            // InternalDomainmodel.g:339:4: (lv_reaction_5_0= ruleReaction )
            {
            // InternalDomainmodel.g:339:4: (lv_reaction_5_0= ruleReaction )
            // InternalDomainmodel.g:340:5: lv_reaction_5_0= ruleReaction
            {

            					newCompositeNode(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_reaction_5_0=ruleReaction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipRule());
            					}
            					add(
            						current,
            						"reaction",
            						lv_reaction_5_0,
            						"org.example.domainmodel.Domainmodel.Reaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:357:3: (otherlv_6= 'and' ( (lv_reaction_7_0= ruleReaction ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:358:4: otherlv_6= 'and' ( (lv_reaction_7_0= ruleReaction ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getShipAccess().getAndKeyword_6_0());
            	    			
            	    // InternalDomainmodel.g:362:4: ( (lv_reaction_7_0= ruleReaction ) )
            	    // InternalDomainmodel.g:363:5: (lv_reaction_7_0= ruleReaction )
            	    {
            	    // InternalDomainmodel.g:363:5: (lv_reaction_7_0= ruleReaction )
            	    // InternalDomainmodel.g:364:6: lv_reaction_7_0= ruleReaction
            	    {

            	    						newCompositeNode(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_reaction_7_0=ruleReaction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getShipRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reaction",
            	    							lv_reaction_7_0,
            	    							"org.example.domainmodel.Domainmodel.Reaction");
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
    // $ANTLR end "ruleShip"


    // $ANTLR start "entryRuleOrdermaterials"
    // InternalDomainmodel.g:386:1: entryRuleOrdermaterials returns [EObject current=null] : iv_ruleOrdermaterials= ruleOrdermaterials EOF ;
    public final EObject entryRuleOrdermaterials() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrdermaterials = null;


        try {
            // InternalDomainmodel.g:386:55: (iv_ruleOrdermaterials= ruleOrdermaterials EOF )
            // InternalDomainmodel.g:387:2: iv_ruleOrdermaterials= ruleOrdermaterials EOF
            {
             newCompositeNode(grammarAccess.getOrdermaterialsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrdermaterials=ruleOrdermaterials();

            state._fsp--;

             current =iv_ruleOrdermaterials; 
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
    // $ANTLR end "entryRuleOrdermaterials"


    // $ANTLR start "ruleOrdermaterials"
    // InternalDomainmodel.g:393:1: ruleOrdermaterials returns [EObject current=null] : (otherlv_0= 'ordering' ( (lv_material_1_0= ruleMaterial ) ) (otherlv_2= ',' ( (lv_material_3_0= ruleMaterial ) ) )* otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) ) ;
    public final EObject ruleOrdermaterials() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_material_1_0 = null;

        EObject lv_material_3_0 = null;

        EObject lv_reaction_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:399:2: ( (otherlv_0= 'ordering' ( (lv_material_1_0= ruleMaterial ) ) (otherlv_2= ',' ( (lv_material_3_0= ruleMaterial ) ) )* otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) ) )
            // InternalDomainmodel.g:400:2: (otherlv_0= 'ordering' ( (lv_material_1_0= ruleMaterial ) ) (otherlv_2= ',' ( (lv_material_3_0= ruleMaterial ) ) )* otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) )
            {
            // InternalDomainmodel.g:400:2: (otherlv_0= 'ordering' ( (lv_material_1_0= ruleMaterial ) ) (otherlv_2= ',' ( (lv_material_3_0= ruleMaterial ) ) )* otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) ) )
            // InternalDomainmodel.g:401:3: otherlv_0= 'ordering' ( (lv_material_1_0= ruleMaterial ) ) (otherlv_2= ',' ( (lv_material_3_0= ruleMaterial ) ) )* otherlv_4= 'then' ( (lv_reaction_5_0= ruleReaction ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOrdermaterialsAccess().getOrderingKeyword_0());
            		
            // InternalDomainmodel.g:405:3: ( (lv_material_1_0= ruleMaterial ) )
            // InternalDomainmodel.g:406:4: (lv_material_1_0= ruleMaterial )
            {
            // InternalDomainmodel.g:406:4: (lv_material_1_0= ruleMaterial )
            // InternalDomainmodel.g:407:5: lv_material_1_0= ruleMaterial
            {

            					newCompositeNode(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_material_1_0=ruleMaterial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrdermaterialsRule());
            					}
            					add(
            						current,
            						"material",
            						lv_material_1_0,
            						"org.example.domainmodel.Domainmodel.Material");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:424:3: (otherlv_2= ',' ( (lv_material_3_0= ruleMaterial ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomainmodel.g:425:4: otherlv_2= ',' ( (lv_material_3_0= ruleMaterial ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrdermaterialsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalDomainmodel.g:429:4: ( (lv_material_3_0= ruleMaterial ) )
            	    // InternalDomainmodel.g:430:5: (lv_material_3_0= ruleMaterial )
            	    {
            	    // InternalDomainmodel.g:430:5: (lv_material_3_0= ruleMaterial )
            	    // InternalDomainmodel.g:431:6: lv_material_3_0= ruleMaterial
            	    {

            	    						newCompositeNode(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_material_3_0=ruleMaterial();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrdermaterialsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"material",
            	    							lv_material_3_0,
            	    							"org.example.domainmodel.Domainmodel.Material");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getOrdermaterialsAccess().getThenKeyword_3());
            		
            // InternalDomainmodel.g:453:3: ( (lv_reaction_5_0= ruleReaction ) )
            // InternalDomainmodel.g:454:4: (lv_reaction_5_0= ruleReaction )
            {
            // InternalDomainmodel.g:454:4: (lv_reaction_5_0= ruleReaction )
            // InternalDomainmodel.g:455:5: lv_reaction_5_0= ruleReaction
            {

            					newCompositeNode(grammarAccess.getOrdermaterialsAccess().getReactionReactionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_reaction_5_0=ruleReaction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrdermaterialsRule());
            					}
            					add(
            						current,
            						"reaction",
            						lv_reaction_5_0,
            						"org.example.domainmodel.Domainmodel.Reaction");
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
    // $ANTLR end "ruleOrdermaterials"


    // $ANTLR start "entryRuleQueryitems"
    // InternalDomainmodel.g:476:1: entryRuleQueryitems returns [EObject current=null] : iv_ruleQueryitems= ruleQueryitems EOF ;
    public final EObject entryRuleQueryitems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryitems = null;


        try {
            // InternalDomainmodel.g:476:51: (iv_ruleQueryitems= ruleQueryitems EOF )
            // InternalDomainmodel.g:477:2: iv_ruleQueryitems= ruleQueryitems EOF
            {
             newCompositeNode(grammarAccess.getQueryitemsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryitems=ruleQueryitems();

            state._fsp--;

             current =iv_ruleQueryitems; 
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
    // $ANTLR end "entryRuleQueryitems"


    // $ANTLR start "ruleQueryitems"
    // InternalDomainmodel.g:483:1: ruleQueryitems returns [EObject current=null] : (otherlv_0= 'querying' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'then' ( (lv_reaction_3_0= ruleReaction ) ) (otherlv_4= 'and' ( (lv_reaction_5_0= ruleReaction ) ) )* ) ;
    public final EObject ruleQueryitems() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_item_1_0 = null;

        EObject lv_reaction_3_0 = null;

        EObject lv_reaction_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:489:2: ( (otherlv_0= 'querying' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'then' ( (lv_reaction_3_0= ruleReaction ) ) (otherlv_4= 'and' ( (lv_reaction_5_0= ruleReaction ) ) )* ) )
            // InternalDomainmodel.g:490:2: (otherlv_0= 'querying' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'then' ( (lv_reaction_3_0= ruleReaction ) ) (otherlv_4= 'and' ( (lv_reaction_5_0= ruleReaction ) ) )* )
            {
            // InternalDomainmodel.g:490:2: (otherlv_0= 'querying' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'then' ( (lv_reaction_3_0= ruleReaction ) ) (otherlv_4= 'and' ( (lv_reaction_5_0= ruleReaction ) ) )* )
            // InternalDomainmodel.g:491:3: otherlv_0= 'querying' ( (lv_item_1_0= ruleItem ) ) otherlv_2= 'then' ( (lv_reaction_3_0= ruleReaction ) ) (otherlv_4= 'and' ( (lv_reaction_5_0= ruleReaction ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryitemsAccess().getQueryingKeyword_0());
            		
            // InternalDomainmodel.g:495:3: ( (lv_item_1_0= ruleItem ) )
            // InternalDomainmodel.g:496:4: (lv_item_1_0= ruleItem )
            {
            // InternalDomainmodel.g:496:4: (lv_item_1_0= ruleItem )
            // InternalDomainmodel.g:497:5: lv_item_1_0= ruleItem
            {

            					newCompositeNode(grammarAccess.getQueryitemsAccess().getItemItemParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_item_1_0=ruleItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryitemsRule());
            					}
            					add(
            						current,
            						"item",
            						lv_item_1_0,
            						"org.example.domainmodel.Domainmodel.Item");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryitemsAccess().getThenKeyword_2());
            		
            // InternalDomainmodel.g:518:3: ( (lv_reaction_3_0= ruleReaction ) )
            // InternalDomainmodel.g:519:4: (lv_reaction_3_0= ruleReaction )
            {
            // InternalDomainmodel.g:519:4: (lv_reaction_3_0= ruleReaction )
            // InternalDomainmodel.g:520:5: lv_reaction_3_0= ruleReaction
            {

            					newCompositeNode(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_reaction_3_0=ruleReaction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryitemsRule());
            					}
            					add(
            						current,
            						"reaction",
            						lv_reaction_3_0,
            						"org.example.domainmodel.Domainmodel.Reaction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:537:3: (otherlv_4= 'and' ( (lv_reaction_5_0= ruleReaction ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:538:4: otherlv_4= 'and' ( (lv_reaction_5_0= ruleReaction ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getQueryitemsAccess().getAndKeyword_4_0());
            	    			
            	    // InternalDomainmodel.g:542:4: ( (lv_reaction_5_0= ruleReaction ) )
            	    // InternalDomainmodel.g:543:5: (lv_reaction_5_0= ruleReaction )
            	    {
            	    // InternalDomainmodel.g:543:5: (lv_reaction_5_0= ruleReaction )
            	    // InternalDomainmodel.g:544:6: lv_reaction_5_0= ruleReaction
            	    {

            	    						newCompositeNode(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_reaction_5_0=ruleReaction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQueryitemsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reaction",
            	    							lv_reaction_5_0,
            	    							"org.example.domainmodel.Domainmodel.Reaction");
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
    // $ANTLR end "ruleQueryitems"


    // $ANTLR start "entryRuleItem"
    // InternalDomainmodel.g:566:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalDomainmodel.g:566:45: (iv_ruleItem= ruleItem EOF )
            // InternalDomainmodel.g:567:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalDomainmodel.g:573:1: ruleItem returns [EObject current=null] : ( (lv_item_0_0= RULE_STRING ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:579:2: ( ( (lv_item_0_0= RULE_STRING ) ) )
            // InternalDomainmodel.g:580:2: ( (lv_item_0_0= RULE_STRING ) )
            {
            // InternalDomainmodel.g:580:2: ( (lv_item_0_0= RULE_STRING ) )
            // InternalDomainmodel.g:581:3: (lv_item_0_0= RULE_STRING )
            {
            // InternalDomainmodel.g:581:3: (lv_item_0_0= RULE_STRING )
            // InternalDomainmodel.g:582:4: lv_item_0_0= RULE_STRING
            {
            lv_item_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_item_0_0, grammarAccess.getItemAccess().getItemSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getItemRule());
            				}
            				setWithLastConsumed(
            					current,
            					"item",
            					lv_item_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleAddress"
    // InternalDomainmodel.g:601:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalDomainmodel.g:601:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalDomainmodel.g:602:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalDomainmodel.g:608:1: ruleAddress returns [EObject current=null] : ( (lv_address_0_0= RULE_STRING ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token lv_address_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:614:2: ( ( (lv_address_0_0= RULE_STRING ) ) )
            // InternalDomainmodel.g:615:2: ( (lv_address_0_0= RULE_STRING ) )
            {
            // InternalDomainmodel.g:615:2: ( (lv_address_0_0= RULE_STRING ) )
            // InternalDomainmodel.g:616:3: (lv_address_0_0= RULE_STRING )
            {
            // InternalDomainmodel.g:616:3: (lv_address_0_0= RULE_STRING )
            // InternalDomainmodel.g:617:4: lv_address_0_0= RULE_STRING
            {
            lv_address_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_address_0_0, grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAddressRule());
            				}
            				setWithLastConsumed(
            					current,
            					"address",
            					lv_address_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleMaterial"
    // InternalDomainmodel.g:636:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalDomainmodel.g:636:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalDomainmodel.g:637:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
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
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDomainmodel.g:643:1: ruleMaterial returns [EObject current=null] : ( (lv_material_0_0= RULE_STRING ) ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        Token lv_material_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:649:2: ( ( (lv_material_0_0= RULE_STRING ) ) )
            // InternalDomainmodel.g:650:2: ( (lv_material_0_0= RULE_STRING ) )
            {
            // InternalDomainmodel.g:650:2: ( (lv_material_0_0= RULE_STRING ) )
            // InternalDomainmodel.g:651:3: (lv_material_0_0= RULE_STRING )
            {
            // InternalDomainmodel.g:651:3: (lv_material_0_0= RULE_STRING )
            // InternalDomainmodel.g:652:4: lv_material_0_0= RULE_STRING
            {
            lv_material_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_material_0_0, grammarAccess.getMaterialAccess().getMaterialSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMaterialRule());
            				}
            				setWithLastConsumed(
            					current,
            					"material",
            					lv_material_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleCondition"
    // InternalDomainmodel.g:671:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDomainmodel.g:671:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalDomainmodel.g:672:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // InternalDomainmodel.g:678:1: ruleCondition returns [EObject current=null] : ( (lv_condition_0_0= RULE_STRING ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_condition_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:684:2: ( ( (lv_condition_0_0= RULE_STRING ) ) )
            // InternalDomainmodel.g:685:2: ( (lv_condition_0_0= RULE_STRING ) )
            {
            // InternalDomainmodel.g:685:2: ( (lv_condition_0_0= RULE_STRING ) )
            // InternalDomainmodel.g:686:3: (lv_condition_0_0= RULE_STRING )
            {
            // InternalDomainmodel.g:686:3: (lv_condition_0_0= RULE_STRING )
            // InternalDomainmodel.g:687:4: lv_condition_0_0= RULE_STRING
            {
            lv_condition_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_condition_0_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConditionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"condition",
            					lv_condition_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleReaction"
    // InternalDomainmodel.g:706:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // InternalDomainmodel.g:706:49: (iv_ruleReaction= ruleReaction EOF )
            // InternalDomainmodel.g:707:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalDomainmodel.g:713:1: ruleReaction returns [EObject current=null] : ( (lv_reaction_0_0= RULE_STRING ) ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token lv_reaction_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:719:2: ( ( (lv_reaction_0_0= RULE_STRING ) ) )
            // InternalDomainmodel.g:720:2: ( (lv_reaction_0_0= RULE_STRING ) )
            {
            // InternalDomainmodel.g:720:2: ( (lv_reaction_0_0= RULE_STRING ) )
            // InternalDomainmodel.g:721:3: (lv_reaction_0_0= RULE_STRING )
            {
            // InternalDomainmodel.g:721:3: (lv_reaction_0_0= RULE_STRING )
            // InternalDomainmodel.g:722:4: lv_reaction_0_0= RULE_STRING
            {
            lv_reaction_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_reaction_0_0, grammarAccess.getReactionAccess().getReactionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReactionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"reaction",
            					lv_reaction_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleReaction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000A4000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});

}
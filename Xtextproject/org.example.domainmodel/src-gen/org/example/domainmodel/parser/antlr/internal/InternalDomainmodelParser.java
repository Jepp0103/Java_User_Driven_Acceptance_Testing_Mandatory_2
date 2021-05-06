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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "' and '", "' when '", "' to '"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalDomainmodel.g:107:1: ruleDeclaration returns [EObject current=null] : this_Ship_0= ruleShip ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Ship_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:113:2: (this_Ship_0= ruleShip )
            // InternalDomainmodel.g:114:2: this_Ship_0= ruleShip
            {

            		newCompositeNode(grammarAccess.getDeclarationAccess().getShipParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Ship_0=ruleShip();

            state._fsp--;


            		current = this_Ship_0;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleShip"
    // InternalDomainmodel.g:125:1: entryRuleShip returns [EObject current=null] : iv_ruleShip= ruleShip EOF ;
    public final EObject entryRuleShip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShip = null;


        try {
            // InternalDomainmodel.g:125:45: (iv_ruleShip= ruleShip EOF )
            // InternalDomainmodel.g:126:2: iv_ruleShip= ruleShip EOF
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
    // InternalDomainmodel.g:132:1: ruleShip returns [EObject current=null] : (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= ' and ' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= ' when ' ( (lv_action_5_0= ruleAction ) ) ( (lv_action_6_0= ruleItem ) ) otherlv_7= ' to ' ( (lv_address_8_0= ruleAddress ) ) ) ;
    public final EObject ruleShip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_3_0 = null;

        EObject lv_action_5_0 = null;

        EObject lv_action_6_0 = null;

        EObject lv_address_8_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:138:2: ( (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= ' and ' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= ' when ' ( (lv_action_5_0= ruleAction ) ) ( (lv_action_6_0= ruleItem ) ) otherlv_7= ' to ' ( (lv_address_8_0= ruleAddress ) ) ) )
            // InternalDomainmodel.g:139:2: (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= ' and ' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= ' when ' ( (lv_action_5_0= ruleAction ) ) ( (lv_action_6_0= ruleItem ) ) otherlv_7= ' to ' ( (lv_address_8_0= ruleAddress ) ) )
            {
            // InternalDomainmodel.g:139:2: (otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= ' and ' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= ' when ' ( (lv_action_5_0= ruleAction ) ) ( (lv_action_6_0= ruleItem ) ) otherlv_7= ' to ' ( (lv_address_8_0= ruleAddress ) ) )
            // InternalDomainmodel.g:140:3: otherlv_0= 'Given' ( (lv_conditions_1_0= ruleCondition ) ) (otherlv_2= ' and ' ( (lv_conditions_3_0= ruleCondition ) ) )* otherlv_4= ' when ' ( (lv_action_5_0= ruleAction ) ) ( (lv_action_6_0= ruleItem ) ) otherlv_7= ' to ' ( (lv_address_8_0= ruleAddress ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getShipAccess().getGivenKeyword_0());
            		
            // InternalDomainmodel.g:144:3: ( (lv_conditions_1_0= ruleCondition ) )
            // InternalDomainmodel.g:145:4: (lv_conditions_1_0= ruleCondition )
            {
            // InternalDomainmodel.g:145:4: (lv_conditions_1_0= ruleCondition )
            // InternalDomainmodel.g:146:5: lv_conditions_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getShipAccess().getConditionsConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_conditions_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"org.example.domainmodel.Domainmodel.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:163:3: (otherlv_2= ' and ' ( (lv_conditions_3_0= ruleCondition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainmodel.g:164:4: otherlv_2= ' and ' ( (lv_conditions_3_0= ruleCondition ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getShipAccess().getAndKeyword_2_0());
            	    			
            	    // InternalDomainmodel.g:168:4: ( (lv_conditions_3_0= ruleCondition ) )
            	    // InternalDomainmodel.g:169:5: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalDomainmodel.g:169:5: (lv_conditions_3_0= ruleCondition )
            	    // InternalDomainmodel.g:170:6: lv_conditions_3_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getShipAccess().getConditionsConditionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getShipRule());
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

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getShipAccess().getWhenKeyword_3());
            		
            // InternalDomainmodel.g:192:3: ( (lv_action_5_0= ruleAction ) )
            // InternalDomainmodel.g:193:4: (lv_action_5_0= ruleAction )
            {
            // InternalDomainmodel.g:193:4: (lv_action_5_0= ruleAction )
            // InternalDomainmodel.g:194:5: lv_action_5_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getShipAccess().getActionActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_action_5_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_5_0,
            						"org.example.domainmodel.Domainmodel.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:211:3: ( (lv_action_6_0= ruleItem ) )
            // InternalDomainmodel.g:212:4: (lv_action_6_0= ruleItem )
            {
            // InternalDomainmodel.g:212:4: (lv_action_6_0= ruleItem )
            // InternalDomainmodel.g:213:5: lv_action_6_0= ruleItem
            {

            					newCompositeNode(grammarAccess.getShipAccess().getActionItemParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_action_6_0=ruleItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipRule());
            					}
            					add(
            						current,
            						"action",
            						lv_action_6_0,
            						"org.example.domainmodel.Domainmodel.Item");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getShipAccess().getToKeyword_6());
            		
            // InternalDomainmodel.g:234:3: ( (lv_address_8_0= ruleAddress ) )
            // InternalDomainmodel.g:235:4: (lv_address_8_0= ruleAddress )
            {
            // InternalDomainmodel.g:235:4: (lv_address_8_0= ruleAddress )
            // InternalDomainmodel.g:236:5: lv_address_8_0= ruleAddress
            {

            					newCompositeNode(grammarAccess.getShipAccess().getAddressAddressParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_address_8_0=ruleAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShipRule());
            					}
            					add(
            						current,
            						"address",
            						lv_address_8_0,
            						"org.example.domainmodel.Domainmodel.Address");
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
    // $ANTLR end "ruleShip"


    // $ANTLR start "entryRuleItem"
    // InternalDomainmodel.g:257:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalDomainmodel.g:257:45: (iv_ruleItem= ruleItem EOF )
            // InternalDomainmodel.g:258:2: iv_ruleItem= ruleItem EOF
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
    // InternalDomainmodel.g:264:1: ruleItem returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:270:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDomainmodel.g:271:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDomainmodel.g:271:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomainmodel.g:272:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDomainmodel.g:272:3: (lv_name_0_0= RULE_ID )
            // InternalDomainmodel.g:273:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getItemAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getItemRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalDomainmodel.g:292:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalDomainmodel.g:292:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalDomainmodel.g:293:2: iv_ruleAddress= ruleAddress EOF
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
    // InternalDomainmodel.g:299:1: ruleAddress returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:305:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDomainmodel.g:306:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDomainmodel.g:306:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomainmodel.g:307:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDomainmodel.g:307:3: (lv_name_0_0= RULE_ID )
            // InternalDomainmodel.g:308:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAddressAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAddressRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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


    // $ANTLR start "entryRuleCondition"
    // InternalDomainmodel.g:327:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalDomainmodel.g:327:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalDomainmodel.g:328:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalDomainmodel.g:334:1: ruleCondition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:340:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDomainmodel.g:341:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDomainmodel.g:341:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomainmodel.g:342:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDomainmodel.g:342:3: (lv_name_0_0= RULE_ID )
            // InternalDomainmodel.g:343:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConditionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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


    // $ANTLR start "entryRuleAction"
    // InternalDomainmodel.g:362:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDomainmodel.g:362:47: (iv_ruleAction= ruleAction EOF )
            // InternalDomainmodel.g:363:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDomainmodel.g:369:1: ruleAction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:375:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDomainmodel.g:376:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDomainmodel.g:376:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomainmodel.g:377:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDomainmodel.g:377:3: (lv_name_0_0= RULE_ID )
            // InternalDomainmodel.g:378:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}
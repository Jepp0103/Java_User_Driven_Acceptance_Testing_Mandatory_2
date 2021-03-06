/*
 * generated by Xtext 2.25.0
 */
grammar InternalDomainmodel;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.example.domainmodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0());
			}
			lv_declarations_0_0=ruleDeclaration
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"declarations",
					lv_declarations_0_0,
					"org.example.domainmodel.Domainmodel.Declaration");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclarationAccess().getConditionandactionConditionandActionParserRuleCall_0_0());
				}
				lv_conditionandaction_0_0=ruleConditionandAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclarationRule());
					}
					set(
						$current,
						"conditionandaction",
						lv_conditionandaction_0_0,
						"org.example.domainmodel.Domainmodel.ConditionandAction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDeclarationAccess().getStoryStoryParserRuleCall_1_0());
				}
				lv_story_1_0=ruleStory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeclarationRule());
					}
					set(
						$current,
						"story",
						lv_story_1_0,
						"org.example.domainmodel.Domainmodel.Story");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConditionandAction
entryRuleConditionandAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionandActionRule()); }
	iv_ruleConditionandAction=ruleConditionandAction
	{ $current=$iv_ruleConditionandAction.current; }
	EOF;

// Rule ConditionandAction
ruleConditionandAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Given'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionandActionAccess().getGivenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_1_0());
				}
				lv_conditions_1_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionandActionRule());
					}
					add(
						$current,
						"conditions",
						lv_conditions_1_0,
						"org.example.domainmodel.Domainmodel.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getConditionandActionAccess().getAndKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_2_1_0());
					}
					lv_conditions_3_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionandActionRule());
						}
						add(
							$current,
							"conditions",
							lv_conditions_3_0,
							"org.example.domainmodel.Domainmodel.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='when'
		{
			newLeafNode(otherlv_4, grammarAccess.getConditionandActionAccess().getWhenKeyword_3());
		}
	)
;

// Entry rule entryRuleStory
entryRuleStory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStoryRule()); }
	iv_ruleStory=ruleStory
	{ $current=$iv_ruleStory.current; }
	EOF;

// Rule Story
ruleStory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStoryAccess().getShipParserRuleCall_0());
		}
		this_Ship_0=ruleShip
		{
			$current = $this_Ship_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStoryAccess().getOrdermaterialsParserRuleCall_1());
		}
		this_Ordermaterials_1=ruleOrdermaterials
		{
			$current = $this_Ordermaterials_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStoryAccess().getQueryitemsParserRuleCall_2());
		}
		this_Queryitems_2=ruleQueryitems
		{
			$current = $this_Queryitems_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleShip
entryRuleShip returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShipRule()); }
	iv_ruleShip=ruleShip
	{ $current=$iv_ruleShip.current; }
	EOF;

// Rule Ship
ruleShip returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='shipping'
		{
			newLeafNode(otherlv_0, grammarAccess.getShipAccess().getShippingKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShipAccess().getItemItemParserRuleCall_1_0());
				}
				lv_item_1_0=ruleItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShipRule());
					}
					add(
						$current,
						"item",
						lv_item_1_0,
						"org.example.domainmodel.Domainmodel.Item");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='to'
		{
			newLeafNode(otherlv_2, grammarAccess.getShipAccess().getToKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShipAccess().getAddressAddressParserRuleCall_3_0());
				}
				lv_address_3_0=ruleAddress
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShipRule());
					}
					add(
						$current,
						"address",
						lv_address_3_0,
						"org.example.domainmodel.Domainmodel.Address");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='then'
		{
			newLeafNode(otherlv_4, grammarAccess.getShipAccess().getThenKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_5_0());
				}
				lv_reaction_5_0=ruleReaction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShipRule());
					}
					add(
						$current,
						"reaction",
						lv_reaction_5_0,
						"org.example.domainmodel.Domainmodel.Reaction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='and'
			{
				newLeafNode(otherlv_6, grammarAccess.getShipAccess().getAndKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_6_1_0());
					}
					lv_reaction_7_0=ruleReaction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getShipRule());
						}
						add(
							$current,
							"reaction",
							lv_reaction_7_0,
							"org.example.domainmodel.Domainmodel.Reaction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOrdermaterials
entryRuleOrdermaterials returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrdermaterialsRule()); }
	iv_ruleOrdermaterials=ruleOrdermaterials
	{ $current=$iv_ruleOrdermaterials.current; }
	EOF;

// Rule Ordermaterials
ruleOrdermaterials returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ordering'
		{
			newLeafNode(otherlv_0, grammarAccess.getOrdermaterialsAccess().getOrderingKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_1_0());
				}
				lv_material_1_0=ruleMaterial
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOrdermaterialsRule());
					}
					add(
						$current,
						"material",
						lv_material_1_0,
						"org.example.domainmodel.Domainmodel.Material");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getOrdermaterialsAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_2_1_0());
					}
					lv_material_3_0=ruleMaterial
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrdermaterialsRule());
						}
						add(
							$current,
							"material",
							lv_material_3_0,
							"org.example.domainmodel.Domainmodel.Material");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='then'
		{
			newLeafNode(otherlv_4, grammarAccess.getOrdermaterialsAccess().getThenKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOrdermaterialsAccess().getReactionReactionParserRuleCall_4_0());
				}
				lv_reaction_5_0=ruleReaction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOrdermaterialsRule());
					}
					add(
						$current,
						"reaction",
						lv_reaction_5_0,
						"org.example.domainmodel.Domainmodel.Reaction");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQueryitems
entryRuleQueryitems returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQueryitemsRule()); }
	iv_ruleQueryitems=ruleQueryitems
	{ $current=$iv_ruleQueryitems.current; }
	EOF;

// Rule Queryitems
ruleQueryitems returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='querying'
		{
			newLeafNode(otherlv_0, grammarAccess.getQueryitemsAccess().getQueryingKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQueryitemsAccess().getItemItemParserRuleCall_1_0());
				}
				lv_item_1_0=ruleItem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQueryitemsRule());
					}
					add(
						$current,
						"item",
						lv_item_1_0,
						"org.example.domainmodel.Domainmodel.Item");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='then'
		{
			newLeafNode(otherlv_2, grammarAccess.getQueryitemsAccess().getThenKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_3_0());
				}
				lv_reaction_3_0=ruleReaction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQueryitemsRule());
					}
					add(
						$current,
						"reaction",
						lv_reaction_3_0,
						"org.example.domainmodel.Domainmodel.Reaction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='and'
			{
				newLeafNode(otherlv_4, grammarAccess.getQueryitemsAccess().getAndKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_4_1_0());
					}
					lv_reaction_5_0=ruleReaction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQueryitemsRule());
						}
						add(
							$current,
							"reaction",
							lv_reaction_5_0,
							"org.example.domainmodel.Domainmodel.Reaction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleItem
entryRuleItem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getItemRule()); }
	iv_ruleItem=ruleItem
	{ $current=$iv_ruleItem.current; }
	EOF;

// Rule Item
ruleItem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_item_0_0=RULE_STRING
			{
				newLeafNode(lv_item_0_0, grammarAccess.getItemAccess().getItemSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getItemRule());
				}
				setWithLastConsumed(
					$current,
					"item",
					lv_item_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleAddress
entryRuleAddress returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddressRule()); }
	iv_ruleAddress=ruleAddress
	{ $current=$iv_ruleAddress.current; }
	EOF;

// Rule Address
ruleAddress returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_address_0_0=RULE_STRING
			{
				newLeafNode(lv_address_0_0, grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAddressRule());
				}
				setWithLastConsumed(
					$current,
					"address",
					lv_address_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleMaterial
entryRuleMaterial returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMaterialRule()); }
	iv_ruleMaterial=ruleMaterial
	{ $current=$iv_ruleMaterial.current; }
	EOF;

// Rule Material
ruleMaterial returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_material_0_0=RULE_STRING
			{
				newLeafNode(lv_material_0_0, grammarAccess.getMaterialAccess().getMaterialSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getMaterialRule());
				}
				setWithLastConsumed(
					$current,
					"material",
					lv_material_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_condition_0_0=RULE_STRING
			{
				newLeafNode(lv_condition_0_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConditionRule());
				}
				setWithLastConsumed(
					$current,
					"condition",
					lv_condition_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleReaction
entryRuleReaction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReactionRule()); }
	iv_ruleReaction=ruleReaction
	{ $current=$iv_ruleReaction.current; }
	EOF;

// Rule Reaction
ruleReaction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_reaction_0_0=RULE_STRING
			{
				newLeafNode(lv_reaction_0_0, grammarAccess.getReactionAccess().getReactionSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getReactionRule());
				}
				setWithLastConsumed(
					$current,
					"reaction",
					lv_reaction_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

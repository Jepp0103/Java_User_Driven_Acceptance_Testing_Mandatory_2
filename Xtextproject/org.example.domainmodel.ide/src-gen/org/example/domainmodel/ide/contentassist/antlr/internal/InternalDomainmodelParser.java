package org.example.domainmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "'when'", "'and'", "'shipping'", "'to'", "'then'", "'ordering'", "','", "'querying'"
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

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
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
    // InternalDomainmodel.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleModel EOF )
            // InternalDomainmodel.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDomainmodel.g:62:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // InternalDomainmodel.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            // InternalDomainmodel.g:68:3: ( rule__Model__DeclarationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            // InternalDomainmodel.g:69:3: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:69:4: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DeclarationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment()); 

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


    // $ANTLR start "entryRuleDeclaration"
    // InternalDomainmodel.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( ruleDeclaration EOF )
            // InternalDomainmodel.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDomainmodel.g:87:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__Declaration__Group__0 ) )
            // InternalDomainmodel.g:93:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalDomainmodel.g:94:3: ( rule__Declaration__Group__0 )
            // InternalDomainmodel.g:94:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleConditionandAction"
    // InternalDomainmodel.g:103:1: entryRuleConditionandAction : ruleConditionandAction EOF ;
    public final void entryRuleConditionandAction() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleConditionandAction EOF )
            // InternalDomainmodel.g:105:1: ruleConditionandAction EOF
            {
             before(grammarAccess.getConditionandActionRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionandAction();

            state._fsp--;

             after(grammarAccess.getConditionandActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionandAction"


    // $ANTLR start "ruleConditionandAction"
    // InternalDomainmodel.g:112:1: ruleConditionandAction : ( ( rule__ConditionandAction__Group__0 ) ) ;
    public final void ruleConditionandAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__ConditionandAction__Group__0 ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__ConditionandAction__Group__0 ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__ConditionandAction__Group__0 ) )
            // InternalDomainmodel.g:118:3: ( rule__ConditionandAction__Group__0 )
            {
             before(grammarAccess.getConditionandActionAccess().getGroup()); 
            // InternalDomainmodel.g:119:3: ( rule__ConditionandAction__Group__0 )
            // InternalDomainmodel.g:119:4: rule__ConditionandAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionandAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionandActionAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionandAction"


    // $ANTLR start "entryRuleStory"
    // InternalDomainmodel.g:128:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleStory EOF )
            // InternalDomainmodel.g:130:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalDomainmodel.g:137:1: ruleStory : ( ( rule__Story__Alternatives ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__Story__Alternatives ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__Story__Alternatives ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__Story__Alternatives ) )
            // InternalDomainmodel.g:143:3: ( rule__Story__Alternatives )
            {
             before(grammarAccess.getStoryAccess().getAlternatives()); 
            // InternalDomainmodel.g:144:3: ( rule__Story__Alternatives )
            // InternalDomainmodel.g:144:4: rule__Story__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Story__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleShip"
    // InternalDomainmodel.g:153:1: entryRuleShip : ruleShip EOF ;
    public final void entryRuleShip() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleShip EOF )
            // InternalDomainmodel.g:155:1: ruleShip EOF
            {
             before(grammarAccess.getShipRule()); 
            pushFollow(FOLLOW_1);
            ruleShip();

            state._fsp--;

             after(grammarAccess.getShipRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShip"


    // $ANTLR start "ruleShip"
    // InternalDomainmodel.g:162:1: ruleShip : ( ( rule__Ship__Group__0 ) ) ;
    public final void ruleShip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__Ship__Group__0 ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__Ship__Group__0 ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__Ship__Group__0 ) )
            // InternalDomainmodel.g:168:3: ( rule__Ship__Group__0 )
            {
             before(grammarAccess.getShipAccess().getGroup()); 
            // InternalDomainmodel.g:169:3: ( rule__Ship__Group__0 )
            // InternalDomainmodel.g:169:4: rule__Ship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getGroup()); 

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
    // $ANTLR end "ruleShip"


    // $ANTLR start "entryRuleOrdermaterials"
    // InternalDomainmodel.g:178:1: entryRuleOrdermaterials : ruleOrdermaterials EOF ;
    public final void entryRuleOrdermaterials() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleOrdermaterials EOF )
            // InternalDomainmodel.g:180:1: ruleOrdermaterials EOF
            {
             before(grammarAccess.getOrdermaterialsRule()); 
            pushFollow(FOLLOW_1);
            ruleOrdermaterials();

            state._fsp--;

             after(grammarAccess.getOrdermaterialsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrdermaterials"


    // $ANTLR start "ruleOrdermaterials"
    // InternalDomainmodel.g:187:1: ruleOrdermaterials : ( ( rule__Ordermaterials__Group__0 ) ) ;
    public final void ruleOrdermaterials() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__Ordermaterials__Group__0 ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__Ordermaterials__Group__0 ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__Ordermaterials__Group__0 ) )
            // InternalDomainmodel.g:193:3: ( rule__Ordermaterials__Group__0 )
            {
             before(grammarAccess.getOrdermaterialsAccess().getGroup()); 
            // InternalDomainmodel.g:194:3: ( rule__Ordermaterials__Group__0 )
            // InternalDomainmodel.g:194:4: rule__Ordermaterials__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrdermaterialsAccess().getGroup()); 

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
    // $ANTLR end "ruleOrdermaterials"


    // $ANTLR start "entryRuleQueryitems"
    // InternalDomainmodel.g:203:1: entryRuleQueryitems : ruleQueryitems EOF ;
    public final void entryRuleQueryitems() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( ruleQueryitems EOF )
            // InternalDomainmodel.g:205:1: ruleQueryitems EOF
            {
             before(grammarAccess.getQueryitemsRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryitems();

            state._fsp--;

             after(grammarAccess.getQueryitemsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQueryitems"


    // $ANTLR start "ruleQueryitems"
    // InternalDomainmodel.g:212:1: ruleQueryitems : ( ( rule__Queryitems__Group__0 ) ) ;
    public final void ruleQueryitems() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__Queryitems__Group__0 ) ) )
            // InternalDomainmodel.g:217:2: ( ( rule__Queryitems__Group__0 ) )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__Queryitems__Group__0 ) )
            // InternalDomainmodel.g:218:3: ( rule__Queryitems__Group__0 )
            {
             before(grammarAccess.getQueryitemsAccess().getGroup()); 
            // InternalDomainmodel.g:219:3: ( rule__Queryitems__Group__0 )
            // InternalDomainmodel.g:219:4: rule__Queryitems__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Queryitems__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryitemsAccess().getGroup()); 

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
    // $ANTLR end "ruleQueryitems"


    // $ANTLR start "entryRuleItem"
    // InternalDomainmodel.g:228:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalDomainmodel.g:229:1: ( ruleItem EOF )
            // InternalDomainmodel.g:230:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalDomainmodel.g:237:1: ruleItem : ( ( rule__Item__ItemAssignment ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:241:2: ( ( ( rule__Item__ItemAssignment ) ) )
            // InternalDomainmodel.g:242:2: ( ( rule__Item__ItemAssignment ) )
            {
            // InternalDomainmodel.g:242:2: ( ( rule__Item__ItemAssignment ) )
            // InternalDomainmodel.g:243:3: ( rule__Item__ItemAssignment )
            {
             before(grammarAccess.getItemAccess().getItemAssignment()); 
            // InternalDomainmodel.g:244:3: ( rule__Item__ItemAssignment )
            // InternalDomainmodel.g:244:4: rule__Item__ItemAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Item__ItemAssignment();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getItemAssignment()); 

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleAddress"
    // InternalDomainmodel.g:253:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalDomainmodel.g:254:1: ( ruleAddress EOF )
            // InternalDomainmodel.g:255:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalDomainmodel.g:262:1: ruleAddress : ( ( rule__Address__AddressAssignment ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:266:2: ( ( ( rule__Address__AddressAssignment ) ) )
            // InternalDomainmodel.g:267:2: ( ( rule__Address__AddressAssignment ) )
            {
            // InternalDomainmodel.g:267:2: ( ( rule__Address__AddressAssignment ) )
            // InternalDomainmodel.g:268:3: ( rule__Address__AddressAssignment )
            {
             before(grammarAccess.getAddressAccess().getAddressAssignment()); 
            // InternalDomainmodel.g:269:3: ( rule__Address__AddressAssignment )
            // InternalDomainmodel.g:269:4: rule__Address__AddressAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Address__AddressAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getAddressAssignment()); 

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
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleMaterial"
    // InternalDomainmodel.g:278:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalDomainmodel.g:279:1: ( ruleMaterial EOF )
            // InternalDomainmodel.g:280:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDomainmodel.g:287:1: ruleMaterial : ( ( rule__Material__MaterialAssignment ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:291:2: ( ( ( rule__Material__MaterialAssignment ) ) )
            // InternalDomainmodel.g:292:2: ( ( rule__Material__MaterialAssignment ) )
            {
            // InternalDomainmodel.g:292:2: ( ( rule__Material__MaterialAssignment ) )
            // InternalDomainmodel.g:293:3: ( rule__Material__MaterialAssignment )
            {
             before(grammarAccess.getMaterialAccess().getMaterialAssignment()); 
            // InternalDomainmodel.g:294:3: ( rule__Material__MaterialAssignment )
            // InternalDomainmodel.g:294:4: rule__Material__MaterialAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Material__MaterialAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getMaterialAssignment()); 

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
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleCondition"
    // InternalDomainmodel.g:303:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalDomainmodel.g:304:1: ( ruleCondition EOF )
            // InternalDomainmodel.g:305:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalDomainmodel.g:312:1: ruleCondition : ( ( rule__Condition__ConditionAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:316:2: ( ( ( rule__Condition__ConditionAssignment ) ) )
            // InternalDomainmodel.g:317:2: ( ( rule__Condition__ConditionAssignment ) )
            {
            // InternalDomainmodel.g:317:2: ( ( rule__Condition__ConditionAssignment ) )
            // InternalDomainmodel.g:318:3: ( rule__Condition__ConditionAssignment )
            {
             before(grammarAccess.getConditionAccess().getConditionAssignment()); 
            // InternalDomainmodel.g:319:3: ( rule__Condition__ConditionAssignment )
            // InternalDomainmodel.g:319:4: rule__Condition__ConditionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ConditionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getConditionAssignment()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleReaction"
    // InternalDomainmodel.g:328:1: entryRuleReaction : ruleReaction EOF ;
    public final void entryRuleReaction() throws RecognitionException {
        try {
            // InternalDomainmodel.g:329:1: ( ruleReaction EOF )
            // InternalDomainmodel.g:330:1: ruleReaction EOF
            {
             before(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getReactionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalDomainmodel.g:337:1: ruleReaction : ( ( rule__Reaction__ReactionAssignment ) ) ;
    public final void ruleReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:341:2: ( ( ( rule__Reaction__ReactionAssignment ) ) )
            // InternalDomainmodel.g:342:2: ( ( rule__Reaction__ReactionAssignment ) )
            {
            // InternalDomainmodel.g:342:2: ( ( rule__Reaction__ReactionAssignment ) )
            // InternalDomainmodel.g:343:3: ( rule__Reaction__ReactionAssignment )
            {
             before(grammarAccess.getReactionAccess().getReactionAssignment()); 
            // InternalDomainmodel.g:344:3: ( rule__Reaction__ReactionAssignment )
            // InternalDomainmodel.g:344:4: rule__Reaction__ReactionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__ReactionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getReactionAssignment()); 

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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "rule__Story__Alternatives"
    // InternalDomainmodel.g:352:1: rule__Story__Alternatives : ( ( ruleShip ) | ( ruleOrdermaterials ) | ( ruleQueryitems ) );
    public final void rule__Story__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:356:1: ( ( ruleShip ) | ( ruleOrdermaterials ) | ( ruleQueryitems ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:357:2: ( ruleShip )
                    {
                    // InternalDomainmodel.g:357:2: ( ruleShip )
                    // InternalDomainmodel.g:358:3: ruleShip
                    {
                     before(grammarAccess.getStoryAccess().getShipParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleShip();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getShipParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:363:2: ( ruleOrdermaterials )
                    {
                    // InternalDomainmodel.g:363:2: ( ruleOrdermaterials )
                    // InternalDomainmodel.g:364:3: ruleOrdermaterials
                    {
                     before(grammarAccess.getStoryAccess().getOrdermaterialsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOrdermaterials();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getOrdermaterialsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:369:2: ( ruleQueryitems )
                    {
                    // InternalDomainmodel.g:369:2: ( ruleQueryitems )
                    // InternalDomainmodel.g:370:3: ruleQueryitems
                    {
                     before(grammarAccess.getStoryAccess().getQueryitemsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryitems();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getQueryitemsParserRuleCall_2()); 

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
    // $ANTLR end "rule__Story__Alternatives"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalDomainmodel.g:379:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:383:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalDomainmodel.g:384:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

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
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalDomainmodel.g:391:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__ConditionandactionAssignment_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:395:1: ( ( ( rule__Declaration__ConditionandactionAssignment_0 ) ) )
            // InternalDomainmodel.g:396:1: ( ( rule__Declaration__ConditionandactionAssignment_0 ) )
            {
            // InternalDomainmodel.g:396:1: ( ( rule__Declaration__ConditionandactionAssignment_0 ) )
            // InternalDomainmodel.g:397:2: ( rule__Declaration__ConditionandactionAssignment_0 )
            {
             before(grammarAccess.getDeclarationAccess().getConditionandactionAssignment_0()); 
            // InternalDomainmodel.g:398:2: ( rule__Declaration__ConditionandactionAssignment_0 )
            // InternalDomainmodel.g:398:3: rule__Declaration__ConditionandactionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ConditionandactionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getConditionandactionAssignment_0()); 

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
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalDomainmodel.g:406:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:410:1: ( rule__Declaration__Group__1__Impl )
            // InternalDomainmodel.g:411:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1__Impl();

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
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalDomainmodel.g:417:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__StoryAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:421:1: ( ( ( rule__Declaration__StoryAssignment_1 ) ) )
            // InternalDomainmodel.g:422:1: ( ( rule__Declaration__StoryAssignment_1 ) )
            {
            // InternalDomainmodel.g:422:1: ( ( rule__Declaration__StoryAssignment_1 ) )
            // InternalDomainmodel.g:423:2: ( rule__Declaration__StoryAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getStoryAssignment_1()); 
            // InternalDomainmodel.g:424:2: ( rule__Declaration__StoryAssignment_1 )
            // InternalDomainmodel.g:424:3: rule__Declaration__StoryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__StoryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getStoryAssignment_1()); 

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
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__ConditionandAction__Group__0"
    // InternalDomainmodel.g:433:1: rule__ConditionandAction__Group__0 : rule__ConditionandAction__Group__0__Impl rule__ConditionandAction__Group__1 ;
    public final void rule__ConditionandAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:437:1: ( rule__ConditionandAction__Group__0__Impl rule__ConditionandAction__Group__1 )
            // InternalDomainmodel.g:438:2: rule__ConditionandAction__Group__0__Impl rule__ConditionandAction__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ConditionandAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionandAction__Group__1();

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
    // $ANTLR end "rule__ConditionandAction__Group__0"


    // $ANTLR start "rule__ConditionandAction__Group__0__Impl"
    // InternalDomainmodel.g:445:1: rule__ConditionandAction__Group__0__Impl : ( 'Given' ) ;
    public final void rule__ConditionandAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:449:1: ( ( 'Given' ) )
            // InternalDomainmodel.g:450:1: ( 'Given' )
            {
            // InternalDomainmodel.g:450:1: ( 'Given' )
            // InternalDomainmodel.g:451:2: 'Given'
            {
             before(grammarAccess.getConditionandActionAccess().getGivenKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConditionandActionAccess().getGivenKeyword_0()); 

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
    // $ANTLR end "rule__ConditionandAction__Group__0__Impl"


    // $ANTLR start "rule__ConditionandAction__Group__1"
    // InternalDomainmodel.g:460:1: rule__ConditionandAction__Group__1 : rule__ConditionandAction__Group__1__Impl rule__ConditionandAction__Group__2 ;
    public final void rule__ConditionandAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:464:1: ( rule__ConditionandAction__Group__1__Impl rule__ConditionandAction__Group__2 )
            // InternalDomainmodel.g:465:2: rule__ConditionandAction__Group__1__Impl rule__ConditionandAction__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ConditionandAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionandAction__Group__2();

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
    // $ANTLR end "rule__ConditionandAction__Group__1"


    // $ANTLR start "rule__ConditionandAction__Group__1__Impl"
    // InternalDomainmodel.g:472:1: rule__ConditionandAction__Group__1__Impl : ( ( rule__ConditionandAction__ConditionsAssignment_1 ) ) ;
    public final void rule__ConditionandAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:476:1: ( ( ( rule__ConditionandAction__ConditionsAssignment_1 ) ) )
            // InternalDomainmodel.g:477:1: ( ( rule__ConditionandAction__ConditionsAssignment_1 ) )
            {
            // InternalDomainmodel.g:477:1: ( ( rule__ConditionandAction__ConditionsAssignment_1 ) )
            // InternalDomainmodel.g:478:2: ( rule__ConditionandAction__ConditionsAssignment_1 )
            {
             before(grammarAccess.getConditionandActionAccess().getConditionsAssignment_1()); 
            // InternalDomainmodel.g:479:2: ( rule__ConditionandAction__ConditionsAssignment_1 )
            // InternalDomainmodel.g:479:3: rule__ConditionandAction__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionandAction__ConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionandActionAccess().getConditionsAssignment_1()); 

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
    // $ANTLR end "rule__ConditionandAction__Group__1__Impl"


    // $ANTLR start "rule__ConditionandAction__Group__2"
    // InternalDomainmodel.g:487:1: rule__ConditionandAction__Group__2 : rule__ConditionandAction__Group__2__Impl rule__ConditionandAction__Group__3 ;
    public final void rule__ConditionandAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:491:1: ( rule__ConditionandAction__Group__2__Impl rule__ConditionandAction__Group__3 )
            // InternalDomainmodel.g:492:2: rule__ConditionandAction__Group__2__Impl rule__ConditionandAction__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ConditionandAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionandAction__Group__3();

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
    // $ANTLR end "rule__ConditionandAction__Group__2"


    // $ANTLR start "rule__ConditionandAction__Group__2__Impl"
    // InternalDomainmodel.g:499:1: rule__ConditionandAction__Group__2__Impl : ( ( rule__ConditionandAction__Group_2__0 )* ) ;
    public final void rule__ConditionandAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:503:1: ( ( ( rule__ConditionandAction__Group_2__0 )* ) )
            // InternalDomainmodel.g:504:1: ( ( rule__ConditionandAction__Group_2__0 )* )
            {
            // InternalDomainmodel.g:504:1: ( ( rule__ConditionandAction__Group_2__0 )* )
            // InternalDomainmodel.g:505:2: ( rule__ConditionandAction__Group_2__0 )*
            {
             before(grammarAccess.getConditionandActionAccess().getGroup_2()); 
            // InternalDomainmodel.g:506:2: ( rule__ConditionandAction__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainmodel.g:506:3: rule__ConditionandAction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ConditionandAction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getConditionandActionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ConditionandAction__Group__2__Impl"


    // $ANTLR start "rule__ConditionandAction__Group__3"
    // InternalDomainmodel.g:514:1: rule__ConditionandAction__Group__3 : rule__ConditionandAction__Group__3__Impl ;
    public final void rule__ConditionandAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:518:1: ( rule__ConditionandAction__Group__3__Impl )
            // InternalDomainmodel.g:519:2: rule__ConditionandAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionandAction__Group__3__Impl();

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
    // $ANTLR end "rule__ConditionandAction__Group__3"


    // $ANTLR start "rule__ConditionandAction__Group__3__Impl"
    // InternalDomainmodel.g:525:1: rule__ConditionandAction__Group__3__Impl : ( 'when' ) ;
    public final void rule__ConditionandAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:529:1: ( ( 'when' ) )
            // InternalDomainmodel.g:530:1: ( 'when' )
            {
            // InternalDomainmodel.g:530:1: ( 'when' )
            // InternalDomainmodel.g:531:2: 'when'
            {
             before(grammarAccess.getConditionandActionAccess().getWhenKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConditionandActionAccess().getWhenKeyword_3()); 

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
    // $ANTLR end "rule__ConditionandAction__Group__3__Impl"


    // $ANTLR start "rule__ConditionandAction__Group_2__0"
    // InternalDomainmodel.g:541:1: rule__ConditionandAction__Group_2__0 : rule__ConditionandAction__Group_2__0__Impl rule__ConditionandAction__Group_2__1 ;
    public final void rule__ConditionandAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:545:1: ( rule__ConditionandAction__Group_2__0__Impl rule__ConditionandAction__Group_2__1 )
            // InternalDomainmodel.g:546:2: rule__ConditionandAction__Group_2__0__Impl rule__ConditionandAction__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ConditionandAction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionandAction__Group_2__1();

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
    // $ANTLR end "rule__ConditionandAction__Group_2__0"


    // $ANTLR start "rule__ConditionandAction__Group_2__0__Impl"
    // InternalDomainmodel.g:553:1: rule__ConditionandAction__Group_2__0__Impl : ( 'and' ) ;
    public final void rule__ConditionandAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:557:1: ( ( 'and' ) )
            // InternalDomainmodel.g:558:1: ( 'and' )
            {
            // InternalDomainmodel.g:558:1: ( 'and' )
            // InternalDomainmodel.g:559:2: 'and'
            {
             before(grammarAccess.getConditionandActionAccess().getAndKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConditionandActionAccess().getAndKeyword_2_0()); 

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
    // $ANTLR end "rule__ConditionandAction__Group_2__0__Impl"


    // $ANTLR start "rule__ConditionandAction__Group_2__1"
    // InternalDomainmodel.g:568:1: rule__ConditionandAction__Group_2__1 : rule__ConditionandAction__Group_2__1__Impl ;
    public final void rule__ConditionandAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:572:1: ( rule__ConditionandAction__Group_2__1__Impl )
            // InternalDomainmodel.g:573:2: rule__ConditionandAction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionandAction__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConditionandAction__Group_2__1"


    // $ANTLR start "rule__ConditionandAction__Group_2__1__Impl"
    // InternalDomainmodel.g:579:1: rule__ConditionandAction__Group_2__1__Impl : ( ( rule__ConditionandAction__ConditionsAssignment_2_1 ) ) ;
    public final void rule__ConditionandAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:583:1: ( ( ( rule__ConditionandAction__ConditionsAssignment_2_1 ) ) )
            // InternalDomainmodel.g:584:1: ( ( rule__ConditionandAction__ConditionsAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:584:1: ( ( rule__ConditionandAction__ConditionsAssignment_2_1 ) )
            // InternalDomainmodel.g:585:2: ( rule__ConditionandAction__ConditionsAssignment_2_1 )
            {
             before(grammarAccess.getConditionandActionAccess().getConditionsAssignment_2_1()); 
            // InternalDomainmodel.g:586:2: ( rule__ConditionandAction__ConditionsAssignment_2_1 )
            // InternalDomainmodel.g:586:3: rule__ConditionandAction__ConditionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionandAction__ConditionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionandActionAccess().getConditionsAssignment_2_1()); 

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
    // $ANTLR end "rule__ConditionandAction__Group_2__1__Impl"


    // $ANTLR start "rule__Ship__Group__0"
    // InternalDomainmodel.g:595:1: rule__Ship__Group__0 : rule__Ship__Group__0__Impl rule__Ship__Group__1 ;
    public final void rule__Ship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:599:1: ( rule__Ship__Group__0__Impl rule__Ship__Group__1 )
            // InternalDomainmodel.g:600:2: rule__Ship__Group__0__Impl rule__Ship__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Ship__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group__1();

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
    // $ANTLR end "rule__Ship__Group__0"


    // $ANTLR start "rule__Ship__Group__0__Impl"
    // InternalDomainmodel.g:607:1: rule__Ship__Group__0__Impl : ( 'shipping' ) ;
    public final void rule__Ship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:611:1: ( ( 'shipping' ) )
            // InternalDomainmodel.g:612:1: ( 'shipping' )
            {
            // InternalDomainmodel.g:612:1: ( 'shipping' )
            // InternalDomainmodel.g:613:2: 'shipping'
            {
             before(grammarAccess.getShipAccess().getShippingKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getShippingKeyword_0()); 

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
    // $ANTLR end "rule__Ship__Group__0__Impl"


    // $ANTLR start "rule__Ship__Group__1"
    // InternalDomainmodel.g:622:1: rule__Ship__Group__1 : rule__Ship__Group__1__Impl rule__Ship__Group__2 ;
    public final void rule__Ship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:626:1: ( rule__Ship__Group__1__Impl rule__Ship__Group__2 )
            // InternalDomainmodel.g:627:2: rule__Ship__Group__1__Impl rule__Ship__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Ship__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group__2();

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
    // $ANTLR end "rule__Ship__Group__1"


    // $ANTLR start "rule__Ship__Group__1__Impl"
    // InternalDomainmodel.g:634:1: rule__Ship__Group__1__Impl : ( ( rule__Ship__ItemAssignment_1 ) ) ;
    public final void rule__Ship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:638:1: ( ( ( rule__Ship__ItemAssignment_1 ) ) )
            // InternalDomainmodel.g:639:1: ( ( rule__Ship__ItemAssignment_1 ) )
            {
            // InternalDomainmodel.g:639:1: ( ( rule__Ship__ItemAssignment_1 ) )
            // InternalDomainmodel.g:640:2: ( rule__Ship__ItemAssignment_1 )
            {
             before(grammarAccess.getShipAccess().getItemAssignment_1()); 
            // InternalDomainmodel.g:641:2: ( rule__Ship__ItemAssignment_1 )
            // InternalDomainmodel.g:641:3: rule__Ship__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ship__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getItemAssignment_1()); 

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
    // $ANTLR end "rule__Ship__Group__1__Impl"


    // $ANTLR start "rule__Ship__Group__2"
    // InternalDomainmodel.g:649:1: rule__Ship__Group__2 : rule__Ship__Group__2__Impl rule__Ship__Group__3 ;
    public final void rule__Ship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:653:1: ( rule__Ship__Group__2__Impl rule__Ship__Group__3 )
            // InternalDomainmodel.g:654:2: rule__Ship__Group__2__Impl rule__Ship__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Ship__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group__3();

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
    // $ANTLR end "rule__Ship__Group__2"


    // $ANTLR start "rule__Ship__Group__2__Impl"
    // InternalDomainmodel.g:661:1: rule__Ship__Group__2__Impl : ( 'to' ) ;
    public final void rule__Ship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:665:1: ( ( 'to' ) )
            // InternalDomainmodel.g:666:1: ( 'to' )
            {
            // InternalDomainmodel.g:666:1: ( 'to' )
            // InternalDomainmodel.g:667:2: 'to'
            {
             before(grammarAccess.getShipAccess().getToKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Ship__Group__2__Impl"


    // $ANTLR start "rule__Ship__Group__3"
    // InternalDomainmodel.g:676:1: rule__Ship__Group__3 : rule__Ship__Group__3__Impl rule__Ship__Group__4 ;
    public final void rule__Ship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:680:1: ( rule__Ship__Group__3__Impl rule__Ship__Group__4 )
            // InternalDomainmodel.g:681:2: rule__Ship__Group__3__Impl rule__Ship__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Ship__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group__4();

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
    // $ANTLR end "rule__Ship__Group__3"


    // $ANTLR start "rule__Ship__Group__3__Impl"
    // InternalDomainmodel.g:688:1: rule__Ship__Group__3__Impl : ( ( rule__Ship__AddressAssignment_3 ) ) ;
    public final void rule__Ship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:692:1: ( ( ( rule__Ship__AddressAssignment_3 ) ) )
            // InternalDomainmodel.g:693:1: ( ( rule__Ship__AddressAssignment_3 ) )
            {
            // InternalDomainmodel.g:693:1: ( ( rule__Ship__AddressAssignment_3 ) )
            // InternalDomainmodel.g:694:2: ( rule__Ship__AddressAssignment_3 )
            {
             before(grammarAccess.getShipAccess().getAddressAssignment_3()); 
            // InternalDomainmodel.g:695:2: ( rule__Ship__AddressAssignment_3 )
            // InternalDomainmodel.g:695:3: rule__Ship__AddressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ship__AddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getAddressAssignment_3()); 

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
    // $ANTLR end "rule__Ship__Group__3__Impl"


    // $ANTLR start "rule__Ship__Group__4"
    // InternalDomainmodel.g:703:1: rule__Ship__Group__4 : rule__Ship__Group__4__Impl rule__Ship__Group__5 ;
    public final void rule__Ship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:707:1: ( rule__Ship__Group__4__Impl rule__Ship__Group__5 )
            // InternalDomainmodel.g:708:2: rule__Ship__Group__4__Impl rule__Ship__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Ship__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group__5();

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
    // $ANTLR end "rule__Ship__Group__4"


    // $ANTLR start "rule__Ship__Group__4__Impl"
    // InternalDomainmodel.g:715:1: rule__Ship__Group__4__Impl : ( 'then' ) ;
    public final void rule__Ship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:719:1: ( ( 'then' ) )
            // InternalDomainmodel.g:720:1: ( 'then' )
            {
            // InternalDomainmodel.g:720:1: ( 'then' )
            // InternalDomainmodel.g:721:2: 'then'
            {
             before(grammarAccess.getShipAccess().getThenKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getThenKeyword_4()); 

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
    // $ANTLR end "rule__Ship__Group__4__Impl"


    // $ANTLR start "rule__Ship__Group__5"
    // InternalDomainmodel.g:730:1: rule__Ship__Group__5 : rule__Ship__Group__5__Impl rule__Ship__Group__6 ;
    public final void rule__Ship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:734:1: ( rule__Ship__Group__5__Impl rule__Ship__Group__6 )
            // InternalDomainmodel.g:735:2: rule__Ship__Group__5__Impl rule__Ship__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Ship__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group__6();

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
    // $ANTLR end "rule__Ship__Group__5"


    // $ANTLR start "rule__Ship__Group__5__Impl"
    // InternalDomainmodel.g:742:1: rule__Ship__Group__5__Impl : ( ( rule__Ship__ReactionAssignment_5 ) ) ;
    public final void rule__Ship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:746:1: ( ( ( rule__Ship__ReactionAssignment_5 ) ) )
            // InternalDomainmodel.g:747:1: ( ( rule__Ship__ReactionAssignment_5 ) )
            {
            // InternalDomainmodel.g:747:1: ( ( rule__Ship__ReactionAssignment_5 ) )
            // InternalDomainmodel.g:748:2: ( rule__Ship__ReactionAssignment_5 )
            {
             before(grammarAccess.getShipAccess().getReactionAssignment_5()); 
            // InternalDomainmodel.g:749:2: ( rule__Ship__ReactionAssignment_5 )
            // InternalDomainmodel.g:749:3: rule__Ship__ReactionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Ship__ReactionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getReactionAssignment_5()); 

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
    // $ANTLR end "rule__Ship__Group__5__Impl"


    // $ANTLR start "rule__Ship__Group__6"
    // InternalDomainmodel.g:757:1: rule__Ship__Group__6 : rule__Ship__Group__6__Impl ;
    public final void rule__Ship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:761:1: ( rule__Ship__Group__6__Impl )
            // InternalDomainmodel.g:762:2: rule__Ship__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ship__Group__6__Impl();

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
    // $ANTLR end "rule__Ship__Group__6"


    // $ANTLR start "rule__Ship__Group__6__Impl"
    // InternalDomainmodel.g:768:1: rule__Ship__Group__6__Impl : ( ( rule__Ship__Group_6__0 )* ) ;
    public final void rule__Ship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:772:1: ( ( ( rule__Ship__Group_6__0 )* ) )
            // InternalDomainmodel.g:773:1: ( ( rule__Ship__Group_6__0 )* )
            {
            // InternalDomainmodel.g:773:1: ( ( rule__Ship__Group_6__0 )* )
            // InternalDomainmodel.g:774:2: ( rule__Ship__Group_6__0 )*
            {
             before(grammarAccess.getShipAccess().getGroup_6()); 
            // InternalDomainmodel.g:775:2: ( rule__Ship__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:775:3: rule__Ship__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Ship__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getShipAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Ship__Group__6__Impl"


    // $ANTLR start "rule__Ship__Group_6__0"
    // InternalDomainmodel.g:784:1: rule__Ship__Group_6__0 : rule__Ship__Group_6__0__Impl rule__Ship__Group_6__1 ;
    public final void rule__Ship__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:788:1: ( rule__Ship__Group_6__0__Impl rule__Ship__Group_6__1 )
            // InternalDomainmodel.g:789:2: rule__Ship__Group_6__0__Impl rule__Ship__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Ship__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group_6__1();

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
    // $ANTLR end "rule__Ship__Group_6__0"


    // $ANTLR start "rule__Ship__Group_6__0__Impl"
    // InternalDomainmodel.g:796:1: rule__Ship__Group_6__0__Impl : ( 'and' ) ;
    public final void rule__Ship__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:800:1: ( ( 'and' ) )
            // InternalDomainmodel.g:801:1: ( 'and' )
            {
            // InternalDomainmodel.g:801:1: ( 'and' )
            // InternalDomainmodel.g:802:2: 'and'
            {
             before(grammarAccess.getShipAccess().getAndKeyword_6_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getAndKeyword_6_0()); 

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
    // $ANTLR end "rule__Ship__Group_6__0__Impl"


    // $ANTLR start "rule__Ship__Group_6__1"
    // InternalDomainmodel.g:811:1: rule__Ship__Group_6__1 : rule__Ship__Group_6__1__Impl ;
    public final void rule__Ship__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:815:1: ( rule__Ship__Group_6__1__Impl )
            // InternalDomainmodel.g:816:2: rule__Ship__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ship__Group_6__1__Impl();

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
    // $ANTLR end "rule__Ship__Group_6__1"


    // $ANTLR start "rule__Ship__Group_6__1__Impl"
    // InternalDomainmodel.g:822:1: rule__Ship__Group_6__1__Impl : ( ( rule__Ship__ReactionAssignment_6_1 ) ) ;
    public final void rule__Ship__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:826:1: ( ( ( rule__Ship__ReactionAssignment_6_1 ) ) )
            // InternalDomainmodel.g:827:1: ( ( rule__Ship__ReactionAssignment_6_1 ) )
            {
            // InternalDomainmodel.g:827:1: ( ( rule__Ship__ReactionAssignment_6_1 ) )
            // InternalDomainmodel.g:828:2: ( rule__Ship__ReactionAssignment_6_1 )
            {
             before(grammarAccess.getShipAccess().getReactionAssignment_6_1()); 
            // InternalDomainmodel.g:829:2: ( rule__Ship__ReactionAssignment_6_1 )
            // InternalDomainmodel.g:829:3: rule__Ship__ReactionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Ship__ReactionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getReactionAssignment_6_1()); 

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
    // $ANTLR end "rule__Ship__Group_6__1__Impl"


    // $ANTLR start "rule__Ordermaterials__Group__0"
    // InternalDomainmodel.g:838:1: rule__Ordermaterials__Group__0 : rule__Ordermaterials__Group__0__Impl rule__Ordermaterials__Group__1 ;
    public final void rule__Ordermaterials__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:842:1: ( rule__Ordermaterials__Group__0__Impl rule__Ordermaterials__Group__1 )
            // InternalDomainmodel.g:843:2: rule__Ordermaterials__Group__0__Impl rule__Ordermaterials__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Ordermaterials__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group__1();

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
    // $ANTLR end "rule__Ordermaterials__Group__0"


    // $ANTLR start "rule__Ordermaterials__Group__0__Impl"
    // InternalDomainmodel.g:850:1: rule__Ordermaterials__Group__0__Impl : ( 'ordering' ) ;
    public final void rule__Ordermaterials__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:854:1: ( ( 'ordering' ) )
            // InternalDomainmodel.g:855:1: ( 'ordering' )
            {
            // InternalDomainmodel.g:855:1: ( 'ordering' )
            // InternalDomainmodel.g:856:2: 'ordering'
            {
             before(grammarAccess.getOrdermaterialsAccess().getOrderingKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOrdermaterialsAccess().getOrderingKeyword_0()); 

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
    // $ANTLR end "rule__Ordermaterials__Group__0__Impl"


    // $ANTLR start "rule__Ordermaterials__Group__1"
    // InternalDomainmodel.g:865:1: rule__Ordermaterials__Group__1 : rule__Ordermaterials__Group__1__Impl rule__Ordermaterials__Group__2 ;
    public final void rule__Ordermaterials__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:869:1: ( rule__Ordermaterials__Group__1__Impl rule__Ordermaterials__Group__2 )
            // InternalDomainmodel.g:870:2: rule__Ordermaterials__Group__1__Impl rule__Ordermaterials__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Ordermaterials__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group__2();

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
    // $ANTLR end "rule__Ordermaterials__Group__1"


    // $ANTLR start "rule__Ordermaterials__Group__1__Impl"
    // InternalDomainmodel.g:877:1: rule__Ordermaterials__Group__1__Impl : ( ( rule__Ordermaterials__MaterialAssignment_1 ) ) ;
    public final void rule__Ordermaterials__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:881:1: ( ( ( rule__Ordermaterials__MaterialAssignment_1 ) ) )
            // InternalDomainmodel.g:882:1: ( ( rule__Ordermaterials__MaterialAssignment_1 ) )
            {
            // InternalDomainmodel.g:882:1: ( ( rule__Ordermaterials__MaterialAssignment_1 ) )
            // InternalDomainmodel.g:883:2: ( rule__Ordermaterials__MaterialAssignment_1 )
            {
             before(grammarAccess.getOrdermaterialsAccess().getMaterialAssignment_1()); 
            // InternalDomainmodel.g:884:2: ( rule__Ordermaterials__MaterialAssignment_1 )
            // InternalDomainmodel.g:884:3: rule__Ordermaterials__MaterialAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ordermaterials__MaterialAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdermaterialsAccess().getMaterialAssignment_1()); 

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
    // $ANTLR end "rule__Ordermaterials__Group__1__Impl"


    // $ANTLR start "rule__Ordermaterials__Group__2"
    // InternalDomainmodel.g:892:1: rule__Ordermaterials__Group__2 : rule__Ordermaterials__Group__2__Impl rule__Ordermaterials__Group__3 ;
    public final void rule__Ordermaterials__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:896:1: ( rule__Ordermaterials__Group__2__Impl rule__Ordermaterials__Group__3 )
            // InternalDomainmodel.g:897:2: rule__Ordermaterials__Group__2__Impl rule__Ordermaterials__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Ordermaterials__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group__3();

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
    // $ANTLR end "rule__Ordermaterials__Group__2"


    // $ANTLR start "rule__Ordermaterials__Group__2__Impl"
    // InternalDomainmodel.g:904:1: rule__Ordermaterials__Group__2__Impl : ( ( rule__Ordermaterials__Group_2__0 )* ) ;
    public final void rule__Ordermaterials__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:908:1: ( ( ( rule__Ordermaterials__Group_2__0 )* ) )
            // InternalDomainmodel.g:909:1: ( ( rule__Ordermaterials__Group_2__0 )* )
            {
            // InternalDomainmodel.g:909:1: ( ( rule__Ordermaterials__Group_2__0 )* )
            // InternalDomainmodel.g:910:2: ( rule__Ordermaterials__Group_2__0 )*
            {
             before(grammarAccess.getOrdermaterialsAccess().getGroup_2()); 
            // InternalDomainmodel.g:911:2: ( rule__Ordermaterials__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomainmodel.g:911:3: rule__Ordermaterials__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Ordermaterials__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOrdermaterialsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Ordermaterials__Group__2__Impl"


    // $ANTLR start "rule__Ordermaterials__Group__3"
    // InternalDomainmodel.g:919:1: rule__Ordermaterials__Group__3 : rule__Ordermaterials__Group__3__Impl rule__Ordermaterials__Group__4 ;
    public final void rule__Ordermaterials__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:923:1: ( rule__Ordermaterials__Group__3__Impl rule__Ordermaterials__Group__4 )
            // InternalDomainmodel.g:924:2: rule__Ordermaterials__Group__3__Impl rule__Ordermaterials__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Ordermaterials__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group__4();

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
    // $ANTLR end "rule__Ordermaterials__Group__3"


    // $ANTLR start "rule__Ordermaterials__Group__3__Impl"
    // InternalDomainmodel.g:931:1: rule__Ordermaterials__Group__3__Impl : ( 'then' ) ;
    public final void rule__Ordermaterials__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:935:1: ( ( 'then' ) )
            // InternalDomainmodel.g:936:1: ( 'then' )
            {
            // InternalDomainmodel.g:936:1: ( 'then' )
            // InternalDomainmodel.g:937:2: 'then'
            {
             before(grammarAccess.getOrdermaterialsAccess().getThenKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOrdermaterialsAccess().getThenKeyword_3()); 

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
    // $ANTLR end "rule__Ordermaterials__Group__3__Impl"


    // $ANTLR start "rule__Ordermaterials__Group__4"
    // InternalDomainmodel.g:946:1: rule__Ordermaterials__Group__4 : rule__Ordermaterials__Group__4__Impl ;
    public final void rule__Ordermaterials__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:950:1: ( rule__Ordermaterials__Group__4__Impl )
            // InternalDomainmodel.g:951:2: rule__Ordermaterials__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group__4__Impl();

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
    // $ANTLR end "rule__Ordermaterials__Group__4"


    // $ANTLR start "rule__Ordermaterials__Group__4__Impl"
    // InternalDomainmodel.g:957:1: rule__Ordermaterials__Group__4__Impl : ( ( rule__Ordermaterials__ReactionAssignment_4 ) ) ;
    public final void rule__Ordermaterials__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:961:1: ( ( ( rule__Ordermaterials__ReactionAssignment_4 ) ) )
            // InternalDomainmodel.g:962:1: ( ( rule__Ordermaterials__ReactionAssignment_4 ) )
            {
            // InternalDomainmodel.g:962:1: ( ( rule__Ordermaterials__ReactionAssignment_4 ) )
            // InternalDomainmodel.g:963:2: ( rule__Ordermaterials__ReactionAssignment_4 )
            {
             before(grammarAccess.getOrdermaterialsAccess().getReactionAssignment_4()); 
            // InternalDomainmodel.g:964:2: ( rule__Ordermaterials__ReactionAssignment_4 )
            // InternalDomainmodel.g:964:3: rule__Ordermaterials__ReactionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ordermaterials__ReactionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOrdermaterialsAccess().getReactionAssignment_4()); 

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
    // $ANTLR end "rule__Ordermaterials__Group__4__Impl"


    // $ANTLR start "rule__Ordermaterials__Group_2__0"
    // InternalDomainmodel.g:973:1: rule__Ordermaterials__Group_2__0 : rule__Ordermaterials__Group_2__0__Impl rule__Ordermaterials__Group_2__1 ;
    public final void rule__Ordermaterials__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:977:1: ( rule__Ordermaterials__Group_2__0__Impl rule__Ordermaterials__Group_2__1 )
            // InternalDomainmodel.g:978:2: rule__Ordermaterials__Group_2__0__Impl rule__Ordermaterials__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Ordermaterials__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group_2__1();

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
    // $ANTLR end "rule__Ordermaterials__Group_2__0"


    // $ANTLR start "rule__Ordermaterials__Group_2__0__Impl"
    // InternalDomainmodel.g:985:1: rule__Ordermaterials__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Ordermaterials__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:989:1: ( ( ',' ) )
            // InternalDomainmodel.g:990:1: ( ',' )
            {
            // InternalDomainmodel.g:990:1: ( ',' )
            // InternalDomainmodel.g:991:2: ','
            {
             before(grammarAccess.getOrdermaterialsAccess().getCommaKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOrdermaterialsAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Ordermaterials__Group_2__0__Impl"


    // $ANTLR start "rule__Ordermaterials__Group_2__1"
    // InternalDomainmodel.g:1000:1: rule__Ordermaterials__Group_2__1 : rule__Ordermaterials__Group_2__1__Impl ;
    public final void rule__Ordermaterials__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1004:1: ( rule__Ordermaterials__Group_2__1__Impl )
            // InternalDomainmodel.g:1005:2: rule__Ordermaterials__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ordermaterials__Group_2__1__Impl();

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
    // $ANTLR end "rule__Ordermaterials__Group_2__1"


    // $ANTLR start "rule__Ordermaterials__Group_2__1__Impl"
    // InternalDomainmodel.g:1011:1: rule__Ordermaterials__Group_2__1__Impl : ( ( rule__Ordermaterials__MaterialAssignment_2_1 ) ) ;
    public final void rule__Ordermaterials__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1015:1: ( ( ( rule__Ordermaterials__MaterialAssignment_2_1 ) ) )
            // InternalDomainmodel.g:1016:1: ( ( rule__Ordermaterials__MaterialAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:1016:1: ( ( rule__Ordermaterials__MaterialAssignment_2_1 ) )
            // InternalDomainmodel.g:1017:2: ( rule__Ordermaterials__MaterialAssignment_2_1 )
            {
             before(grammarAccess.getOrdermaterialsAccess().getMaterialAssignment_2_1()); 
            // InternalDomainmodel.g:1018:2: ( rule__Ordermaterials__MaterialAssignment_2_1 )
            // InternalDomainmodel.g:1018:3: rule__Ordermaterials__MaterialAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Ordermaterials__MaterialAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOrdermaterialsAccess().getMaterialAssignment_2_1()); 

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
    // $ANTLR end "rule__Ordermaterials__Group_2__1__Impl"


    // $ANTLR start "rule__Queryitems__Group__0"
    // InternalDomainmodel.g:1027:1: rule__Queryitems__Group__0 : rule__Queryitems__Group__0__Impl rule__Queryitems__Group__1 ;
    public final void rule__Queryitems__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1031:1: ( rule__Queryitems__Group__0__Impl rule__Queryitems__Group__1 )
            // InternalDomainmodel.g:1032:2: rule__Queryitems__Group__0__Impl rule__Queryitems__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Queryitems__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queryitems__Group__1();

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
    // $ANTLR end "rule__Queryitems__Group__0"


    // $ANTLR start "rule__Queryitems__Group__0__Impl"
    // InternalDomainmodel.g:1039:1: rule__Queryitems__Group__0__Impl : ( 'querying' ) ;
    public final void rule__Queryitems__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1043:1: ( ( 'querying' ) )
            // InternalDomainmodel.g:1044:1: ( 'querying' )
            {
            // InternalDomainmodel.g:1044:1: ( 'querying' )
            // InternalDomainmodel.g:1045:2: 'querying'
            {
             before(grammarAccess.getQueryitemsAccess().getQueryingKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQueryitemsAccess().getQueryingKeyword_0()); 

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
    // $ANTLR end "rule__Queryitems__Group__0__Impl"


    // $ANTLR start "rule__Queryitems__Group__1"
    // InternalDomainmodel.g:1054:1: rule__Queryitems__Group__1 : rule__Queryitems__Group__1__Impl rule__Queryitems__Group__2 ;
    public final void rule__Queryitems__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1058:1: ( rule__Queryitems__Group__1__Impl rule__Queryitems__Group__2 )
            // InternalDomainmodel.g:1059:2: rule__Queryitems__Group__1__Impl rule__Queryitems__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Queryitems__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queryitems__Group__2();

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
    // $ANTLR end "rule__Queryitems__Group__1"


    // $ANTLR start "rule__Queryitems__Group__1__Impl"
    // InternalDomainmodel.g:1066:1: rule__Queryitems__Group__1__Impl : ( ( rule__Queryitems__ItemAssignment_1 ) ) ;
    public final void rule__Queryitems__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1070:1: ( ( ( rule__Queryitems__ItemAssignment_1 ) ) )
            // InternalDomainmodel.g:1071:1: ( ( rule__Queryitems__ItemAssignment_1 ) )
            {
            // InternalDomainmodel.g:1071:1: ( ( rule__Queryitems__ItemAssignment_1 ) )
            // InternalDomainmodel.g:1072:2: ( rule__Queryitems__ItemAssignment_1 )
            {
             before(grammarAccess.getQueryitemsAccess().getItemAssignment_1()); 
            // InternalDomainmodel.g:1073:2: ( rule__Queryitems__ItemAssignment_1 )
            // InternalDomainmodel.g:1073:3: rule__Queryitems__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Queryitems__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryitemsAccess().getItemAssignment_1()); 

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
    // $ANTLR end "rule__Queryitems__Group__1__Impl"


    // $ANTLR start "rule__Queryitems__Group__2"
    // InternalDomainmodel.g:1081:1: rule__Queryitems__Group__2 : rule__Queryitems__Group__2__Impl rule__Queryitems__Group__3 ;
    public final void rule__Queryitems__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1085:1: ( rule__Queryitems__Group__2__Impl rule__Queryitems__Group__3 )
            // InternalDomainmodel.g:1086:2: rule__Queryitems__Group__2__Impl rule__Queryitems__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Queryitems__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queryitems__Group__3();

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
    // $ANTLR end "rule__Queryitems__Group__2"


    // $ANTLR start "rule__Queryitems__Group__2__Impl"
    // InternalDomainmodel.g:1093:1: rule__Queryitems__Group__2__Impl : ( 'then' ) ;
    public final void rule__Queryitems__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1097:1: ( ( 'then' ) )
            // InternalDomainmodel.g:1098:1: ( 'then' )
            {
            // InternalDomainmodel.g:1098:1: ( 'then' )
            // InternalDomainmodel.g:1099:2: 'then'
            {
             before(grammarAccess.getQueryitemsAccess().getThenKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQueryitemsAccess().getThenKeyword_2()); 

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
    // $ANTLR end "rule__Queryitems__Group__2__Impl"


    // $ANTLR start "rule__Queryitems__Group__3"
    // InternalDomainmodel.g:1108:1: rule__Queryitems__Group__3 : rule__Queryitems__Group__3__Impl rule__Queryitems__Group__4 ;
    public final void rule__Queryitems__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1112:1: ( rule__Queryitems__Group__3__Impl rule__Queryitems__Group__4 )
            // InternalDomainmodel.g:1113:2: rule__Queryitems__Group__3__Impl rule__Queryitems__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Queryitems__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queryitems__Group__4();

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
    // $ANTLR end "rule__Queryitems__Group__3"


    // $ANTLR start "rule__Queryitems__Group__3__Impl"
    // InternalDomainmodel.g:1120:1: rule__Queryitems__Group__3__Impl : ( ( rule__Queryitems__ReactionAssignment_3 ) ) ;
    public final void rule__Queryitems__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1124:1: ( ( ( rule__Queryitems__ReactionAssignment_3 ) ) )
            // InternalDomainmodel.g:1125:1: ( ( rule__Queryitems__ReactionAssignment_3 ) )
            {
            // InternalDomainmodel.g:1125:1: ( ( rule__Queryitems__ReactionAssignment_3 ) )
            // InternalDomainmodel.g:1126:2: ( rule__Queryitems__ReactionAssignment_3 )
            {
             before(grammarAccess.getQueryitemsAccess().getReactionAssignment_3()); 
            // InternalDomainmodel.g:1127:2: ( rule__Queryitems__ReactionAssignment_3 )
            // InternalDomainmodel.g:1127:3: rule__Queryitems__ReactionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Queryitems__ReactionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryitemsAccess().getReactionAssignment_3()); 

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
    // $ANTLR end "rule__Queryitems__Group__3__Impl"


    // $ANTLR start "rule__Queryitems__Group__4"
    // InternalDomainmodel.g:1135:1: rule__Queryitems__Group__4 : rule__Queryitems__Group__4__Impl ;
    public final void rule__Queryitems__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1139:1: ( rule__Queryitems__Group__4__Impl )
            // InternalDomainmodel.g:1140:2: rule__Queryitems__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Queryitems__Group__4__Impl();

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
    // $ANTLR end "rule__Queryitems__Group__4"


    // $ANTLR start "rule__Queryitems__Group__4__Impl"
    // InternalDomainmodel.g:1146:1: rule__Queryitems__Group__4__Impl : ( ( rule__Queryitems__Group_4__0 )* ) ;
    public final void rule__Queryitems__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1150:1: ( ( ( rule__Queryitems__Group_4__0 )* ) )
            // InternalDomainmodel.g:1151:1: ( ( rule__Queryitems__Group_4__0 )* )
            {
            // InternalDomainmodel.g:1151:1: ( ( rule__Queryitems__Group_4__0 )* )
            // InternalDomainmodel.g:1152:2: ( rule__Queryitems__Group_4__0 )*
            {
             before(grammarAccess.getQueryitemsAccess().getGroup_4()); 
            // InternalDomainmodel.g:1153:2: ( rule__Queryitems__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:1153:3: rule__Queryitems__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Queryitems__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQueryitemsAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Queryitems__Group__4__Impl"


    // $ANTLR start "rule__Queryitems__Group_4__0"
    // InternalDomainmodel.g:1162:1: rule__Queryitems__Group_4__0 : rule__Queryitems__Group_4__0__Impl rule__Queryitems__Group_4__1 ;
    public final void rule__Queryitems__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1166:1: ( rule__Queryitems__Group_4__0__Impl rule__Queryitems__Group_4__1 )
            // InternalDomainmodel.g:1167:2: rule__Queryitems__Group_4__0__Impl rule__Queryitems__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Queryitems__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Queryitems__Group_4__1();

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
    // $ANTLR end "rule__Queryitems__Group_4__0"


    // $ANTLR start "rule__Queryitems__Group_4__0__Impl"
    // InternalDomainmodel.g:1174:1: rule__Queryitems__Group_4__0__Impl : ( 'and' ) ;
    public final void rule__Queryitems__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1178:1: ( ( 'and' ) )
            // InternalDomainmodel.g:1179:1: ( 'and' )
            {
            // InternalDomainmodel.g:1179:1: ( 'and' )
            // InternalDomainmodel.g:1180:2: 'and'
            {
             before(grammarAccess.getQueryitemsAccess().getAndKeyword_4_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQueryitemsAccess().getAndKeyword_4_0()); 

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
    // $ANTLR end "rule__Queryitems__Group_4__0__Impl"


    // $ANTLR start "rule__Queryitems__Group_4__1"
    // InternalDomainmodel.g:1189:1: rule__Queryitems__Group_4__1 : rule__Queryitems__Group_4__1__Impl ;
    public final void rule__Queryitems__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1193:1: ( rule__Queryitems__Group_4__1__Impl )
            // InternalDomainmodel.g:1194:2: rule__Queryitems__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Queryitems__Group_4__1__Impl();

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
    // $ANTLR end "rule__Queryitems__Group_4__1"


    // $ANTLR start "rule__Queryitems__Group_4__1__Impl"
    // InternalDomainmodel.g:1200:1: rule__Queryitems__Group_4__1__Impl : ( ( rule__Queryitems__ReactionAssignment_4_1 ) ) ;
    public final void rule__Queryitems__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1204:1: ( ( ( rule__Queryitems__ReactionAssignment_4_1 ) ) )
            // InternalDomainmodel.g:1205:1: ( ( rule__Queryitems__ReactionAssignment_4_1 ) )
            {
            // InternalDomainmodel.g:1205:1: ( ( rule__Queryitems__ReactionAssignment_4_1 ) )
            // InternalDomainmodel.g:1206:2: ( rule__Queryitems__ReactionAssignment_4_1 )
            {
             before(grammarAccess.getQueryitemsAccess().getReactionAssignment_4_1()); 
            // InternalDomainmodel.g:1207:2: ( rule__Queryitems__ReactionAssignment_4_1 )
            // InternalDomainmodel.g:1207:3: rule__Queryitems__ReactionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Queryitems__ReactionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryitemsAccess().getReactionAssignment_4_1()); 

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
    // $ANTLR end "rule__Queryitems__Group_4__1__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // InternalDomainmodel.g:1216:1: rule__Model__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1220:1: ( ( ruleDeclaration ) )
            // InternalDomainmodel.g:1221:2: ( ruleDeclaration )
            {
            // InternalDomainmodel.g:1221:2: ( ruleDeclaration )
            // InternalDomainmodel.g:1222:3: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__DeclarationsAssignment"


    // $ANTLR start "rule__Declaration__ConditionandactionAssignment_0"
    // InternalDomainmodel.g:1231:1: rule__Declaration__ConditionandactionAssignment_0 : ( ruleConditionandAction ) ;
    public final void rule__Declaration__ConditionandactionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1235:1: ( ( ruleConditionandAction ) )
            // InternalDomainmodel.g:1236:2: ( ruleConditionandAction )
            {
            // InternalDomainmodel.g:1236:2: ( ruleConditionandAction )
            // InternalDomainmodel.g:1237:3: ruleConditionandAction
            {
             before(grammarAccess.getDeclarationAccess().getConditionandactionConditionandActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionandAction();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getConditionandactionConditionandActionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Declaration__ConditionandactionAssignment_0"


    // $ANTLR start "rule__Declaration__StoryAssignment_1"
    // InternalDomainmodel.g:1246:1: rule__Declaration__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__Declaration__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1250:1: ( ( ruleStory ) )
            // InternalDomainmodel.g:1251:2: ( ruleStory )
            {
            // InternalDomainmodel.g:1251:2: ( ruleStory )
            // InternalDomainmodel.g:1252:3: ruleStory
            {
             before(grammarAccess.getDeclarationAccess().getStoryStoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getStoryStoryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Declaration__StoryAssignment_1"


    // $ANTLR start "rule__ConditionandAction__ConditionsAssignment_1"
    // InternalDomainmodel.g:1261:1: rule__ConditionandAction__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__ConditionandAction__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1265:1: ( ( ruleCondition ) )
            // InternalDomainmodel.g:1266:2: ( ruleCondition )
            {
            // InternalDomainmodel.g:1266:2: ( ruleCondition )
            // InternalDomainmodel.g:1267:3: ruleCondition
            {
             before(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConditionandAction__ConditionsAssignment_1"


    // $ANTLR start "rule__ConditionandAction__ConditionsAssignment_2_1"
    // InternalDomainmodel.g:1276:1: rule__ConditionandAction__ConditionsAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__ConditionandAction__ConditionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1280:1: ( ( ruleCondition ) )
            // InternalDomainmodel.g:1281:2: ( ruleCondition )
            {
            // InternalDomainmodel.g:1281:2: ( ruleCondition )
            // InternalDomainmodel.g:1282:3: ruleCondition
            {
             before(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionandActionAccess().getConditionsConditionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ConditionandAction__ConditionsAssignment_2_1"


    // $ANTLR start "rule__Ship__ItemAssignment_1"
    // InternalDomainmodel.g:1291:1: rule__Ship__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__Ship__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1295:1: ( ( ruleItem ) )
            // InternalDomainmodel.g:1296:2: ( ruleItem )
            {
            // InternalDomainmodel.g:1296:2: ( ruleItem )
            // InternalDomainmodel.g:1297:3: ruleItem
            {
             before(grammarAccess.getShipAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getShipAccess().getItemItemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ship__ItemAssignment_1"


    // $ANTLR start "rule__Ship__AddressAssignment_3"
    // InternalDomainmodel.g:1306:1: rule__Ship__AddressAssignment_3 : ( ruleAddress ) ;
    public final void rule__Ship__AddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1310:1: ( ( ruleAddress ) )
            // InternalDomainmodel.g:1311:2: ( ruleAddress )
            {
            // InternalDomainmodel.g:1311:2: ( ruleAddress )
            // InternalDomainmodel.g:1312:3: ruleAddress
            {
             before(grammarAccess.getShipAccess().getAddressAddressParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getShipAccess().getAddressAddressParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Ship__AddressAssignment_3"


    // $ANTLR start "rule__Ship__ReactionAssignment_5"
    // InternalDomainmodel.g:1321:1: rule__Ship__ReactionAssignment_5 : ( ruleReaction ) ;
    public final void rule__Ship__ReactionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1325:1: ( ( ruleReaction ) )
            // InternalDomainmodel.g:1326:2: ( ruleReaction )
            {
            // InternalDomainmodel.g:1326:2: ( ruleReaction )
            // InternalDomainmodel.g:1327:3: ruleReaction
            {
             before(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Ship__ReactionAssignment_5"


    // $ANTLR start "rule__Ship__ReactionAssignment_6_1"
    // InternalDomainmodel.g:1336:1: rule__Ship__ReactionAssignment_6_1 : ( ruleReaction ) ;
    public final void rule__Ship__ReactionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1340:1: ( ( ruleReaction ) )
            // InternalDomainmodel.g:1341:2: ( ruleReaction )
            {
            // InternalDomainmodel.g:1341:2: ( ruleReaction )
            // InternalDomainmodel.g:1342:3: ruleReaction
            {
             before(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getShipAccess().getReactionReactionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Ship__ReactionAssignment_6_1"


    // $ANTLR start "rule__Ordermaterials__MaterialAssignment_1"
    // InternalDomainmodel.g:1351:1: rule__Ordermaterials__MaterialAssignment_1 : ( ruleMaterial ) ;
    public final void rule__Ordermaterials__MaterialAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1355:1: ( ( ruleMaterial ) )
            // InternalDomainmodel.g:1356:2: ( ruleMaterial )
            {
            // InternalDomainmodel.g:1356:2: ( ruleMaterial )
            // InternalDomainmodel.g:1357:3: ruleMaterial
            {
             before(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ordermaterials__MaterialAssignment_1"


    // $ANTLR start "rule__Ordermaterials__MaterialAssignment_2_1"
    // InternalDomainmodel.g:1366:1: rule__Ordermaterials__MaterialAssignment_2_1 : ( ruleMaterial ) ;
    public final void rule__Ordermaterials__MaterialAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1370:1: ( ( ruleMaterial ) )
            // InternalDomainmodel.g:1371:2: ( ruleMaterial )
            {
            // InternalDomainmodel.g:1371:2: ( ruleMaterial )
            // InternalDomainmodel.g:1372:3: ruleMaterial
            {
             before(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getOrdermaterialsAccess().getMaterialMaterialParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Ordermaterials__MaterialAssignment_2_1"


    // $ANTLR start "rule__Ordermaterials__ReactionAssignment_4"
    // InternalDomainmodel.g:1381:1: rule__Ordermaterials__ReactionAssignment_4 : ( ruleReaction ) ;
    public final void rule__Ordermaterials__ReactionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1385:1: ( ( ruleReaction ) )
            // InternalDomainmodel.g:1386:2: ( ruleReaction )
            {
            // InternalDomainmodel.g:1386:2: ( ruleReaction )
            // InternalDomainmodel.g:1387:3: ruleReaction
            {
             before(grammarAccess.getOrdermaterialsAccess().getReactionReactionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getOrdermaterialsAccess().getReactionReactionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Ordermaterials__ReactionAssignment_4"


    // $ANTLR start "rule__Queryitems__ItemAssignment_1"
    // InternalDomainmodel.g:1396:1: rule__Queryitems__ItemAssignment_1 : ( ruleItem ) ;
    public final void rule__Queryitems__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1400:1: ( ( ruleItem ) )
            // InternalDomainmodel.g:1401:2: ( ruleItem )
            {
            // InternalDomainmodel.g:1401:2: ( ruleItem )
            // InternalDomainmodel.g:1402:3: ruleItem
            {
             before(grammarAccess.getQueryitemsAccess().getItemItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getQueryitemsAccess().getItemItemParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Queryitems__ItemAssignment_1"


    // $ANTLR start "rule__Queryitems__ReactionAssignment_3"
    // InternalDomainmodel.g:1411:1: rule__Queryitems__ReactionAssignment_3 : ( ruleReaction ) ;
    public final void rule__Queryitems__ReactionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1415:1: ( ( ruleReaction ) )
            // InternalDomainmodel.g:1416:2: ( ruleReaction )
            {
            // InternalDomainmodel.g:1416:2: ( ruleReaction )
            // InternalDomainmodel.g:1417:3: ruleReaction
            {
             before(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Queryitems__ReactionAssignment_3"


    // $ANTLR start "rule__Queryitems__ReactionAssignment_4_1"
    // InternalDomainmodel.g:1426:1: rule__Queryitems__ReactionAssignment_4_1 : ( ruleReaction ) ;
    public final void rule__Queryitems__ReactionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1430:1: ( ( ruleReaction ) )
            // InternalDomainmodel.g:1431:2: ( ruleReaction )
            {
            // InternalDomainmodel.g:1431:2: ( ruleReaction )
            // InternalDomainmodel.g:1432:3: ruleReaction
            {
             before(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getQueryitemsAccess().getReactionReactionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Queryitems__ReactionAssignment_4_1"


    // $ANTLR start "rule__Item__ItemAssignment"
    // InternalDomainmodel.g:1441:1: rule__Item__ItemAssignment : ( RULE_STRING ) ;
    public final void rule__Item__ItemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1445:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1446:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1446:2: ( RULE_STRING )
            // InternalDomainmodel.g:1447:3: RULE_STRING
            {
             before(grammarAccess.getItemAccess().getItemSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getItemSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Item__ItemAssignment"


    // $ANTLR start "rule__Address__AddressAssignment"
    // InternalDomainmodel.g:1456:1: rule__Address__AddressAssignment : ( RULE_STRING ) ;
    public final void rule__Address__AddressAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1460:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1461:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1461:2: ( RULE_STRING )
            // InternalDomainmodel.g:1462:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Address__AddressAssignment"


    // $ANTLR start "rule__Material__MaterialAssignment"
    // InternalDomainmodel.g:1471:1: rule__Material__MaterialAssignment : ( RULE_STRING ) ;
    public final void rule__Material__MaterialAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1475:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1476:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1476:2: ( RULE_STRING )
            // InternalDomainmodel.g:1477:3: RULE_STRING
            {
             before(grammarAccess.getMaterialAccess().getMaterialSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getMaterialSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Material__MaterialAssignment"


    // $ANTLR start "rule__Condition__ConditionAssignment"
    // InternalDomainmodel.g:1486:1: rule__Condition__ConditionAssignment : ( RULE_STRING ) ;
    public final void rule__Condition__ConditionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1490:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1491:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1491:2: ( RULE_STRING )
            // InternalDomainmodel.g:1492:3: RULE_STRING
            {
             before(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Condition__ConditionAssignment"


    // $ANTLR start "rule__Reaction__ReactionAssignment"
    // InternalDomainmodel.g:1501:1: rule__Reaction__ReactionAssignment : ( RULE_STRING ) ;
    public final void rule__Reaction__ReactionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1505:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1506:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1506:2: ( RULE_STRING )
            // InternalDomainmodel.g:1507:3: RULE_STRING
            {
             before(grammarAccess.getReactionAccess().getReactionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReactionAccess().getReactionSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Reaction__ReactionAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000A4000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});

}
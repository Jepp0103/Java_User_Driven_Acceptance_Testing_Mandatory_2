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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "' when '", "' to '", "' and '"
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
    // InternalDomainmodel.g:87:1: ruleDeclaration : ( ruleShip ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ruleShip ) )
            // InternalDomainmodel.g:92:2: ( ruleShip )
            {
            // InternalDomainmodel.g:92:2: ( ruleShip )
            // InternalDomainmodel.g:93:3: ruleShip
            {
             before(grammarAccess.getDeclarationAccess().getShipParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleShip();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getShipParserRuleCall()); 

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


    // $ANTLR start "entryRuleShip"
    // InternalDomainmodel.g:103:1: entryRuleShip : ruleShip EOF ;
    public final void entryRuleShip() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleShip EOF )
            // InternalDomainmodel.g:105:1: ruleShip EOF
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
    // InternalDomainmodel.g:112:1: ruleShip : ( ( rule__Ship__Group__0 ) ) ;
    public final void ruleShip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__Ship__Group__0 ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__Ship__Group__0 ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__Ship__Group__0 ) )
            // InternalDomainmodel.g:118:3: ( rule__Ship__Group__0 )
            {
             before(grammarAccess.getShipAccess().getGroup()); 
            // InternalDomainmodel.g:119:3: ( rule__Ship__Group__0 )
            // InternalDomainmodel.g:119:4: rule__Ship__Group__0
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


    // $ANTLR start "entryRuleItem"
    // InternalDomainmodel.g:128:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleItem EOF )
            // InternalDomainmodel.g:130:1: ruleItem EOF
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
    // InternalDomainmodel.g:137:1: ruleItem : ( ( rule__Item__NameAssignment ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__Item__NameAssignment ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__Item__NameAssignment ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__Item__NameAssignment ) )
            // InternalDomainmodel.g:143:3: ( rule__Item__NameAssignment )
            {
             before(grammarAccess.getItemAccess().getNameAssignment()); 
            // InternalDomainmodel.g:144:3: ( rule__Item__NameAssignment )
            // InternalDomainmodel.g:144:4: rule__Item__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Item__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment()); 

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
    // InternalDomainmodel.g:153:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleAddress EOF )
            // InternalDomainmodel.g:155:1: ruleAddress EOF
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
    // InternalDomainmodel.g:162:1: ruleAddress : ( ( rule__Address__NameAssignment ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__Address__NameAssignment ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__Address__NameAssignment ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__Address__NameAssignment ) )
            // InternalDomainmodel.g:168:3: ( rule__Address__NameAssignment )
            {
             before(grammarAccess.getAddressAccess().getNameAssignment()); 
            // InternalDomainmodel.g:169:3: ( rule__Address__NameAssignment )
            // InternalDomainmodel.g:169:4: rule__Address__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Address__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRuleCondition"
    // InternalDomainmodel.g:178:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleCondition EOF )
            // InternalDomainmodel.g:180:1: ruleCondition EOF
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
    // InternalDomainmodel.g:187:1: ruleCondition : ( ( rule__Condition__NameAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__Condition__NameAssignment ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__Condition__NameAssignment ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__Condition__NameAssignment ) )
            // InternalDomainmodel.g:193:3: ( rule__Condition__NameAssignment )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment()); 
            // InternalDomainmodel.g:194:3: ( rule__Condition__NameAssignment )
            // InternalDomainmodel.g:194:4: rule__Condition__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRuleAction"
    // InternalDomainmodel.g:203:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( ruleAction EOF )
            // InternalDomainmodel.g:205:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDomainmodel.g:212:1: ruleAction : ( ( rule__Action__NameAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__Action__NameAssignment ) ) )
            // InternalDomainmodel.g:217:2: ( ( rule__Action__NameAssignment ) )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__Action__NameAssignment ) )
            // InternalDomainmodel.g:218:3: ( rule__Action__NameAssignment )
            {
             before(grammarAccess.getActionAccess().getNameAssignment()); 
            // InternalDomainmodel.g:219:3: ( rule__Action__NameAssignment )
            // InternalDomainmodel.g:219:4: rule__Action__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__Ship__Group__0"
    // InternalDomainmodel.g:227:1: rule__Ship__Group__0 : rule__Ship__Group__0__Impl rule__Ship__Group__1 ;
    public final void rule__Ship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:231:1: ( rule__Ship__Group__0__Impl rule__Ship__Group__1 )
            // InternalDomainmodel.g:232:2: rule__Ship__Group__0__Impl rule__Ship__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDomainmodel.g:239:1: rule__Ship__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Ship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:243:1: ( ( 'Given' ) )
            // InternalDomainmodel.g:244:1: ( 'Given' )
            {
            // InternalDomainmodel.g:244:1: ( 'Given' )
            // InternalDomainmodel.g:245:2: 'Given'
            {
             before(grammarAccess.getShipAccess().getGivenKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getGivenKeyword_0()); 

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
    // InternalDomainmodel.g:254:1: rule__Ship__Group__1 : rule__Ship__Group__1__Impl rule__Ship__Group__2 ;
    public final void rule__Ship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:258:1: ( rule__Ship__Group__1__Impl rule__Ship__Group__2 )
            // InternalDomainmodel.g:259:2: rule__Ship__Group__1__Impl rule__Ship__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDomainmodel.g:266:1: rule__Ship__Group__1__Impl : ( ( rule__Ship__ConditionsAssignment_1 ) ) ;
    public final void rule__Ship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:270:1: ( ( ( rule__Ship__ConditionsAssignment_1 ) ) )
            // InternalDomainmodel.g:271:1: ( ( rule__Ship__ConditionsAssignment_1 ) )
            {
            // InternalDomainmodel.g:271:1: ( ( rule__Ship__ConditionsAssignment_1 ) )
            // InternalDomainmodel.g:272:2: ( rule__Ship__ConditionsAssignment_1 )
            {
             before(grammarAccess.getShipAccess().getConditionsAssignment_1()); 
            // InternalDomainmodel.g:273:2: ( rule__Ship__ConditionsAssignment_1 )
            // InternalDomainmodel.g:273:3: rule__Ship__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ship__ConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getConditionsAssignment_1()); 

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
    // InternalDomainmodel.g:281:1: rule__Ship__Group__2 : rule__Ship__Group__2__Impl rule__Ship__Group__3 ;
    public final void rule__Ship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:285:1: ( rule__Ship__Group__2__Impl rule__Ship__Group__3 )
            // InternalDomainmodel.g:286:2: rule__Ship__Group__2__Impl rule__Ship__Group__3
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
    // InternalDomainmodel.g:293:1: rule__Ship__Group__2__Impl : ( ( rule__Ship__Group_2__0 )* ) ;
    public final void rule__Ship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:297:1: ( ( ( rule__Ship__Group_2__0 )* ) )
            // InternalDomainmodel.g:298:1: ( ( rule__Ship__Group_2__0 )* )
            {
            // InternalDomainmodel.g:298:1: ( ( rule__Ship__Group_2__0 )* )
            // InternalDomainmodel.g:299:2: ( rule__Ship__Group_2__0 )*
            {
             before(grammarAccess.getShipAccess().getGroup_2()); 
            // InternalDomainmodel.g:300:2: ( rule__Ship__Group_2__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomainmodel.g:300:3: rule__Ship__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Ship__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getShipAccess().getGroup_2()); 

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
    // InternalDomainmodel.g:308:1: rule__Ship__Group__3 : rule__Ship__Group__3__Impl rule__Ship__Group__4 ;
    public final void rule__Ship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:312:1: ( rule__Ship__Group__3__Impl rule__Ship__Group__4 )
            // InternalDomainmodel.g:313:2: rule__Ship__Group__3__Impl rule__Ship__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalDomainmodel.g:320:1: rule__Ship__Group__3__Impl : ( ' when ' ) ;
    public final void rule__Ship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:324:1: ( ( ' when ' ) )
            // InternalDomainmodel.g:325:1: ( ' when ' )
            {
            // InternalDomainmodel.g:325:1: ( ' when ' )
            // InternalDomainmodel.g:326:2: ' when '
            {
             before(grammarAccess.getShipAccess().getWhenKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getWhenKeyword_3()); 

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
    // InternalDomainmodel.g:335:1: rule__Ship__Group__4 : rule__Ship__Group__4__Impl rule__Ship__Group__5 ;
    public final void rule__Ship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:339:1: ( rule__Ship__Group__4__Impl rule__Ship__Group__5 )
            // InternalDomainmodel.g:340:2: rule__Ship__Group__4__Impl rule__Ship__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalDomainmodel.g:347:1: rule__Ship__Group__4__Impl : ( ( rule__Ship__ActionAssignment_4 ) ) ;
    public final void rule__Ship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:351:1: ( ( ( rule__Ship__ActionAssignment_4 ) ) )
            // InternalDomainmodel.g:352:1: ( ( rule__Ship__ActionAssignment_4 ) )
            {
            // InternalDomainmodel.g:352:1: ( ( rule__Ship__ActionAssignment_4 ) )
            // InternalDomainmodel.g:353:2: ( rule__Ship__ActionAssignment_4 )
            {
             before(grammarAccess.getShipAccess().getActionAssignment_4()); 
            // InternalDomainmodel.g:354:2: ( rule__Ship__ActionAssignment_4 )
            // InternalDomainmodel.g:354:3: rule__Ship__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ship__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getActionAssignment_4()); 

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
    // InternalDomainmodel.g:362:1: rule__Ship__Group__5 : rule__Ship__Group__5__Impl rule__Ship__Group__6 ;
    public final void rule__Ship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:366:1: ( rule__Ship__Group__5__Impl rule__Ship__Group__6 )
            // InternalDomainmodel.g:367:2: rule__Ship__Group__5__Impl rule__Ship__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalDomainmodel.g:374:1: rule__Ship__Group__5__Impl : ( ( rule__Ship__ActionAssignment_5 ) ) ;
    public final void rule__Ship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:378:1: ( ( ( rule__Ship__ActionAssignment_5 ) ) )
            // InternalDomainmodel.g:379:1: ( ( rule__Ship__ActionAssignment_5 ) )
            {
            // InternalDomainmodel.g:379:1: ( ( rule__Ship__ActionAssignment_5 ) )
            // InternalDomainmodel.g:380:2: ( rule__Ship__ActionAssignment_5 )
            {
             before(grammarAccess.getShipAccess().getActionAssignment_5()); 
            // InternalDomainmodel.g:381:2: ( rule__Ship__ActionAssignment_5 )
            // InternalDomainmodel.g:381:3: rule__Ship__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Ship__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getActionAssignment_5()); 

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
    // InternalDomainmodel.g:389:1: rule__Ship__Group__6 : rule__Ship__Group__6__Impl rule__Ship__Group__7 ;
    public final void rule__Ship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:393:1: ( rule__Ship__Group__6__Impl rule__Ship__Group__7 )
            // InternalDomainmodel.g:394:2: rule__Ship__Group__6__Impl rule__Ship__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Ship__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group__7();

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
    // InternalDomainmodel.g:401:1: rule__Ship__Group__6__Impl : ( ' to ' ) ;
    public final void rule__Ship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:405:1: ( ( ' to ' ) )
            // InternalDomainmodel.g:406:1: ( ' to ' )
            {
            // InternalDomainmodel.g:406:1: ( ' to ' )
            // InternalDomainmodel.g:407:2: ' to '
            {
             before(grammarAccess.getShipAccess().getToKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getToKeyword_6()); 

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


    // $ANTLR start "rule__Ship__Group__7"
    // InternalDomainmodel.g:416:1: rule__Ship__Group__7 : rule__Ship__Group__7__Impl ;
    public final void rule__Ship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:420:1: ( rule__Ship__Group__7__Impl )
            // InternalDomainmodel.g:421:2: rule__Ship__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ship__Group__7__Impl();

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
    // $ANTLR end "rule__Ship__Group__7"


    // $ANTLR start "rule__Ship__Group__7__Impl"
    // InternalDomainmodel.g:427:1: rule__Ship__Group__7__Impl : ( ( rule__Ship__AddressAssignment_7 ) ) ;
    public final void rule__Ship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:431:1: ( ( ( rule__Ship__AddressAssignment_7 ) ) )
            // InternalDomainmodel.g:432:1: ( ( rule__Ship__AddressAssignment_7 ) )
            {
            // InternalDomainmodel.g:432:1: ( ( rule__Ship__AddressAssignment_7 ) )
            // InternalDomainmodel.g:433:2: ( rule__Ship__AddressAssignment_7 )
            {
             before(grammarAccess.getShipAccess().getAddressAssignment_7()); 
            // InternalDomainmodel.g:434:2: ( rule__Ship__AddressAssignment_7 )
            // InternalDomainmodel.g:434:3: rule__Ship__AddressAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Ship__AddressAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getAddressAssignment_7()); 

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
    // $ANTLR end "rule__Ship__Group__7__Impl"


    // $ANTLR start "rule__Ship__Group_2__0"
    // InternalDomainmodel.g:443:1: rule__Ship__Group_2__0 : rule__Ship__Group_2__0__Impl rule__Ship__Group_2__1 ;
    public final void rule__Ship__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:447:1: ( rule__Ship__Group_2__0__Impl rule__Ship__Group_2__1 )
            // InternalDomainmodel.g:448:2: rule__Ship__Group_2__0__Impl rule__Ship__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Ship__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ship__Group_2__1();

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
    // $ANTLR end "rule__Ship__Group_2__0"


    // $ANTLR start "rule__Ship__Group_2__0__Impl"
    // InternalDomainmodel.g:455:1: rule__Ship__Group_2__0__Impl : ( ' and ' ) ;
    public final void rule__Ship__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:459:1: ( ( ' and ' ) )
            // InternalDomainmodel.g:460:1: ( ' and ' )
            {
            // InternalDomainmodel.g:460:1: ( ' and ' )
            // InternalDomainmodel.g:461:2: ' and '
            {
             before(grammarAccess.getShipAccess().getAndKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getShipAccess().getAndKeyword_2_0()); 

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
    // $ANTLR end "rule__Ship__Group_2__0__Impl"


    // $ANTLR start "rule__Ship__Group_2__1"
    // InternalDomainmodel.g:470:1: rule__Ship__Group_2__1 : rule__Ship__Group_2__1__Impl ;
    public final void rule__Ship__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:474:1: ( rule__Ship__Group_2__1__Impl )
            // InternalDomainmodel.g:475:2: rule__Ship__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ship__Group_2__1__Impl();

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
    // $ANTLR end "rule__Ship__Group_2__1"


    // $ANTLR start "rule__Ship__Group_2__1__Impl"
    // InternalDomainmodel.g:481:1: rule__Ship__Group_2__1__Impl : ( ( rule__Ship__ConditionsAssignment_2_1 ) ) ;
    public final void rule__Ship__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:485:1: ( ( ( rule__Ship__ConditionsAssignment_2_1 ) ) )
            // InternalDomainmodel.g:486:1: ( ( rule__Ship__ConditionsAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:486:1: ( ( rule__Ship__ConditionsAssignment_2_1 ) )
            // InternalDomainmodel.g:487:2: ( rule__Ship__ConditionsAssignment_2_1 )
            {
             before(grammarAccess.getShipAccess().getConditionsAssignment_2_1()); 
            // InternalDomainmodel.g:488:2: ( rule__Ship__ConditionsAssignment_2_1 )
            // InternalDomainmodel.g:488:3: rule__Ship__ConditionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Ship__ConditionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getShipAccess().getConditionsAssignment_2_1()); 

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
    // $ANTLR end "rule__Ship__Group_2__1__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // InternalDomainmodel.g:497:1: rule__Model__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:501:1: ( ( ruleDeclaration ) )
            // InternalDomainmodel.g:502:2: ( ruleDeclaration )
            {
            // InternalDomainmodel.g:502:2: ( ruleDeclaration )
            // InternalDomainmodel.g:503:3: ruleDeclaration
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


    // $ANTLR start "rule__Ship__ConditionsAssignment_1"
    // InternalDomainmodel.g:512:1: rule__Ship__ConditionsAssignment_1 : ( ruleCondition ) ;
    public final void rule__Ship__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:516:1: ( ( ruleCondition ) )
            // InternalDomainmodel.g:517:2: ( ruleCondition )
            {
            // InternalDomainmodel.g:517:2: ( ruleCondition )
            // InternalDomainmodel.g:518:3: ruleCondition
            {
             before(grammarAccess.getShipAccess().getConditionsConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getShipAccess().getConditionsConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ship__ConditionsAssignment_1"


    // $ANTLR start "rule__Ship__ConditionsAssignment_2_1"
    // InternalDomainmodel.g:527:1: rule__Ship__ConditionsAssignment_2_1 : ( ruleCondition ) ;
    public final void rule__Ship__ConditionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:531:1: ( ( ruleCondition ) )
            // InternalDomainmodel.g:532:2: ( ruleCondition )
            {
            // InternalDomainmodel.g:532:2: ( ruleCondition )
            // InternalDomainmodel.g:533:3: ruleCondition
            {
             before(grammarAccess.getShipAccess().getConditionsConditionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getShipAccess().getConditionsConditionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Ship__ConditionsAssignment_2_1"


    // $ANTLR start "rule__Ship__ActionAssignment_4"
    // InternalDomainmodel.g:542:1: rule__Ship__ActionAssignment_4 : ( ruleAction ) ;
    public final void rule__Ship__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:546:1: ( ( ruleAction ) )
            // InternalDomainmodel.g:547:2: ( ruleAction )
            {
            // InternalDomainmodel.g:547:2: ( ruleAction )
            // InternalDomainmodel.g:548:3: ruleAction
            {
             before(grammarAccess.getShipAccess().getActionActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getShipAccess().getActionActionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Ship__ActionAssignment_4"


    // $ANTLR start "rule__Ship__ActionAssignment_5"
    // InternalDomainmodel.g:557:1: rule__Ship__ActionAssignment_5 : ( ruleItem ) ;
    public final void rule__Ship__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:561:1: ( ( ruleItem ) )
            // InternalDomainmodel.g:562:2: ( ruleItem )
            {
            // InternalDomainmodel.g:562:2: ( ruleItem )
            // InternalDomainmodel.g:563:3: ruleItem
            {
             before(grammarAccess.getShipAccess().getActionItemParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getShipAccess().getActionItemParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Ship__ActionAssignment_5"


    // $ANTLR start "rule__Ship__AddressAssignment_7"
    // InternalDomainmodel.g:572:1: rule__Ship__AddressAssignment_7 : ( ruleAddress ) ;
    public final void rule__Ship__AddressAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:576:1: ( ( ruleAddress ) )
            // InternalDomainmodel.g:577:2: ( ruleAddress )
            {
            // InternalDomainmodel.g:577:2: ( ruleAddress )
            // InternalDomainmodel.g:578:3: ruleAddress
            {
             before(grammarAccess.getShipAccess().getAddressAddressParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getShipAccess().getAddressAddressParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Ship__AddressAssignment_7"


    // $ANTLR start "rule__Item__NameAssignment"
    // InternalDomainmodel.g:587:1: rule__Item__NameAssignment : ( RULE_ID ) ;
    public final void rule__Item__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:591:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:592:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:592:2: ( RULE_ID )
            // InternalDomainmodel.g:593:3: RULE_ID
            {
             before(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Item__NameAssignment"


    // $ANTLR start "rule__Address__NameAssignment"
    // InternalDomainmodel.g:602:1: rule__Address__NameAssignment : ( RULE_ID ) ;
    public final void rule__Address__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:606:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:607:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:607:2: ( RULE_ID )
            // InternalDomainmodel.g:608:3: RULE_ID
            {
             before(grammarAccess.getAddressAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Address__NameAssignment"


    // $ANTLR start "rule__Condition__NameAssignment"
    // InternalDomainmodel.g:617:1: rule__Condition__NameAssignment : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:621:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:622:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:622:2: ( RULE_ID )
            // InternalDomainmodel.g:623:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Condition__NameAssignment"


    // $ANTLR start "rule__Action__NameAssignment"
    // InternalDomainmodel.g:632:1: rule__Action__NameAssignment : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:636:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:637:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:637:2: ( RULE_ID )
            // InternalDomainmodel.g:638:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Action__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});

}
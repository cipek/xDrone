package ic.ac.uk.xdrone.ide.contentassist.antlr.internal;

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
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDroneParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF()'", "'LAND()'", "'fly(){'", "'}'", "'environment(){'", "'.'", "'-'", "'UP'", "'('", "')'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'", "'DRONE'", "','"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXDroneParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXDroneParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXDroneParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXDrone.g"; }


    	private XDroneGrammarAccess grammarAccess;

    	public void setGrammarAccess(XDroneGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalXDrone.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalXDrone.g:54:1: ( ruleProgram EOF )
            // InternalXDrone.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalXDrone.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalXDrone.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalXDrone.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalXDrone.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalXDrone.g:69:3: ( rule__Program__Group__0 )
            // InternalXDrone.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFly"
    // InternalXDrone.g:78:1: entryRuleFly : ruleFly EOF ;
    public final void entryRuleFly() throws RecognitionException {
        try {
            // InternalXDrone.g:79:1: ( ruleFly EOF )
            // InternalXDrone.g:80:1: ruleFly EOF
            {
             before(grammarAccess.getFlyRule()); 
            pushFollow(FOLLOW_1);
            ruleFly();

            state._fsp--;

             after(grammarAccess.getFlyRule()); 
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
    // $ANTLR end "entryRuleFly"


    // $ANTLR start "ruleFly"
    // InternalXDrone.g:87:1: ruleFly : ( ( rule__Fly__Group__0 ) ) ;
    public final void ruleFly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:91:2: ( ( ( rule__Fly__Group__0 ) ) )
            // InternalXDrone.g:92:2: ( ( rule__Fly__Group__0 ) )
            {
            // InternalXDrone.g:92:2: ( ( rule__Fly__Group__0 ) )
            // InternalXDrone.g:93:3: ( rule__Fly__Group__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup()); 
            // InternalXDrone.g:94:3: ( rule__Fly__Group__0 )
            // InternalXDrone.g:94:4: rule__Fly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getGroup()); 

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
    // $ANTLR end "ruleFly"


    // $ANTLR start "entryRuleEnvironment"
    // InternalXDrone.g:103:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalXDrone.g:104:1: ( ruleEnvironment EOF )
            // InternalXDrone.g:105:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
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
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalXDrone.g:112:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:116:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalXDrone.g:117:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalXDrone.g:117:2: ( ( rule__Environment__Group__0 ) )
            // InternalXDrone.g:118:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalXDrone.g:119:3: ( rule__Environment__Group__0 )
            // InternalXDrone.g:119:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleTakeoff"
    // InternalXDrone.g:128:1: entryRuleTakeoff : ruleTakeoff EOF ;
    public final void entryRuleTakeoff() throws RecognitionException {
        try {
            // InternalXDrone.g:129:1: ( ruleTakeoff EOF )
            // InternalXDrone.g:130:1: ruleTakeoff EOF
            {
             before(grammarAccess.getTakeoffRule()); 
            pushFollow(FOLLOW_1);
            ruleTakeoff();

            state._fsp--;

             after(grammarAccess.getTakeoffRule()); 
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
    // $ANTLR end "entryRuleTakeoff"


    // $ANTLR start "ruleTakeoff"
    // InternalXDrone.g:137:1: ruleTakeoff : ( 'TAKEOFF()' ) ;
    public final void ruleTakeoff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:141:2: ( ( 'TAKEOFF()' ) )
            // InternalXDrone.g:142:2: ( 'TAKEOFF()' )
            {
            // InternalXDrone.g:142:2: ( 'TAKEOFF()' )
            // InternalXDrone.g:143:3: 'TAKEOFF()'
            {
             before(grammarAccess.getTakeoffAccess().getTAKEOFFKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTakeoffAccess().getTAKEOFFKeyword()); 

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
    // $ANTLR end "ruleTakeoff"


    // $ANTLR start "entryRuleLand"
    // InternalXDrone.g:153:1: entryRuleLand : ruleLand EOF ;
    public final void entryRuleLand() throws RecognitionException {
        try {
            // InternalXDrone.g:154:1: ( ruleLand EOF )
            // InternalXDrone.g:155:1: ruleLand EOF
            {
             before(grammarAccess.getLandRule()); 
            pushFollow(FOLLOW_1);
            ruleLand();

            state._fsp--;

             after(grammarAccess.getLandRule()); 
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
    // $ANTLR end "entryRuleLand"


    // $ANTLR start "ruleLand"
    // InternalXDrone.g:162:1: ruleLand : ( 'LAND()' ) ;
    public final void ruleLand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:166:2: ( ( 'LAND()' ) )
            // InternalXDrone.g:167:2: ( 'LAND()' )
            {
            // InternalXDrone.g:167:2: ( 'LAND()' )
            // InternalXDrone.g:168:3: 'LAND()'
            {
             before(grammarAccess.getLandAccess().getLANDKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLandAccess().getLANDKeyword()); 

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
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleSuperCommand"
    // InternalXDrone.g:178:1: entryRuleSuperCommand : ruleSuperCommand EOF ;
    public final void entryRuleSuperCommand() throws RecognitionException {
        try {
            // InternalXDrone.g:179:1: ( ruleSuperCommand EOF )
            // InternalXDrone.g:180:1: ruleSuperCommand EOF
            {
             before(grammarAccess.getSuperCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperCommand();

            state._fsp--;

             after(grammarAccess.getSuperCommandRule()); 
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
    // $ANTLR end "entryRuleSuperCommand"


    // $ANTLR start "ruleSuperCommand"
    // InternalXDrone.g:187:1: ruleSuperCommand : ( ( rule__SuperCommand__Alternatives ) ) ;
    public final void ruleSuperCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:191:2: ( ( ( rule__SuperCommand__Alternatives ) ) )
            // InternalXDrone.g:192:2: ( ( rule__SuperCommand__Alternatives ) )
            {
            // InternalXDrone.g:192:2: ( ( rule__SuperCommand__Alternatives ) )
            // InternalXDrone.g:193:3: ( rule__SuperCommand__Alternatives )
            {
             before(grammarAccess.getSuperCommandAccess().getAlternatives()); 
            // InternalXDrone.g:194:3: ( rule__SuperCommand__Alternatives )
            // InternalXDrone.g:194:4: rule__SuperCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SuperCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSuperCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSuperCommand"


    // $ANTLR start "entryRuleCommand"
    // InternalXDrone.g:203:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalXDrone.g:204:1: ( ruleCommand EOF )
            // InternalXDrone.g:205:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalXDrone.g:212:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:216:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalXDrone.g:217:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalXDrone.g:217:2: ( ( rule__Command__Alternatives ) )
            // InternalXDrone.g:218:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalXDrone.g:219:3: ( rule__Command__Alternatives )
            // InternalXDrone.g:219:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalXDrone.g:228:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalXDrone.g:229:1: ( ruleDOUBLE EOF )
            // InternalXDrone.g:230:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalXDrone.g:237:1: ruleDOUBLE : ( ( rule__DOUBLE__Alternatives ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:241:2: ( ( ( rule__DOUBLE__Alternatives ) ) )
            // InternalXDrone.g:242:2: ( ( rule__DOUBLE__Alternatives ) )
            {
            // InternalXDrone.g:242:2: ( ( rule__DOUBLE__Alternatives ) )
            // InternalXDrone.g:243:3: ( rule__DOUBLE__Alternatives )
            {
             before(grammarAccess.getDOUBLEAccess().getAlternatives()); 
            // InternalXDrone.g:244:3: ( rule__DOUBLE__Alternatives )
            // InternalXDrone.g:244:4: rule__DOUBLE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:253:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalXDrone.g:254:1: ( ruleUp EOF )
            // InternalXDrone.g:255:1: ruleUp EOF
            {
             before(grammarAccess.getUpRule()); 
            pushFollow(FOLLOW_1);
            ruleUp();

            state._fsp--;

             after(grammarAccess.getUpRule()); 
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
    // $ANTLR end "entryRuleUp"


    // $ANTLR start "ruleUp"
    // InternalXDrone.g:262:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:266:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalXDrone.g:267:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalXDrone.g:267:2: ( ( rule__Up__Group__0 ) )
            // InternalXDrone.g:268:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalXDrone.g:269:3: ( rule__Up__Group__0 )
            // InternalXDrone.g:269:4: rule__Up__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Up__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpAccess().getGroup()); 

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
    // $ANTLR end "ruleUp"


    // $ANTLR start "entryRuleDown"
    // InternalXDrone.g:278:1: entryRuleDown : ruleDown EOF ;
    public final void entryRuleDown() throws RecognitionException {
        try {
            // InternalXDrone.g:279:1: ( ruleDown EOF )
            // InternalXDrone.g:280:1: ruleDown EOF
            {
             before(grammarAccess.getDownRule()); 
            pushFollow(FOLLOW_1);
            ruleDown();

            state._fsp--;

             after(grammarAccess.getDownRule()); 
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
    // $ANTLR end "entryRuleDown"


    // $ANTLR start "ruleDown"
    // InternalXDrone.g:287:1: ruleDown : ( ( rule__Down__Group__0 ) ) ;
    public final void ruleDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:291:2: ( ( ( rule__Down__Group__0 ) ) )
            // InternalXDrone.g:292:2: ( ( rule__Down__Group__0 ) )
            {
            // InternalXDrone.g:292:2: ( ( rule__Down__Group__0 ) )
            // InternalXDrone.g:293:3: ( rule__Down__Group__0 )
            {
             before(grammarAccess.getDownAccess().getGroup()); 
            // InternalXDrone.g:294:3: ( rule__Down__Group__0 )
            // InternalXDrone.g:294:4: rule__Down__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Down__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDownAccess().getGroup()); 

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
    // $ANTLR end "ruleDown"


    // $ANTLR start "entryRuleLeft"
    // InternalXDrone.g:303:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalXDrone.g:304:1: ( ruleLeft EOF )
            // InternalXDrone.g:305:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalXDrone.g:312:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:316:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalXDrone.g:317:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalXDrone.g:317:2: ( ( rule__Left__Group__0 ) )
            // InternalXDrone.g:318:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalXDrone.g:319:3: ( rule__Left__Group__0 )
            // InternalXDrone.g:319:4: rule__Left__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalXDrone.g:328:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalXDrone.g:329:1: ( ruleRight EOF )
            // InternalXDrone.g:330:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalXDrone.g:337:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:341:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalXDrone.g:342:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalXDrone.g:342:2: ( ( rule__Right__Group__0 ) )
            // InternalXDrone.g:343:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalXDrone.g:344:3: ( rule__Right__Group__0 )
            // InternalXDrone.g:344:4: rule__Right__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getGroup()); 

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleForward"
    // InternalXDrone.g:353:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalXDrone.g:354:1: ( ruleForward EOF )
            // InternalXDrone.g:355:1: ruleForward EOF
            {
             before(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            ruleForward();

            state._fsp--;

             after(grammarAccess.getForwardRule()); 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalXDrone.g:362:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:366:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalXDrone.g:367:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalXDrone.g:367:2: ( ( rule__Forward__Group__0 ) )
            // InternalXDrone.g:368:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalXDrone.g:369:3: ( rule__Forward__Group__0 )
            // InternalXDrone.g:369:4: rule__Forward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getGroup()); 

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleBackward"
    // InternalXDrone.g:378:1: entryRuleBackward : ruleBackward EOF ;
    public final void entryRuleBackward() throws RecognitionException {
        try {
            // InternalXDrone.g:379:1: ( ruleBackward EOF )
            // InternalXDrone.g:380:1: ruleBackward EOF
            {
             before(grammarAccess.getBackwardRule()); 
            pushFollow(FOLLOW_1);
            ruleBackward();

            state._fsp--;

             after(grammarAccess.getBackwardRule()); 
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
    // $ANTLR end "entryRuleBackward"


    // $ANTLR start "ruleBackward"
    // InternalXDrone.g:387:1: ruleBackward : ( ( rule__Backward__Group__0 ) ) ;
    public final void ruleBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:391:2: ( ( ( rule__Backward__Group__0 ) ) )
            // InternalXDrone.g:392:2: ( ( rule__Backward__Group__0 ) )
            {
            // InternalXDrone.g:392:2: ( ( rule__Backward__Group__0 ) )
            // InternalXDrone.g:393:3: ( rule__Backward__Group__0 )
            {
             before(grammarAccess.getBackwardAccess().getGroup()); 
            // InternalXDrone.g:394:3: ( rule__Backward__Group__0 )
            // InternalXDrone.g:394:4: rule__Backward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Backward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackwardAccess().getGroup()); 

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
    // $ANTLR end "ruleBackward"


    // $ANTLR start "entryRuleRotateL"
    // InternalXDrone.g:403:1: entryRuleRotateL : ruleRotateL EOF ;
    public final void entryRuleRotateL() throws RecognitionException {
        try {
            // InternalXDrone.g:404:1: ( ruleRotateL EOF )
            // InternalXDrone.g:405:1: ruleRotateL EOF
            {
             before(grammarAccess.getRotateLRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateL();

            state._fsp--;

             after(grammarAccess.getRotateLRule()); 
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
    // $ANTLR end "entryRuleRotateL"


    // $ANTLR start "ruleRotateL"
    // InternalXDrone.g:412:1: ruleRotateL : ( ( rule__RotateL__Group__0 ) ) ;
    public final void ruleRotateL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:416:2: ( ( ( rule__RotateL__Group__0 ) ) )
            // InternalXDrone.g:417:2: ( ( rule__RotateL__Group__0 ) )
            {
            // InternalXDrone.g:417:2: ( ( rule__RotateL__Group__0 ) )
            // InternalXDrone.g:418:3: ( rule__RotateL__Group__0 )
            {
             before(grammarAccess.getRotateLAccess().getGroup()); 
            // InternalXDrone.g:419:3: ( rule__RotateL__Group__0 )
            // InternalXDrone.g:419:4: rule__RotateL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateLAccess().getGroup()); 

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
    // $ANTLR end "ruleRotateL"


    // $ANTLR start "entryRuleRotateR"
    // InternalXDrone.g:428:1: entryRuleRotateR : ruleRotateR EOF ;
    public final void entryRuleRotateR() throws RecognitionException {
        try {
            // InternalXDrone.g:429:1: ( ruleRotateR EOF )
            // InternalXDrone.g:430:1: ruleRotateR EOF
            {
             before(grammarAccess.getRotateRRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateR();

            state._fsp--;

             after(grammarAccess.getRotateRRule()); 
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
    // $ANTLR end "entryRuleRotateR"


    // $ANTLR start "ruleRotateR"
    // InternalXDrone.g:437:1: ruleRotateR : ( ( rule__RotateR__Group__0 ) ) ;
    public final void ruleRotateR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:441:2: ( ( ( rule__RotateR__Group__0 ) ) )
            // InternalXDrone.g:442:2: ( ( rule__RotateR__Group__0 ) )
            {
            // InternalXDrone.g:442:2: ( ( rule__RotateR__Group__0 ) )
            // InternalXDrone.g:443:3: ( rule__RotateR__Group__0 )
            {
             before(grammarAccess.getRotateRAccess().getGroup()); 
            // InternalXDrone.g:444:3: ( rule__RotateR__Group__0 )
            // InternalXDrone.g:444:4: rule__RotateR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateRAccess().getGroup()); 

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
    // $ANTLR end "ruleRotateR"


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:453:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalXDrone.g:454:1: ( ruleWait EOF )
            // InternalXDrone.g:455:1: ruleWait EOF
            {
             before(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getWaitRule()); 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalXDrone.g:462:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:466:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalXDrone.g:467:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalXDrone.g:467:2: ( ( rule__Wait__Group__0 ) )
            // InternalXDrone.g:468:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalXDrone.g:469:3: ( rule__Wait__Group__0 )
            // InternalXDrone.g:469:4: rule__Wait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getGroup()); 

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleFunctionName"
    // InternalXDrone.g:478:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalXDrone.g:479:1: ( ruleFunctionName EOF )
            // InternalXDrone.g:480:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalXDrone.g:487:1: ruleFunctionName : ( ( rule__FunctionName__Group__0 ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:491:2: ( ( ( rule__FunctionName__Group__0 ) ) )
            // InternalXDrone.g:492:2: ( ( rule__FunctionName__Group__0 ) )
            {
            // InternalXDrone.g:492:2: ( ( rule__FunctionName__Group__0 ) )
            // InternalXDrone.g:493:3: ( rule__FunctionName__Group__0 )
            {
             before(grammarAccess.getFunctionNameAccess().getGroup()); 
            // InternalXDrone.g:494:3: ( rule__FunctionName__Group__0 )
            // InternalXDrone.g:494:4: rule__FunctionName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionNameAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleDrone"
    // InternalXDrone.g:503:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalXDrone.g:504:1: ( ruleDrone EOF )
            // InternalXDrone.g:505:1: ruleDrone EOF
            {
             before(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getDroneRule()); 
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
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalXDrone.g:512:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:516:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalXDrone.g:517:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalXDrone.g:517:2: ( ( rule__Drone__Group__0 ) )
            // InternalXDrone.g:518:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalXDrone.g:519:3: ( rule__Drone__Group__0 )
            // InternalXDrone.g:519:4: rule__Drone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getGroup()); 

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
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRuleObject"
    // InternalXDrone.g:528:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( ruleObject EOF )
            // InternalXDrone.g:530:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
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
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalXDrone.g:537:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__Object__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__Object__Group__0 )
            // InternalXDrone.g:544:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "rule__SuperCommand__Alternatives"
    // InternalXDrone.g:552:1: rule__SuperCommand__Alternatives : ( ( ruleCommand ) | ( ruleFunctionName ) );
    public final void rule__SuperCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:556:1: ( ( ruleCommand ) | ( ruleFunctionName ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18||(LA1_0>=21 && LA1_0<=28)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXDrone.g:557:2: ( ruleCommand )
                    {
                    // InternalXDrone.g:557:2: ( ruleCommand )
                    // InternalXDrone.g:558:3: ruleCommand
                    {
                     before(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:563:2: ( ruleFunctionName )
                    {
                    // InternalXDrone.g:563:2: ( ruleFunctionName )
                    // InternalXDrone.g:564:3: ruleFunctionName
                    {
                     before(grammarAccess.getSuperCommandAccess().getFunctionNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionName();

                    state._fsp--;

                     after(grammarAccess.getSuperCommandAccess().getFunctionNameParserRuleCall_1()); 

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
    // $ANTLR end "rule__SuperCommand__Alternatives"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalXDrone.g:573:1: rule__Command__Alternatives : ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:577:1: ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 25:
                {
                alt2=6;
                }
                break;
            case 26:
                {
                alt2=7;
                }
                break;
            case 27:
                {
                alt2=8;
                }
                break;
            case 28:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXDrone.g:578:2: ( ruleUp )
                    {
                    // InternalXDrone.g:578:2: ( ruleUp )
                    // InternalXDrone.g:579:3: ruleUp
                    {
                     before(grammarAccess.getCommandAccess().getUpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUp();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getUpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:584:2: ( ruleDown )
                    {
                    // InternalXDrone.g:584:2: ( ruleDown )
                    // InternalXDrone.g:585:3: ruleDown
                    {
                     before(grammarAccess.getCommandAccess().getDownParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDown();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDownParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:590:2: ( ruleLeft )
                    {
                    // InternalXDrone.g:590:2: ( ruleLeft )
                    // InternalXDrone.g:591:3: ruleLeft
                    {
                     before(grammarAccess.getCommandAccess().getLeftParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLeft();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getLeftParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:596:2: ( ruleRight )
                    {
                    // InternalXDrone.g:596:2: ( ruleRight )
                    // InternalXDrone.g:597:3: ruleRight
                    {
                     before(grammarAccess.getCommandAccess().getRightParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRight();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRightParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXDrone.g:602:2: ( ruleForward )
                    {
                    // InternalXDrone.g:602:2: ( ruleForward )
                    // InternalXDrone.g:603:3: ruleForward
                    {
                     before(grammarAccess.getCommandAccess().getForwardParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleForward();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getForwardParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXDrone.g:608:2: ( ruleBackward )
                    {
                    // InternalXDrone.g:608:2: ( ruleBackward )
                    // InternalXDrone.g:609:3: ruleBackward
                    {
                     before(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBackward();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXDrone.g:614:2: ( ruleRotateL )
                    {
                    // InternalXDrone.g:614:2: ( ruleRotateL )
                    // InternalXDrone.g:615:3: ruleRotateL
                    {
                     before(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateL();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXDrone.g:620:2: ( ruleRotateR )
                    {
                    // InternalXDrone.g:620:2: ( ruleRotateR )
                    // InternalXDrone.g:621:3: ruleRotateR
                    {
                     before(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateR();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXDrone.g:626:2: ( ruleWait )
                    {
                    // InternalXDrone.g:626:2: ( ruleWait )
                    // InternalXDrone.g:627:3: ruleWait
                    {
                     before(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__DOUBLE__Alternatives"
    // InternalXDrone.g:636:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( ( rule__DOUBLE__Group_1__0 ) ) | ( RULE_INT ) | ( ( rule__DOUBLE__Group_3__0 ) ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:640:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( ( rule__DOUBLE__Group_1__0 ) ) | ( RULE_INT ) | ( ( rule__DOUBLE__Group_3__0 ) ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||LA3_1==20||LA3_1==31) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==17) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_INT) ) {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==EOF||LA3_5==20||LA3_5==31) ) {
                        alt3=4;
                    }
                    else if ( (LA3_5==16) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:641:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:641:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:642:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:643:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:643:4: rule__DOUBLE__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDOUBLEAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:647:2: ( ( rule__DOUBLE__Group_1__0 ) )
                    {
                    // InternalXDrone.g:647:2: ( ( rule__DOUBLE__Group_1__0 ) )
                    // InternalXDrone.g:648:3: ( rule__DOUBLE__Group_1__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
                    // InternalXDrone.g:649:3: ( rule__DOUBLE__Group_1__0 )
                    // InternalXDrone.g:649:4: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDOUBLEAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:653:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:653:2: ( RULE_INT )
                    // InternalXDrone.g:654:3: RULE_INT
                    {
                     before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:659:2: ( ( rule__DOUBLE__Group_3__0 ) )
                    {
                    // InternalXDrone.g:659:2: ( ( rule__DOUBLE__Group_3__0 ) )
                    // InternalXDrone.g:660:3: ( rule__DOUBLE__Group_3__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_3()); 
                    // InternalXDrone.g:661:3: ( rule__DOUBLE__Group_3__0 )
                    // InternalXDrone.g:661:4: rule__DOUBLE__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDOUBLEAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DOUBLE__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalXDrone.g:669:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:673:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalXDrone.g:674:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalXDrone.g:681:1: rule__Program__Group__0__Impl : ( ( rule__Program__FlyAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:685:1: ( ( ( rule__Program__FlyAssignment_0 ) ) )
            // InternalXDrone.g:686:1: ( ( rule__Program__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:686:1: ( ( rule__Program__FlyAssignment_0 ) )
            // InternalXDrone.g:687:2: ( rule__Program__FlyAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:688:2: ( rule__Program__FlyAssignment_0 )
            // InternalXDrone.g:688:3: rule__Program__FlyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__FlyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getFlyAssignment_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalXDrone.g:696:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:700:1: ( rule__Program__Group__1__Impl )
            // InternalXDrone.g:701:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalXDrone.g:707:1: rule__Program__Group__1__Impl : ( ( rule__Program__EnvironmentAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:711:1: ( ( ( rule__Program__EnvironmentAssignment_1 ) ) )
            // InternalXDrone.g:712:1: ( ( rule__Program__EnvironmentAssignment_1 ) )
            {
            // InternalXDrone.g:712:1: ( ( rule__Program__EnvironmentAssignment_1 ) )
            // InternalXDrone.g:713:2: ( rule__Program__EnvironmentAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:714:2: ( rule__Program__EnvironmentAssignment_1 )
            // InternalXDrone.g:714:3: rule__Program__EnvironmentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__EnvironmentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getEnvironmentAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Fly__Group__0"
    // InternalXDrone.g:723:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:727:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:728:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group__1();

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
    // $ANTLR end "rule__Fly__Group__0"


    // $ANTLR start "rule__Fly__Group__0__Impl"
    // InternalXDrone.g:735:1: rule__Fly__Group__0__Impl : ( 'fly(){' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:739:1: ( ( 'fly(){' ) )
            // InternalXDrone.g:740:1: ( 'fly(){' )
            {
            // InternalXDrone.g:740:1: ( 'fly(){' )
            // InternalXDrone.g:741:2: 'fly(){'
            {
             before(grammarAccess.getFlyAccess().getFlyKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFlyAccess().getFlyKeyword_0()); 

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
    // $ANTLR end "rule__Fly__Group__0__Impl"


    // $ANTLR start "rule__Fly__Group__1"
    // InternalXDrone.g:750:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:754:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:755:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Fly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group__2();

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
    // $ANTLR end "rule__Fly__Group__1"


    // $ANTLR start "rule__Fly__Group__1__Impl"
    // InternalXDrone.g:762:1: rule__Fly__Group__1__Impl : ( ( rule__Fly__Group_1__0 ) ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:766:1: ( ( ( rule__Fly__Group_1__0 ) ) )
            // InternalXDrone.g:767:1: ( ( rule__Fly__Group_1__0 ) )
            {
            // InternalXDrone.g:767:1: ( ( rule__Fly__Group_1__0 ) )
            // InternalXDrone.g:768:2: ( rule__Fly__Group_1__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_1()); 
            // InternalXDrone.g:769:2: ( rule__Fly__Group_1__0 )
            // InternalXDrone.g:769:3: rule__Fly__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Fly__Group__1__Impl"


    // $ANTLR start "rule__Fly__Group__2"
    // InternalXDrone.g:777:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:781:1: ( rule__Fly__Group__2__Impl )
            // InternalXDrone.g:782:2: rule__Fly__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group__2__Impl();

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
    // $ANTLR end "rule__Fly__Group__2"


    // $ANTLR start "rule__Fly__Group__2__Impl"
    // InternalXDrone.g:788:1: rule__Fly__Group__2__Impl : ( '}' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:792:1: ( ( '}' ) )
            // InternalXDrone.g:793:1: ( '}' )
            {
            // InternalXDrone.g:793:1: ( '}' )
            // InternalXDrone.g:794:2: '}'
            {
             before(grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Fly__Group__2__Impl"


    // $ANTLR start "rule__Fly__Group_1__0"
    // InternalXDrone.g:804:1: rule__Fly__Group_1__0 : rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 ;
    public final void rule__Fly__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:808:1: ( rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 )
            // InternalXDrone.g:809:2: rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Fly__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group_1__1();

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
    // $ANTLR end "rule__Fly__Group_1__0"


    // $ANTLR start "rule__Fly__Group_1__0__Impl"
    // InternalXDrone.g:816:1: rule__Fly__Group_1__0__Impl : ( ( rule__Fly__TakeoffAssignment_1_0 ) ) ;
    public final void rule__Fly__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:820:1: ( ( ( rule__Fly__TakeoffAssignment_1_0 ) ) )
            // InternalXDrone.g:821:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            {
            // InternalXDrone.g:821:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            // InternalXDrone.g:822:2: ( rule__Fly__TakeoffAssignment_1_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 
            // InternalXDrone.g:823:2: ( rule__Fly__TakeoffAssignment_1_0 )
            // InternalXDrone.g:823:3: rule__Fly__TakeoffAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Fly__TakeoffAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 

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
    // $ANTLR end "rule__Fly__Group_1__0__Impl"


    // $ANTLR start "rule__Fly__Group_1__1"
    // InternalXDrone.g:831:1: rule__Fly__Group_1__1 : rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 ;
    public final void rule__Fly__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:835:1: ( rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 )
            // InternalXDrone.g:836:2: rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Fly__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group_1__2();

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
    // $ANTLR end "rule__Fly__Group_1__1"


    // $ANTLR start "rule__Fly__Group_1__1__Impl"
    // InternalXDrone.g:843:1: rule__Fly__Group_1__1__Impl : ( ( rule__Fly__CommandsAssignment_1_1 )* ) ;
    public final void rule__Fly__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:847:1: ( ( ( rule__Fly__CommandsAssignment_1_1 )* ) )
            // InternalXDrone.g:848:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            {
            // InternalXDrone.g:848:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            // InternalXDrone.g:849:2: ( rule__Fly__CommandsAssignment_1_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 
            // InternalXDrone.g:850:2: ( rule__Fly__CommandsAssignment_1_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==18||(LA4_0>=21 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXDrone.g:850:3: rule__Fly__CommandsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Fly__CommandsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 

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
    // $ANTLR end "rule__Fly__Group_1__1__Impl"


    // $ANTLR start "rule__Fly__Group_1__2"
    // InternalXDrone.g:858:1: rule__Fly__Group_1__2 : rule__Fly__Group_1__2__Impl ;
    public final void rule__Fly__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:862:1: ( rule__Fly__Group_1__2__Impl )
            // InternalXDrone.g:863:2: rule__Fly__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group_1__2__Impl();

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
    // $ANTLR end "rule__Fly__Group_1__2"


    // $ANTLR start "rule__Fly__Group_1__2__Impl"
    // InternalXDrone.g:869:1: rule__Fly__Group_1__2__Impl : ( ( rule__Fly__LandAssignment_1_2 ) ) ;
    public final void rule__Fly__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:873:1: ( ( ( rule__Fly__LandAssignment_1_2 ) ) )
            // InternalXDrone.g:874:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            {
            // InternalXDrone.g:874:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            // InternalXDrone.g:875:2: ( rule__Fly__LandAssignment_1_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 
            // InternalXDrone.g:876:2: ( rule__Fly__LandAssignment_1_2 )
            // InternalXDrone.g:876:3: rule__Fly__LandAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Fly__LandAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 

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
    // $ANTLR end "rule__Fly__Group_1__2__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // InternalXDrone.g:885:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:889:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:890:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

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
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalXDrone.g:897:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:901:1: ( ( () ) )
            // InternalXDrone.g:902:1: ( () )
            {
            // InternalXDrone.g:902:1: ( () )
            // InternalXDrone.g:903:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:904:2: ()
            // InternalXDrone.g:904:3: 
            {
            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalXDrone.g:912:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:916:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:917:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

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
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalXDrone.g:924:1: rule__Environment__Group__1__Impl : ( 'environment(){' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:928:1: ( ( 'environment(){' ) )
            // InternalXDrone.g:929:1: ( 'environment(){' )
            {
            // InternalXDrone.g:929:1: ( 'environment(){' )
            // InternalXDrone.g:930:2: 'environment(){'
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 

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
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalXDrone.g:939:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:943:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:944:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

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
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalXDrone.g:951:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__DroneAssignment_2 )? ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:955:1: ( ( ( rule__Environment__DroneAssignment_2 )? ) )
            // InternalXDrone.g:956:1: ( ( rule__Environment__DroneAssignment_2 )? )
            {
            // InternalXDrone.g:956:1: ( ( rule__Environment__DroneAssignment_2 )? )
            // InternalXDrone.g:957:2: ( rule__Environment__DroneAssignment_2 )?
            {
             before(grammarAccess.getEnvironmentAccess().getDroneAssignment_2()); 
            // InternalXDrone.g:958:2: ( rule__Environment__DroneAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:958:3: rule__Environment__DroneAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__DroneAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentAccess().getDroneAssignment_2()); 

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
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalXDrone.g:966:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:970:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // InternalXDrone.g:971:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__4();

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
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalXDrone.g:978:1: rule__Environment__Group__3__Impl : ( ( rule__Environment__ObjectsAssignment_3 )* ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:982:1: ( ( ( rule__Environment__ObjectsAssignment_3 )* ) )
            // InternalXDrone.g:983:1: ( ( rule__Environment__ObjectsAssignment_3 )* )
            {
            // InternalXDrone.g:983:1: ( ( rule__Environment__ObjectsAssignment_3 )* )
            // InternalXDrone.g:984:2: ( rule__Environment__ObjectsAssignment_3 )*
            {
             before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_3()); 
            // InternalXDrone.g:985:2: ( rule__Environment__ObjectsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXDrone.g:985:3: rule__Environment__ObjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Environment__ObjectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getObjectsAssignment_3()); 

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
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // InternalXDrone.g:993:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:997:1: ( rule__Environment__Group__4__Impl )
            // InternalXDrone.g:998:2: rule__Environment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__4__Impl();

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
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // InternalXDrone.g:1004:1: rule__Environment__Group__4__Impl : ( '}' ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1008:1: ( ( '}' ) )
            // InternalXDrone.g:1009:1: ( '}' )
            {
            // InternalXDrone.g:1009:1: ( '}' )
            // InternalXDrone.g:1010:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__DOUBLE__Group_0__0"
    // InternalXDrone.g:1020:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1024:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1025:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__DOUBLE__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_0__1();

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
    // $ANTLR end "rule__DOUBLE__Group_0__0"


    // $ANTLR start "rule__DOUBLE__Group_0__0__Impl"
    // InternalXDrone.g:1032:1: rule__DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1036:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1037:1: ( RULE_INT )
            {
            // InternalXDrone.g:1037:1: ( RULE_INT )
            // InternalXDrone.g:1038:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group_0__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_0__1"
    // InternalXDrone.g:1047:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl rule__DOUBLE__Group_0__2 ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1051:1: ( rule__DOUBLE__Group_0__1__Impl rule__DOUBLE__Group_0__2 )
            // InternalXDrone.g:1052:2: rule__DOUBLE__Group_0__1__Impl rule__DOUBLE__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__DOUBLE__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_0__2();

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
    // $ANTLR end "rule__DOUBLE__Group_0__1"


    // $ANTLR start "rule__DOUBLE__Group_0__1__Impl"
    // InternalXDrone.g:1059:1: rule__DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1063:1: ( ( '.' ) )
            // InternalXDrone.g:1064:1: ( '.' )
            {
            // InternalXDrone.g:1064:1: ( '.' )
            // InternalXDrone.g:1065:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group_0__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group_0__2"
    // InternalXDrone.g:1074:1: rule__DOUBLE__Group_0__2 : rule__DOUBLE__Group_0__2__Impl ;
    public final void rule__DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1078:1: ( rule__DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1079:2: rule__DOUBLE__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_0__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group_0__2"


    // $ANTLR start "rule__DOUBLE__Group_0__2__Impl"
    // InternalXDrone.g:1085:1: rule__DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1089:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1090:1: ( RULE_INT )
            {
            // InternalXDrone.g:1090:1: ( RULE_INT )
            // InternalXDrone.g:1091:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group_0__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__0"
    // InternalXDrone.g:1101:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1105:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalXDrone.g:1106:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__1();

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
    // $ANTLR end "rule__DOUBLE__Group_1__0"


    // $ANTLR start "rule__DOUBLE__Group_1__0__Impl"
    // InternalXDrone.g:1113:1: rule__DOUBLE__Group_1__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1117:1: ( ( '-' ) )
            // InternalXDrone.g:1118:1: ( '-' )
            {
            // InternalXDrone.g:1118:1: ( '-' )
            // InternalXDrone.g:1119:2: '-'
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group_1__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__1"
    // InternalXDrone.g:1128:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl rule__DOUBLE__Group_1__2 ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1132:1: ( rule__DOUBLE__Group_1__1__Impl rule__DOUBLE__Group_1__2 )
            // InternalXDrone.g:1133:2: rule__DOUBLE__Group_1__1__Impl rule__DOUBLE__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__DOUBLE__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__2();

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
    // $ANTLR end "rule__DOUBLE__Group_1__1"


    // $ANTLR start "rule__DOUBLE__Group_1__1__Impl"
    // InternalXDrone.g:1140:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1144:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1145:1: ( RULE_INT )
            {
            // InternalXDrone.g:1145:1: ( RULE_INT )
            // InternalXDrone.g:1146:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group_1__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__2"
    // InternalXDrone.g:1155:1: rule__DOUBLE__Group_1__2 : rule__DOUBLE__Group_1__2__Impl rule__DOUBLE__Group_1__3 ;
    public final void rule__DOUBLE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1159:1: ( rule__DOUBLE__Group_1__2__Impl rule__DOUBLE__Group_1__3 )
            // InternalXDrone.g:1160:2: rule__DOUBLE__Group_1__2__Impl rule__DOUBLE__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__DOUBLE__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__3();

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
    // $ANTLR end "rule__DOUBLE__Group_1__2"


    // $ANTLR start "rule__DOUBLE__Group_1__2__Impl"
    // InternalXDrone.g:1167:1: rule__DOUBLE__Group_1__2__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1171:1: ( ( '.' ) )
            // InternalXDrone.g:1172:1: ( '.' )
            {
            // InternalXDrone.g:1172:1: ( '.' )
            // InternalXDrone.g:1173:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_2()); 

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
    // $ANTLR end "rule__DOUBLE__Group_1__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__3"
    // InternalXDrone.g:1182:1: rule__DOUBLE__Group_1__3 : rule__DOUBLE__Group_1__3__Impl ;
    public final void rule__DOUBLE__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1186:1: ( rule__DOUBLE__Group_1__3__Impl )
            // InternalXDrone.g:1187:2: rule__DOUBLE__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__3__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group_1__3"


    // $ANTLR start "rule__DOUBLE__Group_1__3__Impl"
    // InternalXDrone.g:1193:1: rule__DOUBLE__Group_1__3__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1197:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1198:1: ( RULE_INT )
            {
            // InternalXDrone.g:1198:1: ( RULE_INT )
            // InternalXDrone.g:1199:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__DOUBLE__Group_1__3__Impl"


    // $ANTLR start "rule__DOUBLE__Group_3__0"
    // InternalXDrone.g:1209:1: rule__DOUBLE__Group_3__0 : rule__DOUBLE__Group_3__0__Impl rule__DOUBLE__Group_3__1 ;
    public final void rule__DOUBLE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1213:1: ( rule__DOUBLE__Group_3__0__Impl rule__DOUBLE__Group_3__1 )
            // InternalXDrone.g:1214:2: rule__DOUBLE__Group_3__0__Impl rule__DOUBLE__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__DOUBLE__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_3__1();

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
    // $ANTLR end "rule__DOUBLE__Group_3__0"


    // $ANTLR start "rule__DOUBLE__Group_3__0__Impl"
    // InternalXDrone.g:1221:1: rule__DOUBLE__Group_3__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1225:1: ( ( '-' ) )
            // InternalXDrone.g:1226:1: ( '-' )
            {
            // InternalXDrone.g:1226:1: ( '-' )
            // InternalXDrone.g:1227:2: '-'
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_3_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group_3__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_3__1"
    // InternalXDrone.g:1236:1: rule__DOUBLE__Group_3__1 : rule__DOUBLE__Group_3__1__Impl ;
    public final void rule__DOUBLE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1240:1: ( rule__DOUBLE__Group_3__1__Impl )
            // InternalXDrone.g:1241:2: rule__DOUBLE__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_3__1__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group_3__1"


    // $ANTLR start "rule__DOUBLE__Group_3__1__Impl"
    // InternalXDrone.g:1247:1: rule__DOUBLE__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1251:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1252:1: ( RULE_INT )
            {
            // InternalXDrone.g:1252:1: ( RULE_INT )
            // InternalXDrone.g:1253:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_3_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group_3__1__Impl"


    // $ANTLR start "rule__Up__Group__0"
    // InternalXDrone.g:1263:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1267:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:1268:2: rule__Up__Group__0__Impl rule__Up__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Up__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__1();

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
    // $ANTLR end "rule__Up__Group__0"


    // $ANTLR start "rule__Up__Group__0__Impl"
    // InternalXDrone.g:1275:1: rule__Up__Group__0__Impl : ( 'UP' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1279:1: ( ( 'UP' ) )
            // InternalXDrone.g:1280:1: ( 'UP' )
            {
            // InternalXDrone.g:1280:1: ( 'UP' )
            // InternalXDrone.g:1281:2: 'UP'
            {
             before(grammarAccess.getUpAccess().getUPKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getUPKeyword_0()); 

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
    // $ANTLR end "rule__Up__Group__0__Impl"


    // $ANTLR start "rule__Up__Group__1"
    // InternalXDrone.g:1290:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1294:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:1295:2: rule__Up__Group__1__Impl rule__Up__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Up__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__2();

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
    // $ANTLR end "rule__Up__Group__1"


    // $ANTLR start "rule__Up__Group__1__Impl"
    // InternalXDrone.g:1302:1: rule__Up__Group__1__Impl : ( '(' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1306:1: ( ( '(' ) )
            // InternalXDrone.g:1307:1: ( '(' )
            {
            // InternalXDrone.g:1307:1: ( '(' )
            // InternalXDrone.g:1308:2: '('
            {
             before(grammarAccess.getUpAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Up__Group__1__Impl"


    // $ANTLR start "rule__Up__Group__2"
    // InternalXDrone.g:1317:1: rule__Up__Group__2 : rule__Up__Group__2__Impl rule__Up__Group__3 ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1321:1: ( rule__Up__Group__2__Impl rule__Up__Group__3 )
            // InternalXDrone.g:1322:2: rule__Up__Group__2__Impl rule__Up__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Up__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__3();

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
    // $ANTLR end "rule__Up__Group__2"


    // $ANTLR start "rule__Up__Group__2__Impl"
    // InternalXDrone.g:1329:1: rule__Up__Group__2__Impl : ( ( rule__Up__DistanceAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1333:1: ( ( ( rule__Up__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1334:1: ( ( rule__Up__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1334:1: ( ( rule__Up__DistanceAssignment_2 ) )
            // InternalXDrone.g:1335:2: ( rule__Up__DistanceAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1336:2: ( rule__Up__DistanceAssignment_2 )
            // InternalXDrone.g:1336:3: rule__Up__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Up__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Up__Group__2__Impl"


    // $ANTLR start "rule__Up__Group__3"
    // InternalXDrone.g:1344:1: rule__Up__Group__3 : rule__Up__Group__3__Impl ;
    public final void rule__Up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1348:1: ( rule__Up__Group__3__Impl )
            // InternalXDrone.g:1349:2: rule__Up__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Up__Group__3__Impl();

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
    // $ANTLR end "rule__Up__Group__3"


    // $ANTLR start "rule__Up__Group__3__Impl"
    // InternalXDrone.g:1355:1: rule__Up__Group__3__Impl : ( ')' ) ;
    public final void rule__Up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1359:1: ( ( ')' ) )
            // InternalXDrone.g:1360:1: ( ')' )
            {
            // InternalXDrone.g:1360:1: ( ')' )
            // InternalXDrone.g:1361:2: ')'
            {
             before(grammarAccess.getUpAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Up__Group__3__Impl"


    // $ANTLR start "rule__Down__Group__0"
    // InternalXDrone.g:1371:1: rule__Down__Group__0 : rule__Down__Group__0__Impl rule__Down__Group__1 ;
    public final void rule__Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1375:1: ( rule__Down__Group__0__Impl rule__Down__Group__1 )
            // InternalXDrone.g:1376:2: rule__Down__Group__0__Impl rule__Down__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Down__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__1();

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
    // $ANTLR end "rule__Down__Group__0"


    // $ANTLR start "rule__Down__Group__0__Impl"
    // InternalXDrone.g:1383:1: rule__Down__Group__0__Impl : ( 'DOWN' ) ;
    public final void rule__Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1387:1: ( ( 'DOWN' ) )
            // InternalXDrone.g:1388:1: ( 'DOWN' )
            {
            // InternalXDrone.g:1388:1: ( 'DOWN' )
            // InternalXDrone.g:1389:2: 'DOWN'
            {
             before(grammarAccess.getDownAccess().getDOWNKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getDOWNKeyword_0()); 

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
    // $ANTLR end "rule__Down__Group__0__Impl"


    // $ANTLR start "rule__Down__Group__1"
    // InternalXDrone.g:1398:1: rule__Down__Group__1 : rule__Down__Group__1__Impl rule__Down__Group__2 ;
    public final void rule__Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1402:1: ( rule__Down__Group__1__Impl rule__Down__Group__2 )
            // InternalXDrone.g:1403:2: rule__Down__Group__1__Impl rule__Down__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Down__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__2();

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
    // $ANTLR end "rule__Down__Group__1"


    // $ANTLR start "rule__Down__Group__1__Impl"
    // InternalXDrone.g:1410:1: rule__Down__Group__1__Impl : ( '(' ) ;
    public final void rule__Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1414:1: ( ( '(' ) )
            // InternalXDrone.g:1415:1: ( '(' )
            {
            // InternalXDrone.g:1415:1: ( '(' )
            // InternalXDrone.g:1416:2: '('
            {
             before(grammarAccess.getDownAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Down__Group__1__Impl"


    // $ANTLR start "rule__Down__Group__2"
    // InternalXDrone.g:1425:1: rule__Down__Group__2 : rule__Down__Group__2__Impl rule__Down__Group__3 ;
    public final void rule__Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1429:1: ( rule__Down__Group__2__Impl rule__Down__Group__3 )
            // InternalXDrone.g:1430:2: rule__Down__Group__2__Impl rule__Down__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Down__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__3();

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
    // $ANTLR end "rule__Down__Group__2"


    // $ANTLR start "rule__Down__Group__2__Impl"
    // InternalXDrone.g:1437:1: rule__Down__Group__2__Impl : ( ( rule__Down__DistanceAssignment_2 ) ) ;
    public final void rule__Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1441:1: ( ( ( rule__Down__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1442:1: ( ( rule__Down__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1442:1: ( ( rule__Down__DistanceAssignment_2 ) )
            // InternalXDrone.g:1443:2: ( rule__Down__DistanceAssignment_2 )
            {
             before(grammarAccess.getDownAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1444:2: ( rule__Down__DistanceAssignment_2 )
            // InternalXDrone.g:1444:3: rule__Down__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Down__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDownAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Down__Group__2__Impl"


    // $ANTLR start "rule__Down__Group__3"
    // InternalXDrone.g:1452:1: rule__Down__Group__3 : rule__Down__Group__3__Impl ;
    public final void rule__Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1456:1: ( rule__Down__Group__3__Impl )
            // InternalXDrone.g:1457:2: rule__Down__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Down__Group__3__Impl();

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
    // $ANTLR end "rule__Down__Group__3"


    // $ANTLR start "rule__Down__Group__3__Impl"
    // InternalXDrone.g:1463:1: rule__Down__Group__3__Impl : ( ')' ) ;
    public final void rule__Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1467:1: ( ( ')' ) )
            // InternalXDrone.g:1468:1: ( ')' )
            {
            // InternalXDrone.g:1468:1: ( ')' )
            // InternalXDrone.g:1469:2: ')'
            {
             before(grammarAccess.getDownAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Down__Group__3__Impl"


    // $ANTLR start "rule__Left__Group__0"
    // InternalXDrone.g:1479:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1483:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:1484:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__1();

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
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // InternalXDrone.g:1491:1: rule__Left__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1495:1: ( ( 'LEFT' ) )
            // InternalXDrone.g:1496:1: ( 'LEFT' )
            {
            // InternalXDrone.g:1496:1: ( 'LEFT' )
            // InternalXDrone.g:1497:2: 'LEFT'
            {
             before(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 

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
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // InternalXDrone.g:1506:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1510:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:1511:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Left__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__2();

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
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // InternalXDrone.g:1518:1: rule__Left__Group__1__Impl : ( '(' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1522:1: ( ( '(' ) )
            // InternalXDrone.g:1523:1: ( '(' )
            {
            // InternalXDrone.g:1523:1: ( '(' )
            // InternalXDrone.g:1524:2: '('
            {
             before(grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__2"
    // InternalXDrone.g:1533:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1537:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // InternalXDrone.g:1538:2: rule__Left__Group__2__Impl rule__Left__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Left__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__3();

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
    // $ANTLR end "rule__Left__Group__2"


    // $ANTLR start "rule__Left__Group__2__Impl"
    // InternalXDrone.g:1545:1: rule__Left__Group__2__Impl : ( ( rule__Left__DistanceAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1549:1: ( ( ( rule__Left__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1550:1: ( ( rule__Left__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1550:1: ( ( rule__Left__DistanceAssignment_2 ) )
            // InternalXDrone.g:1551:2: ( rule__Left__DistanceAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1552:2: ( rule__Left__DistanceAssignment_2 )
            // InternalXDrone.g:1552:3: rule__Left__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Left__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Left__Group__2__Impl"


    // $ANTLR start "rule__Left__Group__3"
    // InternalXDrone.g:1560:1: rule__Left__Group__3 : rule__Left__Group__3__Impl ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1564:1: ( rule__Left__Group__3__Impl )
            // InternalXDrone.g:1565:2: rule__Left__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__3__Impl();

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
    // $ANTLR end "rule__Left__Group__3"


    // $ANTLR start "rule__Left__Group__3__Impl"
    // InternalXDrone.g:1571:1: rule__Left__Group__3__Impl : ( ')' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1575:1: ( ( ')' ) )
            // InternalXDrone.g:1576:1: ( ')' )
            {
            // InternalXDrone.g:1576:1: ( ')' )
            // InternalXDrone.g:1577:2: ')'
            {
             before(grammarAccess.getLeftAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Left__Group__3__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalXDrone.g:1587:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1591:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:1592:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__1();

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
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // InternalXDrone.g:1599:1: rule__Right__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1603:1: ( ( 'RIGHT' ) )
            // InternalXDrone.g:1604:1: ( 'RIGHT' )
            {
            // InternalXDrone.g:1604:1: ( 'RIGHT' )
            // InternalXDrone.g:1605:2: 'RIGHT'
            {
             before(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 

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
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // InternalXDrone.g:1614:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1618:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:1619:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Right__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__2();

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
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // InternalXDrone.g:1626:1: rule__Right__Group__1__Impl : ( '(' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1630:1: ( ( '(' ) )
            // InternalXDrone.g:1631:1: ( '(' )
            {
            // InternalXDrone.g:1631:1: ( '(' )
            // InternalXDrone.g:1632:2: '('
            {
             before(grammarAccess.getRightAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__Right__Group__2"
    // InternalXDrone.g:1641:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1645:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalXDrone.g:1646:2: rule__Right__Group__2__Impl rule__Right__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Right__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__3();

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
    // $ANTLR end "rule__Right__Group__2"


    // $ANTLR start "rule__Right__Group__2__Impl"
    // InternalXDrone.g:1653:1: rule__Right__Group__2__Impl : ( ( rule__Right__DistanceAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1657:1: ( ( ( rule__Right__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1658:1: ( ( rule__Right__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1658:1: ( ( rule__Right__DistanceAssignment_2 ) )
            // InternalXDrone.g:1659:2: ( rule__Right__DistanceAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1660:2: ( rule__Right__DistanceAssignment_2 )
            // InternalXDrone.g:1660:3: rule__Right__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Right__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Right__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__3"
    // InternalXDrone.g:1668:1: rule__Right__Group__3 : rule__Right__Group__3__Impl ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1672:1: ( rule__Right__Group__3__Impl )
            // InternalXDrone.g:1673:2: rule__Right__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__3__Impl();

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
    // $ANTLR end "rule__Right__Group__3"


    // $ANTLR start "rule__Right__Group__3__Impl"
    // InternalXDrone.g:1679:1: rule__Right__Group__3__Impl : ( ')' ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1683:1: ( ( ')' ) )
            // InternalXDrone.g:1684:1: ( ')' )
            {
            // InternalXDrone.g:1684:1: ( ')' )
            // InternalXDrone.g:1685:2: ')'
            {
             before(grammarAccess.getRightAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Right__Group__3__Impl"


    // $ANTLR start "rule__Forward__Group__0"
    // InternalXDrone.g:1695:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1699:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalXDrone.g:1700:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Forward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__1();

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
    // $ANTLR end "rule__Forward__Group__0"


    // $ANTLR start "rule__Forward__Group__0__Impl"
    // InternalXDrone.g:1707:1: rule__Forward__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1711:1: ( ( 'FORWARD' ) )
            // InternalXDrone.g:1712:1: ( 'FORWARD' )
            {
            // InternalXDrone.g:1712:1: ( 'FORWARD' )
            // InternalXDrone.g:1713:2: 'FORWARD'
            {
             before(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 

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
    // $ANTLR end "rule__Forward__Group__0__Impl"


    // $ANTLR start "rule__Forward__Group__1"
    // InternalXDrone.g:1722:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1726:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalXDrone.g:1727:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Forward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__2();

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
    // $ANTLR end "rule__Forward__Group__1"


    // $ANTLR start "rule__Forward__Group__1__Impl"
    // InternalXDrone.g:1734:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1738:1: ( ( '(' ) )
            // InternalXDrone.g:1739:1: ( '(' )
            {
            // InternalXDrone.g:1739:1: ( '(' )
            // InternalXDrone.g:1740:2: '('
            {
             before(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Forward__Group__1__Impl"


    // $ANTLR start "rule__Forward__Group__2"
    // InternalXDrone.g:1749:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1753:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalXDrone.g:1754:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Forward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__3();

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
    // $ANTLR end "rule__Forward__Group__2"


    // $ANTLR start "rule__Forward__Group__2__Impl"
    // InternalXDrone.g:1761:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1765:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1766:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1766:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalXDrone.g:1767:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1768:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalXDrone.g:1768:3: rule__Forward__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Forward__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Forward__Group__2__Impl"


    // $ANTLR start "rule__Forward__Group__3"
    // InternalXDrone.g:1776:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1780:1: ( rule__Forward__Group__3__Impl )
            // InternalXDrone.g:1781:2: rule__Forward__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__3__Impl();

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
    // $ANTLR end "rule__Forward__Group__3"


    // $ANTLR start "rule__Forward__Group__3__Impl"
    // InternalXDrone.g:1787:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1791:1: ( ( ')' ) )
            // InternalXDrone.g:1792:1: ( ')' )
            {
            // InternalXDrone.g:1792:1: ( ')' )
            // InternalXDrone.g:1793:2: ')'
            {
             before(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Forward__Group__3__Impl"


    // $ANTLR start "rule__Backward__Group__0"
    // InternalXDrone.g:1803:1: rule__Backward__Group__0 : rule__Backward__Group__0__Impl rule__Backward__Group__1 ;
    public final void rule__Backward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1807:1: ( rule__Backward__Group__0__Impl rule__Backward__Group__1 )
            // InternalXDrone.g:1808:2: rule__Backward__Group__0__Impl rule__Backward__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Backward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__1();

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
    // $ANTLR end "rule__Backward__Group__0"


    // $ANTLR start "rule__Backward__Group__0__Impl"
    // InternalXDrone.g:1815:1: rule__Backward__Group__0__Impl : ( 'BACKWARD' ) ;
    public final void rule__Backward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1819:1: ( ( 'BACKWARD' ) )
            // InternalXDrone.g:1820:1: ( 'BACKWARD' )
            {
            // InternalXDrone.g:1820:1: ( 'BACKWARD' )
            // InternalXDrone.g:1821:2: 'BACKWARD'
            {
             before(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 

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
    // $ANTLR end "rule__Backward__Group__0__Impl"


    // $ANTLR start "rule__Backward__Group__1"
    // InternalXDrone.g:1830:1: rule__Backward__Group__1 : rule__Backward__Group__1__Impl rule__Backward__Group__2 ;
    public final void rule__Backward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1834:1: ( rule__Backward__Group__1__Impl rule__Backward__Group__2 )
            // InternalXDrone.g:1835:2: rule__Backward__Group__1__Impl rule__Backward__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Backward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__2();

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
    // $ANTLR end "rule__Backward__Group__1"


    // $ANTLR start "rule__Backward__Group__1__Impl"
    // InternalXDrone.g:1842:1: rule__Backward__Group__1__Impl : ( '(' ) ;
    public final void rule__Backward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1846:1: ( ( '(' ) )
            // InternalXDrone.g:1847:1: ( '(' )
            {
            // InternalXDrone.g:1847:1: ( '(' )
            // InternalXDrone.g:1848:2: '('
            {
             before(grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Backward__Group__1__Impl"


    // $ANTLR start "rule__Backward__Group__2"
    // InternalXDrone.g:1857:1: rule__Backward__Group__2 : rule__Backward__Group__2__Impl rule__Backward__Group__3 ;
    public final void rule__Backward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1861:1: ( rule__Backward__Group__2__Impl rule__Backward__Group__3 )
            // InternalXDrone.g:1862:2: rule__Backward__Group__2__Impl rule__Backward__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Backward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__3();

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
    // $ANTLR end "rule__Backward__Group__2"


    // $ANTLR start "rule__Backward__Group__2__Impl"
    // InternalXDrone.g:1869:1: rule__Backward__Group__2__Impl : ( ( rule__Backward__DistanceAssignment_2 ) ) ;
    public final void rule__Backward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1873:1: ( ( ( rule__Backward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1874:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1874:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            // InternalXDrone.g:1875:2: ( rule__Backward__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1876:2: ( rule__Backward__DistanceAssignment_2 )
            // InternalXDrone.g:1876:3: rule__Backward__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Backward__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 

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
    // $ANTLR end "rule__Backward__Group__2__Impl"


    // $ANTLR start "rule__Backward__Group__3"
    // InternalXDrone.g:1884:1: rule__Backward__Group__3 : rule__Backward__Group__3__Impl ;
    public final void rule__Backward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1888:1: ( rule__Backward__Group__3__Impl )
            // InternalXDrone.g:1889:2: rule__Backward__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Backward__Group__3__Impl();

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
    // $ANTLR end "rule__Backward__Group__3"


    // $ANTLR start "rule__Backward__Group__3__Impl"
    // InternalXDrone.g:1895:1: rule__Backward__Group__3__Impl : ( ')' ) ;
    public final void rule__Backward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1899:1: ( ( ')' ) )
            // InternalXDrone.g:1900:1: ( ')' )
            {
            // InternalXDrone.g:1900:1: ( ')' )
            // InternalXDrone.g:1901:2: ')'
            {
             before(grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Backward__Group__3__Impl"


    // $ANTLR start "rule__RotateL__Group__0"
    // InternalXDrone.g:1911:1: rule__RotateL__Group__0 : rule__RotateL__Group__0__Impl rule__RotateL__Group__1 ;
    public final void rule__RotateL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1915:1: ( rule__RotateL__Group__0__Impl rule__RotateL__Group__1 )
            // InternalXDrone.g:1916:2: rule__RotateL__Group__0__Impl rule__RotateL__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RotateL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__1();

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
    // $ANTLR end "rule__RotateL__Group__0"


    // $ANTLR start "rule__RotateL__Group__0__Impl"
    // InternalXDrone.g:1923:1: rule__RotateL__Group__0__Impl : ( 'ROTATELEFT' ) ;
    public final void rule__RotateL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1927:1: ( ( 'ROTATELEFT' ) )
            // InternalXDrone.g:1928:1: ( 'ROTATELEFT' )
            {
            // InternalXDrone.g:1928:1: ( 'ROTATELEFT' )
            // InternalXDrone.g:1929:2: 'ROTATELEFT'
            {
             before(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 

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
    // $ANTLR end "rule__RotateL__Group__0__Impl"


    // $ANTLR start "rule__RotateL__Group__1"
    // InternalXDrone.g:1938:1: rule__RotateL__Group__1 : rule__RotateL__Group__1__Impl rule__RotateL__Group__2 ;
    public final void rule__RotateL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1942:1: ( rule__RotateL__Group__1__Impl rule__RotateL__Group__2 )
            // InternalXDrone.g:1943:2: rule__RotateL__Group__1__Impl rule__RotateL__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RotateL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__2();

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
    // $ANTLR end "rule__RotateL__Group__1"


    // $ANTLR start "rule__RotateL__Group__1__Impl"
    // InternalXDrone.g:1950:1: rule__RotateL__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1954:1: ( ( '(' ) )
            // InternalXDrone.g:1955:1: ( '(' )
            {
            // InternalXDrone.g:1955:1: ( '(' )
            // InternalXDrone.g:1956:2: '('
            {
             before(grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__RotateL__Group__1__Impl"


    // $ANTLR start "rule__RotateL__Group__2"
    // InternalXDrone.g:1965:1: rule__RotateL__Group__2 : rule__RotateL__Group__2__Impl rule__RotateL__Group__3 ;
    public final void rule__RotateL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1969:1: ( rule__RotateL__Group__2__Impl rule__RotateL__Group__3 )
            // InternalXDrone.g:1970:2: rule__RotateL__Group__2__Impl rule__RotateL__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RotateL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__3();

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
    // $ANTLR end "rule__RotateL__Group__2"


    // $ANTLR start "rule__RotateL__Group__2__Impl"
    // InternalXDrone.g:1977:1: rule__RotateL__Group__2__Impl : ( ( rule__RotateL__AngleAssignment_2 ) ) ;
    public final void rule__RotateL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1981:1: ( ( ( rule__RotateL__AngleAssignment_2 ) ) )
            // InternalXDrone.g:1982:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:1982:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            // InternalXDrone.g:1983:2: ( rule__RotateL__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:1984:2: ( rule__RotateL__AngleAssignment_2 )
            // InternalXDrone.g:1984:3: rule__RotateL__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 

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
    // $ANTLR end "rule__RotateL__Group__2__Impl"


    // $ANTLR start "rule__RotateL__Group__3"
    // InternalXDrone.g:1992:1: rule__RotateL__Group__3 : rule__RotateL__Group__3__Impl ;
    public final void rule__RotateL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1996:1: ( rule__RotateL__Group__3__Impl )
            // InternalXDrone.g:1997:2: rule__RotateL__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__Group__3__Impl();

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
    // $ANTLR end "rule__RotateL__Group__3"


    // $ANTLR start "rule__RotateL__Group__3__Impl"
    // InternalXDrone.g:2003:1: rule__RotateL__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2007:1: ( ( ')' ) )
            // InternalXDrone.g:2008:1: ( ')' )
            {
            // InternalXDrone.g:2008:1: ( ')' )
            // InternalXDrone.g:2009:2: ')'
            {
             before(grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__RotateL__Group__3__Impl"


    // $ANTLR start "rule__RotateR__Group__0"
    // InternalXDrone.g:2019:1: rule__RotateR__Group__0 : rule__RotateR__Group__0__Impl rule__RotateR__Group__1 ;
    public final void rule__RotateR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2023:1: ( rule__RotateR__Group__0__Impl rule__RotateR__Group__1 )
            // InternalXDrone.g:2024:2: rule__RotateR__Group__0__Impl rule__RotateR__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RotateR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__1();

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
    // $ANTLR end "rule__RotateR__Group__0"


    // $ANTLR start "rule__RotateR__Group__0__Impl"
    // InternalXDrone.g:2031:1: rule__RotateR__Group__0__Impl : ( 'ROTATERIGHT' ) ;
    public final void rule__RotateR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2035:1: ( ( 'ROTATERIGHT' ) )
            // InternalXDrone.g:2036:1: ( 'ROTATERIGHT' )
            {
            // InternalXDrone.g:2036:1: ( 'ROTATERIGHT' )
            // InternalXDrone.g:2037:2: 'ROTATERIGHT'
            {
             before(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 

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
    // $ANTLR end "rule__RotateR__Group__0__Impl"


    // $ANTLR start "rule__RotateR__Group__1"
    // InternalXDrone.g:2046:1: rule__RotateR__Group__1 : rule__RotateR__Group__1__Impl rule__RotateR__Group__2 ;
    public final void rule__RotateR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2050:1: ( rule__RotateR__Group__1__Impl rule__RotateR__Group__2 )
            // InternalXDrone.g:2051:2: rule__RotateR__Group__1__Impl rule__RotateR__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RotateR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__2();

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
    // $ANTLR end "rule__RotateR__Group__1"


    // $ANTLR start "rule__RotateR__Group__1__Impl"
    // InternalXDrone.g:2058:1: rule__RotateR__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2062:1: ( ( '(' ) )
            // InternalXDrone.g:2063:1: ( '(' )
            {
            // InternalXDrone.g:2063:1: ( '(' )
            // InternalXDrone.g:2064:2: '('
            {
             before(grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__RotateR__Group__1__Impl"


    // $ANTLR start "rule__RotateR__Group__2"
    // InternalXDrone.g:2073:1: rule__RotateR__Group__2 : rule__RotateR__Group__2__Impl rule__RotateR__Group__3 ;
    public final void rule__RotateR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2077:1: ( rule__RotateR__Group__2__Impl rule__RotateR__Group__3 )
            // InternalXDrone.g:2078:2: rule__RotateR__Group__2__Impl rule__RotateR__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RotateR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__3();

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
    // $ANTLR end "rule__RotateR__Group__2"


    // $ANTLR start "rule__RotateR__Group__2__Impl"
    // InternalXDrone.g:2085:1: rule__RotateR__Group__2__Impl : ( ( rule__RotateR__AngleAssignment_2 ) ) ;
    public final void rule__RotateR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2089:1: ( ( ( rule__RotateR__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2090:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2090:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            // InternalXDrone.g:2091:2: ( rule__RotateR__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2092:2: ( rule__RotateR__AngleAssignment_2 )
            // InternalXDrone.g:2092:3: rule__RotateR__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 

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
    // $ANTLR end "rule__RotateR__Group__2__Impl"


    // $ANTLR start "rule__RotateR__Group__3"
    // InternalXDrone.g:2100:1: rule__RotateR__Group__3 : rule__RotateR__Group__3__Impl ;
    public final void rule__RotateR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2104:1: ( rule__RotateR__Group__3__Impl )
            // InternalXDrone.g:2105:2: rule__RotateR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__Group__3__Impl();

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
    // $ANTLR end "rule__RotateR__Group__3"


    // $ANTLR start "rule__RotateR__Group__3__Impl"
    // InternalXDrone.g:2111:1: rule__RotateR__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2115:1: ( ( ')' ) )
            // InternalXDrone.g:2116:1: ( ')' )
            {
            // InternalXDrone.g:2116:1: ( ')' )
            // InternalXDrone.g:2117:2: ')'
            {
             before(grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__RotateR__Group__3__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalXDrone.g:2127:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2131:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:2132:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__1();

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
    // $ANTLR end "rule__Wait__Group__0"


    // $ANTLR start "rule__Wait__Group__0__Impl"
    // InternalXDrone.g:2139:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2143:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:2144:1: ( 'WAIT' )
            {
            // InternalXDrone.g:2144:1: ( 'WAIT' )
            // InternalXDrone.g:2145:2: 'WAIT'
            {
             before(grammarAccess.getWaitAccess().getWAITKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getWAITKeyword_0()); 

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
    // $ANTLR end "rule__Wait__Group__0__Impl"


    // $ANTLR start "rule__Wait__Group__1"
    // InternalXDrone.g:2154:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2158:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:2159:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Wait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__2();

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
    // $ANTLR end "rule__Wait__Group__1"


    // $ANTLR start "rule__Wait__Group__1__Impl"
    // InternalXDrone.g:2166:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2170:1: ( ( '(' ) )
            // InternalXDrone.g:2171:1: ( '(' )
            {
            // InternalXDrone.g:2171:1: ( '(' )
            // InternalXDrone.g:2172:2: '('
            {
             before(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Wait__Group__1__Impl"


    // $ANTLR start "rule__Wait__Group__2"
    // InternalXDrone.g:2181:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2185:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:2186:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Wait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__3();

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
    // $ANTLR end "rule__Wait__Group__2"


    // $ANTLR start "rule__Wait__Group__2__Impl"
    // InternalXDrone.g:2193:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2197:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:2198:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:2198:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:2199:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:2200:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:2200:3: rule__Wait__SecondsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Wait__SecondsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 

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
    // $ANTLR end "rule__Wait__Group__2__Impl"


    // $ANTLR start "rule__Wait__Group__3"
    // InternalXDrone.g:2208:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2212:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:2213:2: rule__Wait__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__3__Impl();

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
    // $ANTLR end "rule__Wait__Group__3"


    // $ANTLR start "rule__Wait__Group__3__Impl"
    // InternalXDrone.g:2219:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2223:1: ( ( ')' ) )
            // InternalXDrone.g:2224:1: ( ')' )
            {
            // InternalXDrone.g:2224:1: ( ')' )
            // InternalXDrone.g:2225:2: ')'
            {
             before(grammarAccess.getWaitAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Wait__Group__3__Impl"


    // $ANTLR start "rule__FunctionName__Group__0"
    // InternalXDrone.g:2235:1: rule__FunctionName__Group__0 : rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 ;
    public final void rule__FunctionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2239:1: ( rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 )
            // InternalXDrone.g:2240:2: rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__FunctionName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionName__Group__1();

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
    // $ANTLR end "rule__FunctionName__Group__0"


    // $ANTLR start "rule__FunctionName__Group__0__Impl"
    // InternalXDrone.g:2247:1: rule__FunctionName__Group__0__Impl : ( ( rule__FunctionName__Func_nameAssignment_0 ) ) ;
    public final void rule__FunctionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2251:1: ( ( ( rule__FunctionName__Func_nameAssignment_0 ) ) )
            // InternalXDrone.g:2252:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            {
            // InternalXDrone.g:2252:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            // InternalXDrone.g:2253:2: ( rule__FunctionName__Func_nameAssignment_0 )
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 
            // InternalXDrone.g:2254:2: ( rule__FunctionName__Func_nameAssignment_0 )
            // InternalXDrone.g:2254:3: rule__FunctionName__Func_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__Func_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 

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
    // $ANTLR end "rule__FunctionName__Group__0__Impl"


    // $ANTLR start "rule__FunctionName__Group__1"
    // InternalXDrone.g:2262:1: rule__FunctionName__Group__1 : rule__FunctionName__Group__1__Impl ;
    public final void rule__FunctionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2266:1: ( rule__FunctionName__Group__1__Impl )
            // InternalXDrone.g:2267:2: rule__FunctionName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionName__Group__1__Impl();

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
    // $ANTLR end "rule__FunctionName__Group__1"


    // $ANTLR start "rule__FunctionName__Group__1__Impl"
    // InternalXDrone.g:2273:1: rule__FunctionName__Group__1__Impl : ( '()' ) ;
    public final void rule__FunctionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2277:1: ( ( '()' ) )
            // InternalXDrone.g:2278:1: ( '()' )
            {
            // InternalXDrone.g:2278:1: ( '()' )
            // InternalXDrone.g:2279:2: '()'
            {
             before(grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FunctionName__Group__1__Impl"


    // $ANTLR start "rule__Drone__Group__0"
    // InternalXDrone.g:2289:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2293:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:2294:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Drone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__1();

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
    // $ANTLR end "rule__Drone__Group__0"


    // $ANTLR start "rule__Drone__Group__0__Impl"
    // InternalXDrone.g:2301:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2305:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:2306:1: ( 'DRONE' )
            {
            // InternalXDrone.g:2306:1: ( 'DRONE' )
            // InternalXDrone.g:2307:2: 'DRONE'
            {
             before(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 

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
    // $ANTLR end "rule__Drone__Group__0__Impl"


    // $ANTLR start "rule__Drone__Group__1"
    // InternalXDrone.g:2316:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl rule__Drone__Group__2 ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2320:1: ( rule__Drone__Group__1__Impl rule__Drone__Group__2 )
            // InternalXDrone.g:2321:2: rule__Drone__Group__1__Impl rule__Drone__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Drone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__2();

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
    // $ANTLR end "rule__Drone__Group__1"


    // $ANTLR start "rule__Drone__Group__1__Impl"
    // InternalXDrone.g:2328:1: rule__Drone__Group__1__Impl : ( '(' ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2332:1: ( ( '(' ) )
            // InternalXDrone.g:2333:1: ( '(' )
            {
            // InternalXDrone.g:2333:1: ( '(' )
            // InternalXDrone.g:2334:2: '('
            {
             before(grammarAccess.getDroneAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Drone__Group__1__Impl"


    // $ANTLR start "rule__Drone__Group__2"
    // InternalXDrone.g:2343:1: rule__Drone__Group__2 : rule__Drone__Group__2__Impl rule__Drone__Group__3 ;
    public final void rule__Drone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2347:1: ( rule__Drone__Group__2__Impl rule__Drone__Group__3 )
            // InternalXDrone.g:2348:2: rule__Drone__Group__2__Impl rule__Drone__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Drone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__3();

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
    // $ANTLR end "rule__Drone__Group__2"


    // $ANTLR start "rule__Drone__Group__2__Impl"
    // InternalXDrone.g:2355:1: rule__Drone__Group__2__Impl : ( ( rule__Drone__XAssignment_2 ) ) ;
    public final void rule__Drone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2359:1: ( ( ( rule__Drone__XAssignment_2 ) ) )
            // InternalXDrone.g:2360:1: ( ( rule__Drone__XAssignment_2 ) )
            {
            // InternalXDrone.g:2360:1: ( ( rule__Drone__XAssignment_2 ) )
            // InternalXDrone.g:2361:2: ( rule__Drone__XAssignment_2 )
            {
             before(grammarAccess.getDroneAccess().getXAssignment_2()); 
            // InternalXDrone.g:2362:2: ( rule__Drone__XAssignment_2 )
            // InternalXDrone.g:2362:3: rule__Drone__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Drone__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getXAssignment_2()); 

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
    // $ANTLR end "rule__Drone__Group__2__Impl"


    // $ANTLR start "rule__Drone__Group__3"
    // InternalXDrone.g:2370:1: rule__Drone__Group__3 : rule__Drone__Group__3__Impl rule__Drone__Group__4 ;
    public final void rule__Drone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2374:1: ( rule__Drone__Group__3__Impl rule__Drone__Group__4 )
            // InternalXDrone.g:2375:2: rule__Drone__Group__3__Impl rule__Drone__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Drone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__4();

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
    // $ANTLR end "rule__Drone__Group__3"


    // $ANTLR start "rule__Drone__Group__3__Impl"
    // InternalXDrone.g:2382:1: rule__Drone__Group__3__Impl : ( ',' ) ;
    public final void rule__Drone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2386:1: ( ( ',' ) )
            // InternalXDrone.g:2387:1: ( ',' )
            {
            // InternalXDrone.g:2387:1: ( ',' )
            // InternalXDrone.g:2388:2: ','
            {
             before(grammarAccess.getDroneAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Drone__Group__3__Impl"


    // $ANTLR start "rule__Drone__Group__4"
    // InternalXDrone.g:2397:1: rule__Drone__Group__4 : rule__Drone__Group__4__Impl rule__Drone__Group__5 ;
    public final void rule__Drone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2401:1: ( rule__Drone__Group__4__Impl rule__Drone__Group__5 )
            // InternalXDrone.g:2402:2: rule__Drone__Group__4__Impl rule__Drone__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Drone__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__5();

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
    // $ANTLR end "rule__Drone__Group__4"


    // $ANTLR start "rule__Drone__Group__4__Impl"
    // InternalXDrone.g:2409:1: rule__Drone__Group__4__Impl : ( ( rule__Drone__ZAssignment_4 ) ) ;
    public final void rule__Drone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2413:1: ( ( ( rule__Drone__ZAssignment_4 ) ) )
            // InternalXDrone.g:2414:1: ( ( rule__Drone__ZAssignment_4 ) )
            {
            // InternalXDrone.g:2414:1: ( ( rule__Drone__ZAssignment_4 ) )
            // InternalXDrone.g:2415:2: ( rule__Drone__ZAssignment_4 )
            {
             before(grammarAccess.getDroneAccess().getZAssignment_4()); 
            // InternalXDrone.g:2416:2: ( rule__Drone__ZAssignment_4 )
            // InternalXDrone.g:2416:3: rule__Drone__ZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Drone__ZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getZAssignment_4()); 

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
    // $ANTLR end "rule__Drone__Group__4__Impl"


    // $ANTLR start "rule__Drone__Group__5"
    // InternalXDrone.g:2424:1: rule__Drone__Group__5 : rule__Drone__Group__5__Impl rule__Drone__Group__6 ;
    public final void rule__Drone__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2428:1: ( rule__Drone__Group__5__Impl rule__Drone__Group__6 )
            // InternalXDrone.g:2429:2: rule__Drone__Group__5__Impl rule__Drone__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Drone__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__6();

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
    // $ANTLR end "rule__Drone__Group__5"


    // $ANTLR start "rule__Drone__Group__5__Impl"
    // InternalXDrone.g:2436:1: rule__Drone__Group__5__Impl : ( ',' ) ;
    public final void rule__Drone__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2440:1: ( ( ',' ) )
            // InternalXDrone.g:2441:1: ( ',' )
            {
            // InternalXDrone.g:2441:1: ( ',' )
            // InternalXDrone.g:2442:2: ','
            {
             before(grammarAccess.getDroneAccess().getCommaKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__Drone__Group__5__Impl"


    // $ANTLR start "rule__Drone__Group__6"
    // InternalXDrone.g:2451:1: rule__Drone__Group__6 : rule__Drone__Group__6__Impl rule__Drone__Group__7 ;
    public final void rule__Drone__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2455:1: ( rule__Drone__Group__6__Impl rule__Drone__Group__7 )
            // InternalXDrone.g:2456:2: rule__Drone__Group__6__Impl rule__Drone__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Drone__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__7();

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
    // $ANTLR end "rule__Drone__Group__6"


    // $ANTLR start "rule__Drone__Group__6__Impl"
    // InternalXDrone.g:2463:1: rule__Drone__Group__6__Impl : ( ( rule__Drone__YAssignment_6 ) ) ;
    public final void rule__Drone__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2467:1: ( ( ( rule__Drone__YAssignment_6 ) ) )
            // InternalXDrone.g:2468:1: ( ( rule__Drone__YAssignment_6 ) )
            {
            // InternalXDrone.g:2468:1: ( ( rule__Drone__YAssignment_6 ) )
            // InternalXDrone.g:2469:2: ( rule__Drone__YAssignment_6 )
            {
             before(grammarAccess.getDroneAccess().getYAssignment_6()); 
            // InternalXDrone.g:2470:2: ( rule__Drone__YAssignment_6 )
            // InternalXDrone.g:2470:3: rule__Drone__YAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Drone__YAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getYAssignment_6()); 

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
    // $ANTLR end "rule__Drone__Group__6__Impl"


    // $ANTLR start "rule__Drone__Group__7"
    // InternalXDrone.g:2478:1: rule__Drone__Group__7 : rule__Drone__Group__7__Impl ;
    public final void rule__Drone__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2482:1: ( rule__Drone__Group__7__Impl )
            // InternalXDrone.g:2483:2: rule__Drone__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__7__Impl();

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
    // $ANTLR end "rule__Drone__Group__7"


    // $ANTLR start "rule__Drone__Group__7__Impl"
    // InternalXDrone.g:2489:1: rule__Drone__Group__7__Impl : ( ')' ) ;
    public final void rule__Drone__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2493:1: ( ( ')' ) )
            // InternalXDrone.g:2494:1: ( ')' )
            {
            // InternalXDrone.g:2494:1: ( ')' )
            // InternalXDrone.g:2495:2: ')'
            {
             before(grammarAccess.getDroneAccess().getRightParenthesisKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__Drone__Group__7__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalXDrone.g:2505:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2509:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalXDrone.g:2510:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

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
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalXDrone.g:2517:1: rule__Object__Group__0__Impl : ( ( rule__Object__Object_nameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2521:1: ( ( ( rule__Object__Object_nameAssignment_0 ) ) )
            // InternalXDrone.g:2522:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            {
            // InternalXDrone.g:2522:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            // InternalXDrone.g:2523:2: ( rule__Object__Object_nameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0()); 
            // InternalXDrone.g:2524:2: ( rule__Object__Object_nameAssignment_0 )
            // InternalXDrone.g:2524:3: rule__Object__Object_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Object_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObject_nameAssignment_0()); 

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
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalXDrone.g:2532:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2536:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalXDrone.g:2537:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

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
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalXDrone.g:2544:1: rule__Object__Group__1__Impl : ( '(' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2548:1: ( ( '(' ) )
            // InternalXDrone.g:2549:1: ( '(' )
            {
            // InternalXDrone.g:2549:1: ( '(' )
            // InternalXDrone.g:2550:2: '('
            {
             before(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalXDrone.g:2559:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2563:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalXDrone.g:2564:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

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
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalXDrone.g:2571:1: rule__Object__Group__2__Impl : ( ( rule__Object__SxAssignment_2 ) ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2575:1: ( ( ( rule__Object__SxAssignment_2 ) ) )
            // InternalXDrone.g:2576:1: ( ( rule__Object__SxAssignment_2 ) )
            {
            // InternalXDrone.g:2576:1: ( ( rule__Object__SxAssignment_2 ) )
            // InternalXDrone.g:2577:2: ( rule__Object__SxAssignment_2 )
            {
             before(grammarAccess.getObjectAccess().getSxAssignment_2()); 
            // InternalXDrone.g:2578:2: ( rule__Object__SxAssignment_2 )
            // InternalXDrone.g:2578:3: rule__Object__SxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Object__SxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getSxAssignment_2()); 

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
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalXDrone.g:2586:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2590:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalXDrone.g:2591:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

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
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalXDrone.g:2598:1: rule__Object__Group__3__Impl : ( ',' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2602:1: ( ( ',' ) )
            // InternalXDrone.g:2603:1: ( ',' )
            {
            // InternalXDrone.g:2603:1: ( ',' )
            // InternalXDrone.g:2604:2: ','
            {
             before(grammarAccess.getObjectAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalXDrone.g:2613:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2617:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalXDrone.g:2618:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__5();

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
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalXDrone.g:2625:1: rule__Object__Group__4__Impl : ( ( rule__Object__SzAssignment_4 ) ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2629:1: ( ( ( rule__Object__SzAssignment_4 ) ) )
            // InternalXDrone.g:2630:1: ( ( rule__Object__SzAssignment_4 ) )
            {
            // InternalXDrone.g:2630:1: ( ( rule__Object__SzAssignment_4 ) )
            // InternalXDrone.g:2631:2: ( rule__Object__SzAssignment_4 )
            {
             before(grammarAccess.getObjectAccess().getSzAssignment_4()); 
            // InternalXDrone.g:2632:2: ( rule__Object__SzAssignment_4 )
            // InternalXDrone.g:2632:3: rule__Object__SzAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Object__SzAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getSzAssignment_4()); 

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
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__5"
    // InternalXDrone.g:2640:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2644:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalXDrone.g:2645:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__6();

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
    // $ANTLR end "rule__Object__Group__5"


    // $ANTLR start "rule__Object__Group__5__Impl"
    // InternalXDrone.g:2652:1: rule__Object__Group__5__Impl : ( ',' ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2656:1: ( ( ',' ) )
            // InternalXDrone.g:2657:1: ( ',' )
            {
            // InternalXDrone.g:2657:1: ( ',' )
            // InternalXDrone.g:2658:2: ','
            {
             before(grammarAccess.getObjectAccess().getCommaKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__Object__Group__5__Impl"


    // $ANTLR start "rule__Object__Group__6"
    // InternalXDrone.g:2667:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2671:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalXDrone.g:2672:2: rule__Object__Group__6__Impl rule__Object__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__7();

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
    // $ANTLR end "rule__Object__Group__6"


    // $ANTLR start "rule__Object__Group__6__Impl"
    // InternalXDrone.g:2679:1: rule__Object__Group__6__Impl : ( ( rule__Object__SyAssignment_6 ) ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2683:1: ( ( ( rule__Object__SyAssignment_6 ) ) )
            // InternalXDrone.g:2684:1: ( ( rule__Object__SyAssignment_6 ) )
            {
            // InternalXDrone.g:2684:1: ( ( rule__Object__SyAssignment_6 ) )
            // InternalXDrone.g:2685:2: ( rule__Object__SyAssignment_6 )
            {
             before(grammarAccess.getObjectAccess().getSyAssignment_6()); 
            // InternalXDrone.g:2686:2: ( rule__Object__SyAssignment_6 )
            // InternalXDrone.g:2686:3: rule__Object__SyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Object__SyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getSyAssignment_6()); 

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
    // $ANTLR end "rule__Object__Group__6__Impl"


    // $ANTLR start "rule__Object__Group__7"
    // InternalXDrone.g:2694:1: rule__Object__Group__7 : rule__Object__Group__7__Impl rule__Object__Group__8 ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2698:1: ( rule__Object__Group__7__Impl rule__Object__Group__8 )
            // InternalXDrone.g:2699:2: rule__Object__Group__7__Impl rule__Object__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__8();

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
    // $ANTLR end "rule__Object__Group__7"


    // $ANTLR start "rule__Object__Group__7__Impl"
    // InternalXDrone.g:2706:1: rule__Object__Group__7__Impl : ( ',' ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2710:1: ( ( ',' ) )
            // InternalXDrone.g:2711:1: ( ',' )
            {
            // InternalXDrone.g:2711:1: ( ',' )
            // InternalXDrone.g:2712:2: ','
            {
             before(grammarAccess.getObjectAccess().getCommaKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__Object__Group__7__Impl"


    // $ANTLR start "rule__Object__Group__8"
    // InternalXDrone.g:2721:1: rule__Object__Group__8 : rule__Object__Group__8__Impl rule__Object__Group__9 ;
    public final void rule__Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2725:1: ( rule__Object__Group__8__Impl rule__Object__Group__9 )
            // InternalXDrone.g:2726:2: rule__Object__Group__8__Impl rule__Object__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__9();

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
    // $ANTLR end "rule__Object__Group__8"


    // $ANTLR start "rule__Object__Group__8__Impl"
    // InternalXDrone.g:2733:1: rule__Object__Group__8__Impl : ( ( rule__Object__LxAssignment_8 ) ) ;
    public final void rule__Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2737:1: ( ( ( rule__Object__LxAssignment_8 ) ) )
            // InternalXDrone.g:2738:1: ( ( rule__Object__LxAssignment_8 ) )
            {
            // InternalXDrone.g:2738:1: ( ( rule__Object__LxAssignment_8 ) )
            // InternalXDrone.g:2739:2: ( rule__Object__LxAssignment_8 )
            {
             before(grammarAccess.getObjectAccess().getLxAssignment_8()); 
            // InternalXDrone.g:2740:2: ( rule__Object__LxAssignment_8 )
            // InternalXDrone.g:2740:3: rule__Object__LxAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Object__LxAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getLxAssignment_8()); 

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
    // $ANTLR end "rule__Object__Group__8__Impl"


    // $ANTLR start "rule__Object__Group__9"
    // InternalXDrone.g:2748:1: rule__Object__Group__9 : rule__Object__Group__9__Impl rule__Object__Group__10 ;
    public final void rule__Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2752:1: ( rule__Object__Group__9__Impl rule__Object__Group__10 )
            // InternalXDrone.g:2753:2: rule__Object__Group__9__Impl rule__Object__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__10();

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
    // $ANTLR end "rule__Object__Group__9"


    // $ANTLR start "rule__Object__Group__9__Impl"
    // InternalXDrone.g:2760:1: rule__Object__Group__9__Impl : ( ',' ) ;
    public final void rule__Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2764:1: ( ( ',' ) )
            // InternalXDrone.g:2765:1: ( ',' )
            {
            // InternalXDrone.g:2765:1: ( ',' )
            // InternalXDrone.g:2766:2: ','
            {
             before(grammarAccess.getObjectAccess().getCommaKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__Object__Group__9__Impl"


    // $ANTLR start "rule__Object__Group__10"
    // InternalXDrone.g:2775:1: rule__Object__Group__10 : rule__Object__Group__10__Impl rule__Object__Group__11 ;
    public final void rule__Object__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2779:1: ( rule__Object__Group__10__Impl rule__Object__Group__11 )
            // InternalXDrone.g:2780:2: rule__Object__Group__10__Impl rule__Object__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__11();

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
    // $ANTLR end "rule__Object__Group__10"


    // $ANTLR start "rule__Object__Group__10__Impl"
    // InternalXDrone.g:2787:1: rule__Object__Group__10__Impl : ( ( rule__Object__LzAssignment_10 ) ) ;
    public final void rule__Object__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2791:1: ( ( ( rule__Object__LzAssignment_10 ) ) )
            // InternalXDrone.g:2792:1: ( ( rule__Object__LzAssignment_10 ) )
            {
            // InternalXDrone.g:2792:1: ( ( rule__Object__LzAssignment_10 ) )
            // InternalXDrone.g:2793:2: ( rule__Object__LzAssignment_10 )
            {
             before(grammarAccess.getObjectAccess().getLzAssignment_10()); 
            // InternalXDrone.g:2794:2: ( rule__Object__LzAssignment_10 )
            // InternalXDrone.g:2794:3: rule__Object__LzAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Object__LzAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getLzAssignment_10()); 

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
    // $ANTLR end "rule__Object__Group__10__Impl"


    // $ANTLR start "rule__Object__Group__11"
    // InternalXDrone.g:2802:1: rule__Object__Group__11 : rule__Object__Group__11__Impl rule__Object__Group__12 ;
    public final void rule__Object__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2806:1: ( rule__Object__Group__11__Impl rule__Object__Group__12 )
            // InternalXDrone.g:2807:2: rule__Object__Group__11__Impl rule__Object__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Object__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__12();

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
    // $ANTLR end "rule__Object__Group__11"


    // $ANTLR start "rule__Object__Group__11__Impl"
    // InternalXDrone.g:2814:1: rule__Object__Group__11__Impl : ( ',' ) ;
    public final void rule__Object__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2818:1: ( ( ',' ) )
            // InternalXDrone.g:2819:1: ( ',' )
            {
            // InternalXDrone.g:2819:1: ( ',' )
            // InternalXDrone.g:2820:2: ','
            {
             before(grammarAccess.getObjectAccess().getCommaKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getCommaKeyword_11()); 

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
    // $ANTLR end "rule__Object__Group__11__Impl"


    // $ANTLR start "rule__Object__Group__12"
    // InternalXDrone.g:2829:1: rule__Object__Group__12 : rule__Object__Group__12__Impl rule__Object__Group__13 ;
    public final void rule__Object__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2833:1: ( rule__Object__Group__12__Impl rule__Object__Group__13 )
            // InternalXDrone.g:2834:2: rule__Object__Group__12__Impl rule__Object__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Object__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__13();

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
    // $ANTLR end "rule__Object__Group__12"


    // $ANTLR start "rule__Object__Group__12__Impl"
    // InternalXDrone.g:2841:1: rule__Object__Group__12__Impl : ( ( rule__Object__LyAssignment_12 ) ) ;
    public final void rule__Object__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2845:1: ( ( ( rule__Object__LyAssignment_12 ) ) )
            // InternalXDrone.g:2846:1: ( ( rule__Object__LyAssignment_12 ) )
            {
            // InternalXDrone.g:2846:1: ( ( rule__Object__LyAssignment_12 ) )
            // InternalXDrone.g:2847:2: ( rule__Object__LyAssignment_12 )
            {
             before(grammarAccess.getObjectAccess().getLyAssignment_12()); 
            // InternalXDrone.g:2848:2: ( rule__Object__LyAssignment_12 )
            // InternalXDrone.g:2848:3: rule__Object__LyAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Object__LyAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getLyAssignment_12()); 

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
    // $ANTLR end "rule__Object__Group__12__Impl"


    // $ANTLR start "rule__Object__Group__13"
    // InternalXDrone.g:2856:1: rule__Object__Group__13 : rule__Object__Group__13__Impl ;
    public final void rule__Object__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2860:1: ( rule__Object__Group__13__Impl )
            // InternalXDrone.g:2861:2: rule__Object__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__13__Impl();

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
    // $ANTLR end "rule__Object__Group__13"


    // $ANTLR start "rule__Object__Group__13__Impl"
    // InternalXDrone.g:2867:1: rule__Object__Group__13__Impl : ( ')' ) ;
    public final void rule__Object__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2871:1: ( ( ')' ) )
            // InternalXDrone.g:2872:1: ( ')' )
            {
            // InternalXDrone.g:2872:1: ( ')' )
            // InternalXDrone.g:2873:2: ')'
            {
             before(grammarAccess.getObjectAccess().getRightParenthesisKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__Object__Group__13__Impl"


    // $ANTLR start "rule__Program__FlyAssignment_0"
    // InternalXDrone.g:2883:1: rule__Program__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Program__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2887:1: ( ( ruleFly ) )
            // InternalXDrone.g:2888:2: ( ruleFly )
            {
            // InternalXDrone.g:2888:2: ( ruleFly )
            // InternalXDrone.g:2889:3: ruleFly
            {
             before(grammarAccess.getProgramAccess().getFlyFlyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFly();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFlyFlyParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Program__FlyAssignment_0"


    // $ANTLR start "rule__Program__EnvironmentAssignment_1"
    // InternalXDrone.g:2898:1: rule__Program__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Program__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2902:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:2903:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:2903:2: ( ruleEnvironment )
            // InternalXDrone.g:2904:3: ruleEnvironment
            {
             before(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__EnvironmentAssignment_1"


    // $ANTLR start "rule__Fly__TakeoffAssignment_1_0"
    // InternalXDrone.g:2913:1: rule__Fly__TakeoffAssignment_1_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2917:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:2918:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:2918:2: ( ruleTakeoff )
            // InternalXDrone.g:2919:3: ruleTakeoff
            {
             before(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTakeoff();

            state._fsp--;

             after(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Fly__TakeoffAssignment_1_0"


    // $ANTLR start "rule__Fly__CommandsAssignment_1_1"
    // InternalXDrone.g:2928:1: rule__Fly__CommandsAssignment_1_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2932:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:2933:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:2933:2: ( ruleSuperCommand )
            // InternalXDrone.g:2934:3: ruleSuperCommand
            {
             before(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperCommand();

            state._fsp--;

             after(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Fly__CommandsAssignment_1_1"


    // $ANTLR start "rule__Fly__LandAssignment_1_2"
    // InternalXDrone.g:2943:1: rule__Fly__LandAssignment_1_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2947:1: ( ( ruleLand ) )
            // InternalXDrone.g:2948:2: ( ruleLand )
            {
            // InternalXDrone.g:2948:2: ( ruleLand )
            // InternalXDrone.g:2949:3: ruleLand
            {
             before(grammarAccess.getFlyAccess().getLandLandParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLand();

            state._fsp--;

             after(grammarAccess.getFlyAccess().getLandLandParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Fly__LandAssignment_1_2"


    // $ANTLR start "rule__Environment__DroneAssignment_2"
    // InternalXDrone.g:2958:1: rule__Environment__DroneAssignment_2 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2962:1: ( ( ruleDrone ) )
            // InternalXDrone.g:2963:2: ( ruleDrone )
            {
            // InternalXDrone.g:2963:2: ( ruleDrone )
            // InternalXDrone.g:2964:3: ruleDrone
            {
             before(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Environment__DroneAssignment_2"


    // $ANTLR start "rule__Environment__ObjectsAssignment_3"
    // InternalXDrone.g:2973:1: rule__Environment__ObjectsAssignment_3 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2977:1: ( ( ruleObject ) )
            // InternalXDrone.g:2978:2: ( ruleObject )
            {
            // InternalXDrone.g:2978:2: ( ruleObject )
            // InternalXDrone.g:2979:3: ruleObject
            {
             before(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Environment__ObjectsAssignment_3"


    // $ANTLR start "rule__Up__DistanceAssignment_2"
    // InternalXDrone.g:2988:1: rule__Up__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Up__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2992:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:2993:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:2993:2: ( ruleDOUBLE )
            // InternalXDrone.g:2994:3: ruleDOUBLE
            {
             before(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Up__DistanceAssignment_2"


    // $ANTLR start "rule__Down__DistanceAssignment_2"
    // InternalXDrone.g:3003:1: rule__Down__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Down__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3007:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3008:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3008:2: ( ruleDOUBLE )
            // InternalXDrone.g:3009:3: ruleDOUBLE
            {
             before(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Down__DistanceAssignment_2"


    // $ANTLR start "rule__Left__DistanceAssignment_2"
    // InternalXDrone.g:3018:1: rule__Left__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Left__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3022:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3023:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3023:2: ( ruleDOUBLE )
            // InternalXDrone.g:3024:3: ruleDOUBLE
            {
             before(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Left__DistanceAssignment_2"


    // $ANTLR start "rule__Right__DistanceAssignment_2"
    // InternalXDrone.g:3033:1: rule__Right__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Right__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3037:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3038:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3038:2: ( ruleDOUBLE )
            // InternalXDrone.g:3039:3: ruleDOUBLE
            {
             before(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Right__DistanceAssignment_2"


    // $ANTLR start "rule__Forward__DistanceAssignment_2"
    // InternalXDrone.g:3048:1: rule__Forward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3052:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3053:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3053:2: ( ruleDOUBLE )
            // InternalXDrone.g:3054:3: ruleDOUBLE
            {
             before(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Forward__DistanceAssignment_2"


    // $ANTLR start "rule__Backward__DistanceAssignment_2"
    // InternalXDrone.g:3063:1: rule__Backward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Backward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3067:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3068:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3068:2: ( ruleDOUBLE )
            // InternalXDrone.g:3069:3: ruleDOUBLE
            {
             before(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Backward__DistanceAssignment_2"


    // $ANTLR start "rule__RotateL__AngleAssignment_2"
    // InternalXDrone.g:3078:1: rule__RotateL__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateL__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3082:1: ( ( RULE_INT ) )
            // InternalXDrone.g:3083:2: ( RULE_INT )
            {
            // InternalXDrone.g:3083:2: ( RULE_INT )
            // InternalXDrone.g:3084:3: RULE_INT
            {
             before(grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RotateL__AngleAssignment_2"


    // $ANTLR start "rule__RotateR__AngleAssignment_2"
    // InternalXDrone.g:3093:1: rule__RotateR__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateR__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3097:1: ( ( RULE_INT ) )
            // InternalXDrone.g:3098:2: ( RULE_INT )
            {
            // InternalXDrone.g:3098:2: ( RULE_INT )
            // InternalXDrone.g:3099:3: RULE_INT
            {
             before(grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RotateR__AngleAssignment_2"


    // $ANTLR start "rule__Wait__SecondsAssignment_2"
    // InternalXDrone.g:3108:1: rule__Wait__SecondsAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3112:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3113:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3113:2: ( ruleDOUBLE )
            // InternalXDrone.g:3114:3: ruleDOUBLE
            {
             before(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Wait__SecondsAssignment_2"


    // $ANTLR start "rule__FunctionName__Func_nameAssignment_0"
    // InternalXDrone.g:3123:1: rule__FunctionName__Func_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionName__Func_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3127:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3128:2: ( RULE_ID )
            {
            // InternalXDrone.g:3128:2: ( RULE_ID )
            // InternalXDrone.g:3129:3: RULE_ID
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionName__Func_nameAssignment_0"


    // $ANTLR start "rule__Drone__XAssignment_2"
    // InternalXDrone.g:3138:1: rule__Drone__XAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Drone__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3142:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3143:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3143:2: ( ruleDOUBLE )
            // InternalXDrone.g:3144:3: ruleDOUBLE
            {
             before(grammarAccess.getDroneAccess().getXDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getXDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Drone__XAssignment_2"


    // $ANTLR start "rule__Drone__ZAssignment_4"
    // InternalXDrone.g:3153:1: rule__Drone__ZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__Drone__ZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3157:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3158:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3158:2: ( ruleDOUBLE )
            // InternalXDrone.g:3159:3: ruleDOUBLE
            {
             before(grammarAccess.getDroneAccess().getZDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getZDOUBLEParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Drone__ZAssignment_4"


    // $ANTLR start "rule__Drone__YAssignment_6"
    // InternalXDrone.g:3168:1: rule__Drone__YAssignment_6 : ( ruleDOUBLE ) ;
    public final void rule__Drone__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3172:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3173:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3173:2: ( ruleDOUBLE )
            // InternalXDrone.g:3174:3: ruleDOUBLE
            {
             before(grammarAccess.getDroneAccess().getYDOUBLEParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getYDOUBLEParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Drone__YAssignment_6"


    // $ANTLR start "rule__Object__Object_nameAssignment_0"
    // InternalXDrone.g:3183:1: rule__Object__Object_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3187:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3188:2: ( RULE_ID )
            {
            // InternalXDrone.g:3188:2: ( RULE_ID )
            // InternalXDrone.g:3189:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Object__Object_nameAssignment_0"


    // $ANTLR start "rule__Object__SxAssignment_2"
    // InternalXDrone.g:3198:1: rule__Object__SxAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Object__SxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3202:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3203:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3203:2: ( ruleDOUBLE )
            // InternalXDrone.g:3204:3: ruleDOUBLE
            {
             before(grammarAccess.getObjectAccess().getSxDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getSxDOUBLEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Object__SxAssignment_2"


    // $ANTLR start "rule__Object__SzAssignment_4"
    // InternalXDrone.g:3213:1: rule__Object__SzAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__Object__SzAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3217:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3218:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3218:2: ( ruleDOUBLE )
            // InternalXDrone.g:3219:3: ruleDOUBLE
            {
             before(grammarAccess.getObjectAccess().getSzDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getSzDOUBLEParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Object__SzAssignment_4"


    // $ANTLR start "rule__Object__SyAssignment_6"
    // InternalXDrone.g:3228:1: rule__Object__SyAssignment_6 : ( ruleDOUBLE ) ;
    public final void rule__Object__SyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3232:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3233:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3233:2: ( ruleDOUBLE )
            // InternalXDrone.g:3234:3: ruleDOUBLE
            {
             before(grammarAccess.getObjectAccess().getSyDOUBLEParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getSyDOUBLEParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Object__SyAssignment_6"


    // $ANTLR start "rule__Object__LxAssignment_8"
    // InternalXDrone.g:3243:1: rule__Object__LxAssignment_8 : ( ruleDOUBLE ) ;
    public final void rule__Object__LxAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3247:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3248:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3248:2: ( ruleDOUBLE )
            // InternalXDrone.g:3249:3: ruleDOUBLE
            {
             before(grammarAccess.getObjectAccess().getLxDOUBLEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getLxDOUBLEParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Object__LxAssignment_8"


    // $ANTLR start "rule__Object__LzAssignment_10"
    // InternalXDrone.g:3258:1: rule__Object__LzAssignment_10 : ( ruleDOUBLE ) ;
    public final void rule__Object__LzAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3262:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3263:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3263:2: ( ruleDOUBLE )
            // InternalXDrone.g:3264:3: ruleDOUBLE
            {
             before(grammarAccess.getObjectAccess().getLzDOUBLEParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getLzDOUBLEParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Object__LzAssignment_10"


    // $ANTLR start "rule__Object__LyAssignment_12"
    // InternalXDrone.g:3273:1: rule__Object__LyAssignment_12 : ( ruleDOUBLE ) ;
    public final void rule__Object__LyAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3277:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3278:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3278:2: ( ruleDOUBLE )
            // InternalXDrone.g:3279:3: ruleDOUBLE
            {
             before(grammarAccess.getObjectAccess().getLyDOUBLEParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getLyDOUBLEParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Object__LyAssignment_12"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001FE41020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001FE40022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040004020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});

}
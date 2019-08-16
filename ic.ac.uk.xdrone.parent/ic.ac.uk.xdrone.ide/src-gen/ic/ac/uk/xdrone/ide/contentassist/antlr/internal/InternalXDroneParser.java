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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF()'", "'LAND()'", "'fly(){'", "'}'", "'environment(){'", "'-'", "'.'", "'FLYTO'", "'('", "')'", "'MOVE'", "'ROTATE'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'origin'", "'='", "'size'", "','", "'color'", "'WALLS'", "'front'", "'right'", "'left'", "'back'", "'up'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
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
    // InternalXDrone.g:62:1: ruleProgram : ( ( rule__Program__MainAssignment ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:66:2: ( ( ( rule__Program__MainAssignment ) ) )
            // InternalXDrone.g:67:2: ( ( rule__Program__MainAssignment ) )
            {
            // InternalXDrone.g:67:2: ( ( rule__Program__MainAssignment ) )
            // InternalXDrone.g:68:3: ( rule__Program__MainAssignment )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment()); 
            // InternalXDrone.g:69:3: ( rule__Program__MainAssignment )
            // InternalXDrone.g:69:4: rule__Program__MainAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Program__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMain"
    // InternalXDrone.g:78:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalXDrone.g:79:1: ( ruleMain EOF )
            // InternalXDrone.g:80:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalXDrone.g:87:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:91:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalXDrone.g:92:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalXDrone.g:92:2: ( ( rule__Main__Group__0 ) )
            // InternalXDrone.g:93:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalXDrone.g:94:3: ( rule__Main__Group__0 )
            // InternalXDrone.g:94:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFly"
    // InternalXDrone.g:103:1: entryRuleFly : ruleFly EOF ;
    public final void entryRuleFly() throws RecognitionException {
        try {
            // InternalXDrone.g:104:1: ( ruleFly EOF )
            // InternalXDrone.g:105:1: ruleFly EOF
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
    // InternalXDrone.g:112:1: ruleFly : ( ( rule__Fly__Group__0 ) ) ;
    public final void ruleFly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:116:2: ( ( ( rule__Fly__Group__0 ) ) )
            // InternalXDrone.g:117:2: ( ( rule__Fly__Group__0 ) )
            {
            // InternalXDrone.g:117:2: ( ( rule__Fly__Group__0 ) )
            // InternalXDrone.g:118:3: ( rule__Fly__Group__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup()); 
            // InternalXDrone.g:119:3: ( rule__Fly__Group__0 )
            // InternalXDrone.g:119:4: rule__Fly__Group__0
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
    // InternalXDrone.g:128:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalXDrone.g:129:1: ( ruleEnvironment EOF )
            // InternalXDrone.g:130:1: ruleEnvironment EOF
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
    // InternalXDrone.g:137:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:141:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalXDrone.g:142:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalXDrone.g:142:2: ( ( rule__Environment__Group__0 ) )
            // InternalXDrone.g:143:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalXDrone.g:144:3: ( rule__Environment__Group__0 )
            // InternalXDrone.g:144:4: rule__Environment__Group__0
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
    // InternalXDrone.g:153:1: entryRuleTakeoff : ruleTakeoff EOF ;
    public final void entryRuleTakeoff() throws RecognitionException {
        try {
            // InternalXDrone.g:154:1: ( ruleTakeoff EOF )
            // InternalXDrone.g:155:1: ruleTakeoff EOF
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
    // InternalXDrone.g:162:1: ruleTakeoff : ( 'TAKEOFF()' ) ;
    public final void ruleTakeoff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:166:2: ( ( 'TAKEOFF()' ) )
            // InternalXDrone.g:167:2: ( 'TAKEOFF()' )
            {
            // InternalXDrone.g:167:2: ( 'TAKEOFF()' )
            // InternalXDrone.g:168:3: 'TAKEOFF()'
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
    // InternalXDrone.g:178:1: entryRuleLand : ruleLand EOF ;
    public final void entryRuleLand() throws RecognitionException {
        try {
            // InternalXDrone.g:179:1: ( ruleLand EOF )
            // InternalXDrone.g:180:1: ruleLand EOF
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
    // InternalXDrone.g:187:1: ruleLand : ( 'LAND()' ) ;
    public final void ruleLand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:191:2: ( ( 'LAND()' ) )
            // InternalXDrone.g:192:2: ( 'LAND()' )
            {
            // InternalXDrone.g:192:2: ( 'LAND()' )
            // InternalXDrone.g:193:3: 'LAND()'
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
    // InternalXDrone.g:203:1: entryRuleSuperCommand : ruleSuperCommand EOF ;
    public final void entryRuleSuperCommand() throws RecognitionException {
        try {
            // InternalXDrone.g:204:1: ( ruleSuperCommand EOF )
            // InternalXDrone.g:205:1: ruleSuperCommand EOF
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
    // InternalXDrone.g:212:1: ruleSuperCommand : ( ( rule__SuperCommand__Alternatives ) ) ;
    public final void ruleSuperCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:216:2: ( ( ( rule__SuperCommand__Alternatives ) ) )
            // InternalXDrone.g:217:2: ( ( rule__SuperCommand__Alternatives ) )
            {
            // InternalXDrone.g:217:2: ( ( rule__SuperCommand__Alternatives ) )
            // InternalXDrone.g:218:3: ( rule__SuperCommand__Alternatives )
            {
             before(grammarAccess.getSuperCommandAccess().getAlternatives()); 
            // InternalXDrone.g:219:3: ( rule__SuperCommand__Alternatives )
            // InternalXDrone.g:219:4: rule__SuperCommand__Alternatives
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
    // InternalXDrone.g:228:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalXDrone.g:229:1: ( ruleCommand EOF )
            // InternalXDrone.g:230:1: ruleCommand EOF
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
    // InternalXDrone.g:237:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:241:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalXDrone.g:242:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalXDrone.g:242:2: ( ( rule__Command__Alternatives ) )
            // InternalXDrone.g:243:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalXDrone.g:244:3: ( rule__Command__Alternatives )
            // InternalXDrone.g:244:4: rule__Command__Alternatives
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
    // InternalXDrone.g:253:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalXDrone.g:254:1: ( ruleDOUBLE EOF )
            // InternalXDrone.g:255:1: ruleDOUBLE EOF
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
    // InternalXDrone.g:262:1: ruleDOUBLE : ( ( rule__DOUBLE__Alternatives ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:266:2: ( ( ( rule__DOUBLE__Alternatives ) ) )
            // InternalXDrone.g:267:2: ( ( rule__DOUBLE__Alternatives ) )
            {
            // InternalXDrone.g:267:2: ( ( rule__DOUBLE__Alternatives ) )
            // InternalXDrone.g:268:3: ( rule__DOUBLE__Alternatives )
            {
             before(grammarAccess.getDOUBLEAccess().getAlternatives()); 
            // InternalXDrone.g:269:3: ( rule__DOUBLE__Alternatives )
            // InternalXDrone.g:269:4: rule__DOUBLE__Alternatives
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


    // $ANTLR start "entryRulePOSITIVE_DOUBLE"
    // InternalXDrone.g:278:1: entryRulePOSITIVE_DOUBLE : rulePOSITIVE_DOUBLE EOF ;
    public final void entryRulePOSITIVE_DOUBLE() throws RecognitionException {
        try {
            // InternalXDrone.g:279:1: ( rulePOSITIVE_DOUBLE EOF )
            // InternalXDrone.g:280:1: rulePOSITIVE_DOUBLE EOF
            {
             before(grammarAccess.getPOSITIVE_DOUBLERule()); 
            pushFollow(FOLLOW_1);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getPOSITIVE_DOUBLERule()); 
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
    // $ANTLR end "entryRulePOSITIVE_DOUBLE"


    // $ANTLR start "rulePOSITIVE_DOUBLE"
    // InternalXDrone.g:287:1: rulePOSITIVE_DOUBLE : ( ( rule__POSITIVE_DOUBLE__Alternatives ) ) ;
    public final void rulePOSITIVE_DOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:291:2: ( ( ( rule__POSITIVE_DOUBLE__Alternatives ) ) )
            // InternalXDrone.g:292:2: ( ( rule__POSITIVE_DOUBLE__Alternatives ) )
            {
            // InternalXDrone.g:292:2: ( ( rule__POSITIVE_DOUBLE__Alternatives ) )
            // InternalXDrone.g:293:3: ( rule__POSITIVE_DOUBLE__Alternatives )
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getAlternatives()); 
            // InternalXDrone.g:294:3: ( rule__POSITIVE_DOUBLE__Alternatives )
            // InternalXDrone.g:294:4: rule__POSITIVE_DOUBLE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePOSITIVE_DOUBLE"


    // $ANTLR start "entryRuleFlyTo"
    // InternalXDrone.g:303:1: entryRuleFlyTo : ruleFlyTo EOF ;
    public final void entryRuleFlyTo() throws RecognitionException {
        try {
            // InternalXDrone.g:304:1: ( ruleFlyTo EOF )
            // InternalXDrone.g:305:1: ruleFlyTo EOF
            {
             before(grammarAccess.getFlyToRule()); 
            pushFollow(FOLLOW_1);
            ruleFlyTo();

            state._fsp--;

             after(grammarAccess.getFlyToRule()); 
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
    // $ANTLR end "entryRuleFlyTo"


    // $ANTLR start "ruleFlyTo"
    // InternalXDrone.g:312:1: ruleFlyTo : ( ( rule__FlyTo__Group__0 ) ) ;
    public final void ruleFlyTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:316:2: ( ( ( rule__FlyTo__Group__0 ) ) )
            // InternalXDrone.g:317:2: ( ( rule__FlyTo__Group__0 ) )
            {
            // InternalXDrone.g:317:2: ( ( rule__FlyTo__Group__0 ) )
            // InternalXDrone.g:318:3: ( rule__FlyTo__Group__0 )
            {
             before(grammarAccess.getFlyToAccess().getGroup()); 
            // InternalXDrone.g:319:3: ( rule__FlyTo__Group__0 )
            // InternalXDrone.g:319:4: rule__FlyTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FlyTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlyToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlyTo"


    // $ANTLR start "entryRuleMove"
    // InternalXDrone.g:328:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalXDrone.g:329:1: ( ruleMove EOF )
            // InternalXDrone.g:330:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalXDrone.g:337:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:341:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalXDrone.g:342:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalXDrone.g:342:2: ( ( rule__Move__Group__0 ) )
            // InternalXDrone.g:343:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalXDrone.g:344:3: ( rule__Move__Group__0 )
            // InternalXDrone.g:344:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRotate"
    // InternalXDrone.g:353:1: entryRuleRotate : ruleRotate EOF ;
    public final void entryRuleRotate() throws RecognitionException {
        try {
            // InternalXDrone.g:354:1: ( ruleRotate EOF )
            // InternalXDrone.g:355:1: ruleRotate EOF
            {
             before(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            ruleRotate();

            state._fsp--;

             after(grammarAccess.getRotateRule()); 
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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalXDrone.g:362:1: ruleRotate : ( ( rule__Rotate__Group__0 ) ) ;
    public final void ruleRotate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:366:2: ( ( ( rule__Rotate__Group__0 ) ) )
            // InternalXDrone.g:367:2: ( ( rule__Rotate__Group__0 ) )
            {
            // InternalXDrone.g:367:2: ( ( rule__Rotate__Group__0 ) )
            // InternalXDrone.g:368:3: ( rule__Rotate__Group__0 )
            {
             before(grammarAccess.getRotateAccess().getGroup()); 
            // InternalXDrone.g:369:3: ( rule__Rotate__Group__0 )
            // InternalXDrone.g:369:4: rule__Rotate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rotate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:378:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalXDrone.g:379:1: ( ruleWait EOF )
            // InternalXDrone.g:380:1: ruleWait EOF
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
    // InternalXDrone.g:387:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:391:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalXDrone.g:392:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalXDrone.g:392:2: ( ( rule__Wait__Group__0 ) )
            // InternalXDrone.g:393:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalXDrone.g:394:3: ( rule__Wait__Group__0 )
            // InternalXDrone.g:394:4: rule__Wait__Group__0
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
    // InternalXDrone.g:403:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalXDrone.g:404:1: ( ruleFunctionName EOF )
            // InternalXDrone.g:405:1: ruleFunctionName EOF
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
    // InternalXDrone.g:412:1: ruleFunctionName : ( ( rule__FunctionName__Group__0 ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:416:2: ( ( ( rule__FunctionName__Group__0 ) ) )
            // InternalXDrone.g:417:2: ( ( rule__FunctionName__Group__0 ) )
            {
            // InternalXDrone.g:417:2: ( ( rule__FunctionName__Group__0 ) )
            // InternalXDrone.g:418:3: ( rule__FunctionName__Group__0 )
            {
             before(grammarAccess.getFunctionNameAccess().getGroup()); 
            // InternalXDrone.g:419:3: ( rule__FunctionName__Group__0 )
            // InternalXDrone.g:419:4: rule__FunctionName__Group__0
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
    // InternalXDrone.g:428:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalXDrone.g:429:1: ( ruleDrone EOF )
            // InternalXDrone.g:430:1: ruleDrone EOF
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
    // InternalXDrone.g:437:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:441:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalXDrone.g:442:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalXDrone.g:442:2: ( ( rule__Drone__Group__0 ) )
            // InternalXDrone.g:443:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalXDrone.g:444:3: ( rule__Drone__Group__0 )
            // InternalXDrone.g:444:4: rule__Drone__Group__0
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
    // InternalXDrone.g:453:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalXDrone.g:454:1: ( ruleObject EOF )
            // InternalXDrone.g:455:1: ruleObject EOF
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
    // InternalXDrone.g:462:1: ruleObject : ( ( rule__Object__UnorderedGroup ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:466:2: ( ( ( rule__Object__UnorderedGroup ) ) )
            // InternalXDrone.g:467:2: ( ( rule__Object__UnorderedGroup ) )
            {
            // InternalXDrone.g:467:2: ( ( rule__Object__UnorderedGroup ) )
            // InternalXDrone.g:468:3: ( rule__Object__UnorderedGroup )
            {
             before(grammarAccess.getObjectAccess().getUnorderedGroup()); 
            // InternalXDrone.g:469:3: ( rule__Object__UnorderedGroup )
            // InternalXDrone.g:469:4: rule__Object__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Object__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getUnorderedGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOrigin"
    // InternalXDrone.g:478:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalXDrone.g:479:1: ( ruleOrigin EOF )
            // InternalXDrone.g:480:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
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
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalXDrone.g:487:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:491:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalXDrone.g:492:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalXDrone.g:492:2: ( ( rule__Origin__Group__0 ) )
            // InternalXDrone.g:493:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalXDrone.g:494:3: ( rule__Origin__Group__0 )
            // InternalXDrone.g:494:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleSize"
    // InternalXDrone.g:503:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalXDrone.g:504:1: ( ruleSize EOF )
            // InternalXDrone.g:505:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalXDrone.g:512:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:516:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalXDrone.g:517:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalXDrone.g:517:2: ( ( rule__Size__Group__0 ) )
            // InternalXDrone.g:518:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalXDrone.g:519:3: ( rule__Size__Group__0 )
            // InternalXDrone.g:519:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleVector"
    // InternalXDrone.g:528:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( ruleVector EOF )
            // InternalXDrone.g:530:1: ruleVector EOF
            {
             before(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_1);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getVectorRule()); 
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
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // InternalXDrone.g:537:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__Vector__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__Vector__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__Vector__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__Vector__Group__0 )
            // InternalXDrone.g:544:4: rule__Vector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleColor"
    // InternalXDrone.g:553:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalXDrone.g:554:1: ( ruleColor EOF )
            // InternalXDrone.g:555:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalXDrone.g:562:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:566:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalXDrone.g:567:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalXDrone.g:567:2: ( ( rule__Color__Group__0 ) )
            // InternalXDrone.g:568:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalXDrone.g:569:3: ( rule__Color__Group__0 )
            // InternalXDrone.g:569:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleWalls"
    // InternalXDrone.g:578:1: entryRuleWalls : ruleWalls EOF ;
    public final void entryRuleWalls() throws RecognitionException {
        try {
            // InternalXDrone.g:579:1: ( ruleWalls EOF )
            // InternalXDrone.g:580:1: ruleWalls EOF
            {
             before(grammarAccess.getWallsRule()); 
            pushFollow(FOLLOW_1);
            ruleWalls();

            state._fsp--;

             after(grammarAccess.getWallsRule()); 
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
    // $ANTLR end "entryRuleWalls"


    // $ANTLR start "ruleWalls"
    // InternalXDrone.g:587:1: ruleWalls : ( ( rule__Walls__UnorderedGroup ) ) ;
    public final void ruleWalls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:591:2: ( ( ( rule__Walls__UnorderedGroup ) ) )
            // InternalXDrone.g:592:2: ( ( rule__Walls__UnorderedGroup ) )
            {
            // InternalXDrone.g:592:2: ( ( rule__Walls__UnorderedGroup ) )
            // InternalXDrone.g:593:3: ( rule__Walls__UnorderedGroup )
            {
             before(grammarAccess.getWallsAccess().getUnorderedGroup()); 
            // InternalXDrone.g:594:3: ( rule__Walls__UnorderedGroup )
            // InternalXDrone.g:594:4: rule__Walls__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Walls__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWalls"


    // $ANTLR start "entryRuleFront"
    // InternalXDrone.g:603:1: entryRuleFront : ruleFront EOF ;
    public final void entryRuleFront() throws RecognitionException {
        try {
            // InternalXDrone.g:604:1: ( ruleFront EOF )
            // InternalXDrone.g:605:1: ruleFront EOF
            {
             before(grammarAccess.getFrontRule()); 
            pushFollow(FOLLOW_1);
            ruleFront();

            state._fsp--;

             after(grammarAccess.getFrontRule()); 
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
    // $ANTLR end "entryRuleFront"


    // $ANTLR start "ruleFront"
    // InternalXDrone.g:612:1: ruleFront : ( ( rule__Front__Group__0 ) ) ;
    public final void ruleFront() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:616:2: ( ( ( rule__Front__Group__0 ) ) )
            // InternalXDrone.g:617:2: ( ( rule__Front__Group__0 ) )
            {
            // InternalXDrone.g:617:2: ( ( rule__Front__Group__0 ) )
            // InternalXDrone.g:618:3: ( rule__Front__Group__0 )
            {
             before(grammarAccess.getFrontAccess().getGroup()); 
            // InternalXDrone.g:619:3: ( rule__Front__Group__0 )
            // InternalXDrone.g:619:4: rule__Front__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Front__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrontAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFront"


    // $ANTLR start "entryRuleRight"
    // InternalXDrone.g:628:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalXDrone.g:629:1: ( ruleRight EOF )
            // InternalXDrone.g:630:1: ruleRight EOF
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
    // InternalXDrone.g:637:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:641:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalXDrone.g:642:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalXDrone.g:642:2: ( ( rule__Right__Group__0 ) )
            // InternalXDrone.g:643:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalXDrone.g:644:3: ( rule__Right__Group__0 )
            // InternalXDrone.g:644:4: rule__Right__Group__0
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


    // $ANTLR start "entryRuleLeft"
    // InternalXDrone.g:653:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalXDrone.g:654:1: ( ruleLeft EOF )
            // InternalXDrone.g:655:1: ruleLeft EOF
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
    // InternalXDrone.g:662:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:666:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalXDrone.g:667:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalXDrone.g:667:2: ( ( rule__Left__Group__0 ) )
            // InternalXDrone.g:668:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalXDrone.g:669:3: ( rule__Left__Group__0 )
            // InternalXDrone.g:669:4: rule__Left__Group__0
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


    // $ANTLR start "entryRuleBack"
    // InternalXDrone.g:678:1: entryRuleBack : ruleBack EOF ;
    public final void entryRuleBack() throws RecognitionException {
        try {
            // InternalXDrone.g:679:1: ( ruleBack EOF )
            // InternalXDrone.g:680:1: ruleBack EOF
            {
             before(grammarAccess.getBackRule()); 
            pushFollow(FOLLOW_1);
            ruleBack();

            state._fsp--;

             after(grammarAccess.getBackRule()); 
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
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // InternalXDrone.g:687:1: ruleBack : ( ( rule__Back__Group__0 ) ) ;
    public final void ruleBack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:691:2: ( ( ( rule__Back__Group__0 ) ) )
            // InternalXDrone.g:692:2: ( ( rule__Back__Group__0 ) )
            {
            // InternalXDrone.g:692:2: ( ( rule__Back__Group__0 ) )
            // InternalXDrone.g:693:3: ( rule__Back__Group__0 )
            {
             before(grammarAccess.getBackAccess().getGroup()); 
            // InternalXDrone.g:694:3: ( rule__Back__Group__0 )
            // InternalXDrone.g:694:4: rule__Back__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Back__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:703:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalXDrone.g:704:1: ( ruleUp EOF )
            // InternalXDrone.g:705:1: ruleUp EOF
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
    // InternalXDrone.g:712:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:716:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalXDrone.g:717:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalXDrone.g:717:2: ( ( rule__Up__Group__0 ) )
            // InternalXDrone.g:718:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalXDrone.g:719:3: ( rule__Up__Group__0 )
            // InternalXDrone.g:719:4: rule__Up__Group__0
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


    // $ANTLR start "rule__Environment__Alternatives_2"
    // InternalXDrone.g:727:1: rule__Environment__Alternatives_2 : ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) );
    public final void rule__Environment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:731:1: ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
            case 14:
            case 29:
            case 31:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalXDrone.g:732:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:732:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    // InternalXDrone.g:733:3: ( rule__Environment__DroneAssignment_2_0 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0()); 
                    // InternalXDrone.g:734:3: ( rule__Environment__DroneAssignment_2_0 )
                    // InternalXDrone.g:734:4: rule__Environment__DroneAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__DroneAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:738:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:738:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    // InternalXDrone.g:739:3: ( rule__Environment__WallsAssignment_2_1 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getWallsAssignment_2_1()); 
                    // InternalXDrone.g:740:3: ( rule__Environment__WallsAssignment_2_1 )
                    // InternalXDrone.g:740:4: rule__Environment__WallsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__WallsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvironmentAccess().getWallsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:744:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:744:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    // InternalXDrone.g:745:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_2()); 
                    // InternalXDrone.g:746:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    // InternalXDrone.g:746:4: rule__Environment__ObjectsAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__ObjectsAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_2()); 

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
    // $ANTLR end "rule__Environment__Alternatives_2"


    // $ANTLR start "rule__SuperCommand__Alternatives"
    // InternalXDrone.g:754:1: rule__SuperCommand__Alternatives : ( ( ruleCommand ) | ( ruleFunctionName ) );
    public final void rule__SuperCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:758:1: ( ( ruleCommand ) | ( ruleFunctionName ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=23)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXDrone.g:759:2: ( ruleCommand )
                    {
                    // InternalXDrone.g:759:2: ( ruleCommand )
                    // InternalXDrone.g:760:3: ruleCommand
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
                    // InternalXDrone.g:765:2: ( ruleFunctionName )
                    {
                    // InternalXDrone.g:765:2: ( ruleFunctionName )
                    // InternalXDrone.g:766:3: ruleFunctionName
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
    // InternalXDrone.g:775:1: rule__Command__Alternatives : ( ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) | ( ruleFlyTo ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:779:1: ( ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) | ( ruleFlyTo ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:780:2: ( ruleWait )
                    {
                    // InternalXDrone.g:780:2: ( ruleWait )
                    // InternalXDrone.g:781:3: ruleWait
                    {
                     before(grammarAccess.getCommandAccess().getWaitParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWaitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:786:2: ( ruleMove )
                    {
                    // InternalXDrone.g:786:2: ( ruleMove )
                    // InternalXDrone.g:787:3: ruleMove
                    {
                     before(grammarAccess.getCommandAccess().getMoveParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoveParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:792:2: ( ruleRotate )
                    {
                    // InternalXDrone.g:792:2: ( ruleRotate )
                    // InternalXDrone.g:793:3: ruleRotate
                    {
                     before(grammarAccess.getCommandAccess().getRotateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRotate();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:798:2: ( ruleFlyTo )
                    {
                    // InternalXDrone.g:798:2: ( ruleFlyTo )
                    // InternalXDrone.g:799:3: ruleFlyTo
                    {
                     before(grammarAccess.getCommandAccess().getFlyToParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFlyTo();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getFlyToParserRuleCall_3()); 

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
    // InternalXDrone.g:808:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:812:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:813:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:813:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:814:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:815:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:815:4: rule__DOUBLE__Group_0__0
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
                    // InternalXDrone.g:819:2: ( rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:819:2: ( rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:820:3: rulePOSITIVE_DOUBLE
                    {
                     before(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePOSITIVE_DOUBLE();

                    state._fsp--;

                     after(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_1()); 

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


    // $ANTLR start "rule__POSITIVE_DOUBLE__Alternatives"
    // InternalXDrone.g:829:1: rule__POSITIVE_DOUBLE__Alternatives : ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__POSITIVE_DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:833:1: ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==14||LA5_1==20||LA5_1==25||(LA5_1>=29 && LA5_1<=32)||(LA5_1>=34 && LA5_1<=37)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:834:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:834:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:835:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:836:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    // InternalXDrone.g:836:4: rule__POSITIVE_DOUBLE__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__POSITIVE_DOUBLE__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:840:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:840:2: ( RULE_INT )
                    // InternalXDrone.g:841:3: RULE_INT
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__POSITIVE_DOUBLE__Alternatives"


    // $ANTLR start "rule__Main__Group__0"
    // InternalXDrone.g:850:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:854:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalXDrone.g:855:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalXDrone.g:862:1: rule__Main__Group__0__Impl : ( ( rule__Main__FlyAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:866:1: ( ( ( rule__Main__FlyAssignment_0 ) ) )
            // InternalXDrone.g:867:1: ( ( rule__Main__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:867:1: ( ( rule__Main__FlyAssignment_0 ) )
            // InternalXDrone.g:868:2: ( rule__Main__FlyAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:869:2: ( rule__Main__FlyAssignment_0 )
            // InternalXDrone.g:869:3: rule__Main__FlyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__FlyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getFlyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalXDrone.g:877:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:881:1: ( rule__Main__Group__1__Impl )
            // InternalXDrone.g:882:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__1__Impl();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalXDrone.g:888:1: rule__Main__Group__1__Impl : ( ( rule__Main__EnvironmentAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:892:1: ( ( ( rule__Main__EnvironmentAssignment_1 )? ) )
            // InternalXDrone.g:893:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            {
            // InternalXDrone.g:893:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            // InternalXDrone.g:894:2: ( rule__Main__EnvironmentAssignment_1 )?
            {
             before(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:895:2: ( rule__Main__EnvironmentAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:895:3: rule__Main__EnvironmentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__EnvironmentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Fly__Group__0"
    // InternalXDrone.g:904:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:908:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:909:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
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
    // InternalXDrone.g:916:1: rule__Fly__Group__0__Impl : ( 'fly(){' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:920:1: ( ( 'fly(){' ) )
            // InternalXDrone.g:921:1: ( 'fly(){' )
            {
            // InternalXDrone.g:921:1: ( 'fly(){' )
            // InternalXDrone.g:922:2: 'fly(){'
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
    // InternalXDrone.g:931:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:935:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:936:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
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
    // InternalXDrone.g:943:1: rule__Fly__Group__1__Impl : ( ( rule__Fly__Group_1__0 ) ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:947:1: ( ( ( rule__Fly__Group_1__0 ) ) )
            // InternalXDrone.g:948:1: ( ( rule__Fly__Group_1__0 ) )
            {
            // InternalXDrone.g:948:1: ( ( rule__Fly__Group_1__0 ) )
            // InternalXDrone.g:949:2: ( rule__Fly__Group_1__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_1()); 
            // InternalXDrone.g:950:2: ( rule__Fly__Group_1__0 )
            // InternalXDrone.g:950:3: rule__Fly__Group_1__0
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
    // InternalXDrone.g:958:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:962:1: ( rule__Fly__Group__2__Impl )
            // InternalXDrone.g:963:2: rule__Fly__Group__2__Impl
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
    // InternalXDrone.g:969:1: rule__Fly__Group__2__Impl : ( '}' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:973:1: ( ( '}' ) )
            // InternalXDrone.g:974:1: ( '}' )
            {
            // InternalXDrone.g:974:1: ( '}' )
            // InternalXDrone.g:975:2: '}'
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
    // InternalXDrone.g:985:1: rule__Fly__Group_1__0 : rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 ;
    public final void rule__Fly__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:989:1: ( rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 )
            // InternalXDrone.g:990:2: rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1
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
    // InternalXDrone.g:997:1: rule__Fly__Group_1__0__Impl : ( ( rule__Fly__TakeoffAssignment_1_0 ) ) ;
    public final void rule__Fly__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1001:1: ( ( ( rule__Fly__TakeoffAssignment_1_0 ) ) )
            // InternalXDrone.g:1002:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            {
            // InternalXDrone.g:1002:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            // InternalXDrone.g:1003:2: ( rule__Fly__TakeoffAssignment_1_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 
            // InternalXDrone.g:1004:2: ( rule__Fly__TakeoffAssignment_1_0 )
            // InternalXDrone.g:1004:3: rule__Fly__TakeoffAssignment_1_0
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
    // InternalXDrone.g:1012:1: rule__Fly__Group_1__1 : rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 ;
    public final void rule__Fly__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1016:1: ( rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 )
            // InternalXDrone.g:1017:2: rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2
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
    // InternalXDrone.g:1024:1: rule__Fly__Group_1__1__Impl : ( ( rule__Fly__CommandsAssignment_1_1 )* ) ;
    public final void rule__Fly__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1028:1: ( ( ( rule__Fly__CommandsAssignment_1_1 )* ) )
            // InternalXDrone.g:1029:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            {
            // InternalXDrone.g:1029:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            // InternalXDrone.g:1030:2: ( rule__Fly__CommandsAssignment_1_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 
            // InternalXDrone.g:1031:2: ( rule__Fly__CommandsAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==18||(LA7_0>=21 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXDrone.g:1031:3: rule__Fly__CommandsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Fly__CommandsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalXDrone.g:1039:1: rule__Fly__Group_1__2 : rule__Fly__Group_1__2__Impl ;
    public final void rule__Fly__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1043:1: ( rule__Fly__Group_1__2__Impl )
            // InternalXDrone.g:1044:2: rule__Fly__Group_1__2__Impl
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
    // InternalXDrone.g:1050:1: rule__Fly__Group_1__2__Impl : ( ( rule__Fly__LandAssignment_1_2 ) ) ;
    public final void rule__Fly__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1054:1: ( ( ( rule__Fly__LandAssignment_1_2 ) ) )
            // InternalXDrone.g:1055:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            {
            // InternalXDrone.g:1055:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            // InternalXDrone.g:1056:2: ( rule__Fly__LandAssignment_1_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 
            // InternalXDrone.g:1057:2: ( rule__Fly__LandAssignment_1_2 )
            // InternalXDrone.g:1057:3: rule__Fly__LandAssignment_1_2
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
    // InternalXDrone.g:1066:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1070:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:1071:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
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
    // InternalXDrone.g:1078:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1082:1: ( ( () ) )
            // InternalXDrone.g:1083:1: ( () )
            {
            // InternalXDrone.g:1083:1: ( () )
            // InternalXDrone.g:1084:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:1085:2: ()
            // InternalXDrone.g:1085:3: 
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
    // InternalXDrone.g:1093:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1097:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:1098:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
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
    // InternalXDrone.g:1105:1: rule__Environment__Group__1__Impl : ( 'environment(){' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1109:1: ( ( 'environment(){' ) )
            // InternalXDrone.g:1110:1: ( 'environment(){' )
            {
            // InternalXDrone.g:1110:1: ( 'environment(){' )
            // InternalXDrone.g:1111:2: 'environment(){'
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
    // InternalXDrone.g:1120:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1124:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:1125:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
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
    // InternalXDrone.g:1132:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Alternatives_2 )* ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1136:1: ( ( ( rule__Environment__Alternatives_2 )* ) )
            // InternalXDrone.g:1137:1: ( ( rule__Environment__Alternatives_2 )* )
            {
            // InternalXDrone.g:1137:1: ( ( rule__Environment__Alternatives_2 )* )
            // InternalXDrone.g:1138:2: ( rule__Environment__Alternatives_2 )*
            {
             before(grammarAccess.getEnvironmentAccess().getAlternatives_2()); 
            // InternalXDrone.g:1139:2: ( rule__Environment__Alternatives_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID||LA8_1==14||LA8_1==25||LA8_1==29||(LA8_1>=31 && LA8_1<=32)||(LA8_1>=34 && LA8_1<=37)) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_ID||LA8_0==25||LA8_0==29||(LA8_0>=31 && LA8_0<=32)||(LA8_0>=34 && LA8_0<=37)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXDrone.g:1139:3: rule__Environment__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Environment__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalXDrone.g:1147:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1151:1: ( rule__Environment__Group__3__Impl )
            // InternalXDrone.g:1152:2: rule__Environment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__3__Impl();

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
    // InternalXDrone.g:1158:1: rule__Environment__Group__3__Impl : ( '}' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1162:1: ( ( '}' ) )
            // InternalXDrone.g:1163:1: ( '}' )
            {
            // InternalXDrone.g:1163:1: ( '}' )
            // InternalXDrone.g:1164:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DOUBLE__Group_0__0"
    // InternalXDrone.g:1174:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1178:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1179:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
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
    // InternalXDrone.g:1186:1: rule__DOUBLE__Group_0__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1190:1: ( ( '-' ) )
            // InternalXDrone.g:1191:1: ( '-' )
            {
            // InternalXDrone.g:1191:1: ( '-' )
            // InternalXDrone.g:1192:2: '-'
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0_0()); 

            }


            }

        }
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
    // InternalXDrone.g:1201:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1205:1: ( rule__DOUBLE__Group_0__1__Impl )
            // InternalXDrone.g:1206:2: rule__DOUBLE__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_0__1__Impl();

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
    // InternalXDrone.g:1212:1: rule__DOUBLE__Group_0__1__Impl : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1216:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1217:1: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1217:1: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1218:2: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__0"
    // InternalXDrone.g:1228:1: rule__POSITIVE_DOUBLE__Group_0__0 : rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1232:1: ( rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 )
            // InternalXDrone.g:1233:2: rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__POSITIVE_DOUBLE__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Group_0__1();

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
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__0"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__0__Impl"
    // InternalXDrone.g:1240:1: rule__POSITIVE_DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1244:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1245:1: ( RULE_INT )
            {
            // InternalXDrone.g:1245:1: ( RULE_INT )
            // InternalXDrone.g:1246:2: RULE_INT
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__0__Impl"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__1"
    // InternalXDrone.g:1255:1: rule__POSITIVE_DOUBLE__Group_0__1 : rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1259:1: ( rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 )
            // InternalXDrone.g:1260:2: rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__POSITIVE_DOUBLE__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Group_0__2();

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
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__1"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__1__Impl"
    // InternalXDrone.g:1267:1: rule__POSITIVE_DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1271:1: ( ( '.' ) )
            // InternalXDrone.g:1272:1: ( '.' )
            {
            // InternalXDrone.g:1272:1: ( '.' )
            // InternalXDrone.g:1273:2: '.'
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getFullStopKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__1__Impl"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__2"
    // InternalXDrone.g:1282:1: rule__POSITIVE_DOUBLE__Group_0__2 : rule__POSITIVE_DOUBLE__Group_0__2__Impl ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1286:1: ( rule__POSITIVE_DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1287:2: rule__POSITIVE_DOUBLE__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Group_0__2__Impl();

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
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__2"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__2__Impl"
    // InternalXDrone.g:1293:1: rule__POSITIVE_DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1297:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1298:1: ( RULE_INT )
            {
            // InternalXDrone.g:1298:1: ( RULE_INT )
            // InternalXDrone.g:1299:2: RULE_INT
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__2__Impl"


    // $ANTLR start "rule__FlyTo__Group__0"
    // InternalXDrone.g:1309:1: rule__FlyTo__Group__0 : rule__FlyTo__Group__0__Impl rule__FlyTo__Group__1 ;
    public final void rule__FlyTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1313:1: ( rule__FlyTo__Group__0__Impl rule__FlyTo__Group__1 )
            // InternalXDrone.g:1314:2: rule__FlyTo__Group__0__Impl rule__FlyTo__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FlyTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlyTo__Group__1();

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
    // $ANTLR end "rule__FlyTo__Group__0"


    // $ANTLR start "rule__FlyTo__Group__0__Impl"
    // InternalXDrone.g:1321:1: rule__FlyTo__Group__0__Impl : ( 'FLYTO' ) ;
    public final void rule__FlyTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1325:1: ( ( 'FLYTO' ) )
            // InternalXDrone.g:1326:1: ( 'FLYTO' )
            {
            // InternalXDrone.g:1326:1: ( 'FLYTO' )
            // InternalXDrone.g:1327:2: 'FLYTO'
            {
             before(grammarAccess.getFlyToAccess().getFLYTOKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFlyToAccess().getFLYTOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlyTo__Group__0__Impl"


    // $ANTLR start "rule__FlyTo__Group__1"
    // InternalXDrone.g:1336:1: rule__FlyTo__Group__1 : rule__FlyTo__Group__1__Impl rule__FlyTo__Group__2 ;
    public final void rule__FlyTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1340:1: ( rule__FlyTo__Group__1__Impl rule__FlyTo__Group__2 )
            // InternalXDrone.g:1341:2: rule__FlyTo__Group__1__Impl rule__FlyTo__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FlyTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlyTo__Group__2();

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
    // $ANTLR end "rule__FlyTo__Group__1"


    // $ANTLR start "rule__FlyTo__Group__1__Impl"
    // InternalXDrone.g:1348:1: rule__FlyTo__Group__1__Impl : ( '(' ) ;
    public final void rule__FlyTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1352:1: ( ( '(' ) )
            // InternalXDrone.g:1353:1: ( '(' )
            {
            // InternalXDrone.g:1353:1: ( '(' )
            // InternalXDrone.g:1354:2: '('
            {
             before(grammarAccess.getFlyToAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFlyToAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlyTo__Group__1__Impl"


    // $ANTLR start "rule__FlyTo__Group__2"
    // InternalXDrone.g:1363:1: rule__FlyTo__Group__2 : rule__FlyTo__Group__2__Impl rule__FlyTo__Group__3 ;
    public final void rule__FlyTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1367:1: ( rule__FlyTo__Group__2__Impl rule__FlyTo__Group__3 )
            // InternalXDrone.g:1368:2: rule__FlyTo__Group__2__Impl rule__FlyTo__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FlyTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlyTo__Group__3();

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
    // $ANTLR end "rule__FlyTo__Group__2"


    // $ANTLR start "rule__FlyTo__Group__2__Impl"
    // InternalXDrone.g:1375:1: rule__FlyTo__Group__2__Impl : ( ( rule__FlyTo__Object_nameAssignment_2 ) ) ;
    public final void rule__FlyTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1379:1: ( ( ( rule__FlyTo__Object_nameAssignment_2 ) ) )
            // InternalXDrone.g:1380:1: ( ( rule__FlyTo__Object_nameAssignment_2 ) )
            {
            // InternalXDrone.g:1380:1: ( ( rule__FlyTo__Object_nameAssignment_2 ) )
            // InternalXDrone.g:1381:2: ( rule__FlyTo__Object_nameAssignment_2 )
            {
             before(grammarAccess.getFlyToAccess().getObject_nameAssignment_2()); 
            // InternalXDrone.g:1382:2: ( rule__FlyTo__Object_nameAssignment_2 )
            // InternalXDrone.g:1382:3: rule__FlyTo__Object_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FlyTo__Object_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFlyToAccess().getObject_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlyTo__Group__2__Impl"


    // $ANTLR start "rule__FlyTo__Group__3"
    // InternalXDrone.g:1390:1: rule__FlyTo__Group__3 : rule__FlyTo__Group__3__Impl ;
    public final void rule__FlyTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1394:1: ( rule__FlyTo__Group__3__Impl )
            // InternalXDrone.g:1395:2: rule__FlyTo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FlyTo__Group__3__Impl();

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
    // $ANTLR end "rule__FlyTo__Group__3"


    // $ANTLR start "rule__FlyTo__Group__3__Impl"
    // InternalXDrone.g:1401:1: rule__FlyTo__Group__3__Impl : ( ')' ) ;
    public final void rule__FlyTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1405:1: ( ( ')' ) )
            // InternalXDrone.g:1406:1: ( ')' )
            {
            // InternalXDrone.g:1406:1: ( ')' )
            // InternalXDrone.g:1407:2: ')'
            {
             before(grammarAccess.getFlyToAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFlyToAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlyTo__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalXDrone.g:1417:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1421:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalXDrone.g:1422:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

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
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalXDrone.g:1429:1: rule__Move__Group__0__Impl : ( 'MOVE' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1433:1: ( ( 'MOVE' ) )
            // InternalXDrone.g:1434:1: ( 'MOVE' )
            {
            // InternalXDrone.g:1434:1: ( 'MOVE' )
            // InternalXDrone.g:1435:2: 'MOVE'
            {
             before(grammarAccess.getMoveAccess().getMOVEKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMOVEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalXDrone.g:1444:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1448:1: ( rule__Move__Group__1__Impl )
            // InternalXDrone.g:1449:2: rule__Move__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__1__Impl();

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
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalXDrone.g:1455:1: rule__Move__Group__1__Impl : ( ( rule__Move__VectorAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1459:1: ( ( ( rule__Move__VectorAssignment_1 ) ) )
            // InternalXDrone.g:1460:1: ( ( rule__Move__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:1460:1: ( ( rule__Move__VectorAssignment_1 ) )
            // InternalXDrone.g:1461:2: ( rule__Move__VectorAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:1462:2: ( rule__Move__VectorAssignment_1 )
            // InternalXDrone.g:1462:3: rule__Move__VectorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__VectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getVectorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Rotate__Group__0"
    // InternalXDrone.g:1471:1: rule__Rotate__Group__0 : rule__Rotate__Group__0__Impl rule__Rotate__Group__1 ;
    public final void rule__Rotate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1475:1: ( rule__Rotate__Group__0__Impl rule__Rotate__Group__1 )
            // InternalXDrone.g:1476:2: rule__Rotate__Group__0__Impl rule__Rotate__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Rotate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotate__Group__1();

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
    // $ANTLR end "rule__Rotate__Group__0"


    // $ANTLR start "rule__Rotate__Group__0__Impl"
    // InternalXDrone.g:1483:1: rule__Rotate__Group__0__Impl : ( 'ROTATE' ) ;
    public final void rule__Rotate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1487:1: ( ( 'ROTATE' ) )
            // InternalXDrone.g:1488:1: ( 'ROTATE' )
            {
            // InternalXDrone.g:1488:1: ( 'ROTATE' )
            // InternalXDrone.g:1489:2: 'ROTATE'
            {
             before(grammarAccess.getRotateAccess().getROTATEKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRotateAccess().getROTATEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__0__Impl"


    // $ANTLR start "rule__Rotate__Group__1"
    // InternalXDrone.g:1498:1: rule__Rotate__Group__1 : rule__Rotate__Group__1__Impl rule__Rotate__Group__2 ;
    public final void rule__Rotate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1502:1: ( rule__Rotate__Group__1__Impl rule__Rotate__Group__2 )
            // InternalXDrone.g:1503:2: rule__Rotate__Group__1__Impl rule__Rotate__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Rotate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotate__Group__2();

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
    // $ANTLR end "rule__Rotate__Group__1"


    // $ANTLR start "rule__Rotate__Group__1__Impl"
    // InternalXDrone.g:1510:1: rule__Rotate__Group__1__Impl : ( '(' ) ;
    public final void rule__Rotate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1514:1: ( ( '(' ) )
            // InternalXDrone.g:1515:1: ( '(' )
            {
            // InternalXDrone.g:1515:1: ( '(' )
            // InternalXDrone.g:1516:2: '('
            {
             before(grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__1__Impl"


    // $ANTLR start "rule__Rotate__Group__2"
    // InternalXDrone.g:1525:1: rule__Rotate__Group__2 : rule__Rotate__Group__2__Impl rule__Rotate__Group__3 ;
    public final void rule__Rotate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1529:1: ( rule__Rotate__Group__2__Impl rule__Rotate__Group__3 )
            // InternalXDrone.g:1530:2: rule__Rotate__Group__2__Impl rule__Rotate__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Rotate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotate__Group__3();

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
    // $ANTLR end "rule__Rotate__Group__2"


    // $ANTLR start "rule__Rotate__Group__2__Impl"
    // InternalXDrone.g:1537:1: rule__Rotate__Group__2__Impl : ( ( rule__Rotate__AngleAssignment_2 ) ) ;
    public final void rule__Rotate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1541:1: ( ( ( rule__Rotate__AngleAssignment_2 ) ) )
            // InternalXDrone.g:1542:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:1542:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            // InternalXDrone.g:1543:2: ( rule__Rotate__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:1544:2: ( rule__Rotate__AngleAssignment_2 )
            // InternalXDrone.g:1544:3: rule__Rotate__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rotate__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateAccess().getAngleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__2__Impl"


    // $ANTLR start "rule__Rotate__Group__3"
    // InternalXDrone.g:1552:1: rule__Rotate__Group__3 : rule__Rotate__Group__3__Impl ;
    public final void rule__Rotate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1556:1: ( rule__Rotate__Group__3__Impl )
            // InternalXDrone.g:1557:2: rule__Rotate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotate__Group__3__Impl();

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
    // $ANTLR end "rule__Rotate__Group__3"


    // $ANTLR start "rule__Rotate__Group__3__Impl"
    // InternalXDrone.g:1563:1: rule__Rotate__Group__3__Impl : ( ')' ) ;
    public final void rule__Rotate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1567:1: ( ( ')' ) )
            // InternalXDrone.g:1568:1: ( ')' )
            {
            // InternalXDrone.g:1568:1: ( ')' )
            // InternalXDrone.g:1569:2: ')'
            {
             before(grammarAccess.getRotateAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRotateAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__Group__3__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalXDrone.g:1579:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1583:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:1584:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalXDrone.g:1591:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1595:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:1596:1: ( 'WAIT' )
            {
            // InternalXDrone.g:1596:1: ( 'WAIT' )
            // InternalXDrone.g:1597:2: 'WAIT'
            {
             before(grammarAccess.getWaitAccess().getWAITKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalXDrone.g:1606:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1610:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:1611:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXDrone.g:1618:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1622:1: ( ( '(' ) )
            // InternalXDrone.g:1623:1: ( '(' )
            {
            // InternalXDrone.g:1623:1: ( '(' )
            // InternalXDrone.g:1624:2: '('
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
    // InternalXDrone.g:1633:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1637:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:1638:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
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
    // InternalXDrone.g:1645:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1649:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:1650:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:1650:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:1651:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:1652:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:1652:3: rule__Wait__SecondsAssignment_2
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
    // InternalXDrone.g:1660:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1664:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:1665:2: rule__Wait__Group__3__Impl
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
    // InternalXDrone.g:1671:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1675:1: ( ( ')' ) )
            // InternalXDrone.g:1676:1: ( ')' )
            {
            // InternalXDrone.g:1676:1: ( ')' )
            // InternalXDrone.g:1677:2: ')'
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
    // InternalXDrone.g:1687:1: rule__FunctionName__Group__0 : rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 ;
    public final void rule__FunctionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1691:1: ( rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 )
            // InternalXDrone.g:1692:2: rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXDrone.g:1699:1: rule__FunctionName__Group__0__Impl : ( ( rule__FunctionName__Func_nameAssignment_0 ) ) ;
    public final void rule__FunctionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1703:1: ( ( ( rule__FunctionName__Func_nameAssignment_0 ) ) )
            // InternalXDrone.g:1704:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            {
            // InternalXDrone.g:1704:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            // InternalXDrone.g:1705:2: ( rule__FunctionName__Func_nameAssignment_0 )
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 
            // InternalXDrone.g:1706:2: ( rule__FunctionName__Func_nameAssignment_0 )
            // InternalXDrone.g:1706:3: rule__FunctionName__Func_nameAssignment_0
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
    // InternalXDrone.g:1714:1: rule__FunctionName__Group__1 : rule__FunctionName__Group__1__Impl ;
    public final void rule__FunctionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1718:1: ( rule__FunctionName__Group__1__Impl )
            // InternalXDrone.g:1719:2: rule__FunctionName__Group__1__Impl
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
    // InternalXDrone.g:1725:1: rule__FunctionName__Group__1__Impl : ( '()' ) ;
    public final void rule__FunctionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1729:1: ( ( '()' ) )
            // InternalXDrone.g:1730:1: ( '()' )
            {
            // InternalXDrone.g:1730:1: ( '()' )
            // InternalXDrone.g:1731:2: '()'
            {
             before(grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalXDrone.g:1741:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1745:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:1746:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
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
    // InternalXDrone.g:1753:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1757:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:1758:1: ( 'DRONE' )
            {
            // InternalXDrone.g:1758:1: ( 'DRONE' )
            // InternalXDrone.g:1759:2: 'DRONE'
            {
             before(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalXDrone.g:1768:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1772:1: ( rule__Drone__Group__1__Impl )
            // InternalXDrone.g:1773:2: rule__Drone__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__1__Impl();

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
    // InternalXDrone.g:1779:1: rule__Drone__Group__1__Impl : ( ( rule__Drone__VectorAssignment_1 ) ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1783:1: ( ( ( rule__Drone__VectorAssignment_1 ) ) )
            // InternalXDrone.g:1784:1: ( ( rule__Drone__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:1784:1: ( ( rule__Drone__VectorAssignment_1 ) )
            // InternalXDrone.g:1785:2: ( rule__Drone__VectorAssignment_1 )
            {
             before(grammarAccess.getDroneAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:1786:2: ( rule__Drone__VectorAssignment_1 )
            // InternalXDrone.g:1786:3: rule__Drone__VectorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Drone__VectorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getVectorAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Object__Group_0__0"
    // InternalXDrone.g:1795:1: rule__Object__Group_0__0 : rule__Object__Group_0__0__Impl rule__Object__Group_0__1 ;
    public final void rule__Object__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1799:1: ( rule__Object__Group_0__0__Impl rule__Object__Group_0__1 )
            // InternalXDrone.g:1800:2: rule__Object__Group_0__0__Impl rule__Object__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Object__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_0__1();

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
    // $ANTLR end "rule__Object__Group_0__0"


    // $ANTLR start "rule__Object__Group_0__0__Impl"
    // InternalXDrone.g:1807:1: rule__Object__Group_0__0__Impl : ( ( rule__Object__Object_nameAssignment_0_0 ) ) ;
    public final void rule__Object__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1811:1: ( ( ( rule__Object__Object_nameAssignment_0_0 ) ) )
            // InternalXDrone.g:1812:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            {
            // InternalXDrone.g:1812:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            // InternalXDrone.g:1813:2: ( rule__Object__Object_nameAssignment_0_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0_0()); 
            // InternalXDrone.g:1814:2: ( rule__Object__Object_nameAssignment_0_0 )
            // InternalXDrone.g:1814:3: rule__Object__Object_nameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Object_nameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObject_nameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_0__0__Impl"


    // $ANTLR start "rule__Object__Group_0__1"
    // InternalXDrone.g:1822:1: rule__Object__Group_0__1 : rule__Object__Group_0__1__Impl rule__Object__Group_0__2 ;
    public final void rule__Object__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1826:1: ( rule__Object__Group_0__1__Impl rule__Object__Group_0__2 )
            // InternalXDrone.g:1827:2: rule__Object__Group_0__1__Impl rule__Object__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__Object__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_0__2();

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
    // $ANTLR end "rule__Object__Group_0__1"


    // $ANTLR start "rule__Object__Group_0__1__Impl"
    // InternalXDrone.g:1834:1: rule__Object__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Object__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1838:1: ( ( '{' ) )
            // InternalXDrone.g:1839:1: ( '{' )
            {
            // InternalXDrone.g:1839:1: ( '{' )
            // InternalXDrone.g:1840:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_0__1__Impl"


    // $ANTLR start "rule__Object__Group_0__2"
    // InternalXDrone.g:1849:1: rule__Object__Group_0__2 : rule__Object__Group_0__2__Impl ;
    public final void rule__Object__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1853:1: ( rule__Object__Group_0__2__Impl )
            // InternalXDrone.g:1854:2: rule__Object__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_0__2__Impl();

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
    // $ANTLR end "rule__Object__Group_0__2"


    // $ANTLR start "rule__Object__Group_0__2__Impl"
    // InternalXDrone.g:1860:1: rule__Object__Group_0__2__Impl : ( ( rule__Object__OriginAssignment_0_2 ) ) ;
    public final void rule__Object__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1864:1: ( ( ( rule__Object__OriginAssignment_0_2 ) ) )
            // InternalXDrone.g:1865:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            {
            // InternalXDrone.g:1865:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            // InternalXDrone.g:1866:2: ( rule__Object__OriginAssignment_0_2 )
            {
             before(grammarAccess.getObjectAccess().getOriginAssignment_0_2()); 
            // InternalXDrone.g:1867:2: ( rule__Object__OriginAssignment_0_2 )
            // InternalXDrone.g:1867:3: rule__Object__OriginAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Object__OriginAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getOriginAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_0__2__Impl"


    // $ANTLR start "rule__Object__Group_2__0"
    // InternalXDrone.g:1876:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1880:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalXDrone.g:1881:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1();

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
    // $ANTLR end "rule__Object__Group_2__0"


    // $ANTLR start "rule__Object__Group_2__0__Impl"
    // InternalXDrone.g:1888:1: rule__Object__Group_2__0__Impl : ( ( rule__Object__ColorAssignment_2_0 )? ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1892:1: ( ( ( rule__Object__ColorAssignment_2_0 )? ) )
            // InternalXDrone.g:1893:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            {
            // InternalXDrone.g:1893:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            // InternalXDrone.g:1894:2: ( rule__Object__ColorAssignment_2_0 )?
            {
             before(grammarAccess.getObjectAccess().getColorAssignment_2_0()); 
            // InternalXDrone.g:1895:2: ( rule__Object__ColorAssignment_2_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXDrone.g:1895:3: rule__Object__ColorAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__ColorAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectAccess().getColorAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__0__Impl"


    // $ANTLR start "rule__Object__Group_2__1"
    // InternalXDrone.g:1903:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1907:1: ( rule__Object__Group_2__1__Impl )
            // InternalXDrone.g:1908:2: rule__Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group_2__1__Impl();

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
    // $ANTLR end "rule__Object__Group_2__1"


    // $ANTLR start "rule__Object__Group_2__1__Impl"
    // InternalXDrone.g:1914:1: rule__Object__Group_2__1__Impl : ( '}' ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1918:1: ( ( '}' ) )
            // InternalXDrone.g:1919:1: ( '}' )
            {
            // InternalXDrone.g:1919:1: ( '}' )
            // InternalXDrone.g:1920:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group_2__1__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalXDrone.g:1930:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1934:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalXDrone.g:1935:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

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
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalXDrone.g:1942:1: rule__Origin__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1946:1: ( ( 'origin' ) )
            // InternalXDrone.g:1947:1: ( 'origin' )
            {
            // InternalXDrone.g:1947:1: ( 'origin' )
            // InternalXDrone.g:1948:2: 'origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalXDrone.g:1957:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1961:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalXDrone.g:1962:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

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
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalXDrone.g:1969:1: rule__Origin__Group__1__Impl : ( '=' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1973:1: ( ( '=' ) )
            // InternalXDrone.g:1974:1: ( '=' )
            {
            // InternalXDrone.g:1974:1: ( '=' )
            // InternalXDrone.g:1975:2: '='
            {
             before(grammarAccess.getOriginAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalXDrone.g:1984:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1988:1: ( rule__Origin__Group__2__Impl )
            // InternalXDrone.g:1989:2: rule__Origin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__2__Impl();

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
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalXDrone.g:1995:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__VectorAssignment_2 ) ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1999:1: ( ( ( rule__Origin__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2000:1: ( ( rule__Origin__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2000:1: ( ( rule__Origin__VectorAssignment_2 ) )
            // InternalXDrone.g:2001:2: ( rule__Origin__VectorAssignment_2 )
            {
             before(grammarAccess.getOriginAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2002:2: ( rule__Origin__VectorAssignment_2 )
            // InternalXDrone.g:2002:3: rule__Origin__VectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Origin__VectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getVectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalXDrone.g:2011:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2015:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalXDrone.g:2016:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

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
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalXDrone.g:2023:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2027:1: ( ( 'size' ) )
            // InternalXDrone.g:2028:1: ( 'size' )
            {
            // InternalXDrone.g:2028:1: ( 'size' )
            // InternalXDrone.g:2029:2: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalXDrone.g:2038:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2042:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalXDrone.g:2043:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__2();

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
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalXDrone.g:2050:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2054:1: ( ( '=' ) )
            // InternalXDrone.g:2055:1: ( '=' )
            {
            // InternalXDrone.g:2055:1: ( '=' )
            // InternalXDrone.g:2056:2: '='
            {
             before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // InternalXDrone.g:2065:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2069:1: ( rule__Size__Group__2__Impl )
            // InternalXDrone.g:2070:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__2__Impl();

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
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // InternalXDrone.g:2076:1: rule__Size__Group__2__Impl : ( ( rule__Size__VectorAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2080:1: ( ( ( rule__Size__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2081:1: ( ( rule__Size__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2081:1: ( ( rule__Size__VectorAssignment_2 ) )
            // InternalXDrone.g:2082:2: ( rule__Size__VectorAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2083:2: ( rule__Size__VectorAssignment_2 )
            // InternalXDrone.g:2083:3: rule__Size__VectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Size__VectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getVectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Vector__Group__0"
    // InternalXDrone.g:2092:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2096:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // InternalXDrone.g:2097:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Vector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__1();

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
    // $ANTLR end "rule__Vector__Group__0"


    // $ANTLR start "rule__Vector__Group__0__Impl"
    // InternalXDrone.g:2104:1: rule__Vector__Group__0__Impl : ( '(' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2108:1: ( ( '(' ) )
            // InternalXDrone.g:2109:1: ( '(' )
            {
            // InternalXDrone.g:2109:1: ( '(' )
            // InternalXDrone.g:2110:2: '('
            {
             before(grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__0__Impl"


    // $ANTLR start "rule__Vector__Group__1"
    // InternalXDrone.g:2119:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2123:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // InternalXDrone.g:2124:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Vector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__2();

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
    // $ANTLR end "rule__Vector__Group__1"


    // $ANTLR start "rule__Vector__Group__1__Impl"
    // InternalXDrone.g:2131:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2135:1: ( ( ( rule__Vector__XAssignment_1 ) ) )
            // InternalXDrone.g:2136:1: ( ( rule__Vector__XAssignment_1 ) )
            {
            // InternalXDrone.g:2136:1: ( ( rule__Vector__XAssignment_1 ) )
            // InternalXDrone.g:2137:2: ( rule__Vector__XAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getXAssignment_1()); 
            // InternalXDrone.g:2138:2: ( rule__Vector__XAssignment_1 )
            // InternalXDrone.g:2138:3: rule__Vector__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vector__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__1__Impl"


    // $ANTLR start "rule__Vector__Group__2"
    // InternalXDrone.g:2146:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2150:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // InternalXDrone.g:2151:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Vector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__3();

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
    // $ANTLR end "rule__Vector__Group__2"


    // $ANTLR start "rule__Vector__Group__2__Impl"
    // InternalXDrone.g:2158:1: rule__Vector__Group__2__Impl : ( ',' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2162:1: ( ( ',' ) )
            // InternalXDrone.g:2163:1: ( ',' )
            {
            // InternalXDrone.g:2163:1: ( ',' )
            // InternalXDrone.g:2164:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__2__Impl"


    // $ANTLR start "rule__Vector__Group__3"
    // InternalXDrone.g:2173:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2177:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // InternalXDrone.g:2178:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Vector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__4();

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
    // $ANTLR end "rule__Vector__Group__3"


    // $ANTLR start "rule__Vector__Group__3__Impl"
    // InternalXDrone.g:2185:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__YAssignment_3 ) ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2189:1: ( ( ( rule__Vector__YAssignment_3 ) ) )
            // InternalXDrone.g:2190:1: ( ( rule__Vector__YAssignment_3 ) )
            {
            // InternalXDrone.g:2190:1: ( ( rule__Vector__YAssignment_3 ) )
            // InternalXDrone.g:2191:2: ( rule__Vector__YAssignment_3 )
            {
             before(grammarAccess.getVectorAccess().getYAssignment_3()); 
            // InternalXDrone.g:2192:2: ( rule__Vector__YAssignment_3 )
            // InternalXDrone.g:2192:3: rule__Vector__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Vector__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__3__Impl"


    // $ANTLR start "rule__Vector__Group__4"
    // InternalXDrone.g:2200:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl rule__Vector__Group__5 ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2204:1: ( rule__Vector__Group__4__Impl rule__Vector__Group__5 )
            // InternalXDrone.g:2205:2: rule__Vector__Group__4__Impl rule__Vector__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Vector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__5();

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
    // $ANTLR end "rule__Vector__Group__4"


    // $ANTLR start "rule__Vector__Group__4__Impl"
    // InternalXDrone.g:2212:1: rule__Vector__Group__4__Impl : ( ',' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2216:1: ( ( ',' ) )
            // InternalXDrone.g:2217:1: ( ',' )
            {
            // InternalXDrone.g:2217:1: ( ',' )
            // InternalXDrone.g:2218:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__4__Impl"


    // $ANTLR start "rule__Vector__Group__5"
    // InternalXDrone.g:2227:1: rule__Vector__Group__5 : rule__Vector__Group__5__Impl rule__Vector__Group__6 ;
    public final void rule__Vector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2231:1: ( rule__Vector__Group__5__Impl rule__Vector__Group__6 )
            // InternalXDrone.g:2232:2: rule__Vector__Group__5__Impl rule__Vector__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Vector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__6();

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
    // $ANTLR end "rule__Vector__Group__5"


    // $ANTLR start "rule__Vector__Group__5__Impl"
    // InternalXDrone.g:2239:1: rule__Vector__Group__5__Impl : ( ( rule__Vector__ZAssignment_5 ) ) ;
    public final void rule__Vector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2243:1: ( ( ( rule__Vector__ZAssignment_5 ) ) )
            // InternalXDrone.g:2244:1: ( ( rule__Vector__ZAssignment_5 ) )
            {
            // InternalXDrone.g:2244:1: ( ( rule__Vector__ZAssignment_5 ) )
            // InternalXDrone.g:2245:2: ( rule__Vector__ZAssignment_5 )
            {
             before(grammarAccess.getVectorAccess().getZAssignment_5()); 
            // InternalXDrone.g:2246:2: ( rule__Vector__ZAssignment_5 )
            // InternalXDrone.g:2246:3: rule__Vector__ZAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Vector__ZAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getZAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__5__Impl"


    // $ANTLR start "rule__Vector__Group__6"
    // InternalXDrone.g:2254:1: rule__Vector__Group__6 : rule__Vector__Group__6__Impl ;
    public final void rule__Vector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2258:1: ( rule__Vector__Group__6__Impl )
            // InternalXDrone.g:2259:2: rule__Vector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vector__Group__6__Impl();

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
    // $ANTLR end "rule__Vector__Group__6"


    // $ANTLR start "rule__Vector__Group__6__Impl"
    // InternalXDrone.g:2265:1: rule__Vector__Group__6__Impl : ( ')' ) ;
    public final void rule__Vector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2269:1: ( ( ')' ) )
            // InternalXDrone.g:2270:1: ( ')' )
            {
            // InternalXDrone.g:2270:1: ( ')' )
            // InternalXDrone.g:2271:2: ')'
            {
             before(grammarAccess.getVectorAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__6__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalXDrone.g:2281:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2285:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalXDrone.g:2286:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

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
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalXDrone.g:2293:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2297:1: ( ( 'color' ) )
            // InternalXDrone.g:2298:1: ( 'color' )
            {
            // InternalXDrone.g:2298:1: ( 'color' )
            // InternalXDrone.g:2299:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalXDrone.g:2308:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2312:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalXDrone.g:2313:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

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
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalXDrone.g:2320:1: rule__Color__Group__1__Impl : ( '=' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2324:1: ( ( '=' ) )
            // InternalXDrone.g:2325:1: ( '=' )
            {
            // InternalXDrone.g:2325:1: ( '=' )
            // InternalXDrone.g:2326:2: '='
            {
             before(grammarAccess.getColorAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalXDrone.g:2335:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2339:1: ( rule__Color__Group__2__Impl )
            // InternalXDrone.g:2340:2: rule__Color__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__2__Impl();

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
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalXDrone.g:2346:1: rule__Color__Group__2__Impl : ( ( rule__Color__Color_valueAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2350:1: ( ( ( rule__Color__Color_valueAssignment_2 ) ) )
            // InternalXDrone.g:2351:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            {
            // InternalXDrone.g:2351:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            // InternalXDrone.g:2352:2: ( rule__Color__Color_valueAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 
            // InternalXDrone.g:2353:2: ( rule__Color__Color_valueAssignment_2 )
            // InternalXDrone.g:2353:3: rule__Color__Color_valueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Color__Color_valueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Walls__Group_0__0"
    // InternalXDrone.g:2362:1: rule__Walls__Group_0__0 : rule__Walls__Group_0__0__Impl rule__Walls__Group_0__1 ;
    public final void rule__Walls__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2366:1: ( rule__Walls__Group_0__0__Impl rule__Walls__Group_0__1 )
            // InternalXDrone.g:2367:2: rule__Walls__Group_0__0__Impl rule__Walls__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Walls__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group_0__1();

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
    // $ANTLR end "rule__Walls__Group_0__0"


    // $ANTLR start "rule__Walls__Group_0__0__Impl"
    // InternalXDrone.g:2374:1: rule__Walls__Group_0__0__Impl : ( 'WALLS' ) ;
    public final void rule__Walls__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2378:1: ( ( 'WALLS' ) )
            // InternalXDrone.g:2379:1: ( 'WALLS' )
            {
            // InternalXDrone.g:2379:1: ( 'WALLS' )
            // InternalXDrone.g:2380:2: 'WALLS'
            {
             before(grammarAccess.getWallsAccess().getWALLSKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getWALLSKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group_0__0__Impl"


    // $ANTLR start "rule__Walls__Group_0__1"
    // InternalXDrone.g:2389:1: rule__Walls__Group_0__1 : rule__Walls__Group_0__1__Impl rule__Walls__Group_0__2 ;
    public final void rule__Walls__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2393:1: ( rule__Walls__Group_0__1__Impl rule__Walls__Group_0__2 )
            // InternalXDrone.g:2394:2: rule__Walls__Group_0__1__Impl rule__Walls__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__Walls__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group_0__2();

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
    // $ANTLR end "rule__Walls__Group_0__1"


    // $ANTLR start "rule__Walls__Group_0__1__Impl"
    // InternalXDrone.g:2401:1: rule__Walls__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Walls__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2405:1: ( ( '{' ) )
            // InternalXDrone.g:2406:1: ( '{' )
            {
            // InternalXDrone.g:2406:1: ( '{' )
            // InternalXDrone.g:2407:2: '{'
            {
             before(grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group_0__1__Impl"


    // $ANTLR start "rule__Walls__Group_0__2"
    // InternalXDrone.g:2416:1: rule__Walls__Group_0__2 : rule__Walls__Group_0__2__Impl ;
    public final void rule__Walls__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2420:1: ( rule__Walls__Group_0__2__Impl )
            // InternalXDrone.g:2421:2: rule__Walls__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Walls__Group_0__2__Impl();

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
    // $ANTLR end "rule__Walls__Group_0__2"


    // $ANTLR start "rule__Walls__Group_0__2__Impl"
    // InternalXDrone.g:2427:1: rule__Walls__Group_0__2__Impl : ( ( rule__Walls__FrontAssignment_0_2 ) ) ;
    public final void rule__Walls__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2431:1: ( ( ( rule__Walls__FrontAssignment_0_2 ) ) )
            // InternalXDrone.g:2432:1: ( ( rule__Walls__FrontAssignment_0_2 ) )
            {
            // InternalXDrone.g:2432:1: ( ( rule__Walls__FrontAssignment_0_2 ) )
            // InternalXDrone.g:2433:2: ( rule__Walls__FrontAssignment_0_2 )
            {
             before(grammarAccess.getWallsAccess().getFrontAssignment_0_2()); 
            // InternalXDrone.g:2434:2: ( rule__Walls__FrontAssignment_0_2 )
            // InternalXDrone.g:2434:3: rule__Walls__FrontAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Walls__FrontAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getFrontAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group_0__2__Impl"


    // $ANTLR start "rule__Walls__Group_4__0"
    // InternalXDrone.g:2443:1: rule__Walls__Group_4__0 : rule__Walls__Group_4__0__Impl rule__Walls__Group_4__1 ;
    public final void rule__Walls__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2447:1: ( rule__Walls__Group_4__0__Impl rule__Walls__Group_4__1 )
            // InternalXDrone.g:2448:2: rule__Walls__Group_4__0__Impl rule__Walls__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Walls__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group_4__1();

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
    // $ANTLR end "rule__Walls__Group_4__0"


    // $ANTLR start "rule__Walls__Group_4__0__Impl"
    // InternalXDrone.g:2455:1: rule__Walls__Group_4__0__Impl : ( ( rule__Walls__UpAssignment_4_0 ) ) ;
    public final void rule__Walls__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2459:1: ( ( ( rule__Walls__UpAssignment_4_0 ) ) )
            // InternalXDrone.g:2460:1: ( ( rule__Walls__UpAssignment_4_0 ) )
            {
            // InternalXDrone.g:2460:1: ( ( rule__Walls__UpAssignment_4_0 ) )
            // InternalXDrone.g:2461:2: ( rule__Walls__UpAssignment_4_0 )
            {
             before(grammarAccess.getWallsAccess().getUpAssignment_4_0()); 
            // InternalXDrone.g:2462:2: ( rule__Walls__UpAssignment_4_0 )
            // InternalXDrone.g:2462:3: rule__Walls__UpAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Walls__UpAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getUpAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group_4__0__Impl"


    // $ANTLR start "rule__Walls__Group_4__1"
    // InternalXDrone.g:2470:1: rule__Walls__Group_4__1 : rule__Walls__Group_4__1__Impl ;
    public final void rule__Walls__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2474:1: ( rule__Walls__Group_4__1__Impl )
            // InternalXDrone.g:2475:2: rule__Walls__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Walls__Group_4__1__Impl();

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
    // $ANTLR end "rule__Walls__Group_4__1"


    // $ANTLR start "rule__Walls__Group_4__1__Impl"
    // InternalXDrone.g:2481:1: rule__Walls__Group_4__1__Impl : ( '}' ) ;
    public final void rule__Walls__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2485:1: ( ( '}' ) )
            // InternalXDrone.g:2486:1: ( '}' )
            {
            // InternalXDrone.g:2486:1: ( '}' )
            // InternalXDrone.g:2487:2: '}'
            {
             before(grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_4_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group_4__1__Impl"


    // $ANTLR start "rule__Front__Group__0"
    // InternalXDrone.g:2497:1: rule__Front__Group__0 : rule__Front__Group__0__Impl rule__Front__Group__1 ;
    public final void rule__Front__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2501:1: ( rule__Front__Group__0__Impl rule__Front__Group__1 )
            // InternalXDrone.g:2502:2: rule__Front__Group__0__Impl rule__Front__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Front__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Front__Group__1();

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
    // $ANTLR end "rule__Front__Group__0"


    // $ANTLR start "rule__Front__Group__0__Impl"
    // InternalXDrone.g:2509:1: rule__Front__Group__0__Impl : ( 'front' ) ;
    public final void rule__Front__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2513:1: ( ( 'front' ) )
            // InternalXDrone.g:2514:1: ( 'front' )
            {
            // InternalXDrone.g:2514:1: ( 'front' )
            // InternalXDrone.g:2515:2: 'front'
            {
             before(grammarAccess.getFrontAccess().getFrontKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFrontAccess().getFrontKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Front__Group__0__Impl"


    // $ANTLR start "rule__Front__Group__1"
    // InternalXDrone.g:2524:1: rule__Front__Group__1 : rule__Front__Group__1__Impl rule__Front__Group__2 ;
    public final void rule__Front__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2528:1: ( rule__Front__Group__1__Impl rule__Front__Group__2 )
            // InternalXDrone.g:2529:2: rule__Front__Group__1__Impl rule__Front__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Front__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Front__Group__2();

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
    // $ANTLR end "rule__Front__Group__1"


    // $ANTLR start "rule__Front__Group__1__Impl"
    // InternalXDrone.g:2536:1: rule__Front__Group__1__Impl : ( '=' ) ;
    public final void rule__Front__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2540:1: ( ( '=' ) )
            // InternalXDrone.g:2541:1: ( '=' )
            {
            // InternalXDrone.g:2541:1: ( '=' )
            // InternalXDrone.g:2542:2: '='
            {
             before(grammarAccess.getFrontAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFrontAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Front__Group__1__Impl"


    // $ANTLR start "rule__Front__Group__2"
    // InternalXDrone.g:2551:1: rule__Front__Group__2 : rule__Front__Group__2__Impl ;
    public final void rule__Front__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2555:1: ( rule__Front__Group__2__Impl )
            // InternalXDrone.g:2556:2: rule__Front__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Front__Group__2__Impl();

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
    // $ANTLR end "rule__Front__Group__2"


    // $ANTLR start "rule__Front__Group__2__Impl"
    // InternalXDrone.g:2562:1: rule__Front__Group__2__Impl : ( ( rule__Front__ValueAssignment_2 ) ) ;
    public final void rule__Front__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2566:1: ( ( ( rule__Front__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2567:1: ( ( rule__Front__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2567:1: ( ( rule__Front__ValueAssignment_2 ) )
            // InternalXDrone.g:2568:2: ( rule__Front__ValueAssignment_2 )
            {
             before(grammarAccess.getFrontAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2569:2: ( rule__Front__ValueAssignment_2 )
            // InternalXDrone.g:2569:3: rule__Front__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Front__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFrontAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Front__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalXDrone.g:2578:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2582:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:2583:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:2590:1: rule__Right__Group__0__Impl : ( 'right' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2594:1: ( ( 'right' ) )
            // InternalXDrone.g:2595:1: ( 'right' )
            {
            // InternalXDrone.g:2595:1: ( 'right' )
            // InternalXDrone.g:2596:2: 'right'
            {
             before(grammarAccess.getRightAccess().getRightKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRightKeyword_0()); 

            }


            }

        }
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
    // InternalXDrone.g:2605:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2609:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:2610:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXDrone.g:2617:1: rule__Right__Group__1__Impl : ( '=' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2621:1: ( ( '=' ) )
            // InternalXDrone.g:2622:1: ( '=' )
            {
            // InternalXDrone.g:2622:1: ( '=' )
            // InternalXDrone.g:2623:2: '='
            {
             before(grammarAccess.getRightAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalXDrone.g:2632:1: rule__Right__Group__2 : rule__Right__Group__2__Impl ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2636:1: ( rule__Right__Group__2__Impl )
            // InternalXDrone.g:2637:2: rule__Right__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__2__Impl();

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
    // InternalXDrone.g:2643:1: rule__Right__Group__2__Impl : ( ( rule__Right__ValueAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2647:1: ( ( ( rule__Right__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2648:1: ( ( rule__Right__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2648:1: ( ( rule__Right__ValueAssignment_2 ) )
            // InternalXDrone.g:2649:2: ( rule__Right__ValueAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2650:2: ( rule__Right__ValueAssignment_2 )
            // InternalXDrone.g:2650:3: rule__Right__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Right__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Left__Group__0"
    // InternalXDrone.g:2659:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2663:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:2664:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:2671:1: rule__Left__Group__0__Impl : ( 'left' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2675:1: ( ( 'left' ) )
            // InternalXDrone.g:2676:1: ( 'left' )
            {
            // InternalXDrone.g:2676:1: ( 'left' )
            // InternalXDrone.g:2677:2: 'left'
            {
             before(grammarAccess.getLeftAccess().getLeftKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLeftKeyword_0()); 

            }


            }

        }
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
    // InternalXDrone.g:2686:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2690:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:2691:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXDrone.g:2698:1: rule__Left__Group__1__Impl : ( '=' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2702:1: ( ( '=' ) )
            // InternalXDrone.g:2703:1: ( '=' )
            {
            // InternalXDrone.g:2703:1: ( '=' )
            // InternalXDrone.g:2704:2: '='
            {
             before(grammarAccess.getLeftAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalXDrone.g:2713:1: rule__Left__Group__2 : rule__Left__Group__2__Impl ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2717:1: ( rule__Left__Group__2__Impl )
            // InternalXDrone.g:2718:2: rule__Left__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__2__Impl();

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
    // InternalXDrone.g:2724:1: rule__Left__Group__2__Impl : ( ( rule__Left__ValueAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2728:1: ( ( ( rule__Left__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2729:1: ( ( rule__Left__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2729:1: ( ( rule__Left__ValueAssignment_2 ) )
            // InternalXDrone.g:2730:2: ( rule__Left__ValueAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2731:2: ( rule__Left__ValueAssignment_2 )
            // InternalXDrone.g:2731:3: rule__Left__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Left__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Back__Group__0"
    // InternalXDrone.g:2740:1: rule__Back__Group__0 : rule__Back__Group__0__Impl rule__Back__Group__1 ;
    public final void rule__Back__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2744:1: ( rule__Back__Group__0__Impl rule__Back__Group__1 )
            // InternalXDrone.g:2745:2: rule__Back__Group__0__Impl rule__Back__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Back__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Back__Group__1();

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
    // $ANTLR end "rule__Back__Group__0"


    // $ANTLR start "rule__Back__Group__0__Impl"
    // InternalXDrone.g:2752:1: rule__Back__Group__0__Impl : ( 'back' ) ;
    public final void rule__Back__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2756:1: ( ( 'back' ) )
            // InternalXDrone.g:2757:1: ( 'back' )
            {
            // InternalXDrone.g:2757:1: ( 'back' )
            // InternalXDrone.g:2758:2: 'back'
            {
             before(grammarAccess.getBackAccess().getBackKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBackAccess().getBackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__Group__0__Impl"


    // $ANTLR start "rule__Back__Group__1"
    // InternalXDrone.g:2767:1: rule__Back__Group__1 : rule__Back__Group__1__Impl rule__Back__Group__2 ;
    public final void rule__Back__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2771:1: ( rule__Back__Group__1__Impl rule__Back__Group__2 )
            // InternalXDrone.g:2772:2: rule__Back__Group__1__Impl rule__Back__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Back__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Back__Group__2();

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
    // $ANTLR end "rule__Back__Group__1"


    // $ANTLR start "rule__Back__Group__1__Impl"
    // InternalXDrone.g:2779:1: rule__Back__Group__1__Impl : ( '=' ) ;
    public final void rule__Back__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2783:1: ( ( '=' ) )
            // InternalXDrone.g:2784:1: ( '=' )
            {
            // InternalXDrone.g:2784:1: ( '=' )
            // InternalXDrone.g:2785:2: '='
            {
             before(grammarAccess.getBackAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBackAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__Group__1__Impl"


    // $ANTLR start "rule__Back__Group__2"
    // InternalXDrone.g:2794:1: rule__Back__Group__2 : rule__Back__Group__2__Impl ;
    public final void rule__Back__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2798:1: ( rule__Back__Group__2__Impl )
            // InternalXDrone.g:2799:2: rule__Back__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Back__Group__2__Impl();

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
    // $ANTLR end "rule__Back__Group__2"


    // $ANTLR start "rule__Back__Group__2__Impl"
    // InternalXDrone.g:2805:1: rule__Back__Group__2__Impl : ( ( rule__Back__ValueAssignment_2 ) ) ;
    public final void rule__Back__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2809:1: ( ( ( rule__Back__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2810:1: ( ( rule__Back__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2810:1: ( ( rule__Back__ValueAssignment_2 ) )
            // InternalXDrone.g:2811:2: ( rule__Back__ValueAssignment_2 )
            {
             before(grammarAccess.getBackAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2812:2: ( rule__Back__ValueAssignment_2 )
            // InternalXDrone.g:2812:3: rule__Back__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Back__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__Group__2__Impl"


    // $ANTLR start "rule__Up__Group__0"
    // InternalXDrone.g:2821:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2825:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:2826:2: rule__Up__Group__0__Impl rule__Up__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:2833:1: rule__Up__Group__0__Impl : ( 'up' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2837:1: ( ( 'up' ) )
            // InternalXDrone.g:2838:1: ( 'up' )
            {
            // InternalXDrone.g:2838:1: ( 'up' )
            // InternalXDrone.g:2839:2: 'up'
            {
             before(grammarAccess.getUpAccess().getUpKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getUpKeyword_0()); 

            }


            }

        }
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
    // InternalXDrone.g:2848:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2852:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:2853:2: rule__Up__Group__1__Impl rule__Up__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXDrone.g:2860:1: rule__Up__Group__1__Impl : ( '=' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2864:1: ( ( '=' ) )
            // InternalXDrone.g:2865:1: ( '=' )
            {
            // InternalXDrone.g:2865:1: ( '=' )
            // InternalXDrone.g:2866:2: '='
            {
             before(grammarAccess.getUpAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalXDrone.g:2875:1: rule__Up__Group__2 : rule__Up__Group__2__Impl ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2879:1: ( rule__Up__Group__2__Impl )
            // InternalXDrone.g:2880:2: rule__Up__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Up__Group__2__Impl();

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
    // InternalXDrone.g:2886:1: rule__Up__Group__2__Impl : ( ( rule__Up__ValueAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2890:1: ( ( ( rule__Up__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2891:1: ( ( rule__Up__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2891:1: ( ( rule__Up__ValueAssignment_2 ) )
            // InternalXDrone.g:2892:2: ( rule__Up__ValueAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2893:2: ( rule__Up__ValueAssignment_2 )
            // InternalXDrone.g:2893:3: rule__Up__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Up__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Object__UnorderedGroup"
    // InternalXDrone.g:2902:1: rule__Object__UnorderedGroup : rule__Object__UnorderedGroup__0 {...}?;
    public final void rule__Object__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup());
        	
        try {
            // InternalXDrone.g:2907:1: ( rule__Object__UnorderedGroup__0 {...}?)
            // InternalXDrone.g:2908:2: rule__Object__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Object__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Object__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getObjectAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup"


    // $ANTLR start "rule__Object__UnorderedGroup__Impl"
    // InternalXDrone.g:2916:1: rule__Object__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) ;
    public final void rule__Object__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXDrone.g:2921:1: ( ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) )
            // InternalXDrone.g:2922:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            {
            // InternalXDrone.g:2922:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                alt10=2;
            }
            else if ( ( LA10_0 == 14 || LA10_0 == 31 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXDrone.g:2923:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    {
                    // InternalXDrone.g:2923:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    // InternalXDrone.g:2924:4: {...}? => ( ( ( rule__Object__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalXDrone.g:2924:100: ( ( ( rule__Object__Group_0__0 ) ) )
                    // InternalXDrone.g:2925:5: ( ( rule__Object__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:2931:5: ( ( rule__Object__Group_0__0 ) )
                    // InternalXDrone.g:2932:6: ( rule__Object__Group_0__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_0()); 
                    // InternalXDrone.g:2933:6: ( rule__Object__Group_0__0 )
                    // InternalXDrone.g:2933:7: rule__Object__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:2938:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    {
                    // InternalXDrone.g:2938:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    // InternalXDrone.g:2939:4: {...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalXDrone.g:2939:100: ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    // InternalXDrone.g:2940:5: ( ( rule__Object__SizeAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:2946:5: ( ( rule__Object__SizeAssignment_1 ) )
                    // InternalXDrone.g:2947:6: ( rule__Object__SizeAssignment_1 )
                    {
                     before(grammarAccess.getObjectAccess().getSizeAssignment_1()); 
                    // InternalXDrone.g:2948:6: ( rule__Object__SizeAssignment_1 )
                    // InternalXDrone.g:2948:7: rule__Object__SizeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__SizeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getSizeAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:2953:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    {
                    // InternalXDrone.g:2953:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    // InternalXDrone.g:2954:4: {...}? => ( ( ( rule__Object__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalXDrone.g:2954:100: ( ( ( rule__Object__Group_2__0 ) ) )
                    // InternalXDrone.g:2955:5: ( ( rule__Object__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:2961:5: ( ( rule__Object__Group_2__0 ) )
                    // InternalXDrone.g:2962:6: ( rule__Object__Group_2__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_2()); 
                    // InternalXDrone.g:2963:6: ( rule__Object__Group_2__0 )
                    // InternalXDrone.g:2963:7: rule__Object__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup__Impl"


    // $ANTLR start "rule__Object__UnorderedGroup__0"
    // InternalXDrone.g:2976:1: rule__Object__UnorderedGroup__0 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? ;
    public final void rule__Object__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2980:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? )
            // InternalXDrone.g:2981:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:2982:2: ( rule__Object__UnorderedGroup__1 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalXDrone.g:2982:2: rule__Object__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup__0"


    // $ANTLR start "rule__Object__UnorderedGroup__1"
    // InternalXDrone.g:2988:1: rule__Object__UnorderedGroup__1 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? ;
    public final void rule__Object__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2992:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? )
            // InternalXDrone.g:2993:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:2994:2: ( rule__Object__UnorderedGroup__2 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalXDrone.g:2994:2: rule__Object__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__UnorderedGroup__1"


    // $ANTLR start "rule__Object__UnorderedGroup__2"
    // InternalXDrone.g:3000:1: rule__Object__UnorderedGroup__2 : rule__Object__UnorderedGroup__Impl ;
    public final void rule__Object__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3004:1: ( rule__Object__UnorderedGroup__Impl )
            // InternalXDrone.g:3005:2: rule__Object__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Object__UnorderedGroup__2"


    // $ANTLR start "rule__Walls__UnorderedGroup"
    // InternalXDrone.g:3012:1: rule__Walls__UnorderedGroup : rule__Walls__UnorderedGroup__0 {...}?;
    public final void rule__Walls__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getWallsAccess().getUnorderedGroup());
        	
        try {
            // InternalXDrone.g:3017:1: ( rule__Walls__UnorderedGroup__0 {...}?)
            // InternalXDrone.g:3018:2: rule__Walls__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Walls__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getWallsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UnorderedGroup"


    // $ANTLR start "rule__Walls__UnorderedGroup__Impl"
    // InternalXDrone.g:3026:1: rule__Walls__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) ) ;
    public final void rule__Walls__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXDrone.g:3031:1: ( ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) ) )
            // InternalXDrone.g:3032:3: ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) )
            {
            // InternalXDrone.g:3032:3: ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) )
            int alt13=5;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {
                alt13=2;
            }
            else if ( LA13_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {
                alt13=3;
            }
            else if ( LA13_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {
                alt13=4;
            }
            else if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {
                alt13=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXDrone.g:3033:3: ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) )
                    {
                    // InternalXDrone.g:3033:3: ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) )
                    // InternalXDrone.g:3034:4: {...}? => ( ( ( rule__Walls__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalXDrone.g:3034:99: ( ( ( rule__Walls__Group_0__0 ) ) )
                    // InternalXDrone.g:3035:5: ( ( rule__Walls__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3041:5: ( ( rule__Walls__Group_0__0 ) )
                    // InternalXDrone.g:3042:6: ( rule__Walls__Group_0__0 )
                    {
                     before(grammarAccess.getWallsAccess().getGroup_0()); 
                    // InternalXDrone.g:3043:6: ( rule__Walls__Group_0__0 )
                    // InternalXDrone.g:3043:7: rule__Walls__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:3048:3: ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) )
                    {
                    // InternalXDrone.g:3048:3: ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) )
                    // InternalXDrone.g:3049:4: {...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalXDrone.g:3049:99: ( ( ( rule__Walls__RightAssignment_1 ) ) )
                    // InternalXDrone.g:3050:5: ( ( rule__Walls__RightAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3056:5: ( ( rule__Walls__RightAssignment_1 ) )
                    // InternalXDrone.g:3057:6: ( rule__Walls__RightAssignment_1 )
                    {
                     before(grammarAccess.getWallsAccess().getRightAssignment_1()); 
                    // InternalXDrone.g:3058:6: ( rule__Walls__RightAssignment_1 )
                    // InternalXDrone.g:3058:7: rule__Walls__RightAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__RightAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getRightAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:3063:3: ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) )
                    {
                    // InternalXDrone.g:3063:3: ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) )
                    // InternalXDrone.g:3064:4: {...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalXDrone.g:3064:99: ( ( ( rule__Walls__BackAssignment_2 ) ) )
                    // InternalXDrone.g:3065:5: ( ( rule__Walls__BackAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3071:5: ( ( rule__Walls__BackAssignment_2 ) )
                    // InternalXDrone.g:3072:6: ( rule__Walls__BackAssignment_2 )
                    {
                     before(grammarAccess.getWallsAccess().getBackAssignment_2()); 
                    // InternalXDrone.g:3073:6: ( rule__Walls__BackAssignment_2 )
                    // InternalXDrone.g:3073:7: rule__Walls__BackAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__BackAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getBackAssignment_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:3078:3: ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) )
                    {
                    // InternalXDrone.g:3078:3: ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) )
                    // InternalXDrone.g:3079:4: {...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalXDrone.g:3079:99: ( ( ( rule__Walls__LeftAssignment_3 ) ) )
                    // InternalXDrone.g:3080:5: ( ( rule__Walls__LeftAssignment_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3086:5: ( ( rule__Walls__LeftAssignment_3 ) )
                    // InternalXDrone.g:3087:6: ( rule__Walls__LeftAssignment_3 )
                    {
                     before(grammarAccess.getWallsAccess().getLeftAssignment_3()); 
                    // InternalXDrone.g:3088:6: ( rule__Walls__LeftAssignment_3 )
                    // InternalXDrone.g:3088:7: rule__Walls__LeftAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__LeftAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getLeftAssignment_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalXDrone.g:3093:3: ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) )
                    {
                    // InternalXDrone.g:3093:3: ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) )
                    // InternalXDrone.g:3094:4: {...}? => ( ( ( rule__Walls__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalXDrone.g:3094:99: ( ( ( rule__Walls__Group_4__0 ) ) )
                    // InternalXDrone.g:3095:5: ( ( rule__Walls__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3101:5: ( ( rule__Walls__Group_4__0 ) )
                    // InternalXDrone.g:3102:6: ( rule__Walls__Group_4__0 )
                    {
                     before(grammarAccess.getWallsAccess().getGroup_4()); 
                    // InternalXDrone.g:3103:6: ( rule__Walls__Group_4__0 )
                    // InternalXDrone.g:3103:7: rule__Walls__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWallsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UnorderedGroup__Impl"


    // $ANTLR start "rule__Walls__UnorderedGroup__0"
    // InternalXDrone.g:3116:1: rule__Walls__UnorderedGroup__0 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__1 )? ;
    public final void rule__Walls__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3120:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__1 )? )
            // InternalXDrone.g:3121:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_22);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3122:2: ( rule__Walls__UnorderedGroup__1 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalXDrone.g:3122:2: rule__Walls__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UnorderedGroup__0"


    // $ANTLR start "rule__Walls__UnorderedGroup__1"
    // InternalXDrone.g:3128:1: rule__Walls__UnorderedGroup__1 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__2 )? ;
    public final void rule__Walls__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3132:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__2 )? )
            // InternalXDrone.g:3133:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_22);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3134:2: ( rule__Walls__UnorderedGroup__2 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalXDrone.g:3134:2: rule__Walls__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UnorderedGroup__1"


    // $ANTLR start "rule__Walls__UnorderedGroup__2"
    // InternalXDrone.g:3140:1: rule__Walls__UnorderedGroup__2 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__3 )? ;
    public final void rule__Walls__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3144:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__3 )? )
            // InternalXDrone.g:3145:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_22);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3146:2: ( rule__Walls__UnorderedGroup__3 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalXDrone.g:3146:2: rule__Walls__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UnorderedGroup__2"


    // $ANTLR start "rule__Walls__UnorderedGroup__3"
    // InternalXDrone.g:3152:1: rule__Walls__UnorderedGroup__3 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__4 )? ;
    public final void rule__Walls__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3156:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__4 )? )
            // InternalXDrone.g:3157:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_22);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3158:2: ( rule__Walls__UnorderedGroup__4 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalXDrone.g:3158:2: rule__Walls__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UnorderedGroup__3"


    // $ANTLR start "rule__Walls__UnorderedGroup__4"
    // InternalXDrone.g:3164:1: rule__Walls__UnorderedGroup__4 : rule__Walls__UnorderedGroup__Impl ;
    public final void rule__Walls__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3168:1: ( rule__Walls__UnorderedGroup__Impl )
            // InternalXDrone.g:3169:2: rule__Walls__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Walls__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Walls__UnorderedGroup__4"


    // $ANTLR start "rule__Program__MainAssignment"
    // InternalXDrone.g:3176:1: rule__Program__MainAssignment : ( ruleMain ) ;
    public final void rule__Program__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3180:1: ( ( ruleMain ) )
            // InternalXDrone.g:3181:2: ( ruleMain )
            {
            // InternalXDrone.g:3181:2: ( ruleMain )
            // InternalXDrone.g:3182:3: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MainAssignment"


    // $ANTLR start "rule__Main__FlyAssignment_0"
    // InternalXDrone.g:3191:1: rule__Main__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Main__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3195:1: ( ( ruleFly ) )
            // InternalXDrone.g:3196:2: ( ruleFly )
            {
            // InternalXDrone.g:3196:2: ( ruleFly )
            // InternalXDrone.g:3197:3: ruleFly
            {
             before(grammarAccess.getMainAccess().getFlyFlyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFly();

            state._fsp--;

             after(grammarAccess.getMainAccess().getFlyFlyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__FlyAssignment_0"


    // $ANTLR start "rule__Main__EnvironmentAssignment_1"
    // InternalXDrone.g:3206:1: rule__Main__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Main__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3210:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:3211:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:3211:2: ( ruleEnvironment )
            // InternalXDrone.g:3212:3: ruleEnvironment
            {
             before(grammarAccess.getMainAccess().getEnvironmentEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getMainAccess().getEnvironmentEnvironmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__EnvironmentAssignment_1"


    // $ANTLR start "rule__Fly__TakeoffAssignment_1_0"
    // InternalXDrone.g:3221:1: rule__Fly__TakeoffAssignment_1_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3225:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:3226:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:3226:2: ( ruleTakeoff )
            // InternalXDrone.g:3227:3: ruleTakeoff
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
    // InternalXDrone.g:3236:1: rule__Fly__CommandsAssignment_1_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3240:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:3241:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:3241:2: ( ruleSuperCommand )
            // InternalXDrone.g:3242:3: ruleSuperCommand
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
    // InternalXDrone.g:3251:1: rule__Fly__LandAssignment_1_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3255:1: ( ( ruleLand ) )
            // InternalXDrone.g:3256:2: ( ruleLand )
            {
            // InternalXDrone.g:3256:2: ( ruleLand )
            // InternalXDrone.g:3257:3: ruleLand
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


    // $ANTLR start "rule__Environment__DroneAssignment_2_0"
    // InternalXDrone.g:3266:1: rule__Environment__DroneAssignment_2_0 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3270:1: ( ( ruleDrone ) )
            // InternalXDrone.g:3271:2: ( ruleDrone )
            {
            // InternalXDrone.g:3271:2: ( ruleDrone )
            // InternalXDrone.g:3272:3: ruleDrone
            {
             before(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__DroneAssignment_2_0"


    // $ANTLR start "rule__Environment__WallsAssignment_2_1"
    // InternalXDrone.g:3281:1: rule__Environment__WallsAssignment_2_1 : ( ruleWalls ) ;
    public final void rule__Environment__WallsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3285:1: ( ( ruleWalls ) )
            // InternalXDrone.g:3286:2: ( ruleWalls )
            {
            // InternalXDrone.g:3286:2: ( ruleWalls )
            // InternalXDrone.g:3287:3: ruleWalls
            {
             before(grammarAccess.getEnvironmentAccess().getWallsWallsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWalls();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getWallsWallsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__WallsAssignment_2_1"


    // $ANTLR start "rule__Environment__ObjectsAssignment_2_2"
    // InternalXDrone.g:3296:1: rule__Environment__ObjectsAssignment_2_2 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3300:1: ( ( ruleObject ) )
            // InternalXDrone.g:3301:2: ( ruleObject )
            {
            // InternalXDrone.g:3301:2: ( ruleObject )
            // InternalXDrone.g:3302:3: ruleObject
            {
             before(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ObjectsAssignment_2_2"


    // $ANTLR start "rule__FlyTo__Object_nameAssignment_2"
    // InternalXDrone.g:3311:1: rule__FlyTo__Object_nameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FlyTo__Object_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3315:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:3316:2: ( RULE_STRING )
            {
            // InternalXDrone.g:3316:2: ( RULE_STRING )
            // InternalXDrone.g:3317:3: RULE_STRING
            {
             before(grammarAccess.getFlyToAccess().getObject_nameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFlyToAccess().getObject_nameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlyTo__Object_nameAssignment_2"


    // $ANTLR start "rule__Move__VectorAssignment_1"
    // InternalXDrone.g:3326:1: rule__Move__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Move__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3330:1: ( ( ruleVector ) )
            // InternalXDrone.g:3331:2: ( ruleVector )
            {
            // InternalXDrone.g:3331:2: ( ruleVector )
            // InternalXDrone.g:3332:3: ruleVector
            {
             before(grammarAccess.getMoveAccess().getVectorVectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getVectorVectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__VectorAssignment_1"


    // $ANTLR start "rule__Rotate__AngleAssignment_2"
    // InternalXDrone.g:3341:1: rule__Rotate__AngleAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Rotate__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3345:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3346:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3346:2: ( ruleDOUBLE )
            // InternalXDrone.g:3347:3: ruleDOUBLE
            {
             before(grammarAccess.getRotateAccess().getAngleDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getRotateAccess().getAngleDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotate__AngleAssignment_2"


    // $ANTLR start "rule__Wait__SecondsAssignment_2"
    // InternalXDrone.g:3356:1: rule__Wait__SecondsAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3360:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3361:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3361:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3362:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalXDrone.g:3371:1: rule__FunctionName__Func_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionName__Func_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3375:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3376:2: ( RULE_ID )
            {
            // InternalXDrone.g:3376:2: ( RULE_ID )
            // InternalXDrone.g:3377:3: RULE_ID
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


    // $ANTLR start "rule__Drone__VectorAssignment_1"
    // InternalXDrone.g:3386:1: rule__Drone__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Drone__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3390:1: ( ( ruleVector ) )
            // InternalXDrone.g:3391:2: ( ruleVector )
            {
            // InternalXDrone.g:3391:2: ( ruleVector )
            // InternalXDrone.g:3392:3: ruleVector
            {
             before(grammarAccess.getDroneAccess().getVectorVectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getVectorVectorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__VectorAssignment_1"


    // $ANTLR start "rule__Object__Object_nameAssignment_0_0"
    // InternalXDrone.g:3401:1: rule__Object__Object_nameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3405:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3406:2: ( RULE_ID )
            {
            // InternalXDrone.g:3406:2: ( RULE_ID )
            // InternalXDrone.g:3407:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Object_nameAssignment_0_0"


    // $ANTLR start "rule__Object__OriginAssignment_0_2"
    // InternalXDrone.g:3416:1: rule__Object__OriginAssignment_0_2 : ( ruleOrigin ) ;
    public final void rule__Object__OriginAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3420:1: ( ( ruleOrigin ) )
            // InternalXDrone.g:3421:2: ( ruleOrigin )
            {
            // InternalXDrone.g:3421:2: ( ruleOrigin )
            // InternalXDrone.g:3422:3: ruleOrigin
            {
             before(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__OriginAssignment_0_2"


    // $ANTLR start "rule__Object__SizeAssignment_1"
    // InternalXDrone.g:3431:1: rule__Object__SizeAssignment_1 : ( ruleSize ) ;
    public final void rule__Object__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3435:1: ( ( ruleSize ) )
            // InternalXDrone.g:3436:2: ( ruleSize )
            {
            // InternalXDrone.g:3436:2: ( ruleSize )
            // InternalXDrone.g:3437:3: ruleSize
            {
             before(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__SizeAssignment_1"


    // $ANTLR start "rule__Object__ColorAssignment_2_0"
    // InternalXDrone.g:3446:1: rule__Object__ColorAssignment_2_0 : ( ruleColor ) ;
    public final void rule__Object__ColorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3450:1: ( ( ruleColor ) )
            // InternalXDrone.g:3451:2: ( ruleColor )
            {
            // InternalXDrone.g:3451:2: ( ruleColor )
            // InternalXDrone.g:3452:3: ruleColor
            {
             before(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ColorAssignment_2_0"


    // $ANTLR start "rule__Origin__VectorAssignment_2"
    // InternalXDrone.g:3461:1: rule__Origin__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Origin__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3465:1: ( ( ruleVector ) )
            // InternalXDrone.g:3466:2: ( ruleVector )
            {
            // InternalXDrone.g:3466:2: ( ruleVector )
            // InternalXDrone.g:3467:3: ruleVector
            {
             before(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__VectorAssignment_2"


    // $ANTLR start "rule__Size__VectorAssignment_2"
    // InternalXDrone.g:3476:1: rule__Size__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Size__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3480:1: ( ( ruleVector ) )
            // InternalXDrone.g:3481:2: ( ruleVector )
            {
            // InternalXDrone.g:3481:2: ( ruleVector )
            // InternalXDrone.g:3482:3: ruleVector
            {
             before(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__VectorAssignment_2"


    // $ANTLR start "rule__Vector__XAssignment_1"
    // InternalXDrone.g:3491:1: rule__Vector__XAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Vector__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3495:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3496:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3496:2: ( ruleDOUBLE )
            // InternalXDrone.g:3497:3: ruleDOUBLE
            {
             before(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__XAssignment_1"


    // $ANTLR start "rule__Vector__YAssignment_3"
    // InternalXDrone.g:3506:1: rule__Vector__YAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Vector__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3510:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3511:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3511:2: ( ruleDOUBLE )
            // InternalXDrone.g:3512:3: ruleDOUBLE
            {
             before(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__YAssignment_3"


    // $ANTLR start "rule__Vector__ZAssignment_5"
    // InternalXDrone.g:3521:1: rule__Vector__ZAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Vector__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3525:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3526:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3526:2: ( ruleDOUBLE )
            // InternalXDrone.g:3527:3: ruleDOUBLE
            {
             before(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__ZAssignment_5"


    // $ANTLR start "rule__Color__Color_valueAssignment_2"
    // InternalXDrone.g:3536:1: rule__Color__Color_valueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__Color_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3540:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:3541:2: ( RULE_STRING )
            {
            // InternalXDrone.g:3541:2: ( RULE_STRING )
            // InternalXDrone.g:3542:3: RULE_STRING
            {
             before(grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Color_valueAssignment_2"


    // $ANTLR start "rule__Walls__FrontAssignment_0_2"
    // InternalXDrone.g:3551:1: rule__Walls__FrontAssignment_0_2 : ( ruleFront ) ;
    public final void rule__Walls__FrontAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3555:1: ( ( ruleFront ) )
            // InternalXDrone.g:3556:2: ( ruleFront )
            {
            // InternalXDrone.g:3556:2: ( ruleFront )
            // InternalXDrone.g:3557:3: ruleFront
            {
             before(grammarAccess.getWallsAccess().getFrontFrontParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFront();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getFrontFrontParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__FrontAssignment_0_2"


    // $ANTLR start "rule__Walls__RightAssignment_1"
    // InternalXDrone.g:3566:1: rule__Walls__RightAssignment_1 : ( ruleRight ) ;
    public final void rule__Walls__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3570:1: ( ( ruleRight ) )
            // InternalXDrone.g:3571:2: ( ruleRight )
            {
            // InternalXDrone.g:3571:2: ( ruleRight )
            // InternalXDrone.g:3572:3: ruleRight
            {
             before(grammarAccess.getWallsAccess().getRightRightParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getRightRightParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__RightAssignment_1"


    // $ANTLR start "rule__Walls__BackAssignment_2"
    // InternalXDrone.g:3581:1: rule__Walls__BackAssignment_2 : ( ruleBack ) ;
    public final void rule__Walls__BackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3585:1: ( ( ruleBack ) )
            // InternalXDrone.g:3586:2: ( ruleBack )
            {
            // InternalXDrone.g:3586:2: ( ruleBack )
            // InternalXDrone.g:3587:3: ruleBack
            {
             before(grammarAccess.getWallsAccess().getBackBackParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBack();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getBackBackParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__BackAssignment_2"


    // $ANTLR start "rule__Walls__LeftAssignment_3"
    // InternalXDrone.g:3596:1: rule__Walls__LeftAssignment_3 : ( ruleLeft ) ;
    public final void rule__Walls__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3600:1: ( ( ruleLeft ) )
            // InternalXDrone.g:3601:2: ( ruleLeft )
            {
            // InternalXDrone.g:3601:2: ( ruleLeft )
            // InternalXDrone.g:3602:3: ruleLeft
            {
             before(grammarAccess.getWallsAccess().getLeftLeftParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getLeftLeftParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__LeftAssignment_3"


    // $ANTLR start "rule__Walls__UpAssignment_4_0"
    // InternalXDrone.g:3611:1: rule__Walls__UpAssignment_4_0 : ( ruleUp ) ;
    public final void rule__Walls__UpAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3615:1: ( ( ruleUp ) )
            // InternalXDrone.g:3616:2: ( ruleUp )
            {
            // InternalXDrone.g:3616:2: ( ruleUp )
            // InternalXDrone.g:3617:3: ruleUp
            {
             before(grammarAccess.getWallsAccess().getUpUpParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUp();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getUpUpParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UpAssignment_4_0"


    // $ANTLR start "rule__Front__ValueAssignment_2"
    // InternalXDrone.g:3626:1: rule__Front__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Front__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3630:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3631:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3631:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3632:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getFrontAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getFrontAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Front__ValueAssignment_2"


    // $ANTLR start "rule__Right__ValueAssignment_2"
    // InternalXDrone.g:3641:1: rule__Right__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Right__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3645:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3646:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3646:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3647:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getRightAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getRightAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__ValueAssignment_2"


    // $ANTLR start "rule__Left__ValueAssignment_2"
    // InternalXDrone.g:3656:1: rule__Left__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Left__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3660:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3661:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3661:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3662:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getLeftAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__ValueAssignment_2"


    // $ANTLR start "rule__Back__ValueAssignment_2"
    // InternalXDrone.g:3671:1: rule__Back__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Back__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3675:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3676:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3676:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3677:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getBackAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getBackAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Back__ValueAssignment_2"


    // $ANTLR start "rule__Up__ValueAssignment_2"
    // InternalXDrone.g:3686:1: rule__Up__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Up__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3690:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3691:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3691:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3692:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getUpAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getUpAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__ValueAssignment_2"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\100\uffff";
    static final String dfa_2s = "\1\5\77\uffff";
    static final String dfa_3s = "\1\6\1\32\2\34\1\0\1\uffff\1\33\1\23\1\5\1\uffff\1\34\1\4\1\16\1\23\1\4\1\21\1\0\1\4\1\21\3\4\1\21\1\4\1\36\1\4\2\21\2\4\1\36\1\21\3\4\1\36\1\4\1\21\1\4\1\36\1\4\1\21\1\36\1\21\2\4\1\36\1\21\1\4\1\0\1\4\1\36\1\4\1\21\1\4\1\24\1\36\1\21\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_4s = "\1\45\1\32\2\34\1\0\1\uffff\1\33\1\23\1\5\1\uffff\1\34\1\20\1\16\1\23\1\4\1\36\1\0\1\20\1\36\1\4\1\20\1\4\1\36\1\4\1\36\1\4\2\36\1\4\1\20\2\36\1\4\1\20\1\4\1\36\1\4\1\36\1\4\1\36\1\4\1\24\2\36\1\4\1\20\1\36\1\24\1\4\1\0\1\4\1\36\1\4\1\24\1\4\1\24\1\36\1\24\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_5s = "\5\uffff\1\2\3\uffff\1\1\66\uffff";
    static final String dfa_6s = "\4\uffff\1\0\13\uffff\1\1\40\uffff\1\3\10\uffff\1\2\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\uffff\1\4\12\uffff\1\5\3\uffff\1\2\1\uffff\1\3\1\5\1\uffff\4\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\uffff",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15",
            "\1\17\13\uffff\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23\14\uffff\1\24",
            "\1\uffff",
            "\1\26\13\uffff\1\25",
            "\1\27\14\uffff\1\24",
            "\1\30",
            "\1\32\13\uffff\1\31",
            "\1\33",
            "\1\34\14\uffff\1\35",
            "\1\36",
            "\1\24",
            "\1\37",
            "\1\40\14\uffff\1\41",
            "\1\42\14\uffff\1\35",
            "\1\43",
            "\1\45\13\uffff\1\44",
            "\1\24",
            "\1\46\14\uffff\1\41",
            "\1\47",
            "\1\51\13\uffff\1\50",
            "\1\52",
            "\1\35",
            "\1\53",
            "\1\54\14\uffff\1\55",
            "\1\56",
            "\1\41",
            "\1\57",
            "\1\60\2\uffff\1\61",
            "\1\35",
            "\1\62\14\uffff\1\55",
            "\1\63",
            "\1\65\13\uffff\1\64",
            "\1\41",
            "\1\66\2\uffff\1\61",
            "\1\67",
            "\1\uffff",
            "\1\70",
            "\1\55",
            "\1\71",
            "\1\73\2\uffff\1\72",
            "\1\74",
            "\1\61",
            "\1\55",
            "\1\75\2\uffff\1\72",
            "\1\uffff",
            "\1\76",
            "\1\61",
            "\1\77",
            "\1\72",
            "\1\72"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2982:2: ( rule__Object__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_58 = input.LA(1);

                         
                        int index11_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_58);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_49 = input.LA(1);

                         
                        int index11_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_49);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\1\6\1\32\2\34\1\0\1\uffff\1\33\1\23\1\5\1\uffff\1\34\1\4\1\16\1\23\1\4\1\21\1\0\1\4\1\21\3\4\1\21\1\4\1\36\1\4\2\21\2\4\1\36\1\21\3\4\1\36\1\4\1\21\2\4\1\21\2\36\1\21\2\4\1\36\1\21\1\4\1\0\1\4\1\36\1\4\1\21\1\4\1\24\1\36\1\21\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_9s = "\1\45\1\32\2\34\1\0\1\uffff\1\33\1\23\1\5\1\uffff\1\34\1\20\1\16\1\23\1\4\1\36\1\0\1\20\1\36\1\4\1\20\1\4\1\36\1\4\1\36\1\4\2\36\1\4\1\20\2\36\1\20\2\4\1\36\1\4\1\36\2\4\1\24\3\36\1\4\1\20\1\36\1\24\1\4\1\0\1\4\1\36\1\4\1\24\1\4\1\24\1\36\1\24\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_10s = "\4\uffff\1\1\13\uffff\1\0\40\uffff\1\2\10\uffff\1\3\5\uffff}>";
    static final String[] dfa_11s = {
            "\1\1\7\uffff\1\4\12\uffff\1\5\3\uffff\1\2\1\uffff\1\3\1\5\1\uffff\4\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\uffff",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15",
            "\1\17\13\uffff\1\16",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23\14\uffff\1\24",
            "\1\uffff",
            "\1\26\13\uffff\1\25",
            "\1\27\14\uffff\1\24",
            "\1\30",
            "\1\32\13\uffff\1\31",
            "\1\33",
            "\1\34\14\uffff\1\35",
            "\1\36",
            "\1\24",
            "\1\37",
            "\1\41\14\uffff\1\40",
            "\1\42\14\uffff\1\35",
            "\1\43",
            "\1\45\13\uffff\1\44",
            "\1\24",
            "\1\46\14\uffff\1\40",
            "\1\50\13\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\35",
            "\1\53",
            "\1\54\14\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60\2\uffff\1\61",
            "\1\40",
            "\1\35",
            "\1\62\14\uffff\1\55",
            "\1\63",
            "\1\65\13\uffff\1\64",
            "\1\40",
            "\1\66\2\uffff\1\61",
            "\1\67",
            "\1\uffff",
            "\1\70",
            "\1\55",
            "\1\71",
            "\1\73\2\uffff\1\72",
            "\1\74",
            "\1\61",
            "\1\55",
            "\1\75\2\uffff\1\72",
            "\1\uffff",
            "\1\76",
            "\1\61",
            "\1\77",
            "\1\72",
            "\1\72"
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[][] dfa_11 = unpackEncodedStringArray(dfa_11s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_5;
            this.special = dfa_10;
            this.transition = dfa_11;
        }
        public String getDescription() {
            return "2994:2: ( rule__Object__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_49 = input.LA(1);

                         
                        int index12_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_49);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_58 = input.LA(1);

                         
                        int index12_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_58);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_12s = "\27\uffff";
    static final String dfa_13s = "\1\6\26\uffff";
    static final String dfa_14s = "\1\6\1\32\4\34\1\uffff\1\41\4\4\1\34\3\0\1\16\1\4\1\uffff\1\0\1\4\1\0\1\16";
    static final String dfa_15s = "\1\45\1\32\4\34\1\uffff\1\41\4\4\1\34\3\0\1\21\1\4\1\uffff\1\0\1\4\1\0\1\16";
    static final String dfa_16s = "\6\uffff\1\2\13\uffff\1\1\4\uffff";
    static final String dfa_17s = "\15\uffff\1\0\1\4\1\2\3\uffff\1\1\1\uffff\1\3\1\uffff}>";
    static final String[] dfa_18s = {
            "\1\6\7\uffff\1\6\12\uffff\1\6\3\uffff\1\6\1\uffff\1\6\1\1\1\uffff\1\2\1\4\1\3\1\5",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\23\2\uffff\1\24",
            "\1\25",
            "",
            "\1\uffff",
            "\1\26",
            "\1\uffff",
            "\1\23"
    };

    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_12;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3122:2: ( rule__Walls__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_13 = input.LA(1);

                         
                        int index14_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_19 = input.LA(1);

                         
                        int index14_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_15 = input.LA(1);

                         
                        int index14_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_14 = input.LA(1);

                         
                        int index14_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\15\uffff\1\3\1\2\1\4\3\uffff\1\1\1\uffff\1\0\1\uffff}>";
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_12;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_19;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3134:2: ( rule__Walls__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_15 = input.LA(1);

                         
                        int index15_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_15);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\15\uffff\1\4\1\2\1\0\3\uffff\1\1\1\uffff\1\3\1\uffff}>";
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_12;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_20;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3146:2: ( rule__Walls__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_15 = input.LA(1);

                         
                        int index16_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_19 = input.LA(1);

                         
                        int index16_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_21 = input.LA(1);

                         
                        int index16_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\15\uffff\1\0\1\4\1\1\3\uffff\1\2\1\uffff\1\3\1\uffff}>";
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_12;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_21;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3158:2: ( rule__Walls__UnorderedGroup__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_19 = input.LA(1);

                         
                        int index17_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_21 = input.LA(1);

                         
                        int index17_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000E41040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000E40042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003DA2004040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003DA2004042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003D00000002L});

}

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF()'", "'LAND()'", "'fly(){'", "'}'", "'environment(){'", "'-'", "'.'", "'FLYTO'", "'('", "')'", "'MOVE'", "'ROTATE'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'origin'", "'='", "'size'", "','", "'color'", "'WALLS'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
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


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:378:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalXDrone.g:379:1: ( ruleUp EOF )
            // InternalXDrone.g:380:1: ruleUp EOF
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
    // InternalXDrone.g:387:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:391:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalXDrone.g:392:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalXDrone.g:392:2: ( ( rule__Up__Group__0 ) )
            // InternalXDrone.g:393:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalXDrone.g:394:3: ( rule__Up__Group__0 )
            // InternalXDrone.g:394:4: rule__Up__Group__0
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
    // InternalXDrone.g:403:1: entryRuleDown : ruleDown EOF ;
    public final void entryRuleDown() throws RecognitionException {
        try {
            // InternalXDrone.g:404:1: ( ruleDown EOF )
            // InternalXDrone.g:405:1: ruleDown EOF
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
    // InternalXDrone.g:412:1: ruleDown : ( ( rule__Down__Group__0 ) ) ;
    public final void ruleDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:416:2: ( ( ( rule__Down__Group__0 ) ) )
            // InternalXDrone.g:417:2: ( ( rule__Down__Group__0 ) )
            {
            // InternalXDrone.g:417:2: ( ( rule__Down__Group__0 ) )
            // InternalXDrone.g:418:3: ( rule__Down__Group__0 )
            {
             before(grammarAccess.getDownAccess().getGroup()); 
            // InternalXDrone.g:419:3: ( rule__Down__Group__0 )
            // InternalXDrone.g:419:4: rule__Down__Group__0
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
    // InternalXDrone.g:428:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalXDrone.g:429:1: ( ruleLeft EOF )
            // InternalXDrone.g:430:1: ruleLeft EOF
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
    // InternalXDrone.g:437:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:441:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalXDrone.g:442:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalXDrone.g:442:2: ( ( rule__Left__Group__0 ) )
            // InternalXDrone.g:443:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalXDrone.g:444:3: ( rule__Left__Group__0 )
            // InternalXDrone.g:444:4: rule__Left__Group__0
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
    // InternalXDrone.g:453:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalXDrone.g:454:1: ( ruleRight EOF )
            // InternalXDrone.g:455:1: ruleRight EOF
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
    // InternalXDrone.g:462:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:466:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalXDrone.g:467:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalXDrone.g:467:2: ( ( rule__Right__Group__0 ) )
            // InternalXDrone.g:468:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalXDrone.g:469:3: ( rule__Right__Group__0 )
            // InternalXDrone.g:469:4: rule__Right__Group__0
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
    // InternalXDrone.g:478:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalXDrone.g:479:1: ( ruleForward EOF )
            // InternalXDrone.g:480:1: ruleForward EOF
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
    // InternalXDrone.g:487:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:491:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalXDrone.g:492:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalXDrone.g:492:2: ( ( rule__Forward__Group__0 ) )
            // InternalXDrone.g:493:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalXDrone.g:494:3: ( rule__Forward__Group__0 )
            // InternalXDrone.g:494:4: rule__Forward__Group__0
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
    // InternalXDrone.g:503:1: entryRuleBackward : ruleBackward EOF ;
    public final void entryRuleBackward() throws RecognitionException {
        try {
            // InternalXDrone.g:504:1: ( ruleBackward EOF )
            // InternalXDrone.g:505:1: ruleBackward EOF
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
    // InternalXDrone.g:512:1: ruleBackward : ( ( rule__Backward__Group__0 ) ) ;
    public final void ruleBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:516:2: ( ( ( rule__Backward__Group__0 ) ) )
            // InternalXDrone.g:517:2: ( ( rule__Backward__Group__0 ) )
            {
            // InternalXDrone.g:517:2: ( ( rule__Backward__Group__0 ) )
            // InternalXDrone.g:518:3: ( rule__Backward__Group__0 )
            {
             before(grammarAccess.getBackwardAccess().getGroup()); 
            // InternalXDrone.g:519:3: ( rule__Backward__Group__0 )
            // InternalXDrone.g:519:4: rule__Backward__Group__0
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
    // InternalXDrone.g:528:1: entryRuleRotateL : ruleRotateL EOF ;
    public final void entryRuleRotateL() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( ruleRotateL EOF )
            // InternalXDrone.g:530:1: ruleRotateL EOF
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
    // InternalXDrone.g:537:1: ruleRotateL : ( ( rule__RotateL__Group__0 ) ) ;
    public final void ruleRotateL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__RotateL__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__RotateL__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__RotateL__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__RotateL__Group__0 )
            {
             before(grammarAccess.getRotateLAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__RotateL__Group__0 )
            // InternalXDrone.g:544:4: rule__RotateL__Group__0
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
    // InternalXDrone.g:553:1: entryRuleRotateR : ruleRotateR EOF ;
    public final void entryRuleRotateR() throws RecognitionException {
        try {
            // InternalXDrone.g:554:1: ( ruleRotateR EOF )
            // InternalXDrone.g:555:1: ruleRotateR EOF
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
    // InternalXDrone.g:562:1: ruleRotateR : ( ( rule__RotateR__Group__0 ) ) ;
    public final void ruleRotateR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:566:2: ( ( ( rule__RotateR__Group__0 ) ) )
            // InternalXDrone.g:567:2: ( ( rule__RotateR__Group__0 ) )
            {
            // InternalXDrone.g:567:2: ( ( rule__RotateR__Group__0 ) )
            // InternalXDrone.g:568:3: ( rule__RotateR__Group__0 )
            {
             before(grammarAccess.getRotateRAccess().getGroup()); 
            // InternalXDrone.g:569:3: ( rule__RotateR__Group__0 )
            // InternalXDrone.g:569:4: rule__RotateR__Group__0
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
    // InternalXDrone.g:578:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalXDrone.g:579:1: ( ruleWait EOF )
            // InternalXDrone.g:580:1: ruleWait EOF
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
    // InternalXDrone.g:587:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:591:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalXDrone.g:592:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalXDrone.g:592:2: ( ( rule__Wait__Group__0 ) )
            // InternalXDrone.g:593:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalXDrone.g:594:3: ( rule__Wait__Group__0 )
            // InternalXDrone.g:594:4: rule__Wait__Group__0
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
    // InternalXDrone.g:603:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalXDrone.g:604:1: ( ruleFunctionName EOF )
            // InternalXDrone.g:605:1: ruleFunctionName EOF
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
    // InternalXDrone.g:612:1: ruleFunctionName : ( ( rule__FunctionName__Group__0 ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:616:2: ( ( ( rule__FunctionName__Group__0 ) ) )
            // InternalXDrone.g:617:2: ( ( rule__FunctionName__Group__0 ) )
            {
            // InternalXDrone.g:617:2: ( ( rule__FunctionName__Group__0 ) )
            // InternalXDrone.g:618:3: ( rule__FunctionName__Group__0 )
            {
             before(grammarAccess.getFunctionNameAccess().getGroup()); 
            // InternalXDrone.g:619:3: ( rule__FunctionName__Group__0 )
            // InternalXDrone.g:619:4: rule__FunctionName__Group__0
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
    // InternalXDrone.g:628:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalXDrone.g:629:1: ( ruleDrone EOF )
            // InternalXDrone.g:630:1: ruleDrone EOF
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
    // InternalXDrone.g:637:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:641:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalXDrone.g:642:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalXDrone.g:642:2: ( ( rule__Drone__Group__0 ) )
            // InternalXDrone.g:643:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalXDrone.g:644:3: ( rule__Drone__Group__0 )
            // InternalXDrone.g:644:4: rule__Drone__Group__0
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
    // InternalXDrone.g:653:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalXDrone.g:654:1: ( ruleObject EOF )
            // InternalXDrone.g:655:1: ruleObject EOF
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
    // InternalXDrone.g:662:1: ruleObject : ( ( rule__Object__UnorderedGroup ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:666:2: ( ( ( rule__Object__UnorderedGroup ) ) )
            // InternalXDrone.g:667:2: ( ( rule__Object__UnorderedGroup ) )
            {
            // InternalXDrone.g:667:2: ( ( rule__Object__UnorderedGroup ) )
            // InternalXDrone.g:668:3: ( rule__Object__UnorderedGroup )
            {
             before(grammarAccess.getObjectAccess().getUnorderedGroup()); 
            // InternalXDrone.g:669:3: ( rule__Object__UnorderedGroup )
            // InternalXDrone.g:669:4: rule__Object__UnorderedGroup
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
    // InternalXDrone.g:678:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalXDrone.g:679:1: ( ruleOrigin EOF )
            // InternalXDrone.g:680:1: ruleOrigin EOF
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
    // InternalXDrone.g:687:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:691:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalXDrone.g:692:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalXDrone.g:692:2: ( ( rule__Origin__Group__0 ) )
            // InternalXDrone.g:693:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalXDrone.g:694:3: ( rule__Origin__Group__0 )
            // InternalXDrone.g:694:4: rule__Origin__Group__0
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
    // InternalXDrone.g:703:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalXDrone.g:704:1: ( ruleSize EOF )
            // InternalXDrone.g:705:1: ruleSize EOF
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
    // InternalXDrone.g:712:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:716:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalXDrone.g:717:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalXDrone.g:717:2: ( ( rule__Size__Group__0 ) )
            // InternalXDrone.g:718:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalXDrone.g:719:3: ( rule__Size__Group__0 )
            // InternalXDrone.g:719:4: rule__Size__Group__0
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
    // InternalXDrone.g:728:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // InternalXDrone.g:729:1: ( ruleVector EOF )
            // InternalXDrone.g:730:1: ruleVector EOF
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
    // InternalXDrone.g:737:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:741:2: ( ( ( rule__Vector__Group__0 ) ) )
            // InternalXDrone.g:742:2: ( ( rule__Vector__Group__0 ) )
            {
            // InternalXDrone.g:742:2: ( ( rule__Vector__Group__0 ) )
            // InternalXDrone.g:743:3: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // InternalXDrone.g:744:3: ( rule__Vector__Group__0 )
            // InternalXDrone.g:744:4: rule__Vector__Group__0
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
    // InternalXDrone.g:753:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalXDrone.g:754:1: ( ruleColor EOF )
            // InternalXDrone.g:755:1: ruleColor EOF
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
    // InternalXDrone.g:762:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:766:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalXDrone.g:767:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalXDrone.g:767:2: ( ( rule__Color__Group__0 ) )
            // InternalXDrone.g:768:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalXDrone.g:769:3: ( rule__Color__Group__0 )
            // InternalXDrone.g:769:4: rule__Color__Group__0
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
    // InternalXDrone.g:778:1: entryRuleWalls : ruleWalls EOF ;
    public final void entryRuleWalls() throws RecognitionException {
        try {
            // InternalXDrone.g:779:1: ( ruleWalls EOF )
            // InternalXDrone.g:780:1: ruleWalls EOF
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
    // InternalXDrone.g:787:1: ruleWalls : ( ( rule__Walls__Group__0 ) ) ;
    public final void ruleWalls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:791:2: ( ( ( rule__Walls__Group__0 ) ) )
            // InternalXDrone.g:792:2: ( ( rule__Walls__Group__0 ) )
            {
            // InternalXDrone.g:792:2: ( ( rule__Walls__Group__0 ) )
            // InternalXDrone.g:793:3: ( rule__Walls__Group__0 )
            {
             before(grammarAccess.getWallsAccess().getGroup()); 
            // InternalXDrone.g:794:3: ( rule__Walls__Group__0 )
            // InternalXDrone.g:794:4: rule__Walls__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Walls__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__Environment__Alternatives_2"
    // InternalXDrone.g:802:1: rule__Environment__Alternatives_2 : ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) );
    public final void rule__Environment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:806:1: ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
            case 14:
            case 37:
            case 39:
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
                    // InternalXDrone.g:807:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:807:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    // InternalXDrone.g:808:3: ( rule__Environment__DroneAssignment_2_0 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0()); 
                    // InternalXDrone.g:809:3: ( rule__Environment__DroneAssignment_2_0 )
                    // InternalXDrone.g:809:4: rule__Environment__DroneAssignment_2_0
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
                    // InternalXDrone.g:813:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:813:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    // InternalXDrone.g:814:3: ( rule__Environment__WallsAssignment_2_1 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getWallsAssignment_2_1()); 
                    // InternalXDrone.g:815:3: ( rule__Environment__WallsAssignment_2_1 )
                    // InternalXDrone.g:815:4: rule__Environment__WallsAssignment_2_1
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
                    // InternalXDrone.g:819:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:819:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    // InternalXDrone.g:820:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_2()); 
                    // InternalXDrone.g:821:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    // InternalXDrone.g:821:4: rule__Environment__ObjectsAssignment_2_2
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
    // InternalXDrone.g:829:1: rule__SuperCommand__Alternatives : ( ( ruleCommand ) | ( ruleFunctionName ) );
    public final void rule__SuperCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:833:1: ( ( ruleCommand ) | ( ruleFunctionName ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=31)) ) {
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
                    // InternalXDrone.g:834:2: ( ruleCommand )
                    {
                    // InternalXDrone.g:834:2: ( ruleCommand )
                    // InternalXDrone.g:835:3: ruleCommand
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
                    // InternalXDrone.g:840:2: ( ruleFunctionName )
                    {
                    // InternalXDrone.g:840:2: ( ruleFunctionName )
                    // InternalXDrone.g:841:3: ruleFunctionName
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
    // InternalXDrone.g:850:1: rule__Command__Alternatives : ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) | ( ruleFlyTo ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:854:1: ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) | ( ruleFlyTo ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 27:
                {
                alt3=5;
                }
                break;
            case 28:
                {
                alt3=6;
                }
                break;
            case 29:
                {
                alt3=7;
                }
                break;
            case 30:
                {
                alt3=8;
                }
                break;
            case 31:
                {
                alt3=9;
                }
                break;
            case 21:
                {
                alt3=10;
                }
                break;
            case 22:
                {
                alt3=11;
                }
                break;
            case 18:
                {
                alt3=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:855:2: ( ruleUp )
                    {
                    // InternalXDrone.g:855:2: ( ruleUp )
                    // InternalXDrone.g:856:3: ruleUp
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
                    // InternalXDrone.g:861:2: ( ruleDown )
                    {
                    // InternalXDrone.g:861:2: ( ruleDown )
                    // InternalXDrone.g:862:3: ruleDown
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
                    // InternalXDrone.g:867:2: ( ruleLeft )
                    {
                    // InternalXDrone.g:867:2: ( ruleLeft )
                    // InternalXDrone.g:868:3: ruleLeft
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
                    // InternalXDrone.g:873:2: ( ruleRight )
                    {
                    // InternalXDrone.g:873:2: ( ruleRight )
                    // InternalXDrone.g:874:3: ruleRight
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
                    // InternalXDrone.g:879:2: ( ruleForward )
                    {
                    // InternalXDrone.g:879:2: ( ruleForward )
                    // InternalXDrone.g:880:3: ruleForward
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
                    // InternalXDrone.g:885:2: ( ruleBackward )
                    {
                    // InternalXDrone.g:885:2: ( ruleBackward )
                    // InternalXDrone.g:886:3: ruleBackward
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
                    // InternalXDrone.g:891:2: ( ruleRotateL )
                    {
                    // InternalXDrone.g:891:2: ( ruleRotateL )
                    // InternalXDrone.g:892:3: ruleRotateL
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
                    // InternalXDrone.g:897:2: ( ruleRotateR )
                    {
                    // InternalXDrone.g:897:2: ( ruleRotateR )
                    // InternalXDrone.g:898:3: ruleRotateR
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
                    // InternalXDrone.g:903:2: ( ruleWait )
                    {
                    // InternalXDrone.g:903:2: ( ruleWait )
                    // InternalXDrone.g:904:3: ruleWait
                    {
                     before(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXDrone.g:909:2: ( ruleMove )
                    {
                    // InternalXDrone.g:909:2: ( ruleMove )
                    // InternalXDrone.g:910:3: ruleMove
                    {
                     before(grammarAccess.getCommandAccess().getMoveParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMoveParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalXDrone.g:915:2: ( ruleRotate )
                    {
                    // InternalXDrone.g:915:2: ( ruleRotate )
                    // InternalXDrone.g:916:3: ruleRotate
                    {
                     before(grammarAccess.getCommandAccess().getRotateParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleRotate();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalXDrone.g:921:2: ( ruleFlyTo )
                    {
                    // InternalXDrone.g:921:2: ( ruleFlyTo )
                    // InternalXDrone.g:922:3: ruleFlyTo
                    {
                     before(grammarAccess.getCommandAccess().getFlyToParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleFlyTo();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getFlyToParserRuleCall_11()); 

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
    // InternalXDrone.g:931:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:935:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) )
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
                    // InternalXDrone.g:936:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:936:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:937:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:938:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:938:4: rule__DOUBLE__Group_0__0
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
                    // InternalXDrone.g:942:2: ( rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:942:2: ( rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:943:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:952:1: rule__POSITIVE_DOUBLE__Alternatives : ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__POSITIVE_DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:956:1: ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==20||LA5_1==38) ) {
                    alt5=2;
                }
                else if ( (LA5_1==17) ) {
                    alt5=1;
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
                    // InternalXDrone.g:957:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:957:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:958:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:959:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    // InternalXDrone.g:959:4: rule__POSITIVE_DOUBLE__Group_0__0
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
                    // InternalXDrone.g:963:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:963:2: ( RULE_INT )
                    // InternalXDrone.g:964:3: RULE_INT
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
    // InternalXDrone.g:973:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:977:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalXDrone.g:978:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalXDrone.g:985:1: rule__Main__Group__0__Impl : ( ( rule__Main__FlyAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:989:1: ( ( ( rule__Main__FlyAssignment_0 ) ) )
            // InternalXDrone.g:990:1: ( ( rule__Main__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:990:1: ( ( rule__Main__FlyAssignment_0 ) )
            // InternalXDrone.g:991:2: ( rule__Main__FlyAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:992:2: ( rule__Main__FlyAssignment_0 )
            // InternalXDrone.g:992:3: rule__Main__FlyAssignment_0
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
    // InternalXDrone.g:1000:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1004:1: ( rule__Main__Group__1__Impl )
            // InternalXDrone.g:1005:2: rule__Main__Group__1__Impl
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
    // InternalXDrone.g:1011:1: rule__Main__Group__1__Impl : ( ( rule__Main__EnvironmentAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1015:1: ( ( ( rule__Main__EnvironmentAssignment_1 )? ) )
            // InternalXDrone.g:1016:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            {
            // InternalXDrone.g:1016:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            // InternalXDrone.g:1017:2: ( rule__Main__EnvironmentAssignment_1 )?
            {
             before(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:1018:2: ( rule__Main__EnvironmentAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:1018:3: rule__Main__EnvironmentAssignment_1
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
    // InternalXDrone.g:1027:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1031:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:1032:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
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
    // InternalXDrone.g:1039:1: rule__Fly__Group__0__Impl : ( 'fly(){' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1043:1: ( ( 'fly(){' ) )
            // InternalXDrone.g:1044:1: ( 'fly(){' )
            {
            // InternalXDrone.g:1044:1: ( 'fly(){' )
            // InternalXDrone.g:1045:2: 'fly(){'
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
    // InternalXDrone.g:1054:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1058:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:1059:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
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
    // InternalXDrone.g:1066:1: rule__Fly__Group__1__Impl : ( ( rule__Fly__Group_1__0 ) ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1070:1: ( ( ( rule__Fly__Group_1__0 ) ) )
            // InternalXDrone.g:1071:1: ( ( rule__Fly__Group_1__0 ) )
            {
            // InternalXDrone.g:1071:1: ( ( rule__Fly__Group_1__0 ) )
            // InternalXDrone.g:1072:2: ( rule__Fly__Group_1__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_1()); 
            // InternalXDrone.g:1073:2: ( rule__Fly__Group_1__0 )
            // InternalXDrone.g:1073:3: rule__Fly__Group_1__0
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
    // InternalXDrone.g:1081:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1085:1: ( rule__Fly__Group__2__Impl )
            // InternalXDrone.g:1086:2: rule__Fly__Group__2__Impl
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
    // InternalXDrone.g:1092:1: rule__Fly__Group__2__Impl : ( '}' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1096:1: ( ( '}' ) )
            // InternalXDrone.g:1097:1: ( '}' )
            {
            // InternalXDrone.g:1097:1: ( '}' )
            // InternalXDrone.g:1098:2: '}'
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
    // InternalXDrone.g:1108:1: rule__Fly__Group_1__0 : rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 ;
    public final void rule__Fly__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1112:1: ( rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 )
            // InternalXDrone.g:1113:2: rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1
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
    // InternalXDrone.g:1120:1: rule__Fly__Group_1__0__Impl : ( ( rule__Fly__TakeoffAssignment_1_0 ) ) ;
    public final void rule__Fly__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1124:1: ( ( ( rule__Fly__TakeoffAssignment_1_0 ) ) )
            // InternalXDrone.g:1125:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            {
            // InternalXDrone.g:1125:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            // InternalXDrone.g:1126:2: ( rule__Fly__TakeoffAssignment_1_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 
            // InternalXDrone.g:1127:2: ( rule__Fly__TakeoffAssignment_1_0 )
            // InternalXDrone.g:1127:3: rule__Fly__TakeoffAssignment_1_0
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
    // InternalXDrone.g:1135:1: rule__Fly__Group_1__1 : rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 ;
    public final void rule__Fly__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1139:1: ( rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 )
            // InternalXDrone.g:1140:2: rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2
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
    // InternalXDrone.g:1147:1: rule__Fly__Group_1__1__Impl : ( ( rule__Fly__CommandsAssignment_1_1 )* ) ;
    public final void rule__Fly__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1151:1: ( ( ( rule__Fly__CommandsAssignment_1_1 )* ) )
            // InternalXDrone.g:1152:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            {
            // InternalXDrone.g:1152:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            // InternalXDrone.g:1153:2: ( rule__Fly__CommandsAssignment_1_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 
            // InternalXDrone.g:1154:2: ( rule__Fly__CommandsAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==18||(LA7_0>=21 && LA7_0<=31)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXDrone.g:1154:3: rule__Fly__CommandsAssignment_1_1
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
    // InternalXDrone.g:1162:1: rule__Fly__Group_1__2 : rule__Fly__Group_1__2__Impl ;
    public final void rule__Fly__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1166:1: ( rule__Fly__Group_1__2__Impl )
            // InternalXDrone.g:1167:2: rule__Fly__Group_1__2__Impl
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
    // InternalXDrone.g:1173:1: rule__Fly__Group_1__2__Impl : ( ( rule__Fly__LandAssignment_1_2 ) ) ;
    public final void rule__Fly__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1177:1: ( ( ( rule__Fly__LandAssignment_1_2 ) ) )
            // InternalXDrone.g:1178:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            {
            // InternalXDrone.g:1178:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            // InternalXDrone.g:1179:2: ( rule__Fly__LandAssignment_1_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 
            // InternalXDrone.g:1180:2: ( rule__Fly__LandAssignment_1_2 )
            // InternalXDrone.g:1180:3: rule__Fly__LandAssignment_1_2
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
    // InternalXDrone.g:1189:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1193:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:1194:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
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
    // InternalXDrone.g:1201:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1205:1: ( ( () ) )
            // InternalXDrone.g:1206:1: ( () )
            {
            // InternalXDrone.g:1206:1: ( () )
            // InternalXDrone.g:1207:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:1208:2: ()
            // InternalXDrone.g:1208:3: 
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
    // InternalXDrone.g:1216:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1220:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:1221:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
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
    // InternalXDrone.g:1228:1: rule__Environment__Group__1__Impl : ( 'environment(){' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1232:1: ( ( 'environment(){' ) )
            // InternalXDrone.g:1233:1: ( 'environment(){' )
            {
            // InternalXDrone.g:1233:1: ( 'environment(){' )
            // InternalXDrone.g:1234:2: 'environment(){'
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
    // InternalXDrone.g:1243:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1247:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:1248:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
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
    // InternalXDrone.g:1255:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Alternatives_2 )* ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1259:1: ( ( ( rule__Environment__Alternatives_2 )* ) )
            // InternalXDrone.g:1260:1: ( ( rule__Environment__Alternatives_2 )* )
            {
            // InternalXDrone.g:1260:1: ( ( rule__Environment__Alternatives_2 )* )
            // InternalXDrone.g:1261:2: ( rule__Environment__Alternatives_2 )*
            {
             before(grammarAccess.getEnvironmentAccess().getAlternatives_2()); 
            // InternalXDrone.g:1262:2: ( rule__Environment__Alternatives_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID||LA8_1==14||LA8_1==33||LA8_1==37||(LA8_1>=39 && LA8_1<=40)) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_ID||LA8_0==33||LA8_0==37||(LA8_0>=39 && LA8_0<=40)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXDrone.g:1262:3: rule__Environment__Alternatives_2
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
    // InternalXDrone.g:1270:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1274:1: ( rule__Environment__Group__3__Impl )
            // InternalXDrone.g:1275:2: rule__Environment__Group__3__Impl
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
    // InternalXDrone.g:1281:1: rule__Environment__Group__3__Impl : ( '}' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1285:1: ( ( '}' ) )
            // InternalXDrone.g:1286:1: ( '}' )
            {
            // InternalXDrone.g:1286:1: ( '}' )
            // InternalXDrone.g:1287:2: '}'
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
    // InternalXDrone.g:1297:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1301:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1302:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
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
    // InternalXDrone.g:1309:1: rule__DOUBLE__Group_0__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1313:1: ( ( '-' ) )
            // InternalXDrone.g:1314:1: ( '-' )
            {
            // InternalXDrone.g:1314:1: ( '-' )
            // InternalXDrone.g:1315:2: '-'
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
    // InternalXDrone.g:1324:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1328:1: ( rule__DOUBLE__Group_0__1__Impl )
            // InternalXDrone.g:1329:2: rule__DOUBLE__Group_0__1__Impl
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
    // InternalXDrone.g:1335:1: rule__DOUBLE__Group_0__1__Impl : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1339:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1340:1: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1340:1: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1341:2: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:1351:1: rule__POSITIVE_DOUBLE__Group_0__0 : rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1355:1: ( rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 )
            // InternalXDrone.g:1356:2: rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1
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
    // InternalXDrone.g:1363:1: rule__POSITIVE_DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1367:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1368:1: ( RULE_INT )
            {
            // InternalXDrone.g:1368:1: ( RULE_INT )
            // InternalXDrone.g:1369:2: RULE_INT
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
    // InternalXDrone.g:1378:1: rule__POSITIVE_DOUBLE__Group_0__1 : rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1382:1: ( rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 )
            // InternalXDrone.g:1383:2: rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2
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
    // InternalXDrone.g:1390:1: rule__POSITIVE_DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1394:1: ( ( '.' ) )
            // InternalXDrone.g:1395:1: ( '.' )
            {
            // InternalXDrone.g:1395:1: ( '.' )
            // InternalXDrone.g:1396:2: '.'
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
    // InternalXDrone.g:1405:1: rule__POSITIVE_DOUBLE__Group_0__2 : rule__POSITIVE_DOUBLE__Group_0__2__Impl ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1409:1: ( rule__POSITIVE_DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1410:2: rule__POSITIVE_DOUBLE__Group_0__2__Impl
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
    // InternalXDrone.g:1416:1: rule__POSITIVE_DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1420:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1421:1: ( RULE_INT )
            {
            // InternalXDrone.g:1421:1: ( RULE_INT )
            // InternalXDrone.g:1422:2: RULE_INT
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
    // InternalXDrone.g:1432:1: rule__FlyTo__Group__0 : rule__FlyTo__Group__0__Impl rule__FlyTo__Group__1 ;
    public final void rule__FlyTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1436:1: ( rule__FlyTo__Group__0__Impl rule__FlyTo__Group__1 )
            // InternalXDrone.g:1437:2: rule__FlyTo__Group__0__Impl rule__FlyTo__Group__1
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
    // InternalXDrone.g:1444:1: rule__FlyTo__Group__0__Impl : ( 'FLYTO' ) ;
    public final void rule__FlyTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1448:1: ( ( 'FLYTO' ) )
            // InternalXDrone.g:1449:1: ( 'FLYTO' )
            {
            // InternalXDrone.g:1449:1: ( 'FLYTO' )
            // InternalXDrone.g:1450:2: 'FLYTO'
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
    // InternalXDrone.g:1459:1: rule__FlyTo__Group__1 : rule__FlyTo__Group__1__Impl rule__FlyTo__Group__2 ;
    public final void rule__FlyTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1463:1: ( rule__FlyTo__Group__1__Impl rule__FlyTo__Group__2 )
            // InternalXDrone.g:1464:2: rule__FlyTo__Group__1__Impl rule__FlyTo__Group__2
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
    // InternalXDrone.g:1471:1: rule__FlyTo__Group__1__Impl : ( '(' ) ;
    public final void rule__FlyTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1475:1: ( ( '(' ) )
            // InternalXDrone.g:1476:1: ( '(' )
            {
            // InternalXDrone.g:1476:1: ( '(' )
            // InternalXDrone.g:1477:2: '('
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
    // InternalXDrone.g:1486:1: rule__FlyTo__Group__2 : rule__FlyTo__Group__2__Impl rule__FlyTo__Group__3 ;
    public final void rule__FlyTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1490:1: ( rule__FlyTo__Group__2__Impl rule__FlyTo__Group__3 )
            // InternalXDrone.g:1491:2: rule__FlyTo__Group__2__Impl rule__FlyTo__Group__3
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
    // InternalXDrone.g:1498:1: rule__FlyTo__Group__2__Impl : ( ( rule__FlyTo__Object_nameAssignment_2 ) ) ;
    public final void rule__FlyTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1502:1: ( ( ( rule__FlyTo__Object_nameAssignment_2 ) ) )
            // InternalXDrone.g:1503:1: ( ( rule__FlyTo__Object_nameAssignment_2 ) )
            {
            // InternalXDrone.g:1503:1: ( ( rule__FlyTo__Object_nameAssignment_2 ) )
            // InternalXDrone.g:1504:2: ( rule__FlyTo__Object_nameAssignment_2 )
            {
             before(grammarAccess.getFlyToAccess().getObject_nameAssignment_2()); 
            // InternalXDrone.g:1505:2: ( rule__FlyTo__Object_nameAssignment_2 )
            // InternalXDrone.g:1505:3: rule__FlyTo__Object_nameAssignment_2
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
    // InternalXDrone.g:1513:1: rule__FlyTo__Group__3 : rule__FlyTo__Group__3__Impl ;
    public final void rule__FlyTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1517:1: ( rule__FlyTo__Group__3__Impl )
            // InternalXDrone.g:1518:2: rule__FlyTo__Group__3__Impl
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
    // InternalXDrone.g:1524:1: rule__FlyTo__Group__3__Impl : ( ')' ) ;
    public final void rule__FlyTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1528:1: ( ( ')' ) )
            // InternalXDrone.g:1529:1: ( ')' )
            {
            // InternalXDrone.g:1529:1: ( ')' )
            // InternalXDrone.g:1530:2: ')'
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
    // InternalXDrone.g:1540:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1544:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalXDrone.g:1545:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalXDrone.g:1552:1: rule__Move__Group__0__Impl : ( 'MOVE' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1556:1: ( ( 'MOVE' ) )
            // InternalXDrone.g:1557:1: ( 'MOVE' )
            {
            // InternalXDrone.g:1557:1: ( 'MOVE' )
            // InternalXDrone.g:1558:2: 'MOVE'
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
    // InternalXDrone.g:1567:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1571:1: ( rule__Move__Group__1__Impl )
            // InternalXDrone.g:1572:2: rule__Move__Group__1__Impl
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
    // InternalXDrone.g:1578:1: rule__Move__Group__1__Impl : ( ( rule__Move__VectorAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1582:1: ( ( ( rule__Move__VectorAssignment_1 ) ) )
            // InternalXDrone.g:1583:1: ( ( rule__Move__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:1583:1: ( ( rule__Move__VectorAssignment_1 ) )
            // InternalXDrone.g:1584:2: ( rule__Move__VectorAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:1585:2: ( rule__Move__VectorAssignment_1 )
            // InternalXDrone.g:1585:3: rule__Move__VectorAssignment_1
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
    // InternalXDrone.g:1594:1: rule__Rotate__Group__0 : rule__Rotate__Group__0__Impl rule__Rotate__Group__1 ;
    public final void rule__Rotate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1598:1: ( rule__Rotate__Group__0__Impl rule__Rotate__Group__1 )
            // InternalXDrone.g:1599:2: rule__Rotate__Group__0__Impl rule__Rotate__Group__1
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
    // InternalXDrone.g:1606:1: rule__Rotate__Group__0__Impl : ( 'ROTATE' ) ;
    public final void rule__Rotate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1610:1: ( ( 'ROTATE' ) )
            // InternalXDrone.g:1611:1: ( 'ROTATE' )
            {
            // InternalXDrone.g:1611:1: ( 'ROTATE' )
            // InternalXDrone.g:1612:2: 'ROTATE'
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
    // InternalXDrone.g:1621:1: rule__Rotate__Group__1 : rule__Rotate__Group__1__Impl rule__Rotate__Group__2 ;
    public final void rule__Rotate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1625:1: ( rule__Rotate__Group__1__Impl rule__Rotate__Group__2 )
            // InternalXDrone.g:1626:2: rule__Rotate__Group__1__Impl rule__Rotate__Group__2
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
    // InternalXDrone.g:1633:1: rule__Rotate__Group__1__Impl : ( '(' ) ;
    public final void rule__Rotate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1637:1: ( ( '(' ) )
            // InternalXDrone.g:1638:1: ( '(' )
            {
            // InternalXDrone.g:1638:1: ( '(' )
            // InternalXDrone.g:1639:2: '('
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
    // InternalXDrone.g:1648:1: rule__Rotate__Group__2 : rule__Rotate__Group__2__Impl rule__Rotate__Group__3 ;
    public final void rule__Rotate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1652:1: ( rule__Rotate__Group__2__Impl rule__Rotate__Group__3 )
            // InternalXDrone.g:1653:2: rule__Rotate__Group__2__Impl rule__Rotate__Group__3
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
    // InternalXDrone.g:1660:1: rule__Rotate__Group__2__Impl : ( ( rule__Rotate__AngleAssignment_2 ) ) ;
    public final void rule__Rotate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1664:1: ( ( ( rule__Rotate__AngleAssignment_2 ) ) )
            // InternalXDrone.g:1665:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:1665:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            // InternalXDrone.g:1666:2: ( rule__Rotate__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:1667:2: ( rule__Rotate__AngleAssignment_2 )
            // InternalXDrone.g:1667:3: rule__Rotate__AngleAssignment_2
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
    // InternalXDrone.g:1675:1: rule__Rotate__Group__3 : rule__Rotate__Group__3__Impl ;
    public final void rule__Rotate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1679:1: ( rule__Rotate__Group__3__Impl )
            // InternalXDrone.g:1680:2: rule__Rotate__Group__3__Impl
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
    // InternalXDrone.g:1686:1: rule__Rotate__Group__3__Impl : ( ')' ) ;
    public final void rule__Rotate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1690:1: ( ( ')' ) )
            // InternalXDrone.g:1691:1: ( ')' )
            {
            // InternalXDrone.g:1691:1: ( ')' )
            // InternalXDrone.g:1692:2: ')'
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


    // $ANTLR start "rule__Up__Group__0"
    // InternalXDrone.g:1702:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1706:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:1707:2: rule__Up__Group__0__Impl rule__Up__Group__1
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
    // InternalXDrone.g:1714:1: rule__Up__Group__0__Impl : ( 'UP' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1718:1: ( ( 'UP' ) )
            // InternalXDrone.g:1719:1: ( 'UP' )
            {
            // InternalXDrone.g:1719:1: ( 'UP' )
            // InternalXDrone.g:1720:2: 'UP'
            {
             before(grammarAccess.getUpAccess().getUPKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalXDrone.g:1729:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1733:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:1734:2: rule__Up__Group__1__Impl rule__Up__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXDrone.g:1741:1: rule__Up__Group__1__Impl : ( '(' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1745:1: ( ( '(' ) )
            // InternalXDrone.g:1746:1: ( '(' )
            {
            // InternalXDrone.g:1746:1: ( '(' )
            // InternalXDrone.g:1747:2: '('
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
    // InternalXDrone.g:1756:1: rule__Up__Group__2 : rule__Up__Group__2__Impl rule__Up__Group__3 ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1760:1: ( rule__Up__Group__2__Impl rule__Up__Group__3 )
            // InternalXDrone.g:1761:2: rule__Up__Group__2__Impl rule__Up__Group__3
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
    // InternalXDrone.g:1768:1: rule__Up__Group__2__Impl : ( ( rule__Up__DistanceAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1772:1: ( ( ( rule__Up__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1773:1: ( ( rule__Up__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1773:1: ( ( rule__Up__DistanceAssignment_2 ) )
            // InternalXDrone.g:1774:2: ( rule__Up__DistanceAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1775:2: ( rule__Up__DistanceAssignment_2 )
            // InternalXDrone.g:1775:3: rule__Up__DistanceAssignment_2
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
    // InternalXDrone.g:1783:1: rule__Up__Group__3 : rule__Up__Group__3__Impl ;
    public final void rule__Up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1787:1: ( rule__Up__Group__3__Impl )
            // InternalXDrone.g:1788:2: rule__Up__Group__3__Impl
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
    // InternalXDrone.g:1794:1: rule__Up__Group__3__Impl : ( ')' ) ;
    public final void rule__Up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1798:1: ( ( ')' ) )
            // InternalXDrone.g:1799:1: ( ')' )
            {
            // InternalXDrone.g:1799:1: ( ')' )
            // InternalXDrone.g:1800:2: ')'
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
    // InternalXDrone.g:1810:1: rule__Down__Group__0 : rule__Down__Group__0__Impl rule__Down__Group__1 ;
    public final void rule__Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1814:1: ( rule__Down__Group__0__Impl rule__Down__Group__1 )
            // InternalXDrone.g:1815:2: rule__Down__Group__0__Impl rule__Down__Group__1
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
    // InternalXDrone.g:1822:1: rule__Down__Group__0__Impl : ( 'DOWN' ) ;
    public final void rule__Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1826:1: ( ( 'DOWN' ) )
            // InternalXDrone.g:1827:1: ( 'DOWN' )
            {
            // InternalXDrone.g:1827:1: ( 'DOWN' )
            // InternalXDrone.g:1828:2: 'DOWN'
            {
             before(grammarAccess.getDownAccess().getDOWNKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalXDrone.g:1837:1: rule__Down__Group__1 : rule__Down__Group__1__Impl rule__Down__Group__2 ;
    public final void rule__Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1841:1: ( rule__Down__Group__1__Impl rule__Down__Group__2 )
            // InternalXDrone.g:1842:2: rule__Down__Group__1__Impl rule__Down__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXDrone.g:1849:1: rule__Down__Group__1__Impl : ( '(' ) ;
    public final void rule__Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1853:1: ( ( '(' ) )
            // InternalXDrone.g:1854:1: ( '(' )
            {
            // InternalXDrone.g:1854:1: ( '(' )
            // InternalXDrone.g:1855:2: '('
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
    // InternalXDrone.g:1864:1: rule__Down__Group__2 : rule__Down__Group__2__Impl rule__Down__Group__3 ;
    public final void rule__Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1868:1: ( rule__Down__Group__2__Impl rule__Down__Group__3 )
            // InternalXDrone.g:1869:2: rule__Down__Group__2__Impl rule__Down__Group__3
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
    // InternalXDrone.g:1876:1: rule__Down__Group__2__Impl : ( ( rule__Down__DistanceAssignment_2 ) ) ;
    public final void rule__Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1880:1: ( ( ( rule__Down__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1881:1: ( ( rule__Down__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1881:1: ( ( rule__Down__DistanceAssignment_2 ) )
            // InternalXDrone.g:1882:2: ( rule__Down__DistanceAssignment_2 )
            {
             before(grammarAccess.getDownAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1883:2: ( rule__Down__DistanceAssignment_2 )
            // InternalXDrone.g:1883:3: rule__Down__DistanceAssignment_2
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
    // InternalXDrone.g:1891:1: rule__Down__Group__3 : rule__Down__Group__3__Impl ;
    public final void rule__Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1895:1: ( rule__Down__Group__3__Impl )
            // InternalXDrone.g:1896:2: rule__Down__Group__3__Impl
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
    // InternalXDrone.g:1902:1: rule__Down__Group__3__Impl : ( ')' ) ;
    public final void rule__Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1906:1: ( ( ')' ) )
            // InternalXDrone.g:1907:1: ( ')' )
            {
            // InternalXDrone.g:1907:1: ( ')' )
            // InternalXDrone.g:1908:2: ')'
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
    // InternalXDrone.g:1918:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1922:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:1923:2: rule__Left__Group__0__Impl rule__Left__Group__1
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
    // InternalXDrone.g:1930:1: rule__Left__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1934:1: ( ( 'LEFT' ) )
            // InternalXDrone.g:1935:1: ( 'LEFT' )
            {
            // InternalXDrone.g:1935:1: ( 'LEFT' )
            // InternalXDrone.g:1936:2: 'LEFT'
            {
             before(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalXDrone.g:1945:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1949:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:1950:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXDrone.g:1957:1: rule__Left__Group__1__Impl : ( '(' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1961:1: ( ( '(' ) )
            // InternalXDrone.g:1962:1: ( '(' )
            {
            // InternalXDrone.g:1962:1: ( '(' )
            // InternalXDrone.g:1963:2: '('
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
    // InternalXDrone.g:1972:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1976:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // InternalXDrone.g:1977:2: rule__Left__Group__2__Impl rule__Left__Group__3
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
    // InternalXDrone.g:1984:1: rule__Left__Group__2__Impl : ( ( rule__Left__DistanceAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1988:1: ( ( ( rule__Left__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1989:1: ( ( rule__Left__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1989:1: ( ( rule__Left__DistanceAssignment_2 ) )
            // InternalXDrone.g:1990:2: ( rule__Left__DistanceAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1991:2: ( rule__Left__DistanceAssignment_2 )
            // InternalXDrone.g:1991:3: rule__Left__DistanceAssignment_2
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
    // InternalXDrone.g:1999:1: rule__Left__Group__3 : rule__Left__Group__3__Impl ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2003:1: ( rule__Left__Group__3__Impl )
            // InternalXDrone.g:2004:2: rule__Left__Group__3__Impl
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
    // InternalXDrone.g:2010:1: rule__Left__Group__3__Impl : ( ')' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2014:1: ( ( ')' ) )
            // InternalXDrone.g:2015:1: ( ')' )
            {
            // InternalXDrone.g:2015:1: ( ')' )
            // InternalXDrone.g:2016:2: ')'
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
    // InternalXDrone.g:2026:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2030:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:2031:2: rule__Right__Group__0__Impl rule__Right__Group__1
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
    // InternalXDrone.g:2038:1: rule__Right__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2042:1: ( ( 'RIGHT' ) )
            // InternalXDrone.g:2043:1: ( 'RIGHT' )
            {
            // InternalXDrone.g:2043:1: ( 'RIGHT' )
            // InternalXDrone.g:2044:2: 'RIGHT'
            {
             before(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalXDrone.g:2053:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2057:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:2058:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXDrone.g:2065:1: rule__Right__Group__1__Impl : ( '(' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2069:1: ( ( '(' ) )
            // InternalXDrone.g:2070:1: ( '(' )
            {
            // InternalXDrone.g:2070:1: ( '(' )
            // InternalXDrone.g:2071:2: '('
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
    // InternalXDrone.g:2080:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2084:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalXDrone.g:2085:2: rule__Right__Group__2__Impl rule__Right__Group__3
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
    // InternalXDrone.g:2092:1: rule__Right__Group__2__Impl : ( ( rule__Right__DistanceAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2096:1: ( ( ( rule__Right__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2097:1: ( ( rule__Right__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2097:1: ( ( rule__Right__DistanceAssignment_2 ) )
            // InternalXDrone.g:2098:2: ( rule__Right__DistanceAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2099:2: ( rule__Right__DistanceAssignment_2 )
            // InternalXDrone.g:2099:3: rule__Right__DistanceAssignment_2
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
    // InternalXDrone.g:2107:1: rule__Right__Group__3 : rule__Right__Group__3__Impl ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2111:1: ( rule__Right__Group__3__Impl )
            // InternalXDrone.g:2112:2: rule__Right__Group__3__Impl
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
    // InternalXDrone.g:2118:1: rule__Right__Group__3__Impl : ( ')' ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2122:1: ( ( ')' ) )
            // InternalXDrone.g:2123:1: ( ')' )
            {
            // InternalXDrone.g:2123:1: ( ')' )
            // InternalXDrone.g:2124:2: ')'
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
    // InternalXDrone.g:2134:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2138:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalXDrone.g:2139:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
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
    // InternalXDrone.g:2146:1: rule__Forward__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2150:1: ( ( 'FORWARD' ) )
            // InternalXDrone.g:2151:1: ( 'FORWARD' )
            {
            // InternalXDrone.g:2151:1: ( 'FORWARD' )
            // InternalXDrone.g:2152:2: 'FORWARD'
            {
             before(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalXDrone.g:2161:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2165:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalXDrone.g:2166:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXDrone.g:2173:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2177:1: ( ( '(' ) )
            // InternalXDrone.g:2178:1: ( '(' )
            {
            // InternalXDrone.g:2178:1: ( '(' )
            // InternalXDrone.g:2179:2: '('
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
    // InternalXDrone.g:2188:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2192:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalXDrone.g:2193:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
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
    // InternalXDrone.g:2200:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2204:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2205:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2205:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2206:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2207:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalXDrone.g:2207:3: rule__Forward__DistanceAssignment_2
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
    // InternalXDrone.g:2215:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2219:1: ( rule__Forward__Group__3__Impl )
            // InternalXDrone.g:2220:2: rule__Forward__Group__3__Impl
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
    // InternalXDrone.g:2226:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2230:1: ( ( ')' ) )
            // InternalXDrone.g:2231:1: ( ')' )
            {
            // InternalXDrone.g:2231:1: ( ')' )
            // InternalXDrone.g:2232:2: ')'
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
    // InternalXDrone.g:2242:1: rule__Backward__Group__0 : rule__Backward__Group__0__Impl rule__Backward__Group__1 ;
    public final void rule__Backward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2246:1: ( rule__Backward__Group__0__Impl rule__Backward__Group__1 )
            // InternalXDrone.g:2247:2: rule__Backward__Group__0__Impl rule__Backward__Group__1
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
    // InternalXDrone.g:2254:1: rule__Backward__Group__0__Impl : ( 'BACKWARD' ) ;
    public final void rule__Backward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2258:1: ( ( 'BACKWARD' ) )
            // InternalXDrone.g:2259:1: ( 'BACKWARD' )
            {
            // InternalXDrone.g:2259:1: ( 'BACKWARD' )
            // InternalXDrone.g:2260:2: 'BACKWARD'
            {
             before(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalXDrone.g:2269:1: rule__Backward__Group__1 : rule__Backward__Group__1__Impl rule__Backward__Group__2 ;
    public final void rule__Backward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2273:1: ( rule__Backward__Group__1__Impl rule__Backward__Group__2 )
            // InternalXDrone.g:2274:2: rule__Backward__Group__1__Impl rule__Backward__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXDrone.g:2281:1: rule__Backward__Group__1__Impl : ( '(' ) ;
    public final void rule__Backward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2285:1: ( ( '(' ) )
            // InternalXDrone.g:2286:1: ( '(' )
            {
            // InternalXDrone.g:2286:1: ( '(' )
            // InternalXDrone.g:2287:2: '('
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
    // InternalXDrone.g:2296:1: rule__Backward__Group__2 : rule__Backward__Group__2__Impl rule__Backward__Group__3 ;
    public final void rule__Backward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2300:1: ( rule__Backward__Group__2__Impl rule__Backward__Group__3 )
            // InternalXDrone.g:2301:2: rule__Backward__Group__2__Impl rule__Backward__Group__3
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
    // InternalXDrone.g:2308:1: rule__Backward__Group__2__Impl : ( ( rule__Backward__DistanceAssignment_2 ) ) ;
    public final void rule__Backward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2312:1: ( ( ( rule__Backward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2313:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2313:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2314:2: ( rule__Backward__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2315:2: ( rule__Backward__DistanceAssignment_2 )
            // InternalXDrone.g:2315:3: rule__Backward__DistanceAssignment_2
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
    // InternalXDrone.g:2323:1: rule__Backward__Group__3 : rule__Backward__Group__3__Impl ;
    public final void rule__Backward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2327:1: ( rule__Backward__Group__3__Impl )
            // InternalXDrone.g:2328:2: rule__Backward__Group__3__Impl
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
    // InternalXDrone.g:2334:1: rule__Backward__Group__3__Impl : ( ')' ) ;
    public final void rule__Backward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2338:1: ( ( ')' ) )
            // InternalXDrone.g:2339:1: ( ')' )
            {
            // InternalXDrone.g:2339:1: ( ')' )
            // InternalXDrone.g:2340:2: ')'
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
    // InternalXDrone.g:2350:1: rule__RotateL__Group__0 : rule__RotateL__Group__0__Impl rule__RotateL__Group__1 ;
    public final void rule__RotateL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2354:1: ( rule__RotateL__Group__0__Impl rule__RotateL__Group__1 )
            // InternalXDrone.g:2355:2: rule__RotateL__Group__0__Impl rule__RotateL__Group__1
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
    // InternalXDrone.g:2362:1: rule__RotateL__Group__0__Impl : ( 'ROTATELEFT' ) ;
    public final void rule__RotateL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2366:1: ( ( 'ROTATELEFT' ) )
            // InternalXDrone.g:2367:1: ( 'ROTATELEFT' )
            {
            // InternalXDrone.g:2367:1: ( 'ROTATELEFT' )
            // InternalXDrone.g:2368:2: 'ROTATELEFT'
            {
             before(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalXDrone.g:2377:1: rule__RotateL__Group__1 : rule__RotateL__Group__1__Impl rule__RotateL__Group__2 ;
    public final void rule__RotateL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2381:1: ( rule__RotateL__Group__1__Impl rule__RotateL__Group__2 )
            // InternalXDrone.g:2382:2: rule__RotateL__Group__1__Impl rule__RotateL__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXDrone.g:2389:1: rule__RotateL__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2393:1: ( ( '(' ) )
            // InternalXDrone.g:2394:1: ( '(' )
            {
            // InternalXDrone.g:2394:1: ( '(' )
            // InternalXDrone.g:2395:2: '('
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
    // InternalXDrone.g:2404:1: rule__RotateL__Group__2 : rule__RotateL__Group__2__Impl rule__RotateL__Group__3 ;
    public final void rule__RotateL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2408:1: ( rule__RotateL__Group__2__Impl rule__RotateL__Group__3 )
            // InternalXDrone.g:2409:2: rule__RotateL__Group__2__Impl rule__RotateL__Group__3
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
    // InternalXDrone.g:2416:1: rule__RotateL__Group__2__Impl : ( ( rule__RotateL__AngleAssignment_2 ) ) ;
    public final void rule__RotateL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2420:1: ( ( ( rule__RotateL__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2421:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2421:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            // InternalXDrone.g:2422:2: ( rule__RotateL__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2423:2: ( rule__RotateL__AngleAssignment_2 )
            // InternalXDrone.g:2423:3: rule__RotateL__AngleAssignment_2
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
    // InternalXDrone.g:2431:1: rule__RotateL__Group__3 : rule__RotateL__Group__3__Impl ;
    public final void rule__RotateL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2435:1: ( rule__RotateL__Group__3__Impl )
            // InternalXDrone.g:2436:2: rule__RotateL__Group__3__Impl
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
    // InternalXDrone.g:2442:1: rule__RotateL__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2446:1: ( ( ')' ) )
            // InternalXDrone.g:2447:1: ( ')' )
            {
            // InternalXDrone.g:2447:1: ( ')' )
            // InternalXDrone.g:2448:2: ')'
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
    // InternalXDrone.g:2458:1: rule__RotateR__Group__0 : rule__RotateR__Group__0__Impl rule__RotateR__Group__1 ;
    public final void rule__RotateR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2462:1: ( rule__RotateR__Group__0__Impl rule__RotateR__Group__1 )
            // InternalXDrone.g:2463:2: rule__RotateR__Group__0__Impl rule__RotateR__Group__1
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
    // InternalXDrone.g:2470:1: rule__RotateR__Group__0__Impl : ( 'ROTATERIGHT' ) ;
    public final void rule__RotateR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2474:1: ( ( 'ROTATERIGHT' ) )
            // InternalXDrone.g:2475:1: ( 'ROTATERIGHT' )
            {
            // InternalXDrone.g:2475:1: ( 'ROTATERIGHT' )
            // InternalXDrone.g:2476:2: 'ROTATERIGHT'
            {
             before(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXDrone.g:2485:1: rule__RotateR__Group__1 : rule__RotateR__Group__1__Impl rule__RotateR__Group__2 ;
    public final void rule__RotateR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2489:1: ( rule__RotateR__Group__1__Impl rule__RotateR__Group__2 )
            // InternalXDrone.g:2490:2: rule__RotateR__Group__1__Impl rule__RotateR__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalXDrone.g:2497:1: rule__RotateR__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2501:1: ( ( '(' ) )
            // InternalXDrone.g:2502:1: ( '(' )
            {
            // InternalXDrone.g:2502:1: ( '(' )
            // InternalXDrone.g:2503:2: '('
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
    // InternalXDrone.g:2512:1: rule__RotateR__Group__2 : rule__RotateR__Group__2__Impl rule__RotateR__Group__3 ;
    public final void rule__RotateR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2516:1: ( rule__RotateR__Group__2__Impl rule__RotateR__Group__3 )
            // InternalXDrone.g:2517:2: rule__RotateR__Group__2__Impl rule__RotateR__Group__3
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
    // InternalXDrone.g:2524:1: rule__RotateR__Group__2__Impl : ( ( rule__RotateR__AngleAssignment_2 ) ) ;
    public final void rule__RotateR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2528:1: ( ( ( rule__RotateR__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2529:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2529:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            // InternalXDrone.g:2530:2: ( rule__RotateR__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2531:2: ( rule__RotateR__AngleAssignment_2 )
            // InternalXDrone.g:2531:3: rule__RotateR__AngleAssignment_2
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
    // InternalXDrone.g:2539:1: rule__RotateR__Group__3 : rule__RotateR__Group__3__Impl ;
    public final void rule__RotateR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2543:1: ( rule__RotateR__Group__3__Impl )
            // InternalXDrone.g:2544:2: rule__RotateR__Group__3__Impl
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
    // InternalXDrone.g:2550:1: rule__RotateR__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2554:1: ( ( ')' ) )
            // InternalXDrone.g:2555:1: ( ')' )
            {
            // InternalXDrone.g:2555:1: ( ')' )
            // InternalXDrone.g:2556:2: ')'
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
    // InternalXDrone.g:2566:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2570:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:2571:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalXDrone.g:2578:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2582:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:2583:1: ( 'WAIT' )
            {
            // InternalXDrone.g:2583:1: ( 'WAIT' )
            // InternalXDrone.g:2584:2: 'WAIT'
            {
             before(grammarAccess.getWaitAccess().getWAITKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalXDrone.g:2593:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2597:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:2598:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalXDrone.g:2605:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2609:1: ( ( '(' ) )
            // InternalXDrone.g:2610:1: ( '(' )
            {
            // InternalXDrone.g:2610:1: ( '(' )
            // InternalXDrone.g:2611:2: '('
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
    // InternalXDrone.g:2620:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2624:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:2625:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
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
    // InternalXDrone.g:2632:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2636:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:2637:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:2637:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:2638:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:2639:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:2639:3: rule__Wait__SecondsAssignment_2
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
    // InternalXDrone.g:2647:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2651:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:2652:2: rule__Wait__Group__3__Impl
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
    // InternalXDrone.g:2658:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2662:1: ( ( ')' ) )
            // InternalXDrone.g:2663:1: ( ')' )
            {
            // InternalXDrone.g:2663:1: ( ')' )
            // InternalXDrone.g:2664:2: ')'
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
    // InternalXDrone.g:2674:1: rule__FunctionName__Group__0 : rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 ;
    public final void rule__FunctionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2678:1: ( rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 )
            // InternalXDrone.g:2679:2: rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1
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
    // InternalXDrone.g:2686:1: rule__FunctionName__Group__0__Impl : ( ( rule__FunctionName__Func_nameAssignment_0 ) ) ;
    public final void rule__FunctionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2690:1: ( ( ( rule__FunctionName__Func_nameAssignment_0 ) ) )
            // InternalXDrone.g:2691:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            {
            // InternalXDrone.g:2691:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            // InternalXDrone.g:2692:2: ( rule__FunctionName__Func_nameAssignment_0 )
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 
            // InternalXDrone.g:2693:2: ( rule__FunctionName__Func_nameAssignment_0 )
            // InternalXDrone.g:2693:3: rule__FunctionName__Func_nameAssignment_0
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
    // InternalXDrone.g:2701:1: rule__FunctionName__Group__1 : rule__FunctionName__Group__1__Impl ;
    public final void rule__FunctionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2705:1: ( rule__FunctionName__Group__1__Impl )
            // InternalXDrone.g:2706:2: rule__FunctionName__Group__1__Impl
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
    // InternalXDrone.g:2712:1: rule__FunctionName__Group__1__Impl : ( '()' ) ;
    public final void rule__FunctionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2716:1: ( ( '()' ) )
            // InternalXDrone.g:2717:1: ( '()' )
            {
            // InternalXDrone.g:2717:1: ( '()' )
            // InternalXDrone.g:2718:2: '()'
            {
             before(grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:2728:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2732:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:2733:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
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
    // InternalXDrone.g:2740:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2744:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:2745:1: ( 'DRONE' )
            {
            // InternalXDrone.g:2745:1: ( 'DRONE' )
            // InternalXDrone.g:2746:2: 'DRONE'
            {
             before(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalXDrone.g:2755:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2759:1: ( rule__Drone__Group__1__Impl )
            // InternalXDrone.g:2760:2: rule__Drone__Group__1__Impl
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
    // InternalXDrone.g:2766:1: rule__Drone__Group__1__Impl : ( ( rule__Drone__VectorAssignment_1 ) ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2770:1: ( ( ( rule__Drone__VectorAssignment_1 ) ) )
            // InternalXDrone.g:2771:1: ( ( rule__Drone__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:2771:1: ( ( rule__Drone__VectorAssignment_1 ) )
            // InternalXDrone.g:2772:2: ( rule__Drone__VectorAssignment_1 )
            {
             before(grammarAccess.getDroneAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:2773:2: ( rule__Drone__VectorAssignment_1 )
            // InternalXDrone.g:2773:3: rule__Drone__VectorAssignment_1
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
    // InternalXDrone.g:2782:1: rule__Object__Group_0__0 : rule__Object__Group_0__0__Impl rule__Object__Group_0__1 ;
    public final void rule__Object__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2786:1: ( rule__Object__Group_0__0__Impl rule__Object__Group_0__1 )
            // InternalXDrone.g:2787:2: rule__Object__Group_0__0__Impl rule__Object__Group_0__1
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
    // InternalXDrone.g:2794:1: rule__Object__Group_0__0__Impl : ( ( rule__Object__Object_nameAssignment_0_0 ) ) ;
    public final void rule__Object__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2798:1: ( ( ( rule__Object__Object_nameAssignment_0_0 ) ) )
            // InternalXDrone.g:2799:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            {
            // InternalXDrone.g:2799:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            // InternalXDrone.g:2800:2: ( rule__Object__Object_nameAssignment_0_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0_0()); 
            // InternalXDrone.g:2801:2: ( rule__Object__Object_nameAssignment_0_0 )
            // InternalXDrone.g:2801:3: rule__Object__Object_nameAssignment_0_0
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
    // InternalXDrone.g:2809:1: rule__Object__Group_0__1 : rule__Object__Group_0__1__Impl rule__Object__Group_0__2 ;
    public final void rule__Object__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2813:1: ( rule__Object__Group_0__1__Impl rule__Object__Group_0__2 )
            // InternalXDrone.g:2814:2: rule__Object__Group_0__1__Impl rule__Object__Group_0__2
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
    // InternalXDrone.g:2821:1: rule__Object__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Object__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2825:1: ( ( '{' ) )
            // InternalXDrone.g:2826:1: ( '{' )
            {
            // InternalXDrone.g:2826:1: ( '{' )
            // InternalXDrone.g:2827:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalXDrone.g:2836:1: rule__Object__Group_0__2 : rule__Object__Group_0__2__Impl ;
    public final void rule__Object__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2840:1: ( rule__Object__Group_0__2__Impl )
            // InternalXDrone.g:2841:2: rule__Object__Group_0__2__Impl
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
    // InternalXDrone.g:2847:1: rule__Object__Group_0__2__Impl : ( ( rule__Object__OriginAssignment_0_2 ) ) ;
    public final void rule__Object__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2851:1: ( ( ( rule__Object__OriginAssignment_0_2 ) ) )
            // InternalXDrone.g:2852:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            {
            // InternalXDrone.g:2852:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            // InternalXDrone.g:2853:2: ( rule__Object__OriginAssignment_0_2 )
            {
             before(grammarAccess.getObjectAccess().getOriginAssignment_0_2()); 
            // InternalXDrone.g:2854:2: ( rule__Object__OriginAssignment_0_2 )
            // InternalXDrone.g:2854:3: rule__Object__OriginAssignment_0_2
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
    // InternalXDrone.g:2863:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2867:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalXDrone.g:2868:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
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
    // InternalXDrone.g:2875:1: rule__Object__Group_2__0__Impl : ( ( rule__Object__ColorAssignment_2_0 )? ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2879:1: ( ( ( rule__Object__ColorAssignment_2_0 )? ) )
            // InternalXDrone.g:2880:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            {
            // InternalXDrone.g:2880:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            // InternalXDrone.g:2881:2: ( rule__Object__ColorAssignment_2_0 )?
            {
             before(grammarAccess.getObjectAccess().getColorAssignment_2_0()); 
            // InternalXDrone.g:2882:2: ( rule__Object__ColorAssignment_2_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXDrone.g:2882:3: rule__Object__ColorAssignment_2_0
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
    // InternalXDrone.g:2890:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2894:1: ( rule__Object__Group_2__1__Impl )
            // InternalXDrone.g:2895:2: rule__Object__Group_2__1__Impl
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
    // InternalXDrone.g:2901:1: rule__Object__Group_2__1__Impl : ( '}' ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2905:1: ( ( '}' ) )
            // InternalXDrone.g:2906:1: ( '}' )
            {
            // InternalXDrone.g:2906:1: ( '}' )
            // InternalXDrone.g:2907:2: '}'
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
    // InternalXDrone.g:2917:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2921:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalXDrone.g:2922:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
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
    // InternalXDrone.g:2929:1: rule__Origin__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2933:1: ( ( 'origin' ) )
            // InternalXDrone.g:2934:1: ( 'origin' )
            {
            // InternalXDrone.g:2934:1: ( 'origin' )
            // InternalXDrone.g:2935:2: 'origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalXDrone.g:2944:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2948:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalXDrone.g:2949:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
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
    // InternalXDrone.g:2956:1: rule__Origin__Group__1__Impl : ( '=' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2960:1: ( ( '=' ) )
            // InternalXDrone.g:2961:1: ( '=' )
            {
            // InternalXDrone.g:2961:1: ( '=' )
            // InternalXDrone.g:2962:2: '='
            {
             before(grammarAccess.getOriginAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalXDrone.g:2971:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2975:1: ( rule__Origin__Group__2__Impl )
            // InternalXDrone.g:2976:2: rule__Origin__Group__2__Impl
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
    // InternalXDrone.g:2982:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__VectorAssignment_2 ) ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2986:1: ( ( ( rule__Origin__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2987:1: ( ( rule__Origin__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2987:1: ( ( rule__Origin__VectorAssignment_2 ) )
            // InternalXDrone.g:2988:2: ( rule__Origin__VectorAssignment_2 )
            {
             before(grammarAccess.getOriginAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2989:2: ( rule__Origin__VectorAssignment_2 )
            // InternalXDrone.g:2989:3: rule__Origin__VectorAssignment_2
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
    // InternalXDrone.g:2998:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3002:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalXDrone.g:3003:2: rule__Size__Group__0__Impl rule__Size__Group__1
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
    // InternalXDrone.g:3010:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3014:1: ( ( 'size' ) )
            // InternalXDrone.g:3015:1: ( 'size' )
            {
            // InternalXDrone.g:3015:1: ( 'size' )
            // InternalXDrone.g:3016:2: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:3025:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3029:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalXDrone.g:3030:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalXDrone.g:3037:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3041:1: ( ( '=' ) )
            // InternalXDrone.g:3042:1: ( '=' )
            {
            // InternalXDrone.g:3042:1: ( '=' )
            // InternalXDrone.g:3043:2: '='
            {
             before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalXDrone.g:3052:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3056:1: ( rule__Size__Group__2__Impl )
            // InternalXDrone.g:3057:2: rule__Size__Group__2__Impl
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
    // InternalXDrone.g:3063:1: rule__Size__Group__2__Impl : ( ( rule__Size__VectorAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3067:1: ( ( ( rule__Size__VectorAssignment_2 ) ) )
            // InternalXDrone.g:3068:1: ( ( rule__Size__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:3068:1: ( ( rule__Size__VectorAssignment_2 ) )
            // InternalXDrone.g:3069:2: ( rule__Size__VectorAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:3070:2: ( rule__Size__VectorAssignment_2 )
            // InternalXDrone.g:3070:3: rule__Size__VectorAssignment_2
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
    // InternalXDrone.g:3079:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3083:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // InternalXDrone.g:3084:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
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
    // InternalXDrone.g:3091:1: rule__Vector__Group__0__Impl : ( '(' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3095:1: ( ( '(' ) )
            // InternalXDrone.g:3096:1: ( '(' )
            {
            // InternalXDrone.g:3096:1: ( '(' )
            // InternalXDrone.g:3097:2: '('
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
    // InternalXDrone.g:3106:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3110:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // InternalXDrone.g:3111:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
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
    // InternalXDrone.g:3118:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3122:1: ( ( ( rule__Vector__XAssignment_1 ) ) )
            // InternalXDrone.g:3123:1: ( ( rule__Vector__XAssignment_1 ) )
            {
            // InternalXDrone.g:3123:1: ( ( rule__Vector__XAssignment_1 ) )
            // InternalXDrone.g:3124:2: ( rule__Vector__XAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getXAssignment_1()); 
            // InternalXDrone.g:3125:2: ( rule__Vector__XAssignment_1 )
            // InternalXDrone.g:3125:3: rule__Vector__XAssignment_1
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
    // InternalXDrone.g:3133:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3137:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // InternalXDrone.g:3138:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
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
    // InternalXDrone.g:3145:1: rule__Vector__Group__2__Impl : ( ',' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3149:1: ( ( ',' ) )
            // InternalXDrone.g:3150:1: ( ',' )
            {
            // InternalXDrone.g:3150:1: ( ',' )
            // InternalXDrone.g:3151:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalXDrone.g:3160:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3164:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // InternalXDrone.g:3165:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
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
    // InternalXDrone.g:3172:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__YAssignment_3 ) ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3176:1: ( ( ( rule__Vector__YAssignment_3 ) ) )
            // InternalXDrone.g:3177:1: ( ( rule__Vector__YAssignment_3 ) )
            {
            // InternalXDrone.g:3177:1: ( ( rule__Vector__YAssignment_3 ) )
            // InternalXDrone.g:3178:2: ( rule__Vector__YAssignment_3 )
            {
             before(grammarAccess.getVectorAccess().getYAssignment_3()); 
            // InternalXDrone.g:3179:2: ( rule__Vector__YAssignment_3 )
            // InternalXDrone.g:3179:3: rule__Vector__YAssignment_3
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
    // InternalXDrone.g:3187:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl rule__Vector__Group__5 ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3191:1: ( rule__Vector__Group__4__Impl rule__Vector__Group__5 )
            // InternalXDrone.g:3192:2: rule__Vector__Group__4__Impl rule__Vector__Group__5
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
    // InternalXDrone.g:3199:1: rule__Vector__Group__4__Impl : ( ',' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3203:1: ( ( ',' ) )
            // InternalXDrone.g:3204:1: ( ',' )
            {
            // InternalXDrone.g:3204:1: ( ',' )
            // InternalXDrone.g:3205:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalXDrone.g:3214:1: rule__Vector__Group__5 : rule__Vector__Group__5__Impl rule__Vector__Group__6 ;
    public final void rule__Vector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3218:1: ( rule__Vector__Group__5__Impl rule__Vector__Group__6 )
            // InternalXDrone.g:3219:2: rule__Vector__Group__5__Impl rule__Vector__Group__6
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
    // InternalXDrone.g:3226:1: rule__Vector__Group__5__Impl : ( ( rule__Vector__ZAssignment_5 ) ) ;
    public final void rule__Vector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3230:1: ( ( ( rule__Vector__ZAssignment_5 ) ) )
            // InternalXDrone.g:3231:1: ( ( rule__Vector__ZAssignment_5 ) )
            {
            // InternalXDrone.g:3231:1: ( ( rule__Vector__ZAssignment_5 ) )
            // InternalXDrone.g:3232:2: ( rule__Vector__ZAssignment_5 )
            {
             before(grammarAccess.getVectorAccess().getZAssignment_5()); 
            // InternalXDrone.g:3233:2: ( rule__Vector__ZAssignment_5 )
            // InternalXDrone.g:3233:3: rule__Vector__ZAssignment_5
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
    // InternalXDrone.g:3241:1: rule__Vector__Group__6 : rule__Vector__Group__6__Impl ;
    public final void rule__Vector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3245:1: ( rule__Vector__Group__6__Impl )
            // InternalXDrone.g:3246:2: rule__Vector__Group__6__Impl
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
    // InternalXDrone.g:3252:1: rule__Vector__Group__6__Impl : ( ')' ) ;
    public final void rule__Vector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3256:1: ( ( ')' ) )
            // InternalXDrone.g:3257:1: ( ')' )
            {
            // InternalXDrone.g:3257:1: ( ')' )
            // InternalXDrone.g:3258:2: ')'
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
    // InternalXDrone.g:3268:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3272:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalXDrone.g:3273:2: rule__Color__Group__0__Impl rule__Color__Group__1
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
    // InternalXDrone.g:3280:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3284:1: ( ( 'color' ) )
            // InternalXDrone.g:3285:1: ( 'color' )
            {
            // InternalXDrone.g:3285:1: ( 'color' )
            // InternalXDrone.g:3286:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalXDrone.g:3295:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3299:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalXDrone.g:3300:2: rule__Color__Group__1__Impl rule__Color__Group__2
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
    // InternalXDrone.g:3307:1: rule__Color__Group__1__Impl : ( '=' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3311:1: ( ( '=' ) )
            // InternalXDrone.g:3312:1: ( '=' )
            {
            // InternalXDrone.g:3312:1: ( '=' )
            // InternalXDrone.g:3313:2: '='
            {
             before(grammarAccess.getColorAccess().getEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalXDrone.g:3322:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3326:1: ( rule__Color__Group__2__Impl )
            // InternalXDrone.g:3327:2: rule__Color__Group__2__Impl
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
    // InternalXDrone.g:3333:1: rule__Color__Group__2__Impl : ( ( rule__Color__Color_valueAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3337:1: ( ( ( rule__Color__Color_valueAssignment_2 ) ) )
            // InternalXDrone.g:3338:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            {
            // InternalXDrone.g:3338:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            // InternalXDrone.g:3339:2: ( rule__Color__Color_valueAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 
            // InternalXDrone.g:3340:2: ( rule__Color__Color_valueAssignment_2 )
            // InternalXDrone.g:3340:3: rule__Color__Color_valueAssignment_2
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


    // $ANTLR start "rule__Walls__Group__0"
    // InternalXDrone.g:3349:1: rule__Walls__Group__0 : rule__Walls__Group__0__Impl rule__Walls__Group__1 ;
    public final void rule__Walls__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3353:1: ( rule__Walls__Group__0__Impl rule__Walls__Group__1 )
            // InternalXDrone.g:3354:2: rule__Walls__Group__0__Impl rule__Walls__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Walls__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__1();

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
    // $ANTLR end "rule__Walls__Group__0"


    // $ANTLR start "rule__Walls__Group__0__Impl"
    // InternalXDrone.g:3361:1: rule__Walls__Group__0__Impl : ( 'WALLS' ) ;
    public final void rule__Walls__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3365:1: ( ( 'WALLS' ) )
            // InternalXDrone.g:3366:1: ( 'WALLS' )
            {
            // InternalXDrone.g:3366:1: ( 'WALLS' )
            // InternalXDrone.g:3367:2: 'WALLS'
            {
             before(grammarAccess.getWallsAccess().getWALLSKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getWALLSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__0__Impl"


    // $ANTLR start "rule__Walls__Group__1"
    // InternalXDrone.g:3376:1: rule__Walls__Group__1 : rule__Walls__Group__1__Impl rule__Walls__Group__2 ;
    public final void rule__Walls__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3380:1: ( rule__Walls__Group__1__Impl rule__Walls__Group__2 )
            // InternalXDrone.g:3381:2: rule__Walls__Group__1__Impl rule__Walls__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Walls__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__2();

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
    // $ANTLR end "rule__Walls__Group__1"


    // $ANTLR start "rule__Walls__Group__1__Impl"
    // InternalXDrone.g:3388:1: rule__Walls__Group__1__Impl : ( '(' ) ;
    public final void rule__Walls__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3392:1: ( ( '(' ) )
            // InternalXDrone.g:3393:1: ( '(' )
            {
            // InternalXDrone.g:3393:1: ( '(' )
            // InternalXDrone.g:3394:2: '('
            {
             before(grammarAccess.getWallsAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__1__Impl"


    // $ANTLR start "rule__Walls__Group__2"
    // InternalXDrone.g:3403:1: rule__Walls__Group__2 : rule__Walls__Group__2__Impl rule__Walls__Group__3 ;
    public final void rule__Walls__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3407:1: ( rule__Walls__Group__2__Impl rule__Walls__Group__3 )
            // InternalXDrone.g:3408:2: rule__Walls__Group__2__Impl rule__Walls__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Walls__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__3();

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
    // $ANTLR end "rule__Walls__Group__2"


    // $ANTLR start "rule__Walls__Group__2__Impl"
    // InternalXDrone.g:3415:1: rule__Walls__Group__2__Impl : ( ( rule__Walls__FrontAssignment_2 ) ) ;
    public final void rule__Walls__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3419:1: ( ( ( rule__Walls__FrontAssignment_2 ) ) )
            // InternalXDrone.g:3420:1: ( ( rule__Walls__FrontAssignment_2 ) )
            {
            // InternalXDrone.g:3420:1: ( ( rule__Walls__FrontAssignment_2 ) )
            // InternalXDrone.g:3421:2: ( rule__Walls__FrontAssignment_2 )
            {
             before(grammarAccess.getWallsAccess().getFrontAssignment_2()); 
            // InternalXDrone.g:3422:2: ( rule__Walls__FrontAssignment_2 )
            // InternalXDrone.g:3422:3: rule__Walls__FrontAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Walls__FrontAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getFrontAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__2__Impl"


    // $ANTLR start "rule__Walls__Group__3"
    // InternalXDrone.g:3430:1: rule__Walls__Group__3 : rule__Walls__Group__3__Impl rule__Walls__Group__4 ;
    public final void rule__Walls__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3434:1: ( rule__Walls__Group__3__Impl rule__Walls__Group__4 )
            // InternalXDrone.g:3435:2: rule__Walls__Group__3__Impl rule__Walls__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Walls__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__4();

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
    // $ANTLR end "rule__Walls__Group__3"


    // $ANTLR start "rule__Walls__Group__3__Impl"
    // InternalXDrone.g:3442:1: rule__Walls__Group__3__Impl : ( ',' ) ;
    public final void rule__Walls__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3446:1: ( ( ',' ) )
            // InternalXDrone.g:3447:1: ( ',' )
            {
            // InternalXDrone.g:3447:1: ( ',' )
            // InternalXDrone.g:3448:2: ','
            {
             before(grammarAccess.getWallsAccess().getCommaKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__3__Impl"


    // $ANTLR start "rule__Walls__Group__4"
    // InternalXDrone.g:3457:1: rule__Walls__Group__4 : rule__Walls__Group__4__Impl rule__Walls__Group__5 ;
    public final void rule__Walls__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3461:1: ( rule__Walls__Group__4__Impl rule__Walls__Group__5 )
            // InternalXDrone.g:3462:2: rule__Walls__Group__4__Impl rule__Walls__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Walls__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__5();

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
    // $ANTLR end "rule__Walls__Group__4"


    // $ANTLR start "rule__Walls__Group__4__Impl"
    // InternalXDrone.g:3469:1: rule__Walls__Group__4__Impl : ( ( rule__Walls__RightAssignment_4 ) ) ;
    public final void rule__Walls__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3473:1: ( ( ( rule__Walls__RightAssignment_4 ) ) )
            // InternalXDrone.g:3474:1: ( ( rule__Walls__RightAssignment_4 ) )
            {
            // InternalXDrone.g:3474:1: ( ( rule__Walls__RightAssignment_4 ) )
            // InternalXDrone.g:3475:2: ( rule__Walls__RightAssignment_4 )
            {
             before(grammarAccess.getWallsAccess().getRightAssignment_4()); 
            // InternalXDrone.g:3476:2: ( rule__Walls__RightAssignment_4 )
            // InternalXDrone.g:3476:3: rule__Walls__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Walls__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__4__Impl"


    // $ANTLR start "rule__Walls__Group__5"
    // InternalXDrone.g:3484:1: rule__Walls__Group__5 : rule__Walls__Group__5__Impl rule__Walls__Group__6 ;
    public final void rule__Walls__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3488:1: ( rule__Walls__Group__5__Impl rule__Walls__Group__6 )
            // InternalXDrone.g:3489:2: rule__Walls__Group__5__Impl rule__Walls__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Walls__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__6();

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
    // $ANTLR end "rule__Walls__Group__5"


    // $ANTLR start "rule__Walls__Group__5__Impl"
    // InternalXDrone.g:3496:1: rule__Walls__Group__5__Impl : ( ',' ) ;
    public final void rule__Walls__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3500:1: ( ( ',' ) )
            // InternalXDrone.g:3501:1: ( ',' )
            {
            // InternalXDrone.g:3501:1: ( ',' )
            // InternalXDrone.g:3502:2: ','
            {
             before(grammarAccess.getWallsAccess().getCommaKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__5__Impl"


    // $ANTLR start "rule__Walls__Group__6"
    // InternalXDrone.g:3511:1: rule__Walls__Group__6 : rule__Walls__Group__6__Impl rule__Walls__Group__7 ;
    public final void rule__Walls__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3515:1: ( rule__Walls__Group__6__Impl rule__Walls__Group__7 )
            // InternalXDrone.g:3516:2: rule__Walls__Group__6__Impl rule__Walls__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Walls__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__7();

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
    // $ANTLR end "rule__Walls__Group__6"


    // $ANTLR start "rule__Walls__Group__6__Impl"
    // InternalXDrone.g:3523:1: rule__Walls__Group__6__Impl : ( ( rule__Walls__BackAssignment_6 ) ) ;
    public final void rule__Walls__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3527:1: ( ( ( rule__Walls__BackAssignment_6 ) ) )
            // InternalXDrone.g:3528:1: ( ( rule__Walls__BackAssignment_6 ) )
            {
            // InternalXDrone.g:3528:1: ( ( rule__Walls__BackAssignment_6 ) )
            // InternalXDrone.g:3529:2: ( rule__Walls__BackAssignment_6 )
            {
             before(grammarAccess.getWallsAccess().getBackAssignment_6()); 
            // InternalXDrone.g:3530:2: ( rule__Walls__BackAssignment_6 )
            // InternalXDrone.g:3530:3: rule__Walls__BackAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Walls__BackAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getBackAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__6__Impl"


    // $ANTLR start "rule__Walls__Group__7"
    // InternalXDrone.g:3538:1: rule__Walls__Group__7 : rule__Walls__Group__7__Impl rule__Walls__Group__8 ;
    public final void rule__Walls__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3542:1: ( rule__Walls__Group__7__Impl rule__Walls__Group__8 )
            // InternalXDrone.g:3543:2: rule__Walls__Group__7__Impl rule__Walls__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Walls__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__8();

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
    // $ANTLR end "rule__Walls__Group__7"


    // $ANTLR start "rule__Walls__Group__7__Impl"
    // InternalXDrone.g:3550:1: rule__Walls__Group__7__Impl : ( ',' ) ;
    public final void rule__Walls__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3554:1: ( ( ',' ) )
            // InternalXDrone.g:3555:1: ( ',' )
            {
            // InternalXDrone.g:3555:1: ( ',' )
            // InternalXDrone.g:3556:2: ','
            {
             before(grammarAccess.getWallsAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__7__Impl"


    // $ANTLR start "rule__Walls__Group__8"
    // InternalXDrone.g:3565:1: rule__Walls__Group__8 : rule__Walls__Group__8__Impl rule__Walls__Group__9 ;
    public final void rule__Walls__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3569:1: ( rule__Walls__Group__8__Impl rule__Walls__Group__9 )
            // InternalXDrone.g:3570:2: rule__Walls__Group__8__Impl rule__Walls__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Walls__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__9();

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
    // $ANTLR end "rule__Walls__Group__8"


    // $ANTLR start "rule__Walls__Group__8__Impl"
    // InternalXDrone.g:3577:1: rule__Walls__Group__8__Impl : ( ( rule__Walls__LeftAssignment_8 ) ) ;
    public final void rule__Walls__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3581:1: ( ( ( rule__Walls__LeftAssignment_8 ) ) )
            // InternalXDrone.g:3582:1: ( ( rule__Walls__LeftAssignment_8 ) )
            {
            // InternalXDrone.g:3582:1: ( ( rule__Walls__LeftAssignment_8 ) )
            // InternalXDrone.g:3583:2: ( rule__Walls__LeftAssignment_8 )
            {
             before(grammarAccess.getWallsAccess().getLeftAssignment_8()); 
            // InternalXDrone.g:3584:2: ( rule__Walls__LeftAssignment_8 )
            // InternalXDrone.g:3584:3: rule__Walls__LeftAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Walls__LeftAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getLeftAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__8__Impl"


    // $ANTLR start "rule__Walls__Group__9"
    // InternalXDrone.g:3592:1: rule__Walls__Group__9 : rule__Walls__Group__9__Impl ;
    public final void rule__Walls__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3596:1: ( rule__Walls__Group__9__Impl )
            // InternalXDrone.g:3597:2: rule__Walls__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Walls__Group__9__Impl();

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
    // $ANTLR end "rule__Walls__Group__9"


    // $ANTLR start "rule__Walls__Group__9__Impl"
    // InternalXDrone.g:3603:1: rule__Walls__Group__9__Impl : ( ')' ) ;
    public final void rule__Walls__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3607:1: ( ( ')' ) )
            // InternalXDrone.g:3608:1: ( ')' )
            {
            // InternalXDrone.g:3608:1: ( ')' )
            // InternalXDrone.g:3609:2: ')'
            {
             before(grammarAccess.getWallsAccess().getRightParenthesisKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__9__Impl"


    // $ANTLR start "rule__Object__UnorderedGroup"
    // InternalXDrone.g:3619:1: rule__Object__UnorderedGroup : rule__Object__UnorderedGroup__0 {...}?;
    public final void rule__Object__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup());
        	
        try {
            // InternalXDrone.g:3624:1: ( rule__Object__UnorderedGroup__0 {...}?)
            // InternalXDrone.g:3625:2: rule__Object__UnorderedGroup__0 {...}?
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
    // InternalXDrone.g:3633:1: rule__Object__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) ;
    public final void rule__Object__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXDrone.g:3638:1: ( ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) )
            // InternalXDrone.g:3639:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            {
            // InternalXDrone.g:3639:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                alt10=2;
            }
            else if ( ( LA10_0 == 14 || LA10_0 == 39 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXDrone.g:3640:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    {
                    // InternalXDrone.g:3640:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    // InternalXDrone.g:3641:4: {...}? => ( ( ( rule__Object__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalXDrone.g:3641:100: ( ( ( rule__Object__Group_0__0 ) ) )
                    // InternalXDrone.g:3642:5: ( ( rule__Object__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3648:5: ( ( rule__Object__Group_0__0 ) )
                    // InternalXDrone.g:3649:6: ( rule__Object__Group_0__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_0()); 
                    // InternalXDrone.g:3650:6: ( rule__Object__Group_0__0 )
                    // InternalXDrone.g:3650:7: rule__Object__Group_0__0
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
                    // InternalXDrone.g:3655:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    {
                    // InternalXDrone.g:3655:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    // InternalXDrone.g:3656:4: {...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalXDrone.g:3656:100: ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    // InternalXDrone.g:3657:5: ( ( rule__Object__SizeAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3663:5: ( ( rule__Object__SizeAssignment_1 ) )
                    // InternalXDrone.g:3664:6: ( rule__Object__SizeAssignment_1 )
                    {
                     before(grammarAccess.getObjectAccess().getSizeAssignment_1()); 
                    // InternalXDrone.g:3665:6: ( rule__Object__SizeAssignment_1 )
                    // InternalXDrone.g:3665:7: rule__Object__SizeAssignment_1
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
                    // InternalXDrone.g:3670:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    {
                    // InternalXDrone.g:3670:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    // InternalXDrone.g:3671:4: {...}? => ( ( ( rule__Object__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalXDrone.g:3671:100: ( ( ( rule__Object__Group_2__0 ) ) )
                    // InternalXDrone.g:3672:5: ( ( rule__Object__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3678:5: ( ( rule__Object__Group_2__0 ) )
                    // InternalXDrone.g:3679:6: ( rule__Object__Group_2__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_2()); 
                    // InternalXDrone.g:3680:6: ( rule__Object__Group_2__0 )
                    // InternalXDrone.g:3680:7: rule__Object__Group_2__0
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
    // InternalXDrone.g:3693:1: rule__Object__UnorderedGroup__0 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? ;
    public final void rule__Object__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3697:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? )
            // InternalXDrone.g:3698:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3699:2: ( rule__Object__UnorderedGroup__1 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalXDrone.g:3699:2: rule__Object__UnorderedGroup__1
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
    // InternalXDrone.g:3705:1: rule__Object__UnorderedGroup__1 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? ;
    public final void rule__Object__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3709:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? )
            // InternalXDrone.g:3710:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3711:2: ( rule__Object__UnorderedGroup__2 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalXDrone.g:3711:2: rule__Object__UnorderedGroup__2
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
    // InternalXDrone.g:3717:1: rule__Object__UnorderedGroup__2 : rule__Object__UnorderedGroup__Impl ;
    public final void rule__Object__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3721:1: ( rule__Object__UnorderedGroup__Impl )
            // InternalXDrone.g:3722:2: rule__Object__UnorderedGroup__Impl
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


    // $ANTLR start "rule__Program__MainAssignment"
    // InternalXDrone.g:3729:1: rule__Program__MainAssignment : ( ruleMain ) ;
    public final void rule__Program__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3733:1: ( ( ruleMain ) )
            // InternalXDrone.g:3734:2: ( ruleMain )
            {
            // InternalXDrone.g:3734:2: ( ruleMain )
            // InternalXDrone.g:3735:3: ruleMain
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
    // InternalXDrone.g:3744:1: rule__Main__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Main__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3748:1: ( ( ruleFly ) )
            // InternalXDrone.g:3749:2: ( ruleFly )
            {
            // InternalXDrone.g:3749:2: ( ruleFly )
            // InternalXDrone.g:3750:3: ruleFly
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
    // InternalXDrone.g:3759:1: rule__Main__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Main__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3763:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:3764:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:3764:2: ( ruleEnvironment )
            // InternalXDrone.g:3765:3: ruleEnvironment
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
    // InternalXDrone.g:3774:1: rule__Fly__TakeoffAssignment_1_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3778:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:3779:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:3779:2: ( ruleTakeoff )
            // InternalXDrone.g:3780:3: ruleTakeoff
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
    // InternalXDrone.g:3789:1: rule__Fly__CommandsAssignment_1_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3793:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:3794:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:3794:2: ( ruleSuperCommand )
            // InternalXDrone.g:3795:3: ruleSuperCommand
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
    // InternalXDrone.g:3804:1: rule__Fly__LandAssignment_1_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3808:1: ( ( ruleLand ) )
            // InternalXDrone.g:3809:2: ( ruleLand )
            {
            // InternalXDrone.g:3809:2: ( ruleLand )
            // InternalXDrone.g:3810:3: ruleLand
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
    // InternalXDrone.g:3819:1: rule__Environment__DroneAssignment_2_0 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3823:1: ( ( ruleDrone ) )
            // InternalXDrone.g:3824:2: ( ruleDrone )
            {
            // InternalXDrone.g:3824:2: ( ruleDrone )
            // InternalXDrone.g:3825:3: ruleDrone
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
    // InternalXDrone.g:3834:1: rule__Environment__WallsAssignment_2_1 : ( ruleWalls ) ;
    public final void rule__Environment__WallsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3838:1: ( ( ruleWalls ) )
            // InternalXDrone.g:3839:2: ( ruleWalls )
            {
            // InternalXDrone.g:3839:2: ( ruleWalls )
            // InternalXDrone.g:3840:3: ruleWalls
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
    // InternalXDrone.g:3849:1: rule__Environment__ObjectsAssignment_2_2 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3853:1: ( ( ruleObject ) )
            // InternalXDrone.g:3854:2: ( ruleObject )
            {
            // InternalXDrone.g:3854:2: ( ruleObject )
            // InternalXDrone.g:3855:3: ruleObject
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
    // InternalXDrone.g:3864:1: rule__FlyTo__Object_nameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FlyTo__Object_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3868:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:3869:2: ( RULE_STRING )
            {
            // InternalXDrone.g:3869:2: ( RULE_STRING )
            // InternalXDrone.g:3870:3: RULE_STRING
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
    // InternalXDrone.g:3879:1: rule__Move__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Move__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3883:1: ( ( ruleVector ) )
            // InternalXDrone.g:3884:2: ( ruleVector )
            {
            // InternalXDrone.g:3884:2: ( ruleVector )
            // InternalXDrone.g:3885:3: ruleVector
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
    // InternalXDrone.g:3894:1: rule__Rotate__AngleAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Rotate__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3898:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3899:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3899:2: ( ruleDOUBLE )
            // InternalXDrone.g:3900:3: ruleDOUBLE
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


    // $ANTLR start "rule__Up__DistanceAssignment_2"
    // InternalXDrone.g:3909:1: rule__Up__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Up__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3913:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3914:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3914:2: ( ruleDOUBLE )
            // InternalXDrone.g:3915:3: ruleDOUBLE
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
    // InternalXDrone.g:3924:1: rule__Down__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Down__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3928:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3929:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3929:2: ( ruleDOUBLE )
            // InternalXDrone.g:3930:3: ruleDOUBLE
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
    // InternalXDrone.g:3939:1: rule__Left__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Left__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3943:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3944:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3944:2: ( ruleDOUBLE )
            // InternalXDrone.g:3945:3: ruleDOUBLE
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
    // InternalXDrone.g:3954:1: rule__Right__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Right__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3958:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3959:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3959:2: ( ruleDOUBLE )
            // InternalXDrone.g:3960:3: ruleDOUBLE
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
    // InternalXDrone.g:3969:1: rule__Forward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3973:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3974:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3974:2: ( ruleDOUBLE )
            // InternalXDrone.g:3975:3: ruleDOUBLE
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
    // InternalXDrone.g:3984:1: rule__Backward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Backward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3988:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3989:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3989:2: ( ruleDOUBLE )
            // InternalXDrone.g:3990:3: ruleDOUBLE
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
    // InternalXDrone.g:3999:1: rule__RotateL__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateL__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4003:1: ( ( RULE_INT ) )
            // InternalXDrone.g:4004:2: ( RULE_INT )
            {
            // InternalXDrone.g:4004:2: ( RULE_INT )
            // InternalXDrone.g:4005:3: RULE_INT
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
    // InternalXDrone.g:4014:1: rule__RotateR__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateR__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4018:1: ( ( RULE_INT ) )
            // InternalXDrone.g:4019:2: ( RULE_INT )
            {
            // InternalXDrone.g:4019:2: ( RULE_INT )
            // InternalXDrone.g:4020:3: RULE_INT
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
    // InternalXDrone.g:4029:1: rule__Wait__SecondsAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4033:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4034:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4034:2: ( ruleDOUBLE )
            // InternalXDrone.g:4035:3: ruleDOUBLE
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
    // InternalXDrone.g:4044:1: rule__FunctionName__Func_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionName__Func_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4048:1: ( ( RULE_ID ) )
            // InternalXDrone.g:4049:2: ( RULE_ID )
            {
            // InternalXDrone.g:4049:2: ( RULE_ID )
            // InternalXDrone.g:4050:3: RULE_ID
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
    // InternalXDrone.g:4059:1: rule__Drone__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Drone__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4063:1: ( ( ruleVector ) )
            // InternalXDrone.g:4064:2: ( ruleVector )
            {
            // InternalXDrone.g:4064:2: ( ruleVector )
            // InternalXDrone.g:4065:3: ruleVector
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
    // InternalXDrone.g:4074:1: rule__Object__Object_nameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4078:1: ( ( RULE_ID ) )
            // InternalXDrone.g:4079:2: ( RULE_ID )
            {
            // InternalXDrone.g:4079:2: ( RULE_ID )
            // InternalXDrone.g:4080:3: RULE_ID
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
    // InternalXDrone.g:4089:1: rule__Object__OriginAssignment_0_2 : ( ruleOrigin ) ;
    public final void rule__Object__OriginAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4093:1: ( ( ruleOrigin ) )
            // InternalXDrone.g:4094:2: ( ruleOrigin )
            {
            // InternalXDrone.g:4094:2: ( ruleOrigin )
            // InternalXDrone.g:4095:3: ruleOrigin
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
    // InternalXDrone.g:4104:1: rule__Object__SizeAssignment_1 : ( ruleSize ) ;
    public final void rule__Object__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4108:1: ( ( ruleSize ) )
            // InternalXDrone.g:4109:2: ( ruleSize )
            {
            // InternalXDrone.g:4109:2: ( ruleSize )
            // InternalXDrone.g:4110:3: ruleSize
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
    // InternalXDrone.g:4119:1: rule__Object__ColorAssignment_2_0 : ( ruleColor ) ;
    public final void rule__Object__ColorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4123:1: ( ( ruleColor ) )
            // InternalXDrone.g:4124:2: ( ruleColor )
            {
            // InternalXDrone.g:4124:2: ( ruleColor )
            // InternalXDrone.g:4125:3: ruleColor
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
    // InternalXDrone.g:4134:1: rule__Origin__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Origin__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4138:1: ( ( ruleVector ) )
            // InternalXDrone.g:4139:2: ( ruleVector )
            {
            // InternalXDrone.g:4139:2: ( ruleVector )
            // InternalXDrone.g:4140:3: ruleVector
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
    // InternalXDrone.g:4149:1: rule__Size__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Size__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4153:1: ( ( ruleVector ) )
            // InternalXDrone.g:4154:2: ( ruleVector )
            {
            // InternalXDrone.g:4154:2: ( ruleVector )
            // InternalXDrone.g:4155:3: ruleVector
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
    // InternalXDrone.g:4164:1: rule__Vector__XAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Vector__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4168:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4169:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4169:2: ( ruleDOUBLE )
            // InternalXDrone.g:4170:3: ruleDOUBLE
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
    // InternalXDrone.g:4179:1: rule__Vector__YAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Vector__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4183:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4184:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4184:2: ( ruleDOUBLE )
            // InternalXDrone.g:4185:3: ruleDOUBLE
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
    // InternalXDrone.g:4194:1: rule__Vector__ZAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Vector__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4198:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4199:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4199:2: ( ruleDOUBLE )
            // InternalXDrone.g:4200:3: ruleDOUBLE
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
    // InternalXDrone.g:4209:1: rule__Color__Color_valueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__Color_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4213:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:4214:2: ( RULE_STRING )
            {
            // InternalXDrone.g:4214:2: ( RULE_STRING )
            // InternalXDrone.g:4215:3: RULE_STRING
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


    // $ANTLR start "rule__Walls__FrontAssignment_2"
    // InternalXDrone.g:4224:1: rule__Walls__FrontAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__FrontAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4228:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4229:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4229:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4230:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getWallsAccess().getFrontPOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getFrontPOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__FrontAssignment_2"


    // $ANTLR start "rule__Walls__RightAssignment_4"
    // InternalXDrone.g:4239:1: rule__Walls__RightAssignment_4 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4243:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4244:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4244:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4245:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getWallsAccess().getRightPOSITIVE_DOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getRightPOSITIVE_DOUBLEParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__RightAssignment_4"


    // $ANTLR start "rule__Walls__BackAssignment_6"
    // InternalXDrone.g:4254:1: rule__Walls__BackAssignment_6 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__BackAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4258:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4259:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4259:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4260:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getWallsAccess().getBackPOSITIVE_DOUBLEParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getBackPOSITIVE_DOUBLEParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__BackAssignment_6"


    // $ANTLR start "rule__Walls__LeftAssignment_8"
    // InternalXDrone.g:4269:1: rule__Walls__LeftAssignment_8 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__LeftAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4273:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4274:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4274:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4275:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getWallsAccess().getLeftPOSITIVE_DOUBLEParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getLeftPOSITIVE_DOUBLEParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__LeftAssignment_8"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\100\uffff";
    static final String dfa_2s = "\1\5\77\uffff";
    static final String dfa_3s = "\1\6\1\42\2\44\1\0\1\uffff\1\43\1\23\1\5\1\uffff\1\44\1\4\1\16\1\23\1\4\1\21\1\0\1\4\1\21\3\4\1\21\1\4\1\46\1\4\2\21\2\4\1\46\1\21\4\4\1\21\1\46\2\4\1\21\2\46\1\21\2\4\1\46\1\21\1\0\3\4\1\21\1\46\1\4\1\24\1\46\1\21\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_4s = "\1\50\1\42\2\44\1\0\1\uffff\1\43\1\23\1\5\1\uffff\1\44\1\20\1\16\1\23\1\4\1\46\1\0\1\20\1\46\1\4\1\20\1\4\1\46\1\4\1\46\1\4\2\46\1\20\1\4\2\46\1\20\3\4\2\46\2\4\1\24\3\46\1\20\1\4\1\46\1\24\1\0\3\4\1\24\1\46\1\4\1\24\1\46\1\24\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_5s = "\5\uffff\1\2\3\uffff\1\1\66\uffff";
    static final String dfa_6s = "\4\uffff\1\0\13\uffff\1\1\37\uffff\1\3\11\uffff\1\2\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\7\uffff\1\4\22\uffff\1\5\3\uffff\1\2\1\uffff\1\3\1\5",
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
            "\1\23\24\uffff\1\24",
            "\1\uffff",
            "\1\26\13\uffff\1\25",
            "\1\27\24\uffff\1\24",
            "\1\30",
            "\1\32\13\uffff\1\31",
            "\1\33",
            "\1\35\24\uffff\1\34",
            "\1\36",
            "\1\24",
            "\1\37",
            "\1\41\24\uffff\1\40",
            "\1\42\24\uffff\1\34",
            "\1\44\13\uffff\1\43",
            "\1\45",
            "\1\24",
            "\1\46\24\uffff\1\40",
            "\1\50\13\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\55\24\uffff\1\54",
            "\1\34",
            "\1\56",
            "\1\57",
            "\1\61\2\uffff\1\60",
            "\1\40",
            "\1\34",
            "\1\62\24\uffff\1\54",
            "\1\64\13\uffff\1\63",
            "\1\65",
            "\1\40",
            "\1\66\2\uffff\1\60",
            "\1\uffff",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\73\2\uffff\1\72",
            "\1\54",
            "\1\74",
            "\1\60",
            "\1\54",
            "\1\75\2\uffff\1\72",
            "\1\uffff",
            "\1\76",
            "\1\60",
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
            return "3699:2: ( rule__Object__UnorderedGroup__1 )?";
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
                        int LA11_48 = input.LA(1);

                         
                        int index11_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_48);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\1\6\1\42\2\44\1\0\1\uffff\1\43\1\23\1\5\1\uffff\1\44\1\4\1\16\1\23\1\4\1\21\1\0\1\4\1\21\3\4\1\21\1\4\1\46\1\4\2\21\2\4\1\46\1\21\3\4\1\46\1\4\1\21\2\4\1\21\2\46\1\21\2\4\1\46\1\21\1\4\1\0\1\4\1\46\1\4\1\21\1\4\1\24\1\46\1\21\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_9s = "\1\50\1\42\2\44\1\0\1\uffff\1\43\1\23\1\5\1\uffff\1\44\1\20\1\16\1\23\1\4\1\46\1\0\1\20\1\46\1\4\1\20\1\4\1\46\1\4\1\46\1\4\2\46\1\4\1\20\2\46\1\20\2\4\1\46\1\4\1\46\2\4\1\24\3\46\1\4\1\20\1\46\1\24\1\4\1\0\1\4\1\46\1\4\1\24\1\4\1\24\1\46\1\24\1\0\1\4\1\24\1\4\2\24";
    static final String dfa_10s = "\4\uffff\1\3\13\uffff\1\1\40\uffff\1\2\10\uffff\1\0\5\uffff}>";
    static final String[] dfa_11s = {
            "\1\1\7\uffff\1\4\22\uffff\1\5\3\uffff\1\2\1\uffff\1\3\1\5",
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
            "\1\23\24\uffff\1\24",
            "\1\uffff",
            "\1\26\13\uffff\1\25",
            "\1\27\24\uffff\1\24",
            "\1\30",
            "\1\32\13\uffff\1\31",
            "\1\33",
            "\1\34\24\uffff\1\35",
            "\1\36",
            "\1\24",
            "\1\37",
            "\1\41\24\uffff\1\40",
            "\1\42\24\uffff\1\35",
            "\1\43",
            "\1\45\13\uffff\1\44",
            "\1\24",
            "\1\46\24\uffff\1\40",
            "\1\50\13\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\35",
            "\1\53",
            "\1\54\24\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60\2\uffff\1\61",
            "\1\40",
            "\1\35",
            "\1\62\24\uffff\1\55",
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
            return "3711:2: ( rule__Object__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_58 = input.LA(1);

                         
                        int index12_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_58);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_16);
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
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000FFE41040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000FFE40042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000001A200004040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000001A200004042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});

}

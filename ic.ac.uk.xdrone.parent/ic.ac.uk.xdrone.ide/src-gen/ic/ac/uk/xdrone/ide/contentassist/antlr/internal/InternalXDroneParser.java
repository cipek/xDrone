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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF()'", "'LAND()'", "'fly(){'", "'}'", "'environment(){'", "'-'", "'.'", "'GOTO'", "'('", "')'", "'MOVE'", "'ROTATE'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'rotation'", "'='", "'origin'", "'size'", "'position'", "','", "'color'", "'WALLS'", "'front'", "'right'", "'left'", "'back'", "'up'"
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


    // $ANTLR start "entryRuleGoTo"
    // InternalXDrone.g:303:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalXDrone.g:304:1: ( ruleGoTo EOF )
            // InternalXDrone.g:305:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalXDrone.g:312:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:316:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalXDrone.g:317:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalXDrone.g:317:2: ( ( rule__GoTo__Group__0 ) )
            // InternalXDrone.g:318:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalXDrone.g:319:3: ( rule__GoTo__Group__0 )
            // InternalXDrone.g:319:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


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
    // InternalXDrone.g:462:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:466:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalXDrone.g:467:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalXDrone.g:467:2: ( ( rule__Object__Group__0 ) )
            // InternalXDrone.g:468:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalXDrone.g:469:3: ( rule__Object__Group__0 )
            // InternalXDrone.g:469:4: rule__Object__Group__0
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


    // $ANTLR start "entryRulePosition"
    // InternalXDrone.g:528:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( rulePosition EOF )
            // InternalXDrone.g:530:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalXDrone.g:537:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__Position__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__Position__Group__0 )
            // InternalXDrone.g:544:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleVector"
    // InternalXDrone.g:553:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // InternalXDrone.g:554:1: ( ruleVector EOF )
            // InternalXDrone.g:555:1: ruleVector EOF
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
    // InternalXDrone.g:562:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:566:2: ( ( ( rule__Vector__Group__0 ) ) )
            // InternalXDrone.g:567:2: ( ( rule__Vector__Group__0 ) )
            {
            // InternalXDrone.g:567:2: ( ( rule__Vector__Group__0 ) )
            // InternalXDrone.g:568:3: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // InternalXDrone.g:569:3: ( rule__Vector__Group__0 )
            // InternalXDrone.g:569:4: rule__Vector__Group__0
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
    // InternalXDrone.g:578:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalXDrone.g:579:1: ( ruleColor EOF )
            // InternalXDrone.g:580:1: ruleColor EOF
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
    // InternalXDrone.g:587:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:591:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalXDrone.g:592:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalXDrone.g:592:2: ( ( rule__Color__Group__0 ) )
            // InternalXDrone.g:593:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalXDrone.g:594:3: ( rule__Color__Group__0 )
            // InternalXDrone.g:594:4: rule__Color__Group__0
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
    // InternalXDrone.g:603:1: entryRuleWalls : ruleWalls EOF ;
    public final void entryRuleWalls() throws RecognitionException {
        try {
            // InternalXDrone.g:604:1: ( ruleWalls EOF )
            // InternalXDrone.g:605:1: ruleWalls EOF
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
    // InternalXDrone.g:612:1: ruleWalls : ( ( rule__Walls__UnorderedGroup ) ) ;
    public final void ruleWalls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:616:2: ( ( ( rule__Walls__UnorderedGroup ) ) )
            // InternalXDrone.g:617:2: ( ( rule__Walls__UnorderedGroup ) )
            {
            // InternalXDrone.g:617:2: ( ( rule__Walls__UnorderedGroup ) )
            // InternalXDrone.g:618:3: ( rule__Walls__UnorderedGroup )
            {
             before(grammarAccess.getWallsAccess().getUnorderedGroup()); 
            // InternalXDrone.g:619:3: ( rule__Walls__UnorderedGroup )
            // InternalXDrone.g:619:4: rule__Walls__UnorderedGroup
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
    // InternalXDrone.g:628:1: entryRuleFront : ruleFront EOF ;
    public final void entryRuleFront() throws RecognitionException {
        try {
            // InternalXDrone.g:629:1: ( ruleFront EOF )
            // InternalXDrone.g:630:1: ruleFront EOF
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
    // InternalXDrone.g:637:1: ruleFront : ( ( rule__Front__Group__0 ) ) ;
    public final void ruleFront() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:641:2: ( ( ( rule__Front__Group__0 ) ) )
            // InternalXDrone.g:642:2: ( ( rule__Front__Group__0 ) )
            {
            // InternalXDrone.g:642:2: ( ( rule__Front__Group__0 ) )
            // InternalXDrone.g:643:3: ( rule__Front__Group__0 )
            {
             before(grammarAccess.getFrontAccess().getGroup()); 
            // InternalXDrone.g:644:3: ( rule__Front__Group__0 )
            // InternalXDrone.g:644:4: rule__Front__Group__0
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
    // InternalXDrone.g:653:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalXDrone.g:654:1: ( ruleRight EOF )
            // InternalXDrone.g:655:1: ruleRight EOF
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
    // InternalXDrone.g:662:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:666:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalXDrone.g:667:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalXDrone.g:667:2: ( ( rule__Right__Group__0 ) )
            // InternalXDrone.g:668:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalXDrone.g:669:3: ( rule__Right__Group__0 )
            // InternalXDrone.g:669:4: rule__Right__Group__0
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
    // InternalXDrone.g:678:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalXDrone.g:679:1: ( ruleLeft EOF )
            // InternalXDrone.g:680:1: ruleLeft EOF
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
    // InternalXDrone.g:687:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:691:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalXDrone.g:692:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalXDrone.g:692:2: ( ( rule__Left__Group__0 ) )
            // InternalXDrone.g:693:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalXDrone.g:694:3: ( rule__Left__Group__0 )
            // InternalXDrone.g:694:4: rule__Left__Group__0
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
    // InternalXDrone.g:703:1: entryRuleBack : ruleBack EOF ;
    public final void entryRuleBack() throws RecognitionException {
        try {
            // InternalXDrone.g:704:1: ( ruleBack EOF )
            // InternalXDrone.g:705:1: ruleBack EOF
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
    // InternalXDrone.g:712:1: ruleBack : ( ( rule__Back__Group__0 ) ) ;
    public final void ruleBack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:716:2: ( ( ( rule__Back__Group__0 ) ) )
            // InternalXDrone.g:717:2: ( ( rule__Back__Group__0 ) )
            {
            // InternalXDrone.g:717:2: ( ( rule__Back__Group__0 ) )
            // InternalXDrone.g:718:3: ( rule__Back__Group__0 )
            {
             before(grammarAccess.getBackAccess().getGroup()); 
            // InternalXDrone.g:719:3: ( rule__Back__Group__0 )
            // InternalXDrone.g:719:4: rule__Back__Group__0
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
    // InternalXDrone.g:728:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalXDrone.g:729:1: ( ruleUp EOF )
            // InternalXDrone.g:730:1: ruleUp EOF
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
    // InternalXDrone.g:737:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:741:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalXDrone.g:742:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalXDrone.g:742:2: ( ( rule__Up__Group__0 ) )
            // InternalXDrone.g:743:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalXDrone.g:744:3: ( rule__Up__Group__0 )
            // InternalXDrone.g:744:4: rule__Up__Group__0
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
    // InternalXDrone.g:752:1: rule__Environment__Alternatives_2 : ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) );
    public final void rule__Environment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:756:1: ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 34:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
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
                    // InternalXDrone.g:757:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:757:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    // InternalXDrone.g:758:3: ( rule__Environment__DroneAssignment_2_0 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0()); 
                    // InternalXDrone.g:759:3: ( rule__Environment__DroneAssignment_2_0 )
                    // InternalXDrone.g:759:4: rule__Environment__DroneAssignment_2_0
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
                    // InternalXDrone.g:763:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:763:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    // InternalXDrone.g:764:3: ( rule__Environment__WallsAssignment_2_1 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getWallsAssignment_2_1()); 
                    // InternalXDrone.g:765:3: ( rule__Environment__WallsAssignment_2_1 )
                    // InternalXDrone.g:765:4: rule__Environment__WallsAssignment_2_1
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
                    // InternalXDrone.g:769:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:769:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    // InternalXDrone.g:770:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_2()); 
                    // InternalXDrone.g:771:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    // InternalXDrone.g:771:4: rule__Environment__ObjectsAssignment_2_2
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
    // InternalXDrone.g:779:1: rule__SuperCommand__Alternatives : ( ( ruleCommand ) | ( ruleFunctionName ) );
    public final void rule__SuperCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:783:1: ( ( ruleCommand ) | ( ruleFunctionName ) )
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
                    // InternalXDrone.g:784:2: ( ruleCommand )
                    {
                    // InternalXDrone.g:784:2: ( ruleCommand )
                    // InternalXDrone.g:785:3: ruleCommand
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
                    // InternalXDrone.g:790:2: ( ruleFunctionName )
                    {
                    // InternalXDrone.g:790:2: ( ruleFunctionName )
                    // InternalXDrone.g:791:3: ruleFunctionName
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
    // InternalXDrone.g:800:1: rule__Command__Alternatives : ( ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) | ( ruleGoTo ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:804:1: ( ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) | ( ruleGoTo ) )
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
                    // InternalXDrone.g:805:2: ( ruleWait )
                    {
                    // InternalXDrone.g:805:2: ( ruleWait )
                    // InternalXDrone.g:806:3: ruleWait
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
                    // InternalXDrone.g:811:2: ( ruleMove )
                    {
                    // InternalXDrone.g:811:2: ( ruleMove )
                    // InternalXDrone.g:812:3: ruleMove
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
                    // InternalXDrone.g:817:2: ( ruleRotate )
                    {
                    // InternalXDrone.g:817:2: ( ruleRotate )
                    // InternalXDrone.g:818:3: ruleRotate
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
                    // InternalXDrone.g:823:2: ( ruleGoTo )
                    {
                    // InternalXDrone.g:823:2: ( ruleGoTo )
                    // InternalXDrone.g:824:3: ruleGoTo
                    {
                     before(grammarAccess.getCommandAccess().getGoToParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getGoToParserRuleCall_3()); 

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
    // InternalXDrone.g:833:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:837:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) )
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
                    // InternalXDrone.g:838:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:838:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:839:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:840:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:840:4: rule__DOUBLE__Group_0__0
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
                    // InternalXDrone.g:844:2: ( rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:844:2: ( rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:845:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:854:1: rule__POSITIVE_DOUBLE__Alternatives : ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__POSITIVE_DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:858:1: ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==17) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==14||LA5_1==20||LA5_1==25||LA5_1==27||(LA5_1>=31 && LA5_1<=32)||LA5_1==34||(LA5_1>=36 && LA5_1<=39)) ) {
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
                    // InternalXDrone.g:859:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:859:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:860:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:861:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    // InternalXDrone.g:861:4: rule__POSITIVE_DOUBLE__Group_0__0
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
                    // InternalXDrone.g:865:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:865:2: ( RULE_INT )
                    // InternalXDrone.g:866:3: RULE_INT
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


    // $ANTLR start "rule__Drone__Alternatives_2"
    // InternalXDrone.g:875:1: rule__Drone__Alternatives_2 : ( ( ( rule__Drone__PositionAssignment_2_0 ) ) | ( ( rule__Drone__Group_2_1__0 ) ) );
    public final void rule__Drone__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:879:1: ( ( ( rule__Drone__PositionAssignment_2_0 ) ) | ( ( rule__Drone__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:880:2: ( ( rule__Drone__PositionAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:880:2: ( ( rule__Drone__PositionAssignment_2_0 ) )
                    // InternalXDrone.g:881:3: ( rule__Drone__PositionAssignment_2_0 )
                    {
                     before(grammarAccess.getDroneAccess().getPositionAssignment_2_0()); 
                    // InternalXDrone.g:882:3: ( rule__Drone__PositionAssignment_2_0 )
                    // InternalXDrone.g:882:4: rule__Drone__PositionAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Drone__PositionAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDroneAccess().getPositionAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:886:2: ( ( rule__Drone__Group_2_1__0 ) )
                    {
                    // InternalXDrone.g:886:2: ( ( rule__Drone__Group_2_1__0 ) )
                    // InternalXDrone.g:887:3: ( rule__Drone__Group_2_1__0 )
                    {
                     before(grammarAccess.getDroneAccess().getGroup_2_1()); 
                    // InternalXDrone.g:888:3: ( rule__Drone__Group_2_1__0 )
                    // InternalXDrone.g:888:4: rule__Drone__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Drone__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDroneAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Drone__Alternatives_2"


    // $ANTLR start "rule__Object__Alternatives_2"
    // InternalXDrone.g:896:1: rule__Object__Alternatives_2 : ( ( ( rule__Object__OriginAssignment_2_0 ) ) | ( ( rule__Object__SizeAssignment_2_1 ) ) | ( ( rule__Object__ColorAssignment_2_2 ) ) );
    public final void rule__Object__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:900:1: ( ( ( rule__Object__OriginAssignment_2_0 ) ) | ( ( rule__Object__SizeAssignment_2_1 ) ) | ( ( rule__Object__ColorAssignment_2_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXDrone.g:901:2: ( ( rule__Object__OriginAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:901:2: ( ( rule__Object__OriginAssignment_2_0 ) )
                    // InternalXDrone.g:902:3: ( rule__Object__OriginAssignment_2_0 )
                    {
                     before(grammarAccess.getObjectAccess().getOriginAssignment_2_0()); 
                    // InternalXDrone.g:903:3: ( rule__Object__OriginAssignment_2_0 )
                    // InternalXDrone.g:903:4: rule__Object__OriginAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__OriginAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getOriginAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:907:2: ( ( rule__Object__SizeAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:907:2: ( ( rule__Object__SizeAssignment_2_1 ) )
                    // InternalXDrone.g:908:3: ( rule__Object__SizeAssignment_2_1 )
                    {
                     before(grammarAccess.getObjectAccess().getSizeAssignment_2_1()); 
                    // InternalXDrone.g:909:3: ( rule__Object__SizeAssignment_2_1 )
                    // InternalXDrone.g:909:4: rule__Object__SizeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__SizeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getSizeAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:913:2: ( ( rule__Object__ColorAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:913:2: ( ( rule__Object__ColorAssignment_2_2 ) )
                    // InternalXDrone.g:914:3: ( rule__Object__ColorAssignment_2_2 )
                    {
                     before(grammarAccess.getObjectAccess().getColorAssignment_2_2()); 
                    // InternalXDrone.g:915:3: ( rule__Object__ColorAssignment_2_2 )
                    // InternalXDrone.g:915:4: rule__Object__ColorAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__ColorAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getColorAssignment_2_2()); 

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
    // $ANTLR end "rule__Object__Alternatives_2"


    // $ANTLR start "rule__Main__Group__0"
    // InternalXDrone.g:923:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:927:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalXDrone.g:928:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalXDrone.g:935:1: rule__Main__Group__0__Impl : ( ( rule__Main__FlyAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:939:1: ( ( ( rule__Main__FlyAssignment_0 ) ) )
            // InternalXDrone.g:940:1: ( ( rule__Main__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:940:1: ( ( rule__Main__FlyAssignment_0 ) )
            // InternalXDrone.g:941:2: ( rule__Main__FlyAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:942:2: ( rule__Main__FlyAssignment_0 )
            // InternalXDrone.g:942:3: rule__Main__FlyAssignment_0
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
    // InternalXDrone.g:950:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:954:1: ( rule__Main__Group__1__Impl )
            // InternalXDrone.g:955:2: rule__Main__Group__1__Impl
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
    // InternalXDrone.g:961:1: rule__Main__Group__1__Impl : ( ( rule__Main__EnvironmentAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:965:1: ( ( ( rule__Main__EnvironmentAssignment_1 )? ) )
            // InternalXDrone.g:966:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            {
            // InternalXDrone.g:966:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            // InternalXDrone.g:967:2: ( rule__Main__EnvironmentAssignment_1 )?
            {
             before(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:968:2: ( rule__Main__EnvironmentAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXDrone.g:968:3: rule__Main__EnvironmentAssignment_1
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
    // InternalXDrone.g:977:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:981:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:982:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
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
    // InternalXDrone.g:989:1: rule__Fly__Group__0__Impl : ( 'fly(){' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:993:1: ( ( 'fly(){' ) )
            // InternalXDrone.g:994:1: ( 'fly(){' )
            {
            // InternalXDrone.g:994:1: ( 'fly(){' )
            // InternalXDrone.g:995:2: 'fly(){'
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
    // InternalXDrone.g:1004:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1008:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:1009:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
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
    // InternalXDrone.g:1016:1: rule__Fly__Group__1__Impl : ( ( rule__Fly__Group_1__0 ) ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1020:1: ( ( ( rule__Fly__Group_1__0 ) ) )
            // InternalXDrone.g:1021:1: ( ( rule__Fly__Group_1__0 ) )
            {
            // InternalXDrone.g:1021:1: ( ( rule__Fly__Group_1__0 ) )
            // InternalXDrone.g:1022:2: ( rule__Fly__Group_1__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_1()); 
            // InternalXDrone.g:1023:2: ( rule__Fly__Group_1__0 )
            // InternalXDrone.g:1023:3: rule__Fly__Group_1__0
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
    // InternalXDrone.g:1031:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1035:1: ( rule__Fly__Group__2__Impl )
            // InternalXDrone.g:1036:2: rule__Fly__Group__2__Impl
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
    // InternalXDrone.g:1042:1: rule__Fly__Group__2__Impl : ( '}' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1046:1: ( ( '}' ) )
            // InternalXDrone.g:1047:1: ( '}' )
            {
            // InternalXDrone.g:1047:1: ( '}' )
            // InternalXDrone.g:1048:2: '}'
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
    // InternalXDrone.g:1058:1: rule__Fly__Group_1__0 : rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 ;
    public final void rule__Fly__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1062:1: ( rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 )
            // InternalXDrone.g:1063:2: rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1
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
    // InternalXDrone.g:1070:1: rule__Fly__Group_1__0__Impl : ( ( rule__Fly__TakeoffAssignment_1_0 ) ) ;
    public final void rule__Fly__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1074:1: ( ( ( rule__Fly__TakeoffAssignment_1_0 ) ) )
            // InternalXDrone.g:1075:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            {
            // InternalXDrone.g:1075:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            // InternalXDrone.g:1076:2: ( rule__Fly__TakeoffAssignment_1_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 
            // InternalXDrone.g:1077:2: ( rule__Fly__TakeoffAssignment_1_0 )
            // InternalXDrone.g:1077:3: rule__Fly__TakeoffAssignment_1_0
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
    // InternalXDrone.g:1085:1: rule__Fly__Group_1__1 : rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 ;
    public final void rule__Fly__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1089:1: ( rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 )
            // InternalXDrone.g:1090:2: rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2
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
    // InternalXDrone.g:1097:1: rule__Fly__Group_1__1__Impl : ( ( rule__Fly__CommandsAssignment_1_1 )* ) ;
    public final void rule__Fly__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1101:1: ( ( ( rule__Fly__CommandsAssignment_1_1 )* ) )
            // InternalXDrone.g:1102:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            {
            // InternalXDrone.g:1102:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            // InternalXDrone.g:1103:2: ( rule__Fly__CommandsAssignment_1_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 
            // InternalXDrone.g:1104:2: ( rule__Fly__CommandsAssignment_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==18||(LA9_0>=21 && LA9_0<=23)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXDrone.g:1104:3: rule__Fly__CommandsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Fly__CommandsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalXDrone.g:1112:1: rule__Fly__Group_1__2 : rule__Fly__Group_1__2__Impl ;
    public final void rule__Fly__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1116:1: ( rule__Fly__Group_1__2__Impl )
            // InternalXDrone.g:1117:2: rule__Fly__Group_1__2__Impl
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
    // InternalXDrone.g:1123:1: rule__Fly__Group_1__2__Impl : ( ( rule__Fly__LandAssignment_1_2 ) ) ;
    public final void rule__Fly__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1127:1: ( ( ( rule__Fly__LandAssignment_1_2 ) ) )
            // InternalXDrone.g:1128:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            {
            // InternalXDrone.g:1128:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            // InternalXDrone.g:1129:2: ( rule__Fly__LandAssignment_1_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 
            // InternalXDrone.g:1130:2: ( rule__Fly__LandAssignment_1_2 )
            // InternalXDrone.g:1130:3: rule__Fly__LandAssignment_1_2
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
    // InternalXDrone.g:1139:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1143:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:1144:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
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
    // InternalXDrone.g:1151:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1155:1: ( ( () ) )
            // InternalXDrone.g:1156:1: ( () )
            {
            // InternalXDrone.g:1156:1: ( () )
            // InternalXDrone.g:1157:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:1158:2: ()
            // InternalXDrone.g:1158:3: 
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
    // InternalXDrone.g:1166:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1170:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:1171:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
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
    // InternalXDrone.g:1178:1: rule__Environment__Group__1__Impl : ( 'environment(){' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1182:1: ( ( 'environment(){' ) )
            // InternalXDrone.g:1183:1: ( 'environment(){' )
            {
            // InternalXDrone.g:1183:1: ( 'environment(){' )
            // InternalXDrone.g:1184:2: 'environment(){'
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
    // InternalXDrone.g:1193:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1197:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:1198:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
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
    // InternalXDrone.g:1205:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Alternatives_2 )* ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1209:1: ( ( ( rule__Environment__Alternatives_2 )* ) )
            // InternalXDrone.g:1210:1: ( ( rule__Environment__Alternatives_2 )* )
            {
            // InternalXDrone.g:1210:1: ( ( rule__Environment__Alternatives_2 )* )
            // InternalXDrone.g:1211:2: ( rule__Environment__Alternatives_2 )*
            {
             before(grammarAccess.getEnvironmentAccess().getAlternatives_2()); 
            // InternalXDrone.g:1212:2: ( rule__Environment__Alternatives_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==25||LA10_0==34||(LA10_0>=36 && LA10_0<=39)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXDrone.g:1212:3: rule__Environment__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Environment__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalXDrone.g:1220:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1224:1: ( rule__Environment__Group__3__Impl )
            // InternalXDrone.g:1225:2: rule__Environment__Group__3__Impl
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
    // InternalXDrone.g:1231:1: rule__Environment__Group__3__Impl : ( '}' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1235:1: ( ( '}' ) )
            // InternalXDrone.g:1236:1: ( '}' )
            {
            // InternalXDrone.g:1236:1: ( '}' )
            // InternalXDrone.g:1237:2: '}'
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
    // InternalXDrone.g:1247:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1251:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1252:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
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
    // InternalXDrone.g:1259:1: rule__DOUBLE__Group_0__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1263:1: ( ( '-' ) )
            // InternalXDrone.g:1264:1: ( '-' )
            {
            // InternalXDrone.g:1264:1: ( '-' )
            // InternalXDrone.g:1265:2: '-'
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
    // InternalXDrone.g:1274:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1278:1: ( rule__DOUBLE__Group_0__1__Impl )
            // InternalXDrone.g:1279:2: rule__DOUBLE__Group_0__1__Impl
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
    // InternalXDrone.g:1285:1: rule__DOUBLE__Group_0__1__Impl : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1289:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1290:1: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1290:1: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1291:2: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:1301:1: rule__POSITIVE_DOUBLE__Group_0__0 : rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1305:1: ( rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 )
            // InternalXDrone.g:1306:2: rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1
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
    // InternalXDrone.g:1313:1: rule__POSITIVE_DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1317:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1318:1: ( RULE_INT )
            {
            // InternalXDrone.g:1318:1: ( RULE_INT )
            // InternalXDrone.g:1319:2: RULE_INT
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
    // InternalXDrone.g:1328:1: rule__POSITIVE_DOUBLE__Group_0__1 : rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1332:1: ( rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 )
            // InternalXDrone.g:1333:2: rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2
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
    // InternalXDrone.g:1340:1: rule__POSITIVE_DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1344:1: ( ( '.' ) )
            // InternalXDrone.g:1345:1: ( '.' )
            {
            // InternalXDrone.g:1345:1: ( '.' )
            // InternalXDrone.g:1346:2: '.'
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
    // InternalXDrone.g:1355:1: rule__POSITIVE_DOUBLE__Group_0__2 : rule__POSITIVE_DOUBLE__Group_0__2__Impl ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1359:1: ( rule__POSITIVE_DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1360:2: rule__POSITIVE_DOUBLE__Group_0__2__Impl
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
    // InternalXDrone.g:1366:1: rule__POSITIVE_DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1370:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1371:1: ( RULE_INT )
            {
            // InternalXDrone.g:1371:1: ( RULE_INT )
            // InternalXDrone.g:1372:2: RULE_INT
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


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalXDrone.g:1382:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1386:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalXDrone.g:1387:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalXDrone.g:1394:1: rule__GoTo__Group__0__Impl : ( 'GOTO' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1398:1: ( ( 'GOTO' ) )
            // InternalXDrone.g:1399:1: ( 'GOTO' )
            {
            // InternalXDrone.g:1399:1: ( 'GOTO' )
            // InternalXDrone.g:1400:2: 'GOTO'
            {
             before(grammarAccess.getGoToAccess().getGOTOKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGOTOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalXDrone.g:1409:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1413:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalXDrone.g:1414:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__GoTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalXDrone.g:1421:1: rule__GoTo__Group__1__Impl : ( '(' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1425:1: ( ( '(' ) )
            // InternalXDrone.g:1426:1: ( '(' )
            {
            // InternalXDrone.g:1426:1: ( '(' )
            // InternalXDrone.g:1427:2: '('
            {
             before(grammarAccess.getGoToAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__2"
    // InternalXDrone.g:1436:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl rule__GoTo__Group__3 ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1440:1: ( rule__GoTo__Group__2__Impl rule__GoTo__Group__3 )
            // InternalXDrone.g:1441:2: rule__GoTo__Group__2__Impl rule__GoTo__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__GoTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2"


    // $ANTLR start "rule__GoTo__Group__2__Impl"
    // InternalXDrone.g:1448:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__Object_nameAssignment_2 ) ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1452:1: ( ( ( rule__GoTo__Object_nameAssignment_2 ) ) )
            // InternalXDrone.g:1453:1: ( ( rule__GoTo__Object_nameAssignment_2 ) )
            {
            // InternalXDrone.g:1453:1: ( ( rule__GoTo__Object_nameAssignment_2 ) )
            // InternalXDrone.g:1454:2: ( rule__GoTo__Object_nameAssignment_2 )
            {
             before(grammarAccess.getGoToAccess().getObject_nameAssignment_2()); 
            // InternalXDrone.g:1455:2: ( rule__GoTo__Object_nameAssignment_2 )
            // InternalXDrone.g:1455:3: rule__GoTo__Object_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Object_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getObject_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2__Impl"


    // $ANTLR start "rule__GoTo__Group__3"
    // InternalXDrone.g:1463:1: rule__GoTo__Group__3 : rule__GoTo__Group__3__Impl ;
    public final void rule__GoTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1467:1: ( rule__GoTo__Group__3__Impl )
            // InternalXDrone.g:1468:2: rule__GoTo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3"


    // $ANTLR start "rule__GoTo__Group__3__Impl"
    // InternalXDrone.g:1474:1: rule__GoTo__Group__3__Impl : ( ')' ) ;
    public final void rule__GoTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1478:1: ( ( ')' ) )
            // InternalXDrone.g:1479:1: ( ')' )
            {
            // InternalXDrone.g:1479:1: ( ')' )
            // InternalXDrone.g:1480:2: ')'
            {
             before(grammarAccess.getGoToAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalXDrone.g:1490:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1494:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalXDrone.g:1495:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalXDrone.g:1502:1: rule__Move__Group__0__Impl : ( 'MOVE' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1506:1: ( ( 'MOVE' ) )
            // InternalXDrone.g:1507:1: ( 'MOVE' )
            {
            // InternalXDrone.g:1507:1: ( 'MOVE' )
            // InternalXDrone.g:1508:2: 'MOVE'
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
    // InternalXDrone.g:1517:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1521:1: ( rule__Move__Group__1__Impl )
            // InternalXDrone.g:1522:2: rule__Move__Group__1__Impl
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
    // InternalXDrone.g:1528:1: rule__Move__Group__1__Impl : ( ( rule__Move__VectorAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1532:1: ( ( ( rule__Move__VectorAssignment_1 ) ) )
            // InternalXDrone.g:1533:1: ( ( rule__Move__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:1533:1: ( ( rule__Move__VectorAssignment_1 ) )
            // InternalXDrone.g:1534:2: ( rule__Move__VectorAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:1535:2: ( rule__Move__VectorAssignment_1 )
            // InternalXDrone.g:1535:3: rule__Move__VectorAssignment_1
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
    // InternalXDrone.g:1544:1: rule__Rotate__Group__0 : rule__Rotate__Group__0__Impl rule__Rotate__Group__1 ;
    public final void rule__Rotate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1548:1: ( rule__Rotate__Group__0__Impl rule__Rotate__Group__1 )
            // InternalXDrone.g:1549:2: rule__Rotate__Group__0__Impl rule__Rotate__Group__1
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
    // InternalXDrone.g:1556:1: rule__Rotate__Group__0__Impl : ( 'ROTATE' ) ;
    public final void rule__Rotate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1560:1: ( ( 'ROTATE' ) )
            // InternalXDrone.g:1561:1: ( 'ROTATE' )
            {
            // InternalXDrone.g:1561:1: ( 'ROTATE' )
            // InternalXDrone.g:1562:2: 'ROTATE'
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
    // InternalXDrone.g:1571:1: rule__Rotate__Group__1 : rule__Rotate__Group__1__Impl rule__Rotate__Group__2 ;
    public final void rule__Rotate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1575:1: ( rule__Rotate__Group__1__Impl rule__Rotate__Group__2 )
            // InternalXDrone.g:1576:2: rule__Rotate__Group__1__Impl rule__Rotate__Group__2
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
    // InternalXDrone.g:1583:1: rule__Rotate__Group__1__Impl : ( '(' ) ;
    public final void rule__Rotate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1587:1: ( ( '(' ) )
            // InternalXDrone.g:1588:1: ( '(' )
            {
            // InternalXDrone.g:1588:1: ( '(' )
            // InternalXDrone.g:1589:2: '('
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
    // InternalXDrone.g:1598:1: rule__Rotate__Group__2 : rule__Rotate__Group__2__Impl rule__Rotate__Group__3 ;
    public final void rule__Rotate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1602:1: ( rule__Rotate__Group__2__Impl rule__Rotate__Group__3 )
            // InternalXDrone.g:1603:2: rule__Rotate__Group__2__Impl rule__Rotate__Group__3
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
    // InternalXDrone.g:1610:1: rule__Rotate__Group__2__Impl : ( ( rule__Rotate__AngleAssignment_2 ) ) ;
    public final void rule__Rotate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1614:1: ( ( ( rule__Rotate__AngleAssignment_2 ) ) )
            // InternalXDrone.g:1615:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:1615:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            // InternalXDrone.g:1616:2: ( rule__Rotate__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:1617:2: ( rule__Rotate__AngleAssignment_2 )
            // InternalXDrone.g:1617:3: rule__Rotate__AngleAssignment_2
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
    // InternalXDrone.g:1625:1: rule__Rotate__Group__3 : rule__Rotate__Group__3__Impl ;
    public final void rule__Rotate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1629:1: ( rule__Rotate__Group__3__Impl )
            // InternalXDrone.g:1630:2: rule__Rotate__Group__3__Impl
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
    // InternalXDrone.g:1636:1: rule__Rotate__Group__3__Impl : ( ')' ) ;
    public final void rule__Rotate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1640:1: ( ( ')' ) )
            // InternalXDrone.g:1641:1: ( ')' )
            {
            // InternalXDrone.g:1641:1: ( ')' )
            // InternalXDrone.g:1642:2: ')'
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
    // InternalXDrone.g:1652:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1656:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:1657:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalXDrone.g:1664:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1668:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:1669:1: ( 'WAIT' )
            {
            // InternalXDrone.g:1669:1: ( 'WAIT' )
            // InternalXDrone.g:1670:2: 'WAIT'
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
    // InternalXDrone.g:1679:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1683:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:1684:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
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
    // InternalXDrone.g:1691:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1695:1: ( ( '(' ) )
            // InternalXDrone.g:1696:1: ( '(' )
            {
            // InternalXDrone.g:1696:1: ( '(' )
            // InternalXDrone.g:1697:2: '('
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
    // InternalXDrone.g:1706:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1710:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:1711:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
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
    // InternalXDrone.g:1718:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1722:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:1723:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:1723:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:1724:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:1725:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:1725:3: rule__Wait__SecondsAssignment_2
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
    // InternalXDrone.g:1733:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1737:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:1738:2: rule__Wait__Group__3__Impl
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
    // InternalXDrone.g:1744:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1748:1: ( ( ')' ) )
            // InternalXDrone.g:1749:1: ( ')' )
            {
            // InternalXDrone.g:1749:1: ( ')' )
            // InternalXDrone.g:1750:2: ')'
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
    // InternalXDrone.g:1760:1: rule__FunctionName__Group__0 : rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 ;
    public final void rule__FunctionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1764:1: ( rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 )
            // InternalXDrone.g:1765:2: rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1
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
    // InternalXDrone.g:1772:1: rule__FunctionName__Group__0__Impl : ( ( rule__FunctionName__Func_nameAssignment_0 ) ) ;
    public final void rule__FunctionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1776:1: ( ( ( rule__FunctionName__Func_nameAssignment_0 ) ) )
            // InternalXDrone.g:1777:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            {
            // InternalXDrone.g:1777:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            // InternalXDrone.g:1778:2: ( rule__FunctionName__Func_nameAssignment_0 )
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 
            // InternalXDrone.g:1779:2: ( rule__FunctionName__Func_nameAssignment_0 )
            // InternalXDrone.g:1779:3: rule__FunctionName__Func_nameAssignment_0
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
    // InternalXDrone.g:1787:1: rule__FunctionName__Group__1 : rule__FunctionName__Group__1__Impl ;
    public final void rule__FunctionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1791:1: ( rule__FunctionName__Group__1__Impl )
            // InternalXDrone.g:1792:2: rule__FunctionName__Group__1__Impl
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
    // InternalXDrone.g:1798:1: rule__FunctionName__Group__1__Impl : ( '()' ) ;
    public final void rule__FunctionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1802:1: ( ( '()' ) )
            // InternalXDrone.g:1803:1: ( '()' )
            {
            // InternalXDrone.g:1803:1: ( '()' )
            // InternalXDrone.g:1804:2: '()'
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
    // InternalXDrone.g:1814:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1818:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:1819:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalXDrone.g:1826:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1830:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:1831:1: ( 'DRONE' )
            {
            // InternalXDrone.g:1831:1: ( 'DRONE' )
            // InternalXDrone.g:1832:2: 'DRONE'
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
    // InternalXDrone.g:1841:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl rule__Drone__Group__2 ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1845:1: ( rule__Drone__Group__1__Impl rule__Drone__Group__2 )
            // InternalXDrone.g:1846:2: rule__Drone__Group__1__Impl rule__Drone__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalXDrone.g:1853:1: rule__Drone__Group__1__Impl : ( '{' ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1857:1: ( ( '{' ) )
            // InternalXDrone.g:1858:1: ( '{' )
            {
            // InternalXDrone.g:1858:1: ( '{' )
            // InternalXDrone.g:1859:2: '{'
            {
             before(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXDrone.g:1868:1: rule__Drone__Group__2 : rule__Drone__Group__2__Impl rule__Drone__Group__3 ;
    public final void rule__Drone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1872:1: ( rule__Drone__Group__2__Impl rule__Drone__Group__3 )
            // InternalXDrone.g:1873:2: rule__Drone__Group__2__Impl rule__Drone__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalXDrone.g:1880:1: rule__Drone__Group__2__Impl : ( ( rule__Drone__Alternatives_2 )* ) ;
    public final void rule__Drone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1884:1: ( ( ( rule__Drone__Alternatives_2 )* ) )
            // InternalXDrone.g:1885:1: ( ( rule__Drone__Alternatives_2 )* )
            {
            // InternalXDrone.g:1885:1: ( ( rule__Drone__Alternatives_2 )* )
            // InternalXDrone.g:1886:2: ( rule__Drone__Alternatives_2 )*
            {
             before(grammarAccess.getDroneAccess().getAlternatives_2()); 
            // InternalXDrone.g:1887:2: ( rule__Drone__Alternatives_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27||LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXDrone.g:1887:3: rule__Drone__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Drone__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDroneAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalXDrone.g:1895:1: rule__Drone__Group__3 : rule__Drone__Group__3__Impl ;
    public final void rule__Drone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1899:1: ( rule__Drone__Group__3__Impl )
            // InternalXDrone.g:1900:2: rule__Drone__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXDrone.g:1906:1: rule__Drone__Group__3__Impl : ( '}' ) ;
    public final void rule__Drone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1910:1: ( ( '}' ) )
            // InternalXDrone.g:1911:1: ( '}' )
            {
            // InternalXDrone.g:1911:1: ( '}' )
            // InternalXDrone.g:1912:2: '}'
            {
             before(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Drone__Group_2_1__0"
    // InternalXDrone.g:1922:1: rule__Drone__Group_2_1__0 : rule__Drone__Group_2_1__0__Impl rule__Drone__Group_2_1__1 ;
    public final void rule__Drone__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1926:1: ( rule__Drone__Group_2_1__0__Impl rule__Drone__Group_2_1__1 )
            // InternalXDrone.g:1927:2: rule__Drone__Group_2_1__0__Impl rule__Drone__Group_2_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Drone__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_2_1__0"


    // $ANTLR start "rule__Drone__Group_2_1__0__Impl"
    // InternalXDrone.g:1934:1: rule__Drone__Group_2_1__0__Impl : ( 'rotation' ) ;
    public final void rule__Drone__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1938:1: ( ( 'rotation' ) )
            // InternalXDrone.g:1939:1: ( 'rotation' )
            {
            // InternalXDrone.g:1939:1: ( 'rotation' )
            // InternalXDrone.g:1940:2: 'rotation'
            {
             before(grammarAccess.getDroneAccess().getRotationKeyword_2_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRotationKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_2_1__0__Impl"


    // $ANTLR start "rule__Drone__Group_2_1__1"
    // InternalXDrone.g:1949:1: rule__Drone__Group_2_1__1 : rule__Drone__Group_2_1__1__Impl rule__Drone__Group_2_1__2 ;
    public final void rule__Drone__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1953:1: ( rule__Drone__Group_2_1__1__Impl rule__Drone__Group_2_1__2 )
            // InternalXDrone.g:1954:2: rule__Drone__Group_2_1__1__Impl rule__Drone__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Drone__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_2_1__1"


    // $ANTLR start "rule__Drone__Group_2_1__1__Impl"
    // InternalXDrone.g:1961:1: rule__Drone__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__Drone__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1965:1: ( ( '=' ) )
            // InternalXDrone.g:1966:1: ( '=' )
            {
            // InternalXDrone.g:1966:1: ( '=' )
            // InternalXDrone.g:1967:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_2_1__1__Impl"


    // $ANTLR start "rule__Drone__Group_2_1__2"
    // InternalXDrone.g:1976:1: rule__Drone__Group_2_1__2 : rule__Drone__Group_2_1__2__Impl ;
    public final void rule__Drone__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1980:1: ( rule__Drone__Group_2_1__2__Impl )
            // InternalXDrone.g:1981:2: rule__Drone__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_2_1__2"


    // $ANTLR start "rule__Drone__Group_2_1__2__Impl"
    // InternalXDrone.g:1987:1: rule__Drone__Group_2_1__2__Impl : ( ( rule__Drone__RotationAssignment_2_1_2 ) ) ;
    public final void rule__Drone__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1991:1: ( ( ( rule__Drone__RotationAssignment_2_1_2 ) ) )
            // InternalXDrone.g:1992:1: ( ( rule__Drone__RotationAssignment_2_1_2 ) )
            {
            // InternalXDrone.g:1992:1: ( ( rule__Drone__RotationAssignment_2_1_2 ) )
            // InternalXDrone.g:1993:2: ( rule__Drone__RotationAssignment_2_1_2 )
            {
             before(grammarAccess.getDroneAccess().getRotationAssignment_2_1_2()); 
            // InternalXDrone.g:1994:2: ( rule__Drone__RotationAssignment_2_1_2 )
            // InternalXDrone.g:1994:3: rule__Drone__RotationAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Drone__RotationAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getRotationAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_2_1__2__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalXDrone.g:2003:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2007:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalXDrone.g:2008:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalXDrone.g:2015:1: rule__Object__Group__0__Impl : ( ( rule__Object__Object_nameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2019:1: ( ( ( rule__Object__Object_nameAssignment_0 ) ) )
            // InternalXDrone.g:2020:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            {
            // InternalXDrone.g:2020:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            // InternalXDrone.g:2021:2: ( rule__Object__Object_nameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0()); 
            // InternalXDrone.g:2022:2: ( rule__Object__Object_nameAssignment_0 )
            // InternalXDrone.g:2022:3: rule__Object__Object_nameAssignment_0
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
    // InternalXDrone.g:2030:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2034:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalXDrone.g:2035:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalXDrone.g:2042:1: rule__Object__Group__1__Impl : ( '{' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2046:1: ( ( '{' ) )
            // InternalXDrone.g:2047:1: ( '{' )
            {
            // InternalXDrone.g:2047:1: ( '{' )
            // InternalXDrone.g:2048:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXDrone.g:2057:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2061:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalXDrone.g:2062:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalXDrone.g:2069:1: rule__Object__Group__2__Impl : ( ( rule__Object__Alternatives_2 )* ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2073:1: ( ( ( rule__Object__Alternatives_2 )* ) )
            // InternalXDrone.g:2074:1: ( ( rule__Object__Alternatives_2 )* )
            {
            // InternalXDrone.g:2074:1: ( ( rule__Object__Alternatives_2 )* )
            // InternalXDrone.g:2075:2: ( rule__Object__Alternatives_2 )*
            {
             before(grammarAccess.getObjectAccess().getAlternatives_2()); 
            // InternalXDrone.g:2076:2: ( rule__Object__Alternatives_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=29 && LA12_0<=30)||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXDrone.g:2076:3: rule__Object__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Object__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getObjectAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalXDrone.g:2084:1: rule__Object__Group__3 : rule__Object__Group__3__Impl ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2088:1: ( rule__Object__Group__3__Impl )
            // InternalXDrone.g:2089:2: rule__Object__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXDrone.g:2095:1: rule__Object__Group__3__Impl : ( '}' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2099:1: ( ( '}' ) )
            // InternalXDrone.g:2100:1: ( '}' )
            {
            // InternalXDrone.g:2100:1: ( '}' )
            // InternalXDrone.g:2101:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Origin__Group__0"
    // InternalXDrone.g:2111:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2115:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalXDrone.g:2116:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2123:1: rule__Origin__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2127:1: ( ( 'origin' ) )
            // InternalXDrone.g:2128:1: ( 'origin' )
            {
            // InternalXDrone.g:2128:1: ( 'origin' )
            // InternalXDrone.g:2129:2: 'origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalXDrone.g:2138:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2142:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalXDrone.g:2143:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
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
    // InternalXDrone.g:2150:1: rule__Origin__Group__1__Impl : ( '=' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2154:1: ( ( '=' ) )
            // InternalXDrone.g:2155:1: ( '=' )
            {
            // InternalXDrone.g:2155:1: ( '=' )
            // InternalXDrone.g:2156:2: '='
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
    // InternalXDrone.g:2165:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2169:1: ( rule__Origin__Group__2__Impl )
            // InternalXDrone.g:2170:2: rule__Origin__Group__2__Impl
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
    // InternalXDrone.g:2176:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__VectorAssignment_2 ) ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2180:1: ( ( ( rule__Origin__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2181:1: ( ( rule__Origin__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2181:1: ( ( rule__Origin__VectorAssignment_2 ) )
            // InternalXDrone.g:2182:2: ( rule__Origin__VectorAssignment_2 )
            {
             before(grammarAccess.getOriginAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2183:2: ( rule__Origin__VectorAssignment_2 )
            // InternalXDrone.g:2183:3: rule__Origin__VectorAssignment_2
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
    // InternalXDrone.g:2192:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2196:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalXDrone.g:2197:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2204:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2208:1: ( ( 'size' ) )
            // InternalXDrone.g:2209:1: ( 'size' )
            {
            // InternalXDrone.g:2209:1: ( 'size' )
            // InternalXDrone.g:2210:2: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXDrone.g:2219:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2223:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalXDrone.g:2224:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalXDrone.g:2231:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2235:1: ( ( '=' ) )
            // InternalXDrone.g:2236:1: ( '=' )
            {
            // InternalXDrone.g:2236:1: ( '=' )
            // InternalXDrone.g:2237:2: '='
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
    // InternalXDrone.g:2246:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2250:1: ( rule__Size__Group__2__Impl )
            // InternalXDrone.g:2251:2: rule__Size__Group__2__Impl
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
    // InternalXDrone.g:2257:1: rule__Size__Group__2__Impl : ( ( rule__Size__VectorAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2261:1: ( ( ( rule__Size__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2262:1: ( ( rule__Size__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2262:1: ( ( rule__Size__VectorAssignment_2 ) )
            // InternalXDrone.g:2263:2: ( rule__Size__VectorAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2264:2: ( rule__Size__VectorAssignment_2 )
            // InternalXDrone.g:2264:3: rule__Size__VectorAssignment_2
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


    // $ANTLR start "rule__Position__Group__0"
    // InternalXDrone.g:2273:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2277:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalXDrone.g:2278:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalXDrone.g:2285:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2289:1: ( ( 'position' ) )
            // InternalXDrone.g:2290:1: ( 'position' )
            {
            // InternalXDrone.g:2290:1: ( 'position' )
            // InternalXDrone.g:2291:2: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalXDrone.g:2300:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2304:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalXDrone.g:2305:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalXDrone.g:2312:1: rule__Position__Group__1__Impl : ( '=' ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2316:1: ( ( '=' ) )
            // InternalXDrone.g:2317:1: ( '=' )
            {
            // InternalXDrone.g:2317:1: ( '=' )
            // InternalXDrone.g:2318:2: '='
            {
             before(grammarAccess.getPositionAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalXDrone.g:2327:1: rule__Position__Group__2 : rule__Position__Group__2__Impl ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2331:1: ( rule__Position__Group__2__Impl )
            // InternalXDrone.g:2332:2: rule__Position__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalXDrone.g:2338:1: rule__Position__Group__2__Impl : ( ( rule__Position__VectorAssignment_2 ) ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2342:1: ( ( ( rule__Position__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2343:1: ( ( rule__Position__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2343:1: ( ( rule__Position__VectorAssignment_2 ) )
            // InternalXDrone.g:2344:2: ( rule__Position__VectorAssignment_2 )
            {
             before(grammarAccess.getPositionAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2345:2: ( rule__Position__VectorAssignment_2 )
            // InternalXDrone.g:2345:3: rule__Position__VectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Position__VectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getVectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Vector__Group__0"
    // InternalXDrone.g:2354:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2358:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // InternalXDrone.g:2359:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
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
    // InternalXDrone.g:2366:1: rule__Vector__Group__0__Impl : ( '(' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2370:1: ( ( '(' ) )
            // InternalXDrone.g:2371:1: ( '(' )
            {
            // InternalXDrone.g:2371:1: ( '(' )
            // InternalXDrone.g:2372:2: '('
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
    // InternalXDrone.g:2381:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2385:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // InternalXDrone.g:2386:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalXDrone.g:2393:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2397:1: ( ( ( rule__Vector__XAssignment_1 ) ) )
            // InternalXDrone.g:2398:1: ( ( rule__Vector__XAssignment_1 ) )
            {
            // InternalXDrone.g:2398:1: ( ( rule__Vector__XAssignment_1 ) )
            // InternalXDrone.g:2399:2: ( rule__Vector__XAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getXAssignment_1()); 
            // InternalXDrone.g:2400:2: ( rule__Vector__XAssignment_1 )
            // InternalXDrone.g:2400:3: rule__Vector__XAssignment_1
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
    // InternalXDrone.g:2408:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2412:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // InternalXDrone.g:2413:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
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
    // InternalXDrone.g:2420:1: rule__Vector__Group__2__Impl : ( ',' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2424:1: ( ( ',' ) )
            // InternalXDrone.g:2425:1: ( ',' )
            {
            // InternalXDrone.g:2425:1: ( ',' )
            // InternalXDrone.g:2426:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:2435:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2439:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // InternalXDrone.g:2440:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalXDrone.g:2447:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__YAssignment_3 ) ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2451:1: ( ( ( rule__Vector__YAssignment_3 ) ) )
            // InternalXDrone.g:2452:1: ( ( rule__Vector__YAssignment_3 ) )
            {
            // InternalXDrone.g:2452:1: ( ( rule__Vector__YAssignment_3 ) )
            // InternalXDrone.g:2453:2: ( rule__Vector__YAssignment_3 )
            {
             before(grammarAccess.getVectorAccess().getYAssignment_3()); 
            // InternalXDrone.g:2454:2: ( rule__Vector__YAssignment_3 )
            // InternalXDrone.g:2454:3: rule__Vector__YAssignment_3
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
    // InternalXDrone.g:2462:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl rule__Vector__Group__5 ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2466:1: ( rule__Vector__Group__4__Impl rule__Vector__Group__5 )
            // InternalXDrone.g:2467:2: rule__Vector__Group__4__Impl rule__Vector__Group__5
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
    // InternalXDrone.g:2474:1: rule__Vector__Group__4__Impl : ( ',' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2478:1: ( ( ',' ) )
            // InternalXDrone.g:2479:1: ( ',' )
            {
            // InternalXDrone.g:2479:1: ( ',' )
            // InternalXDrone.g:2480:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:2489:1: rule__Vector__Group__5 : rule__Vector__Group__5__Impl rule__Vector__Group__6 ;
    public final void rule__Vector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2493:1: ( rule__Vector__Group__5__Impl rule__Vector__Group__6 )
            // InternalXDrone.g:2494:2: rule__Vector__Group__5__Impl rule__Vector__Group__6
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
    // InternalXDrone.g:2501:1: rule__Vector__Group__5__Impl : ( ( rule__Vector__ZAssignment_5 ) ) ;
    public final void rule__Vector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2505:1: ( ( ( rule__Vector__ZAssignment_5 ) ) )
            // InternalXDrone.g:2506:1: ( ( rule__Vector__ZAssignment_5 ) )
            {
            // InternalXDrone.g:2506:1: ( ( rule__Vector__ZAssignment_5 ) )
            // InternalXDrone.g:2507:2: ( rule__Vector__ZAssignment_5 )
            {
             before(grammarAccess.getVectorAccess().getZAssignment_5()); 
            // InternalXDrone.g:2508:2: ( rule__Vector__ZAssignment_5 )
            // InternalXDrone.g:2508:3: rule__Vector__ZAssignment_5
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
    // InternalXDrone.g:2516:1: rule__Vector__Group__6 : rule__Vector__Group__6__Impl ;
    public final void rule__Vector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2520:1: ( rule__Vector__Group__6__Impl )
            // InternalXDrone.g:2521:2: rule__Vector__Group__6__Impl
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
    // InternalXDrone.g:2527:1: rule__Vector__Group__6__Impl : ( ')' ) ;
    public final void rule__Vector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2531:1: ( ( ')' ) )
            // InternalXDrone.g:2532:1: ( ')' )
            {
            // InternalXDrone.g:2532:1: ( ')' )
            // InternalXDrone.g:2533:2: ')'
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
    // InternalXDrone.g:2543:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2547:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalXDrone.g:2548:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2555:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2559:1: ( ( 'color' ) )
            // InternalXDrone.g:2560:1: ( 'color' )
            {
            // InternalXDrone.g:2560:1: ( 'color' )
            // InternalXDrone.g:2561:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalXDrone.g:2570:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2574:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalXDrone.g:2575:2: rule__Color__Group__1__Impl rule__Color__Group__2
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
    // InternalXDrone.g:2582:1: rule__Color__Group__1__Impl : ( '=' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2586:1: ( ( '=' ) )
            // InternalXDrone.g:2587:1: ( '=' )
            {
            // InternalXDrone.g:2587:1: ( '=' )
            // InternalXDrone.g:2588:2: '='
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
    // InternalXDrone.g:2597:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2601:1: ( rule__Color__Group__2__Impl )
            // InternalXDrone.g:2602:2: rule__Color__Group__2__Impl
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
    // InternalXDrone.g:2608:1: rule__Color__Group__2__Impl : ( ( rule__Color__Color_valueAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2612:1: ( ( ( rule__Color__Color_valueAssignment_2 ) ) )
            // InternalXDrone.g:2613:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            {
            // InternalXDrone.g:2613:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            // InternalXDrone.g:2614:2: ( rule__Color__Color_valueAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 
            // InternalXDrone.g:2615:2: ( rule__Color__Color_valueAssignment_2 )
            // InternalXDrone.g:2615:3: rule__Color__Color_valueAssignment_2
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
    // InternalXDrone.g:2624:1: rule__Walls__Group_0__0 : rule__Walls__Group_0__0__Impl rule__Walls__Group_0__1 ;
    public final void rule__Walls__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2628:1: ( rule__Walls__Group_0__0__Impl rule__Walls__Group_0__1 )
            // InternalXDrone.g:2629:2: rule__Walls__Group_0__0__Impl rule__Walls__Group_0__1
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
    // InternalXDrone.g:2636:1: rule__Walls__Group_0__0__Impl : ( 'WALLS' ) ;
    public final void rule__Walls__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2640:1: ( ( 'WALLS' ) )
            // InternalXDrone.g:2641:1: ( 'WALLS' )
            {
            // InternalXDrone.g:2641:1: ( 'WALLS' )
            // InternalXDrone.g:2642:2: 'WALLS'
            {
             before(grammarAccess.getWallsAccess().getWALLSKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalXDrone.g:2651:1: rule__Walls__Group_0__1 : rule__Walls__Group_0__1__Impl rule__Walls__Group_0__2 ;
    public final void rule__Walls__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2655:1: ( rule__Walls__Group_0__1__Impl rule__Walls__Group_0__2 )
            // InternalXDrone.g:2656:2: rule__Walls__Group_0__1__Impl rule__Walls__Group_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalXDrone.g:2663:1: rule__Walls__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Walls__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2667:1: ( ( '{' ) )
            // InternalXDrone.g:2668:1: ( '{' )
            {
            // InternalXDrone.g:2668:1: ( '{' )
            // InternalXDrone.g:2669:2: '{'
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
    // InternalXDrone.g:2678:1: rule__Walls__Group_0__2 : rule__Walls__Group_0__2__Impl ;
    public final void rule__Walls__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2682:1: ( rule__Walls__Group_0__2__Impl )
            // InternalXDrone.g:2683:2: rule__Walls__Group_0__2__Impl
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
    // InternalXDrone.g:2689:1: rule__Walls__Group_0__2__Impl : ( ( rule__Walls__FrontAssignment_0_2 ) ) ;
    public final void rule__Walls__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2693:1: ( ( ( rule__Walls__FrontAssignment_0_2 ) ) )
            // InternalXDrone.g:2694:1: ( ( rule__Walls__FrontAssignment_0_2 ) )
            {
            // InternalXDrone.g:2694:1: ( ( rule__Walls__FrontAssignment_0_2 ) )
            // InternalXDrone.g:2695:2: ( rule__Walls__FrontAssignment_0_2 )
            {
             before(grammarAccess.getWallsAccess().getFrontAssignment_0_2()); 
            // InternalXDrone.g:2696:2: ( rule__Walls__FrontAssignment_0_2 )
            // InternalXDrone.g:2696:3: rule__Walls__FrontAssignment_0_2
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
    // InternalXDrone.g:2705:1: rule__Walls__Group_4__0 : rule__Walls__Group_4__0__Impl rule__Walls__Group_4__1 ;
    public final void rule__Walls__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2709:1: ( rule__Walls__Group_4__0__Impl rule__Walls__Group_4__1 )
            // InternalXDrone.g:2710:2: rule__Walls__Group_4__0__Impl rule__Walls__Group_4__1
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
    // InternalXDrone.g:2717:1: rule__Walls__Group_4__0__Impl : ( ( rule__Walls__UpAssignment_4_0 ) ) ;
    public final void rule__Walls__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2721:1: ( ( ( rule__Walls__UpAssignment_4_0 ) ) )
            // InternalXDrone.g:2722:1: ( ( rule__Walls__UpAssignment_4_0 ) )
            {
            // InternalXDrone.g:2722:1: ( ( rule__Walls__UpAssignment_4_0 ) )
            // InternalXDrone.g:2723:2: ( rule__Walls__UpAssignment_4_0 )
            {
             before(grammarAccess.getWallsAccess().getUpAssignment_4_0()); 
            // InternalXDrone.g:2724:2: ( rule__Walls__UpAssignment_4_0 )
            // InternalXDrone.g:2724:3: rule__Walls__UpAssignment_4_0
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
    // InternalXDrone.g:2732:1: rule__Walls__Group_4__1 : rule__Walls__Group_4__1__Impl ;
    public final void rule__Walls__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2736:1: ( rule__Walls__Group_4__1__Impl )
            // InternalXDrone.g:2737:2: rule__Walls__Group_4__1__Impl
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
    // InternalXDrone.g:2743:1: rule__Walls__Group_4__1__Impl : ( '}' ) ;
    public final void rule__Walls__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2747:1: ( ( '}' ) )
            // InternalXDrone.g:2748:1: ( '}' )
            {
            // InternalXDrone.g:2748:1: ( '}' )
            // InternalXDrone.g:2749:2: '}'
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
    // InternalXDrone.g:2759:1: rule__Front__Group__0 : rule__Front__Group__0__Impl rule__Front__Group__1 ;
    public final void rule__Front__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2763:1: ( rule__Front__Group__0__Impl rule__Front__Group__1 )
            // InternalXDrone.g:2764:2: rule__Front__Group__0__Impl rule__Front__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2771:1: rule__Front__Group__0__Impl : ( 'front' ) ;
    public final void rule__Front__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2775:1: ( ( 'front' ) )
            // InternalXDrone.g:2776:1: ( 'front' )
            {
            // InternalXDrone.g:2776:1: ( 'front' )
            // InternalXDrone.g:2777:2: 'front'
            {
             before(grammarAccess.getFrontAccess().getFrontKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalXDrone.g:2786:1: rule__Front__Group__1 : rule__Front__Group__1__Impl rule__Front__Group__2 ;
    public final void rule__Front__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2790:1: ( rule__Front__Group__1__Impl rule__Front__Group__2 )
            // InternalXDrone.g:2791:2: rule__Front__Group__1__Impl rule__Front__Group__2
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
    // InternalXDrone.g:2798:1: rule__Front__Group__1__Impl : ( '=' ) ;
    public final void rule__Front__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2802:1: ( ( '=' ) )
            // InternalXDrone.g:2803:1: ( '=' )
            {
            // InternalXDrone.g:2803:1: ( '=' )
            // InternalXDrone.g:2804:2: '='
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
    // InternalXDrone.g:2813:1: rule__Front__Group__2 : rule__Front__Group__2__Impl ;
    public final void rule__Front__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2817:1: ( rule__Front__Group__2__Impl )
            // InternalXDrone.g:2818:2: rule__Front__Group__2__Impl
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
    // InternalXDrone.g:2824:1: rule__Front__Group__2__Impl : ( ( rule__Front__ValueAssignment_2 ) ) ;
    public final void rule__Front__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2828:1: ( ( ( rule__Front__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2829:1: ( ( rule__Front__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2829:1: ( ( rule__Front__ValueAssignment_2 ) )
            // InternalXDrone.g:2830:2: ( rule__Front__ValueAssignment_2 )
            {
             before(grammarAccess.getFrontAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2831:2: ( rule__Front__ValueAssignment_2 )
            // InternalXDrone.g:2831:3: rule__Front__ValueAssignment_2
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
    // InternalXDrone.g:2840:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2844:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:2845:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2852:1: rule__Right__Group__0__Impl : ( 'right' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2856:1: ( ( 'right' ) )
            // InternalXDrone.g:2857:1: ( 'right' )
            {
            // InternalXDrone.g:2857:1: ( 'right' )
            // InternalXDrone.g:2858:2: 'right'
            {
             before(grammarAccess.getRightAccess().getRightKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalXDrone.g:2867:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2871:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:2872:2: rule__Right__Group__1__Impl rule__Right__Group__2
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
    // InternalXDrone.g:2879:1: rule__Right__Group__1__Impl : ( '=' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2883:1: ( ( '=' ) )
            // InternalXDrone.g:2884:1: ( '=' )
            {
            // InternalXDrone.g:2884:1: ( '=' )
            // InternalXDrone.g:2885:2: '='
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
    // InternalXDrone.g:2894:1: rule__Right__Group__2 : rule__Right__Group__2__Impl ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2898:1: ( rule__Right__Group__2__Impl )
            // InternalXDrone.g:2899:2: rule__Right__Group__2__Impl
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
    // InternalXDrone.g:2905:1: rule__Right__Group__2__Impl : ( ( rule__Right__ValueAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2909:1: ( ( ( rule__Right__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2910:1: ( ( rule__Right__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2910:1: ( ( rule__Right__ValueAssignment_2 ) )
            // InternalXDrone.g:2911:2: ( rule__Right__ValueAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2912:2: ( rule__Right__ValueAssignment_2 )
            // InternalXDrone.g:2912:3: rule__Right__ValueAssignment_2
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
    // InternalXDrone.g:2921:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2925:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:2926:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2933:1: rule__Left__Group__0__Impl : ( 'left' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2937:1: ( ( 'left' ) )
            // InternalXDrone.g:2938:1: ( 'left' )
            {
            // InternalXDrone.g:2938:1: ( 'left' )
            // InternalXDrone.g:2939:2: 'left'
            {
             before(grammarAccess.getLeftAccess().getLeftKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:2948:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2952:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:2953:2: rule__Left__Group__1__Impl rule__Left__Group__2
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
    // InternalXDrone.g:2960:1: rule__Left__Group__1__Impl : ( '=' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2964:1: ( ( '=' ) )
            // InternalXDrone.g:2965:1: ( '=' )
            {
            // InternalXDrone.g:2965:1: ( '=' )
            // InternalXDrone.g:2966:2: '='
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
    // InternalXDrone.g:2975:1: rule__Left__Group__2 : rule__Left__Group__2__Impl ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2979:1: ( rule__Left__Group__2__Impl )
            // InternalXDrone.g:2980:2: rule__Left__Group__2__Impl
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
    // InternalXDrone.g:2986:1: rule__Left__Group__2__Impl : ( ( rule__Left__ValueAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2990:1: ( ( ( rule__Left__ValueAssignment_2 ) ) )
            // InternalXDrone.g:2991:1: ( ( rule__Left__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:2991:1: ( ( rule__Left__ValueAssignment_2 ) )
            // InternalXDrone.g:2992:2: ( rule__Left__ValueAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getValueAssignment_2()); 
            // InternalXDrone.g:2993:2: ( rule__Left__ValueAssignment_2 )
            // InternalXDrone.g:2993:3: rule__Left__ValueAssignment_2
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
    // InternalXDrone.g:3002:1: rule__Back__Group__0 : rule__Back__Group__0__Impl rule__Back__Group__1 ;
    public final void rule__Back__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3006:1: ( rule__Back__Group__0__Impl rule__Back__Group__1 )
            // InternalXDrone.g:3007:2: rule__Back__Group__0__Impl rule__Back__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:3014:1: rule__Back__Group__0__Impl : ( 'back' ) ;
    public final void rule__Back__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3018:1: ( ( 'back' ) )
            // InternalXDrone.g:3019:1: ( 'back' )
            {
            // InternalXDrone.g:3019:1: ( 'back' )
            // InternalXDrone.g:3020:2: 'back'
            {
             before(grammarAccess.getBackAccess().getBackKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalXDrone.g:3029:1: rule__Back__Group__1 : rule__Back__Group__1__Impl rule__Back__Group__2 ;
    public final void rule__Back__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3033:1: ( rule__Back__Group__1__Impl rule__Back__Group__2 )
            // InternalXDrone.g:3034:2: rule__Back__Group__1__Impl rule__Back__Group__2
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
    // InternalXDrone.g:3041:1: rule__Back__Group__1__Impl : ( '=' ) ;
    public final void rule__Back__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3045:1: ( ( '=' ) )
            // InternalXDrone.g:3046:1: ( '=' )
            {
            // InternalXDrone.g:3046:1: ( '=' )
            // InternalXDrone.g:3047:2: '='
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
    // InternalXDrone.g:3056:1: rule__Back__Group__2 : rule__Back__Group__2__Impl ;
    public final void rule__Back__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3060:1: ( rule__Back__Group__2__Impl )
            // InternalXDrone.g:3061:2: rule__Back__Group__2__Impl
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
    // InternalXDrone.g:3067:1: rule__Back__Group__2__Impl : ( ( rule__Back__ValueAssignment_2 ) ) ;
    public final void rule__Back__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3071:1: ( ( ( rule__Back__ValueAssignment_2 ) ) )
            // InternalXDrone.g:3072:1: ( ( rule__Back__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:3072:1: ( ( rule__Back__ValueAssignment_2 ) )
            // InternalXDrone.g:3073:2: ( rule__Back__ValueAssignment_2 )
            {
             before(grammarAccess.getBackAccess().getValueAssignment_2()); 
            // InternalXDrone.g:3074:2: ( rule__Back__ValueAssignment_2 )
            // InternalXDrone.g:3074:3: rule__Back__ValueAssignment_2
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
    // InternalXDrone.g:3083:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3087:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:3088:2: rule__Up__Group__0__Impl rule__Up__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:3095:1: rule__Up__Group__0__Impl : ( 'up' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3099:1: ( ( 'up' ) )
            // InternalXDrone.g:3100:1: ( 'up' )
            {
            // InternalXDrone.g:3100:1: ( 'up' )
            // InternalXDrone.g:3101:2: 'up'
            {
             before(grammarAccess.getUpAccess().getUpKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalXDrone.g:3110:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3114:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:3115:2: rule__Up__Group__1__Impl rule__Up__Group__2
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
    // InternalXDrone.g:3122:1: rule__Up__Group__1__Impl : ( '=' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3126:1: ( ( '=' ) )
            // InternalXDrone.g:3127:1: ( '=' )
            {
            // InternalXDrone.g:3127:1: ( '=' )
            // InternalXDrone.g:3128:2: '='
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
    // InternalXDrone.g:3137:1: rule__Up__Group__2 : rule__Up__Group__2__Impl ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3141:1: ( rule__Up__Group__2__Impl )
            // InternalXDrone.g:3142:2: rule__Up__Group__2__Impl
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
    // InternalXDrone.g:3148:1: rule__Up__Group__2__Impl : ( ( rule__Up__ValueAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3152:1: ( ( ( rule__Up__ValueAssignment_2 ) ) )
            // InternalXDrone.g:3153:1: ( ( rule__Up__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:3153:1: ( ( rule__Up__ValueAssignment_2 ) )
            // InternalXDrone.g:3154:2: ( rule__Up__ValueAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getValueAssignment_2()); 
            // InternalXDrone.g:3155:2: ( rule__Up__ValueAssignment_2 )
            // InternalXDrone.g:3155:3: rule__Up__ValueAssignment_2
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


    // $ANTLR start "rule__Walls__UnorderedGroup"
    // InternalXDrone.g:3164:1: rule__Walls__UnorderedGroup : rule__Walls__UnorderedGroup__0 {...}?;
    public final void rule__Walls__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getWallsAccess().getUnorderedGroup());
        	
        try {
            // InternalXDrone.g:3169:1: ( rule__Walls__UnorderedGroup__0 {...}?)
            // InternalXDrone.g:3170:2: rule__Walls__UnorderedGroup__0 {...}?
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
    // InternalXDrone.g:3178:1: rule__Walls__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) ) ;
    public final void rule__Walls__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXDrone.g:3183:1: ( ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) ) )
            // InternalXDrone.g:3184:3: ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) )
            {
            // InternalXDrone.g:3184:3: ( ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) ) | ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) ) )
            int alt13=5;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {
                alt13=2;
            }
            else if ( LA13_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {
                alt13=3;
            }
            else if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {
                alt13=4;
            }
            else if ( LA13_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {
                alt13=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXDrone.g:3185:3: ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) )
                    {
                    // InternalXDrone.g:3185:3: ({...}? => ( ( ( rule__Walls__Group_0__0 ) ) ) )
                    // InternalXDrone.g:3186:4: {...}? => ( ( ( rule__Walls__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalXDrone.g:3186:99: ( ( ( rule__Walls__Group_0__0 ) ) )
                    // InternalXDrone.g:3187:5: ( ( rule__Walls__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3193:5: ( ( rule__Walls__Group_0__0 ) )
                    // InternalXDrone.g:3194:6: ( rule__Walls__Group_0__0 )
                    {
                     before(grammarAccess.getWallsAccess().getGroup_0()); 
                    // InternalXDrone.g:3195:6: ( rule__Walls__Group_0__0 )
                    // InternalXDrone.g:3195:7: rule__Walls__Group_0__0
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
                    // InternalXDrone.g:3200:3: ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) )
                    {
                    // InternalXDrone.g:3200:3: ({...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) ) )
                    // InternalXDrone.g:3201:4: {...}? => ( ( ( rule__Walls__RightAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalXDrone.g:3201:99: ( ( ( rule__Walls__RightAssignment_1 ) ) )
                    // InternalXDrone.g:3202:5: ( ( rule__Walls__RightAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3208:5: ( ( rule__Walls__RightAssignment_1 ) )
                    // InternalXDrone.g:3209:6: ( rule__Walls__RightAssignment_1 )
                    {
                     before(grammarAccess.getWallsAccess().getRightAssignment_1()); 
                    // InternalXDrone.g:3210:6: ( rule__Walls__RightAssignment_1 )
                    // InternalXDrone.g:3210:7: rule__Walls__RightAssignment_1
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
                    // InternalXDrone.g:3215:3: ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) )
                    {
                    // InternalXDrone.g:3215:3: ({...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) ) )
                    // InternalXDrone.g:3216:4: {...}? => ( ( ( rule__Walls__BackAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalXDrone.g:3216:99: ( ( ( rule__Walls__BackAssignment_2 ) ) )
                    // InternalXDrone.g:3217:5: ( ( rule__Walls__BackAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3223:5: ( ( rule__Walls__BackAssignment_2 ) )
                    // InternalXDrone.g:3224:6: ( rule__Walls__BackAssignment_2 )
                    {
                     before(grammarAccess.getWallsAccess().getBackAssignment_2()); 
                    // InternalXDrone.g:3225:6: ( rule__Walls__BackAssignment_2 )
                    // InternalXDrone.g:3225:7: rule__Walls__BackAssignment_2
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
                    // InternalXDrone.g:3230:3: ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) )
                    {
                    // InternalXDrone.g:3230:3: ({...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) ) )
                    // InternalXDrone.g:3231:4: {...}? => ( ( ( rule__Walls__LeftAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalXDrone.g:3231:99: ( ( ( rule__Walls__LeftAssignment_3 ) ) )
                    // InternalXDrone.g:3232:5: ( ( rule__Walls__LeftAssignment_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3238:5: ( ( rule__Walls__LeftAssignment_3 ) )
                    // InternalXDrone.g:3239:6: ( rule__Walls__LeftAssignment_3 )
                    {
                     before(grammarAccess.getWallsAccess().getLeftAssignment_3()); 
                    // InternalXDrone.g:3240:6: ( rule__Walls__LeftAssignment_3 )
                    // InternalXDrone.g:3240:7: rule__Walls__LeftAssignment_3
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
                    // InternalXDrone.g:3245:3: ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) )
                    {
                    // InternalXDrone.g:3245:3: ({...}? => ( ( ( rule__Walls__Group_4__0 ) ) ) )
                    // InternalXDrone.g:3246:4: {...}? => ( ( ( rule__Walls__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Walls__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalXDrone.g:3246:99: ( ( ( rule__Walls__Group_4__0 ) ) )
                    // InternalXDrone.g:3247:5: ( ( rule__Walls__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3253:5: ( ( rule__Walls__Group_4__0 ) )
                    // InternalXDrone.g:3254:6: ( rule__Walls__Group_4__0 )
                    {
                     before(grammarAccess.getWallsAccess().getGroup_4()); 
                    // InternalXDrone.g:3255:6: ( rule__Walls__Group_4__0 )
                    // InternalXDrone.g:3255:7: rule__Walls__Group_4__0
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
    // InternalXDrone.g:3268:1: rule__Walls__UnorderedGroup__0 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__1 )? ;
    public final void rule__Walls__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3272:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__1 )? )
            // InternalXDrone.g:3273:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_25);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3274:2: ( rule__Walls__UnorderedGroup__1 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalXDrone.g:3274:2: rule__Walls__UnorderedGroup__1
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
    // InternalXDrone.g:3280:1: rule__Walls__UnorderedGroup__1 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__2 )? ;
    public final void rule__Walls__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3284:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__2 )? )
            // InternalXDrone.g:3285:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_25);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3286:2: ( rule__Walls__UnorderedGroup__2 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalXDrone.g:3286:2: rule__Walls__UnorderedGroup__2
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
    // InternalXDrone.g:3292:1: rule__Walls__UnorderedGroup__2 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__3 )? ;
    public final void rule__Walls__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3296:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__3 )? )
            // InternalXDrone.g:3297:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_25);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3298:2: ( rule__Walls__UnorderedGroup__3 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalXDrone.g:3298:2: rule__Walls__UnorderedGroup__3
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
    // InternalXDrone.g:3304:1: rule__Walls__UnorderedGroup__3 : rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__4 )? ;
    public final void rule__Walls__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3308:1: ( rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__4 )? )
            // InternalXDrone.g:3309:2: rule__Walls__UnorderedGroup__Impl ( rule__Walls__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_25);
            rule__Walls__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3310:2: ( rule__Walls__UnorderedGroup__4 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalXDrone.g:3310:2: rule__Walls__UnorderedGroup__4
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
    // InternalXDrone.g:3316:1: rule__Walls__UnorderedGroup__4 : rule__Walls__UnorderedGroup__Impl ;
    public final void rule__Walls__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3320:1: ( rule__Walls__UnorderedGroup__Impl )
            // InternalXDrone.g:3321:2: rule__Walls__UnorderedGroup__Impl
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
    // InternalXDrone.g:3328:1: rule__Program__MainAssignment : ( ruleMain ) ;
    public final void rule__Program__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3332:1: ( ( ruleMain ) )
            // InternalXDrone.g:3333:2: ( ruleMain )
            {
            // InternalXDrone.g:3333:2: ( ruleMain )
            // InternalXDrone.g:3334:3: ruleMain
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
    // InternalXDrone.g:3343:1: rule__Main__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Main__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3347:1: ( ( ruleFly ) )
            // InternalXDrone.g:3348:2: ( ruleFly )
            {
            // InternalXDrone.g:3348:2: ( ruleFly )
            // InternalXDrone.g:3349:3: ruleFly
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
    // InternalXDrone.g:3358:1: rule__Main__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Main__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3362:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:3363:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:3363:2: ( ruleEnvironment )
            // InternalXDrone.g:3364:3: ruleEnvironment
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
    // InternalXDrone.g:3373:1: rule__Fly__TakeoffAssignment_1_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3377:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:3378:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:3378:2: ( ruleTakeoff )
            // InternalXDrone.g:3379:3: ruleTakeoff
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
    // InternalXDrone.g:3388:1: rule__Fly__CommandsAssignment_1_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3392:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:3393:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:3393:2: ( ruleSuperCommand )
            // InternalXDrone.g:3394:3: ruleSuperCommand
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
    // InternalXDrone.g:3403:1: rule__Fly__LandAssignment_1_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3407:1: ( ( ruleLand ) )
            // InternalXDrone.g:3408:2: ( ruleLand )
            {
            // InternalXDrone.g:3408:2: ( ruleLand )
            // InternalXDrone.g:3409:3: ruleLand
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
    // InternalXDrone.g:3418:1: rule__Environment__DroneAssignment_2_0 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3422:1: ( ( ruleDrone ) )
            // InternalXDrone.g:3423:2: ( ruleDrone )
            {
            // InternalXDrone.g:3423:2: ( ruleDrone )
            // InternalXDrone.g:3424:3: ruleDrone
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
    // InternalXDrone.g:3433:1: rule__Environment__WallsAssignment_2_1 : ( ruleWalls ) ;
    public final void rule__Environment__WallsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3437:1: ( ( ruleWalls ) )
            // InternalXDrone.g:3438:2: ( ruleWalls )
            {
            // InternalXDrone.g:3438:2: ( ruleWalls )
            // InternalXDrone.g:3439:3: ruleWalls
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
    // InternalXDrone.g:3448:1: rule__Environment__ObjectsAssignment_2_2 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3452:1: ( ( ruleObject ) )
            // InternalXDrone.g:3453:2: ( ruleObject )
            {
            // InternalXDrone.g:3453:2: ( ruleObject )
            // InternalXDrone.g:3454:3: ruleObject
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


    // $ANTLR start "rule__GoTo__Object_nameAssignment_2"
    // InternalXDrone.g:3463:1: rule__GoTo__Object_nameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoTo__Object_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3467:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:3468:2: ( RULE_STRING )
            {
            // InternalXDrone.g:3468:2: ( RULE_STRING )
            // InternalXDrone.g:3469:3: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getObject_nameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getObject_nameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Object_nameAssignment_2"


    // $ANTLR start "rule__Move__VectorAssignment_1"
    // InternalXDrone.g:3478:1: rule__Move__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Move__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3482:1: ( ( ruleVector ) )
            // InternalXDrone.g:3483:2: ( ruleVector )
            {
            // InternalXDrone.g:3483:2: ( ruleVector )
            // InternalXDrone.g:3484:3: ruleVector
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
    // InternalXDrone.g:3493:1: rule__Rotate__AngleAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Rotate__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3497:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3498:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3498:2: ( ruleDOUBLE )
            // InternalXDrone.g:3499:3: ruleDOUBLE
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
    // InternalXDrone.g:3508:1: rule__Wait__SecondsAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3512:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3513:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3513:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3514:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:3523:1: rule__FunctionName__Func_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionName__Func_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3527:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3528:2: ( RULE_ID )
            {
            // InternalXDrone.g:3528:2: ( RULE_ID )
            // InternalXDrone.g:3529:3: RULE_ID
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


    // $ANTLR start "rule__Drone__PositionAssignment_2_0"
    // InternalXDrone.g:3538:1: rule__Drone__PositionAssignment_2_0 : ( rulePosition ) ;
    public final void rule__Drone__PositionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3542:1: ( ( rulePosition ) )
            // InternalXDrone.g:3543:2: ( rulePosition )
            {
            // InternalXDrone.g:3543:2: ( rulePosition )
            // InternalXDrone.g:3544:3: rulePosition
            {
             before(grammarAccess.getDroneAccess().getPositionPositionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getPositionPositionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__PositionAssignment_2_0"


    // $ANTLR start "rule__Drone__RotationAssignment_2_1_2"
    // InternalXDrone.g:3553:1: rule__Drone__RotationAssignment_2_1_2 : ( ruleDOUBLE ) ;
    public final void rule__Drone__RotationAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3557:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3558:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3558:2: ( ruleDOUBLE )
            // InternalXDrone.g:3559:3: ruleDOUBLE
            {
             before(grammarAccess.getDroneAccess().getRotationDOUBLEParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getRotationDOUBLEParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__RotationAssignment_2_1_2"


    // $ANTLR start "rule__Object__Object_nameAssignment_0"
    // InternalXDrone.g:3568:1: rule__Object__Object_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3572:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3573:2: ( RULE_ID )
            {
            // InternalXDrone.g:3573:2: ( RULE_ID )
            // InternalXDrone.g:3574:3: RULE_ID
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


    // $ANTLR start "rule__Object__OriginAssignment_2_0"
    // InternalXDrone.g:3583:1: rule__Object__OriginAssignment_2_0 : ( ruleOrigin ) ;
    public final void rule__Object__OriginAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3587:1: ( ( ruleOrigin ) )
            // InternalXDrone.g:3588:2: ( ruleOrigin )
            {
            // InternalXDrone.g:3588:2: ( ruleOrigin )
            // InternalXDrone.g:3589:3: ruleOrigin
            {
             before(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__OriginAssignment_2_0"


    // $ANTLR start "rule__Object__SizeAssignment_2_1"
    // InternalXDrone.g:3598:1: rule__Object__SizeAssignment_2_1 : ( ruleSize ) ;
    public final void rule__Object__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3602:1: ( ( ruleSize ) )
            // InternalXDrone.g:3603:2: ( ruleSize )
            {
            // InternalXDrone.g:3603:2: ( ruleSize )
            // InternalXDrone.g:3604:3: ruleSize
            {
             before(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__SizeAssignment_2_1"


    // $ANTLR start "rule__Object__ColorAssignment_2_2"
    // InternalXDrone.g:3613:1: rule__Object__ColorAssignment_2_2 : ( ruleColor ) ;
    public final void rule__Object__ColorAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3617:1: ( ( ruleColor ) )
            // InternalXDrone.g:3618:2: ( ruleColor )
            {
            // InternalXDrone.g:3618:2: ( ruleColor )
            // InternalXDrone.g:3619:3: ruleColor
            {
             before(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ColorAssignment_2_2"


    // $ANTLR start "rule__Origin__VectorAssignment_2"
    // InternalXDrone.g:3628:1: rule__Origin__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Origin__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3632:1: ( ( ruleVector ) )
            // InternalXDrone.g:3633:2: ( ruleVector )
            {
            // InternalXDrone.g:3633:2: ( ruleVector )
            // InternalXDrone.g:3634:3: ruleVector
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
    // InternalXDrone.g:3643:1: rule__Size__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Size__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3647:1: ( ( ruleVector ) )
            // InternalXDrone.g:3648:2: ( ruleVector )
            {
            // InternalXDrone.g:3648:2: ( ruleVector )
            // InternalXDrone.g:3649:3: ruleVector
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


    // $ANTLR start "rule__Position__VectorAssignment_2"
    // InternalXDrone.g:3658:1: rule__Position__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Position__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3662:1: ( ( ruleVector ) )
            // InternalXDrone.g:3663:2: ( ruleVector )
            {
            // InternalXDrone.g:3663:2: ( ruleVector )
            // InternalXDrone.g:3664:3: ruleVector
            {
             before(grammarAccess.getPositionAccess().getVectorVectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getVectorVectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__VectorAssignment_2"


    // $ANTLR start "rule__Vector__XAssignment_1"
    // InternalXDrone.g:3673:1: rule__Vector__XAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Vector__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3677:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3678:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3678:2: ( ruleDOUBLE )
            // InternalXDrone.g:3679:3: ruleDOUBLE
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
    // InternalXDrone.g:3688:1: rule__Vector__YAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Vector__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3692:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3693:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3693:2: ( ruleDOUBLE )
            // InternalXDrone.g:3694:3: ruleDOUBLE
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
    // InternalXDrone.g:3703:1: rule__Vector__ZAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Vector__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3707:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3708:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3708:2: ( ruleDOUBLE )
            // InternalXDrone.g:3709:3: ruleDOUBLE
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
    // InternalXDrone.g:3718:1: rule__Color__Color_valueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__Color_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3722:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:3723:2: ( RULE_STRING )
            {
            // InternalXDrone.g:3723:2: ( RULE_STRING )
            // InternalXDrone.g:3724:3: RULE_STRING
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
    // InternalXDrone.g:3733:1: rule__Walls__FrontAssignment_0_2 : ( ruleFront ) ;
    public final void rule__Walls__FrontAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3737:1: ( ( ruleFront ) )
            // InternalXDrone.g:3738:2: ( ruleFront )
            {
            // InternalXDrone.g:3738:2: ( ruleFront )
            // InternalXDrone.g:3739:3: ruleFront
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
    // InternalXDrone.g:3748:1: rule__Walls__RightAssignment_1 : ( ruleRight ) ;
    public final void rule__Walls__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3752:1: ( ( ruleRight ) )
            // InternalXDrone.g:3753:2: ( ruleRight )
            {
            // InternalXDrone.g:3753:2: ( ruleRight )
            // InternalXDrone.g:3754:3: ruleRight
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
    // InternalXDrone.g:3763:1: rule__Walls__BackAssignment_2 : ( ruleBack ) ;
    public final void rule__Walls__BackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3767:1: ( ( ruleBack ) )
            // InternalXDrone.g:3768:2: ( ruleBack )
            {
            // InternalXDrone.g:3768:2: ( ruleBack )
            // InternalXDrone.g:3769:3: ruleBack
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
    // InternalXDrone.g:3778:1: rule__Walls__LeftAssignment_3 : ( ruleLeft ) ;
    public final void rule__Walls__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3782:1: ( ( ruleLeft ) )
            // InternalXDrone.g:3783:2: ( ruleLeft )
            {
            // InternalXDrone.g:3783:2: ( ruleLeft )
            // InternalXDrone.g:3784:3: ruleLeft
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
    // InternalXDrone.g:3793:1: rule__Walls__UpAssignment_4_0 : ( ruleUp ) ;
    public final void rule__Walls__UpAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3797:1: ( ( ruleUp ) )
            // InternalXDrone.g:3798:2: ( ruleUp )
            {
            // InternalXDrone.g:3798:2: ( ruleUp )
            // InternalXDrone.g:3799:3: ruleUp
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
    // InternalXDrone.g:3808:1: rule__Front__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Front__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3812:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3813:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3813:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3814:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:3823:1: rule__Right__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Right__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3827:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3828:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3828:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3829:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:3838:1: rule__Left__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Left__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3842:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3843:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3843:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3844:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:3853:1: rule__Back__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Back__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3857:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3858:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3858:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3859:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:3868:1: rule__Up__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Up__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3872:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:3873:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:3873:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:3874:3: rulePOSITIVE_DOUBLE
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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\6\26\uffff";
    static final String dfa_3s = "\1\6\1\32\4\34\1\uffff\1\43\4\4\1\34\3\0\1\16\1\4\1\uffff\1\0\1\4\1\0\1\16";
    static final String dfa_4s = "\1\47\1\32\4\34\1\uffff\1\43\4\4\1\34\3\0\1\21\1\4\1\uffff\1\0\1\4\1\0\1\16";
    static final String dfa_5s = "\6\uffff\1\2\13\uffff\1\1\4\uffff";
    static final String dfa_6s = "\15\uffff\1\2\1\1\1\3\3\uffff\1\4\1\uffff\1\0\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\7\uffff\1\6\12\uffff\1\6\10\uffff\1\1\1\uffff\1\2\1\4\1\3\1\5",
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

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3274:2: ( rule__Walls__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_14 = input.LA(1);

                         
                        int index14_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_13 = input.LA(1);

                         
                        int index14_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_15 = input.LA(1);

                         
                        int index14_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_19 = input.LA(1);

                         
                        int index14_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index14_19);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\15\uffff\1\0\1\4\1\1\3\uffff\1\2\1\uffff\1\3\1\uffff}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3286:2: ( rule__Walls__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_15 = input.LA(1);

                         
                        int index15_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3298:2: ( rule__Walls__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_13 = input.LA(1);

                         
                        int index16_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_15 = input.LA(1);

                         
                        int index16_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_19 = input.LA(1);

                         
                        int index16_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_19);
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
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_9s = "\1\6\1\32\4\34\1\uffff\1\43\4\4\1\34\3\0\1\16\1\4\1\uffff\1\4\2\0\1\16";
    static final String dfa_10s = "\1\47\1\32\4\34\1\uffff\1\43\4\4\1\34\3\0\1\21\1\4\1\uffff\1\4\2\0\1\16";
    static final String dfa_11s = "\15\uffff\1\4\1\0\1\3\4\uffff\1\2\1\1\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\6\7\uffff\1\6\12\uffff\1\6\10\uffff\1\1\1\uffff\1\2\1\4\1\3\1\5",
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
            "\1\24\2\uffff\1\23",
            "\1\25",
            "",
            "\1\26",
            "\1\uffff",
            "\1\uffff",
            "\1\24"
    };
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_5;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "3310:2: ( rule__Walls__UnorderedGroup__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_21 = input.LA(1);

                         
                        int index17_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_20 = input.LA(1);

                         
                        int index17_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_13 = input.LA(1);

                         
                        int index17_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 18;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 6;}

                         
                        input.seek(index17_13);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000F402004040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000F402000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000088004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000260004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000260000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000F400000002L});

}

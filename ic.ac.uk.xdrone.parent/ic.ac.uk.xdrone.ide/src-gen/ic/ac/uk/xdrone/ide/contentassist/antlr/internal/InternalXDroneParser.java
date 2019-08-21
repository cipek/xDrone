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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF()'", "'LAND()'", "'fly(){'", "'}'", "'environment(){'", "'-'", "'.'", "'GOTO'", "'('", "')'", "'ROTATE'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'WAIT'", "'DRONE'", "'{'", "'rotation'", "'='", "'origin'", "'size'", "'position'", "','", "'color'", "'WALLS'", "'front'", "'right'", "'left'", "'back'", "'up'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalXDrone.g:212:1: ruleSuperCommand : ( ruleCommand ) ;
    public final void ruleSuperCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:216:2: ( ( ruleCommand ) )
            // InternalXDrone.g:217:2: ( ruleCommand )
            {
            // InternalXDrone.g:217:2: ( ruleCommand )
            // InternalXDrone.g:218:3: ruleCommand
            {
             before(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRotate"
    // InternalXDrone.g:328:1: entryRuleRotate : ruleRotate EOF ;
    public final void entryRuleRotate() throws RecognitionException {
        try {
            // InternalXDrone.g:329:1: ( ruleRotate EOF )
            // InternalXDrone.g:330:1: ruleRotate EOF
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
    // InternalXDrone.g:337:1: ruleRotate : ( ( rule__Rotate__Group__0 ) ) ;
    public final void ruleRotate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:341:2: ( ( ( rule__Rotate__Group__0 ) ) )
            // InternalXDrone.g:342:2: ( ( rule__Rotate__Group__0 ) )
            {
            // InternalXDrone.g:342:2: ( ( rule__Rotate__Group__0 ) )
            // InternalXDrone.g:343:3: ( rule__Rotate__Group__0 )
            {
             before(grammarAccess.getRotateAccess().getGroup()); 
            // InternalXDrone.g:344:3: ( rule__Rotate__Group__0 )
            // InternalXDrone.g:344:4: rule__Rotate__Group__0
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
    // InternalXDrone.g:353:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalXDrone.g:354:1: ( ruleUp EOF )
            // InternalXDrone.g:355:1: ruleUp EOF
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
    // InternalXDrone.g:362:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:366:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalXDrone.g:367:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalXDrone.g:367:2: ( ( rule__Up__Group__0 ) )
            // InternalXDrone.g:368:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalXDrone.g:369:3: ( rule__Up__Group__0 )
            // InternalXDrone.g:369:4: rule__Up__Group__0
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
    // InternalXDrone.g:378:1: entryRuleDown : ruleDown EOF ;
    public final void entryRuleDown() throws RecognitionException {
        try {
            // InternalXDrone.g:379:1: ( ruleDown EOF )
            // InternalXDrone.g:380:1: ruleDown EOF
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
    // InternalXDrone.g:387:1: ruleDown : ( ( rule__Down__Group__0 ) ) ;
    public final void ruleDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:391:2: ( ( ( rule__Down__Group__0 ) ) )
            // InternalXDrone.g:392:2: ( ( rule__Down__Group__0 ) )
            {
            // InternalXDrone.g:392:2: ( ( rule__Down__Group__0 ) )
            // InternalXDrone.g:393:3: ( rule__Down__Group__0 )
            {
             before(grammarAccess.getDownAccess().getGroup()); 
            // InternalXDrone.g:394:3: ( rule__Down__Group__0 )
            // InternalXDrone.g:394:4: rule__Down__Group__0
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
    // InternalXDrone.g:403:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalXDrone.g:404:1: ( ruleLeft EOF )
            // InternalXDrone.g:405:1: ruleLeft EOF
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
    // InternalXDrone.g:412:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:416:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalXDrone.g:417:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalXDrone.g:417:2: ( ( rule__Left__Group__0 ) )
            // InternalXDrone.g:418:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalXDrone.g:419:3: ( rule__Left__Group__0 )
            // InternalXDrone.g:419:4: rule__Left__Group__0
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
    // InternalXDrone.g:428:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalXDrone.g:429:1: ( ruleRight EOF )
            // InternalXDrone.g:430:1: ruleRight EOF
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
    // InternalXDrone.g:437:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:441:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalXDrone.g:442:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalXDrone.g:442:2: ( ( rule__Right__Group__0 ) )
            // InternalXDrone.g:443:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalXDrone.g:444:3: ( rule__Right__Group__0 )
            // InternalXDrone.g:444:4: rule__Right__Group__0
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
    // InternalXDrone.g:453:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalXDrone.g:454:1: ( ruleForward EOF )
            // InternalXDrone.g:455:1: ruleForward EOF
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
    // InternalXDrone.g:462:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:466:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalXDrone.g:467:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalXDrone.g:467:2: ( ( rule__Forward__Group__0 ) )
            // InternalXDrone.g:468:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalXDrone.g:469:3: ( rule__Forward__Group__0 )
            // InternalXDrone.g:469:4: rule__Forward__Group__0
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
    // InternalXDrone.g:478:1: entryRuleBackward : ruleBackward EOF ;
    public final void entryRuleBackward() throws RecognitionException {
        try {
            // InternalXDrone.g:479:1: ( ruleBackward EOF )
            // InternalXDrone.g:480:1: ruleBackward EOF
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
    // InternalXDrone.g:487:1: ruleBackward : ( ( rule__Backward__Group__0 ) ) ;
    public final void ruleBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:491:2: ( ( ( rule__Backward__Group__0 ) ) )
            // InternalXDrone.g:492:2: ( ( rule__Backward__Group__0 ) )
            {
            // InternalXDrone.g:492:2: ( ( rule__Backward__Group__0 ) )
            // InternalXDrone.g:493:3: ( rule__Backward__Group__0 )
            {
             before(grammarAccess.getBackwardAccess().getGroup()); 
            // InternalXDrone.g:494:3: ( rule__Backward__Group__0 )
            // InternalXDrone.g:494:4: rule__Backward__Group__0
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


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:503:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalXDrone.g:504:1: ( ruleWait EOF )
            // InternalXDrone.g:505:1: ruleWait EOF
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
    // InternalXDrone.g:512:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:516:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalXDrone.g:517:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalXDrone.g:517:2: ( ( rule__Wait__Group__0 ) )
            // InternalXDrone.g:518:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalXDrone.g:519:3: ( rule__Wait__Group__0 )
            // InternalXDrone.g:519:4: rule__Wait__Group__0
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


    // $ANTLR start "entryRuleDrone"
    // InternalXDrone.g:528:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( ruleDrone EOF )
            // InternalXDrone.g:530:1: ruleDrone EOF
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
    // InternalXDrone.g:537:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__Drone__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__Drone__Group__0 )
            // InternalXDrone.g:544:4: rule__Drone__Group__0
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
    // InternalXDrone.g:553:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalXDrone.g:554:1: ( ruleObject EOF )
            // InternalXDrone.g:555:1: ruleObject EOF
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
    // InternalXDrone.g:562:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:566:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalXDrone.g:567:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalXDrone.g:567:2: ( ( rule__Object__Group__0 ) )
            // InternalXDrone.g:568:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalXDrone.g:569:3: ( rule__Object__Group__0 )
            // InternalXDrone.g:569:4: rule__Object__Group__0
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
    // InternalXDrone.g:578:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalXDrone.g:579:1: ( ruleOrigin EOF )
            // InternalXDrone.g:580:1: ruleOrigin EOF
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
    // InternalXDrone.g:587:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:591:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalXDrone.g:592:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalXDrone.g:592:2: ( ( rule__Origin__Group__0 ) )
            // InternalXDrone.g:593:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalXDrone.g:594:3: ( rule__Origin__Group__0 )
            // InternalXDrone.g:594:4: rule__Origin__Group__0
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
    // InternalXDrone.g:603:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalXDrone.g:604:1: ( ruleSize EOF )
            // InternalXDrone.g:605:1: ruleSize EOF
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
    // InternalXDrone.g:612:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:616:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalXDrone.g:617:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalXDrone.g:617:2: ( ( rule__Size__Group__0 ) )
            // InternalXDrone.g:618:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalXDrone.g:619:3: ( rule__Size__Group__0 )
            // InternalXDrone.g:619:4: rule__Size__Group__0
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
    // InternalXDrone.g:628:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalXDrone.g:629:1: ( rulePosition EOF )
            // InternalXDrone.g:630:1: rulePosition EOF
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
    // InternalXDrone.g:637:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:641:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalXDrone.g:642:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalXDrone.g:642:2: ( ( rule__Position__Group__0 ) )
            // InternalXDrone.g:643:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalXDrone.g:644:3: ( rule__Position__Group__0 )
            // InternalXDrone.g:644:4: rule__Position__Group__0
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
    // InternalXDrone.g:653:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // InternalXDrone.g:654:1: ( ruleVector EOF )
            // InternalXDrone.g:655:1: ruleVector EOF
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
    // InternalXDrone.g:662:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:666:2: ( ( ( rule__Vector__Group__0 ) ) )
            // InternalXDrone.g:667:2: ( ( rule__Vector__Group__0 ) )
            {
            // InternalXDrone.g:667:2: ( ( rule__Vector__Group__0 ) )
            // InternalXDrone.g:668:3: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // InternalXDrone.g:669:3: ( rule__Vector__Group__0 )
            // InternalXDrone.g:669:4: rule__Vector__Group__0
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
    // InternalXDrone.g:678:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalXDrone.g:679:1: ( ruleColor EOF )
            // InternalXDrone.g:680:1: ruleColor EOF
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
    // InternalXDrone.g:687:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:691:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalXDrone.g:692:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalXDrone.g:692:2: ( ( rule__Color__Group__0 ) )
            // InternalXDrone.g:693:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalXDrone.g:694:3: ( rule__Color__Group__0 )
            // InternalXDrone.g:694:4: rule__Color__Group__0
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
    // InternalXDrone.g:703:1: entryRuleWalls : ruleWalls EOF ;
    public final void entryRuleWalls() throws RecognitionException {
        try {
            // InternalXDrone.g:704:1: ( ruleWalls EOF )
            // InternalXDrone.g:705:1: ruleWalls EOF
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
    // InternalXDrone.g:712:1: ruleWalls : ( ( rule__Walls__Group__0 ) ) ;
    public final void ruleWalls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:716:2: ( ( ( rule__Walls__Group__0 ) ) )
            // InternalXDrone.g:717:2: ( ( rule__Walls__Group__0 ) )
            {
            // InternalXDrone.g:717:2: ( ( rule__Walls__Group__0 ) )
            // InternalXDrone.g:718:3: ( rule__Walls__Group__0 )
            {
             before(grammarAccess.getWallsAccess().getGroup()); 
            // InternalXDrone.g:719:3: ( rule__Walls__Group__0 )
            // InternalXDrone.g:719:4: rule__Walls__Group__0
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


    // $ANTLR start "entryRuleFrontWall"
    // InternalXDrone.g:728:1: entryRuleFrontWall : ruleFrontWall EOF ;
    public final void entryRuleFrontWall() throws RecognitionException {
        try {
            // InternalXDrone.g:729:1: ( ruleFrontWall EOF )
            // InternalXDrone.g:730:1: ruleFrontWall EOF
            {
             before(grammarAccess.getFrontWallRule()); 
            pushFollow(FOLLOW_1);
            ruleFrontWall();

            state._fsp--;

             after(grammarAccess.getFrontWallRule()); 
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
    // $ANTLR end "entryRuleFrontWall"


    // $ANTLR start "ruleFrontWall"
    // InternalXDrone.g:737:1: ruleFrontWall : ( ( rule__FrontWall__Group__0 ) ) ;
    public final void ruleFrontWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:741:2: ( ( ( rule__FrontWall__Group__0 ) ) )
            // InternalXDrone.g:742:2: ( ( rule__FrontWall__Group__0 ) )
            {
            // InternalXDrone.g:742:2: ( ( rule__FrontWall__Group__0 ) )
            // InternalXDrone.g:743:3: ( rule__FrontWall__Group__0 )
            {
             before(grammarAccess.getFrontWallAccess().getGroup()); 
            // InternalXDrone.g:744:3: ( rule__FrontWall__Group__0 )
            // InternalXDrone.g:744:4: rule__FrontWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrontWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrontWall"


    // $ANTLR start "entryRuleRightWall"
    // InternalXDrone.g:753:1: entryRuleRightWall : ruleRightWall EOF ;
    public final void entryRuleRightWall() throws RecognitionException {
        try {
            // InternalXDrone.g:754:1: ( ruleRightWall EOF )
            // InternalXDrone.g:755:1: ruleRightWall EOF
            {
             before(grammarAccess.getRightWallRule()); 
            pushFollow(FOLLOW_1);
            ruleRightWall();

            state._fsp--;

             after(grammarAccess.getRightWallRule()); 
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
    // $ANTLR end "entryRuleRightWall"


    // $ANTLR start "ruleRightWall"
    // InternalXDrone.g:762:1: ruleRightWall : ( ( rule__RightWall__Group__0 ) ) ;
    public final void ruleRightWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:766:2: ( ( ( rule__RightWall__Group__0 ) ) )
            // InternalXDrone.g:767:2: ( ( rule__RightWall__Group__0 ) )
            {
            // InternalXDrone.g:767:2: ( ( rule__RightWall__Group__0 ) )
            // InternalXDrone.g:768:3: ( rule__RightWall__Group__0 )
            {
             before(grammarAccess.getRightWallAccess().getGroup()); 
            // InternalXDrone.g:769:3: ( rule__RightWall__Group__0 )
            // InternalXDrone.g:769:4: rule__RightWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightWall"


    // $ANTLR start "entryRuleLeftWall"
    // InternalXDrone.g:778:1: entryRuleLeftWall : ruleLeftWall EOF ;
    public final void entryRuleLeftWall() throws RecognitionException {
        try {
            // InternalXDrone.g:779:1: ( ruleLeftWall EOF )
            // InternalXDrone.g:780:1: ruleLeftWall EOF
            {
             before(grammarAccess.getLeftWallRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftWall();

            state._fsp--;

             after(grammarAccess.getLeftWallRule()); 
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
    // $ANTLR end "entryRuleLeftWall"


    // $ANTLR start "ruleLeftWall"
    // InternalXDrone.g:787:1: ruleLeftWall : ( ( rule__LeftWall__Group__0 ) ) ;
    public final void ruleLeftWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:791:2: ( ( ( rule__LeftWall__Group__0 ) ) )
            // InternalXDrone.g:792:2: ( ( rule__LeftWall__Group__0 ) )
            {
            // InternalXDrone.g:792:2: ( ( rule__LeftWall__Group__0 ) )
            // InternalXDrone.g:793:3: ( rule__LeftWall__Group__0 )
            {
             before(grammarAccess.getLeftWallAccess().getGroup()); 
            // InternalXDrone.g:794:3: ( rule__LeftWall__Group__0 )
            // InternalXDrone.g:794:4: rule__LeftWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftWall"


    // $ANTLR start "entryRuleBackWall"
    // InternalXDrone.g:803:1: entryRuleBackWall : ruleBackWall EOF ;
    public final void entryRuleBackWall() throws RecognitionException {
        try {
            // InternalXDrone.g:804:1: ( ruleBackWall EOF )
            // InternalXDrone.g:805:1: ruleBackWall EOF
            {
             before(grammarAccess.getBackWallRule()); 
            pushFollow(FOLLOW_1);
            ruleBackWall();

            state._fsp--;

             after(grammarAccess.getBackWallRule()); 
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
    // $ANTLR end "entryRuleBackWall"


    // $ANTLR start "ruleBackWall"
    // InternalXDrone.g:812:1: ruleBackWall : ( ( rule__BackWall__Group__0 ) ) ;
    public final void ruleBackWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:816:2: ( ( ( rule__BackWall__Group__0 ) ) )
            // InternalXDrone.g:817:2: ( ( rule__BackWall__Group__0 ) )
            {
            // InternalXDrone.g:817:2: ( ( rule__BackWall__Group__0 ) )
            // InternalXDrone.g:818:3: ( rule__BackWall__Group__0 )
            {
             before(grammarAccess.getBackWallAccess().getGroup()); 
            // InternalXDrone.g:819:3: ( rule__BackWall__Group__0 )
            // InternalXDrone.g:819:4: rule__BackWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackWall"


    // $ANTLR start "entryRuleUpWall"
    // InternalXDrone.g:828:1: entryRuleUpWall : ruleUpWall EOF ;
    public final void entryRuleUpWall() throws RecognitionException {
        try {
            // InternalXDrone.g:829:1: ( ruleUpWall EOF )
            // InternalXDrone.g:830:1: ruleUpWall EOF
            {
             before(grammarAccess.getUpWallRule()); 
            pushFollow(FOLLOW_1);
            ruleUpWall();

            state._fsp--;

             after(grammarAccess.getUpWallRule()); 
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
    // $ANTLR end "entryRuleUpWall"


    // $ANTLR start "ruleUpWall"
    // InternalXDrone.g:837:1: ruleUpWall : ( ( rule__UpWall__Group__0 ) ) ;
    public final void ruleUpWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:841:2: ( ( ( rule__UpWall__Group__0 ) ) )
            // InternalXDrone.g:842:2: ( ( rule__UpWall__Group__0 ) )
            {
            // InternalXDrone.g:842:2: ( ( rule__UpWall__Group__0 ) )
            // InternalXDrone.g:843:3: ( rule__UpWall__Group__0 )
            {
             before(grammarAccess.getUpWallAccess().getGroup()); 
            // InternalXDrone.g:844:3: ( rule__UpWall__Group__0 )
            // InternalXDrone.g:844:4: rule__UpWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpWall"


    // $ANTLR start "rule__Environment__Alternatives_2"
    // InternalXDrone.g:852:1: rule__Environment__Alternatives_2 : ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) );
    public final void rule__Environment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:856:1: ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 38:
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
                    // InternalXDrone.g:857:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:857:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    // InternalXDrone.g:858:3: ( rule__Environment__DroneAssignment_2_0 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0()); 
                    // InternalXDrone.g:859:3: ( rule__Environment__DroneAssignment_2_0 )
                    // InternalXDrone.g:859:4: rule__Environment__DroneAssignment_2_0
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
                    // InternalXDrone.g:863:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:863:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    // InternalXDrone.g:864:3: ( rule__Environment__WallsAssignment_2_1 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getWallsAssignment_2_1()); 
                    // InternalXDrone.g:865:3: ( rule__Environment__WallsAssignment_2_1 )
                    // InternalXDrone.g:865:4: rule__Environment__WallsAssignment_2_1
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
                    // InternalXDrone.g:869:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:869:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    // InternalXDrone.g:870:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_2()); 
                    // InternalXDrone.g:871:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    // InternalXDrone.g:871:4: rule__Environment__ObjectsAssignment_2_2
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


    // $ANTLR start "rule__Command__Alternatives"
    // InternalXDrone.g:879:1: rule__Command__Alternatives : ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleWait ) | ( ruleRotate ) | ( ruleGoTo ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:883:1: ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleWait ) | ( ruleRotate ) | ( ruleGoTo ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 27:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 18:
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
                    // InternalXDrone.g:884:2: ( ruleUp )
                    {
                    // InternalXDrone.g:884:2: ( ruleUp )
                    // InternalXDrone.g:885:3: ruleUp
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
                    // InternalXDrone.g:890:2: ( ruleDown )
                    {
                    // InternalXDrone.g:890:2: ( ruleDown )
                    // InternalXDrone.g:891:3: ruleDown
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
                    // InternalXDrone.g:896:2: ( ruleLeft )
                    {
                    // InternalXDrone.g:896:2: ( ruleLeft )
                    // InternalXDrone.g:897:3: ruleLeft
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
                    // InternalXDrone.g:902:2: ( ruleRight )
                    {
                    // InternalXDrone.g:902:2: ( ruleRight )
                    // InternalXDrone.g:903:3: ruleRight
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
                    // InternalXDrone.g:908:2: ( ruleForward )
                    {
                    // InternalXDrone.g:908:2: ( ruleForward )
                    // InternalXDrone.g:909:3: ruleForward
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
                    // InternalXDrone.g:914:2: ( ruleBackward )
                    {
                    // InternalXDrone.g:914:2: ( ruleBackward )
                    // InternalXDrone.g:915:3: ruleBackward
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
                    // InternalXDrone.g:920:2: ( ruleWait )
                    {
                    // InternalXDrone.g:920:2: ( ruleWait )
                    // InternalXDrone.g:921:3: ruleWait
                    {
                     before(grammarAccess.getCommandAccess().getWaitParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWaitParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXDrone.g:926:2: ( ruleRotate )
                    {
                    // InternalXDrone.g:926:2: ( ruleRotate )
                    // InternalXDrone.g:927:3: ruleRotate
                    {
                     before(grammarAccess.getCommandAccess().getRotateParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRotate();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXDrone.g:932:2: ( ruleGoTo )
                    {
                    // InternalXDrone.g:932:2: ( ruleGoTo )
                    // InternalXDrone.g:933:3: ruleGoTo
                    {
                     before(grammarAccess.getCommandAccess().getGoToParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getGoToParserRuleCall_8()); 

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
    // InternalXDrone.g:942:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:946:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:947:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:947:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:948:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:949:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:949:4: rule__DOUBLE__Group_0__0
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
                    // InternalXDrone.g:953:2: ( rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:953:2: ( rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:954:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:963:1: rule__POSITIVE_DOUBLE__Alternatives : ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__POSITIVE_DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:967:1: ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==14||LA4_1==20||LA4_1==31||(LA4_1>=35 && LA4_1<=36)||(LA4_1>=39 && LA4_1<=43)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==17) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:968:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:968:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:969:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:970:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    // InternalXDrone.g:970:4: rule__POSITIVE_DOUBLE__Group_0__0
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
                    // InternalXDrone.g:974:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:974:2: ( RULE_INT )
                    // InternalXDrone.g:975:3: RULE_INT
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
    // InternalXDrone.g:984:1: rule__Drone__Alternatives_2 : ( ( ( rule__Drone__PositionAssignment_2_0 ) ) | ( ( rule__Drone__Group_2_1__0 ) ) );
    public final void rule__Drone__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:988:1: ( ( ( rule__Drone__PositionAssignment_2_0 ) ) | ( ( rule__Drone__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:989:2: ( ( rule__Drone__PositionAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:989:2: ( ( rule__Drone__PositionAssignment_2_0 ) )
                    // InternalXDrone.g:990:3: ( rule__Drone__PositionAssignment_2_0 )
                    {
                     before(grammarAccess.getDroneAccess().getPositionAssignment_2_0()); 
                    // InternalXDrone.g:991:3: ( rule__Drone__PositionAssignment_2_0 )
                    // InternalXDrone.g:991:4: rule__Drone__PositionAssignment_2_0
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
                    // InternalXDrone.g:995:2: ( ( rule__Drone__Group_2_1__0 ) )
                    {
                    // InternalXDrone.g:995:2: ( ( rule__Drone__Group_2_1__0 ) )
                    // InternalXDrone.g:996:3: ( rule__Drone__Group_2_1__0 )
                    {
                     before(grammarAccess.getDroneAccess().getGroup_2_1()); 
                    // InternalXDrone.g:997:3: ( rule__Drone__Group_2_1__0 )
                    // InternalXDrone.g:997:4: rule__Drone__Group_2_1__0
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
    // InternalXDrone.g:1005:1: rule__Object__Alternatives_2 : ( ( ( rule__Object__OriginAssignment_2_0 ) ) | ( ( rule__Object__SizeAssignment_2_1 ) ) | ( ( rule__Object__ColorAssignment_2_2 ) ) );
    public final void rule__Object__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1009:1: ( ( ( rule__Object__OriginAssignment_2_0 ) ) | ( ( rule__Object__SizeAssignment_2_1 ) ) | ( ( rule__Object__ColorAssignment_2_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:1010:2: ( ( rule__Object__OriginAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:1010:2: ( ( rule__Object__OriginAssignment_2_0 ) )
                    // InternalXDrone.g:1011:3: ( rule__Object__OriginAssignment_2_0 )
                    {
                     before(grammarAccess.getObjectAccess().getOriginAssignment_2_0()); 
                    // InternalXDrone.g:1012:3: ( rule__Object__OriginAssignment_2_0 )
                    // InternalXDrone.g:1012:4: rule__Object__OriginAssignment_2_0
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
                    // InternalXDrone.g:1016:2: ( ( rule__Object__SizeAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:1016:2: ( ( rule__Object__SizeAssignment_2_1 ) )
                    // InternalXDrone.g:1017:3: ( rule__Object__SizeAssignment_2_1 )
                    {
                     before(grammarAccess.getObjectAccess().getSizeAssignment_2_1()); 
                    // InternalXDrone.g:1018:3: ( rule__Object__SizeAssignment_2_1 )
                    // InternalXDrone.g:1018:4: rule__Object__SizeAssignment_2_1
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
                    // InternalXDrone.g:1022:2: ( ( rule__Object__ColorAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:1022:2: ( ( rule__Object__ColorAssignment_2_2 ) )
                    // InternalXDrone.g:1023:3: ( rule__Object__ColorAssignment_2_2 )
                    {
                     before(grammarAccess.getObjectAccess().getColorAssignment_2_2()); 
                    // InternalXDrone.g:1024:3: ( rule__Object__ColorAssignment_2_2 )
                    // InternalXDrone.g:1024:4: rule__Object__ColorAssignment_2_2
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


    // $ANTLR start "rule__Walls__Alternatives_2"
    // InternalXDrone.g:1032:1: rule__Walls__Alternatives_2 : ( ( ( rule__Walls__FrontAssignment_2_0 ) ) | ( ( rule__Walls__RightAssignment_2_1 ) ) | ( ( rule__Walls__BackAssignment_2_2 ) ) | ( ( rule__Walls__LeftAssignment_2_3 ) ) | ( ( rule__Walls__UpAssignment_2_4 ) ) );
    public final void rule__Walls__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1036:1: ( ( ( rule__Walls__FrontAssignment_2_0 ) ) | ( ( rule__Walls__RightAssignment_2_1 ) ) | ( ( rule__Walls__BackAssignment_2_2 ) ) | ( ( rule__Walls__LeftAssignment_2_3 ) ) | ( ( rule__Walls__UpAssignment_2_4 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt7=1;
                }
                break;
            case 40:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            case 41:
                {
                alt7=4;
                }
                break;
            case 43:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXDrone.g:1037:2: ( ( rule__Walls__FrontAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:1037:2: ( ( rule__Walls__FrontAssignment_2_0 ) )
                    // InternalXDrone.g:1038:3: ( rule__Walls__FrontAssignment_2_0 )
                    {
                     before(grammarAccess.getWallsAccess().getFrontAssignment_2_0()); 
                    // InternalXDrone.g:1039:3: ( rule__Walls__FrontAssignment_2_0 )
                    // InternalXDrone.g:1039:4: rule__Walls__FrontAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__FrontAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getFrontAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:1043:2: ( ( rule__Walls__RightAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:1043:2: ( ( rule__Walls__RightAssignment_2_1 ) )
                    // InternalXDrone.g:1044:3: ( rule__Walls__RightAssignment_2_1 )
                    {
                     before(grammarAccess.getWallsAccess().getRightAssignment_2_1()); 
                    // InternalXDrone.g:1045:3: ( rule__Walls__RightAssignment_2_1 )
                    // InternalXDrone.g:1045:4: rule__Walls__RightAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__RightAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getRightAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:1049:2: ( ( rule__Walls__BackAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:1049:2: ( ( rule__Walls__BackAssignment_2_2 ) )
                    // InternalXDrone.g:1050:3: ( rule__Walls__BackAssignment_2_2 )
                    {
                     before(grammarAccess.getWallsAccess().getBackAssignment_2_2()); 
                    // InternalXDrone.g:1051:3: ( rule__Walls__BackAssignment_2_2 )
                    // InternalXDrone.g:1051:4: rule__Walls__BackAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__BackAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getBackAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:1055:2: ( ( rule__Walls__LeftAssignment_2_3 ) )
                    {
                    // InternalXDrone.g:1055:2: ( ( rule__Walls__LeftAssignment_2_3 ) )
                    // InternalXDrone.g:1056:3: ( rule__Walls__LeftAssignment_2_3 )
                    {
                     before(grammarAccess.getWallsAccess().getLeftAssignment_2_3()); 
                    // InternalXDrone.g:1057:3: ( rule__Walls__LeftAssignment_2_3 )
                    // InternalXDrone.g:1057:4: rule__Walls__LeftAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__LeftAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getLeftAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXDrone.g:1061:2: ( ( rule__Walls__UpAssignment_2_4 ) )
                    {
                    // InternalXDrone.g:1061:2: ( ( rule__Walls__UpAssignment_2_4 ) )
                    // InternalXDrone.g:1062:3: ( rule__Walls__UpAssignment_2_4 )
                    {
                     before(grammarAccess.getWallsAccess().getUpAssignment_2_4()); 
                    // InternalXDrone.g:1063:3: ( rule__Walls__UpAssignment_2_4 )
                    // InternalXDrone.g:1063:4: rule__Walls__UpAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__UpAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getUpAssignment_2_4()); 

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
    // $ANTLR end "rule__Walls__Alternatives_2"


    // $ANTLR start "rule__Main__Group__0"
    // InternalXDrone.g:1071:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1075:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalXDrone.g:1076:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalXDrone.g:1083:1: rule__Main__Group__0__Impl : ( ( rule__Main__FlyAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1087:1: ( ( ( rule__Main__FlyAssignment_0 ) ) )
            // InternalXDrone.g:1088:1: ( ( rule__Main__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:1088:1: ( ( rule__Main__FlyAssignment_0 ) )
            // InternalXDrone.g:1089:2: ( rule__Main__FlyAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:1090:2: ( rule__Main__FlyAssignment_0 )
            // InternalXDrone.g:1090:3: rule__Main__FlyAssignment_0
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
    // InternalXDrone.g:1098:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1102:1: ( rule__Main__Group__1__Impl )
            // InternalXDrone.g:1103:2: rule__Main__Group__1__Impl
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
    // InternalXDrone.g:1109:1: rule__Main__Group__1__Impl : ( ( rule__Main__EnvironmentAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1113:1: ( ( ( rule__Main__EnvironmentAssignment_1 )? ) )
            // InternalXDrone.g:1114:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            {
            // InternalXDrone.g:1114:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            // InternalXDrone.g:1115:2: ( rule__Main__EnvironmentAssignment_1 )?
            {
             before(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:1116:2: ( rule__Main__EnvironmentAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXDrone.g:1116:3: rule__Main__EnvironmentAssignment_1
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
    // InternalXDrone.g:1125:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1129:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:1130:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
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
    // InternalXDrone.g:1137:1: rule__Fly__Group__0__Impl : ( 'fly(){' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1141:1: ( ( 'fly(){' ) )
            // InternalXDrone.g:1142:1: ( 'fly(){' )
            {
            // InternalXDrone.g:1142:1: ( 'fly(){' )
            // InternalXDrone.g:1143:2: 'fly(){'
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
    // InternalXDrone.g:1152:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1156:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:1157:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
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
    // InternalXDrone.g:1164:1: rule__Fly__Group__1__Impl : ( ( rule__Fly__Group_1__0 ) ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1168:1: ( ( ( rule__Fly__Group_1__0 ) ) )
            // InternalXDrone.g:1169:1: ( ( rule__Fly__Group_1__0 ) )
            {
            // InternalXDrone.g:1169:1: ( ( rule__Fly__Group_1__0 ) )
            // InternalXDrone.g:1170:2: ( rule__Fly__Group_1__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_1()); 
            // InternalXDrone.g:1171:2: ( rule__Fly__Group_1__0 )
            // InternalXDrone.g:1171:3: rule__Fly__Group_1__0
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
    // InternalXDrone.g:1179:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1183:1: ( rule__Fly__Group__2__Impl )
            // InternalXDrone.g:1184:2: rule__Fly__Group__2__Impl
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
    // InternalXDrone.g:1190:1: rule__Fly__Group__2__Impl : ( '}' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1194:1: ( ( '}' ) )
            // InternalXDrone.g:1195:1: ( '}' )
            {
            // InternalXDrone.g:1195:1: ( '}' )
            // InternalXDrone.g:1196:2: '}'
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
    // InternalXDrone.g:1206:1: rule__Fly__Group_1__0 : rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 ;
    public final void rule__Fly__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1210:1: ( rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 )
            // InternalXDrone.g:1211:2: rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1
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
    // InternalXDrone.g:1218:1: rule__Fly__Group_1__0__Impl : ( ( rule__Fly__TakeoffAssignment_1_0 ) ) ;
    public final void rule__Fly__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1222:1: ( ( ( rule__Fly__TakeoffAssignment_1_0 ) ) )
            // InternalXDrone.g:1223:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            {
            // InternalXDrone.g:1223:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            // InternalXDrone.g:1224:2: ( rule__Fly__TakeoffAssignment_1_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 
            // InternalXDrone.g:1225:2: ( rule__Fly__TakeoffAssignment_1_0 )
            // InternalXDrone.g:1225:3: rule__Fly__TakeoffAssignment_1_0
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
    // InternalXDrone.g:1233:1: rule__Fly__Group_1__1 : rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 ;
    public final void rule__Fly__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1237:1: ( rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 )
            // InternalXDrone.g:1238:2: rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2
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
    // InternalXDrone.g:1245:1: rule__Fly__Group_1__1__Impl : ( ( rule__Fly__CommandsAssignment_1_1 )* ) ;
    public final void rule__Fly__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1249:1: ( ( ( rule__Fly__CommandsAssignment_1_1 )* ) )
            // InternalXDrone.g:1250:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            {
            // InternalXDrone.g:1250:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            // InternalXDrone.g:1251:2: ( rule__Fly__CommandsAssignment_1_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 
            // InternalXDrone.g:1252:2: ( rule__Fly__CommandsAssignment_1_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||(LA9_0>=21 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXDrone.g:1252:3: rule__Fly__CommandsAssignment_1_1
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
    // InternalXDrone.g:1260:1: rule__Fly__Group_1__2 : rule__Fly__Group_1__2__Impl ;
    public final void rule__Fly__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1264:1: ( rule__Fly__Group_1__2__Impl )
            // InternalXDrone.g:1265:2: rule__Fly__Group_1__2__Impl
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
    // InternalXDrone.g:1271:1: rule__Fly__Group_1__2__Impl : ( ( rule__Fly__LandAssignment_1_2 ) ) ;
    public final void rule__Fly__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1275:1: ( ( ( rule__Fly__LandAssignment_1_2 ) ) )
            // InternalXDrone.g:1276:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            {
            // InternalXDrone.g:1276:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            // InternalXDrone.g:1277:2: ( rule__Fly__LandAssignment_1_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 
            // InternalXDrone.g:1278:2: ( rule__Fly__LandAssignment_1_2 )
            // InternalXDrone.g:1278:3: rule__Fly__LandAssignment_1_2
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
    // InternalXDrone.g:1287:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1291:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:1292:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
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
    // InternalXDrone.g:1299:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1303:1: ( ( () ) )
            // InternalXDrone.g:1304:1: ( () )
            {
            // InternalXDrone.g:1304:1: ( () )
            // InternalXDrone.g:1305:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:1306:2: ()
            // InternalXDrone.g:1306:3: 
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
    // InternalXDrone.g:1314:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1318:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:1319:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
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
    // InternalXDrone.g:1326:1: rule__Environment__Group__1__Impl : ( 'environment(){' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1330:1: ( ( 'environment(){' ) )
            // InternalXDrone.g:1331:1: ( 'environment(){' )
            {
            // InternalXDrone.g:1331:1: ( 'environment(){' )
            // InternalXDrone.g:1332:2: 'environment(){'
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
    // InternalXDrone.g:1341:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1345:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:1346:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
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
    // InternalXDrone.g:1353:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Alternatives_2 )* ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1357:1: ( ( ( rule__Environment__Alternatives_2 )* ) )
            // InternalXDrone.g:1358:1: ( ( rule__Environment__Alternatives_2 )* )
            {
            // InternalXDrone.g:1358:1: ( ( rule__Environment__Alternatives_2 )* )
            // InternalXDrone.g:1359:2: ( rule__Environment__Alternatives_2 )*
            {
             before(grammarAccess.getEnvironmentAccess().getAlternatives_2()); 
            // InternalXDrone.g:1360:2: ( rule__Environment__Alternatives_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==29||LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXDrone.g:1360:3: rule__Environment__Alternatives_2
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
    // InternalXDrone.g:1368:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1372:1: ( rule__Environment__Group__3__Impl )
            // InternalXDrone.g:1373:2: rule__Environment__Group__3__Impl
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
    // InternalXDrone.g:1379:1: rule__Environment__Group__3__Impl : ( '}' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1383:1: ( ( '}' ) )
            // InternalXDrone.g:1384:1: ( '}' )
            {
            // InternalXDrone.g:1384:1: ( '}' )
            // InternalXDrone.g:1385:2: '}'
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
    // InternalXDrone.g:1395:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1399:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1400:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
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
    // InternalXDrone.g:1407:1: rule__DOUBLE__Group_0__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1411:1: ( ( '-' ) )
            // InternalXDrone.g:1412:1: ( '-' )
            {
            // InternalXDrone.g:1412:1: ( '-' )
            // InternalXDrone.g:1413:2: '-'
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
    // InternalXDrone.g:1422:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1426:1: ( rule__DOUBLE__Group_0__1__Impl )
            // InternalXDrone.g:1427:2: rule__DOUBLE__Group_0__1__Impl
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
    // InternalXDrone.g:1433:1: rule__DOUBLE__Group_0__1__Impl : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1437:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1438:1: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1438:1: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1439:2: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:1449:1: rule__POSITIVE_DOUBLE__Group_0__0 : rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1453:1: ( rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 )
            // InternalXDrone.g:1454:2: rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1
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
    // InternalXDrone.g:1461:1: rule__POSITIVE_DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1465:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1466:1: ( RULE_INT )
            {
            // InternalXDrone.g:1466:1: ( RULE_INT )
            // InternalXDrone.g:1467:2: RULE_INT
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
    // InternalXDrone.g:1476:1: rule__POSITIVE_DOUBLE__Group_0__1 : rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1480:1: ( rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 )
            // InternalXDrone.g:1481:2: rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2
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
    // InternalXDrone.g:1488:1: rule__POSITIVE_DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1492:1: ( ( '.' ) )
            // InternalXDrone.g:1493:1: ( '.' )
            {
            // InternalXDrone.g:1493:1: ( '.' )
            // InternalXDrone.g:1494:2: '.'
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
    // InternalXDrone.g:1503:1: rule__POSITIVE_DOUBLE__Group_0__2 : rule__POSITIVE_DOUBLE__Group_0__2__Impl ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1507:1: ( rule__POSITIVE_DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1508:2: rule__POSITIVE_DOUBLE__Group_0__2__Impl
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
    // InternalXDrone.g:1514:1: rule__POSITIVE_DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1518:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1519:1: ( RULE_INT )
            {
            // InternalXDrone.g:1519:1: ( RULE_INT )
            // InternalXDrone.g:1520:2: RULE_INT
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
    // InternalXDrone.g:1530:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1534:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalXDrone.g:1535:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
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
    // InternalXDrone.g:1542:1: rule__GoTo__Group__0__Impl : ( 'GOTO' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1546:1: ( ( 'GOTO' ) )
            // InternalXDrone.g:1547:1: ( 'GOTO' )
            {
            // InternalXDrone.g:1547:1: ( 'GOTO' )
            // InternalXDrone.g:1548:2: 'GOTO'
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
    // InternalXDrone.g:1557:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1561:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalXDrone.g:1562:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
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
    // InternalXDrone.g:1569:1: rule__GoTo__Group__1__Impl : ( '(' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1573:1: ( ( '(' ) )
            // InternalXDrone.g:1574:1: ( '(' )
            {
            // InternalXDrone.g:1574:1: ( '(' )
            // InternalXDrone.g:1575:2: '('
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
    // InternalXDrone.g:1584:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl rule__GoTo__Group__3 ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1588:1: ( rule__GoTo__Group__2__Impl rule__GoTo__Group__3 )
            // InternalXDrone.g:1589:2: rule__GoTo__Group__2__Impl rule__GoTo__Group__3
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
    // InternalXDrone.g:1596:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__Object_nameAssignment_2 ) ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1600:1: ( ( ( rule__GoTo__Object_nameAssignment_2 ) ) )
            // InternalXDrone.g:1601:1: ( ( rule__GoTo__Object_nameAssignment_2 ) )
            {
            // InternalXDrone.g:1601:1: ( ( rule__GoTo__Object_nameAssignment_2 ) )
            // InternalXDrone.g:1602:2: ( rule__GoTo__Object_nameAssignment_2 )
            {
             before(grammarAccess.getGoToAccess().getObject_nameAssignment_2()); 
            // InternalXDrone.g:1603:2: ( rule__GoTo__Object_nameAssignment_2 )
            // InternalXDrone.g:1603:3: rule__GoTo__Object_nameAssignment_2
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
    // InternalXDrone.g:1611:1: rule__GoTo__Group__3 : rule__GoTo__Group__3__Impl ;
    public final void rule__GoTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1615:1: ( rule__GoTo__Group__3__Impl )
            // InternalXDrone.g:1616:2: rule__GoTo__Group__3__Impl
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
    // InternalXDrone.g:1622:1: rule__GoTo__Group__3__Impl : ( ')' ) ;
    public final void rule__GoTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1626:1: ( ( ')' ) )
            // InternalXDrone.g:1627:1: ( ')' )
            {
            // InternalXDrone.g:1627:1: ( ')' )
            // InternalXDrone.g:1628:2: ')'
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


    // $ANTLR start "rule__Rotate__Group__0"
    // InternalXDrone.g:1638:1: rule__Rotate__Group__0 : rule__Rotate__Group__0__Impl rule__Rotate__Group__1 ;
    public final void rule__Rotate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1642:1: ( rule__Rotate__Group__0__Impl rule__Rotate__Group__1 )
            // InternalXDrone.g:1643:2: rule__Rotate__Group__0__Impl rule__Rotate__Group__1
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
    // InternalXDrone.g:1650:1: rule__Rotate__Group__0__Impl : ( 'ROTATE' ) ;
    public final void rule__Rotate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1654:1: ( ( 'ROTATE' ) )
            // InternalXDrone.g:1655:1: ( 'ROTATE' )
            {
            // InternalXDrone.g:1655:1: ( 'ROTATE' )
            // InternalXDrone.g:1656:2: 'ROTATE'
            {
             before(grammarAccess.getRotateAccess().getROTATEKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:1665:1: rule__Rotate__Group__1 : rule__Rotate__Group__1__Impl rule__Rotate__Group__2 ;
    public final void rule__Rotate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1669:1: ( rule__Rotate__Group__1__Impl rule__Rotate__Group__2 )
            // InternalXDrone.g:1670:2: rule__Rotate__Group__1__Impl rule__Rotate__Group__2
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
    // InternalXDrone.g:1677:1: rule__Rotate__Group__1__Impl : ( '(' ) ;
    public final void rule__Rotate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1681:1: ( ( '(' ) )
            // InternalXDrone.g:1682:1: ( '(' )
            {
            // InternalXDrone.g:1682:1: ( '(' )
            // InternalXDrone.g:1683:2: '('
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
    // InternalXDrone.g:1692:1: rule__Rotate__Group__2 : rule__Rotate__Group__2__Impl rule__Rotate__Group__3 ;
    public final void rule__Rotate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1696:1: ( rule__Rotate__Group__2__Impl rule__Rotate__Group__3 )
            // InternalXDrone.g:1697:2: rule__Rotate__Group__2__Impl rule__Rotate__Group__3
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
    // InternalXDrone.g:1704:1: rule__Rotate__Group__2__Impl : ( ( rule__Rotate__AngleAssignment_2 ) ) ;
    public final void rule__Rotate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1708:1: ( ( ( rule__Rotate__AngleAssignment_2 ) ) )
            // InternalXDrone.g:1709:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:1709:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            // InternalXDrone.g:1710:2: ( rule__Rotate__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:1711:2: ( rule__Rotate__AngleAssignment_2 )
            // InternalXDrone.g:1711:3: rule__Rotate__AngleAssignment_2
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
    // InternalXDrone.g:1719:1: rule__Rotate__Group__3 : rule__Rotate__Group__3__Impl ;
    public final void rule__Rotate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1723:1: ( rule__Rotate__Group__3__Impl )
            // InternalXDrone.g:1724:2: rule__Rotate__Group__3__Impl
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
    // InternalXDrone.g:1730:1: rule__Rotate__Group__3__Impl : ( ')' ) ;
    public final void rule__Rotate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1734:1: ( ( ')' ) )
            // InternalXDrone.g:1735:1: ( ')' )
            {
            // InternalXDrone.g:1735:1: ( ')' )
            // InternalXDrone.g:1736:2: ')'
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
    // InternalXDrone.g:1746:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1750:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:1751:2: rule__Up__Group__0__Impl rule__Up__Group__1
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
    // InternalXDrone.g:1758:1: rule__Up__Group__0__Impl : ( 'UP' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1762:1: ( ( 'UP' ) )
            // InternalXDrone.g:1763:1: ( 'UP' )
            {
            // InternalXDrone.g:1763:1: ( 'UP' )
            // InternalXDrone.g:1764:2: 'UP'
            {
             before(grammarAccess.getUpAccess().getUPKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalXDrone.g:1773:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1777:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:1778:2: rule__Up__Group__1__Impl rule__Up__Group__2
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
    // InternalXDrone.g:1785:1: rule__Up__Group__1__Impl : ( '(' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1789:1: ( ( '(' ) )
            // InternalXDrone.g:1790:1: ( '(' )
            {
            // InternalXDrone.g:1790:1: ( '(' )
            // InternalXDrone.g:1791:2: '('
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
    // InternalXDrone.g:1800:1: rule__Up__Group__2 : rule__Up__Group__2__Impl rule__Up__Group__3 ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1804:1: ( rule__Up__Group__2__Impl rule__Up__Group__3 )
            // InternalXDrone.g:1805:2: rule__Up__Group__2__Impl rule__Up__Group__3
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
    // InternalXDrone.g:1812:1: rule__Up__Group__2__Impl : ( ( rule__Up__DistanceAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1816:1: ( ( ( rule__Up__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1817:1: ( ( rule__Up__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1817:1: ( ( rule__Up__DistanceAssignment_2 ) )
            // InternalXDrone.g:1818:2: ( rule__Up__DistanceAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1819:2: ( rule__Up__DistanceAssignment_2 )
            // InternalXDrone.g:1819:3: rule__Up__DistanceAssignment_2
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
    // InternalXDrone.g:1827:1: rule__Up__Group__3 : rule__Up__Group__3__Impl ;
    public final void rule__Up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1831:1: ( rule__Up__Group__3__Impl )
            // InternalXDrone.g:1832:2: rule__Up__Group__3__Impl
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
    // InternalXDrone.g:1838:1: rule__Up__Group__3__Impl : ( ')' ) ;
    public final void rule__Up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1842:1: ( ( ')' ) )
            // InternalXDrone.g:1843:1: ( ')' )
            {
            // InternalXDrone.g:1843:1: ( ')' )
            // InternalXDrone.g:1844:2: ')'
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
    // InternalXDrone.g:1854:1: rule__Down__Group__0 : rule__Down__Group__0__Impl rule__Down__Group__1 ;
    public final void rule__Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1858:1: ( rule__Down__Group__0__Impl rule__Down__Group__1 )
            // InternalXDrone.g:1859:2: rule__Down__Group__0__Impl rule__Down__Group__1
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
    // InternalXDrone.g:1866:1: rule__Down__Group__0__Impl : ( 'DOWN' ) ;
    public final void rule__Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1870:1: ( ( 'DOWN' ) )
            // InternalXDrone.g:1871:1: ( 'DOWN' )
            {
            // InternalXDrone.g:1871:1: ( 'DOWN' )
            // InternalXDrone.g:1872:2: 'DOWN'
            {
             before(grammarAccess.getDownAccess().getDOWNKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalXDrone.g:1881:1: rule__Down__Group__1 : rule__Down__Group__1__Impl rule__Down__Group__2 ;
    public final void rule__Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1885:1: ( rule__Down__Group__1__Impl rule__Down__Group__2 )
            // InternalXDrone.g:1886:2: rule__Down__Group__1__Impl rule__Down__Group__2
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
    // InternalXDrone.g:1893:1: rule__Down__Group__1__Impl : ( '(' ) ;
    public final void rule__Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1897:1: ( ( '(' ) )
            // InternalXDrone.g:1898:1: ( '(' )
            {
            // InternalXDrone.g:1898:1: ( '(' )
            // InternalXDrone.g:1899:2: '('
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
    // InternalXDrone.g:1908:1: rule__Down__Group__2 : rule__Down__Group__2__Impl rule__Down__Group__3 ;
    public final void rule__Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1912:1: ( rule__Down__Group__2__Impl rule__Down__Group__3 )
            // InternalXDrone.g:1913:2: rule__Down__Group__2__Impl rule__Down__Group__3
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
    // InternalXDrone.g:1920:1: rule__Down__Group__2__Impl : ( ( rule__Down__DistanceAssignment_2 ) ) ;
    public final void rule__Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1924:1: ( ( ( rule__Down__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1925:1: ( ( rule__Down__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1925:1: ( ( rule__Down__DistanceAssignment_2 ) )
            // InternalXDrone.g:1926:2: ( rule__Down__DistanceAssignment_2 )
            {
             before(grammarAccess.getDownAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1927:2: ( rule__Down__DistanceAssignment_2 )
            // InternalXDrone.g:1927:3: rule__Down__DistanceAssignment_2
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
    // InternalXDrone.g:1935:1: rule__Down__Group__3 : rule__Down__Group__3__Impl ;
    public final void rule__Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1939:1: ( rule__Down__Group__3__Impl )
            // InternalXDrone.g:1940:2: rule__Down__Group__3__Impl
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
    // InternalXDrone.g:1946:1: rule__Down__Group__3__Impl : ( ')' ) ;
    public final void rule__Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1950:1: ( ( ')' ) )
            // InternalXDrone.g:1951:1: ( ')' )
            {
            // InternalXDrone.g:1951:1: ( ')' )
            // InternalXDrone.g:1952:2: ')'
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
    // InternalXDrone.g:1962:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1966:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:1967:2: rule__Left__Group__0__Impl rule__Left__Group__1
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
    // InternalXDrone.g:1974:1: rule__Left__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1978:1: ( ( 'LEFT' ) )
            // InternalXDrone.g:1979:1: ( 'LEFT' )
            {
            // InternalXDrone.g:1979:1: ( 'LEFT' )
            // InternalXDrone.g:1980:2: 'LEFT'
            {
             before(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalXDrone.g:1989:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1993:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:1994:2: rule__Left__Group__1__Impl rule__Left__Group__2
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
    // InternalXDrone.g:2001:1: rule__Left__Group__1__Impl : ( '(' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2005:1: ( ( '(' ) )
            // InternalXDrone.g:2006:1: ( '(' )
            {
            // InternalXDrone.g:2006:1: ( '(' )
            // InternalXDrone.g:2007:2: '('
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
    // InternalXDrone.g:2016:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2020:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // InternalXDrone.g:2021:2: rule__Left__Group__2__Impl rule__Left__Group__3
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
    // InternalXDrone.g:2028:1: rule__Left__Group__2__Impl : ( ( rule__Left__DistanceAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2032:1: ( ( ( rule__Left__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2033:1: ( ( rule__Left__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2033:1: ( ( rule__Left__DistanceAssignment_2 ) )
            // InternalXDrone.g:2034:2: ( rule__Left__DistanceAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2035:2: ( rule__Left__DistanceAssignment_2 )
            // InternalXDrone.g:2035:3: rule__Left__DistanceAssignment_2
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
    // InternalXDrone.g:2043:1: rule__Left__Group__3 : rule__Left__Group__3__Impl ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2047:1: ( rule__Left__Group__3__Impl )
            // InternalXDrone.g:2048:2: rule__Left__Group__3__Impl
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
    // InternalXDrone.g:2054:1: rule__Left__Group__3__Impl : ( ')' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2058:1: ( ( ')' ) )
            // InternalXDrone.g:2059:1: ( ')' )
            {
            // InternalXDrone.g:2059:1: ( ')' )
            // InternalXDrone.g:2060:2: ')'
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
    // InternalXDrone.g:2070:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2074:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:2075:2: rule__Right__Group__0__Impl rule__Right__Group__1
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
    // InternalXDrone.g:2082:1: rule__Right__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2086:1: ( ( 'RIGHT' ) )
            // InternalXDrone.g:2087:1: ( 'RIGHT' )
            {
            // InternalXDrone.g:2087:1: ( 'RIGHT' )
            // InternalXDrone.g:2088:2: 'RIGHT'
            {
             before(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalXDrone.g:2097:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2101:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:2102:2: rule__Right__Group__1__Impl rule__Right__Group__2
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
    // InternalXDrone.g:2109:1: rule__Right__Group__1__Impl : ( '(' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2113:1: ( ( '(' ) )
            // InternalXDrone.g:2114:1: ( '(' )
            {
            // InternalXDrone.g:2114:1: ( '(' )
            // InternalXDrone.g:2115:2: '('
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
    // InternalXDrone.g:2124:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2128:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalXDrone.g:2129:2: rule__Right__Group__2__Impl rule__Right__Group__3
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
    // InternalXDrone.g:2136:1: rule__Right__Group__2__Impl : ( ( rule__Right__DistanceAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2140:1: ( ( ( rule__Right__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2141:1: ( ( rule__Right__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2141:1: ( ( rule__Right__DistanceAssignment_2 ) )
            // InternalXDrone.g:2142:2: ( rule__Right__DistanceAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2143:2: ( rule__Right__DistanceAssignment_2 )
            // InternalXDrone.g:2143:3: rule__Right__DistanceAssignment_2
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
    // InternalXDrone.g:2151:1: rule__Right__Group__3 : rule__Right__Group__3__Impl ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2155:1: ( rule__Right__Group__3__Impl )
            // InternalXDrone.g:2156:2: rule__Right__Group__3__Impl
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
    // InternalXDrone.g:2162:1: rule__Right__Group__3__Impl : ( ')' ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2166:1: ( ( ')' ) )
            // InternalXDrone.g:2167:1: ( ')' )
            {
            // InternalXDrone.g:2167:1: ( ')' )
            // InternalXDrone.g:2168:2: ')'
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
    // InternalXDrone.g:2178:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2182:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalXDrone.g:2183:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
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
    // InternalXDrone.g:2190:1: rule__Forward__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2194:1: ( ( 'FORWARD' ) )
            // InternalXDrone.g:2195:1: ( 'FORWARD' )
            {
            // InternalXDrone.g:2195:1: ( 'FORWARD' )
            // InternalXDrone.g:2196:2: 'FORWARD'
            {
             before(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalXDrone.g:2205:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2209:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalXDrone.g:2210:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
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
    // InternalXDrone.g:2217:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2221:1: ( ( '(' ) )
            // InternalXDrone.g:2222:1: ( '(' )
            {
            // InternalXDrone.g:2222:1: ( '(' )
            // InternalXDrone.g:2223:2: '('
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
    // InternalXDrone.g:2232:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2236:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalXDrone.g:2237:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
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
    // InternalXDrone.g:2244:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2248:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2249:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2249:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2250:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2251:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalXDrone.g:2251:3: rule__Forward__DistanceAssignment_2
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
    // InternalXDrone.g:2259:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2263:1: ( rule__Forward__Group__3__Impl )
            // InternalXDrone.g:2264:2: rule__Forward__Group__3__Impl
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
    // InternalXDrone.g:2270:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2274:1: ( ( ')' ) )
            // InternalXDrone.g:2275:1: ( ')' )
            {
            // InternalXDrone.g:2275:1: ( ')' )
            // InternalXDrone.g:2276:2: ')'
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
    // InternalXDrone.g:2286:1: rule__Backward__Group__0 : rule__Backward__Group__0__Impl rule__Backward__Group__1 ;
    public final void rule__Backward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2290:1: ( rule__Backward__Group__0__Impl rule__Backward__Group__1 )
            // InternalXDrone.g:2291:2: rule__Backward__Group__0__Impl rule__Backward__Group__1
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
    // InternalXDrone.g:2298:1: rule__Backward__Group__0__Impl : ( 'BACKWARD' ) ;
    public final void rule__Backward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2302:1: ( ( 'BACKWARD' ) )
            // InternalXDrone.g:2303:1: ( 'BACKWARD' )
            {
            // InternalXDrone.g:2303:1: ( 'BACKWARD' )
            // InternalXDrone.g:2304:2: 'BACKWARD'
            {
             before(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalXDrone.g:2313:1: rule__Backward__Group__1 : rule__Backward__Group__1__Impl rule__Backward__Group__2 ;
    public final void rule__Backward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2317:1: ( rule__Backward__Group__1__Impl rule__Backward__Group__2 )
            // InternalXDrone.g:2318:2: rule__Backward__Group__1__Impl rule__Backward__Group__2
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
    // InternalXDrone.g:2325:1: rule__Backward__Group__1__Impl : ( '(' ) ;
    public final void rule__Backward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2329:1: ( ( '(' ) )
            // InternalXDrone.g:2330:1: ( '(' )
            {
            // InternalXDrone.g:2330:1: ( '(' )
            // InternalXDrone.g:2331:2: '('
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
    // InternalXDrone.g:2340:1: rule__Backward__Group__2 : rule__Backward__Group__2__Impl rule__Backward__Group__3 ;
    public final void rule__Backward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2344:1: ( rule__Backward__Group__2__Impl rule__Backward__Group__3 )
            // InternalXDrone.g:2345:2: rule__Backward__Group__2__Impl rule__Backward__Group__3
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
    // InternalXDrone.g:2352:1: rule__Backward__Group__2__Impl : ( ( rule__Backward__DistanceAssignment_2 ) ) ;
    public final void rule__Backward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2356:1: ( ( ( rule__Backward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2357:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2357:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2358:2: ( rule__Backward__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2359:2: ( rule__Backward__DistanceAssignment_2 )
            // InternalXDrone.g:2359:3: rule__Backward__DistanceAssignment_2
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
    // InternalXDrone.g:2367:1: rule__Backward__Group__3 : rule__Backward__Group__3__Impl ;
    public final void rule__Backward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2371:1: ( rule__Backward__Group__3__Impl )
            // InternalXDrone.g:2372:2: rule__Backward__Group__3__Impl
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
    // InternalXDrone.g:2378:1: rule__Backward__Group__3__Impl : ( ')' ) ;
    public final void rule__Backward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2382:1: ( ( ')' ) )
            // InternalXDrone.g:2383:1: ( ')' )
            {
            // InternalXDrone.g:2383:1: ( ')' )
            // InternalXDrone.g:2384:2: ')'
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


    // $ANTLR start "rule__Wait__Group__0"
    // InternalXDrone.g:2394:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2398:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:2399:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalXDrone.g:2406:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2410:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:2411:1: ( 'WAIT' )
            {
            // InternalXDrone.g:2411:1: ( 'WAIT' )
            // InternalXDrone.g:2412:2: 'WAIT'
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
    // InternalXDrone.g:2421:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2425:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:2426:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
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
    // InternalXDrone.g:2433:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2437:1: ( ( '(' ) )
            // InternalXDrone.g:2438:1: ( '(' )
            {
            // InternalXDrone.g:2438:1: ( '(' )
            // InternalXDrone.g:2439:2: '('
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
    // InternalXDrone.g:2448:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2452:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:2453:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
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
    // InternalXDrone.g:2460:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2464:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:2465:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:2465:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:2466:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:2467:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:2467:3: rule__Wait__SecondsAssignment_2
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
    // InternalXDrone.g:2475:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2479:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:2480:2: rule__Wait__Group__3__Impl
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
    // InternalXDrone.g:2486:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2490:1: ( ( ')' ) )
            // InternalXDrone.g:2491:1: ( ')' )
            {
            // InternalXDrone.g:2491:1: ( ')' )
            // InternalXDrone.g:2492:2: ')'
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


    // $ANTLR start "rule__Drone__Group__0"
    // InternalXDrone.g:2502:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2506:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:2507:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXDrone.g:2514:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2518:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:2519:1: ( 'DRONE' )
            {
            // InternalXDrone.g:2519:1: ( 'DRONE' )
            // InternalXDrone.g:2520:2: 'DRONE'
            {
             before(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalXDrone.g:2529:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl rule__Drone__Group__2 ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2533:1: ( rule__Drone__Group__1__Impl rule__Drone__Group__2 )
            // InternalXDrone.g:2534:2: rule__Drone__Group__1__Impl rule__Drone__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalXDrone.g:2541:1: rule__Drone__Group__1__Impl : ( '{' ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2545:1: ( ( '{' ) )
            // InternalXDrone.g:2546:1: ( '{' )
            {
            // InternalXDrone.g:2546:1: ( '{' )
            // InternalXDrone.g:2547:2: '{'
            {
             before(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXDrone.g:2556:1: rule__Drone__Group__2 : rule__Drone__Group__2__Impl rule__Drone__Group__3 ;
    public final void rule__Drone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2560:1: ( rule__Drone__Group__2__Impl rule__Drone__Group__3 )
            // InternalXDrone.g:2561:2: rule__Drone__Group__2__Impl rule__Drone__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalXDrone.g:2568:1: rule__Drone__Group__2__Impl : ( ( rule__Drone__Alternatives_2 )* ) ;
    public final void rule__Drone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2572:1: ( ( ( rule__Drone__Alternatives_2 )* ) )
            // InternalXDrone.g:2573:1: ( ( rule__Drone__Alternatives_2 )* )
            {
            // InternalXDrone.g:2573:1: ( ( rule__Drone__Alternatives_2 )* )
            // InternalXDrone.g:2574:2: ( rule__Drone__Alternatives_2 )*
            {
             before(grammarAccess.getDroneAccess().getAlternatives_2()); 
            // InternalXDrone.g:2575:2: ( rule__Drone__Alternatives_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31||LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXDrone.g:2575:3: rule__Drone__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalXDrone.g:2583:1: rule__Drone__Group__3 : rule__Drone__Group__3__Impl ;
    public final void rule__Drone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2587:1: ( rule__Drone__Group__3__Impl )
            // InternalXDrone.g:2588:2: rule__Drone__Group__3__Impl
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
    // InternalXDrone.g:2594:1: rule__Drone__Group__3__Impl : ( '}' ) ;
    public final void rule__Drone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2598:1: ( ( '}' ) )
            // InternalXDrone.g:2599:1: ( '}' )
            {
            // InternalXDrone.g:2599:1: ( '}' )
            // InternalXDrone.g:2600:2: '}'
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
    // InternalXDrone.g:2610:1: rule__Drone__Group_2_1__0 : rule__Drone__Group_2_1__0__Impl rule__Drone__Group_2_1__1 ;
    public final void rule__Drone__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2614:1: ( rule__Drone__Group_2_1__0__Impl rule__Drone__Group_2_1__1 )
            // InternalXDrone.g:2615:2: rule__Drone__Group_2_1__0__Impl rule__Drone__Group_2_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:2622:1: rule__Drone__Group_2_1__0__Impl : ( 'rotation' ) ;
    public final void rule__Drone__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2626:1: ( ( 'rotation' ) )
            // InternalXDrone.g:2627:1: ( 'rotation' )
            {
            // InternalXDrone.g:2627:1: ( 'rotation' )
            // InternalXDrone.g:2628:2: 'rotation'
            {
             before(grammarAccess.getDroneAccess().getRotationKeyword_2_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalXDrone.g:2637:1: rule__Drone__Group_2_1__1 : rule__Drone__Group_2_1__1__Impl rule__Drone__Group_2_1__2 ;
    public final void rule__Drone__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2641:1: ( rule__Drone__Group_2_1__1__Impl rule__Drone__Group_2_1__2 )
            // InternalXDrone.g:2642:2: rule__Drone__Group_2_1__1__Impl rule__Drone__Group_2_1__2
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
    // InternalXDrone.g:2649:1: rule__Drone__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__Drone__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2653:1: ( ( '=' ) )
            // InternalXDrone.g:2654:1: ( '=' )
            {
            // InternalXDrone.g:2654:1: ( '=' )
            // InternalXDrone.g:2655:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:2664:1: rule__Drone__Group_2_1__2 : rule__Drone__Group_2_1__2__Impl ;
    public final void rule__Drone__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2668:1: ( rule__Drone__Group_2_1__2__Impl )
            // InternalXDrone.g:2669:2: rule__Drone__Group_2_1__2__Impl
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
    // InternalXDrone.g:2675:1: rule__Drone__Group_2_1__2__Impl : ( ( rule__Drone__RotationAssignment_2_1_2 ) ) ;
    public final void rule__Drone__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2679:1: ( ( ( rule__Drone__RotationAssignment_2_1_2 ) ) )
            // InternalXDrone.g:2680:1: ( ( rule__Drone__RotationAssignment_2_1_2 ) )
            {
            // InternalXDrone.g:2680:1: ( ( rule__Drone__RotationAssignment_2_1_2 ) )
            // InternalXDrone.g:2681:2: ( rule__Drone__RotationAssignment_2_1_2 )
            {
             before(grammarAccess.getDroneAccess().getRotationAssignment_2_1_2()); 
            // InternalXDrone.g:2682:2: ( rule__Drone__RotationAssignment_2_1_2 )
            // InternalXDrone.g:2682:3: rule__Drone__RotationAssignment_2_1_2
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
    // InternalXDrone.g:2691:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2695:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalXDrone.g:2696:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXDrone.g:2703:1: rule__Object__Group__0__Impl : ( ( rule__Object__Object_nameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2707:1: ( ( ( rule__Object__Object_nameAssignment_0 ) ) )
            // InternalXDrone.g:2708:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            {
            // InternalXDrone.g:2708:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            // InternalXDrone.g:2709:2: ( rule__Object__Object_nameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0()); 
            // InternalXDrone.g:2710:2: ( rule__Object__Object_nameAssignment_0 )
            // InternalXDrone.g:2710:3: rule__Object__Object_nameAssignment_0
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
    // InternalXDrone.g:2718:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2722:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalXDrone.g:2723:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2730:1: rule__Object__Group__1__Impl : ( '{' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2734:1: ( ( '{' ) )
            // InternalXDrone.g:2735:1: ( '{' )
            {
            // InternalXDrone.g:2735:1: ( '{' )
            // InternalXDrone.g:2736:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXDrone.g:2745:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2749:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalXDrone.g:2750:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:2757:1: rule__Object__Group__2__Impl : ( ( rule__Object__Alternatives_2 )* ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2761:1: ( ( ( rule__Object__Alternatives_2 )* ) )
            // InternalXDrone.g:2762:1: ( ( rule__Object__Alternatives_2 )* )
            {
            // InternalXDrone.g:2762:1: ( ( rule__Object__Alternatives_2 )* )
            // InternalXDrone.g:2763:2: ( rule__Object__Alternatives_2 )*
            {
             before(grammarAccess.getObjectAccess().getAlternatives_2()); 
            // InternalXDrone.g:2764:2: ( rule__Object__Alternatives_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=33 && LA12_0<=34)||LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXDrone.g:2764:3: rule__Object__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_21);
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
    // InternalXDrone.g:2772:1: rule__Object__Group__3 : rule__Object__Group__3__Impl ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2776:1: ( rule__Object__Group__3__Impl )
            // InternalXDrone.g:2777:2: rule__Object__Group__3__Impl
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
    // InternalXDrone.g:2783:1: rule__Object__Group__3__Impl : ( '}' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2787:1: ( ( '}' ) )
            // InternalXDrone.g:2788:1: ( '}' )
            {
            // InternalXDrone.g:2788:1: ( '}' )
            // InternalXDrone.g:2789:2: '}'
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
    // InternalXDrone.g:2799:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2803:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalXDrone.g:2804:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
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
    // InternalXDrone.g:2811:1: rule__Origin__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2815:1: ( ( 'origin' ) )
            // InternalXDrone.g:2816:1: ( 'origin' )
            {
            // InternalXDrone.g:2816:1: ( 'origin' )
            // InternalXDrone.g:2817:2: 'origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalXDrone.g:2826:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2830:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalXDrone.g:2831:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
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
    // InternalXDrone.g:2838:1: rule__Origin__Group__1__Impl : ( '=' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2842:1: ( ( '=' ) )
            // InternalXDrone.g:2843:1: ( '=' )
            {
            // InternalXDrone.g:2843:1: ( '=' )
            // InternalXDrone.g:2844:2: '='
            {
             before(grammarAccess.getOriginAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:2853:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2857:1: ( rule__Origin__Group__2__Impl )
            // InternalXDrone.g:2858:2: rule__Origin__Group__2__Impl
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
    // InternalXDrone.g:2864:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__VectorAssignment_2 ) ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2868:1: ( ( ( rule__Origin__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2869:1: ( ( rule__Origin__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2869:1: ( ( rule__Origin__VectorAssignment_2 ) )
            // InternalXDrone.g:2870:2: ( rule__Origin__VectorAssignment_2 )
            {
             before(grammarAccess.getOriginAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2871:2: ( rule__Origin__VectorAssignment_2 )
            // InternalXDrone.g:2871:3: rule__Origin__VectorAssignment_2
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
    // InternalXDrone.g:2880:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2884:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalXDrone.g:2885:2: rule__Size__Group__0__Impl rule__Size__Group__1
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
    // InternalXDrone.g:2892:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2896:1: ( ( 'size' ) )
            // InternalXDrone.g:2897:1: ( 'size' )
            {
            // InternalXDrone.g:2897:1: ( 'size' )
            // InternalXDrone.g:2898:2: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalXDrone.g:2907:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2911:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalXDrone.g:2912:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalXDrone.g:2919:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2923:1: ( ( '=' ) )
            // InternalXDrone.g:2924:1: ( '=' )
            {
            // InternalXDrone.g:2924:1: ( '=' )
            // InternalXDrone.g:2925:2: '='
            {
             before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:2934:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2938:1: ( rule__Size__Group__2__Impl )
            // InternalXDrone.g:2939:2: rule__Size__Group__2__Impl
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
    // InternalXDrone.g:2945:1: rule__Size__Group__2__Impl : ( ( rule__Size__VectorAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2949:1: ( ( ( rule__Size__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2950:1: ( ( rule__Size__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2950:1: ( ( rule__Size__VectorAssignment_2 ) )
            // InternalXDrone.g:2951:2: ( rule__Size__VectorAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2952:2: ( rule__Size__VectorAssignment_2 )
            // InternalXDrone.g:2952:3: rule__Size__VectorAssignment_2
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
    // InternalXDrone.g:2961:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2965:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalXDrone.g:2966:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:2973:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2977:1: ( ( 'position' ) )
            // InternalXDrone.g:2978:1: ( 'position' )
            {
            // InternalXDrone.g:2978:1: ( 'position' )
            // InternalXDrone.g:2979:2: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalXDrone.g:2988:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2992:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalXDrone.g:2993:2: rule__Position__Group__1__Impl rule__Position__Group__2
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
    // InternalXDrone.g:3000:1: rule__Position__Group__1__Impl : ( '=' ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3004:1: ( ( '=' ) )
            // InternalXDrone.g:3005:1: ( '=' )
            {
            // InternalXDrone.g:3005:1: ( '=' )
            // InternalXDrone.g:3006:2: '='
            {
             before(grammarAccess.getPositionAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:3015:1: rule__Position__Group__2 : rule__Position__Group__2__Impl ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3019:1: ( rule__Position__Group__2__Impl )
            // InternalXDrone.g:3020:2: rule__Position__Group__2__Impl
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
    // InternalXDrone.g:3026:1: rule__Position__Group__2__Impl : ( ( rule__Position__VectorAssignment_2 ) ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3030:1: ( ( ( rule__Position__VectorAssignment_2 ) ) )
            // InternalXDrone.g:3031:1: ( ( rule__Position__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:3031:1: ( ( rule__Position__VectorAssignment_2 ) )
            // InternalXDrone.g:3032:2: ( rule__Position__VectorAssignment_2 )
            {
             before(grammarAccess.getPositionAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:3033:2: ( rule__Position__VectorAssignment_2 )
            // InternalXDrone.g:3033:3: rule__Position__VectorAssignment_2
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
    // InternalXDrone.g:3042:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3046:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // InternalXDrone.g:3047:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
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
    // InternalXDrone.g:3054:1: rule__Vector__Group__0__Impl : ( '(' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3058:1: ( ( '(' ) )
            // InternalXDrone.g:3059:1: ( '(' )
            {
            // InternalXDrone.g:3059:1: ( '(' )
            // InternalXDrone.g:3060:2: '('
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
    // InternalXDrone.g:3069:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3073:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // InternalXDrone.g:3074:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalXDrone.g:3081:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3085:1: ( ( ( rule__Vector__XAssignment_1 ) ) )
            // InternalXDrone.g:3086:1: ( ( rule__Vector__XAssignment_1 ) )
            {
            // InternalXDrone.g:3086:1: ( ( rule__Vector__XAssignment_1 ) )
            // InternalXDrone.g:3087:2: ( rule__Vector__XAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getXAssignment_1()); 
            // InternalXDrone.g:3088:2: ( rule__Vector__XAssignment_1 )
            // InternalXDrone.g:3088:3: rule__Vector__XAssignment_1
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
    // InternalXDrone.g:3096:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3100:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // InternalXDrone.g:3101:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
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
    // InternalXDrone.g:3108:1: rule__Vector__Group__2__Impl : ( ',' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3112:1: ( ( ',' ) )
            // InternalXDrone.g:3113:1: ( ',' )
            {
            // InternalXDrone.g:3113:1: ( ',' )
            // InternalXDrone.g:3114:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalXDrone.g:3123:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3127:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // InternalXDrone.g:3128:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalXDrone.g:3135:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__YAssignment_3 ) ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3139:1: ( ( ( rule__Vector__YAssignment_3 ) ) )
            // InternalXDrone.g:3140:1: ( ( rule__Vector__YAssignment_3 ) )
            {
            // InternalXDrone.g:3140:1: ( ( rule__Vector__YAssignment_3 ) )
            // InternalXDrone.g:3141:2: ( rule__Vector__YAssignment_3 )
            {
             before(grammarAccess.getVectorAccess().getYAssignment_3()); 
            // InternalXDrone.g:3142:2: ( rule__Vector__YAssignment_3 )
            // InternalXDrone.g:3142:3: rule__Vector__YAssignment_3
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
    // InternalXDrone.g:3150:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl rule__Vector__Group__5 ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3154:1: ( rule__Vector__Group__4__Impl rule__Vector__Group__5 )
            // InternalXDrone.g:3155:2: rule__Vector__Group__4__Impl rule__Vector__Group__5
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
    // InternalXDrone.g:3162:1: rule__Vector__Group__4__Impl : ( ',' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3166:1: ( ( ',' ) )
            // InternalXDrone.g:3167:1: ( ',' )
            {
            // InternalXDrone.g:3167:1: ( ',' )
            // InternalXDrone.g:3168:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalXDrone.g:3177:1: rule__Vector__Group__5 : rule__Vector__Group__5__Impl rule__Vector__Group__6 ;
    public final void rule__Vector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3181:1: ( rule__Vector__Group__5__Impl rule__Vector__Group__6 )
            // InternalXDrone.g:3182:2: rule__Vector__Group__5__Impl rule__Vector__Group__6
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
    // InternalXDrone.g:3189:1: rule__Vector__Group__5__Impl : ( ( rule__Vector__ZAssignment_5 ) ) ;
    public final void rule__Vector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3193:1: ( ( ( rule__Vector__ZAssignment_5 ) ) )
            // InternalXDrone.g:3194:1: ( ( rule__Vector__ZAssignment_5 ) )
            {
            // InternalXDrone.g:3194:1: ( ( rule__Vector__ZAssignment_5 ) )
            // InternalXDrone.g:3195:2: ( rule__Vector__ZAssignment_5 )
            {
             before(grammarAccess.getVectorAccess().getZAssignment_5()); 
            // InternalXDrone.g:3196:2: ( rule__Vector__ZAssignment_5 )
            // InternalXDrone.g:3196:3: rule__Vector__ZAssignment_5
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
    // InternalXDrone.g:3204:1: rule__Vector__Group__6 : rule__Vector__Group__6__Impl ;
    public final void rule__Vector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3208:1: ( rule__Vector__Group__6__Impl )
            // InternalXDrone.g:3209:2: rule__Vector__Group__6__Impl
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
    // InternalXDrone.g:3215:1: rule__Vector__Group__6__Impl : ( ')' ) ;
    public final void rule__Vector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3219:1: ( ( ')' ) )
            // InternalXDrone.g:3220:1: ( ')' )
            {
            // InternalXDrone.g:3220:1: ( ')' )
            // InternalXDrone.g:3221:2: ')'
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
    // InternalXDrone.g:3231:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3235:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalXDrone.g:3236:2: rule__Color__Group__0__Impl rule__Color__Group__1
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
    // InternalXDrone.g:3243:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3247:1: ( ( 'color' ) )
            // InternalXDrone.g:3248:1: ( 'color' )
            {
            // InternalXDrone.g:3248:1: ( 'color' )
            // InternalXDrone.g:3249:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:3258:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3262:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalXDrone.g:3263:2: rule__Color__Group__1__Impl rule__Color__Group__2
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
    // InternalXDrone.g:3270:1: rule__Color__Group__1__Impl : ( '=' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3274:1: ( ( '=' ) )
            // InternalXDrone.g:3275:1: ( '=' )
            {
            // InternalXDrone.g:3275:1: ( '=' )
            // InternalXDrone.g:3276:2: '='
            {
             before(grammarAccess.getColorAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:3285:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3289:1: ( rule__Color__Group__2__Impl )
            // InternalXDrone.g:3290:2: rule__Color__Group__2__Impl
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
    // InternalXDrone.g:3296:1: rule__Color__Group__2__Impl : ( ( rule__Color__Color_valueAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3300:1: ( ( ( rule__Color__Color_valueAssignment_2 ) ) )
            // InternalXDrone.g:3301:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            {
            // InternalXDrone.g:3301:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            // InternalXDrone.g:3302:2: ( rule__Color__Color_valueAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 
            // InternalXDrone.g:3303:2: ( rule__Color__Color_valueAssignment_2 )
            // InternalXDrone.g:3303:3: rule__Color__Color_valueAssignment_2
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
    // InternalXDrone.g:3312:1: rule__Walls__Group__0 : rule__Walls__Group__0__Impl rule__Walls__Group__1 ;
    public final void rule__Walls__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3316:1: ( rule__Walls__Group__0__Impl rule__Walls__Group__1 )
            // InternalXDrone.g:3317:2: rule__Walls__Group__0__Impl rule__Walls__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXDrone.g:3324:1: rule__Walls__Group__0__Impl : ( 'WALLS' ) ;
    public final void rule__Walls__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3328:1: ( ( 'WALLS' ) )
            // InternalXDrone.g:3329:1: ( 'WALLS' )
            {
            // InternalXDrone.g:3329:1: ( 'WALLS' )
            // InternalXDrone.g:3330:2: 'WALLS'
            {
             before(grammarAccess.getWallsAccess().getWALLSKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalXDrone.g:3339:1: rule__Walls__Group__1 : rule__Walls__Group__1__Impl rule__Walls__Group__2 ;
    public final void rule__Walls__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3343:1: ( rule__Walls__Group__1__Impl rule__Walls__Group__2 )
            // InternalXDrone.g:3344:2: rule__Walls__Group__1__Impl rule__Walls__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalXDrone.g:3351:1: rule__Walls__Group__1__Impl : ( '{' ) ;
    public final void rule__Walls__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3355:1: ( ( '{' ) )
            // InternalXDrone.g:3356:1: ( '{' )
            {
            // InternalXDrone.g:3356:1: ( '{' )
            // InternalXDrone.g:3357:2: '{'
            {
             before(grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalXDrone.g:3366:1: rule__Walls__Group__2 : rule__Walls__Group__2__Impl rule__Walls__Group__3 ;
    public final void rule__Walls__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3370:1: ( rule__Walls__Group__2__Impl rule__Walls__Group__3 )
            // InternalXDrone.g:3371:2: rule__Walls__Group__2__Impl rule__Walls__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalXDrone.g:3378:1: rule__Walls__Group__2__Impl : ( ( rule__Walls__Alternatives_2 )* ) ;
    public final void rule__Walls__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3382:1: ( ( ( rule__Walls__Alternatives_2 )* ) )
            // InternalXDrone.g:3383:1: ( ( rule__Walls__Alternatives_2 )* )
            {
            // InternalXDrone.g:3383:1: ( ( rule__Walls__Alternatives_2 )* )
            // InternalXDrone.g:3384:2: ( rule__Walls__Alternatives_2 )*
            {
             before(grammarAccess.getWallsAccess().getAlternatives_2()); 
            // InternalXDrone.g:3385:2: ( rule__Walls__Alternatives_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=39 && LA13_0<=43)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXDrone.g:3385:3: rule__Walls__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Walls__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWallsAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalXDrone.g:3393:1: rule__Walls__Group__3 : rule__Walls__Group__3__Impl ;
    public final void rule__Walls__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3397:1: ( rule__Walls__Group__3__Impl )
            // InternalXDrone.g:3398:2: rule__Walls__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Walls__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalXDrone.g:3404:1: rule__Walls__Group__3__Impl : ( '}' ) ;
    public final void rule__Walls__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3408:1: ( ( '}' ) )
            // InternalXDrone.g:3409:1: ( '}' )
            {
            // InternalXDrone.g:3409:1: ( '}' )
            // InternalXDrone.g:3410:2: '}'
            {
             before(grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__FrontWall__Group__0"
    // InternalXDrone.g:3420:1: rule__FrontWall__Group__0 : rule__FrontWall__Group__0__Impl rule__FrontWall__Group__1 ;
    public final void rule__FrontWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3424:1: ( rule__FrontWall__Group__0__Impl rule__FrontWall__Group__1 )
            // InternalXDrone.g:3425:2: rule__FrontWall__Group__0__Impl rule__FrontWall__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FrontWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__0"


    // $ANTLR start "rule__FrontWall__Group__0__Impl"
    // InternalXDrone.g:3432:1: rule__FrontWall__Group__0__Impl : ( 'front' ) ;
    public final void rule__FrontWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3436:1: ( ( 'front' ) )
            // InternalXDrone.g:3437:1: ( 'front' )
            {
            // InternalXDrone.g:3437:1: ( 'front' )
            // InternalXDrone.g:3438:2: 'front'
            {
             before(grammarAccess.getFrontWallAccess().getFrontKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFrontWallAccess().getFrontKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__0__Impl"


    // $ANTLR start "rule__FrontWall__Group__1"
    // InternalXDrone.g:3447:1: rule__FrontWall__Group__1 : rule__FrontWall__Group__1__Impl rule__FrontWall__Group__2 ;
    public final void rule__FrontWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3451:1: ( rule__FrontWall__Group__1__Impl rule__FrontWall__Group__2 )
            // InternalXDrone.g:3452:2: rule__FrontWall__Group__1__Impl rule__FrontWall__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FrontWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__1"


    // $ANTLR start "rule__FrontWall__Group__1__Impl"
    // InternalXDrone.g:3459:1: rule__FrontWall__Group__1__Impl : ( '=' ) ;
    public final void rule__FrontWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3463:1: ( ( '=' ) )
            // InternalXDrone.g:3464:1: ( '=' )
            {
            // InternalXDrone.g:3464:1: ( '=' )
            // InternalXDrone.g:3465:2: '='
            {
             before(grammarAccess.getFrontWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFrontWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__1__Impl"


    // $ANTLR start "rule__FrontWall__Group__2"
    // InternalXDrone.g:3474:1: rule__FrontWall__Group__2 : rule__FrontWall__Group__2__Impl ;
    public final void rule__FrontWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3478:1: ( rule__FrontWall__Group__2__Impl )
            // InternalXDrone.g:3479:2: rule__FrontWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__2"


    // $ANTLR start "rule__FrontWall__Group__2__Impl"
    // InternalXDrone.g:3485:1: rule__FrontWall__Group__2__Impl : ( ( rule__FrontWall__ValueAssignment_2 ) ) ;
    public final void rule__FrontWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3489:1: ( ( ( rule__FrontWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:3490:1: ( ( rule__FrontWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:3490:1: ( ( rule__FrontWall__ValueAssignment_2 ) )
            // InternalXDrone.g:3491:2: ( rule__FrontWall__ValueAssignment_2 )
            {
             before(grammarAccess.getFrontWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:3492:2: ( rule__FrontWall__ValueAssignment_2 )
            // InternalXDrone.g:3492:3: rule__FrontWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FrontWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFrontWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__2__Impl"


    // $ANTLR start "rule__RightWall__Group__0"
    // InternalXDrone.g:3501:1: rule__RightWall__Group__0 : rule__RightWall__Group__0__Impl rule__RightWall__Group__1 ;
    public final void rule__RightWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3505:1: ( rule__RightWall__Group__0__Impl rule__RightWall__Group__1 )
            // InternalXDrone.g:3506:2: rule__RightWall__Group__0__Impl rule__RightWall__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RightWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__0"


    // $ANTLR start "rule__RightWall__Group__0__Impl"
    // InternalXDrone.g:3513:1: rule__RightWall__Group__0__Impl : ( 'right' ) ;
    public final void rule__RightWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3517:1: ( ( 'right' ) )
            // InternalXDrone.g:3518:1: ( 'right' )
            {
            // InternalXDrone.g:3518:1: ( 'right' )
            // InternalXDrone.g:3519:2: 'right'
            {
             before(grammarAccess.getRightWallAccess().getRightKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRightWallAccess().getRightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__0__Impl"


    // $ANTLR start "rule__RightWall__Group__1"
    // InternalXDrone.g:3528:1: rule__RightWall__Group__1 : rule__RightWall__Group__1__Impl rule__RightWall__Group__2 ;
    public final void rule__RightWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3532:1: ( rule__RightWall__Group__1__Impl rule__RightWall__Group__2 )
            // InternalXDrone.g:3533:2: rule__RightWall__Group__1__Impl rule__RightWall__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RightWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__1"


    // $ANTLR start "rule__RightWall__Group__1__Impl"
    // InternalXDrone.g:3540:1: rule__RightWall__Group__1__Impl : ( '=' ) ;
    public final void rule__RightWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3544:1: ( ( '=' ) )
            // InternalXDrone.g:3545:1: ( '=' )
            {
            // InternalXDrone.g:3545:1: ( '=' )
            // InternalXDrone.g:3546:2: '='
            {
             before(grammarAccess.getRightWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRightWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__1__Impl"


    // $ANTLR start "rule__RightWall__Group__2"
    // InternalXDrone.g:3555:1: rule__RightWall__Group__2 : rule__RightWall__Group__2__Impl ;
    public final void rule__RightWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3559:1: ( rule__RightWall__Group__2__Impl )
            // InternalXDrone.g:3560:2: rule__RightWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__2"


    // $ANTLR start "rule__RightWall__Group__2__Impl"
    // InternalXDrone.g:3566:1: rule__RightWall__Group__2__Impl : ( ( rule__RightWall__ValueAssignment_2 ) ) ;
    public final void rule__RightWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3570:1: ( ( ( rule__RightWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:3571:1: ( ( rule__RightWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:3571:1: ( ( rule__RightWall__ValueAssignment_2 ) )
            // InternalXDrone.g:3572:2: ( rule__RightWall__ValueAssignment_2 )
            {
             before(grammarAccess.getRightWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:3573:2: ( rule__RightWall__ValueAssignment_2 )
            // InternalXDrone.g:3573:3: rule__RightWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RightWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__2__Impl"


    // $ANTLR start "rule__LeftWall__Group__0"
    // InternalXDrone.g:3582:1: rule__LeftWall__Group__0 : rule__LeftWall__Group__0__Impl rule__LeftWall__Group__1 ;
    public final void rule__LeftWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3586:1: ( rule__LeftWall__Group__0__Impl rule__LeftWall__Group__1 )
            // InternalXDrone.g:3587:2: rule__LeftWall__Group__0__Impl rule__LeftWall__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LeftWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__0"


    // $ANTLR start "rule__LeftWall__Group__0__Impl"
    // InternalXDrone.g:3594:1: rule__LeftWall__Group__0__Impl : ( 'left' ) ;
    public final void rule__LeftWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3598:1: ( ( 'left' ) )
            // InternalXDrone.g:3599:1: ( 'left' )
            {
            // InternalXDrone.g:3599:1: ( 'left' )
            // InternalXDrone.g:3600:2: 'left'
            {
             before(grammarAccess.getLeftWallAccess().getLeftKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLeftWallAccess().getLeftKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__0__Impl"


    // $ANTLR start "rule__LeftWall__Group__1"
    // InternalXDrone.g:3609:1: rule__LeftWall__Group__1 : rule__LeftWall__Group__1__Impl rule__LeftWall__Group__2 ;
    public final void rule__LeftWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3613:1: ( rule__LeftWall__Group__1__Impl rule__LeftWall__Group__2 )
            // InternalXDrone.g:3614:2: rule__LeftWall__Group__1__Impl rule__LeftWall__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__LeftWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__1"


    // $ANTLR start "rule__LeftWall__Group__1__Impl"
    // InternalXDrone.g:3621:1: rule__LeftWall__Group__1__Impl : ( '=' ) ;
    public final void rule__LeftWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3625:1: ( ( '=' ) )
            // InternalXDrone.g:3626:1: ( '=' )
            {
            // InternalXDrone.g:3626:1: ( '=' )
            // InternalXDrone.g:3627:2: '='
            {
             before(grammarAccess.getLeftWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLeftWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__1__Impl"


    // $ANTLR start "rule__LeftWall__Group__2"
    // InternalXDrone.g:3636:1: rule__LeftWall__Group__2 : rule__LeftWall__Group__2__Impl ;
    public final void rule__LeftWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3640:1: ( rule__LeftWall__Group__2__Impl )
            // InternalXDrone.g:3641:2: rule__LeftWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__2"


    // $ANTLR start "rule__LeftWall__Group__2__Impl"
    // InternalXDrone.g:3647:1: rule__LeftWall__Group__2__Impl : ( ( rule__LeftWall__ValueAssignment_2 ) ) ;
    public final void rule__LeftWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3651:1: ( ( ( rule__LeftWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:3652:1: ( ( rule__LeftWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:3652:1: ( ( rule__LeftWall__ValueAssignment_2 ) )
            // InternalXDrone.g:3653:2: ( rule__LeftWall__ValueAssignment_2 )
            {
             before(grammarAccess.getLeftWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:3654:2: ( rule__LeftWall__ValueAssignment_2 )
            // InternalXDrone.g:3654:3: rule__LeftWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeftWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__2__Impl"


    // $ANTLR start "rule__BackWall__Group__0"
    // InternalXDrone.g:3663:1: rule__BackWall__Group__0 : rule__BackWall__Group__0__Impl rule__BackWall__Group__1 ;
    public final void rule__BackWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3667:1: ( rule__BackWall__Group__0__Impl rule__BackWall__Group__1 )
            // InternalXDrone.g:3668:2: rule__BackWall__Group__0__Impl rule__BackWall__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BackWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__0"


    // $ANTLR start "rule__BackWall__Group__0__Impl"
    // InternalXDrone.g:3675:1: rule__BackWall__Group__0__Impl : ( 'back' ) ;
    public final void rule__BackWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3679:1: ( ( 'back' ) )
            // InternalXDrone.g:3680:1: ( 'back' )
            {
            // InternalXDrone.g:3680:1: ( 'back' )
            // InternalXDrone.g:3681:2: 'back'
            {
             before(grammarAccess.getBackWallAccess().getBackKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBackWallAccess().getBackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__0__Impl"


    // $ANTLR start "rule__BackWall__Group__1"
    // InternalXDrone.g:3690:1: rule__BackWall__Group__1 : rule__BackWall__Group__1__Impl rule__BackWall__Group__2 ;
    public final void rule__BackWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3694:1: ( rule__BackWall__Group__1__Impl rule__BackWall__Group__2 )
            // InternalXDrone.g:3695:2: rule__BackWall__Group__1__Impl rule__BackWall__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BackWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__1"


    // $ANTLR start "rule__BackWall__Group__1__Impl"
    // InternalXDrone.g:3702:1: rule__BackWall__Group__1__Impl : ( '=' ) ;
    public final void rule__BackWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3706:1: ( ( '=' ) )
            // InternalXDrone.g:3707:1: ( '=' )
            {
            // InternalXDrone.g:3707:1: ( '=' )
            // InternalXDrone.g:3708:2: '='
            {
             before(grammarAccess.getBackWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBackWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__1__Impl"


    // $ANTLR start "rule__BackWall__Group__2"
    // InternalXDrone.g:3717:1: rule__BackWall__Group__2 : rule__BackWall__Group__2__Impl ;
    public final void rule__BackWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3721:1: ( rule__BackWall__Group__2__Impl )
            // InternalXDrone.g:3722:2: rule__BackWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__2"


    // $ANTLR start "rule__BackWall__Group__2__Impl"
    // InternalXDrone.g:3728:1: rule__BackWall__Group__2__Impl : ( ( rule__BackWall__ValueAssignment_2 ) ) ;
    public final void rule__BackWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3732:1: ( ( ( rule__BackWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:3733:1: ( ( rule__BackWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:3733:1: ( ( rule__BackWall__ValueAssignment_2 ) )
            // InternalXDrone.g:3734:2: ( rule__BackWall__ValueAssignment_2 )
            {
             before(grammarAccess.getBackWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:3735:2: ( rule__BackWall__ValueAssignment_2 )
            // InternalXDrone.g:3735:3: rule__BackWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BackWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__2__Impl"


    // $ANTLR start "rule__UpWall__Group__0"
    // InternalXDrone.g:3744:1: rule__UpWall__Group__0 : rule__UpWall__Group__0__Impl rule__UpWall__Group__1 ;
    public final void rule__UpWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3748:1: ( rule__UpWall__Group__0__Impl rule__UpWall__Group__1 )
            // InternalXDrone.g:3749:2: rule__UpWall__Group__0__Impl rule__UpWall__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__UpWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__0"


    // $ANTLR start "rule__UpWall__Group__0__Impl"
    // InternalXDrone.g:3756:1: rule__UpWall__Group__0__Impl : ( 'up' ) ;
    public final void rule__UpWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3760:1: ( ( 'up' ) )
            // InternalXDrone.g:3761:1: ( 'up' )
            {
            // InternalXDrone.g:3761:1: ( 'up' )
            // InternalXDrone.g:3762:2: 'up'
            {
             before(grammarAccess.getUpWallAccess().getUpKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getUpWallAccess().getUpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__0__Impl"


    // $ANTLR start "rule__UpWall__Group__1"
    // InternalXDrone.g:3771:1: rule__UpWall__Group__1 : rule__UpWall__Group__1__Impl rule__UpWall__Group__2 ;
    public final void rule__UpWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3775:1: ( rule__UpWall__Group__1__Impl rule__UpWall__Group__2 )
            // InternalXDrone.g:3776:2: rule__UpWall__Group__1__Impl rule__UpWall__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__UpWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__1"


    // $ANTLR start "rule__UpWall__Group__1__Impl"
    // InternalXDrone.g:3783:1: rule__UpWall__Group__1__Impl : ( '=' ) ;
    public final void rule__UpWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3787:1: ( ( '=' ) )
            // InternalXDrone.g:3788:1: ( '=' )
            {
            // InternalXDrone.g:3788:1: ( '=' )
            // InternalXDrone.g:3789:2: '='
            {
             before(grammarAccess.getUpWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUpWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__1__Impl"


    // $ANTLR start "rule__UpWall__Group__2"
    // InternalXDrone.g:3798:1: rule__UpWall__Group__2 : rule__UpWall__Group__2__Impl ;
    public final void rule__UpWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3802:1: ( rule__UpWall__Group__2__Impl )
            // InternalXDrone.g:3803:2: rule__UpWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__2"


    // $ANTLR start "rule__UpWall__Group__2__Impl"
    // InternalXDrone.g:3809:1: rule__UpWall__Group__2__Impl : ( ( rule__UpWall__ValueAssignment_2 ) ) ;
    public final void rule__UpWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3813:1: ( ( ( rule__UpWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:3814:1: ( ( rule__UpWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:3814:1: ( ( rule__UpWall__ValueAssignment_2 ) )
            // InternalXDrone.g:3815:2: ( rule__UpWall__ValueAssignment_2 )
            {
             before(grammarAccess.getUpWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:3816:2: ( rule__UpWall__ValueAssignment_2 )
            // InternalXDrone.g:3816:3: rule__UpWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__2__Impl"


    // $ANTLR start "rule__Program__MainAssignment"
    // InternalXDrone.g:3825:1: rule__Program__MainAssignment : ( ruleMain ) ;
    public final void rule__Program__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3829:1: ( ( ruleMain ) )
            // InternalXDrone.g:3830:2: ( ruleMain )
            {
            // InternalXDrone.g:3830:2: ( ruleMain )
            // InternalXDrone.g:3831:3: ruleMain
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
    // InternalXDrone.g:3840:1: rule__Main__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Main__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3844:1: ( ( ruleFly ) )
            // InternalXDrone.g:3845:2: ( ruleFly )
            {
            // InternalXDrone.g:3845:2: ( ruleFly )
            // InternalXDrone.g:3846:3: ruleFly
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
    // InternalXDrone.g:3855:1: rule__Main__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Main__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3859:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:3860:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:3860:2: ( ruleEnvironment )
            // InternalXDrone.g:3861:3: ruleEnvironment
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
    // InternalXDrone.g:3870:1: rule__Fly__TakeoffAssignment_1_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3874:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:3875:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:3875:2: ( ruleTakeoff )
            // InternalXDrone.g:3876:3: ruleTakeoff
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
    // InternalXDrone.g:3885:1: rule__Fly__CommandsAssignment_1_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3889:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:3890:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:3890:2: ( ruleSuperCommand )
            // InternalXDrone.g:3891:3: ruleSuperCommand
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
    // InternalXDrone.g:3900:1: rule__Fly__LandAssignment_1_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3904:1: ( ( ruleLand ) )
            // InternalXDrone.g:3905:2: ( ruleLand )
            {
            // InternalXDrone.g:3905:2: ( ruleLand )
            // InternalXDrone.g:3906:3: ruleLand
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
    // InternalXDrone.g:3915:1: rule__Environment__DroneAssignment_2_0 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3919:1: ( ( ruleDrone ) )
            // InternalXDrone.g:3920:2: ( ruleDrone )
            {
            // InternalXDrone.g:3920:2: ( ruleDrone )
            // InternalXDrone.g:3921:3: ruleDrone
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
    // InternalXDrone.g:3930:1: rule__Environment__WallsAssignment_2_1 : ( ruleWalls ) ;
    public final void rule__Environment__WallsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3934:1: ( ( ruleWalls ) )
            // InternalXDrone.g:3935:2: ( ruleWalls )
            {
            // InternalXDrone.g:3935:2: ( ruleWalls )
            // InternalXDrone.g:3936:3: ruleWalls
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
    // InternalXDrone.g:3945:1: rule__Environment__ObjectsAssignment_2_2 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3949:1: ( ( ruleObject ) )
            // InternalXDrone.g:3950:2: ( ruleObject )
            {
            // InternalXDrone.g:3950:2: ( ruleObject )
            // InternalXDrone.g:3951:3: ruleObject
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
    // InternalXDrone.g:3960:1: rule__GoTo__Object_nameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoTo__Object_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3964:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:3965:2: ( RULE_STRING )
            {
            // InternalXDrone.g:3965:2: ( RULE_STRING )
            // InternalXDrone.g:3966:3: RULE_STRING
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


    // $ANTLR start "rule__Rotate__AngleAssignment_2"
    // InternalXDrone.g:3975:1: rule__Rotate__AngleAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Rotate__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3979:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3980:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3980:2: ( ruleDOUBLE )
            // InternalXDrone.g:3981:3: ruleDOUBLE
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
    // InternalXDrone.g:3990:1: rule__Up__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Up__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3994:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3995:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3995:2: ( ruleDOUBLE )
            // InternalXDrone.g:3996:3: ruleDOUBLE
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
    // InternalXDrone.g:4005:1: rule__Down__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Down__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4009:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4010:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4010:2: ( ruleDOUBLE )
            // InternalXDrone.g:4011:3: ruleDOUBLE
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
    // InternalXDrone.g:4020:1: rule__Left__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Left__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4024:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4025:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4025:2: ( ruleDOUBLE )
            // InternalXDrone.g:4026:3: ruleDOUBLE
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
    // InternalXDrone.g:4035:1: rule__Right__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Right__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4039:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4040:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4040:2: ( ruleDOUBLE )
            // InternalXDrone.g:4041:3: ruleDOUBLE
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
    // InternalXDrone.g:4050:1: rule__Forward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4054:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4055:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4055:2: ( ruleDOUBLE )
            // InternalXDrone.g:4056:3: ruleDOUBLE
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
    // InternalXDrone.g:4065:1: rule__Backward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Backward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4069:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4070:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4070:2: ( ruleDOUBLE )
            // InternalXDrone.g:4071:3: ruleDOUBLE
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


    // $ANTLR start "rule__Wait__SecondsAssignment_2"
    // InternalXDrone.g:4080:1: rule__Wait__SecondsAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4084:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4085:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4085:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4086:3: rulePOSITIVE_DOUBLE
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


    // $ANTLR start "rule__Drone__PositionAssignment_2_0"
    // InternalXDrone.g:4095:1: rule__Drone__PositionAssignment_2_0 : ( rulePosition ) ;
    public final void rule__Drone__PositionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4099:1: ( ( rulePosition ) )
            // InternalXDrone.g:4100:2: ( rulePosition )
            {
            // InternalXDrone.g:4100:2: ( rulePosition )
            // InternalXDrone.g:4101:3: rulePosition
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
    // InternalXDrone.g:4110:1: rule__Drone__RotationAssignment_2_1_2 : ( ruleDOUBLE ) ;
    public final void rule__Drone__RotationAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4114:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4115:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4115:2: ( ruleDOUBLE )
            // InternalXDrone.g:4116:3: ruleDOUBLE
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
    // InternalXDrone.g:4125:1: rule__Object__Object_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4129:1: ( ( RULE_ID ) )
            // InternalXDrone.g:4130:2: ( RULE_ID )
            {
            // InternalXDrone.g:4130:2: ( RULE_ID )
            // InternalXDrone.g:4131:3: RULE_ID
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
    // InternalXDrone.g:4140:1: rule__Object__OriginAssignment_2_0 : ( ruleOrigin ) ;
    public final void rule__Object__OriginAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4144:1: ( ( ruleOrigin ) )
            // InternalXDrone.g:4145:2: ( ruleOrigin )
            {
            // InternalXDrone.g:4145:2: ( ruleOrigin )
            // InternalXDrone.g:4146:3: ruleOrigin
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
    // InternalXDrone.g:4155:1: rule__Object__SizeAssignment_2_1 : ( ruleSize ) ;
    public final void rule__Object__SizeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4159:1: ( ( ruleSize ) )
            // InternalXDrone.g:4160:2: ( ruleSize )
            {
            // InternalXDrone.g:4160:2: ( ruleSize )
            // InternalXDrone.g:4161:3: ruleSize
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
    // InternalXDrone.g:4170:1: rule__Object__ColorAssignment_2_2 : ( ruleColor ) ;
    public final void rule__Object__ColorAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4174:1: ( ( ruleColor ) )
            // InternalXDrone.g:4175:2: ( ruleColor )
            {
            // InternalXDrone.g:4175:2: ( ruleColor )
            // InternalXDrone.g:4176:3: ruleColor
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
    // InternalXDrone.g:4185:1: rule__Origin__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Origin__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4189:1: ( ( ruleVector ) )
            // InternalXDrone.g:4190:2: ( ruleVector )
            {
            // InternalXDrone.g:4190:2: ( ruleVector )
            // InternalXDrone.g:4191:3: ruleVector
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
    // InternalXDrone.g:4200:1: rule__Size__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Size__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4204:1: ( ( ruleVector ) )
            // InternalXDrone.g:4205:2: ( ruleVector )
            {
            // InternalXDrone.g:4205:2: ( ruleVector )
            // InternalXDrone.g:4206:3: ruleVector
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
    // InternalXDrone.g:4215:1: rule__Position__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Position__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4219:1: ( ( ruleVector ) )
            // InternalXDrone.g:4220:2: ( ruleVector )
            {
            // InternalXDrone.g:4220:2: ( ruleVector )
            // InternalXDrone.g:4221:3: ruleVector
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
    // InternalXDrone.g:4230:1: rule__Vector__XAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Vector__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4234:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4235:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4235:2: ( ruleDOUBLE )
            // InternalXDrone.g:4236:3: ruleDOUBLE
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
    // InternalXDrone.g:4245:1: rule__Vector__YAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Vector__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4249:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4250:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4250:2: ( ruleDOUBLE )
            // InternalXDrone.g:4251:3: ruleDOUBLE
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
    // InternalXDrone.g:4260:1: rule__Vector__ZAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Vector__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4264:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4265:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4265:2: ( ruleDOUBLE )
            // InternalXDrone.g:4266:3: ruleDOUBLE
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
    // InternalXDrone.g:4275:1: rule__Color__Color_valueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__Color_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4279:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:4280:2: ( RULE_STRING )
            {
            // InternalXDrone.g:4280:2: ( RULE_STRING )
            // InternalXDrone.g:4281:3: RULE_STRING
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


    // $ANTLR start "rule__Walls__FrontAssignment_2_0"
    // InternalXDrone.g:4290:1: rule__Walls__FrontAssignment_2_0 : ( ruleFrontWall ) ;
    public final void rule__Walls__FrontAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4294:1: ( ( ruleFrontWall ) )
            // InternalXDrone.g:4295:2: ( ruleFrontWall )
            {
            // InternalXDrone.g:4295:2: ( ruleFrontWall )
            // InternalXDrone.g:4296:3: ruleFrontWall
            {
             before(grammarAccess.getWallsAccess().getFrontFrontWallParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFrontWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getFrontFrontWallParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__FrontAssignment_2_0"


    // $ANTLR start "rule__Walls__RightAssignment_2_1"
    // InternalXDrone.g:4305:1: rule__Walls__RightAssignment_2_1 : ( ruleRightWall ) ;
    public final void rule__Walls__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4309:1: ( ( ruleRightWall ) )
            // InternalXDrone.g:4310:2: ( ruleRightWall )
            {
            // InternalXDrone.g:4310:2: ( ruleRightWall )
            // InternalXDrone.g:4311:3: ruleRightWall
            {
             before(grammarAccess.getWallsAccess().getRightRightWallParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRightWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getRightRightWallParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__RightAssignment_2_1"


    // $ANTLR start "rule__Walls__BackAssignment_2_2"
    // InternalXDrone.g:4320:1: rule__Walls__BackAssignment_2_2 : ( ruleBackWall ) ;
    public final void rule__Walls__BackAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4324:1: ( ( ruleBackWall ) )
            // InternalXDrone.g:4325:2: ( ruleBackWall )
            {
            // InternalXDrone.g:4325:2: ( ruleBackWall )
            // InternalXDrone.g:4326:3: ruleBackWall
            {
             before(grammarAccess.getWallsAccess().getBackBackWallParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBackWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getBackBackWallParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__BackAssignment_2_2"


    // $ANTLR start "rule__Walls__LeftAssignment_2_3"
    // InternalXDrone.g:4335:1: rule__Walls__LeftAssignment_2_3 : ( ruleLeftWall ) ;
    public final void rule__Walls__LeftAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4339:1: ( ( ruleLeftWall ) )
            // InternalXDrone.g:4340:2: ( ruleLeftWall )
            {
            // InternalXDrone.g:4340:2: ( ruleLeftWall )
            // InternalXDrone.g:4341:3: ruleLeftWall
            {
             before(grammarAccess.getWallsAccess().getLeftLeftWallParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLeftWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getLeftLeftWallParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__LeftAssignment_2_3"


    // $ANTLR start "rule__Walls__UpAssignment_2_4"
    // InternalXDrone.g:4350:1: rule__Walls__UpAssignment_2_4 : ( ruleUpWall ) ;
    public final void rule__Walls__UpAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4354:1: ( ( ruleUpWall ) )
            // InternalXDrone.g:4355:2: ( ruleUpWall )
            {
            // InternalXDrone.g:4355:2: ( ruleUpWall )
            // InternalXDrone.g:4356:3: ruleUpWall
            {
             before(grammarAccess.getWallsAccess().getUpUpWallParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUpWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getUpUpWallParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UpAssignment_2_4"


    // $ANTLR start "rule__FrontWall__ValueAssignment_2"
    // InternalXDrone.g:4365:1: rule__FrontWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__FrontWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4369:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4370:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4370:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4371:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getFrontWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getFrontWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__ValueAssignment_2"


    // $ANTLR start "rule__RightWall__ValueAssignment_2"
    // InternalXDrone.g:4380:1: rule__RightWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__RightWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4384:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4385:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4385:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4386:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getRightWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getRightWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__ValueAssignment_2"


    // $ANTLR start "rule__LeftWall__ValueAssignment_2"
    // InternalXDrone.g:4395:1: rule__LeftWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__LeftWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4399:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4400:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4400:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4401:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getLeftWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getLeftWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__ValueAssignment_2"


    // $ANTLR start "rule__BackWall__ValueAssignment_2"
    // InternalXDrone.g:4410:1: rule__BackWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__BackWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4414:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4415:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4415:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4416:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getBackWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getBackWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__ValueAssignment_2"


    // $ANTLR start "rule__UpWall__ValueAssignment_2"
    // InternalXDrone.g:4425:1: rule__UpWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__UpWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4429:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4430:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4430:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4431:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getUpWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getUpWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001FE41000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001FE40002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004020004040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004020000042L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000880004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000880000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002600004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002600000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000F8000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000F8000000002L});

}
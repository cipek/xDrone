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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF()'", "'LAND()'", "'fly(){'", "'}'", "'environment(){'", "'-'", "'.'", "'MOVE'", "'ROTATE'", "'('", "')'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'origin'", "'='", "'size'", "','", "'color'", "'WALLS'"
    };
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleMove"
    // InternalXDrone.g:303:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalXDrone.g:304:1: ( ruleMove EOF )
            // InternalXDrone.g:305:1: ruleMove EOF
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
    // InternalXDrone.g:312:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:316:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalXDrone.g:317:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalXDrone.g:317:2: ( ( rule__Move__Group__0 ) )
            // InternalXDrone.g:318:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalXDrone.g:319:3: ( rule__Move__Group__0 )
            // InternalXDrone.g:319:4: rule__Move__Group__0
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


    // $ANTLR start "entryRuleRotateL"
    // InternalXDrone.g:503:1: entryRuleRotateL : ruleRotateL EOF ;
    public final void entryRuleRotateL() throws RecognitionException {
        try {
            // InternalXDrone.g:504:1: ( ruleRotateL EOF )
            // InternalXDrone.g:505:1: ruleRotateL EOF
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
    // InternalXDrone.g:512:1: ruleRotateL : ( ( rule__RotateL__Group__0 ) ) ;
    public final void ruleRotateL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:516:2: ( ( ( rule__RotateL__Group__0 ) ) )
            // InternalXDrone.g:517:2: ( ( rule__RotateL__Group__0 ) )
            {
            // InternalXDrone.g:517:2: ( ( rule__RotateL__Group__0 ) )
            // InternalXDrone.g:518:3: ( rule__RotateL__Group__0 )
            {
             before(grammarAccess.getRotateLAccess().getGroup()); 
            // InternalXDrone.g:519:3: ( rule__RotateL__Group__0 )
            // InternalXDrone.g:519:4: rule__RotateL__Group__0
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
    // InternalXDrone.g:528:1: entryRuleRotateR : ruleRotateR EOF ;
    public final void entryRuleRotateR() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( ruleRotateR EOF )
            // InternalXDrone.g:530:1: ruleRotateR EOF
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
    // InternalXDrone.g:537:1: ruleRotateR : ( ( rule__RotateR__Group__0 ) ) ;
    public final void ruleRotateR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__RotateR__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__RotateR__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__RotateR__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__RotateR__Group__0 )
            {
             before(grammarAccess.getRotateRAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__RotateR__Group__0 )
            // InternalXDrone.g:544:4: rule__RotateR__Group__0
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
    // InternalXDrone.g:553:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalXDrone.g:554:1: ( ruleWait EOF )
            // InternalXDrone.g:555:1: ruleWait EOF
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
    // InternalXDrone.g:562:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:566:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalXDrone.g:567:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalXDrone.g:567:2: ( ( rule__Wait__Group__0 ) )
            // InternalXDrone.g:568:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalXDrone.g:569:3: ( rule__Wait__Group__0 )
            // InternalXDrone.g:569:4: rule__Wait__Group__0
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
    // InternalXDrone.g:578:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalXDrone.g:579:1: ( ruleFunctionName EOF )
            // InternalXDrone.g:580:1: ruleFunctionName EOF
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
    // InternalXDrone.g:587:1: ruleFunctionName : ( ( rule__FunctionName__Group__0 ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:591:2: ( ( ( rule__FunctionName__Group__0 ) ) )
            // InternalXDrone.g:592:2: ( ( rule__FunctionName__Group__0 ) )
            {
            // InternalXDrone.g:592:2: ( ( rule__FunctionName__Group__0 ) )
            // InternalXDrone.g:593:3: ( rule__FunctionName__Group__0 )
            {
             before(grammarAccess.getFunctionNameAccess().getGroup()); 
            // InternalXDrone.g:594:3: ( rule__FunctionName__Group__0 )
            // InternalXDrone.g:594:4: rule__FunctionName__Group__0
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
    // InternalXDrone.g:603:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalXDrone.g:604:1: ( ruleDrone EOF )
            // InternalXDrone.g:605:1: ruleDrone EOF
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
    // InternalXDrone.g:612:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:616:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalXDrone.g:617:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalXDrone.g:617:2: ( ( rule__Drone__Group__0 ) )
            // InternalXDrone.g:618:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalXDrone.g:619:3: ( rule__Drone__Group__0 )
            // InternalXDrone.g:619:4: rule__Drone__Group__0
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
    // InternalXDrone.g:628:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalXDrone.g:629:1: ( ruleObject EOF )
            // InternalXDrone.g:630:1: ruleObject EOF
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
    // InternalXDrone.g:637:1: ruleObject : ( ( rule__Object__UnorderedGroup ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:641:2: ( ( ( rule__Object__UnorderedGroup ) ) )
            // InternalXDrone.g:642:2: ( ( rule__Object__UnorderedGroup ) )
            {
            // InternalXDrone.g:642:2: ( ( rule__Object__UnorderedGroup ) )
            // InternalXDrone.g:643:3: ( rule__Object__UnorderedGroup )
            {
             before(grammarAccess.getObjectAccess().getUnorderedGroup()); 
            // InternalXDrone.g:644:3: ( rule__Object__UnorderedGroup )
            // InternalXDrone.g:644:4: rule__Object__UnorderedGroup
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
    // InternalXDrone.g:653:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalXDrone.g:654:1: ( ruleOrigin EOF )
            // InternalXDrone.g:655:1: ruleOrigin EOF
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
    // InternalXDrone.g:662:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:666:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalXDrone.g:667:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalXDrone.g:667:2: ( ( rule__Origin__Group__0 ) )
            // InternalXDrone.g:668:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalXDrone.g:669:3: ( rule__Origin__Group__0 )
            // InternalXDrone.g:669:4: rule__Origin__Group__0
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
    // InternalXDrone.g:678:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalXDrone.g:679:1: ( ruleSize EOF )
            // InternalXDrone.g:680:1: ruleSize EOF
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
    // InternalXDrone.g:687:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:691:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalXDrone.g:692:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalXDrone.g:692:2: ( ( rule__Size__Group__0 ) )
            // InternalXDrone.g:693:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalXDrone.g:694:3: ( rule__Size__Group__0 )
            // InternalXDrone.g:694:4: rule__Size__Group__0
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
    // InternalXDrone.g:703:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // InternalXDrone.g:704:1: ( ruleVector EOF )
            // InternalXDrone.g:705:1: ruleVector EOF
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
    // InternalXDrone.g:712:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:716:2: ( ( ( rule__Vector__Group__0 ) ) )
            // InternalXDrone.g:717:2: ( ( rule__Vector__Group__0 ) )
            {
            // InternalXDrone.g:717:2: ( ( rule__Vector__Group__0 ) )
            // InternalXDrone.g:718:3: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // InternalXDrone.g:719:3: ( rule__Vector__Group__0 )
            // InternalXDrone.g:719:4: rule__Vector__Group__0
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
    // InternalXDrone.g:728:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalXDrone.g:729:1: ( ruleColor EOF )
            // InternalXDrone.g:730:1: ruleColor EOF
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
    // InternalXDrone.g:737:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:741:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalXDrone.g:742:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalXDrone.g:742:2: ( ( rule__Color__Group__0 ) )
            // InternalXDrone.g:743:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalXDrone.g:744:3: ( rule__Color__Group__0 )
            // InternalXDrone.g:744:4: rule__Color__Group__0
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
    // InternalXDrone.g:753:1: entryRuleWalls : ruleWalls EOF ;
    public final void entryRuleWalls() throws RecognitionException {
        try {
            // InternalXDrone.g:754:1: ( ruleWalls EOF )
            // InternalXDrone.g:755:1: ruleWalls EOF
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
    // InternalXDrone.g:762:1: ruleWalls : ( ( rule__Walls__Group__0 ) ) ;
    public final void ruleWalls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:766:2: ( ( ( rule__Walls__Group__0 ) ) )
            // InternalXDrone.g:767:2: ( ( rule__Walls__Group__0 ) )
            {
            // InternalXDrone.g:767:2: ( ( rule__Walls__Group__0 ) )
            // InternalXDrone.g:768:3: ( rule__Walls__Group__0 )
            {
             before(grammarAccess.getWallsAccess().getGroup()); 
            // InternalXDrone.g:769:3: ( rule__Walls__Group__0 )
            // InternalXDrone.g:769:4: rule__Walls__Group__0
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
    // InternalXDrone.g:777:1: rule__Environment__Alternatives_2 : ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) );
    public final void rule__Environment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:781:1: ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__WallsAssignment_2_1 ) ) | ( ( rule__Environment__ObjectsAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
            case 14:
            case 36:
            case 38:
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
                    // InternalXDrone.g:782:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:782:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    // InternalXDrone.g:783:3: ( rule__Environment__DroneAssignment_2_0 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0()); 
                    // InternalXDrone.g:784:3: ( rule__Environment__DroneAssignment_2_0 )
                    // InternalXDrone.g:784:4: rule__Environment__DroneAssignment_2_0
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
                    // InternalXDrone.g:788:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:788:2: ( ( rule__Environment__WallsAssignment_2_1 ) )
                    // InternalXDrone.g:789:3: ( rule__Environment__WallsAssignment_2_1 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getWallsAssignment_2_1()); 
                    // InternalXDrone.g:790:3: ( rule__Environment__WallsAssignment_2_1 )
                    // InternalXDrone.g:790:4: rule__Environment__WallsAssignment_2_1
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
                    // InternalXDrone.g:794:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    {
                    // InternalXDrone.g:794:2: ( ( rule__Environment__ObjectsAssignment_2_2 ) )
                    // InternalXDrone.g:795:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_2()); 
                    // InternalXDrone.g:796:3: ( rule__Environment__ObjectsAssignment_2_2 )
                    // InternalXDrone.g:796:4: rule__Environment__ObjectsAssignment_2_2
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
    // InternalXDrone.g:804:1: rule__SuperCommand__Alternatives : ( ( ruleCommand ) | ( ruleFunctionName ) );
    public final void rule__SuperCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:808:1: ( ( ruleCommand ) | ( ruleFunctionName ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=19)||(LA2_0>=22 && LA2_0<=30)) ) {
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
                    // InternalXDrone.g:809:2: ( ruleCommand )
                    {
                    // InternalXDrone.g:809:2: ( ruleCommand )
                    // InternalXDrone.g:810:3: ruleCommand
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
                    // InternalXDrone.g:815:2: ( ruleFunctionName )
                    {
                    // InternalXDrone.g:815:2: ( ruleFunctionName )
                    // InternalXDrone.g:816:3: ruleFunctionName
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
    // InternalXDrone.g:825:1: rule__Command__Alternatives : ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:829:1: ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 27:
                {
                alt3=6;
                }
                break;
            case 28:
                {
                alt3=7;
                }
                break;
            case 29:
                {
                alt3=8;
                }
                break;
            case 30:
                {
                alt3=9;
                }
                break;
            case 18:
                {
                alt3=10;
                }
                break;
            case 19:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:830:2: ( ruleUp )
                    {
                    // InternalXDrone.g:830:2: ( ruleUp )
                    // InternalXDrone.g:831:3: ruleUp
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
                    // InternalXDrone.g:836:2: ( ruleDown )
                    {
                    // InternalXDrone.g:836:2: ( ruleDown )
                    // InternalXDrone.g:837:3: ruleDown
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
                    // InternalXDrone.g:842:2: ( ruleLeft )
                    {
                    // InternalXDrone.g:842:2: ( ruleLeft )
                    // InternalXDrone.g:843:3: ruleLeft
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
                    // InternalXDrone.g:848:2: ( ruleRight )
                    {
                    // InternalXDrone.g:848:2: ( ruleRight )
                    // InternalXDrone.g:849:3: ruleRight
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
                    // InternalXDrone.g:854:2: ( ruleForward )
                    {
                    // InternalXDrone.g:854:2: ( ruleForward )
                    // InternalXDrone.g:855:3: ruleForward
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
                    // InternalXDrone.g:860:2: ( ruleBackward )
                    {
                    // InternalXDrone.g:860:2: ( ruleBackward )
                    // InternalXDrone.g:861:3: ruleBackward
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
                    // InternalXDrone.g:866:2: ( ruleRotateL )
                    {
                    // InternalXDrone.g:866:2: ( ruleRotateL )
                    // InternalXDrone.g:867:3: ruleRotateL
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
                    // InternalXDrone.g:872:2: ( ruleRotateR )
                    {
                    // InternalXDrone.g:872:2: ( ruleRotateR )
                    // InternalXDrone.g:873:3: ruleRotateR
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
                    // InternalXDrone.g:878:2: ( ruleWait )
                    {
                    // InternalXDrone.g:878:2: ( ruleWait )
                    // InternalXDrone.g:879:3: ruleWait
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
                    // InternalXDrone.g:884:2: ( ruleMove )
                    {
                    // InternalXDrone.g:884:2: ( ruleMove )
                    // InternalXDrone.g:885:3: ruleMove
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
                    // InternalXDrone.g:890:2: ( ruleRotate )
                    {
                    // InternalXDrone.g:890:2: ( ruleRotate )
                    // InternalXDrone.g:891:3: ruleRotate
                    {
                     before(grammarAccess.getCommandAccess().getRotateParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleRotate();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateParserRuleCall_10()); 

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
    // InternalXDrone.g:900:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:904:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) )
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
                    // InternalXDrone.g:905:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:905:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:906:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:907:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:907:4: rule__DOUBLE__Group_0__0
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
                    // InternalXDrone.g:911:2: ( rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:911:2: ( rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:912:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:921:1: rule__POSITIVE_DOUBLE__Alternatives : ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__POSITIVE_DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:925:1: ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==21||LA5_1==37) ) {
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
                    // InternalXDrone.g:926:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:926:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:927:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:928:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    // InternalXDrone.g:928:4: rule__POSITIVE_DOUBLE__Group_0__0
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
                    // InternalXDrone.g:932:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:932:2: ( RULE_INT )
                    // InternalXDrone.g:933:3: RULE_INT
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
    // InternalXDrone.g:942:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:946:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalXDrone.g:947:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalXDrone.g:954:1: rule__Main__Group__0__Impl : ( ( rule__Main__FlyAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:958:1: ( ( ( rule__Main__FlyAssignment_0 ) ) )
            // InternalXDrone.g:959:1: ( ( rule__Main__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:959:1: ( ( rule__Main__FlyAssignment_0 ) )
            // InternalXDrone.g:960:2: ( rule__Main__FlyAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:961:2: ( rule__Main__FlyAssignment_0 )
            // InternalXDrone.g:961:3: rule__Main__FlyAssignment_0
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
    // InternalXDrone.g:969:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:973:1: ( rule__Main__Group__1__Impl )
            // InternalXDrone.g:974:2: rule__Main__Group__1__Impl
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
    // InternalXDrone.g:980:1: rule__Main__Group__1__Impl : ( ( rule__Main__EnvironmentAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:984:1: ( ( ( rule__Main__EnvironmentAssignment_1 )? ) )
            // InternalXDrone.g:985:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            {
            // InternalXDrone.g:985:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            // InternalXDrone.g:986:2: ( rule__Main__EnvironmentAssignment_1 )?
            {
             before(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:987:2: ( rule__Main__EnvironmentAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:987:3: rule__Main__EnvironmentAssignment_1
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
    // InternalXDrone.g:996:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1000:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:1001:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
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
    // InternalXDrone.g:1008:1: rule__Fly__Group__0__Impl : ( 'fly(){' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1012:1: ( ( 'fly(){' ) )
            // InternalXDrone.g:1013:1: ( 'fly(){' )
            {
            // InternalXDrone.g:1013:1: ( 'fly(){' )
            // InternalXDrone.g:1014:2: 'fly(){'
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
    // InternalXDrone.g:1023:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1027:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:1028:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
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
    // InternalXDrone.g:1035:1: rule__Fly__Group__1__Impl : ( ( rule__Fly__Group_1__0 ) ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1039:1: ( ( ( rule__Fly__Group_1__0 ) ) )
            // InternalXDrone.g:1040:1: ( ( rule__Fly__Group_1__0 ) )
            {
            // InternalXDrone.g:1040:1: ( ( rule__Fly__Group_1__0 ) )
            // InternalXDrone.g:1041:2: ( rule__Fly__Group_1__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_1()); 
            // InternalXDrone.g:1042:2: ( rule__Fly__Group_1__0 )
            // InternalXDrone.g:1042:3: rule__Fly__Group_1__0
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
    // InternalXDrone.g:1050:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1054:1: ( rule__Fly__Group__2__Impl )
            // InternalXDrone.g:1055:2: rule__Fly__Group__2__Impl
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
    // InternalXDrone.g:1061:1: rule__Fly__Group__2__Impl : ( '}' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1065:1: ( ( '}' ) )
            // InternalXDrone.g:1066:1: ( '}' )
            {
            // InternalXDrone.g:1066:1: ( '}' )
            // InternalXDrone.g:1067:2: '}'
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
    // InternalXDrone.g:1077:1: rule__Fly__Group_1__0 : rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 ;
    public final void rule__Fly__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1081:1: ( rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 )
            // InternalXDrone.g:1082:2: rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1
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
    // InternalXDrone.g:1089:1: rule__Fly__Group_1__0__Impl : ( ( rule__Fly__TakeoffAssignment_1_0 ) ) ;
    public final void rule__Fly__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1093:1: ( ( ( rule__Fly__TakeoffAssignment_1_0 ) ) )
            // InternalXDrone.g:1094:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            {
            // InternalXDrone.g:1094:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            // InternalXDrone.g:1095:2: ( rule__Fly__TakeoffAssignment_1_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 
            // InternalXDrone.g:1096:2: ( rule__Fly__TakeoffAssignment_1_0 )
            // InternalXDrone.g:1096:3: rule__Fly__TakeoffAssignment_1_0
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
    // InternalXDrone.g:1104:1: rule__Fly__Group_1__1 : rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 ;
    public final void rule__Fly__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1108:1: ( rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 )
            // InternalXDrone.g:1109:2: rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2
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
    // InternalXDrone.g:1116:1: rule__Fly__Group_1__1__Impl : ( ( rule__Fly__CommandsAssignment_1_1 )* ) ;
    public final void rule__Fly__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1120:1: ( ( ( rule__Fly__CommandsAssignment_1_1 )* ) )
            // InternalXDrone.g:1121:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            {
            // InternalXDrone.g:1121:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            // InternalXDrone.g:1122:2: ( rule__Fly__CommandsAssignment_1_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 
            // InternalXDrone.g:1123:2: ( rule__Fly__CommandsAssignment_1_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=18 && LA7_0<=19)||(LA7_0>=22 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXDrone.g:1123:3: rule__Fly__CommandsAssignment_1_1
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
    // InternalXDrone.g:1131:1: rule__Fly__Group_1__2 : rule__Fly__Group_1__2__Impl ;
    public final void rule__Fly__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1135:1: ( rule__Fly__Group_1__2__Impl )
            // InternalXDrone.g:1136:2: rule__Fly__Group_1__2__Impl
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
    // InternalXDrone.g:1142:1: rule__Fly__Group_1__2__Impl : ( ( rule__Fly__LandAssignment_1_2 ) ) ;
    public final void rule__Fly__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1146:1: ( ( ( rule__Fly__LandAssignment_1_2 ) ) )
            // InternalXDrone.g:1147:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            {
            // InternalXDrone.g:1147:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            // InternalXDrone.g:1148:2: ( rule__Fly__LandAssignment_1_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 
            // InternalXDrone.g:1149:2: ( rule__Fly__LandAssignment_1_2 )
            // InternalXDrone.g:1149:3: rule__Fly__LandAssignment_1_2
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
    // InternalXDrone.g:1158:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1162:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:1163:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
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
    // InternalXDrone.g:1170:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1174:1: ( ( () ) )
            // InternalXDrone.g:1175:1: ( () )
            {
            // InternalXDrone.g:1175:1: ( () )
            // InternalXDrone.g:1176:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:1177:2: ()
            // InternalXDrone.g:1177:3: 
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
    // InternalXDrone.g:1185:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1189:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:1190:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
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
    // InternalXDrone.g:1197:1: rule__Environment__Group__1__Impl : ( 'environment(){' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1201:1: ( ( 'environment(){' ) )
            // InternalXDrone.g:1202:1: ( 'environment(){' )
            {
            // InternalXDrone.g:1202:1: ( 'environment(){' )
            // InternalXDrone.g:1203:2: 'environment(){'
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
    // InternalXDrone.g:1212:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1216:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:1217:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
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
    // InternalXDrone.g:1224:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Alternatives_2 )* ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1228:1: ( ( ( rule__Environment__Alternatives_2 )* ) )
            // InternalXDrone.g:1229:1: ( ( rule__Environment__Alternatives_2 )* )
            {
            // InternalXDrone.g:1229:1: ( ( rule__Environment__Alternatives_2 )* )
            // InternalXDrone.g:1230:2: ( rule__Environment__Alternatives_2 )*
            {
             before(grammarAccess.getEnvironmentAccess().getAlternatives_2()); 
            // InternalXDrone.g:1231:2: ( rule__Environment__Alternatives_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID||LA8_1==14||LA8_1==32||LA8_1==36||(LA8_1>=38 && LA8_1<=39)) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_ID||LA8_0==32||LA8_0==36||(LA8_0>=38 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXDrone.g:1231:3: rule__Environment__Alternatives_2
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
    // InternalXDrone.g:1239:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1243:1: ( rule__Environment__Group__3__Impl )
            // InternalXDrone.g:1244:2: rule__Environment__Group__3__Impl
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
    // InternalXDrone.g:1250:1: rule__Environment__Group__3__Impl : ( '}' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1254:1: ( ( '}' ) )
            // InternalXDrone.g:1255:1: ( '}' )
            {
            // InternalXDrone.g:1255:1: ( '}' )
            // InternalXDrone.g:1256:2: '}'
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
    // InternalXDrone.g:1266:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1270:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1271:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
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
    // InternalXDrone.g:1278:1: rule__DOUBLE__Group_0__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1282:1: ( ( '-' ) )
            // InternalXDrone.g:1283:1: ( '-' )
            {
            // InternalXDrone.g:1283:1: ( '-' )
            // InternalXDrone.g:1284:2: '-'
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
    // InternalXDrone.g:1293:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1297:1: ( rule__DOUBLE__Group_0__1__Impl )
            // InternalXDrone.g:1298:2: rule__DOUBLE__Group_0__1__Impl
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
    // InternalXDrone.g:1304:1: rule__DOUBLE__Group_0__1__Impl : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1308:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1309:1: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1309:1: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1310:2: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:1320:1: rule__POSITIVE_DOUBLE__Group_0__0 : rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1324:1: ( rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 )
            // InternalXDrone.g:1325:2: rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1
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
    // InternalXDrone.g:1332:1: rule__POSITIVE_DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1336:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1337:1: ( RULE_INT )
            {
            // InternalXDrone.g:1337:1: ( RULE_INT )
            // InternalXDrone.g:1338:2: RULE_INT
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
    // InternalXDrone.g:1347:1: rule__POSITIVE_DOUBLE__Group_0__1 : rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1351:1: ( rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 )
            // InternalXDrone.g:1352:2: rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2
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
    // InternalXDrone.g:1359:1: rule__POSITIVE_DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1363:1: ( ( '.' ) )
            // InternalXDrone.g:1364:1: ( '.' )
            {
            // InternalXDrone.g:1364:1: ( '.' )
            // InternalXDrone.g:1365:2: '.'
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
    // InternalXDrone.g:1374:1: rule__POSITIVE_DOUBLE__Group_0__2 : rule__POSITIVE_DOUBLE__Group_0__2__Impl ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1378:1: ( rule__POSITIVE_DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1379:2: rule__POSITIVE_DOUBLE__Group_0__2__Impl
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
    // InternalXDrone.g:1385:1: rule__POSITIVE_DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1389:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1390:1: ( RULE_INT )
            {
            // InternalXDrone.g:1390:1: ( RULE_INT )
            // InternalXDrone.g:1391:2: RULE_INT
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


    // $ANTLR start "rule__Move__Group__0"
    // InternalXDrone.g:1401:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1405:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalXDrone.g:1406:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalXDrone.g:1413:1: rule__Move__Group__0__Impl : ( 'MOVE' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1417:1: ( ( 'MOVE' ) )
            // InternalXDrone.g:1418:1: ( 'MOVE' )
            {
            // InternalXDrone.g:1418:1: ( 'MOVE' )
            // InternalXDrone.g:1419:2: 'MOVE'
            {
             before(grammarAccess.getMoveAccess().getMOVEKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalXDrone.g:1428:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1432:1: ( rule__Move__Group__1__Impl )
            // InternalXDrone.g:1433:2: rule__Move__Group__1__Impl
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
    // InternalXDrone.g:1439:1: rule__Move__Group__1__Impl : ( ( rule__Move__VectorAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1443:1: ( ( ( rule__Move__VectorAssignment_1 ) ) )
            // InternalXDrone.g:1444:1: ( ( rule__Move__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:1444:1: ( ( rule__Move__VectorAssignment_1 ) )
            // InternalXDrone.g:1445:2: ( rule__Move__VectorAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:1446:2: ( rule__Move__VectorAssignment_1 )
            // InternalXDrone.g:1446:3: rule__Move__VectorAssignment_1
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
    // InternalXDrone.g:1455:1: rule__Rotate__Group__0 : rule__Rotate__Group__0__Impl rule__Rotate__Group__1 ;
    public final void rule__Rotate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1459:1: ( rule__Rotate__Group__0__Impl rule__Rotate__Group__1 )
            // InternalXDrone.g:1460:2: rule__Rotate__Group__0__Impl rule__Rotate__Group__1
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
    // InternalXDrone.g:1467:1: rule__Rotate__Group__0__Impl : ( 'ROTATE' ) ;
    public final void rule__Rotate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1471:1: ( ( 'ROTATE' ) )
            // InternalXDrone.g:1472:1: ( 'ROTATE' )
            {
            // InternalXDrone.g:1472:1: ( 'ROTATE' )
            // InternalXDrone.g:1473:2: 'ROTATE'
            {
             before(grammarAccess.getRotateAccess().getROTATEKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalXDrone.g:1482:1: rule__Rotate__Group__1 : rule__Rotate__Group__1__Impl rule__Rotate__Group__2 ;
    public final void rule__Rotate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1486:1: ( rule__Rotate__Group__1__Impl rule__Rotate__Group__2 )
            // InternalXDrone.g:1487:2: rule__Rotate__Group__1__Impl rule__Rotate__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:1494:1: rule__Rotate__Group__1__Impl : ( '(' ) ;
    public final void rule__Rotate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1498:1: ( ( '(' ) )
            // InternalXDrone.g:1499:1: ( '(' )
            {
            // InternalXDrone.g:1499:1: ( '(' )
            // InternalXDrone.g:1500:2: '('
            {
             before(grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:1509:1: rule__Rotate__Group__2 : rule__Rotate__Group__2__Impl rule__Rotate__Group__3 ;
    public final void rule__Rotate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1513:1: ( rule__Rotate__Group__2__Impl rule__Rotate__Group__3 )
            // InternalXDrone.g:1514:2: rule__Rotate__Group__2__Impl rule__Rotate__Group__3
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
    // InternalXDrone.g:1521:1: rule__Rotate__Group__2__Impl : ( ( rule__Rotate__AngleAssignment_2 ) ) ;
    public final void rule__Rotate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1525:1: ( ( ( rule__Rotate__AngleAssignment_2 ) ) )
            // InternalXDrone.g:1526:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:1526:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            // InternalXDrone.g:1527:2: ( rule__Rotate__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:1528:2: ( rule__Rotate__AngleAssignment_2 )
            // InternalXDrone.g:1528:3: rule__Rotate__AngleAssignment_2
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
    // InternalXDrone.g:1536:1: rule__Rotate__Group__3 : rule__Rotate__Group__3__Impl ;
    public final void rule__Rotate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1540:1: ( rule__Rotate__Group__3__Impl )
            // InternalXDrone.g:1541:2: rule__Rotate__Group__3__Impl
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
    // InternalXDrone.g:1547:1: rule__Rotate__Group__3__Impl : ( ')' ) ;
    public final void rule__Rotate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1551:1: ( ( ')' ) )
            // InternalXDrone.g:1552:1: ( ')' )
            {
            // InternalXDrone.g:1552:1: ( ')' )
            // InternalXDrone.g:1553:2: ')'
            {
             before(grammarAccess.getRotateAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:1563:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1567:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:1568:2: rule__Up__Group__0__Impl rule__Up__Group__1
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
    // InternalXDrone.g:1575:1: rule__Up__Group__0__Impl : ( 'UP' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1579:1: ( ( 'UP' ) )
            // InternalXDrone.g:1580:1: ( 'UP' )
            {
            // InternalXDrone.g:1580:1: ( 'UP' )
            // InternalXDrone.g:1581:2: 'UP'
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
    // InternalXDrone.g:1590:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1594:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:1595:2: rule__Up__Group__1__Impl rule__Up__Group__2
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
    // InternalXDrone.g:1602:1: rule__Up__Group__1__Impl : ( '(' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1606:1: ( ( '(' ) )
            // InternalXDrone.g:1607:1: ( '(' )
            {
            // InternalXDrone.g:1607:1: ( '(' )
            // InternalXDrone.g:1608:2: '('
            {
             before(grammarAccess.getUpAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:1617:1: rule__Up__Group__2 : rule__Up__Group__2__Impl rule__Up__Group__3 ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1621:1: ( rule__Up__Group__2__Impl rule__Up__Group__3 )
            // InternalXDrone.g:1622:2: rule__Up__Group__2__Impl rule__Up__Group__3
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
    // InternalXDrone.g:1629:1: rule__Up__Group__2__Impl : ( ( rule__Up__DistanceAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1633:1: ( ( ( rule__Up__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1634:1: ( ( rule__Up__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1634:1: ( ( rule__Up__DistanceAssignment_2 ) )
            // InternalXDrone.g:1635:2: ( rule__Up__DistanceAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1636:2: ( rule__Up__DistanceAssignment_2 )
            // InternalXDrone.g:1636:3: rule__Up__DistanceAssignment_2
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
    // InternalXDrone.g:1644:1: rule__Up__Group__3 : rule__Up__Group__3__Impl ;
    public final void rule__Up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1648:1: ( rule__Up__Group__3__Impl )
            // InternalXDrone.g:1649:2: rule__Up__Group__3__Impl
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
    // InternalXDrone.g:1655:1: rule__Up__Group__3__Impl : ( ')' ) ;
    public final void rule__Up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1659:1: ( ( ')' ) )
            // InternalXDrone.g:1660:1: ( ')' )
            {
            // InternalXDrone.g:1660:1: ( ')' )
            // InternalXDrone.g:1661:2: ')'
            {
             before(grammarAccess.getUpAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:1671:1: rule__Down__Group__0 : rule__Down__Group__0__Impl rule__Down__Group__1 ;
    public final void rule__Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1675:1: ( rule__Down__Group__0__Impl rule__Down__Group__1 )
            // InternalXDrone.g:1676:2: rule__Down__Group__0__Impl rule__Down__Group__1
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
    // InternalXDrone.g:1683:1: rule__Down__Group__0__Impl : ( 'DOWN' ) ;
    public final void rule__Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1687:1: ( ( 'DOWN' ) )
            // InternalXDrone.g:1688:1: ( 'DOWN' )
            {
            // InternalXDrone.g:1688:1: ( 'DOWN' )
            // InternalXDrone.g:1689:2: 'DOWN'
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
    // InternalXDrone.g:1698:1: rule__Down__Group__1 : rule__Down__Group__1__Impl rule__Down__Group__2 ;
    public final void rule__Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1702:1: ( rule__Down__Group__1__Impl rule__Down__Group__2 )
            // InternalXDrone.g:1703:2: rule__Down__Group__1__Impl rule__Down__Group__2
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
    // InternalXDrone.g:1710:1: rule__Down__Group__1__Impl : ( '(' ) ;
    public final void rule__Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1714:1: ( ( '(' ) )
            // InternalXDrone.g:1715:1: ( '(' )
            {
            // InternalXDrone.g:1715:1: ( '(' )
            // InternalXDrone.g:1716:2: '('
            {
             before(grammarAccess.getDownAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:1725:1: rule__Down__Group__2 : rule__Down__Group__2__Impl rule__Down__Group__3 ;
    public final void rule__Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1729:1: ( rule__Down__Group__2__Impl rule__Down__Group__3 )
            // InternalXDrone.g:1730:2: rule__Down__Group__2__Impl rule__Down__Group__3
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
    // InternalXDrone.g:1737:1: rule__Down__Group__2__Impl : ( ( rule__Down__DistanceAssignment_2 ) ) ;
    public final void rule__Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1741:1: ( ( ( rule__Down__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1742:1: ( ( rule__Down__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1742:1: ( ( rule__Down__DistanceAssignment_2 ) )
            // InternalXDrone.g:1743:2: ( rule__Down__DistanceAssignment_2 )
            {
             before(grammarAccess.getDownAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1744:2: ( rule__Down__DistanceAssignment_2 )
            // InternalXDrone.g:1744:3: rule__Down__DistanceAssignment_2
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
    // InternalXDrone.g:1752:1: rule__Down__Group__3 : rule__Down__Group__3__Impl ;
    public final void rule__Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1756:1: ( rule__Down__Group__3__Impl )
            // InternalXDrone.g:1757:2: rule__Down__Group__3__Impl
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
    // InternalXDrone.g:1763:1: rule__Down__Group__3__Impl : ( ')' ) ;
    public final void rule__Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1767:1: ( ( ')' ) )
            // InternalXDrone.g:1768:1: ( ')' )
            {
            // InternalXDrone.g:1768:1: ( ')' )
            // InternalXDrone.g:1769:2: ')'
            {
             before(grammarAccess.getDownAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:1779:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1783:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:1784:2: rule__Left__Group__0__Impl rule__Left__Group__1
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
    // InternalXDrone.g:1791:1: rule__Left__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1795:1: ( ( 'LEFT' ) )
            // InternalXDrone.g:1796:1: ( 'LEFT' )
            {
            // InternalXDrone.g:1796:1: ( 'LEFT' )
            // InternalXDrone.g:1797:2: 'LEFT'
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
    // InternalXDrone.g:1806:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1810:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:1811:2: rule__Left__Group__1__Impl rule__Left__Group__2
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
    // InternalXDrone.g:1818:1: rule__Left__Group__1__Impl : ( '(' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1822:1: ( ( '(' ) )
            // InternalXDrone.g:1823:1: ( '(' )
            {
            // InternalXDrone.g:1823:1: ( '(' )
            // InternalXDrone.g:1824:2: '('
            {
             before(grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:1833:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1837:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // InternalXDrone.g:1838:2: rule__Left__Group__2__Impl rule__Left__Group__3
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
    // InternalXDrone.g:1845:1: rule__Left__Group__2__Impl : ( ( rule__Left__DistanceAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1849:1: ( ( ( rule__Left__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1850:1: ( ( rule__Left__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1850:1: ( ( rule__Left__DistanceAssignment_2 ) )
            // InternalXDrone.g:1851:2: ( rule__Left__DistanceAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1852:2: ( rule__Left__DistanceAssignment_2 )
            // InternalXDrone.g:1852:3: rule__Left__DistanceAssignment_2
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
    // InternalXDrone.g:1860:1: rule__Left__Group__3 : rule__Left__Group__3__Impl ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1864:1: ( rule__Left__Group__3__Impl )
            // InternalXDrone.g:1865:2: rule__Left__Group__3__Impl
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
    // InternalXDrone.g:1871:1: rule__Left__Group__3__Impl : ( ')' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1875:1: ( ( ')' ) )
            // InternalXDrone.g:1876:1: ( ')' )
            {
            // InternalXDrone.g:1876:1: ( ')' )
            // InternalXDrone.g:1877:2: ')'
            {
             before(grammarAccess.getLeftAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:1887:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1891:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:1892:2: rule__Right__Group__0__Impl rule__Right__Group__1
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
    // InternalXDrone.g:1899:1: rule__Right__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1903:1: ( ( 'RIGHT' ) )
            // InternalXDrone.g:1904:1: ( 'RIGHT' )
            {
            // InternalXDrone.g:1904:1: ( 'RIGHT' )
            // InternalXDrone.g:1905:2: 'RIGHT'
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
    // InternalXDrone.g:1914:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1918:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:1919:2: rule__Right__Group__1__Impl rule__Right__Group__2
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
    // InternalXDrone.g:1926:1: rule__Right__Group__1__Impl : ( '(' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1930:1: ( ( '(' ) )
            // InternalXDrone.g:1931:1: ( '(' )
            {
            // InternalXDrone.g:1931:1: ( '(' )
            // InternalXDrone.g:1932:2: '('
            {
             before(grammarAccess.getRightAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:1941:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1945:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalXDrone.g:1946:2: rule__Right__Group__2__Impl rule__Right__Group__3
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
    // InternalXDrone.g:1953:1: rule__Right__Group__2__Impl : ( ( rule__Right__DistanceAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1957:1: ( ( ( rule__Right__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1958:1: ( ( rule__Right__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1958:1: ( ( rule__Right__DistanceAssignment_2 ) )
            // InternalXDrone.g:1959:2: ( rule__Right__DistanceAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1960:2: ( rule__Right__DistanceAssignment_2 )
            // InternalXDrone.g:1960:3: rule__Right__DistanceAssignment_2
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
    // InternalXDrone.g:1968:1: rule__Right__Group__3 : rule__Right__Group__3__Impl ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1972:1: ( rule__Right__Group__3__Impl )
            // InternalXDrone.g:1973:2: rule__Right__Group__3__Impl
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
    // InternalXDrone.g:1979:1: rule__Right__Group__3__Impl : ( ')' ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1983:1: ( ( ')' ) )
            // InternalXDrone.g:1984:1: ( ')' )
            {
            // InternalXDrone.g:1984:1: ( ')' )
            // InternalXDrone.g:1985:2: ')'
            {
             before(grammarAccess.getRightAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:1995:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1999:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalXDrone.g:2000:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
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
    // InternalXDrone.g:2007:1: rule__Forward__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2011:1: ( ( 'FORWARD' ) )
            // InternalXDrone.g:2012:1: ( 'FORWARD' )
            {
            // InternalXDrone.g:2012:1: ( 'FORWARD' )
            // InternalXDrone.g:2013:2: 'FORWARD'
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
    // InternalXDrone.g:2022:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2026:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalXDrone.g:2027:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
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
    // InternalXDrone.g:2034:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2038:1: ( ( '(' ) )
            // InternalXDrone.g:2039:1: ( '(' )
            {
            // InternalXDrone.g:2039:1: ( '(' )
            // InternalXDrone.g:2040:2: '('
            {
             before(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:2049:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2053:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalXDrone.g:2054:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
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
    // InternalXDrone.g:2061:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2065:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2066:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2066:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2067:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2068:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalXDrone.g:2068:3: rule__Forward__DistanceAssignment_2
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
    // InternalXDrone.g:2076:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2080:1: ( rule__Forward__Group__3__Impl )
            // InternalXDrone.g:2081:2: rule__Forward__Group__3__Impl
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
    // InternalXDrone.g:2087:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2091:1: ( ( ')' ) )
            // InternalXDrone.g:2092:1: ( ')' )
            {
            // InternalXDrone.g:2092:1: ( ')' )
            // InternalXDrone.g:2093:2: ')'
            {
             before(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:2103:1: rule__Backward__Group__0 : rule__Backward__Group__0__Impl rule__Backward__Group__1 ;
    public final void rule__Backward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2107:1: ( rule__Backward__Group__0__Impl rule__Backward__Group__1 )
            // InternalXDrone.g:2108:2: rule__Backward__Group__0__Impl rule__Backward__Group__1
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
    // InternalXDrone.g:2115:1: rule__Backward__Group__0__Impl : ( 'BACKWARD' ) ;
    public final void rule__Backward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2119:1: ( ( 'BACKWARD' ) )
            // InternalXDrone.g:2120:1: ( 'BACKWARD' )
            {
            // InternalXDrone.g:2120:1: ( 'BACKWARD' )
            // InternalXDrone.g:2121:2: 'BACKWARD'
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
    // InternalXDrone.g:2130:1: rule__Backward__Group__1 : rule__Backward__Group__1__Impl rule__Backward__Group__2 ;
    public final void rule__Backward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2134:1: ( rule__Backward__Group__1__Impl rule__Backward__Group__2 )
            // InternalXDrone.g:2135:2: rule__Backward__Group__1__Impl rule__Backward__Group__2
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
    // InternalXDrone.g:2142:1: rule__Backward__Group__1__Impl : ( '(' ) ;
    public final void rule__Backward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2146:1: ( ( '(' ) )
            // InternalXDrone.g:2147:1: ( '(' )
            {
            // InternalXDrone.g:2147:1: ( '(' )
            // InternalXDrone.g:2148:2: '('
            {
             before(grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:2157:1: rule__Backward__Group__2 : rule__Backward__Group__2__Impl rule__Backward__Group__3 ;
    public final void rule__Backward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2161:1: ( rule__Backward__Group__2__Impl rule__Backward__Group__3 )
            // InternalXDrone.g:2162:2: rule__Backward__Group__2__Impl rule__Backward__Group__3
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
    // InternalXDrone.g:2169:1: rule__Backward__Group__2__Impl : ( ( rule__Backward__DistanceAssignment_2 ) ) ;
    public final void rule__Backward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2173:1: ( ( ( rule__Backward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2174:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2174:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2175:2: ( rule__Backward__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2176:2: ( rule__Backward__DistanceAssignment_2 )
            // InternalXDrone.g:2176:3: rule__Backward__DistanceAssignment_2
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
    // InternalXDrone.g:2184:1: rule__Backward__Group__3 : rule__Backward__Group__3__Impl ;
    public final void rule__Backward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2188:1: ( rule__Backward__Group__3__Impl )
            // InternalXDrone.g:2189:2: rule__Backward__Group__3__Impl
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
    // InternalXDrone.g:2195:1: rule__Backward__Group__3__Impl : ( ')' ) ;
    public final void rule__Backward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2199:1: ( ( ')' ) )
            // InternalXDrone.g:2200:1: ( ')' )
            {
            // InternalXDrone.g:2200:1: ( ')' )
            // InternalXDrone.g:2201:2: ')'
            {
             before(grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:2211:1: rule__RotateL__Group__0 : rule__RotateL__Group__0__Impl rule__RotateL__Group__1 ;
    public final void rule__RotateL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2215:1: ( rule__RotateL__Group__0__Impl rule__RotateL__Group__1 )
            // InternalXDrone.g:2216:2: rule__RotateL__Group__0__Impl rule__RotateL__Group__1
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
    // InternalXDrone.g:2223:1: rule__RotateL__Group__0__Impl : ( 'ROTATELEFT' ) ;
    public final void rule__RotateL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2227:1: ( ( 'ROTATELEFT' ) )
            // InternalXDrone.g:2228:1: ( 'ROTATELEFT' )
            {
            // InternalXDrone.g:2228:1: ( 'ROTATELEFT' )
            // InternalXDrone.g:2229:2: 'ROTATELEFT'
            {
             before(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalXDrone.g:2238:1: rule__RotateL__Group__1 : rule__RotateL__Group__1__Impl rule__RotateL__Group__2 ;
    public final void rule__RotateL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2242:1: ( rule__RotateL__Group__1__Impl rule__RotateL__Group__2 )
            // InternalXDrone.g:2243:2: rule__RotateL__Group__1__Impl rule__RotateL__Group__2
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
    // InternalXDrone.g:2250:1: rule__RotateL__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2254:1: ( ( '(' ) )
            // InternalXDrone.g:2255:1: ( '(' )
            {
            // InternalXDrone.g:2255:1: ( '(' )
            // InternalXDrone.g:2256:2: '('
            {
             before(grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:2265:1: rule__RotateL__Group__2 : rule__RotateL__Group__2__Impl rule__RotateL__Group__3 ;
    public final void rule__RotateL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2269:1: ( rule__RotateL__Group__2__Impl rule__RotateL__Group__3 )
            // InternalXDrone.g:2270:2: rule__RotateL__Group__2__Impl rule__RotateL__Group__3
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
    // InternalXDrone.g:2277:1: rule__RotateL__Group__2__Impl : ( ( rule__RotateL__AngleAssignment_2 ) ) ;
    public final void rule__RotateL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2281:1: ( ( ( rule__RotateL__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2282:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2282:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            // InternalXDrone.g:2283:2: ( rule__RotateL__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2284:2: ( rule__RotateL__AngleAssignment_2 )
            // InternalXDrone.g:2284:3: rule__RotateL__AngleAssignment_2
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
    // InternalXDrone.g:2292:1: rule__RotateL__Group__3 : rule__RotateL__Group__3__Impl ;
    public final void rule__RotateL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2296:1: ( rule__RotateL__Group__3__Impl )
            // InternalXDrone.g:2297:2: rule__RotateL__Group__3__Impl
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
    // InternalXDrone.g:2303:1: rule__RotateL__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2307:1: ( ( ')' ) )
            // InternalXDrone.g:2308:1: ( ')' )
            {
            // InternalXDrone.g:2308:1: ( ')' )
            // InternalXDrone.g:2309:2: ')'
            {
             before(grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:2319:1: rule__RotateR__Group__0 : rule__RotateR__Group__0__Impl rule__RotateR__Group__1 ;
    public final void rule__RotateR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2323:1: ( rule__RotateR__Group__0__Impl rule__RotateR__Group__1 )
            // InternalXDrone.g:2324:2: rule__RotateR__Group__0__Impl rule__RotateR__Group__1
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
    // InternalXDrone.g:2331:1: rule__RotateR__Group__0__Impl : ( 'ROTATERIGHT' ) ;
    public final void rule__RotateR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2335:1: ( ( 'ROTATERIGHT' ) )
            // InternalXDrone.g:2336:1: ( 'ROTATERIGHT' )
            {
            // InternalXDrone.g:2336:1: ( 'ROTATERIGHT' )
            // InternalXDrone.g:2337:2: 'ROTATERIGHT'
            {
             before(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalXDrone.g:2346:1: rule__RotateR__Group__1 : rule__RotateR__Group__1__Impl rule__RotateR__Group__2 ;
    public final void rule__RotateR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2350:1: ( rule__RotateR__Group__1__Impl rule__RotateR__Group__2 )
            // InternalXDrone.g:2351:2: rule__RotateR__Group__1__Impl rule__RotateR__Group__2
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
    // InternalXDrone.g:2358:1: rule__RotateR__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2362:1: ( ( '(' ) )
            // InternalXDrone.g:2363:1: ( '(' )
            {
            // InternalXDrone.g:2363:1: ( '(' )
            // InternalXDrone.g:2364:2: '('
            {
             before(grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:2373:1: rule__RotateR__Group__2 : rule__RotateR__Group__2__Impl rule__RotateR__Group__3 ;
    public final void rule__RotateR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2377:1: ( rule__RotateR__Group__2__Impl rule__RotateR__Group__3 )
            // InternalXDrone.g:2378:2: rule__RotateR__Group__2__Impl rule__RotateR__Group__3
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
    // InternalXDrone.g:2385:1: rule__RotateR__Group__2__Impl : ( ( rule__RotateR__AngleAssignment_2 ) ) ;
    public final void rule__RotateR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2389:1: ( ( ( rule__RotateR__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2390:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2390:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            // InternalXDrone.g:2391:2: ( rule__RotateR__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2392:2: ( rule__RotateR__AngleAssignment_2 )
            // InternalXDrone.g:2392:3: rule__RotateR__AngleAssignment_2
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
    // InternalXDrone.g:2400:1: rule__RotateR__Group__3 : rule__RotateR__Group__3__Impl ;
    public final void rule__RotateR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2404:1: ( rule__RotateR__Group__3__Impl )
            // InternalXDrone.g:2405:2: rule__RotateR__Group__3__Impl
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
    // InternalXDrone.g:2411:1: rule__RotateR__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2415:1: ( ( ')' ) )
            // InternalXDrone.g:2416:1: ( ')' )
            {
            // InternalXDrone.g:2416:1: ( ')' )
            // InternalXDrone.g:2417:2: ')'
            {
             before(grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:2427:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2431:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:2432:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalXDrone.g:2439:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2443:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:2444:1: ( 'WAIT' )
            {
            // InternalXDrone.g:2444:1: ( 'WAIT' )
            // InternalXDrone.g:2445:2: 'WAIT'
            {
             before(grammarAccess.getWaitAccess().getWAITKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalXDrone.g:2454:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2458:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:2459:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
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
    // InternalXDrone.g:2466:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2470:1: ( ( '(' ) )
            // InternalXDrone.g:2471:1: ( '(' )
            {
            // InternalXDrone.g:2471:1: ( '(' )
            // InternalXDrone.g:2472:2: '('
            {
             before(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:2481:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2485:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:2486:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
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
    // InternalXDrone.g:2493:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2497:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:2498:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:2498:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:2499:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:2500:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:2500:3: rule__Wait__SecondsAssignment_2
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
    // InternalXDrone.g:2508:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2512:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:2513:2: rule__Wait__Group__3__Impl
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
    // InternalXDrone.g:2519:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2523:1: ( ( ')' ) )
            // InternalXDrone.g:2524:1: ( ')' )
            {
            // InternalXDrone.g:2524:1: ( ')' )
            // InternalXDrone.g:2525:2: ')'
            {
             before(grammarAccess.getWaitAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:2535:1: rule__FunctionName__Group__0 : rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 ;
    public final void rule__FunctionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2539:1: ( rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 )
            // InternalXDrone.g:2540:2: rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1
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
    // InternalXDrone.g:2547:1: rule__FunctionName__Group__0__Impl : ( ( rule__FunctionName__Func_nameAssignment_0 ) ) ;
    public final void rule__FunctionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2551:1: ( ( ( rule__FunctionName__Func_nameAssignment_0 ) ) )
            // InternalXDrone.g:2552:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            {
            // InternalXDrone.g:2552:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            // InternalXDrone.g:2553:2: ( rule__FunctionName__Func_nameAssignment_0 )
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 
            // InternalXDrone.g:2554:2: ( rule__FunctionName__Func_nameAssignment_0 )
            // InternalXDrone.g:2554:3: rule__FunctionName__Func_nameAssignment_0
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
    // InternalXDrone.g:2562:1: rule__FunctionName__Group__1 : rule__FunctionName__Group__1__Impl ;
    public final void rule__FunctionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2566:1: ( rule__FunctionName__Group__1__Impl )
            // InternalXDrone.g:2567:2: rule__FunctionName__Group__1__Impl
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
    // InternalXDrone.g:2573:1: rule__FunctionName__Group__1__Impl : ( '()' ) ;
    public final void rule__FunctionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2577:1: ( ( '()' ) )
            // InternalXDrone.g:2578:1: ( '()' )
            {
            // InternalXDrone.g:2578:1: ( '()' )
            // InternalXDrone.g:2579:2: '()'
            {
             before(grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalXDrone.g:2589:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2593:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:2594:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
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
    // InternalXDrone.g:2601:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2605:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:2606:1: ( 'DRONE' )
            {
            // InternalXDrone.g:2606:1: ( 'DRONE' )
            // InternalXDrone.g:2607:2: 'DRONE'
            {
             before(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalXDrone.g:2616:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2620:1: ( rule__Drone__Group__1__Impl )
            // InternalXDrone.g:2621:2: rule__Drone__Group__1__Impl
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
    // InternalXDrone.g:2627:1: rule__Drone__Group__1__Impl : ( ( rule__Drone__VectorAssignment_1 ) ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2631:1: ( ( ( rule__Drone__VectorAssignment_1 ) ) )
            // InternalXDrone.g:2632:1: ( ( rule__Drone__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:2632:1: ( ( rule__Drone__VectorAssignment_1 ) )
            // InternalXDrone.g:2633:2: ( rule__Drone__VectorAssignment_1 )
            {
             before(grammarAccess.getDroneAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:2634:2: ( rule__Drone__VectorAssignment_1 )
            // InternalXDrone.g:2634:3: rule__Drone__VectorAssignment_1
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
    // InternalXDrone.g:2643:1: rule__Object__Group_0__0 : rule__Object__Group_0__0__Impl rule__Object__Group_0__1 ;
    public final void rule__Object__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2647:1: ( rule__Object__Group_0__0__Impl rule__Object__Group_0__1 )
            // InternalXDrone.g:2648:2: rule__Object__Group_0__0__Impl rule__Object__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalXDrone.g:2655:1: rule__Object__Group_0__0__Impl : ( ( rule__Object__Object_nameAssignment_0_0 ) ) ;
    public final void rule__Object__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2659:1: ( ( ( rule__Object__Object_nameAssignment_0_0 ) ) )
            // InternalXDrone.g:2660:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            {
            // InternalXDrone.g:2660:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            // InternalXDrone.g:2661:2: ( rule__Object__Object_nameAssignment_0_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0_0()); 
            // InternalXDrone.g:2662:2: ( rule__Object__Object_nameAssignment_0_0 )
            // InternalXDrone.g:2662:3: rule__Object__Object_nameAssignment_0_0
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
    // InternalXDrone.g:2670:1: rule__Object__Group_0__1 : rule__Object__Group_0__1__Impl rule__Object__Group_0__2 ;
    public final void rule__Object__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2674:1: ( rule__Object__Group_0__1__Impl rule__Object__Group_0__2 )
            // InternalXDrone.g:2675:2: rule__Object__Group_0__1__Impl rule__Object__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalXDrone.g:2682:1: rule__Object__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Object__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2686:1: ( ( '{' ) )
            // InternalXDrone.g:2687:1: ( '{' )
            {
            // InternalXDrone.g:2687:1: ( '{' )
            // InternalXDrone.g:2688:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalXDrone.g:2697:1: rule__Object__Group_0__2 : rule__Object__Group_0__2__Impl ;
    public final void rule__Object__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2701:1: ( rule__Object__Group_0__2__Impl )
            // InternalXDrone.g:2702:2: rule__Object__Group_0__2__Impl
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
    // InternalXDrone.g:2708:1: rule__Object__Group_0__2__Impl : ( ( rule__Object__OriginAssignment_0_2 ) ) ;
    public final void rule__Object__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2712:1: ( ( ( rule__Object__OriginAssignment_0_2 ) ) )
            // InternalXDrone.g:2713:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            {
            // InternalXDrone.g:2713:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            // InternalXDrone.g:2714:2: ( rule__Object__OriginAssignment_0_2 )
            {
             before(grammarAccess.getObjectAccess().getOriginAssignment_0_2()); 
            // InternalXDrone.g:2715:2: ( rule__Object__OriginAssignment_0_2 )
            // InternalXDrone.g:2715:3: rule__Object__OriginAssignment_0_2
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
    // InternalXDrone.g:2724:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2728:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalXDrone.g:2729:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
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
    // InternalXDrone.g:2736:1: rule__Object__Group_2__0__Impl : ( ( rule__Object__ColorAssignment_2_0 )? ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2740:1: ( ( ( rule__Object__ColorAssignment_2_0 )? ) )
            // InternalXDrone.g:2741:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            {
            // InternalXDrone.g:2741:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            // InternalXDrone.g:2742:2: ( rule__Object__ColorAssignment_2_0 )?
            {
             before(grammarAccess.getObjectAccess().getColorAssignment_2_0()); 
            // InternalXDrone.g:2743:2: ( rule__Object__ColorAssignment_2_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalXDrone.g:2743:3: rule__Object__ColorAssignment_2_0
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
    // InternalXDrone.g:2751:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2755:1: ( rule__Object__Group_2__1__Impl )
            // InternalXDrone.g:2756:2: rule__Object__Group_2__1__Impl
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
    // InternalXDrone.g:2762:1: rule__Object__Group_2__1__Impl : ( '}' ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2766:1: ( ( '}' ) )
            // InternalXDrone.g:2767:1: ( '}' )
            {
            // InternalXDrone.g:2767:1: ( '}' )
            // InternalXDrone.g:2768:2: '}'
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
    // InternalXDrone.g:2778:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2782:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalXDrone.g:2783:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalXDrone.g:2790:1: rule__Origin__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2794:1: ( ( 'origin' ) )
            // InternalXDrone.g:2795:1: ( 'origin' )
            {
            // InternalXDrone.g:2795:1: ( 'origin' )
            // InternalXDrone.g:2796:2: 'origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalXDrone.g:2805:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2809:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalXDrone.g:2810:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
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
    // InternalXDrone.g:2817:1: rule__Origin__Group__1__Impl : ( '=' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2821:1: ( ( '=' ) )
            // InternalXDrone.g:2822:1: ( '=' )
            {
            // InternalXDrone.g:2822:1: ( '=' )
            // InternalXDrone.g:2823:2: '='
            {
             before(grammarAccess.getOriginAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalXDrone.g:2832:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2836:1: ( rule__Origin__Group__2__Impl )
            // InternalXDrone.g:2837:2: rule__Origin__Group__2__Impl
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
    // InternalXDrone.g:2843:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__VectorAssignment_2 ) ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2847:1: ( ( ( rule__Origin__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2848:1: ( ( rule__Origin__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2848:1: ( ( rule__Origin__VectorAssignment_2 ) )
            // InternalXDrone.g:2849:2: ( rule__Origin__VectorAssignment_2 )
            {
             before(grammarAccess.getOriginAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2850:2: ( rule__Origin__VectorAssignment_2 )
            // InternalXDrone.g:2850:3: rule__Origin__VectorAssignment_2
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
    // InternalXDrone.g:2859:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2863:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalXDrone.g:2864:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalXDrone.g:2871:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2875:1: ( ( 'size' ) )
            // InternalXDrone.g:2876:1: ( 'size' )
            {
            // InternalXDrone.g:2876:1: ( 'size' )
            // InternalXDrone.g:2877:2: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalXDrone.g:2886:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2890:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalXDrone.g:2891:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalXDrone.g:2898:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2902:1: ( ( '=' ) )
            // InternalXDrone.g:2903:1: ( '=' )
            {
            // InternalXDrone.g:2903:1: ( '=' )
            // InternalXDrone.g:2904:2: '='
            {
             before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalXDrone.g:2913:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2917:1: ( rule__Size__Group__2__Impl )
            // InternalXDrone.g:2918:2: rule__Size__Group__2__Impl
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
    // InternalXDrone.g:2924:1: rule__Size__Group__2__Impl : ( ( rule__Size__VectorAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2928:1: ( ( ( rule__Size__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2929:1: ( ( rule__Size__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2929:1: ( ( rule__Size__VectorAssignment_2 ) )
            // InternalXDrone.g:2930:2: ( rule__Size__VectorAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2931:2: ( rule__Size__VectorAssignment_2 )
            // InternalXDrone.g:2931:3: rule__Size__VectorAssignment_2
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
    // InternalXDrone.g:2940:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2944:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // InternalXDrone.g:2945:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:2952:1: rule__Vector__Group__0__Impl : ( '(' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2956:1: ( ( '(' ) )
            // InternalXDrone.g:2957:1: ( '(' )
            {
            // InternalXDrone.g:2957:1: ( '(' )
            // InternalXDrone.g:2958:2: '('
            {
             before(grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:2967:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2971:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // InternalXDrone.g:2972:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:2979:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2983:1: ( ( ( rule__Vector__XAssignment_1 ) ) )
            // InternalXDrone.g:2984:1: ( ( rule__Vector__XAssignment_1 ) )
            {
            // InternalXDrone.g:2984:1: ( ( rule__Vector__XAssignment_1 ) )
            // InternalXDrone.g:2985:2: ( rule__Vector__XAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getXAssignment_1()); 
            // InternalXDrone.g:2986:2: ( rule__Vector__XAssignment_1 )
            // InternalXDrone.g:2986:3: rule__Vector__XAssignment_1
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
    // InternalXDrone.g:2994:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2998:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // InternalXDrone.g:2999:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:3006:1: rule__Vector__Group__2__Impl : ( ',' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3010:1: ( ( ',' ) )
            // InternalXDrone.g:3011:1: ( ',' )
            {
            // InternalXDrone.g:3011:1: ( ',' )
            // InternalXDrone.g:3012:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:3021:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3025:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // InternalXDrone.g:3026:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:3033:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__YAssignment_3 ) ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3037:1: ( ( ( rule__Vector__YAssignment_3 ) ) )
            // InternalXDrone.g:3038:1: ( ( rule__Vector__YAssignment_3 ) )
            {
            // InternalXDrone.g:3038:1: ( ( rule__Vector__YAssignment_3 ) )
            // InternalXDrone.g:3039:2: ( rule__Vector__YAssignment_3 )
            {
             before(grammarAccess.getVectorAccess().getYAssignment_3()); 
            // InternalXDrone.g:3040:2: ( rule__Vector__YAssignment_3 )
            // InternalXDrone.g:3040:3: rule__Vector__YAssignment_3
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
    // InternalXDrone.g:3048:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl rule__Vector__Group__5 ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3052:1: ( rule__Vector__Group__4__Impl rule__Vector__Group__5 )
            // InternalXDrone.g:3053:2: rule__Vector__Group__4__Impl rule__Vector__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:3060:1: rule__Vector__Group__4__Impl : ( ',' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3064:1: ( ( ',' ) )
            // InternalXDrone.g:3065:1: ( ',' )
            {
            // InternalXDrone.g:3065:1: ( ',' )
            // InternalXDrone.g:3066:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:3075:1: rule__Vector__Group__5 : rule__Vector__Group__5__Impl rule__Vector__Group__6 ;
    public final void rule__Vector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3079:1: ( rule__Vector__Group__5__Impl rule__Vector__Group__6 )
            // InternalXDrone.g:3080:2: rule__Vector__Group__5__Impl rule__Vector__Group__6
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
    // InternalXDrone.g:3087:1: rule__Vector__Group__5__Impl : ( ( rule__Vector__ZAssignment_5 ) ) ;
    public final void rule__Vector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3091:1: ( ( ( rule__Vector__ZAssignment_5 ) ) )
            // InternalXDrone.g:3092:1: ( ( rule__Vector__ZAssignment_5 ) )
            {
            // InternalXDrone.g:3092:1: ( ( rule__Vector__ZAssignment_5 ) )
            // InternalXDrone.g:3093:2: ( rule__Vector__ZAssignment_5 )
            {
             before(grammarAccess.getVectorAccess().getZAssignment_5()); 
            // InternalXDrone.g:3094:2: ( rule__Vector__ZAssignment_5 )
            // InternalXDrone.g:3094:3: rule__Vector__ZAssignment_5
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
    // InternalXDrone.g:3102:1: rule__Vector__Group__6 : rule__Vector__Group__6__Impl ;
    public final void rule__Vector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3106:1: ( rule__Vector__Group__6__Impl )
            // InternalXDrone.g:3107:2: rule__Vector__Group__6__Impl
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
    // InternalXDrone.g:3113:1: rule__Vector__Group__6__Impl : ( ')' ) ;
    public final void rule__Vector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3117:1: ( ( ')' ) )
            // InternalXDrone.g:3118:1: ( ')' )
            {
            // InternalXDrone.g:3118:1: ( ')' )
            // InternalXDrone.g:3119:2: ')'
            {
             before(grammarAccess.getVectorAccess().getRightParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:3129:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3133:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalXDrone.g:3134:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalXDrone.g:3141:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3145:1: ( ( 'color' ) )
            // InternalXDrone.g:3146:1: ( 'color' )
            {
            // InternalXDrone.g:3146:1: ( 'color' )
            // InternalXDrone.g:3147:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalXDrone.g:3156:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3160:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalXDrone.g:3161:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalXDrone.g:3168:1: rule__Color__Group__1__Impl : ( '=' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3172:1: ( ( '=' ) )
            // InternalXDrone.g:3173:1: ( '=' )
            {
            // InternalXDrone.g:3173:1: ( '=' )
            // InternalXDrone.g:3174:2: '='
            {
             before(grammarAccess.getColorAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalXDrone.g:3183:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3187:1: ( rule__Color__Group__2__Impl )
            // InternalXDrone.g:3188:2: rule__Color__Group__2__Impl
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
    // InternalXDrone.g:3194:1: rule__Color__Group__2__Impl : ( ( rule__Color__Color_valueAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3198:1: ( ( ( rule__Color__Color_valueAssignment_2 ) ) )
            // InternalXDrone.g:3199:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            {
            // InternalXDrone.g:3199:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            // InternalXDrone.g:3200:2: ( rule__Color__Color_valueAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 
            // InternalXDrone.g:3201:2: ( rule__Color__Color_valueAssignment_2 )
            // InternalXDrone.g:3201:3: rule__Color__Color_valueAssignment_2
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
    // InternalXDrone.g:3210:1: rule__Walls__Group__0 : rule__Walls__Group__0__Impl rule__Walls__Group__1 ;
    public final void rule__Walls__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3214:1: ( rule__Walls__Group__0__Impl rule__Walls__Group__1 )
            // InternalXDrone.g:3215:2: rule__Walls__Group__0__Impl rule__Walls__Group__1
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
    // InternalXDrone.g:3222:1: rule__Walls__Group__0__Impl : ( 'WALLS' ) ;
    public final void rule__Walls__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3226:1: ( ( 'WALLS' ) )
            // InternalXDrone.g:3227:1: ( 'WALLS' )
            {
            // InternalXDrone.g:3227:1: ( 'WALLS' )
            // InternalXDrone.g:3228:2: 'WALLS'
            {
             before(grammarAccess.getWallsAccess().getWALLSKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalXDrone.g:3237:1: rule__Walls__Group__1 : rule__Walls__Group__1__Impl rule__Walls__Group__2 ;
    public final void rule__Walls__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3241:1: ( rule__Walls__Group__1__Impl rule__Walls__Group__2 )
            // InternalXDrone.g:3242:2: rule__Walls__Group__1__Impl rule__Walls__Group__2
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
    // InternalXDrone.g:3249:1: rule__Walls__Group__1__Impl : ( '(' ) ;
    public final void rule__Walls__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3253:1: ( ( '(' ) )
            // InternalXDrone.g:3254:1: ( '(' )
            {
            // InternalXDrone.g:3254:1: ( '(' )
            // InternalXDrone.g:3255:2: '('
            {
             before(grammarAccess.getWallsAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXDrone.g:3264:1: rule__Walls__Group__2 : rule__Walls__Group__2__Impl rule__Walls__Group__3 ;
    public final void rule__Walls__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3268:1: ( rule__Walls__Group__2__Impl rule__Walls__Group__3 )
            // InternalXDrone.g:3269:2: rule__Walls__Group__2__Impl rule__Walls__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:3276:1: rule__Walls__Group__2__Impl : ( ( rule__Walls__FrontAssignment_2 ) ) ;
    public final void rule__Walls__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3280:1: ( ( ( rule__Walls__FrontAssignment_2 ) ) )
            // InternalXDrone.g:3281:1: ( ( rule__Walls__FrontAssignment_2 ) )
            {
            // InternalXDrone.g:3281:1: ( ( rule__Walls__FrontAssignment_2 ) )
            // InternalXDrone.g:3282:2: ( rule__Walls__FrontAssignment_2 )
            {
             before(grammarAccess.getWallsAccess().getFrontAssignment_2()); 
            // InternalXDrone.g:3283:2: ( rule__Walls__FrontAssignment_2 )
            // InternalXDrone.g:3283:3: rule__Walls__FrontAssignment_2
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
    // InternalXDrone.g:3291:1: rule__Walls__Group__3 : rule__Walls__Group__3__Impl rule__Walls__Group__4 ;
    public final void rule__Walls__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3295:1: ( rule__Walls__Group__3__Impl rule__Walls__Group__4 )
            // InternalXDrone.g:3296:2: rule__Walls__Group__3__Impl rule__Walls__Group__4
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
    // InternalXDrone.g:3303:1: rule__Walls__Group__3__Impl : ( ',' ) ;
    public final void rule__Walls__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3307:1: ( ( ',' ) )
            // InternalXDrone.g:3308:1: ( ',' )
            {
            // InternalXDrone.g:3308:1: ( ',' )
            // InternalXDrone.g:3309:2: ','
            {
             before(grammarAccess.getWallsAccess().getCommaKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:3318:1: rule__Walls__Group__4 : rule__Walls__Group__4__Impl rule__Walls__Group__5 ;
    public final void rule__Walls__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3322:1: ( rule__Walls__Group__4__Impl rule__Walls__Group__5 )
            // InternalXDrone.g:3323:2: rule__Walls__Group__4__Impl rule__Walls__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:3330:1: rule__Walls__Group__4__Impl : ( ( rule__Walls__RightAssignment_4 ) ) ;
    public final void rule__Walls__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3334:1: ( ( ( rule__Walls__RightAssignment_4 ) ) )
            // InternalXDrone.g:3335:1: ( ( rule__Walls__RightAssignment_4 ) )
            {
            // InternalXDrone.g:3335:1: ( ( rule__Walls__RightAssignment_4 ) )
            // InternalXDrone.g:3336:2: ( rule__Walls__RightAssignment_4 )
            {
             before(grammarAccess.getWallsAccess().getRightAssignment_4()); 
            // InternalXDrone.g:3337:2: ( rule__Walls__RightAssignment_4 )
            // InternalXDrone.g:3337:3: rule__Walls__RightAssignment_4
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
    // InternalXDrone.g:3345:1: rule__Walls__Group__5 : rule__Walls__Group__5__Impl rule__Walls__Group__6 ;
    public final void rule__Walls__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3349:1: ( rule__Walls__Group__5__Impl rule__Walls__Group__6 )
            // InternalXDrone.g:3350:2: rule__Walls__Group__5__Impl rule__Walls__Group__6
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
    // InternalXDrone.g:3357:1: rule__Walls__Group__5__Impl : ( ',' ) ;
    public final void rule__Walls__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3361:1: ( ( ',' ) )
            // InternalXDrone.g:3362:1: ( ',' )
            {
            // InternalXDrone.g:3362:1: ( ',' )
            // InternalXDrone.g:3363:2: ','
            {
             before(grammarAccess.getWallsAccess().getCommaKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:3372:1: rule__Walls__Group__6 : rule__Walls__Group__6__Impl rule__Walls__Group__7 ;
    public final void rule__Walls__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3376:1: ( rule__Walls__Group__6__Impl rule__Walls__Group__7 )
            // InternalXDrone.g:3377:2: rule__Walls__Group__6__Impl rule__Walls__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalXDrone.g:3384:1: rule__Walls__Group__6__Impl : ( ( rule__Walls__BackAssignment_6 ) ) ;
    public final void rule__Walls__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3388:1: ( ( ( rule__Walls__BackAssignment_6 ) ) )
            // InternalXDrone.g:3389:1: ( ( rule__Walls__BackAssignment_6 ) )
            {
            // InternalXDrone.g:3389:1: ( ( rule__Walls__BackAssignment_6 ) )
            // InternalXDrone.g:3390:2: ( rule__Walls__BackAssignment_6 )
            {
             before(grammarAccess.getWallsAccess().getBackAssignment_6()); 
            // InternalXDrone.g:3391:2: ( rule__Walls__BackAssignment_6 )
            // InternalXDrone.g:3391:3: rule__Walls__BackAssignment_6
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
    // InternalXDrone.g:3399:1: rule__Walls__Group__7 : rule__Walls__Group__7__Impl rule__Walls__Group__8 ;
    public final void rule__Walls__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3403:1: ( rule__Walls__Group__7__Impl rule__Walls__Group__8 )
            // InternalXDrone.g:3404:2: rule__Walls__Group__7__Impl rule__Walls__Group__8
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
    // InternalXDrone.g:3411:1: rule__Walls__Group__7__Impl : ( ',' ) ;
    public final void rule__Walls__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3415:1: ( ( ',' ) )
            // InternalXDrone.g:3416:1: ( ',' )
            {
            // InternalXDrone.g:3416:1: ( ',' )
            // InternalXDrone.g:3417:2: ','
            {
             before(grammarAccess.getWallsAccess().getCommaKeyword_7()); 
            match(input,37,FOLLOW_2); 
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
    // InternalXDrone.g:3426:1: rule__Walls__Group__8 : rule__Walls__Group__8__Impl rule__Walls__Group__9 ;
    public final void rule__Walls__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3430:1: ( rule__Walls__Group__8__Impl rule__Walls__Group__9 )
            // InternalXDrone.g:3431:2: rule__Walls__Group__8__Impl rule__Walls__Group__9
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
    // InternalXDrone.g:3438:1: rule__Walls__Group__8__Impl : ( ( rule__Walls__LeftAssignment_8 ) ) ;
    public final void rule__Walls__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3442:1: ( ( ( rule__Walls__LeftAssignment_8 ) ) )
            // InternalXDrone.g:3443:1: ( ( rule__Walls__LeftAssignment_8 ) )
            {
            // InternalXDrone.g:3443:1: ( ( rule__Walls__LeftAssignment_8 ) )
            // InternalXDrone.g:3444:2: ( rule__Walls__LeftAssignment_8 )
            {
             before(grammarAccess.getWallsAccess().getLeftAssignment_8()); 
            // InternalXDrone.g:3445:2: ( rule__Walls__LeftAssignment_8 )
            // InternalXDrone.g:3445:3: rule__Walls__LeftAssignment_8
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
    // InternalXDrone.g:3453:1: rule__Walls__Group__9 : rule__Walls__Group__9__Impl ;
    public final void rule__Walls__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3457:1: ( rule__Walls__Group__9__Impl )
            // InternalXDrone.g:3458:2: rule__Walls__Group__9__Impl
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
    // InternalXDrone.g:3464:1: rule__Walls__Group__9__Impl : ( ')' ) ;
    public final void rule__Walls__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3468:1: ( ( ')' ) )
            // InternalXDrone.g:3469:1: ( ')' )
            {
            // InternalXDrone.g:3469:1: ( ')' )
            // InternalXDrone.g:3470:2: ')'
            {
             before(grammarAccess.getWallsAccess().getRightParenthesisKeyword_9()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXDrone.g:3480:1: rule__Object__UnorderedGroup : rule__Object__UnorderedGroup__0 {...}?;
    public final void rule__Object__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup());
        	
        try {
            // InternalXDrone.g:3485:1: ( rule__Object__UnorderedGroup__0 {...}?)
            // InternalXDrone.g:3486:2: rule__Object__UnorderedGroup__0 {...}?
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
    // InternalXDrone.g:3494:1: rule__Object__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) ;
    public final void rule__Object__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXDrone.g:3499:1: ( ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) )
            // InternalXDrone.g:3500:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            {
            // InternalXDrone.g:3500:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                alt10=2;
            }
            else if ( ( LA10_0 == 14 || LA10_0 == 38 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXDrone.g:3501:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    {
                    // InternalXDrone.g:3501:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    // InternalXDrone.g:3502:4: {...}? => ( ( ( rule__Object__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalXDrone.g:3502:100: ( ( ( rule__Object__Group_0__0 ) ) )
                    // InternalXDrone.g:3503:5: ( ( rule__Object__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3509:5: ( ( rule__Object__Group_0__0 ) )
                    // InternalXDrone.g:3510:6: ( rule__Object__Group_0__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_0()); 
                    // InternalXDrone.g:3511:6: ( rule__Object__Group_0__0 )
                    // InternalXDrone.g:3511:7: rule__Object__Group_0__0
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
                    // InternalXDrone.g:3516:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    {
                    // InternalXDrone.g:3516:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    // InternalXDrone.g:3517:4: {...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalXDrone.g:3517:100: ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    // InternalXDrone.g:3518:5: ( ( rule__Object__SizeAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3524:5: ( ( rule__Object__SizeAssignment_1 ) )
                    // InternalXDrone.g:3525:6: ( rule__Object__SizeAssignment_1 )
                    {
                     before(grammarAccess.getObjectAccess().getSizeAssignment_1()); 
                    // InternalXDrone.g:3526:6: ( rule__Object__SizeAssignment_1 )
                    // InternalXDrone.g:3526:7: rule__Object__SizeAssignment_1
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
                    // InternalXDrone.g:3531:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    {
                    // InternalXDrone.g:3531:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    // InternalXDrone.g:3532:4: {...}? => ( ( ( rule__Object__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalXDrone.g:3532:100: ( ( ( rule__Object__Group_2__0 ) ) )
                    // InternalXDrone.g:3533:5: ( ( rule__Object__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3539:5: ( ( rule__Object__Group_2__0 ) )
                    // InternalXDrone.g:3540:6: ( rule__Object__Group_2__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_2()); 
                    // InternalXDrone.g:3541:6: ( rule__Object__Group_2__0 )
                    // InternalXDrone.g:3541:7: rule__Object__Group_2__0
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
    // InternalXDrone.g:3554:1: rule__Object__UnorderedGroup__0 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? ;
    public final void rule__Object__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3558:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? )
            // InternalXDrone.g:3559:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3560:2: ( rule__Object__UnorderedGroup__1 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalXDrone.g:3560:2: rule__Object__UnorderedGroup__1
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
    // InternalXDrone.g:3566:1: rule__Object__UnorderedGroup__1 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? ;
    public final void rule__Object__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3570:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? )
            // InternalXDrone.g:3571:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3572:2: ( rule__Object__UnorderedGroup__2 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalXDrone.g:3572:2: rule__Object__UnorderedGroup__2
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
    // InternalXDrone.g:3578:1: rule__Object__UnorderedGroup__2 : rule__Object__UnorderedGroup__Impl ;
    public final void rule__Object__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3582:1: ( rule__Object__UnorderedGroup__Impl )
            // InternalXDrone.g:3583:2: rule__Object__UnorderedGroup__Impl
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
    // InternalXDrone.g:3590:1: rule__Program__MainAssignment : ( ruleMain ) ;
    public final void rule__Program__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3594:1: ( ( ruleMain ) )
            // InternalXDrone.g:3595:2: ( ruleMain )
            {
            // InternalXDrone.g:3595:2: ( ruleMain )
            // InternalXDrone.g:3596:3: ruleMain
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
    // InternalXDrone.g:3605:1: rule__Main__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Main__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3609:1: ( ( ruleFly ) )
            // InternalXDrone.g:3610:2: ( ruleFly )
            {
            // InternalXDrone.g:3610:2: ( ruleFly )
            // InternalXDrone.g:3611:3: ruleFly
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
    // InternalXDrone.g:3620:1: rule__Main__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Main__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3624:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:3625:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:3625:2: ( ruleEnvironment )
            // InternalXDrone.g:3626:3: ruleEnvironment
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
    // InternalXDrone.g:3635:1: rule__Fly__TakeoffAssignment_1_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3639:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:3640:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:3640:2: ( ruleTakeoff )
            // InternalXDrone.g:3641:3: ruleTakeoff
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
    // InternalXDrone.g:3650:1: rule__Fly__CommandsAssignment_1_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3654:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:3655:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:3655:2: ( ruleSuperCommand )
            // InternalXDrone.g:3656:3: ruleSuperCommand
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
    // InternalXDrone.g:3665:1: rule__Fly__LandAssignment_1_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3669:1: ( ( ruleLand ) )
            // InternalXDrone.g:3670:2: ( ruleLand )
            {
            // InternalXDrone.g:3670:2: ( ruleLand )
            // InternalXDrone.g:3671:3: ruleLand
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
    // InternalXDrone.g:3680:1: rule__Environment__DroneAssignment_2_0 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3684:1: ( ( ruleDrone ) )
            // InternalXDrone.g:3685:2: ( ruleDrone )
            {
            // InternalXDrone.g:3685:2: ( ruleDrone )
            // InternalXDrone.g:3686:3: ruleDrone
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
    // InternalXDrone.g:3695:1: rule__Environment__WallsAssignment_2_1 : ( ruleWalls ) ;
    public final void rule__Environment__WallsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3699:1: ( ( ruleWalls ) )
            // InternalXDrone.g:3700:2: ( ruleWalls )
            {
            // InternalXDrone.g:3700:2: ( ruleWalls )
            // InternalXDrone.g:3701:3: ruleWalls
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
    // InternalXDrone.g:3710:1: rule__Environment__ObjectsAssignment_2_2 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3714:1: ( ( ruleObject ) )
            // InternalXDrone.g:3715:2: ( ruleObject )
            {
            // InternalXDrone.g:3715:2: ( ruleObject )
            // InternalXDrone.g:3716:3: ruleObject
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


    // $ANTLR start "rule__Move__VectorAssignment_1"
    // InternalXDrone.g:3725:1: rule__Move__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Move__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3729:1: ( ( ruleVector ) )
            // InternalXDrone.g:3730:2: ( ruleVector )
            {
            // InternalXDrone.g:3730:2: ( ruleVector )
            // InternalXDrone.g:3731:3: ruleVector
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
    // InternalXDrone.g:3740:1: rule__Rotate__AngleAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Rotate__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3744:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3745:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3745:2: ( ruleDOUBLE )
            // InternalXDrone.g:3746:3: ruleDOUBLE
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
    // InternalXDrone.g:3755:1: rule__Up__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Up__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3759:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3760:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3760:2: ( ruleDOUBLE )
            // InternalXDrone.g:3761:3: ruleDOUBLE
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
    // InternalXDrone.g:3770:1: rule__Down__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Down__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3774:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3775:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3775:2: ( ruleDOUBLE )
            // InternalXDrone.g:3776:3: ruleDOUBLE
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
    // InternalXDrone.g:3785:1: rule__Left__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Left__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3789:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3790:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3790:2: ( ruleDOUBLE )
            // InternalXDrone.g:3791:3: ruleDOUBLE
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
    // InternalXDrone.g:3800:1: rule__Right__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Right__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3804:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3805:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3805:2: ( ruleDOUBLE )
            // InternalXDrone.g:3806:3: ruleDOUBLE
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
    // InternalXDrone.g:3815:1: rule__Forward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3819:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3820:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3820:2: ( ruleDOUBLE )
            // InternalXDrone.g:3821:3: ruleDOUBLE
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
    // InternalXDrone.g:3830:1: rule__Backward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Backward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3834:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3835:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3835:2: ( ruleDOUBLE )
            // InternalXDrone.g:3836:3: ruleDOUBLE
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
    // InternalXDrone.g:3845:1: rule__RotateL__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateL__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3849:1: ( ( RULE_INT ) )
            // InternalXDrone.g:3850:2: ( RULE_INT )
            {
            // InternalXDrone.g:3850:2: ( RULE_INT )
            // InternalXDrone.g:3851:3: RULE_INT
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
    // InternalXDrone.g:3860:1: rule__RotateR__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateR__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3864:1: ( ( RULE_INT ) )
            // InternalXDrone.g:3865:2: ( RULE_INT )
            {
            // InternalXDrone.g:3865:2: ( RULE_INT )
            // InternalXDrone.g:3866:3: RULE_INT
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
    // InternalXDrone.g:3875:1: rule__Wait__SecondsAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3879:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3880:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3880:2: ( ruleDOUBLE )
            // InternalXDrone.g:3881:3: ruleDOUBLE
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
    // InternalXDrone.g:3890:1: rule__FunctionName__Func_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionName__Func_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3894:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3895:2: ( RULE_ID )
            {
            // InternalXDrone.g:3895:2: ( RULE_ID )
            // InternalXDrone.g:3896:3: RULE_ID
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
    // InternalXDrone.g:3905:1: rule__Drone__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Drone__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3909:1: ( ( ruleVector ) )
            // InternalXDrone.g:3910:2: ( ruleVector )
            {
            // InternalXDrone.g:3910:2: ( ruleVector )
            // InternalXDrone.g:3911:3: ruleVector
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
    // InternalXDrone.g:3920:1: rule__Object__Object_nameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3924:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3925:2: ( RULE_ID )
            {
            // InternalXDrone.g:3925:2: ( RULE_ID )
            // InternalXDrone.g:3926:3: RULE_ID
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
    // InternalXDrone.g:3935:1: rule__Object__OriginAssignment_0_2 : ( ruleOrigin ) ;
    public final void rule__Object__OriginAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3939:1: ( ( ruleOrigin ) )
            // InternalXDrone.g:3940:2: ( ruleOrigin )
            {
            // InternalXDrone.g:3940:2: ( ruleOrigin )
            // InternalXDrone.g:3941:3: ruleOrigin
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
    // InternalXDrone.g:3950:1: rule__Object__SizeAssignment_1 : ( ruleSize ) ;
    public final void rule__Object__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3954:1: ( ( ruleSize ) )
            // InternalXDrone.g:3955:2: ( ruleSize )
            {
            // InternalXDrone.g:3955:2: ( ruleSize )
            // InternalXDrone.g:3956:3: ruleSize
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
    // InternalXDrone.g:3965:1: rule__Object__ColorAssignment_2_0 : ( ruleColor ) ;
    public final void rule__Object__ColorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3969:1: ( ( ruleColor ) )
            // InternalXDrone.g:3970:2: ( ruleColor )
            {
            // InternalXDrone.g:3970:2: ( ruleColor )
            // InternalXDrone.g:3971:3: ruleColor
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
    // InternalXDrone.g:3980:1: rule__Origin__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Origin__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3984:1: ( ( ruleVector ) )
            // InternalXDrone.g:3985:2: ( ruleVector )
            {
            // InternalXDrone.g:3985:2: ( ruleVector )
            // InternalXDrone.g:3986:3: ruleVector
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
    // InternalXDrone.g:3995:1: rule__Size__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Size__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3999:1: ( ( ruleVector ) )
            // InternalXDrone.g:4000:2: ( ruleVector )
            {
            // InternalXDrone.g:4000:2: ( ruleVector )
            // InternalXDrone.g:4001:3: ruleVector
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
    // InternalXDrone.g:4010:1: rule__Vector__XAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Vector__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4014:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4015:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4015:2: ( ruleDOUBLE )
            // InternalXDrone.g:4016:3: ruleDOUBLE
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
    // InternalXDrone.g:4025:1: rule__Vector__YAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Vector__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4029:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4030:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4030:2: ( ruleDOUBLE )
            // InternalXDrone.g:4031:3: ruleDOUBLE
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
    // InternalXDrone.g:4040:1: rule__Vector__ZAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Vector__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4044:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4045:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4045:2: ( ruleDOUBLE )
            // InternalXDrone.g:4046:3: ruleDOUBLE
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
    // InternalXDrone.g:4055:1: rule__Color__Color_valueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__Color_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4059:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:4060:2: ( RULE_STRING )
            {
            // InternalXDrone.g:4060:2: ( RULE_STRING )
            // InternalXDrone.g:4061:3: RULE_STRING
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
    // InternalXDrone.g:4070:1: rule__Walls__FrontAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__FrontAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4074:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4075:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4075:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4076:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:4085:1: rule__Walls__RightAssignment_4 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4089:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4090:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4090:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4091:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:4100:1: rule__Walls__BackAssignment_6 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__BackAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4104:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4105:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4105:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4106:3: rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:4115:1: rule__Walls__LeftAssignment_8 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Walls__LeftAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4119:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4120:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4120:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4121:3: rulePOSITIVE_DOUBLE
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
    static final String dfa_3s = "\1\5\1\41\2\43\1\0\1\uffff\1\42\1\24\1\6\1\uffff\1\43\1\4\1\16\1\24\1\4\1\21\1\0\1\4\1\21\3\4\1\21\1\4\1\45\1\4\2\21\2\4\1\45\1\21\3\4\1\45\1\4\1\21\1\4\1\45\1\4\1\21\1\45\1\21\2\4\1\45\1\21\1\4\1\0\2\4\1\21\1\45\1\4\1\25\1\45\1\21\1\0\1\4\1\25\1\4\2\25";
    static final String dfa_4s = "\1\47\1\41\2\43\1\0\1\uffff\1\42\1\24\1\6\1\uffff\1\43\1\20\1\16\1\24\1\4\1\45\1\0\1\20\1\45\1\4\1\20\1\4\1\45\1\4\1\45\1\4\2\45\1\4\1\20\2\45\1\4\1\20\1\4\1\45\1\4\1\45\1\4\1\45\1\4\1\25\2\45\1\20\1\4\1\45\1\25\1\4\1\0\2\4\1\25\1\45\1\4\1\25\1\45\1\25\1\0\1\4\1\25\1\4\2\25";
    static final String dfa_5s = "\5\uffff\1\2\3\uffff\1\1\66\uffff";
    static final String dfa_6s = "\4\uffff\1\2\13\uffff\1\3\40\uffff\1\1\10\uffff\1\0\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\1\4\21\uffff\1\5\3\uffff\1\2\1\uffff\1\3\1\5",
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
            "\1\23\23\uffff\1\24",
            "\1\uffff",
            "\1\26\13\uffff\1\25",
            "\1\27\23\uffff\1\24",
            "\1\30",
            "\1\32\13\uffff\1\31",
            "\1\33",
            "\1\34\23\uffff\1\35",
            "\1\36",
            "\1\24",
            "\1\37",
            "\1\40\23\uffff\1\41",
            "\1\42\23\uffff\1\35",
            "\1\43",
            "\1\45\13\uffff\1\44",
            "\1\24",
            "\1\46\23\uffff\1\41",
            "\1\47",
            "\1\51\13\uffff\1\50",
            "\1\52",
            "\1\35",
            "\1\53",
            "\1\55\23\uffff\1\54",
            "\1\56",
            "\1\41",
            "\1\57",
            "\1\60\3\uffff\1\61",
            "\1\35",
            "\1\62\23\uffff\1\54",
            "\1\64\13\uffff\1\63",
            "\1\65",
            "\1\41",
            "\1\66\3\uffff\1\61",
            "\1\67",
            "\1\uffff",
            "\1\70",
            "\1\71",
            "\1\73\3\uffff\1\72",
            "\1\54",
            "\1\74",
            "\1\61",
            "\1\54",
            "\1\75\3\uffff\1\72",
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
            return "3560:2: ( rule__Object__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_58 = input.LA(1);

                         
                        int index11_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_58);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_49 = input.LA(1);

                         
                        int index11_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_49);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\4\uffff\1\2\13\uffff\1\1\40\uffff\1\0\10\uffff\1\3\5\uffff}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3572:2: ( rule__Object__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_49 = input.LA(1);

                         
                        int index12_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_49);
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
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index12_4);
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000007FCC1020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007FCC0022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000D100004020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000D100004022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}

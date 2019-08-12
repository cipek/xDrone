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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TAKEOFF()'", "'LAND()'", "'fly(){'", "'}'", "'environment(){'", "'.'", "'-'", "'MOVE'", "'ROTATE'", "'('", "')'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'origin'", "'='", "'size'", "','", "'color'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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


    // $ANTLR start "entryRuleMove"
    // InternalXDrone.g:253:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalXDrone.g:254:1: ( ruleMove EOF )
            // InternalXDrone.g:255:1: ruleMove EOF
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
    // InternalXDrone.g:262:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:266:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalXDrone.g:267:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalXDrone.g:267:2: ( ( rule__Move__Group__0 ) )
            // InternalXDrone.g:268:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalXDrone.g:269:3: ( rule__Move__Group__0 )
            // InternalXDrone.g:269:4: rule__Move__Group__0
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
    // InternalXDrone.g:278:1: entryRuleRotate : ruleRotate EOF ;
    public final void entryRuleRotate() throws RecognitionException {
        try {
            // InternalXDrone.g:279:1: ( ruleRotate EOF )
            // InternalXDrone.g:280:1: ruleRotate EOF
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
    // InternalXDrone.g:287:1: ruleRotate : ( ( rule__Rotate__Group__0 ) ) ;
    public final void ruleRotate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:291:2: ( ( ( rule__Rotate__Group__0 ) ) )
            // InternalXDrone.g:292:2: ( ( rule__Rotate__Group__0 ) )
            {
            // InternalXDrone.g:292:2: ( ( rule__Rotate__Group__0 ) )
            // InternalXDrone.g:293:3: ( rule__Rotate__Group__0 )
            {
             before(grammarAccess.getRotateAccess().getGroup()); 
            // InternalXDrone.g:294:3: ( rule__Rotate__Group__0 )
            // InternalXDrone.g:294:4: rule__Rotate__Group__0
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
    // InternalXDrone.g:303:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalXDrone.g:304:1: ( ruleUp EOF )
            // InternalXDrone.g:305:1: ruleUp EOF
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
    // InternalXDrone.g:312:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:316:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalXDrone.g:317:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalXDrone.g:317:2: ( ( rule__Up__Group__0 ) )
            // InternalXDrone.g:318:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalXDrone.g:319:3: ( rule__Up__Group__0 )
            // InternalXDrone.g:319:4: rule__Up__Group__0
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
    // InternalXDrone.g:328:1: entryRuleDown : ruleDown EOF ;
    public final void entryRuleDown() throws RecognitionException {
        try {
            // InternalXDrone.g:329:1: ( ruleDown EOF )
            // InternalXDrone.g:330:1: ruleDown EOF
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
    // InternalXDrone.g:337:1: ruleDown : ( ( rule__Down__Group__0 ) ) ;
    public final void ruleDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:341:2: ( ( ( rule__Down__Group__0 ) ) )
            // InternalXDrone.g:342:2: ( ( rule__Down__Group__0 ) )
            {
            // InternalXDrone.g:342:2: ( ( rule__Down__Group__0 ) )
            // InternalXDrone.g:343:3: ( rule__Down__Group__0 )
            {
             before(grammarAccess.getDownAccess().getGroup()); 
            // InternalXDrone.g:344:3: ( rule__Down__Group__0 )
            // InternalXDrone.g:344:4: rule__Down__Group__0
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
    // InternalXDrone.g:353:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalXDrone.g:354:1: ( ruleLeft EOF )
            // InternalXDrone.g:355:1: ruleLeft EOF
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
    // InternalXDrone.g:362:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:366:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalXDrone.g:367:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalXDrone.g:367:2: ( ( rule__Left__Group__0 ) )
            // InternalXDrone.g:368:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalXDrone.g:369:3: ( rule__Left__Group__0 )
            // InternalXDrone.g:369:4: rule__Left__Group__0
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
    // InternalXDrone.g:378:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalXDrone.g:379:1: ( ruleRight EOF )
            // InternalXDrone.g:380:1: ruleRight EOF
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
    // InternalXDrone.g:387:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:391:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalXDrone.g:392:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalXDrone.g:392:2: ( ( rule__Right__Group__0 ) )
            // InternalXDrone.g:393:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalXDrone.g:394:3: ( rule__Right__Group__0 )
            // InternalXDrone.g:394:4: rule__Right__Group__0
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
    // InternalXDrone.g:403:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalXDrone.g:404:1: ( ruleForward EOF )
            // InternalXDrone.g:405:1: ruleForward EOF
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
    // InternalXDrone.g:412:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:416:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalXDrone.g:417:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalXDrone.g:417:2: ( ( rule__Forward__Group__0 ) )
            // InternalXDrone.g:418:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalXDrone.g:419:3: ( rule__Forward__Group__0 )
            // InternalXDrone.g:419:4: rule__Forward__Group__0
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
    // InternalXDrone.g:428:1: entryRuleBackward : ruleBackward EOF ;
    public final void entryRuleBackward() throws RecognitionException {
        try {
            // InternalXDrone.g:429:1: ( ruleBackward EOF )
            // InternalXDrone.g:430:1: ruleBackward EOF
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
    // InternalXDrone.g:437:1: ruleBackward : ( ( rule__Backward__Group__0 ) ) ;
    public final void ruleBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:441:2: ( ( ( rule__Backward__Group__0 ) ) )
            // InternalXDrone.g:442:2: ( ( rule__Backward__Group__0 ) )
            {
            // InternalXDrone.g:442:2: ( ( rule__Backward__Group__0 ) )
            // InternalXDrone.g:443:3: ( rule__Backward__Group__0 )
            {
             before(grammarAccess.getBackwardAccess().getGroup()); 
            // InternalXDrone.g:444:3: ( rule__Backward__Group__0 )
            // InternalXDrone.g:444:4: rule__Backward__Group__0
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
    // InternalXDrone.g:453:1: entryRuleRotateL : ruleRotateL EOF ;
    public final void entryRuleRotateL() throws RecognitionException {
        try {
            // InternalXDrone.g:454:1: ( ruleRotateL EOF )
            // InternalXDrone.g:455:1: ruleRotateL EOF
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
    // InternalXDrone.g:462:1: ruleRotateL : ( ( rule__RotateL__Group__0 ) ) ;
    public final void ruleRotateL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:466:2: ( ( ( rule__RotateL__Group__0 ) ) )
            // InternalXDrone.g:467:2: ( ( rule__RotateL__Group__0 ) )
            {
            // InternalXDrone.g:467:2: ( ( rule__RotateL__Group__0 ) )
            // InternalXDrone.g:468:3: ( rule__RotateL__Group__0 )
            {
             before(grammarAccess.getRotateLAccess().getGroup()); 
            // InternalXDrone.g:469:3: ( rule__RotateL__Group__0 )
            // InternalXDrone.g:469:4: rule__RotateL__Group__0
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
    // InternalXDrone.g:478:1: entryRuleRotateR : ruleRotateR EOF ;
    public final void entryRuleRotateR() throws RecognitionException {
        try {
            // InternalXDrone.g:479:1: ( ruleRotateR EOF )
            // InternalXDrone.g:480:1: ruleRotateR EOF
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
    // InternalXDrone.g:487:1: ruleRotateR : ( ( rule__RotateR__Group__0 ) ) ;
    public final void ruleRotateR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:491:2: ( ( ( rule__RotateR__Group__0 ) ) )
            // InternalXDrone.g:492:2: ( ( rule__RotateR__Group__0 ) )
            {
            // InternalXDrone.g:492:2: ( ( rule__RotateR__Group__0 ) )
            // InternalXDrone.g:493:3: ( rule__RotateR__Group__0 )
            {
             before(grammarAccess.getRotateRAccess().getGroup()); 
            // InternalXDrone.g:494:3: ( rule__RotateR__Group__0 )
            // InternalXDrone.g:494:4: rule__RotateR__Group__0
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalXDrone.g:528:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( ruleFunctionName EOF )
            // InternalXDrone.g:530:1: ruleFunctionName EOF
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
    // InternalXDrone.g:537:1: ruleFunctionName : ( ( rule__FunctionName__Group__0 ) ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__FunctionName__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__FunctionName__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__FunctionName__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__FunctionName__Group__0 )
            {
             before(grammarAccess.getFunctionNameAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__FunctionName__Group__0 )
            // InternalXDrone.g:544:4: rule__FunctionName__Group__0
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
    // InternalXDrone.g:553:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalXDrone.g:554:1: ( ruleDrone EOF )
            // InternalXDrone.g:555:1: ruleDrone EOF
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
    // InternalXDrone.g:562:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:566:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalXDrone.g:567:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalXDrone.g:567:2: ( ( rule__Drone__Group__0 ) )
            // InternalXDrone.g:568:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalXDrone.g:569:3: ( rule__Drone__Group__0 )
            // InternalXDrone.g:569:4: rule__Drone__Group__0
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
    // InternalXDrone.g:578:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalXDrone.g:579:1: ( ruleObject EOF )
            // InternalXDrone.g:580:1: ruleObject EOF
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
    // InternalXDrone.g:587:1: ruleObject : ( ( rule__Object__UnorderedGroup ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:591:2: ( ( ( rule__Object__UnorderedGroup ) ) )
            // InternalXDrone.g:592:2: ( ( rule__Object__UnorderedGroup ) )
            {
            // InternalXDrone.g:592:2: ( ( rule__Object__UnorderedGroup ) )
            // InternalXDrone.g:593:3: ( rule__Object__UnorderedGroup )
            {
             before(grammarAccess.getObjectAccess().getUnorderedGroup()); 
            // InternalXDrone.g:594:3: ( rule__Object__UnorderedGroup )
            // InternalXDrone.g:594:4: rule__Object__UnorderedGroup
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
    // InternalXDrone.g:603:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalXDrone.g:604:1: ( ruleOrigin EOF )
            // InternalXDrone.g:605:1: ruleOrigin EOF
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
    // InternalXDrone.g:612:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:616:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalXDrone.g:617:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalXDrone.g:617:2: ( ( rule__Origin__Group__0 ) )
            // InternalXDrone.g:618:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalXDrone.g:619:3: ( rule__Origin__Group__0 )
            // InternalXDrone.g:619:4: rule__Origin__Group__0
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
    // InternalXDrone.g:628:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalXDrone.g:629:1: ( ruleSize EOF )
            // InternalXDrone.g:630:1: ruleSize EOF
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
    // InternalXDrone.g:637:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:641:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalXDrone.g:642:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalXDrone.g:642:2: ( ( rule__Size__Group__0 ) )
            // InternalXDrone.g:643:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalXDrone.g:644:3: ( rule__Size__Group__0 )
            // InternalXDrone.g:644:4: rule__Size__Group__0
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


    // $ANTLR start "rule__Environment__Alternatives_2"
    // InternalXDrone.g:702:1: rule__Environment__Alternatives_2 : ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__ObjectsAssignment_2_1 ) ) );
    public final void rule__Environment__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:706:1: ( ( ( rule__Environment__DroneAssignment_2_0 ) ) | ( ( rule__Environment__ObjectsAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==36||LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalXDrone.g:707:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    {
                    // InternalXDrone.g:707:2: ( ( rule__Environment__DroneAssignment_2_0 ) )
                    // InternalXDrone.g:708:3: ( rule__Environment__DroneAssignment_2_0 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0()); 
                    // InternalXDrone.g:709:3: ( rule__Environment__DroneAssignment_2_0 )
                    // InternalXDrone.g:709:4: rule__Environment__DroneAssignment_2_0
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
                    // InternalXDrone.g:713:2: ( ( rule__Environment__ObjectsAssignment_2_1 ) )
                    {
                    // InternalXDrone.g:713:2: ( ( rule__Environment__ObjectsAssignment_2_1 ) )
                    // InternalXDrone.g:714:3: ( rule__Environment__ObjectsAssignment_2_1 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_1()); 
                    // InternalXDrone.g:715:3: ( rule__Environment__ObjectsAssignment_2_1 )
                    // InternalXDrone.g:715:4: rule__Environment__ObjectsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__ObjectsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_1()); 

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
    // InternalXDrone.g:723:1: rule__SuperCommand__Alternatives : ( ( ruleCommand ) | ( ruleFunctionName ) );
    public final void rule__SuperCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:727:1: ( ( ruleCommand ) | ( ruleFunctionName ) )
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
                    // InternalXDrone.g:728:2: ( ruleCommand )
                    {
                    // InternalXDrone.g:728:2: ( ruleCommand )
                    // InternalXDrone.g:729:3: ruleCommand
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
                    // InternalXDrone.g:734:2: ( ruleFunctionName )
                    {
                    // InternalXDrone.g:734:2: ( ruleFunctionName )
                    // InternalXDrone.g:735:3: ruleFunctionName
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
    // InternalXDrone.g:744:1: rule__Command__Alternatives : ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:748:1: ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleMove ) | ( ruleRotate ) )
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
                    // InternalXDrone.g:749:2: ( ruleUp )
                    {
                    // InternalXDrone.g:749:2: ( ruleUp )
                    // InternalXDrone.g:750:3: ruleUp
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
                    // InternalXDrone.g:755:2: ( ruleDown )
                    {
                    // InternalXDrone.g:755:2: ( ruleDown )
                    // InternalXDrone.g:756:3: ruleDown
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
                    // InternalXDrone.g:761:2: ( ruleLeft )
                    {
                    // InternalXDrone.g:761:2: ( ruleLeft )
                    // InternalXDrone.g:762:3: ruleLeft
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
                    // InternalXDrone.g:767:2: ( ruleRight )
                    {
                    // InternalXDrone.g:767:2: ( ruleRight )
                    // InternalXDrone.g:768:3: ruleRight
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
                    // InternalXDrone.g:773:2: ( ruleForward )
                    {
                    // InternalXDrone.g:773:2: ( ruleForward )
                    // InternalXDrone.g:774:3: ruleForward
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
                    // InternalXDrone.g:779:2: ( ruleBackward )
                    {
                    // InternalXDrone.g:779:2: ( ruleBackward )
                    // InternalXDrone.g:780:3: ruleBackward
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
                    // InternalXDrone.g:785:2: ( ruleRotateL )
                    {
                    // InternalXDrone.g:785:2: ( ruleRotateL )
                    // InternalXDrone.g:786:3: ruleRotateL
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
                    // InternalXDrone.g:791:2: ( ruleRotateR )
                    {
                    // InternalXDrone.g:791:2: ( ruleRotateR )
                    // InternalXDrone.g:792:3: ruleRotateR
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
                    // InternalXDrone.g:797:2: ( ruleWait )
                    {
                    // InternalXDrone.g:797:2: ( ruleWait )
                    // InternalXDrone.g:798:3: ruleWait
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
                    // InternalXDrone.g:803:2: ( ruleMove )
                    {
                    // InternalXDrone.g:803:2: ( ruleMove )
                    // InternalXDrone.g:804:3: ruleMove
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
                    // InternalXDrone.g:809:2: ( ruleRotate )
                    {
                    // InternalXDrone.g:809:2: ( ruleRotate )
                    // InternalXDrone.g:810:3: ruleRotate
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
    // InternalXDrone.g:819:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( ( rule__DOUBLE__Group_1__0 ) ) | ( RULE_INT ) | ( ( rule__DOUBLE__Group_3__0 ) ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:823:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( ( rule__DOUBLE__Group_1__0 ) ) | ( RULE_INT ) | ( ( rule__DOUBLE__Group_3__0 ) ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==21||LA4_1==37) ) {
                    alt4=3;
                }
                else if ( (LA4_1==16) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==17) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_INT) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==16) ) {
                        alt4=2;
                    }
                    else if ( (LA4_5==EOF||LA4_5==21||LA4_5==37) ) {
                        alt4=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

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
                    // InternalXDrone.g:824:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:824:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:825:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:826:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:826:4: rule__DOUBLE__Group_0__0
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
                    // InternalXDrone.g:830:2: ( ( rule__DOUBLE__Group_1__0 ) )
                    {
                    // InternalXDrone.g:830:2: ( ( rule__DOUBLE__Group_1__0 ) )
                    // InternalXDrone.g:831:3: ( rule__DOUBLE__Group_1__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
                    // InternalXDrone.g:832:3: ( rule__DOUBLE__Group_1__0 )
                    // InternalXDrone.g:832:4: rule__DOUBLE__Group_1__0
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
                    // InternalXDrone.g:836:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:836:2: ( RULE_INT )
                    // InternalXDrone.g:837:3: RULE_INT
                    {
                     before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:842:2: ( ( rule__DOUBLE__Group_3__0 ) )
                    {
                    // InternalXDrone.g:842:2: ( ( rule__DOUBLE__Group_3__0 ) )
                    // InternalXDrone.g:843:3: ( rule__DOUBLE__Group_3__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_3()); 
                    // InternalXDrone.g:844:3: ( rule__DOUBLE__Group_3__0 )
                    // InternalXDrone.g:844:4: rule__DOUBLE__Group_3__0
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
    // InternalXDrone.g:852:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:856:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalXDrone.g:857:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalXDrone.g:864:1: rule__Program__Group__0__Impl : ( ( rule__Program__FlyAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:868:1: ( ( ( rule__Program__FlyAssignment_0 ) ) )
            // InternalXDrone.g:869:1: ( ( rule__Program__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:869:1: ( ( rule__Program__FlyAssignment_0 ) )
            // InternalXDrone.g:870:2: ( rule__Program__FlyAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:871:2: ( rule__Program__FlyAssignment_0 )
            // InternalXDrone.g:871:3: rule__Program__FlyAssignment_0
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
    // InternalXDrone.g:879:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:883:1: ( rule__Program__Group__1__Impl )
            // InternalXDrone.g:884:2: rule__Program__Group__1__Impl
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
    // InternalXDrone.g:890:1: rule__Program__Group__1__Impl : ( ( rule__Program__EnvironmentAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:894:1: ( ( ( rule__Program__EnvironmentAssignment_1 ) ) )
            // InternalXDrone.g:895:1: ( ( rule__Program__EnvironmentAssignment_1 ) )
            {
            // InternalXDrone.g:895:1: ( ( rule__Program__EnvironmentAssignment_1 ) )
            // InternalXDrone.g:896:2: ( rule__Program__EnvironmentAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:897:2: ( rule__Program__EnvironmentAssignment_1 )
            // InternalXDrone.g:897:3: rule__Program__EnvironmentAssignment_1
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
    // InternalXDrone.g:906:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:910:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:911:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
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
    // InternalXDrone.g:918:1: rule__Fly__Group__0__Impl : ( 'fly(){' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:922:1: ( ( 'fly(){' ) )
            // InternalXDrone.g:923:1: ( 'fly(){' )
            {
            // InternalXDrone.g:923:1: ( 'fly(){' )
            // InternalXDrone.g:924:2: 'fly(){'
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
    // InternalXDrone.g:933:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:937:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:938:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
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
    // InternalXDrone.g:945:1: rule__Fly__Group__1__Impl : ( ( rule__Fly__Group_1__0 ) ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:949:1: ( ( ( rule__Fly__Group_1__0 ) ) )
            // InternalXDrone.g:950:1: ( ( rule__Fly__Group_1__0 ) )
            {
            // InternalXDrone.g:950:1: ( ( rule__Fly__Group_1__0 ) )
            // InternalXDrone.g:951:2: ( rule__Fly__Group_1__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_1()); 
            // InternalXDrone.g:952:2: ( rule__Fly__Group_1__0 )
            // InternalXDrone.g:952:3: rule__Fly__Group_1__0
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
    // InternalXDrone.g:960:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:964:1: ( rule__Fly__Group__2__Impl )
            // InternalXDrone.g:965:2: rule__Fly__Group__2__Impl
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
    // InternalXDrone.g:971:1: rule__Fly__Group__2__Impl : ( '}' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:975:1: ( ( '}' ) )
            // InternalXDrone.g:976:1: ( '}' )
            {
            // InternalXDrone.g:976:1: ( '}' )
            // InternalXDrone.g:977:2: '}'
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
    // InternalXDrone.g:987:1: rule__Fly__Group_1__0 : rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 ;
    public final void rule__Fly__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:991:1: ( rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1 )
            // InternalXDrone.g:992:2: rule__Fly__Group_1__0__Impl rule__Fly__Group_1__1
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
    // InternalXDrone.g:999:1: rule__Fly__Group_1__0__Impl : ( ( rule__Fly__TakeoffAssignment_1_0 ) ) ;
    public final void rule__Fly__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1003:1: ( ( ( rule__Fly__TakeoffAssignment_1_0 ) ) )
            // InternalXDrone.g:1004:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            {
            // InternalXDrone.g:1004:1: ( ( rule__Fly__TakeoffAssignment_1_0 ) )
            // InternalXDrone.g:1005:2: ( rule__Fly__TakeoffAssignment_1_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0()); 
            // InternalXDrone.g:1006:2: ( rule__Fly__TakeoffAssignment_1_0 )
            // InternalXDrone.g:1006:3: rule__Fly__TakeoffAssignment_1_0
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
    // InternalXDrone.g:1014:1: rule__Fly__Group_1__1 : rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 ;
    public final void rule__Fly__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1018:1: ( rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2 )
            // InternalXDrone.g:1019:2: rule__Fly__Group_1__1__Impl rule__Fly__Group_1__2
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
    // InternalXDrone.g:1026:1: rule__Fly__Group_1__1__Impl : ( ( rule__Fly__CommandsAssignment_1_1 )* ) ;
    public final void rule__Fly__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1030:1: ( ( ( rule__Fly__CommandsAssignment_1_1 )* ) )
            // InternalXDrone.g:1031:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            {
            // InternalXDrone.g:1031:1: ( ( rule__Fly__CommandsAssignment_1_1 )* )
            // InternalXDrone.g:1032:2: ( rule__Fly__CommandsAssignment_1_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_1_1()); 
            // InternalXDrone.g:1033:2: ( rule__Fly__CommandsAssignment_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=18 && LA5_0<=19)||(LA5_0>=22 && LA5_0<=30)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXDrone.g:1033:3: rule__Fly__CommandsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Fly__CommandsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalXDrone.g:1041:1: rule__Fly__Group_1__2 : rule__Fly__Group_1__2__Impl ;
    public final void rule__Fly__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1045:1: ( rule__Fly__Group_1__2__Impl )
            // InternalXDrone.g:1046:2: rule__Fly__Group_1__2__Impl
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
    // InternalXDrone.g:1052:1: rule__Fly__Group_1__2__Impl : ( ( rule__Fly__LandAssignment_1_2 ) ) ;
    public final void rule__Fly__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1056:1: ( ( ( rule__Fly__LandAssignment_1_2 ) ) )
            // InternalXDrone.g:1057:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            {
            // InternalXDrone.g:1057:1: ( ( rule__Fly__LandAssignment_1_2 ) )
            // InternalXDrone.g:1058:2: ( rule__Fly__LandAssignment_1_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_1_2()); 
            // InternalXDrone.g:1059:2: ( rule__Fly__LandAssignment_1_2 )
            // InternalXDrone.g:1059:3: rule__Fly__LandAssignment_1_2
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
    // InternalXDrone.g:1068:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1072:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:1073:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
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
    // InternalXDrone.g:1080:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1084:1: ( ( () ) )
            // InternalXDrone.g:1085:1: ( () )
            {
            // InternalXDrone.g:1085:1: ( () )
            // InternalXDrone.g:1086:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:1087:2: ()
            // InternalXDrone.g:1087:3: 
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
    // InternalXDrone.g:1095:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1099:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:1100:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
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
    // InternalXDrone.g:1107:1: rule__Environment__Group__1__Impl : ( 'environment(){' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1111:1: ( ( 'environment(){' ) )
            // InternalXDrone.g:1112:1: ( 'environment(){' )
            {
            // InternalXDrone.g:1112:1: ( 'environment(){' )
            // InternalXDrone.g:1113:2: 'environment(){'
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
    // InternalXDrone.g:1122:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1126:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:1127:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
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
    // InternalXDrone.g:1134:1: rule__Environment__Group__2__Impl : ( ( rule__Environment__Alternatives_2 )* ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1138:1: ( ( ( rule__Environment__Alternatives_2 )* ) )
            // InternalXDrone.g:1139:1: ( ( rule__Environment__Alternatives_2 )* )
            {
            // InternalXDrone.g:1139:1: ( ( rule__Environment__Alternatives_2 )* )
            // InternalXDrone.g:1140:2: ( rule__Environment__Alternatives_2 )*
            {
             before(grammarAccess.getEnvironmentAccess().getAlternatives_2()); 
            // InternalXDrone.g:1141:2: ( rule__Environment__Alternatives_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID||LA6_1==14||LA6_1==32||LA6_1==36||LA6_1==38) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==RULE_ID||LA6_0==32||LA6_0==36||LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXDrone.g:1141:3: rule__Environment__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Environment__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalXDrone.g:1149:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1153:1: ( rule__Environment__Group__3__Impl )
            // InternalXDrone.g:1154:2: rule__Environment__Group__3__Impl
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
    // InternalXDrone.g:1160:1: rule__Environment__Group__3__Impl : ( '}' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1164:1: ( ( '}' ) )
            // InternalXDrone.g:1165:1: ( '}' )
            {
            // InternalXDrone.g:1165:1: ( '}' )
            // InternalXDrone.g:1166:2: '}'
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
    // InternalXDrone.g:1176:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1180:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1181:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
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
    // InternalXDrone.g:1188:1: rule__DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1192:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1193:1: ( RULE_INT )
            {
            // InternalXDrone.g:1193:1: ( RULE_INT )
            // InternalXDrone.g:1194:2: RULE_INT
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
    // InternalXDrone.g:1203:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl rule__DOUBLE__Group_0__2 ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1207:1: ( rule__DOUBLE__Group_0__1__Impl rule__DOUBLE__Group_0__2 )
            // InternalXDrone.g:1208:2: rule__DOUBLE__Group_0__1__Impl rule__DOUBLE__Group_0__2
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
    // InternalXDrone.g:1215:1: rule__DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1219:1: ( ( '.' ) )
            // InternalXDrone.g:1220:1: ( '.' )
            {
            // InternalXDrone.g:1220:1: ( '.' )
            // InternalXDrone.g:1221:2: '.'
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
    // InternalXDrone.g:1230:1: rule__DOUBLE__Group_0__2 : rule__DOUBLE__Group_0__2__Impl ;
    public final void rule__DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1234:1: ( rule__DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1235:2: rule__DOUBLE__Group_0__2__Impl
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
    // InternalXDrone.g:1241:1: rule__DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1245:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1246:1: ( RULE_INT )
            {
            // InternalXDrone.g:1246:1: ( RULE_INT )
            // InternalXDrone.g:1247:2: RULE_INT
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
    // InternalXDrone.g:1257:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1261:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalXDrone.g:1262:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
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
    // InternalXDrone.g:1269:1: rule__DOUBLE__Group_1__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1273:1: ( ( '-' ) )
            // InternalXDrone.g:1274:1: ( '-' )
            {
            // InternalXDrone.g:1274:1: ( '-' )
            // InternalXDrone.g:1275:2: '-'
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
    // InternalXDrone.g:1284:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl rule__DOUBLE__Group_1__2 ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1288:1: ( rule__DOUBLE__Group_1__1__Impl rule__DOUBLE__Group_1__2 )
            // InternalXDrone.g:1289:2: rule__DOUBLE__Group_1__1__Impl rule__DOUBLE__Group_1__2
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
    // InternalXDrone.g:1296:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1300:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1301:1: ( RULE_INT )
            {
            // InternalXDrone.g:1301:1: ( RULE_INT )
            // InternalXDrone.g:1302:2: RULE_INT
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
    // InternalXDrone.g:1311:1: rule__DOUBLE__Group_1__2 : rule__DOUBLE__Group_1__2__Impl rule__DOUBLE__Group_1__3 ;
    public final void rule__DOUBLE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1315:1: ( rule__DOUBLE__Group_1__2__Impl rule__DOUBLE__Group_1__3 )
            // InternalXDrone.g:1316:2: rule__DOUBLE__Group_1__2__Impl rule__DOUBLE__Group_1__3
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
    // InternalXDrone.g:1323:1: rule__DOUBLE__Group_1__2__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1327:1: ( ( '.' ) )
            // InternalXDrone.g:1328:1: ( '.' )
            {
            // InternalXDrone.g:1328:1: ( '.' )
            // InternalXDrone.g:1329:2: '.'
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
    // InternalXDrone.g:1338:1: rule__DOUBLE__Group_1__3 : rule__DOUBLE__Group_1__3__Impl ;
    public final void rule__DOUBLE__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1342:1: ( rule__DOUBLE__Group_1__3__Impl )
            // InternalXDrone.g:1343:2: rule__DOUBLE__Group_1__3__Impl
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
    // InternalXDrone.g:1349:1: rule__DOUBLE__Group_1__3__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1353:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1354:1: ( RULE_INT )
            {
            // InternalXDrone.g:1354:1: ( RULE_INT )
            // InternalXDrone.g:1355:2: RULE_INT
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
    // InternalXDrone.g:1365:1: rule__DOUBLE__Group_3__0 : rule__DOUBLE__Group_3__0__Impl rule__DOUBLE__Group_3__1 ;
    public final void rule__DOUBLE__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1369:1: ( rule__DOUBLE__Group_3__0__Impl rule__DOUBLE__Group_3__1 )
            // InternalXDrone.g:1370:2: rule__DOUBLE__Group_3__0__Impl rule__DOUBLE__Group_3__1
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
    // InternalXDrone.g:1377:1: rule__DOUBLE__Group_3__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1381:1: ( ( '-' ) )
            // InternalXDrone.g:1382:1: ( '-' )
            {
            // InternalXDrone.g:1382:1: ( '-' )
            // InternalXDrone.g:1383:2: '-'
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
    // InternalXDrone.g:1392:1: rule__DOUBLE__Group_3__1 : rule__DOUBLE__Group_3__1__Impl ;
    public final void rule__DOUBLE__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1396:1: ( rule__DOUBLE__Group_3__1__Impl )
            // InternalXDrone.g:1397:2: rule__DOUBLE__Group_3__1__Impl
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
    // InternalXDrone.g:1403:1: rule__DOUBLE__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1407:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1408:1: ( RULE_INT )
            {
            // InternalXDrone.g:1408:1: ( RULE_INT )
            // InternalXDrone.g:1409:2: RULE_INT
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


    // $ANTLR start "rule__Move__Group__0"
    // InternalXDrone.g:1419:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1423:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalXDrone.g:1424:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalXDrone.g:1431:1: rule__Move__Group__0__Impl : ( 'MOVE' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1435:1: ( ( 'MOVE' ) )
            // InternalXDrone.g:1436:1: ( 'MOVE' )
            {
            // InternalXDrone.g:1436:1: ( 'MOVE' )
            // InternalXDrone.g:1437:2: 'MOVE'
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
    // InternalXDrone.g:1446:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1450:1: ( rule__Move__Group__1__Impl )
            // InternalXDrone.g:1451:2: rule__Move__Group__1__Impl
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
    // InternalXDrone.g:1457:1: rule__Move__Group__1__Impl : ( ( rule__Move__VectorAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1461:1: ( ( ( rule__Move__VectorAssignment_1 ) ) )
            // InternalXDrone.g:1462:1: ( ( rule__Move__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:1462:1: ( ( rule__Move__VectorAssignment_1 ) )
            // InternalXDrone.g:1463:2: ( rule__Move__VectorAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:1464:2: ( rule__Move__VectorAssignment_1 )
            // InternalXDrone.g:1464:3: rule__Move__VectorAssignment_1
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
    // InternalXDrone.g:1473:1: rule__Rotate__Group__0 : rule__Rotate__Group__0__Impl rule__Rotate__Group__1 ;
    public final void rule__Rotate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1477:1: ( rule__Rotate__Group__0__Impl rule__Rotate__Group__1 )
            // InternalXDrone.g:1478:2: rule__Rotate__Group__0__Impl rule__Rotate__Group__1
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
    // InternalXDrone.g:1485:1: rule__Rotate__Group__0__Impl : ( 'ROTATE' ) ;
    public final void rule__Rotate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1489:1: ( ( 'ROTATE' ) )
            // InternalXDrone.g:1490:1: ( 'ROTATE' )
            {
            // InternalXDrone.g:1490:1: ( 'ROTATE' )
            // InternalXDrone.g:1491:2: 'ROTATE'
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
    // InternalXDrone.g:1500:1: rule__Rotate__Group__1 : rule__Rotate__Group__1__Impl rule__Rotate__Group__2 ;
    public final void rule__Rotate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1504:1: ( rule__Rotate__Group__1__Impl rule__Rotate__Group__2 )
            // InternalXDrone.g:1505:2: rule__Rotate__Group__1__Impl rule__Rotate__Group__2
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
    // InternalXDrone.g:1512:1: rule__Rotate__Group__1__Impl : ( '(' ) ;
    public final void rule__Rotate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1516:1: ( ( '(' ) )
            // InternalXDrone.g:1517:1: ( '(' )
            {
            // InternalXDrone.g:1517:1: ( '(' )
            // InternalXDrone.g:1518:2: '('
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
    // InternalXDrone.g:1527:1: rule__Rotate__Group__2 : rule__Rotate__Group__2__Impl rule__Rotate__Group__3 ;
    public final void rule__Rotate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1531:1: ( rule__Rotate__Group__2__Impl rule__Rotate__Group__3 )
            // InternalXDrone.g:1532:2: rule__Rotate__Group__2__Impl rule__Rotate__Group__3
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
    // InternalXDrone.g:1539:1: rule__Rotate__Group__2__Impl : ( ( rule__Rotate__AngleAssignment_2 ) ) ;
    public final void rule__Rotate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1543:1: ( ( ( rule__Rotate__AngleAssignment_2 ) ) )
            // InternalXDrone.g:1544:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:1544:1: ( ( rule__Rotate__AngleAssignment_2 ) )
            // InternalXDrone.g:1545:2: ( rule__Rotate__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:1546:2: ( rule__Rotate__AngleAssignment_2 )
            // InternalXDrone.g:1546:3: rule__Rotate__AngleAssignment_2
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
    // InternalXDrone.g:1554:1: rule__Rotate__Group__3 : rule__Rotate__Group__3__Impl ;
    public final void rule__Rotate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1558:1: ( rule__Rotate__Group__3__Impl )
            // InternalXDrone.g:1559:2: rule__Rotate__Group__3__Impl
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
    // InternalXDrone.g:1565:1: rule__Rotate__Group__3__Impl : ( ')' ) ;
    public final void rule__Rotate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1569:1: ( ( ')' ) )
            // InternalXDrone.g:1570:1: ( ')' )
            {
            // InternalXDrone.g:1570:1: ( ')' )
            // InternalXDrone.g:1571:2: ')'
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
    // InternalXDrone.g:1581:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1585:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:1586:2: rule__Up__Group__0__Impl rule__Up__Group__1
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
    // InternalXDrone.g:1593:1: rule__Up__Group__0__Impl : ( 'UP' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1597:1: ( ( 'UP' ) )
            // InternalXDrone.g:1598:1: ( 'UP' )
            {
            // InternalXDrone.g:1598:1: ( 'UP' )
            // InternalXDrone.g:1599:2: 'UP'
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
    // InternalXDrone.g:1608:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1612:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:1613:2: rule__Up__Group__1__Impl rule__Up__Group__2
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
    // InternalXDrone.g:1620:1: rule__Up__Group__1__Impl : ( '(' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1624:1: ( ( '(' ) )
            // InternalXDrone.g:1625:1: ( '(' )
            {
            // InternalXDrone.g:1625:1: ( '(' )
            // InternalXDrone.g:1626:2: '('
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
    // InternalXDrone.g:1635:1: rule__Up__Group__2 : rule__Up__Group__2__Impl rule__Up__Group__3 ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1639:1: ( rule__Up__Group__2__Impl rule__Up__Group__3 )
            // InternalXDrone.g:1640:2: rule__Up__Group__2__Impl rule__Up__Group__3
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
    // InternalXDrone.g:1647:1: rule__Up__Group__2__Impl : ( ( rule__Up__DistanceAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1651:1: ( ( ( rule__Up__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1652:1: ( ( rule__Up__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1652:1: ( ( rule__Up__DistanceAssignment_2 ) )
            // InternalXDrone.g:1653:2: ( rule__Up__DistanceAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1654:2: ( rule__Up__DistanceAssignment_2 )
            // InternalXDrone.g:1654:3: rule__Up__DistanceAssignment_2
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
    // InternalXDrone.g:1662:1: rule__Up__Group__3 : rule__Up__Group__3__Impl ;
    public final void rule__Up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1666:1: ( rule__Up__Group__3__Impl )
            // InternalXDrone.g:1667:2: rule__Up__Group__3__Impl
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
    // InternalXDrone.g:1673:1: rule__Up__Group__3__Impl : ( ')' ) ;
    public final void rule__Up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1677:1: ( ( ')' ) )
            // InternalXDrone.g:1678:1: ( ')' )
            {
            // InternalXDrone.g:1678:1: ( ')' )
            // InternalXDrone.g:1679:2: ')'
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
    // InternalXDrone.g:1689:1: rule__Down__Group__0 : rule__Down__Group__0__Impl rule__Down__Group__1 ;
    public final void rule__Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1693:1: ( rule__Down__Group__0__Impl rule__Down__Group__1 )
            // InternalXDrone.g:1694:2: rule__Down__Group__0__Impl rule__Down__Group__1
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
    // InternalXDrone.g:1701:1: rule__Down__Group__0__Impl : ( 'DOWN' ) ;
    public final void rule__Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1705:1: ( ( 'DOWN' ) )
            // InternalXDrone.g:1706:1: ( 'DOWN' )
            {
            // InternalXDrone.g:1706:1: ( 'DOWN' )
            // InternalXDrone.g:1707:2: 'DOWN'
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
    // InternalXDrone.g:1716:1: rule__Down__Group__1 : rule__Down__Group__1__Impl rule__Down__Group__2 ;
    public final void rule__Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1720:1: ( rule__Down__Group__1__Impl rule__Down__Group__2 )
            // InternalXDrone.g:1721:2: rule__Down__Group__1__Impl rule__Down__Group__2
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
    // InternalXDrone.g:1728:1: rule__Down__Group__1__Impl : ( '(' ) ;
    public final void rule__Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1732:1: ( ( '(' ) )
            // InternalXDrone.g:1733:1: ( '(' )
            {
            // InternalXDrone.g:1733:1: ( '(' )
            // InternalXDrone.g:1734:2: '('
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
    // InternalXDrone.g:1743:1: rule__Down__Group__2 : rule__Down__Group__2__Impl rule__Down__Group__3 ;
    public final void rule__Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1747:1: ( rule__Down__Group__2__Impl rule__Down__Group__3 )
            // InternalXDrone.g:1748:2: rule__Down__Group__2__Impl rule__Down__Group__3
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
    // InternalXDrone.g:1755:1: rule__Down__Group__2__Impl : ( ( rule__Down__DistanceAssignment_2 ) ) ;
    public final void rule__Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1759:1: ( ( ( rule__Down__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1760:1: ( ( rule__Down__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1760:1: ( ( rule__Down__DistanceAssignment_2 ) )
            // InternalXDrone.g:1761:2: ( rule__Down__DistanceAssignment_2 )
            {
             before(grammarAccess.getDownAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1762:2: ( rule__Down__DistanceAssignment_2 )
            // InternalXDrone.g:1762:3: rule__Down__DistanceAssignment_2
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
    // InternalXDrone.g:1770:1: rule__Down__Group__3 : rule__Down__Group__3__Impl ;
    public final void rule__Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1774:1: ( rule__Down__Group__3__Impl )
            // InternalXDrone.g:1775:2: rule__Down__Group__3__Impl
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
    // InternalXDrone.g:1781:1: rule__Down__Group__3__Impl : ( ')' ) ;
    public final void rule__Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1785:1: ( ( ')' ) )
            // InternalXDrone.g:1786:1: ( ')' )
            {
            // InternalXDrone.g:1786:1: ( ')' )
            // InternalXDrone.g:1787:2: ')'
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
    // InternalXDrone.g:1797:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1801:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:1802:2: rule__Left__Group__0__Impl rule__Left__Group__1
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
    // InternalXDrone.g:1809:1: rule__Left__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1813:1: ( ( 'LEFT' ) )
            // InternalXDrone.g:1814:1: ( 'LEFT' )
            {
            // InternalXDrone.g:1814:1: ( 'LEFT' )
            // InternalXDrone.g:1815:2: 'LEFT'
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
    // InternalXDrone.g:1824:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1828:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:1829:2: rule__Left__Group__1__Impl rule__Left__Group__2
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
    // InternalXDrone.g:1836:1: rule__Left__Group__1__Impl : ( '(' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1840:1: ( ( '(' ) )
            // InternalXDrone.g:1841:1: ( '(' )
            {
            // InternalXDrone.g:1841:1: ( '(' )
            // InternalXDrone.g:1842:2: '('
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
    // InternalXDrone.g:1851:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1855:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // InternalXDrone.g:1856:2: rule__Left__Group__2__Impl rule__Left__Group__3
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
    // InternalXDrone.g:1863:1: rule__Left__Group__2__Impl : ( ( rule__Left__DistanceAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1867:1: ( ( ( rule__Left__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1868:1: ( ( rule__Left__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1868:1: ( ( rule__Left__DistanceAssignment_2 ) )
            // InternalXDrone.g:1869:2: ( rule__Left__DistanceAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1870:2: ( rule__Left__DistanceAssignment_2 )
            // InternalXDrone.g:1870:3: rule__Left__DistanceAssignment_2
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
    // InternalXDrone.g:1878:1: rule__Left__Group__3 : rule__Left__Group__3__Impl ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1882:1: ( rule__Left__Group__3__Impl )
            // InternalXDrone.g:1883:2: rule__Left__Group__3__Impl
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
    // InternalXDrone.g:1889:1: rule__Left__Group__3__Impl : ( ')' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1893:1: ( ( ')' ) )
            // InternalXDrone.g:1894:1: ( ')' )
            {
            // InternalXDrone.g:1894:1: ( ')' )
            // InternalXDrone.g:1895:2: ')'
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
    // InternalXDrone.g:1905:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1909:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:1910:2: rule__Right__Group__0__Impl rule__Right__Group__1
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
    // InternalXDrone.g:1917:1: rule__Right__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1921:1: ( ( 'RIGHT' ) )
            // InternalXDrone.g:1922:1: ( 'RIGHT' )
            {
            // InternalXDrone.g:1922:1: ( 'RIGHT' )
            // InternalXDrone.g:1923:2: 'RIGHT'
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
    // InternalXDrone.g:1932:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1936:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:1937:2: rule__Right__Group__1__Impl rule__Right__Group__2
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
    // InternalXDrone.g:1944:1: rule__Right__Group__1__Impl : ( '(' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1948:1: ( ( '(' ) )
            // InternalXDrone.g:1949:1: ( '(' )
            {
            // InternalXDrone.g:1949:1: ( '(' )
            // InternalXDrone.g:1950:2: '('
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
    // InternalXDrone.g:1959:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1963:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalXDrone.g:1964:2: rule__Right__Group__2__Impl rule__Right__Group__3
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
    // InternalXDrone.g:1971:1: rule__Right__Group__2__Impl : ( ( rule__Right__DistanceAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1975:1: ( ( ( rule__Right__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:1976:1: ( ( rule__Right__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:1976:1: ( ( rule__Right__DistanceAssignment_2 ) )
            // InternalXDrone.g:1977:2: ( rule__Right__DistanceAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:1978:2: ( rule__Right__DistanceAssignment_2 )
            // InternalXDrone.g:1978:3: rule__Right__DistanceAssignment_2
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
    // InternalXDrone.g:1986:1: rule__Right__Group__3 : rule__Right__Group__3__Impl ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1990:1: ( rule__Right__Group__3__Impl )
            // InternalXDrone.g:1991:2: rule__Right__Group__3__Impl
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
    // InternalXDrone.g:1997:1: rule__Right__Group__3__Impl : ( ')' ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2001:1: ( ( ')' ) )
            // InternalXDrone.g:2002:1: ( ')' )
            {
            // InternalXDrone.g:2002:1: ( ')' )
            // InternalXDrone.g:2003:2: ')'
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
    // InternalXDrone.g:2013:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2017:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalXDrone.g:2018:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
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
    // InternalXDrone.g:2025:1: rule__Forward__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2029:1: ( ( 'FORWARD' ) )
            // InternalXDrone.g:2030:1: ( 'FORWARD' )
            {
            // InternalXDrone.g:2030:1: ( 'FORWARD' )
            // InternalXDrone.g:2031:2: 'FORWARD'
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
    // InternalXDrone.g:2040:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2044:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalXDrone.g:2045:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
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
    // InternalXDrone.g:2052:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2056:1: ( ( '(' ) )
            // InternalXDrone.g:2057:1: ( '(' )
            {
            // InternalXDrone.g:2057:1: ( '(' )
            // InternalXDrone.g:2058:2: '('
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
    // InternalXDrone.g:2067:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2071:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalXDrone.g:2072:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
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
    // InternalXDrone.g:2079:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2083:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2084:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2084:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2085:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2086:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalXDrone.g:2086:3: rule__Forward__DistanceAssignment_2
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
    // InternalXDrone.g:2094:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2098:1: ( rule__Forward__Group__3__Impl )
            // InternalXDrone.g:2099:2: rule__Forward__Group__3__Impl
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
    // InternalXDrone.g:2105:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2109:1: ( ( ')' ) )
            // InternalXDrone.g:2110:1: ( ')' )
            {
            // InternalXDrone.g:2110:1: ( ')' )
            // InternalXDrone.g:2111:2: ')'
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
    // InternalXDrone.g:2121:1: rule__Backward__Group__0 : rule__Backward__Group__0__Impl rule__Backward__Group__1 ;
    public final void rule__Backward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2125:1: ( rule__Backward__Group__0__Impl rule__Backward__Group__1 )
            // InternalXDrone.g:2126:2: rule__Backward__Group__0__Impl rule__Backward__Group__1
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
    // InternalXDrone.g:2133:1: rule__Backward__Group__0__Impl : ( 'BACKWARD' ) ;
    public final void rule__Backward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2137:1: ( ( 'BACKWARD' ) )
            // InternalXDrone.g:2138:1: ( 'BACKWARD' )
            {
            // InternalXDrone.g:2138:1: ( 'BACKWARD' )
            // InternalXDrone.g:2139:2: 'BACKWARD'
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
    // InternalXDrone.g:2148:1: rule__Backward__Group__1 : rule__Backward__Group__1__Impl rule__Backward__Group__2 ;
    public final void rule__Backward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2152:1: ( rule__Backward__Group__1__Impl rule__Backward__Group__2 )
            // InternalXDrone.g:2153:2: rule__Backward__Group__1__Impl rule__Backward__Group__2
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
    // InternalXDrone.g:2160:1: rule__Backward__Group__1__Impl : ( '(' ) ;
    public final void rule__Backward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2164:1: ( ( '(' ) )
            // InternalXDrone.g:2165:1: ( '(' )
            {
            // InternalXDrone.g:2165:1: ( '(' )
            // InternalXDrone.g:2166:2: '('
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
    // InternalXDrone.g:2175:1: rule__Backward__Group__2 : rule__Backward__Group__2__Impl rule__Backward__Group__3 ;
    public final void rule__Backward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2179:1: ( rule__Backward__Group__2__Impl rule__Backward__Group__3 )
            // InternalXDrone.g:2180:2: rule__Backward__Group__2__Impl rule__Backward__Group__3
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
    // InternalXDrone.g:2187:1: rule__Backward__Group__2__Impl : ( ( rule__Backward__DistanceAssignment_2 ) ) ;
    public final void rule__Backward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2191:1: ( ( ( rule__Backward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2192:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2192:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2193:2: ( rule__Backward__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2194:2: ( rule__Backward__DistanceAssignment_2 )
            // InternalXDrone.g:2194:3: rule__Backward__DistanceAssignment_2
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
    // InternalXDrone.g:2202:1: rule__Backward__Group__3 : rule__Backward__Group__3__Impl ;
    public final void rule__Backward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2206:1: ( rule__Backward__Group__3__Impl )
            // InternalXDrone.g:2207:2: rule__Backward__Group__3__Impl
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
    // InternalXDrone.g:2213:1: rule__Backward__Group__3__Impl : ( ')' ) ;
    public final void rule__Backward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2217:1: ( ( ')' ) )
            // InternalXDrone.g:2218:1: ( ')' )
            {
            // InternalXDrone.g:2218:1: ( ')' )
            // InternalXDrone.g:2219:2: ')'
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
    // InternalXDrone.g:2229:1: rule__RotateL__Group__0 : rule__RotateL__Group__0__Impl rule__RotateL__Group__1 ;
    public final void rule__RotateL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2233:1: ( rule__RotateL__Group__0__Impl rule__RotateL__Group__1 )
            // InternalXDrone.g:2234:2: rule__RotateL__Group__0__Impl rule__RotateL__Group__1
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
    // InternalXDrone.g:2241:1: rule__RotateL__Group__0__Impl : ( 'ROTATELEFT' ) ;
    public final void rule__RotateL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2245:1: ( ( 'ROTATELEFT' ) )
            // InternalXDrone.g:2246:1: ( 'ROTATELEFT' )
            {
            // InternalXDrone.g:2246:1: ( 'ROTATELEFT' )
            // InternalXDrone.g:2247:2: 'ROTATELEFT'
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
    // InternalXDrone.g:2256:1: rule__RotateL__Group__1 : rule__RotateL__Group__1__Impl rule__RotateL__Group__2 ;
    public final void rule__RotateL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2260:1: ( rule__RotateL__Group__1__Impl rule__RotateL__Group__2 )
            // InternalXDrone.g:2261:2: rule__RotateL__Group__1__Impl rule__RotateL__Group__2
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
    // InternalXDrone.g:2268:1: rule__RotateL__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2272:1: ( ( '(' ) )
            // InternalXDrone.g:2273:1: ( '(' )
            {
            // InternalXDrone.g:2273:1: ( '(' )
            // InternalXDrone.g:2274:2: '('
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
    // InternalXDrone.g:2283:1: rule__RotateL__Group__2 : rule__RotateL__Group__2__Impl rule__RotateL__Group__3 ;
    public final void rule__RotateL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2287:1: ( rule__RotateL__Group__2__Impl rule__RotateL__Group__3 )
            // InternalXDrone.g:2288:2: rule__RotateL__Group__2__Impl rule__RotateL__Group__3
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
    // InternalXDrone.g:2295:1: rule__RotateL__Group__2__Impl : ( ( rule__RotateL__AngleAssignment_2 ) ) ;
    public final void rule__RotateL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2299:1: ( ( ( rule__RotateL__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2300:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2300:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            // InternalXDrone.g:2301:2: ( rule__RotateL__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2302:2: ( rule__RotateL__AngleAssignment_2 )
            // InternalXDrone.g:2302:3: rule__RotateL__AngleAssignment_2
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
    // InternalXDrone.g:2310:1: rule__RotateL__Group__3 : rule__RotateL__Group__3__Impl ;
    public final void rule__RotateL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2314:1: ( rule__RotateL__Group__3__Impl )
            // InternalXDrone.g:2315:2: rule__RotateL__Group__3__Impl
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
    // InternalXDrone.g:2321:1: rule__RotateL__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2325:1: ( ( ')' ) )
            // InternalXDrone.g:2326:1: ( ')' )
            {
            // InternalXDrone.g:2326:1: ( ')' )
            // InternalXDrone.g:2327:2: ')'
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
    // InternalXDrone.g:2337:1: rule__RotateR__Group__0 : rule__RotateR__Group__0__Impl rule__RotateR__Group__1 ;
    public final void rule__RotateR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2341:1: ( rule__RotateR__Group__0__Impl rule__RotateR__Group__1 )
            // InternalXDrone.g:2342:2: rule__RotateR__Group__0__Impl rule__RotateR__Group__1
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
    // InternalXDrone.g:2349:1: rule__RotateR__Group__0__Impl : ( 'ROTATERIGHT' ) ;
    public final void rule__RotateR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2353:1: ( ( 'ROTATERIGHT' ) )
            // InternalXDrone.g:2354:1: ( 'ROTATERIGHT' )
            {
            // InternalXDrone.g:2354:1: ( 'ROTATERIGHT' )
            // InternalXDrone.g:2355:2: 'ROTATERIGHT'
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
    // InternalXDrone.g:2364:1: rule__RotateR__Group__1 : rule__RotateR__Group__1__Impl rule__RotateR__Group__2 ;
    public final void rule__RotateR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2368:1: ( rule__RotateR__Group__1__Impl rule__RotateR__Group__2 )
            // InternalXDrone.g:2369:2: rule__RotateR__Group__1__Impl rule__RotateR__Group__2
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
    // InternalXDrone.g:2376:1: rule__RotateR__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2380:1: ( ( '(' ) )
            // InternalXDrone.g:2381:1: ( '(' )
            {
            // InternalXDrone.g:2381:1: ( '(' )
            // InternalXDrone.g:2382:2: '('
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
    // InternalXDrone.g:2391:1: rule__RotateR__Group__2 : rule__RotateR__Group__2__Impl rule__RotateR__Group__3 ;
    public final void rule__RotateR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2395:1: ( rule__RotateR__Group__2__Impl rule__RotateR__Group__3 )
            // InternalXDrone.g:2396:2: rule__RotateR__Group__2__Impl rule__RotateR__Group__3
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
    // InternalXDrone.g:2403:1: rule__RotateR__Group__2__Impl : ( ( rule__RotateR__AngleAssignment_2 ) ) ;
    public final void rule__RotateR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2407:1: ( ( ( rule__RotateR__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2408:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2408:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            // InternalXDrone.g:2409:2: ( rule__RotateR__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2410:2: ( rule__RotateR__AngleAssignment_2 )
            // InternalXDrone.g:2410:3: rule__RotateR__AngleAssignment_2
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
    // InternalXDrone.g:2418:1: rule__RotateR__Group__3 : rule__RotateR__Group__3__Impl ;
    public final void rule__RotateR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2422:1: ( rule__RotateR__Group__3__Impl )
            // InternalXDrone.g:2423:2: rule__RotateR__Group__3__Impl
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
    // InternalXDrone.g:2429:1: rule__RotateR__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2433:1: ( ( ')' ) )
            // InternalXDrone.g:2434:1: ( ')' )
            {
            // InternalXDrone.g:2434:1: ( ')' )
            // InternalXDrone.g:2435:2: ')'
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
    // InternalXDrone.g:2445:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2449:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:2450:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
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
    // InternalXDrone.g:2457:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2461:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:2462:1: ( 'WAIT' )
            {
            // InternalXDrone.g:2462:1: ( 'WAIT' )
            // InternalXDrone.g:2463:2: 'WAIT'
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
    // InternalXDrone.g:2472:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2476:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:2477:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
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
    // InternalXDrone.g:2484:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2488:1: ( ( '(' ) )
            // InternalXDrone.g:2489:1: ( '(' )
            {
            // InternalXDrone.g:2489:1: ( '(' )
            // InternalXDrone.g:2490:2: '('
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
    // InternalXDrone.g:2499:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2503:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:2504:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
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
    // InternalXDrone.g:2511:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2515:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:2516:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:2516:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:2517:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:2518:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:2518:3: rule__Wait__SecondsAssignment_2
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
    // InternalXDrone.g:2526:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2530:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:2531:2: rule__Wait__Group__3__Impl
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
    // InternalXDrone.g:2537:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2541:1: ( ( ')' ) )
            // InternalXDrone.g:2542:1: ( ')' )
            {
            // InternalXDrone.g:2542:1: ( ')' )
            // InternalXDrone.g:2543:2: ')'
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
    // InternalXDrone.g:2553:1: rule__FunctionName__Group__0 : rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 ;
    public final void rule__FunctionName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2557:1: ( rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1 )
            // InternalXDrone.g:2558:2: rule__FunctionName__Group__0__Impl rule__FunctionName__Group__1
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
    // InternalXDrone.g:2565:1: rule__FunctionName__Group__0__Impl : ( ( rule__FunctionName__Func_nameAssignment_0 ) ) ;
    public final void rule__FunctionName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2569:1: ( ( ( rule__FunctionName__Func_nameAssignment_0 ) ) )
            // InternalXDrone.g:2570:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            {
            // InternalXDrone.g:2570:1: ( ( rule__FunctionName__Func_nameAssignment_0 ) )
            // InternalXDrone.g:2571:2: ( rule__FunctionName__Func_nameAssignment_0 )
            {
             before(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0()); 
            // InternalXDrone.g:2572:2: ( rule__FunctionName__Func_nameAssignment_0 )
            // InternalXDrone.g:2572:3: rule__FunctionName__Func_nameAssignment_0
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
    // InternalXDrone.g:2580:1: rule__FunctionName__Group__1 : rule__FunctionName__Group__1__Impl ;
    public final void rule__FunctionName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2584:1: ( rule__FunctionName__Group__1__Impl )
            // InternalXDrone.g:2585:2: rule__FunctionName__Group__1__Impl
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
    // InternalXDrone.g:2591:1: rule__FunctionName__Group__1__Impl : ( '()' ) ;
    public final void rule__FunctionName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2595:1: ( ( '()' ) )
            // InternalXDrone.g:2596:1: ( '()' )
            {
            // InternalXDrone.g:2596:1: ( '()' )
            // InternalXDrone.g:2597:2: '()'
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
    // InternalXDrone.g:2607:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2611:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:2612:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
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
    // InternalXDrone.g:2619:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2623:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:2624:1: ( 'DRONE' )
            {
            // InternalXDrone.g:2624:1: ( 'DRONE' )
            // InternalXDrone.g:2625:2: 'DRONE'
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
    // InternalXDrone.g:2634:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2638:1: ( rule__Drone__Group__1__Impl )
            // InternalXDrone.g:2639:2: rule__Drone__Group__1__Impl
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
    // InternalXDrone.g:2645:1: rule__Drone__Group__1__Impl : ( ( rule__Drone__VectorAssignment_1 ) ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2649:1: ( ( ( rule__Drone__VectorAssignment_1 ) ) )
            // InternalXDrone.g:2650:1: ( ( rule__Drone__VectorAssignment_1 ) )
            {
            // InternalXDrone.g:2650:1: ( ( rule__Drone__VectorAssignment_1 ) )
            // InternalXDrone.g:2651:2: ( rule__Drone__VectorAssignment_1 )
            {
             before(grammarAccess.getDroneAccess().getVectorAssignment_1()); 
            // InternalXDrone.g:2652:2: ( rule__Drone__VectorAssignment_1 )
            // InternalXDrone.g:2652:3: rule__Drone__VectorAssignment_1
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
    // InternalXDrone.g:2661:1: rule__Object__Group_0__0 : rule__Object__Group_0__0__Impl rule__Object__Group_0__1 ;
    public final void rule__Object__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2665:1: ( rule__Object__Group_0__0__Impl rule__Object__Group_0__1 )
            // InternalXDrone.g:2666:2: rule__Object__Group_0__0__Impl rule__Object__Group_0__1
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
    // InternalXDrone.g:2673:1: rule__Object__Group_0__0__Impl : ( ( rule__Object__Object_nameAssignment_0_0 ) ) ;
    public final void rule__Object__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2677:1: ( ( ( rule__Object__Object_nameAssignment_0_0 ) ) )
            // InternalXDrone.g:2678:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            {
            // InternalXDrone.g:2678:1: ( ( rule__Object__Object_nameAssignment_0_0 ) )
            // InternalXDrone.g:2679:2: ( rule__Object__Object_nameAssignment_0_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0_0()); 
            // InternalXDrone.g:2680:2: ( rule__Object__Object_nameAssignment_0_0 )
            // InternalXDrone.g:2680:3: rule__Object__Object_nameAssignment_0_0
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
    // InternalXDrone.g:2688:1: rule__Object__Group_0__1 : rule__Object__Group_0__1__Impl rule__Object__Group_0__2 ;
    public final void rule__Object__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2692:1: ( rule__Object__Group_0__1__Impl rule__Object__Group_0__2 )
            // InternalXDrone.g:2693:2: rule__Object__Group_0__1__Impl rule__Object__Group_0__2
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
    // InternalXDrone.g:2700:1: rule__Object__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Object__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2704:1: ( ( '{' ) )
            // InternalXDrone.g:2705:1: ( '{' )
            {
            // InternalXDrone.g:2705:1: ( '{' )
            // InternalXDrone.g:2706:2: '{'
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
    // InternalXDrone.g:2715:1: rule__Object__Group_0__2 : rule__Object__Group_0__2__Impl ;
    public final void rule__Object__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2719:1: ( rule__Object__Group_0__2__Impl )
            // InternalXDrone.g:2720:2: rule__Object__Group_0__2__Impl
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
    // InternalXDrone.g:2726:1: rule__Object__Group_0__2__Impl : ( ( rule__Object__OriginAssignment_0_2 ) ) ;
    public final void rule__Object__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2730:1: ( ( ( rule__Object__OriginAssignment_0_2 ) ) )
            // InternalXDrone.g:2731:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            {
            // InternalXDrone.g:2731:1: ( ( rule__Object__OriginAssignment_0_2 ) )
            // InternalXDrone.g:2732:2: ( rule__Object__OriginAssignment_0_2 )
            {
             before(grammarAccess.getObjectAccess().getOriginAssignment_0_2()); 
            // InternalXDrone.g:2733:2: ( rule__Object__OriginAssignment_0_2 )
            // InternalXDrone.g:2733:3: rule__Object__OriginAssignment_0_2
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
    // InternalXDrone.g:2742:1: rule__Object__Group_2__0 : rule__Object__Group_2__0__Impl rule__Object__Group_2__1 ;
    public final void rule__Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2746:1: ( rule__Object__Group_2__0__Impl rule__Object__Group_2__1 )
            // InternalXDrone.g:2747:2: rule__Object__Group_2__0__Impl rule__Object__Group_2__1
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
    // InternalXDrone.g:2754:1: rule__Object__Group_2__0__Impl : ( ( rule__Object__ColorAssignment_2_0 )? ) ;
    public final void rule__Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2758:1: ( ( ( rule__Object__ColorAssignment_2_0 )? ) )
            // InternalXDrone.g:2759:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            {
            // InternalXDrone.g:2759:1: ( ( rule__Object__ColorAssignment_2_0 )? )
            // InternalXDrone.g:2760:2: ( rule__Object__ColorAssignment_2_0 )?
            {
             before(grammarAccess.getObjectAccess().getColorAssignment_2_0()); 
            // InternalXDrone.g:2761:2: ( rule__Object__ColorAssignment_2_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXDrone.g:2761:3: rule__Object__ColorAssignment_2_0
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
    // InternalXDrone.g:2769:1: rule__Object__Group_2__1 : rule__Object__Group_2__1__Impl ;
    public final void rule__Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2773:1: ( rule__Object__Group_2__1__Impl )
            // InternalXDrone.g:2774:2: rule__Object__Group_2__1__Impl
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
    // InternalXDrone.g:2780:1: rule__Object__Group_2__1__Impl : ( '}' ) ;
    public final void rule__Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2784:1: ( ( '}' ) )
            // InternalXDrone.g:2785:1: ( '}' )
            {
            // InternalXDrone.g:2785:1: ( '}' )
            // InternalXDrone.g:2786:2: '}'
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
    // InternalXDrone.g:2796:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2800:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalXDrone.g:2801:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
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
    // InternalXDrone.g:2808:1: rule__Origin__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2812:1: ( ( 'origin' ) )
            // InternalXDrone.g:2813:1: ( 'origin' )
            {
            // InternalXDrone.g:2813:1: ( 'origin' )
            // InternalXDrone.g:2814:2: 'origin'
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
    // InternalXDrone.g:2823:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2827:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalXDrone.g:2828:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
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
    // InternalXDrone.g:2835:1: rule__Origin__Group__1__Impl : ( '=' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2839:1: ( ( '=' ) )
            // InternalXDrone.g:2840:1: ( '=' )
            {
            // InternalXDrone.g:2840:1: ( '=' )
            // InternalXDrone.g:2841:2: '='
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
    // InternalXDrone.g:2850:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2854:1: ( rule__Origin__Group__2__Impl )
            // InternalXDrone.g:2855:2: rule__Origin__Group__2__Impl
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
    // InternalXDrone.g:2861:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__VectorAssignment_2 ) ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2865:1: ( ( ( rule__Origin__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2866:1: ( ( rule__Origin__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2866:1: ( ( rule__Origin__VectorAssignment_2 ) )
            // InternalXDrone.g:2867:2: ( rule__Origin__VectorAssignment_2 )
            {
             before(grammarAccess.getOriginAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2868:2: ( rule__Origin__VectorAssignment_2 )
            // InternalXDrone.g:2868:3: rule__Origin__VectorAssignment_2
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
    // InternalXDrone.g:2877:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2881:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalXDrone.g:2882:2: rule__Size__Group__0__Impl rule__Size__Group__1
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
    // InternalXDrone.g:2889:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2893:1: ( ( 'size' ) )
            // InternalXDrone.g:2894:1: ( 'size' )
            {
            // InternalXDrone.g:2894:1: ( 'size' )
            // InternalXDrone.g:2895:2: 'size'
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
    // InternalXDrone.g:2904:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2908:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalXDrone.g:2909:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalXDrone.g:2916:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2920:1: ( ( '=' ) )
            // InternalXDrone.g:2921:1: ( '=' )
            {
            // InternalXDrone.g:2921:1: ( '=' )
            // InternalXDrone.g:2922:2: '='
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
    // InternalXDrone.g:2931:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2935:1: ( rule__Size__Group__2__Impl )
            // InternalXDrone.g:2936:2: rule__Size__Group__2__Impl
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
    // InternalXDrone.g:2942:1: rule__Size__Group__2__Impl : ( ( rule__Size__VectorAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2946:1: ( ( ( rule__Size__VectorAssignment_2 ) ) )
            // InternalXDrone.g:2947:1: ( ( rule__Size__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:2947:1: ( ( rule__Size__VectorAssignment_2 ) )
            // InternalXDrone.g:2948:2: ( rule__Size__VectorAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:2949:2: ( rule__Size__VectorAssignment_2 )
            // InternalXDrone.g:2949:3: rule__Size__VectorAssignment_2
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
    // InternalXDrone.g:2958:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2962:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // InternalXDrone.g:2963:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
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
    // InternalXDrone.g:2970:1: rule__Vector__Group__0__Impl : ( '(' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2974:1: ( ( '(' ) )
            // InternalXDrone.g:2975:1: ( '(' )
            {
            // InternalXDrone.g:2975:1: ( '(' )
            // InternalXDrone.g:2976:2: '('
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
    // InternalXDrone.g:2985:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2989:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // InternalXDrone.g:2990:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
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
    // InternalXDrone.g:2997:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3001:1: ( ( ( rule__Vector__XAssignment_1 ) ) )
            // InternalXDrone.g:3002:1: ( ( rule__Vector__XAssignment_1 ) )
            {
            // InternalXDrone.g:3002:1: ( ( rule__Vector__XAssignment_1 ) )
            // InternalXDrone.g:3003:2: ( rule__Vector__XAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getXAssignment_1()); 
            // InternalXDrone.g:3004:2: ( rule__Vector__XAssignment_1 )
            // InternalXDrone.g:3004:3: rule__Vector__XAssignment_1
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
    // InternalXDrone.g:3012:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3016:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // InternalXDrone.g:3017:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
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
    // InternalXDrone.g:3024:1: rule__Vector__Group__2__Impl : ( ',' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3028:1: ( ( ',' ) )
            // InternalXDrone.g:3029:1: ( ',' )
            {
            // InternalXDrone.g:3029:1: ( ',' )
            // InternalXDrone.g:3030:2: ','
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
    // InternalXDrone.g:3039:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3043:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // InternalXDrone.g:3044:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
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
    // InternalXDrone.g:3051:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__YAssignment_3 ) ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3055:1: ( ( ( rule__Vector__YAssignment_3 ) ) )
            // InternalXDrone.g:3056:1: ( ( rule__Vector__YAssignment_3 ) )
            {
            // InternalXDrone.g:3056:1: ( ( rule__Vector__YAssignment_3 ) )
            // InternalXDrone.g:3057:2: ( rule__Vector__YAssignment_3 )
            {
             before(grammarAccess.getVectorAccess().getYAssignment_3()); 
            // InternalXDrone.g:3058:2: ( rule__Vector__YAssignment_3 )
            // InternalXDrone.g:3058:3: rule__Vector__YAssignment_3
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
    // InternalXDrone.g:3066:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl rule__Vector__Group__5 ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3070:1: ( rule__Vector__Group__4__Impl rule__Vector__Group__5 )
            // InternalXDrone.g:3071:2: rule__Vector__Group__4__Impl rule__Vector__Group__5
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
    // InternalXDrone.g:3078:1: rule__Vector__Group__4__Impl : ( ',' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3082:1: ( ( ',' ) )
            // InternalXDrone.g:3083:1: ( ',' )
            {
            // InternalXDrone.g:3083:1: ( ',' )
            // InternalXDrone.g:3084:2: ','
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
    // InternalXDrone.g:3093:1: rule__Vector__Group__5 : rule__Vector__Group__5__Impl rule__Vector__Group__6 ;
    public final void rule__Vector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3097:1: ( rule__Vector__Group__5__Impl rule__Vector__Group__6 )
            // InternalXDrone.g:3098:2: rule__Vector__Group__5__Impl rule__Vector__Group__6
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
    // InternalXDrone.g:3105:1: rule__Vector__Group__5__Impl : ( ( rule__Vector__ZAssignment_5 ) ) ;
    public final void rule__Vector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3109:1: ( ( ( rule__Vector__ZAssignment_5 ) ) )
            // InternalXDrone.g:3110:1: ( ( rule__Vector__ZAssignment_5 ) )
            {
            // InternalXDrone.g:3110:1: ( ( rule__Vector__ZAssignment_5 ) )
            // InternalXDrone.g:3111:2: ( rule__Vector__ZAssignment_5 )
            {
             before(grammarAccess.getVectorAccess().getZAssignment_5()); 
            // InternalXDrone.g:3112:2: ( rule__Vector__ZAssignment_5 )
            // InternalXDrone.g:3112:3: rule__Vector__ZAssignment_5
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
    // InternalXDrone.g:3120:1: rule__Vector__Group__6 : rule__Vector__Group__6__Impl ;
    public final void rule__Vector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3124:1: ( rule__Vector__Group__6__Impl )
            // InternalXDrone.g:3125:2: rule__Vector__Group__6__Impl
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
    // InternalXDrone.g:3131:1: rule__Vector__Group__6__Impl : ( ')' ) ;
    public final void rule__Vector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3135:1: ( ( ')' ) )
            // InternalXDrone.g:3136:1: ( ')' )
            {
            // InternalXDrone.g:3136:1: ( ')' )
            // InternalXDrone.g:3137:2: ')'
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
    // InternalXDrone.g:3147:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3151:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalXDrone.g:3152:2: rule__Color__Group__0__Impl rule__Color__Group__1
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
    // InternalXDrone.g:3159:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3163:1: ( ( 'color' ) )
            // InternalXDrone.g:3164:1: ( 'color' )
            {
            // InternalXDrone.g:3164:1: ( 'color' )
            // InternalXDrone.g:3165:2: 'color'
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
    // InternalXDrone.g:3174:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3178:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalXDrone.g:3179:2: rule__Color__Group__1__Impl rule__Color__Group__2
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
    // InternalXDrone.g:3186:1: rule__Color__Group__1__Impl : ( '=' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3190:1: ( ( '=' ) )
            // InternalXDrone.g:3191:1: ( '=' )
            {
            // InternalXDrone.g:3191:1: ( '=' )
            // InternalXDrone.g:3192:2: '='
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
    // InternalXDrone.g:3201:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3205:1: ( rule__Color__Group__2__Impl )
            // InternalXDrone.g:3206:2: rule__Color__Group__2__Impl
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
    // InternalXDrone.g:3212:1: rule__Color__Group__2__Impl : ( ( rule__Color__Color_valueAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3216:1: ( ( ( rule__Color__Color_valueAssignment_2 ) ) )
            // InternalXDrone.g:3217:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            {
            // InternalXDrone.g:3217:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            // InternalXDrone.g:3218:2: ( rule__Color__Color_valueAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 
            // InternalXDrone.g:3219:2: ( rule__Color__Color_valueAssignment_2 )
            // InternalXDrone.g:3219:3: rule__Color__Color_valueAssignment_2
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


    // $ANTLR start "rule__Object__UnorderedGroup"
    // InternalXDrone.g:3228:1: rule__Object__UnorderedGroup : rule__Object__UnorderedGroup__0 {...}?;
    public final void rule__Object__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup());
        	
        try {
            // InternalXDrone.g:3233:1: ( rule__Object__UnorderedGroup__0 {...}?)
            // InternalXDrone.g:3234:2: rule__Object__UnorderedGroup__0 {...}?
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
    // InternalXDrone.g:3242:1: rule__Object__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) ;
    public final void rule__Object__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalXDrone.g:3247:1: ( ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) ) )
            // InternalXDrone.g:3248:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            {
            // InternalXDrone.g:3248:3: ( ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                alt8=2;
            }
            else if ( ( LA8_0 == 14 || LA8_0 == 38 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXDrone.g:3249:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    {
                    // InternalXDrone.g:3249:3: ({...}? => ( ( ( rule__Object__Group_0__0 ) ) ) )
                    // InternalXDrone.g:3250:4: {...}? => ( ( ( rule__Object__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalXDrone.g:3250:100: ( ( ( rule__Object__Group_0__0 ) ) )
                    // InternalXDrone.g:3251:5: ( ( rule__Object__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3257:5: ( ( rule__Object__Group_0__0 ) )
                    // InternalXDrone.g:3258:6: ( rule__Object__Group_0__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_0()); 
                    // InternalXDrone.g:3259:6: ( rule__Object__Group_0__0 )
                    // InternalXDrone.g:3259:7: rule__Object__Group_0__0
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
                    // InternalXDrone.g:3264:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    {
                    // InternalXDrone.g:3264:3: ({...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) ) )
                    // InternalXDrone.g:3265:4: {...}? => ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalXDrone.g:3265:100: ( ( ( rule__Object__SizeAssignment_1 ) ) )
                    // InternalXDrone.g:3266:5: ( ( rule__Object__SizeAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3272:5: ( ( rule__Object__SizeAssignment_1 ) )
                    // InternalXDrone.g:3273:6: ( rule__Object__SizeAssignment_1 )
                    {
                     before(grammarAccess.getObjectAccess().getSizeAssignment_1()); 
                    // InternalXDrone.g:3274:6: ( rule__Object__SizeAssignment_1 )
                    // InternalXDrone.g:3274:7: rule__Object__SizeAssignment_1
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
                    // InternalXDrone.g:3279:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    {
                    // InternalXDrone.g:3279:3: ({...}? => ( ( ( rule__Object__Group_2__0 ) ) ) )
                    // InternalXDrone.g:3280:4: {...}? => ( ( ( rule__Object__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Object__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalXDrone.g:3280:100: ( ( ( rule__Object__Group_2__0 ) ) )
                    // InternalXDrone.g:3281:5: ( ( rule__Object__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalXDrone.g:3287:5: ( ( rule__Object__Group_2__0 ) )
                    // InternalXDrone.g:3288:6: ( rule__Object__Group_2__0 )
                    {
                     before(grammarAccess.getObjectAccess().getGroup_2()); 
                    // InternalXDrone.g:3289:6: ( rule__Object__Group_2__0 )
                    // InternalXDrone.g:3289:7: rule__Object__Group_2__0
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
    // InternalXDrone.g:3302:1: rule__Object__UnorderedGroup__0 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? ;
    public final void rule__Object__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3306:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )? )
            // InternalXDrone.g:3307:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3308:2: ( rule__Object__UnorderedGroup__1 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalXDrone.g:3308:2: rule__Object__UnorderedGroup__1
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
    // InternalXDrone.g:3314:1: rule__Object__UnorderedGroup__1 : rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? ;
    public final void rule__Object__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3318:1: ( rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )? )
            // InternalXDrone.g:3319:2: rule__Object__UnorderedGroup__Impl ( rule__Object__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_9);
            rule__Object__UnorderedGroup__Impl();

            state._fsp--;

            // InternalXDrone.g:3320:2: ( rule__Object__UnorderedGroup__2 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalXDrone.g:3320:2: rule__Object__UnorderedGroup__2
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
    // InternalXDrone.g:3326:1: rule__Object__UnorderedGroup__2 : rule__Object__UnorderedGroup__Impl ;
    public final void rule__Object__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3330:1: ( rule__Object__UnorderedGroup__Impl )
            // InternalXDrone.g:3331:2: rule__Object__UnorderedGroup__Impl
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


    // $ANTLR start "rule__Program__FlyAssignment_0"
    // InternalXDrone.g:3338:1: rule__Program__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Program__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3342:1: ( ( ruleFly ) )
            // InternalXDrone.g:3343:2: ( ruleFly )
            {
            // InternalXDrone.g:3343:2: ( ruleFly )
            // InternalXDrone.g:3344:3: ruleFly
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
    // InternalXDrone.g:3353:1: rule__Program__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Program__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3357:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:3358:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:3358:2: ( ruleEnvironment )
            // InternalXDrone.g:3359:3: ruleEnvironment
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
    // InternalXDrone.g:3368:1: rule__Fly__TakeoffAssignment_1_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3372:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:3373:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:3373:2: ( ruleTakeoff )
            // InternalXDrone.g:3374:3: ruleTakeoff
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
    // InternalXDrone.g:3383:1: rule__Fly__CommandsAssignment_1_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3387:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:3388:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:3388:2: ( ruleSuperCommand )
            // InternalXDrone.g:3389:3: ruleSuperCommand
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
    // InternalXDrone.g:3398:1: rule__Fly__LandAssignment_1_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3402:1: ( ( ruleLand ) )
            // InternalXDrone.g:3403:2: ( ruleLand )
            {
            // InternalXDrone.g:3403:2: ( ruleLand )
            // InternalXDrone.g:3404:3: ruleLand
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
    // InternalXDrone.g:3413:1: rule__Environment__DroneAssignment_2_0 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3417:1: ( ( ruleDrone ) )
            // InternalXDrone.g:3418:2: ( ruleDrone )
            {
            // InternalXDrone.g:3418:2: ( ruleDrone )
            // InternalXDrone.g:3419:3: ruleDrone
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


    // $ANTLR start "rule__Environment__ObjectsAssignment_2_1"
    // InternalXDrone.g:3428:1: rule__Environment__ObjectsAssignment_2_1 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3432:1: ( ( ruleObject ) )
            // InternalXDrone.g:3433:2: ( ruleObject )
            {
            // InternalXDrone.g:3433:2: ( ruleObject )
            // InternalXDrone.g:3434:3: ruleObject
            {
             before(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ObjectsAssignment_2_1"


    // $ANTLR start "rule__Move__VectorAssignment_1"
    // InternalXDrone.g:3443:1: rule__Move__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Move__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3447:1: ( ( ruleVector ) )
            // InternalXDrone.g:3448:2: ( ruleVector )
            {
            // InternalXDrone.g:3448:2: ( ruleVector )
            // InternalXDrone.g:3449:3: ruleVector
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
    // InternalXDrone.g:3458:1: rule__Rotate__AngleAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Rotate__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3462:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3463:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3463:2: ( ruleDOUBLE )
            // InternalXDrone.g:3464:3: ruleDOUBLE
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
    // InternalXDrone.g:3473:1: rule__Up__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Up__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3477:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3478:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3478:2: ( ruleDOUBLE )
            // InternalXDrone.g:3479:3: ruleDOUBLE
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
    // InternalXDrone.g:3488:1: rule__Down__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Down__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3492:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3493:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3493:2: ( ruleDOUBLE )
            // InternalXDrone.g:3494:3: ruleDOUBLE
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
    // InternalXDrone.g:3503:1: rule__Left__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Left__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3507:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3508:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3508:2: ( ruleDOUBLE )
            // InternalXDrone.g:3509:3: ruleDOUBLE
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
    // InternalXDrone.g:3518:1: rule__Right__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Right__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3522:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3523:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3523:2: ( ruleDOUBLE )
            // InternalXDrone.g:3524:3: ruleDOUBLE
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
    // InternalXDrone.g:3533:1: rule__Forward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3537:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3538:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3538:2: ( ruleDOUBLE )
            // InternalXDrone.g:3539:3: ruleDOUBLE
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
    // InternalXDrone.g:3548:1: rule__Backward__DistanceAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Backward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3552:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3553:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3553:2: ( ruleDOUBLE )
            // InternalXDrone.g:3554:3: ruleDOUBLE
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
    // InternalXDrone.g:3563:1: rule__RotateL__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateL__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3567:1: ( ( RULE_INT ) )
            // InternalXDrone.g:3568:2: ( RULE_INT )
            {
            // InternalXDrone.g:3568:2: ( RULE_INT )
            // InternalXDrone.g:3569:3: RULE_INT
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
    // InternalXDrone.g:3578:1: rule__RotateR__AngleAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateR__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3582:1: ( ( RULE_INT ) )
            // InternalXDrone.g:3583:2: ( RULE_INT )
            {
            // InternalXDrone.g:3583:2: ( RULE_INT )
            // InternalXDrone.g:3584:3: RULE_INT
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
    // InternalXDrone.g:3593:1: rule__Wait__SecondsAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3597:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3598:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3598:2: ( ruleDOUBLE )
            // InternalXDrone.g:3599:3: ruleDOUBLE
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
    // InternalXDrone.g:3608:1: rule__FunctionName__Func_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionName__Func_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3612:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3613:2: ( RULE_ID )
            {
            // InternalXDrone.g:3613:2: ( RULE_ID )
            // InternalXDrone.g:3614:3: RULE_ID
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
    // InternalXDrone.g:3623:1: rule__Drone__VectorAssignment_1 : ( ruleVector ) ;
    public final void rule__Drone__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3627:1: ( ( ruleVector ) )
            // InternalXDrone.g:3628:2: ( ruleVector )
            {
            // InternalXDrone.g:3628:2: ( ruleVector )
            // InternalXDrone.g:3629:3: ruleVector
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
    // InternalXDrone.g:3638:1: rule__Object__Object_nameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3642:1: ( ( RULE_ID ) )
            // InternalXDrone.g:3643:2: ( RULE_ID )
            {
            // InternalXDrone.g:3643:2: ( RULE_ID )
            // InternalXDrone.g:3644:3: RULE_ID
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
    // InternalXDrone.g:3653:1: rule__Object__OriginAssignment_0_2 : ( ruleOrigin ) ;
    public final void rule__Object__OriginAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3657:1: ( ( ruleOrigin ) )
            // InternalXDrone.g:3658:2: ( ruleOrigin )
            {
            // InternalXDrone.g:3658:2: ( ruleOrigin )
            // InternalXDrone.g:3659:3: ruleOrigin
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
    // InternalXDrone.g:3668:1: rule__Object__SizeAssignment_1 : ( ruleSize ) ;
    public final void rule__Object__SizeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3672:1: ( ( ruleSize ) )
            // InternalXDrone.g:3673:2: ( ruleSize )
            {
            // InternalXDrone.g:3673:2: ( ruleSize )
            // InternalXDrone.g:3674:3: ruleSize
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
    // InternalXDrone.g:3683:1: rule__Object__ColorAssignment_2_0 : ( ruleColor ) ;
    public final void rule__Object__ColorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3687:1: ( ( ruleColor ) )
            // InternalXDrone.g:3688:2: ( ruleColor )
            {
            // InternalXDrone.g:3688:2: ( ruleColor )
            // InternalXDrone.g:3689:3: ruleColor
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
    // InternalXDrone.g:3698:1: rule__Origin__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Origin__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3702:1: ( ( ruleVector ) )
            // InternalXDrone.g:3703:2: ( ruleVector )
            {
            // InternalXDrone.g:3703:2: ( ruleVector )
            // InternalXDrone.g:3704:3: ruleVector
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
    // InternalXDrone.g:3713:1: rule__Size__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Size__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3717:1: ( ( ruleVector ) )
            // InternalXDrone.g:3718:2: ( ruleVector )
            {
            // InternalXDrone.g:3718:2: ( ruleVector )
            // InternalXDrone.g:3719:3: ruleVector
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
    // InternalXDrone.g:3728:1: rule__Vector__XAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Vector__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3732:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3733:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3733:2: ( ruleDOUBLE )
            // InternalXDrone.g:3734:3: ruleDOUBLE
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
    // InternalXDrone.g:3743:1: rule__Vector__YAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Vector__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3747:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3748:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3748:2: ( ruleDOUBLE )
            // InternalXDrone.g:3749:3: ruleDOUBLE
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
    // InternalXDrone.g:3758:1: rule__Vector__ZAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Vector__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3762:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:3763:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:3763:2: ( ruleDOUBLE )
            // InternalXDrone.g:3764:3: ruleDOUBLE
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
    // InternalXDrone.g:3773:1: rule__Color__Color_valueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__Color_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3777:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:3778:2: ( RULE_STRING )
            {
            // InternalXDrone.g:3778:2: ( RULE_STRING )
            // InternalXDrone.g:3779:3: RULE_STRING
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

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\100\uffff";
    static final String dfa_2s = "\1\5\77\uffff";
    static final String dfa_3s = "\1\5\1\41\2\43\1\0\1\uffff\1\42\1\24\1\6\1\uffff\1\43\1\4\1\16\1\24\1\20\1\4\1\0\3\4\2\20\1\4\1\45\1\20\4\4\1\20\2\4\1\20\2\45\1\20\2\4\1\20\1\4\1\45\3\4\1\20\1\45\1\4\1\0\1\20\1\45\1\20\1\4\1\45\1\4\1\25\2\4\1\0\1\20\1\45\2\25\1\4\1\25";
    static final String dfa_4s = "\1\46\1\41\2\43\1\0\1\uffff\1\42\1\24\1\6\1\uffff\1\43\1\21\1\16\1\24\1\45\1\4\1\0\1\21\1\4\1\21\2\45\1\4\2\45\3\4\1\21\1\45\1\21\1\4\4\45\2\4\1\25\1\4\1\45\1\4\1\21\1\4\2\45\1\4\1\0\1\25\1\45\1\25\1\4\1\45\1\4\1\25\2\4\1\0\1\25\1\45\2\25\1\4\1\25";
    static final String dfa_5s = "\5\uffff\1\2\3\uffff\1\1\66\uffff";
    static final String dfa_6s = "\4\uffff\1\2\13\uffff\1\1\36\uffff\1\3\11\uffff\1\0\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\10\uffff\1\4\21\uffff\1\5\3\uffff\1\2\1\uffff\1\3",
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
            "\1\16\14\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\22\24\uffff\1\23",
            "\1\24",
            "\1\uffff",
            "\1\25\14\uffff\1\26",
            "\1\27",
            "\1\30\14\uffff\1\31",
            "\1\32\24\uffff\1\23",
            "\1\33\24\uffff\1\34",
            "\1\35",
            "\1\23",
            "\1\37\24\uffff\1\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\14\uffff\1\44",
            "\1\45\24\uffff\1\34",
            "\1\46\14\uffff\1\47",
            "\1\50",
            "\1\51\24\uffff\1\36",
            "\1\23",
            "\1\34",
            "\1\53\24\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56\4\uffff\1\57",
            "\1\60",
            "\1\36",
            "\1\61",
            "\1\62\14\uffff\1\63",
            "\1\64",
            "\1\65\24\uffff\1\52",
            "\1\34",
            "\1\66",
            "\1\uffff",
            "\1\67\4\uffff\1\57",
            "\1\36",
            "\1\70\4\uffff\1\71",
            "\1\72",
            "\1\52",
            "\1\73",
            "\1\57",
            "\1\74",
            "\1\75",
            "\1\uffff",
            "\1\76\4\uffff\1\71",
            "\1\52",
            "\1\57",
            "\1\71",
            "\1\77",
            "\1\71"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3308:2: ( rule__Object__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_57 = input.LA(1);

                         
                        int index9_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index9_57);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_47 = input.LA(1);

                         
                        int index9_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index9_47);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3320:2: ( rule__Object__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_57 = input.LA(1);

                         
                        int index10_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index10_57);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_16 = input.LA(1);

                         
                        int index10_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index10_16);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_47 = input.LA(1);

                         
                        int index10_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index10_47);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000005100004020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000005100004022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}

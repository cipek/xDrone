package ic.ac.uk.xdrone.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDroneParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fly(){'", "'}'", "'environment(){'", "'TAKEOFF()'", "'LAND()'", "'.'", "'-'", "'MOVE'", "'ROTATE'", "'('", "')'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'origin'", "'='", "'size'", "','", "'color'"
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

        public InternalXDroneParser(TokenStream input, XDroneGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected XDroneGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalXDrone.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalXDrone.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalXDrone.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalXDrone.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_fly_0_0 = null;

        EObject lv_environment_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:77:2: ( ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) ) ) )
            // InternalXDrone.g:78:2: ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) ) )
            {
            // InternalXDrone.g:78:2: ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) ) )
            // InternalXDrone.g:79:3: ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )
            {
            // InternalXDrone.g:79:3: ( (lv_fly_0_0= ruleFly ) )
            // InternalXDrone.g:80:4: (lv_fly_0_0= ruleFly )
            {
            // InternalXDrone.g:80:4: (lv_fly_0_0= ruleFly )
            // InternalXDrone.g:81:5: lv_fly_0_0= ruleFly
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getFlyFlyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_fly_0_0=ruleFly();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"fly",
            						lv_fly_0_0,
            						"ic.ac.uk.xdrone.XDrone.Fly");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDrone.g:98:3: ( (lv_environment_1_0= ruleEnvironment ) )
            // InternalXDrone.g:99:4: (lv_environment_1_0= ruleEnvironment )
            {
            // InternalXDrone.g:99:4: (lv_environment_1_0= ruleEnvironment )
            // InternalXDrone.g:100:5: lv_environment_1_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_environment_1_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"environment",
            						lv_environment_1_0,
            						"ic.ac.uk.xdrone.XDrone.Environment");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFly"
    // InternalXDrone.g:121:1: entryRuleFly returns [EObject current=null] : iv_ruleFly= ruleFly EOF ;
    public final EObject entryRuleFly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFly = null;


        try {
            // InternalXDrone.g:121:44: (iv_ruleFly= ruleFly EOF )
            // InternalXDrone.g:122:2: iv_ruleFly= ruleFly EOF
            {
             newCompositeNode(grammarAccess.getFlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFly=ruleFly();

            state._fsp--;

             current =iv_ruleFly; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFly"


    // $ANTLR start "ruleFly"
    // InternalXDrone.g:128:1: ruleFly returns [EObject current=null] : (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleFly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_takeoff_1_0 = null;

        EObject lv_commands_2_0 = null;

        AntlrDatatypeRuleToken lv_land_3_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:134:2: ( (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' ) )
            // InternalXDrone.g:135:2: (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' )
            {
            // InternalXDrone.g:135:2: (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' )
            // InternalXDrone.g:136:3: otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFlyAccess().getFlyKeyword_0());
            		
            // InternalXDrone.g:140:3: ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) )
            // InternalXDrone.g:141:4: ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) )
            {
            // InternalXDrone.g:141:4: ( (lv_takeoff_1_0= ruleTakeoff ) )
            // InternalXDrone.g:142:5: (lv_takeoff_1_0= ruleTakeoff )
            {
            // InternalXDrone.g:142:5: (lv_takeoff_1_0= ruleTakeoff )
            // InternalXDrone.g:143:6: lv_takeoff_1_0= ruleTakeoff
            {

            						newCompositeNode(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_5);
            lv_takeoff_1_0=ruleTakeoff();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFlyRule());
            						}
            						add(
            							current,
            							"takeoff",
            							lv_takeoff_1_0,
            							"ic.ac.uk.xdrone.XDrone.Takeoff");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXDrone.g:160:4: ( (lv_commands_2_0= ruleSuperCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=18 && LA1_0<=19)||(LA1_0>=22 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXDrone.g:161:5: (lv_commands_2_0= ruleSuperCommand )
            	    {
            	    // InternalXDrone.g:161:5: (lv_commands_2_0= ruleSuperCommand )
            	    // InternalXDrone.g:162:6: lv_commands_2_0= ruleSuperCommand
            	    {

            	    						newCompositeNode(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_commands_2_0=ruleSuperCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFlyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.SuperCommand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXDrone.g:179:4: ( (lv_land_3_0= ruleLand ) )
            // InternalXDrone.g:180:5: (lv_land_3_0= ruleLand )
            {
            // InternalXDrone.g:180:5: (lv_land_3_0= ruleLand )
            // InternalXDrone.g:181:6: lv_land_3_0= ruleLand
            {

            						newCompositeNode(grammarAccess.getFlyAccess().getLandLandParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_6);
            lv_land_3_0=ruleLand();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFlyRule());
            						}
            						add(
            							current,
            							"land",
            							lv_land_3_0,
            							"ic.ac.uk.xdrone.XDrone.Land");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFly"


    // $ANTLR start "entryRuleEnvironment"
    // InternalXDrone.g:207:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalXDrone.g:207:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalXDrone.g:208:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalXDrone.g:214:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_objects_3_0= ruleObject ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_drone_2_0 = null;

        EObject lv_objects_3_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:220:2: ( ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_objects_3_0= ruleObject ) ) )* otherlv_4= '}' ) )
            // InternalXDrone.g:221:2: ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_objects_3_0= ruleObject ) ) )* otherlv_4= '}' )
            {
            // InternalXDrone.g:221:2: ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_objects_3_0= ruleObject ) ) )* otherlv_4= '}' )
            // InternalXDrone.g:222:3: () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_objects_3_0= ruleObject ) ) )* otherlv_4= '}'
            {
            // InternalXDrone.g:222:3: ()
            // InternalXDrone.g:223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalXDrone.g:233:3: ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_objects_3_0= ruleObject ) ) )*
            loop2:
            do {
                int alt2=3;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==RULE_ID||LA2_1==12||LA2_1==32||LA2_1==36||LA2_1==38) ) {
                        alt2=2;
                    }


                    }
                    break;
                case 32:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                case 36:
                case 38:
                    {
                    alt2=2;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalXDrone.g:234:4: ( (lv_drone_2_0= ruleDrone ) )
            	    {
            	    // InternalXDrone.g:234:4: ( (lv_drone_2_0= ruleDrone ) )
            	    // InternalXDrone.g:235:5: (lv_drone_2_0= ruleDrone )
            	    {
            	    // InternalXDrone.g:235:5: (lv_drone_2_0= ruleDrone )
            	    // InternalXDrone.g:236:6: lv_drone_2_0= ruleDrone
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_drone_2_0=ruleDrone();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"drone",
            	    							lv_drone_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.Drone");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:254:4: ( (lv_objects_3_0= ruleObject ) )
            	    {
            	    // InternalXDrone.g:254:4: ( (lv_objects_3_0= ruleObject ) )
            	    // InternalXDrone.g:255:5: (lv_objects_3_0= ruleObject )
            	    {
            	    // InternalXDrone.g:255:5: (lv_objects_3_0= ruleObject )
            	    // InternalXDrone.g:256:6: lv_objects_3_0= ruleObject
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_objects_3_0=ruleObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objects",
            	    							lv_objects_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.Object");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleTakeoff"
    // InternalXDrone.g:282:1: entryRuleTakeoff returns [String current=null] : iv_ruleTakeoff= ruleTakeoff EOF ;
    public final String entryRuleTakeoff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTakeoff = null;


        try {
            // InternalXDrone.g:282:47: (iv_ruleTakeoff= ruleTakeoff EOF )
            // InternalXDrone.g:283:2: iv_ruleTakeoff= ruleTakeoff EOF
            {
             newCompositeNode(grammarAccess.getTakeoffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTakeoff=ruleTakeoff();

            state._fsp--;

             current =iv_ruleTakeoff.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTakeoff"


    // $ANTLR start "ruleTakeoff"
    // InternalXDrone.g:289:1: ruleTakeoff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TAKEOFF()' ;
    public final AntlrDatatypeRuleToken ruleTakeoff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:295:2: (kw= 'TAKEOFF()' )
            // InternalXDrone.g:296:2: kw= 'TAKEOFF()'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTakeoffAccess().getTAKEOFFKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTakeoff"


    // $ANTLR start "entryRuleLand"
    // InternalXDrone.g:304:1: entryRuleLand returns [String current=null] : iv_ruleLand= ruleLand EOF ;
    public final String entryRuleLand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLand = null;


        try {
            // InternalXDrone.g:304:44: (iv_ruleLand= ruleLand EOF )
            // InternalXDrone.g:305:2: iv_ruleLand= ruleLand EOF
            {
             newCompositeNode(grammarAccess.getLandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLand=ruleLand();

            state._fsp--;

             current =iv_ruleLand.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLand"


    // $ANTLR start "ruleLand"
    // InternalXDrone.g:311:1: ruleLand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LAND()' ;
    public final AntlrDatatypeRuleToken ruleLand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:317:2: (kw= 'LAND()' )
            // InternalXDrone.g:318:2: kw= 'LAND()'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLandAccess().getLANDKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleSuperCommand"
    // InternalXDrone.g:326:1: entryRuleSuperCommand returns [EObject current=null] : iv_ruleSuperCommand= ruleSuperCommand EOF ;
    public final EObject entryRuleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperCommand = null;


        try {
            // InternalXDrone.g:326:53: (iv_ruleSuperCommand= ruleSuperCommand EOF )
            // InternalXDrone.g:327:2: iv_ruleSuperCommand= ruleSuperCommand EOF
            {
             newCompositeNode(grammarAccess.getSuperCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperCommand=ruleSuperCommand();

            state._fsp--;

             current =iv_ruleSuperCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperCommand"


    // $ANTLR start "ruleSuperCommand"
    // InternalXDrone.g:333:1: ruleSuperCommand returns [EObject current=null] : (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) ;
    public final EObject ruleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_FunctionName_1 = null;



        	enterRule();

        try {
            // InternalXDrone.g:339:2: ( (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) )
            // InternalXDrone.g:340:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            {
            // InternalXDrone.g:340:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=19)||(LA3_0>=22 && LA3_0<=30)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:341:3: this_Command_0= ruleCommand
                    {

                    			newCompositeNode(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command_0=ruleCommand();

                    state._fsp--;


                    			current = this_Command_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDrone.g:350:3: this_FunctionName_1= ruleFunctionName
                    {

                    			newCompositeNode(grammarAccess.getSuperCommandAccess().getFunctionNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionName_1=ruleFunctionName();

                    state._fsp--;


                    			current = this_FunctionName_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperCommand"


    // $ANTLR start "entryRuleCommand"
    // InternalXDrone.g:362:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalXDrone.g:362:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalXDrone.g:363:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalXDrone.g:369:1: ruleCommand returns [EObject current=null] : (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Up_0 = null;

        EObject this_Down_1 = null;

        EObject this_Left_2 = null;

        EObject this_Right_3 = null;

        EObject this_Forward_4 = null;

        EObject this_Backward_5 = null;

        EObject this_RotateL_6 = null;

        EObject this_RotateR_7 = null;

        EObject this_Wait_8 = null;

        EObject this_Move_9 = null;

        EObject this_Rotate_10 = null;



        	enterRule();

        try {
            // InternalXDrone.g:375:2: ( (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate ) )
            // InternalXDrone.g:376:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate )
            {
            // InternalXDrone.g:376:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            case 29:
                {
                alt4=8;
                }
                break;
            case 30:
                {
                alt4=9;
                }
                break;
            case 18:
                {
                alt4=10;
                }
                break;
            case 19:
                {
                alt4=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:377:3: this_Up_0= ruleUp
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Up_0=ruleUp();

                    state._fsp--;


                    			current = this_Up_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDrone.g:386:3: this_Down_1= ruleDown
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDownParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Down_1=ruleDown();

                    state._fsp--;


                    			current = this_Down_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDrone.g:395:3: this_Left_2= ruleLeft
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLeftParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Left_2=ruleLeft();

                    state._fsp--;


                    			current = this_Left_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXDrone.g:404:3: this_Right_3= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRightParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_3=ruleRight();

                    state._fsp--;


                    			current = this_Right_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXDrone.g:413:3: this_Forward_4= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getForwardParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_4=ruleForward();

                    state._fsp--;


                    			current = this_Forward_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXDrone.g:422:3: this_Backward_5= ruleBackward
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Backward_5=ruleBackward();

                    state._fsp--;


                    			current = this_Backward_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXDrone.g:431:3: this_RotateL_6= ruleRotateL
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateL_6=ruleRotateL();

                    state._fsp--;


                    			current = this_RotateL_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXDrone.g:440:3: this_RotateR_7= ruleRotateR
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateR_7=ruleRotateR();

                    state._fsp--;


                    			current = this_RotateR_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXDrone.g:449:3: this_Wait_8= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWaitParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_8=ruleWait();

                    state._fsp--;


                    			current = this_Wait_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalXDrone.g:458:3: this_Move_9= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getMoveParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_9=ruleMove();

                    state._fsp--;


                    			current = this_Move_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalXDrone.g:467:3: this_Rotate_10= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_10=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalXDrone.g:479:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalXDrone.g:479:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalXDrone.g:480:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalXDrone.g:486:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_6=null;
        Token this_INT_7=null;
        Token this_INT_9=null;


        	enterRule();

        try {
            // InternalXDrone.g:492:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) ) )
            // InternalXDrone.g:493:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) )
            {
            // InternalXDrone.g:493:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==21||LA5_1==37) ) {
                    alt5=3;
                }
                else if ( (LA5_1==16) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==17) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_INT) ) {
                    int LA5_5 = input.LA(3);

                    if ( (LA5_5==16) ) {
                        alt5=2;
                    }
                    else if ( (LA5_5==EOF||LA5_5==21||LA5_5==37) ) {
                        alt5=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

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
                    // InternalXDrone.g:494:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // InternalXDrone.g:494:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // InternalXDrone.g:495:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,16,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:516:3: (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
                    {
                    // InternalXDrone.g:516:3: (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
                    // InternalXDrone.g:517:4: kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,17,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_1_0());
                    			
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_8); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1());
                    			
                    kw=(Token)match(input,16,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_2());
                    			
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:543:3: this_INT_7= RULE_INT
                    {
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_7);
                    		

                    			newLeafNode(this_INT_7, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXDrone.g:551:3: (kw= '-' this_INT_9= RULE_INT )
                    {
                    // InternalXDrone.g:551:3: (kw= '-' this_INT_9= RULE_INT )
                    // InternalXDrone.g:552:4: kw= '-' this_INT_9= RULE_INT
                    {
                    kw=(Token)match(input,17,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_3_0());
                    			
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_9);
                    			

                    				newLeafNode(this_INT_9, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleMove"
    // InternalXDrone.g:569:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalXDrone.g:569:45: (iv_ruleMove= ruleMove EOF )
            // InternalXDrone.g:570:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalXDrone.g:576:1: ruleMove returns [EObject current=null] : (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vector_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:582:2: ( (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) ) )
            // InternalXDrone.g:583:2: (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) )
            {
            // InternalXDrone.g:583:2: (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) )
            // InternalXDrone.g:584:3: otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMOVEKeyword_0());
            		
            // InternalXDrone.g:588:3: ( (lv_vector_1_0= ruleVector ) )
            // InternalXDrone.g:589:4: (lv_vector_1_0= ruleVector )
            {
            // InternalXDrone.g:589:4: (lv_vector_1_0= ruleVector )
            // InternalXDrone.g:590:5: lv_vector_1_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getVectorVectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_1_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_1_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRotate"
    // InternalXDrone.g:611:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalXDrone.g:611:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalXDrone.g:612:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalXDrone.g:618:1: ruleRotate returns [EObject current=null] : (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:624:2: ( (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:625:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:625:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:626:3: otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getROTATEKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:634:3: ( (lv_angle_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:635:4: (lv_angle_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:635:4: (lv_angle_2_0= ruleDOUBLE )
            // InternalXDrone.g:636:5: lv_angle_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRotateAccess().getAngleDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_angle_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:661:1: entryRuleUp returns [EObject current=null] : iv_ruleUp= ruleUp EOF ;
    public final EObject entryRuleUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUp = null;


        try {
            // InternalXDrone.g:661:43: (iv_ruleUp= ruleUp EOF )
            // InternalXDrone.g:662:2: iv_ruleUp= ruleUp EOF
            {
             newCompositeNode(grammarAccess.getUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUp=ruleUp();

            state._fsp--;

             current =iv_ruleUp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUp"


    // $ANTLR start "ruleUp"
    // InternalXDrone.g:668:1: ruleUp returns [EObject current=null] : (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:674:2: ( (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:675:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:675:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:676:3: otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUPKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:684:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:685:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:685:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:686:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_distance_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUpAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUp"


    // $ANTLR start "entryRuleDown"
    // InternalXDrone.g:711:1: entryRuleDown returns [EObject current=null] : iv_ruleDown= ruleDown EOF ;
    public final EObject entryRuleDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDown = null;


        try {
            // InternalXDrone.g:711:45: (iv_ruleDown= ruleDown EOF )
            // InternalXDrone.g:712:2: iv_ruleDown= ruleDown EOF
            {
             newCompositeNode(grammarAccess.getDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDown=ruleDown();

            state._fsp--;

             current =iv_ruleDown; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDown"


    // $ANTLR start "ruleDown"
    // InternalXDrone.g:718:1: ruleDown returns [EObject current=null] : (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:724:2: ( (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:725:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:725:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:726:3: otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDownAccess().getDOWNKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:734:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:735:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:735:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:736:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_distance_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDownRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDownAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDown"


    // $ANTLR start "entryRuleLeft"
    // InternalXDrone.g:761:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalXDrone.g:761:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalXDrone.g:762:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalXDrone.g:768:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:774:2: ( (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:775:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:775:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:776:3: otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:784:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:785:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:785:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:786:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_distance_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalXDrone.g:811:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalXDrone.g:811:46: (iv_ruleRight= ruleRight EOF )
            // InternalXDrone.g:812:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalXDrone.g:818:1: ruleRight returns [EObject current=null] : (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:824:2: ( (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:825:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:825:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:826:3: otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:834:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:835:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:835:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:836:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_distance_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRightAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleForward"
    // InternalXDrone.g:861:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalXDrone.g:861:48: (iv_ruleForward= ruleForward EOF )
            // InternalXDrone.g:862:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalXDrone.g:868:1: ruleForward returns [EObject current=null] : (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:874:2: ( (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:875:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:875:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:876:3: otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFORWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:884:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:885:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:885:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:886:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_distance_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleBackward"
    // InternalXDrone.g:911:1: entryRuleBackward returns [EObject current=null] : iv_ruleBackward= ruleBackward EOF ;
    public final EObject entryRuleBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackward = null;


        try {
            // InternalXDrone.g:911:49: (iv_ruleBackward= ruleBackward EOF )
            // InternalXDrone.g:912:2: iv_ruleBackward= ruleBackward EOF
            {
             newCompositeNode(grammarAccess.getBackwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackward=ruleBackward();

            state._fsp--;

             current =iv_ruleBackward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackward"


    // $ANTLR start "ruleBackward"
    // InternalXDrone.g:918:1: ruleBackward returns [EObject current=null] : (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:924:2: ( (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:925:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:925:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:926:3: otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBackwardAccess().getBACKWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:934:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:935:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:935:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:936:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_distance_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackward"


    // $ANTLR start "entryRuleRotateL"
    // InternalXDrone.g:961:1: entryRuleRotateL returns [EObject current=null] : iv_ruleRotateL= ruleRotateL EOF ;
    public final EObject entryRuleRotateL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateL = null;


        try {
            // InternalXDrone.g:961:48: (iv_ruleRotateL= ruleRotateL EOF )
            // InternalXDrone.g:962:2: iv_ruleRotateL= ruleRotateL EOF
            {
             newCompositeNode(grammarAccess.getRotateLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateL=ruleRotateL();

            state._fsp--;

             current =iv_ruleRotateL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotateL"


    // $ANTLR start "ruleRotateL"
    // InternalXDrone.g:968:1: ruleRotateL returns [EObject current=null] : (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_angle_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:974:2: ( (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:975:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:975:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:976:3: otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:984:3: ( (lv_angle_2_0= RULE_INT ) )
            // InternalXDrone.g:985:4: (lv_angle_2_0= RULE_INT )
            {
            // InternalXDrone.g:985:4: (lv_angle_2_0= RULE_INT )
            // InternalXDrone.g:986:5: lv_angle_2_0= RULE_INT
            {
            lv_angle_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_angle_2_0, grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"angle",
            						lv_angle_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotateL"


    // $ANTLR start "entryRuleRotateR"
    // InternalXDrone.g:1010:1: entryRuleRotateR returns [EObject current=null] : iv_ruleRotateR= ruleRotateR EOF ;
    public final EObject entryRuleRotateR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateR = null;


        try {
            // InternalXDrone.g:1010:48: (iv_ruleRotateR= ruleRotateR EOF )
            // InternalXDrone.g:1011:2: iv_ruleRotateR= ruleRotateR EOF
            {
             newCompositeNode(grammarAccess.getRotateRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateR=ruleRotateR();

            state._fsp--;

             current =iv_ruleRotateR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotateR"


    // $ANTLR start "ruleRotateR"
    // InternalXDrone.g:1017:1: ruleRotateR returns [EObject current=null] : (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_angle_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:1023:2: ( (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1024:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1024:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:1025:3: otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1033:3: ( (lv_angle_2_0= RULE_INT ) )
            // InternalXDrone.g:1034:4: (lv_angle_2_0= RULE_INT )
            {
            // InternalXDrone.g:1034:4: (lv_angle_2_0= RULE_INT )
            // InternalXDrone.g:1035:5: lv_angle_2_0= RULE_INT
            {
            lv_angle_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_angle_2_0, grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateRRule());
            					}
            					setWithLastConsumed(
            						current,
            						"angle",
            						lv_angle_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotateR"


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:1059:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalXDrone.g:1059:45: (iv_ruleWait= ruleWait EOF )
            // InternalXDrone.g:1060:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalXDrone.g:1066:1: ruleWait returns [EObject current=null] : (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1072:2: ( (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1073:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1073:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:1074:3: otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWAITKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1082:3: ( (lv_seconds_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:1083:4: (lv_seconds_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1083:4: (lv_seconds_2_0= ruleDOUBLE )
            // InternalXDrone.g:1084:5: lv_seconds_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_seconds_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"seconds",
            						lv_seconds_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleFunctionName"
    // InternalXDrone.g:1109:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalXDrone.g:1109:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalXDrone.g:1110:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalXDrone.g:1116:1: ruleFunctionName returns [EObject current=null] : ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_func_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXDrone.g:1122:2: ( ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalXDrone.g:1123:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalXDrone.g:1123:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalXDrone.g:1124:3: ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalXDrone.g:1124:3: ( (lv_func_name_0_0= RULE_ID ) )
            // InternalXDrone.g:1125:4: (lv_func_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:1125:4: (lv_func_name_0_0= RULE_ID )
            // InternalXDrone.g:1126:5: lv_func_name_0_0= RULE_ID
            {
            lv_func_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_func_name_0_0, grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_name",
            						lv_func_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleDrone"
    // InternalXDrone.g:1150:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalXDrone.g:1150:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalXDrone.g:1151:2: iv_ruleDrone= ruleDrone EOF
            {
             newCompositeNode(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrone=ruleDrone();

            state._fsp--;

             current =iv_ruleDrone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalXDrone.g:1157:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vector_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1163:2: ( (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) ) )
            // InternalXDrone.g:1164:2: (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1164:2: (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) )
            // InternalXDrone.g:1165:3: otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDRONEKeyword_0());
            		
            // InternalXDrone.g:1169:3: ( (lv_vector_1_0= ruleVector ) )
            // InternalXDrone.g:1170:4: (lv_vector_1_0= ruleVector )
            {
            // InternalXDrone.g:1170:4: (lv_vector_1_0= ruleVector )
            // InternalXDrone.g:1171:5: lv_vector_1_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getVectorVectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_1_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_1_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRuleObject"
    // InternalXDrone.g:1192:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalXDrone.g:1192:47: (iv_ruleObject= ruleObject EOF )
            // InternalXDrone.g:1193:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalXDrone.g:1199:1: ruleObject returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_object_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_origin_3_0 = null;

        EObject lv_size_4_0 = null;

        EObject lv_color_5_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1205:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalXDrone.g:1206:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalXDrone.g:1206:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) )
            // InternalXDrone.g:1207:3: ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalXDrone.g:1207:3: ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) )
            // InternalXDrone.g:1208:4: ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup());
            			
            // InternalXDrone.g:1211:4: ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?)
            // InternalXDrone.g:1212:5: ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?
            {
            // InternalXDrone.g:1212:5: ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA7_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        alt7=3;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA7_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA7_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                        alt7=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA7_5 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        alt7=3;
                    }


                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalXDrone.g:1213:3: ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1213:3: ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) )
            	    // InternalXDrone.g:1214:4: {...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalXDrone.g:1214:100: ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) )
            	    // InternalXDrone.g:1215:5: ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalXDrone.g:1218:8: ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) )
            	    // InternalXDrone.g:1218:9: {...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "true");
            	    }
            	    // InternalXDrone.g:1218:18: ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) )
            	    // InternalXDrone.g:1218:19: ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) )
            	    {
            	    // InternalXDrone.g:1218:19: ( (lv_object_name_1_0= RULE_ID ) )
            	    // InternalXDrone.g:1219:9: (lv_object_name_1_0= RULE_ID )
            	    {
            	    // InternalXDrone.g:1219:9: (lv_object_name_1_0= RULE_ID )
            	    // InternalXDrone.g:1220:10: lv_object_name_1_0= RULE_ID
            	    {
            	    lv_object_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    										newLeafNode(lv_object_name_1_0, grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getObjectRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"object_name",
            	    											lv_object_name_1_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_15); 

            	    								newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0_1());
            	    							
            	    // InternalXDrone.g:1240:8: ( (lv_origin_3_0= ruleOrigin ) )
            	    // InternalXDrone.g:1241:9: (lv_origin_3_0= ruleOrigin )
            	    {
            	    // InternalXDrone.g:1241:9: (lv_origin_3_0= ruleOrigin )
            	    // InternalXDrone.g:1242:10: lv_origin_3_0= ruleOrigin
            	    {

            	    										newCompositeNode(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_16);
            	    lv_origin_3_0=ruleOrigin();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getObjectRule());
            	    										}
            	    										set(
            	    											current,
            	    											"origin",
            	    											lv_origin_3_0,
            	    											"ic.ac.uk.xdrone.XDrone.Origin");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1265:3: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1265:3: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    // InternalXDrone.g:1266:4: {...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalXDrone.g:1266:100: ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    // InternalXDrone.g:1267:5: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalXDrone.g:1270:8: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    // InternalXDrone.g:1270:9: {...}? => ( (lv_size_4_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "true");
            	    }
            	    // InternalXDrone.g:1270:18: ( (lv_size_4_0= ruleSize ) )
            	    // InternalXDrone.g:1270:19: (lv_size_4_0= ruleSize )
            	    {
            	    // InternalXDrone.g:1270:19: (lv_size_4_0= ruleSize )
            	    // InternalXDrone.g:1271:9: lv_size_4_0= ruleSize
            	    {

            	    									newCompositeNode(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_16);
            	    lv_size_4_0=ruleSize();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getObjectRule());
            	    									}
            	    									set(
            	    										current,
            	    										"size",
            	    										lv_size_4_0,
            	    										"ic.ac.uk.xdrone.XDrone.Size");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:1293:3: ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalXDrone.g:1293:3: ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) )
            	    // InternalXDrone.g:1294:4: {...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalXDrone.g:1294:100: ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) )
            	    // InternalXDrone.g:1295:5: ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalXDrone.g:1298:8: ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) )
            	    // InternalXDrone.g:1298:9: {...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "true");
            	    }
            	    // InternalXDrone.g:1298:18: ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' )
            	    // InternalXDrone.g:1298:19: ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}'
            	    {
            	    // InternalXDrone.g:1298:19: ( (lv_color_5_0= ruleColor ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==38) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalXDrone.g:1299:9: (lv_color_5_0= ruleColor )
            	            {
            	            // InternalXDrone.g:1299:9: (lv_color_5_0= ruleColor )
            	            // InternalXDrone.g:1300:10: lv_color_5_0= ruleColor
            	            {

            	            										newCompositeNode(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_0_0());
            	            									
            	            pushFollow(FOLLOW_6);
            	            lv_color_5_0=ruleColor();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getObjectRule());
            	            										}
            	            										set(
            	            											current,
            	            											"color",
            	            											lv_color_5_0,
            	            											"ic.ac.uk.xdrone.XDrone.Color");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,12,FOLLOW_16); 

            	    								newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_2_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleObject", "getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getObjectAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleOrigin"
    // InternalXDrone.g:1338:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalXDrone.g:1338:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalXDrone.g:1339:2: iv_ruleOrigin= ruleOrigin EOF
            {
             newCompositeNode(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrigin=ruleOrigin();

            state._fsp--;

             current =iv_ruleOrigin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalXDrone.g:1345:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1351:2: ( (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1352:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1352:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1353:3: otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1361:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1362:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1362:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1363:5: lv_vector_2_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_2_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleSize"
    // InternalXDrone.g:1384:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXDrone.g:1384:45: (iv_ruleSize= ruleSize EOF )
            // InternalXDrone.g:1385:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalXDrone.g:1391:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1397:2: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1398:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1398:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1399:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1407:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1408:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1408:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1409:5: lv_vector_2_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_2_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizeRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleVector"
    // InternalXDrone.g:1430:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalXDrone.g:1430:47: (iv_ruleVector= ruleVector EOF )
            // InternalXDrone.g:1431:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // InternalXDrone.g:1437:1: ruleVector returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1443:2: ( (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalXDrone.g:1444:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalXDrone.g:1444:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalXDrone.g:1445:3: otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXDrone.g:1449:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalXDrone.g:1450:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1450:4: (lv_x_1_0= ruleDOUBLE )
            // InternalXDrone.g:1451:5: lv_x_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_x_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getCommaKeyword_2());
            		
            // InternalXDrone.g:1472:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalXDrone.g:1473:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1473:4: (lv_y_3_0= ruleDOUBLE )
            // InternalXDrone.g:1474:5: lv_y_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_y_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getCommaKeyword_4());
            		
            // InternalXDrone.g:1495:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalXDrone.g:1496:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1496:4: (lv_z_5_0= ruleDOUBLE )
            // InternalXDrone.g:1497:5: lv_z_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_z_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleColor"
    // InternalXDrone.g:1522:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXDrone.g:1522:46: (iv_ruleColor= ruleColor EOF )
            // InternalXDrone.g:1523:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalXDrone.g:1529:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_color_value_2_0=null;


        	enterRule();

        try {
            // InternalXDrone.g:1535:2: ( (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) )
            // InternalXDrone.g:1536:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            {
            // InternalXDrone.g:1536:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            // InternalXDrone.g:1537:3: otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1545:3: ( (lv_color_value_2_0= RULE_STRING ) )
            // InternalXDrone.g:1546:4: (lv_color_value_2_0= RULE_STRING )
            {
            // InternalXDrone.g:1546:4: (lv_color_value_2_0= RULE_STRING )
            // InternalXDrone.g:1547:5: lv_color_value_2_0= RULE_STRING
            {
            lv_color_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_color_value_2_0, grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"color_value",
            						lv_color_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000007FCC8020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000005100001020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000005000001022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}

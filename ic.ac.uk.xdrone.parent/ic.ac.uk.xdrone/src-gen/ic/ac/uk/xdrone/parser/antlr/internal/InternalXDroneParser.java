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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fly(){'", "'}'", "'environment(){'", "'TAKEOFF()'", "'LAND()'", "'-'", "'.'", "'MOVE'", "'ROTATE'", "'('", "')'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'origin'", "'='", "'size'", "','", "'color'", "'WALLS'"
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
    // InternalXDrone.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_main_0_0= ruleMain ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:77:2: ( ( (lv_main_0_0= ruleMain ) ) )
            // InternalXDrone.g:78:2: ( (lv_main_0_0= ruleMain ) )
            {
            // InternalXDrone.g:78:2: ( (lv_main_0_0= ruleMain ) )
            // InternalXDrone.g:79:3: (lv_main_0_0= ruleMain )
            {
            // InternalXDrone.g:79:3: (lv_main_0_0= ruleMain )
            // InternalXDrone.g:80:4: lv_main_0_0= ruleMain
            {

            				newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_main_0_0=ruleMain();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProgramRule());
            				}
            				set(
            					current,
            					"main",
            					lv_main_0_0,
            					"ic.ac.uk.xdrone.XDrone.Main");
            				afterParserOrEnumRuleCall();
            			

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


    // $ANTLR start "entryRuleMain"
    // InternalXDrone.g:100:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalXDrone.g:100:45: (iv_ruleMain= ruleMain EOF )
            // InternalXDrone.g:101:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalXDrone.g:107:1: ruleMain returns [EObject current=null] : ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_fly_0_0 = null;

        EObject lv_environment_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:113:2: ( ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? ) )
            // InternalXDrone.g:114:2: ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? )
            {
            // InternalXDrone.g:114:2: ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? )
            // InternalXDrone.g:115:3: ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )?
            {
            // InternalXDrone.g:115:3: ( (lv_fly_0_0= ruleFly ) )
            // InternalXDrone.g:116:4: (lv_fly_0_0= ruleFly )
            {
            // InternalXDrone.g:116:4: (lv_fly_0_0= ruleFly )
            // InternalXDrone.g:117:5: lv_fly_0_0= ruleFly
            {

            					newCompositeNode(grammarAccess.getMainAccess().getFlyFlyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_fly_0_0=ruleFly();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"fly",
            						lv_fly_0_0,
            						"ic.ac.uk.xdrone.XDrone.Fly");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDrone.g:134:3: ( (lv_environment_1_0= ruleEnvironment ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXDrone.g:135:4: (lv_environment_1_0= ruleEnvironment )
                    {
                    // InternalXDrone.g:135:4: (lv_environment_1_0= ruleEnvironment )
                    // InternalXDrone.g:136:5: lv_environment_1_0= ruleEnvironment
                    {

                    					newCompositeNode(grammarAccess.getMainAccess().getEnvironmentEnvironmentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_environment_1_0=ruleEnvironment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainRule());
                    					}
                    					set(
                    						current,
                    						"environment",
                    						lv_environment_1_0,
                    						"ic.ac.uk.xdrone.XDrone.Environment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFly"
    // InternalXDrone.g:157:1: entryRuleFly returns [EObject current=null] : iv_ruleFly= ruleFly EOF ;
    public final EObject entryRuleFly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFly = null;


        try {
            // InternalXDrone.g:157:44: (iv_ruleFly= ruleFly EOF )
            // InternalXDrone.g:158:2: iv_ruleFly= ruleFly EOF
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
    // InternalXDrone.g:164:1: ruleFly returns [EObject current=null] : (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleFly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_takeoff_1_0 = null;

        EObject lv_commands_2_0 = null;

        AntlrDatatypeRuleToken lv_land_3_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:170:2: ( (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' ) )
            // InternalXDrone.g:171:2: (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' )
            {
            // InternalXDrone.g:171:2: (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' )
            // InternalXDrone.g:172:3: otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFlyAccess().getFlyKeyword_0());
            		
            // InternalXDrone.g:176:3: ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) )
            // InternalXDrone.g:177:4: ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) )
            {
            // InternalXDrone.g:177:4: ( (lv_takeoff_1_0= ruleTakeoff ) )
            // InternalXDrone.g:178:5: (lv_takeoff_1_0= ruleTakeoff )
            {
            // InternalXDrone.g:178:5: (lv_takeoff_1_0= ruleTakeoff )
            // InternalXDrone.g:179:6: lv_takeoff_1_0= ruleTakeoff
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

            // InternalXDrone.g:196:4: ( (lv_commands_2_0= ruleSuperCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=18 && LA2_0<=19)||(LA2_0>=22 && LA2_0<=30)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXDrone.g:197:5: (lv_commands_2_0= ruleSuperCommand )
            	    {
            	    // InternalXDrone.g:197:5: (lv_commands_2_0= ruleSuperCommand )
            	    // InternalXDrone.g:198:6: lv_commands_2_0= ruleSuperCommand
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
            	    break loop2;
                }
            } while (true);

            // InternalXDrone.g:215:4: ( (lv_land_3_0= ruleLand ) )
            // InternalXDrone.g:216:5: (lv_land_3_0= ruleLand )
            {
            // InternalXDrone.g:216:5: (lv_land_3_0= ruleLand )
            // InternalXDrone.g:217:6: lv_land_3_0= ruleLand
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
    // InternalXDrone.g:243:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalXDrone.g:243:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalXDrone.g:244:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalXDrone.g:250:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_drone_2_0 = null;

        EObject lv_walls_3_0 = null;

        EObject lv_objects_4_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:256:2: ( ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' ) )
            // InternalXDrone.g:257:2: ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' )
            {
            // InternalXDrone.g:257:2: ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' )
            // InternalXDrone.g:258:3: () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}'
            {
            // InternalXDrone.g:258:3: ()
            // InternalXDrone.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalXDrone.g:269:3: ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_ID||LA3_1==12||LA3_1==32||LA3_1==36||(LA3_1>=38 && LA3_1<=39)) ) {
                        alt3=3;
                    }


                    }
                    break;
                case 32:
                    {
                    alt3=1;
                    }
                    break;
                case 39:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_ID:
                case 36:
                case 38:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalXDrone.g:270:4: ( (lv_drone_2_0= ruleDrone ) )
            	    {
            	    // InternalXDrone.g:270:4: ( (lv_drone_2_0= ruleDrone ) )
            	    // InternalXDrone.g:271:5: (lv_drone_2_0= ruleDrone )
            	    {
            	    // InternalXDrone.g:271:5: (lv_drone_2_0= ruleDrone )
            	    // InternalXDrone.g:272:6: lv_drone_2_0= ruleDrone
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
            	    // InternalXDrone.g:290:4: ( (lv_walls_3_0= ruleWalls ) )
            	    {
            	    // InternalXDrone.g:290:4: ( (lv_walls_3_0= ruleWalls ) )
            	    // InternalXDrone.g:291:5: (lv_walls_3_0= ruleWalls )
            	    {
            	    // InternalXDrone.g:291:5: (lv_walls_3_0= ruleWalls )
            	    // InternalXDrone.g:292:6: lv_walls_3_0= ruleWalls
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getWallsWallsParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_walls_3_0=ruleWalls();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"walls",
            	    							lv_walls_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.Walls");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:310:4: ( (lv_objects_4_0= ruleObject ) )
            	    {
            	    // InternalXDrone.g:310:4: ( (lv_objects_4_0= ruleObject ) )
            	    // InternalXDrone.g:311:5: (lv_objects_4_0= ruleObject )
            	    {
            	    // InternalXDrone.g:311:5: (lv_objects_4_0= ruleObject )
            	    // InternalXDrone.g:312:6: lv_objects_4_0= ruleObject
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_objects_4_0=ruleObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objects",
            	    							lv_objects_4_0,
            	    							"ic.ac.uk.xdrone.XDrone.Object");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalXDrone.g:338:1: entryRuleTakeoff returns [String current=null] : iv_ruleTakeoff= ruleTakeoff EOF ;
    public final String entryRuleTakeoff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTakeoff = null;


        try {
            // InternalXDrone.g:338:47: (iv_ruleTakeoff= ruleTakeoff EOF )
            // InternalXDrone.g:339:2: iv_ruleTakeoff= ruleTakeoff EOF
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
    // InternalXDrone.g:345:1: ruleTakeoff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TAKEOFF()' ;
    public final AntlrDatatypeRuleToken ruleTakeoff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:351:2: (kw= 'TAKEOFF()' )
            // InternalXDrone.g:352:2: kw= 'TAKEOFF()'
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
    // InternalXDrone.g:360:1: entryRuleLand returns [String current=null] : iv_ruleLand= ruleLand EOF ;
    public final String entryRuleLand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLand = null;


        try {
            // InternalXDrone.g:360:44: (iv_ruleLand= ruleLand EOF )
            // InternalXDrone.g:361:2: iv_ruleLand= ruleLand EOF
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
    // InternalXDrone.g:367:1: ruleLand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LAND()' ;
    public final AntlrDatatypeRuleToken ruleLand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:373:2: (kw= 'LAND()' )
            // InternalXDrone.g:374:2: kw= 'LAND()'
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
    // InternalXDrone.g:382:1: entryRuleSuperCommand returns [EObject current=null] : iv_ruleSuperCommand= ruleSuperCommand EOF ;
    public final EObject entryRuleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperCommand = null;


        try {
            // InternalXDrone.g:382:53: (iv_ruleSuperCommand= ruleSuperCommand EOF )
            // InternalXDrone.g:383:2: iv_ruleSuperCommand= ruleSuperCommand EOF
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
    // InternalXDrone.g:389:1: ruleSuperCommand returns [EObject current=null] : (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) ;
    public final EObject ruleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_FunctionName_1 = null;



        	enterRule();

        try {
            // InternalXDrone.g:395:2: ( (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) )
            // InternalXDrone.g:396:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            {
            // InternalXDrone.g:396:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=19)||(LA4_0>=22 && LA4_0<=30)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:397:3: this_Command_0= ruleCommand
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
                    // InternalXDrone.g:406:3: this_FunctionName_1= ruleFunctionName
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
    // InternalXDrone.g:418:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalXDrone.g:418:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalXDrone.g:419:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalXDrone.g:425:1: ruleCommand returns [EObject current=null] : (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate ) ;
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
            // InternalXDrone.g:431:2: ( (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate ) )
            // InternalXDrone.g:432:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate )
            {
            // InternalXDrone.g:432:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_Move_9= ruleMove | this_Rotate_10= ruleRotate )
            int alt5=11;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            case 27:
                {
                alt5=6;
                }
                break;
            case 28:
                {
                alt5=7;
                }
                break;
            case 29:
                {
                alt5=8;
                }
                break;
            case 30:
                {
                alt5=9;
                }
                break;
            case 18:
                {
                alt5=10;
                }
                break;
            case 19:
                {
                alt5=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:433:3: this_Up_0= ruleUp
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
                    // InternalXDrone.g:442:3: this_Down_1= ruleDown
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
                    // InternalXDrone.g:451:3: this_Left_2= ruleLeft
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
                    // InternalXDrone.g:460:3: this_Right_3= ruleRight
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
                    // InternalXDrone.g:469:3: this_Forward_4= ruleForward
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
                    // InternalXDrone.g:478:3: this_Backward_5= ruleBackward
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
                    // InternalXDrone.g:487:3: this_RotateL_6= ruleRotateL
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
                    // InternalXDrone.g:496:3: this_RotateR_7= ruleRotateR
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
                    // InternalXDrone.g:505:3: this_Wait_8= ruleWait
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
                    // InternalXDrone.g:514:3: this_Move_9= ruleMove
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
                    // InternalXDrone.g:523:3: this_Rotate_10= ruleRotate
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
    // InternalXDrone.g:535:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalXDrone.g:535:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalXDrone.g:536:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalXDrone.g:542:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_1 = null;

        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_2 = null;



        	enterRule();

        try {
            // InternalXDrone.g:548:2: ( ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:549:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:549:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:550:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:550:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:551:4: kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE
                    {
                    kw=(Token)match(input,16,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_POSITIVE_DOUBLE_1=rulePOSITIVE_DOUBLE();

                    state._fsp--;


                    				current.merge(this_POSITIVE_DOUBLE_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:568:3: this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE
                    {

                    			newCompositeNode(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_POSITIVE_DOUBLE_2=rulePOSITIVE_DOUBLE();

                    state._fsp--;


                    			current.merge(this_POSITIVE_DOUBLE_2);
                    		

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulePOSITIVE_DOUBLE"
    // InternalXDrone.g:582:1: entryRulePOSITIVE_DOUBLE returns [String current=null] : iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF ;
    public final String entryRulePOSITIVE_DOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOSITIVE_DOUBLE = null;


        try {
            // InternalXDrone.g:582:55: (iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF )
            // InternalXDrone.g:583:2: iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF
            {
             newCompositeNode(grammarAccess.getPOSITIVE_DOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePOSITIVE_DOUBLE=rulePOSITIVE_DOUBLE();

            state._fsp--;

             current =iv_rulePOSITIVE_DOUBLE.getText(); 
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
    // $ANTLR end "entryRulePOSITIVE_DOUBLE"


    // $ANTLR start "rulePOSITIVE_DOUBLE"
    // InternalXDrone.g:589:1: rulePOSITIVE_DOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePOSITIVE_DOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:595:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) )
            // InternalXDrone.g:596:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            {
            // InternalXDrone.g:596:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==21||LA7_1==37) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXDrone.g:597:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // InternalXDrone.g:597:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // InternalXDrone.g:598:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,17,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPOSITIVE_DOUBLEAccess().getFullStopKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:619:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_3);
                    		

                    			newLeafNode(this_INT_3, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "rulePOSITIVE_DOUBLE"


    // $ANTLR start "entryRuleMove"
    // InternalXDrone.g:630:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalXDrone.g:630:45: (iv_ruleMove= ruleMove EOF )
            // InternalXDrone.g:631:2: iv_ruleMove= ruleMove EOF
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
    // InternalXDrone.g:637:1: ruleMove returns [EObject current=null] : (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vector_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:643:2: ( (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) ) )
            // InternalXDrone.g:644:2: (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) )
            {
            // InternalXDrone.g:644:2: (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) )
            // InternalXDrone.g:645:3: otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMOVEKeyword_0());
            		
            // InternalXDrone.g:649:3: ( (lv_vector_1_0= ruleVector ) )
            // InternalXDrone.g:650:4: (lv_vector_1_0= ruleVector )
            {
            // InternalXDrone.g:650:4: (lv_vector_1_0= ruleVector )
            // InternalXDrone.g:651:5: lv_vector_1_0= ruleVector
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
    // InternalXDrone.g:672:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalXDrone.g:672:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalXDrone.g:673:2: iv_ruleRotate= ruleRotate EOF
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
    // InternalXDrone.g:679:1: ruleRotate returns [EObject current=null] : (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:685:2: ( (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:686:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:686:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:687:3: otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getROTATEKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:695:3: ( (lv_angle_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:696:4: (lv_angle_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:696:4: (lv_angle_2_0= ruleDOUBLE )
            // InternalXDrone.g:697:5: lv_angle_2_0= ruleDOUBLE
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
    // InternalXDrone.g:722:1: entryRuleUp returns [EObject current=null] : iv_ruleUp= ruleUp EOF ;
    public final EObject entryRuleUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUp = null;


        try {
            // InternalXDrone.g:722:43: (iv_ruleUp= ruleUp EOF )
            // InternalXDrone.g:723:2: iv_ruleUp= ruleUp EOF
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
    // InternalXDrone.g:729:1: ruleUp returns [EObject current=null] : (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:735:2: ( (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:736:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:736:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:737:3: otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUPKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:745:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:746:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:746:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:747:5: lv_distance_2_0= ruleDOUBLE
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
    // InternalXDrone.g:772:1: entryRuleDown returns [EObject current=null] : iv_ruleDown= ruleDown EOF ;
    public final EObject entryRuleDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDown = null;


        try {
            // InternalXDrone.g:772:45: (iv_ruleDown= ruleDown EOF )
            // InternalXDrone.g:773:2: iv_ruleDown= ruleDown EOF
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
    // InternalXDrone.g:779:1: ruleDown returns [EObject current=null] : (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:785:2: ( (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:786:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:786:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:787:3: otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDownAccess().getDOWNKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:795:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:796:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:796:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:797:5: lv_distance_2_0= ruleDOUBLE
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
    // InternalXDrone.g:822:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalXDrone.g:822:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalXDrone.g:823:2: iv_ruleLeft= ruleLeft EOF
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
    // InternalXDrone.g:829:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:835:2: ( (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:836:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:836:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:837:3: otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:845:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:846:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:846:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:847:5: lv_distance_2_0= ruleDOUBLE
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
    // InternalXDrone.g:872:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalXDrone.g:872:46: (iv_ruleRight= ruleRight EOF )
            // InternalXDrone.g:873:2: iv_ruleRight= ruleRight EOF
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
    // InternalXDrone.g:879:1: ruleRight returns [EObject current=null] : (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:885:2: ( (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:886:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:886:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:887:3: otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:895:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:896:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:896:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:897:5: lv_distance_2_0= ruleDOUBLE
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
    // InternalXDrone.g:922:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalXDrone.g:922:48: (iv_ruleForward= ruleForward EOF )
            // InternalXDrone.g:923:2: iv_ruleForward= ruleForward EOF
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
    // InternalXDrone.g:929:1: ruleForward returns [EObject current=null] : (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:935:2: ( (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:936:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:936:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:937:3: otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFORWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:945:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:946:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:946:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:947:5: lv_distance_2_0= ruleDOUBLE
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
    // InternalXDrone.g:972:1: entryRuleBackward returns [EObject current=null] : iv_ruleBackward= ruleBackward EOF ;
    public final EObject entryRuleBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackward = null;


        try {
            // InternalXDrone.g:972:49: (iv_ruleBackward= ruleBackward EOF )
            // InternalXDrone.g:973:2: iv_ruleBackward= ruleBackward EOF
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
    // InternalXDrone.g:979:1: ruleBackward returns [EObject current=null] : (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:985:2: ( (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:986:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:986:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:987:3: otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBackwardAccess().getBACKWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:995:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:996:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:996:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:997:5: lv_distance_2_0= ruleDOUBLE
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
    // InternalXDrone.g:1022:1: entryRuleRotateL returns [EObject current=null] : iv_ruleRotateL= ruleRotateL EOF ;
    public final EObject entryRuleRotateL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateL = null;


        try {
            // InternalXDrone.g:1022:48: (iv_ruleRotateL= ruleRotateL EOF )
            // InternalXDrone.g:1023:2: iv_ruleRotateL= ruleRotateL EOF
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
    // InternalXDrone.g:1029:1: ruleRotateL returns [EObject current=null] : (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_angle_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:1035:2: ( (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1036:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1036:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:1037:3: otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1045:3: ( (lv_angle_2_0= RULE_INT ) )
            // InternalXDrone.g:1046:4: (lv_angle_2_0= RULE_INT )
            {
            // InternalXDrone.g:1046:4: (lv_angle_2_0= RULE_INT )
            // InternalXDrone.g:1047:5: lv_angle_2_0= RULE_INT
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
    // InternalXDrone.g:1071:1: entryRuleRotateR returns [EObject current=null] : iv_ruleRotateR= ruleRotateR EOF ;
    public final EObject entryRuleRotateR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateR = null;


        try {
            // InternalXDrone.g:1071:48: (iv_ruleRotateR= ruleRotateR EOF )
            // InternalXDrone.g:1072:2: iv_ruleRotateR= ruleRotateR EOF
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
    // InternalXDrone.g:1078:1: ruleRotateR returns [EObject current=null] : (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_angle_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:1084:2: ( (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1085:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1085:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:1086:3: otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1094:3: ( (lv_angle_2_0= RULE_INT ) )
            // InternalXDrone.g:1095:4: (lv_angle_2_0= RULE_INT )
            {
            // InternalXDrone.g:1095:4: (lv_angle_2_0= RULE_INT )
            // InternalXDrone.g:1096:5: lv_angle_2_0= RULE_INT
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
    // InternalXDrone.g:1120:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalXDrone.g:1120:45: (iv_ruleWait= ruleWait EOF )
            // InternalXDrone.g:1121:2: iv_ruleWait= ruleWait EOF
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
    // InternalXDrone.g:1127:1: ruleWait returns [EObject current=null] : (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1133:2: ( (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1134:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1134:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:1135:3: otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWAITKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1143:3: ( (lv_seconds_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:1144:4: (lv_seconds_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1144:4: (lv_seconds_2_0= ruleDOUBLE )
            // InternalXDrone.g:1145:5: lv_seconds_2_0= ruleDOUBLE
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
    // InternalXDrone.g:1170:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalXDrone.g:1170:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalXDrone.g:1171:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalXDrone.g:1177:1: ruleFunctionName returns [EObject current=null] : ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_func_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXDrone.g:1183:2: ( ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalXDrone.g:1184:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalXDrone.g:1184:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalXDrone.g:1185:3: ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalXDrone.g:1185:3: ( (lv_func_name_0_0= RULE_ID ) )
            // InternalXDrone.g:1186:4: (lv_func_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:1186:4: (lv_func_name_0_0= RULE_ID )
            // InternalXDrone.g:1187:5: lv_func_name_0_0= RULE_ID
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
    // InternalXDrone.g:1211:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalXDrone.g:1211:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalXDrone.g:1212:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalXDrone.g:1218:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vector_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1224:2: ( (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) ) )
            // InternalXDrone.g:1225:2: (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1225:2: (otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) ) )
            // InternalXDrone.g:1226:3: otherlv_0= 'DRONE' ( (lv_vector_1_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDRONEKeyword_0());
            		
            // InternalXDrone.g:1230:3: ( (lv_vector_1_0= ruleVector ) )
            // InternalXDrone.g:1231:4: (lv_vector_1_0= ruleVector )
            {
            // InternalXDrone.g:1231:4: (lv_vector_1_0= ruleVector )
            // InternalXDrone.g:1232:5: lv_vector_1_0= ruleVector
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
    // InternalXDrone.g:1253:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalXDrone.g:1253:47: (iv_ruleObject= ruleObject EOF )
            // InternalXDrone.g:1254:2: iv_ruleObject= ruleObject EOF
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
    // InternalXDrone.g:1260:1: ruleObject returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalXDrone.g:1266:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalXDrone.g:1267:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalXDrone.g:1267:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) ) )
            // InternalXDrone.g:1268:3: ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalXDrone.g:1268:3: ( ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?) )
            // InternalXDrone.g:1269:4: ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup());
            			
            // InternalXDrone.g:1272:4: ( ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?)
            // InternalXDrone.g:1273:5: ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+ {...}?
            {
            // InternalXDrone.g:1273:5: ( ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    int LA9_1 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        alt9=3;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA9_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 36:
                    {
                    int LA9_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA9_5 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
                        alt9=3;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalXDrone.g:1274:3: ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1274:3: ({...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) ) )
            	    // InternalXDrone.g:1275:4: {...}? => ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalXDrone.g:1275:100: ( ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) ) )
            	    // InternalXDrone.g:1276:5: ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalXDrone.g:1279:8: ({...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) ) )
            	    // InternalXDrone.g:1279:9: {...}? => ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "true");
            	    }
            	    // InternalXDrone.g:1279:18: ( ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) ) )
            	    // InternalXDrone.g:1279:19: ( (lv_object_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_origin_3_0= ruleOrigin ) )
            	    {
            	    // InternalXDrone.g:1279:19: ( (lv_object_name_1_0= RULE_ID ) )
            	    // InternalXDrone.g:1280:9: (lv_object_name_1_0= RULE_ID )
            	    {
            	    // InternalXDrone.g:1280:9: (lv_object_name_1_0= RULE_ID )
            	    // InternalXDrone.g:1281:10: lv_object_name_1_0= RULE_ID
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
            	    							
            	    // InternalXDrone.g:1301:8: ( (lv_origin_3_0= ruleOrigin ) )
            	    // InternalXDrone.g:1302:9: (lv_origin_3_0= ruleOrigin )
            	    {
            	    // InternalXDrone.g:1302:9: (lv_origin_3_0= ruleOrigin )
            	    // InternalXDrone.g:1303:10: lv_origin_3_0= ruleOrigin
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
            	    // InternalXDrone.g:1326:3: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1326:3: ({...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) ) )
            	    // InternalXDrone.g:1327:4: {...}? => ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalXDrone.g:1327:100: ( ({...}? => ( (lv_size_4_0= ruleSize ) ) ) )
            	    // InternalXDrone.g:1328:5: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalXDrone.g:1331:8: ({...}? => ( (lv_size_4_0= ruleSize ) ) )
            	    // InternalXDrone.g:1331:9: {...}? => ( (lv_size_4_0= ruleSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "true");
            	    }
            	    // InternalXDrone.g:1331:18: ( (lv_size_4_0= ruleSize ) )
            	    // InternalXDrone.g:1331:19: (lv_size_4_0= ruleSize )
            	    {
            	    // InternalXDrone.g:1331:19: (lv_size_4_0= ruleSize )
            	    // InternalXDrone.g:1332:9: lv_size_4_0= ruleSize
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
            	    // InternalXDrone.g:1354:3: ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalXDrone.g:1354:3: ({...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) ) )
            	    // InternalXDrone.g:1355:4: {...}? => ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalXDrone.g:1355:100: ( ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) ) )
            	    // InternalXDrone.g:1356:5: ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalXDrone.g:1359:8: ({...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' ) )
            	    // InternalXDrone.g:1359:9: {...}? => ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleObject", "true");
            	    }
            	    // InternalXDrone.g:1359:18: ( ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}' )
            	    // InternalXDrone.g:1359:19: ( (lv_color_5_0= ruleColor ) )? otherlv_6= '}'
            	    {
            	    // InternalXDrone.g:1359:19: ( (lv_color_5_0= ruleColor ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==38) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalXDrone.g:1360:9: (lv_color_5_0= ruleColor )
            	            {
            	            // InternalXDrone.g:1360:9: (lv_color_5_0= ruleColor )
            	            // InternalXDrone.g:1361:10: lv_color_5_0= ruleColor
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
    // InternalXDrone.g:1399:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalXDrone.g:1399:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalXDrone.g:1400:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalXDrone.g:1406:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1412:2: ( (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1413:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1413:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1414:3: otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1422:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1423:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1423:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1424:5: lv_vector_2_0= ruleVector
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
    // InternalXDrone.g:1445:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXDrone.g:1445:45: (iv_ruleSize= ruleSize EOF )
            // InternalXDrone.g:1446:2: iv_ruleSize= ruleSize EOF
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
    // InternalXDrone.g:1452:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1458:2: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1459:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1459:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1460:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1468:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1469:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1469:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1470:5: lv_vector_2_0= ruleVector
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
    // InternalXDrone.g:1491:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalXDrone.g:1491:47: (iv_ruleVector= ruleVector EOF )
            // InternalXDrone.g:1492:2: iv_ruleVector= ruleVector EOF
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
    // InternalXDrone.g:1498:1: ruleVector returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
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
            // InternalXDrone.g:1504:2: ( (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalXDrone.g:1505:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalXDrone.g:1505:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalXDrone.g:1506:3: otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXDrone.g:1510:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalXDrone.g:1511:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1511:4: (lv_x_1_0= ruleDOUBLE )
            // InternalXDrone.g:1512:5: lv_x_1_0= ruleDOUBLE
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
            		
            // InternalXDrone.g:1533:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalXDrone.g:1534:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1534:4: (lv_y_3_0= ruleDOUBLE )
            // InternalXDrone.g:1535:5: lv_y_3_0= ruleDOUBLE
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
            		
            // InternalXDrone.g:1556:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalXDrone.g:1557:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1557:4: (lv_z_5_0= ruleDOUBLE )
            // InternalXDrone.g:1558:5: lv_z_5_0= ruleDOUBLE
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
    // InternalXDrone.g:1583:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXDrone.g:1583:46: (iv_ruleColor= ruleColor EOF )
            // InternalXDrone.g:1584:2: iv_ruleColor= ruleColor EOF
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
    // InternalXDrone.g:1590:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_color_value_2_0=null;


        	enterRule();

        try {
            // InternalXDrone.g:1596:2: ( (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) )
            // InternalXDrone.g:1597:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            {
            // InternalXDrone.g:1597:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            // InternalXDrone.g:1598:3: otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1606:3: ( (lv_color_value_2_0= RULE_STRING ) )
            // InternalXDrone.g:1607:4: (lv_color_value_2_0= RULE_STRING )
            {
            // InternalXDrone.g:1607:4: (lv_color_value_2_0= RULE_STRING )
            // InternalXDrone.g:1608:5: lv_color_value_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleWalls"
    // InternalXDrone.g:1628:1: entryRuleWalls returns [EObject current=null] : iv_ruleWalls= ruleWalls EOF ;
    public final EObject entryRuleWalls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalls = null;


        try {
            // InternalXDrone.g:1628:46: (iv_ruleWalls= ruleWalls EOF )
            // InternalXDrone.g:1629:2: iv_ruleWalls= ruleWalls EOF
            {
             newCompositeNode(grammarAccess.getWallsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWalls=ruleWalls();

            state._fsp--;

             current =iv_ruleWalls; 
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
    // $ANTLR end "entryRuleWalls"


    // $ANTLR start "ruleWalls"
    // InternalXDrone.g:1635:1: ruleWalls returns [EObject current=null] : (otherlv_0= 'WALLS' otherlv_1= '(' ( (lv_front_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ',' ( (lv_right_4_0= rulePOSITIVE_DOUBLE ) ) otherlv_5= ',' ( (lv_back_6_0= rulePOSITIVE_DOUBLE ) ) otherlv_7= ',' ( (lv_left_8_0= rulePOSITIVE_DOUBLE ) ) otherlv_9= ')' ) ;
    public final EObject ruleWalls() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_front_2_0 = null;

        AntlrDatatypeRuleToken lv_right_4_0 = null;

        AntlrDatatypeRuleToken lv_back_6_0 = null;

        AntlrDatatypeRuleToken lv_left_8_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1641:2: ( (otherlv_0= 'WALLS' otherlv_1= '(' ( (lv_front_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ',' ( (lv_right_4_0= rulePOSITIVE_DOUBLE ) ) otherlv_5= ',' ( (lv_back_6_0= rulePOSITIVE_DOUBLE ) ) otherlv_7= ',' ( (lv_left_8_0= rulePOSITIVE_DOUBLE ) ) otherlv_9= ')' ) )
            // InternalXDrone.g:1642:2: (otherlv_0= 'WALLS' otherlv_1= '(' ( (lv_front_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ',' ( (lv_right_4_0= rulePOSITIVE_DOUBLE ) ) otherlv_5= ',' ( (lv_back_6_0= rulePOSITIVE_DOUBLE ) ) otherlv_7= ',' ( (lv_left_8_0= rulePOSITIVE_DOUBLE ) ) otherlv_9= ')' )
            {
            // InternalXDrone.g:1642:2: (otherlv_0= 'WALLS' otherlv_1= '(' ( (lv_front_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ',' ( (lv_right_4_0= rulePOSITIVE_DOUBLE ) ) otherlv_5= ',' ( (lv_back_6_0= rulePOSITIVE_DOUBLE ) ) otherlv_7= ',' ( (lv_left_8_0= rulePOSITIVE_DOUBLE ) ) otherlv_9= ')' )
            // InternalXDrone.g:1643:3: otherlv_0= 'WALLS' otherlv_1= '(' ( (lv_front_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ',' ( (lv_right_4_0= rulePOSITIVE_DOUBLE ) ) otherlv_5= ',' ( (lv_back_6_0= rulePOSITIVE_DOUBLE ) ) otherlv_7= ',' ( (lv_left_8_0= rulePOSITIVE_DOUBLE ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWallsAccess().getWALLSKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWallsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1651:3: ( (lv_front_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1652:4: (lv_front_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1652:4: (lv_front_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1653:5: lv_front_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getWallsAccess().getFrontPOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_front_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallsRule());
            					}
            					set(
            						current,
            						"front",
            						lv_front_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getWallsAccess().getCommaKeyword_3());
            		
            // InternalXDrone.g:1674:3: ( (lv_right_4_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1675:4: (lv_right_4_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1675:4: (lv_right_4_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1676:5: lv_right_4_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getWallsAccess().getRightPOSITIVE_DOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_right_4_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallsRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_4_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getWallsAccess().getCommaKeyword_5());
            		
            // InternalXDrone.g:1697:3: ( (lv_back_6_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1698:4: (lv_back_6_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1698:4: (lv_back_6_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1699:5: lv_back_6_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getWallsAccess().getBackPOSITIVE_DOUBLEParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_back_6_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallsRule());
            					}
            					set(
            						current,
            						"back",
            						lv_back_6_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getWallsAccess().getCommaKeyword_7());
            		
            // InternalXDrone.g:1720:3: ( (lv_left_8_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1721:4: (lv_left_8_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1721:4: (lv_left_8_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1722:5: lv_left_8_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getWallsAccess().getLeftPOSITIVE_DOUBLEParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_12);
            lv_left_8_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallsRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_8_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWallsAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "ruleWalls"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000007FCC8020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000D100001020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000005000001022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}

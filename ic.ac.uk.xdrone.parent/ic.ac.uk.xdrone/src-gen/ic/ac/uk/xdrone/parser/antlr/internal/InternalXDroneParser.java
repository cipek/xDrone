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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fly(){'", "'}'", "'environment(){'", "'TAKEOFF()'", "'LAND()'", "'-'", "'.'", "'GOTO'", "'('", "')'", "'ROTATE'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'WAIT'", "'DRONE'", "'{'", "'rotation'", "'='", "'origin'", "'size'", "'position'", "','", "'color'", "'WALLS'", "'front'", "'right'", "'left'", "'back'", "'up'"
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

                if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=28)) ) {
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
                case 29:
                    {
                    alt3=1;
                    }
                    break;
                case 38:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_ID:
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
    // InternalXDrone.g:389:1: ruleSuperCommand returns [EObject current=null] : this_Command_0= ruleCommand ;
    public final EObject ruleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:395:2: (this_Command_0= ruleCommand )
            // InternalXDrone.g:396:2: this_Command_0= ruleCommand
            {

            		newCompositeNode(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Command_0=ruleCommand();

            state._fsp--;


            		current = this_Command_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalXDrone.g:407:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalXDrone.g:407:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalXDrone.g:408:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalXDrone.g:414:1: ruleCommand returns [EObject current=null] : (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_Wait_6= ruleWait | this_Rotate_7= ruleRotate | this_GoTo_8= ruleGoTo ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Up_0 = null;

        EObject this_Down_1 = null;

        EObject this_Left_2 = null;

        EObject this_Right_3 = null;

        EObject this_Forward_4 = null;

        EObject this_Backward_5 = null;

        EObject this_Wait_6 = null;

        EObject this_Rotate_7 = null;

        EObject this_GoTo_8 = null;



        	enterRule();

        try {
            // InternalXDrone.g:420:2: ( (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_Wait_6= ruleWait | this_Rotate_7= ruleRotate | this_GoTo_8= ruleGoTo ) )
            // InternalXDrone.g:421:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_Wait_6= ruleWait | this_Rotate_7= ruleRotate | this_GoTo_8= ruleGoTo )
            {
            // InternalXDrone.g:421:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_Wait_6= ruleWait | this_Rotate_7= ruleRotate | this_GoTo_8= ruleGoTo )
            int alt4=9;
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
            case 21:
                {
                alt4=8;
                }
                break;
            case 18:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:422:3: this_Up_0= ruleUp
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
                    // InternalXDrone.g:431:3: this_Down_1= ruleDown
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
                    // InternalXDrone.g:440:3: this_Left_2= ruleLeft
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
                    // InternalXDrone.g:449:3: this_Right_3= ruleRight
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
                    // InternalXDrone.g:458:3: this_Forward_4= ruleForward
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
                    // InternalXDrone.g:467:3: this_Backward_5= ruleBackward
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
                    // InternalXDrone.g:476:3: this_Wait_6= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWaitParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_6=ruleWait();

                    state._fsp--;


                    			current = this_Wait_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXDrone.g:485:3: this_Rotate_7= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_7=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXDrone.g:494:3: this_GoTo_8= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGoToParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_8=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_8;
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
    // InternalXDrone.g:506:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalXDrone.g:506:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalXDrone.g:507:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalXDrone.g:513:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_1 = null;

        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_2 = null;



        	enterRule();

        try {
            // InternalXDrone.g:519:2: ( ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:520:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:520:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:521:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:521:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:522:4: kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE
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
                    // InternalXDrone.g:539:3: this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:553:1: entryRulePOSITIVE_DOUBLE returns [String current=null] : iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF ;
    public final String entryRulePOSITIVE_DOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOSITIVE_DOUBLE = null;


        try {
            // InternalXDrone.g:553:55: (iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF )
            // InternalXDrone.g:554:2: iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF
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
    // InternalXDrone.g:560:1: rulePOSITIVE_DOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePOSITIVE_DOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:566:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) )
            // InternalXDrone.g:567:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            {
            // InternalXDrone.g:567:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==12||LA6_1==20||LA6_1==31||(LA6_1>=35 && LA6_1<=36)||(LA6_1>=39 && LA6_1<=43)) ) {
                    alt6=2;
                }
                else if ( (LA6_1==17) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:568:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // InternalXDrone.g:568:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // InternalXDrone.g:569:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
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
                    // InternalXDrone.g:590:3: this_INT_3= RULE_INT
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


    // $ANTLR start "entryRuleGoTo"
    // InternalXDrone.g:601:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalXDrone.g:601:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalXDrone.g:602:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalXDrone.g:608:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_object_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:614:2: ( (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:615:2: (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:615:2: (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalXDrone.g:616:3: otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGOTOKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:624:3: ( (lv_object_name_2_0= RULE_STRING ) )
            // InternalXDrone.g:625:4: (lv_object_name_2_0= RULE_STRING )
            {
            // InternalXDrone.g:625:4: (lv_object_name_2_0= RULE_STRING )
            // InternalXDrone.g:626:5: lv_object_name_2_0= RULE_STRING
            {
            lv_object_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_object_name_2_0, grammarAccess.getGoToAccess().getObject_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"object_name",
            						lv_object_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGoToAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleRotate"
    // InternalXDrone.g:650:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalXDrone.g:650:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalXDrone.g:651:2: iv_ruleRotate= ruleRotate EOF
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
    // InternalXDrone.g:657:1: ruleRotate returns [EObject current=null] : (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:663:2: ( (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:664:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:664:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:665:3: otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getROTATEKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:673:3: ( (lv_angle_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:674:4: (lv_angle_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:674:4: (lv_angle_2_0= ruleDOUBLE )
            // InternalXDrone.g:675:5: lv_angle_2_0= ruleDOUBLE
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:700:1: entryRuleUp returns [EObject current=null] : iv_ruleUp= ruleUp EOF ;
    public final EObject entryRuleUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUp = null;


        try {
            // InternalXDrone.g:700:43: (iv_ruleUp= ruleUp EOF )
            // InternalXDrone.g:701:2: iv_ruleUp= ruleUp EOF
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
    // InternalXDrone.g:707:1: ruleUp returns [EObject current=null] : (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:713:2: ( (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:714:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:714:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:715:3: otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUPKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:723:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:724:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:724:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:725:5: lv_distance_2_0= ruleDOUBLE
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:750:1: entryRuleDown returns [EObject current=null] : iv_ruleDown= ruleDown EOF ;
    public final EObject entryRuleDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDown = null;


        try {
            // InternalXDrone.g:750:45: (iv_ruleDown= ruleDown EOF )
            // InternalXDrone.g:751:2: iv_ruleDown= ruleDown EOF
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
    // InternalXDrone.g:757:1: ruleDown returns [EObject current=null] : (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:763:2: ( (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:764:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:764:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:765:3: otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDownAccess().getDOWNKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:773:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:774:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:774:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:775:5: lv_distance_2_0= ruleDOUBLE
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:800:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalXDrone.g:800:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalXDrone.g:801:2: iv_ruleLeft= ruleLeft EOF
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
    // InternalXDrone.g:807:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:813:2: ( (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:814:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:814:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:815:3: otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:823:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:824:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:824:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:825:5: lv_distance_2_0= ruleDOUBLE
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:850:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalXDrone.g:850:46: (iv_ruleRight= ruleRight EOF )
            // InternalXDrone.g:851:2: iv_ruleRight= ruleRight EOF
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
    // InternalXDrone.g:857:1: ruleRight returns [EObject current=null] : (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:863:2: ( (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:864:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:864:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:865:3: otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:873:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:874:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:874:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:875:5: lv_distance_2_0= ruleDOUBLE
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:900:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalXDrone.g:900:48: (iv_ruleForward= ruleForward EOF )
            // InternalXDrone.g:901:2: iv_ruleForward= ruleForward EOF
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
    // InternalXDrone.g:907:1: ruleForward returns [EObject current=null] : (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:913:2: ( (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:914:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:914:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:915:3: otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFORWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:923:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:924:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:924:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:925:5: lv_distance_2_0= ruleDOUBLE
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:950:1: entryRuleBackward returns [EObject current=null] : iv_ruleBackward= ruleBackward EOF ;
    public final EObject entryRuleBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackward = null;


        try {
            // InternalXDrone.g:950:49: (iv_ruleBackward= ruleBackward EOF )
            // InternalXDrone.g:951:2: iv_ruleBackward= ruleBackward EOF
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
    // InternalXDrone.g:957:1: ruleBackward returns [EObject current=null] : (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:963:2: ( (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:964:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:964:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:965:3: otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBackwardAccess().getBACKWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:973:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:974:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:974:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:975:5: lv_distance_2_0= ruleDOUBLE
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:1000:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalXDrone.g:1000:45: (iv_ruleWait= ruleWait EOF )
            // InternalXDrone.g:1001:2: iv_ruleWait= ruleWait EOF
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
    // InternalXDrone.g:1007:1: ruleWait returns [EObject current=null] : (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1013:2: ( (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1014:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1014:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:1015:3: otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWAITKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1023:3: ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1024:4: (lv_seconds_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1024:4: (lv_seconds_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1025:5: lv_seconds_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_seconds_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"seconds",
            						lv_seconds_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDrone"
    // InternalXDrone.g:1050:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalXDrone.g:1050:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalXDrone.g:1051:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalXDrone.g:1057:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_position_2_0 = null;

        AntlrDatatypeRuleToken lv_rotation_5_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1063:2: ( (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' ) )
            // InternalXDrone.g:1064:2: (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' )
            {
            // InternalXDrone.g:1064:2: (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' )
            // InternalXDrone.g:1065:3: otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDRONEKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDrone.g:1073:3: ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }
                else if ( (LA7_0==31) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXDrone.g:1074:4: ( (lv_position_2_0= rulePosition ) )
            	    {
            	    // InternalXDrone.g:1074:4: ( (lv_position_2_0= rulePosition ) )
            	    // InternalXDrone.g:1075:5: (lv_position_2_0= rulePosition )
            	    {
            	    // InternalXDrone.g:1075:5: (lv_position_2_0= rulePosition )
            	    // InternalXDrone.g:1076:6: lv_position_2_0= rulePosition
            	    {

            	    						newCompositeNode(grammarAccess.getDroneAccess().getPositionPositionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_position_2_0=rulePosition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDroneRule());
            	    						}
            	    						set(
            	    							current,
            	    							"position",
            	    							lv_position_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.Position");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1094:4: (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) )
            	    {
            	    // InternalXDrone.g:1094:4: (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) )
            	    // InternalXDrone.g:1095:5: otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) )
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_16); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getRotationKeyword_2_1_0());
            	    				
            	    otherlv_4=(Token)match(input,32,FOLLOW_13); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getEqualsSignKeyword_2_1_1());
            	    				
            	    // InternalXDrone.g:1103:5: ( (lv_rotation_5_0= ruleDOUBLE ) )
            	    // InternalXDrone.g:1104:6: (lv_rotation_5_0= ruleDOUBLE )
            	    {
            	    // InternalXDrone.g:1104:6: (lv_rotation_5_0= ruleDOUBLE )
            	    // InternalXDrone.g:1105:7: lv_rotation_5_0= ruleDOUBLE
            	    {

            	    							newCompositeNode(grammarAccess.getDroneAccess().getRotationDOUBLEParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_rotation_5_0=ruleDOUBLE();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDroneRule());
            	    							}
            	    							set(
            	    								current,
            	    								"rotation",
            	    								lv_rotation_5_0,
            	    								"ic.ac.uk.xdrone.XDrone.DOUBLE");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalXDrone.g:1132:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalXDrone.g:1132:47: (iv_ruleObject= ruleObject EOF )
            // InternalXDrone.g:1133:2: iv_ruleObject= ruleObject EOF
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
    // InternalXDrone.g:1139:1: ruleObject returns [EObject current=null] : ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_object_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_origin_2_0 = null;

        EObject lv_size_3_0 = null;

        EObject lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1145:2: ( ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' ) )
            // InternalXDrone.g:1146:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' )
            {
            // InternalXDrone.g:1146:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' )
            // InternalXDrone.g:1147:3: ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}'
            {
            // InternalXDrone.g:1147:3: ( (lv_object_name_0_0= RULE_ID ) )
            // InternalXDrone.g:1148:4: (lv_object_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:1148:4: (lv_object_name_0_0= RULE_ID )
            // InternalXDrone.g:1149:5: lv_object_name_0_0= RULE_ID
            {
            lv_object_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_object_name_0_0, grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"object_name",
            						lv_object_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDrone.g:1169:3: ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt8=1;
                    }
                    break;
                case 34:
                    {
                    alt8=2;
                    }
                    break;
                case 37:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalXDrone.g:1170:4: ( (lv_origin_2_0= ruleOrigin ) )
            	    {
            	    // InternalXDrone.g:1170:4: ( (lv_origin_2_0= ruleOrigin ) )
            	    // InternalXDrone.g:1171:5: (lv_origin_2_0= ruleOrigin )
            	    {
            	    // InternalXDrone.g:1171:5: (lv_origin_2_0= ruleOrigin )
            	    // InternalXDrone.g:1172:6: lv_origin_2_0= ruleOrigin
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_origin_2_0=ruleOrigin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"origin",
            	    							lv_origin_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.Origin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1190:4: ( (lv_size_3_0= ruleSize ) )
            	    {
            	    // InternalXDrone.g:1190:4: ( (lv_size_3_0= ruleSize ) )
            	    // InternalXDrone.g:1191:5: (lv_size_3_0= ruleSize )
            	    {
            	    // InternalXDrone.g:1191:5: (lv_size_3_0= ruleSize )
            	    // InternalXDrone.g:1192:6: lv_size_3_0= ruleSize
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_size_3_0=ruleSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"size",
            	    							lv_size_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.Size");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:1210:4: ( (lv_color_4_0= ruleColor ) )
            	    {
            	    // InternalXDrone.g:1210:4: ( (lv_color_4_0= ruleColor ) )
            	    // InternalXDrone.g:1211:5: (lv_color_4_0= ruleColor )
            	    {
            	    // InternalXDrone.g:1211:5: (lv_color_4_0= ruleColor )
            	    // InternalXDrone.g:1212:6: lv_color_4_0= ruleColor
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_color_4_0=ruleColor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"color",
            	    							lv_color_4_0,
            	    							"ic.ac.uk.xdrone.XDrone.Color");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalXDrone.g:1238:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalXDrone.g:1238:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalXDrone.g:1239:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalXDrone.g:1245:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1251:2: ( (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1252:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1252:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1253:3: otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1261:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1262:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1262:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1263:5: lv_vector_2_0= ruleVector
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
    // InternalXDrone.g:1284:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXDrone.g:1284:45: (iv_ruleSize= ruleSize EOF )
            // InternalXDrone.g:1285:2: iv_ruleSize= ruleSize EOF
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
    // InternalXDrone.g:1291:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1297:2: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1298:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1298:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1299:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1307:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1308:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1308:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1309:5: lv_vector_2_0= ruleVector
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


    // $ANTLR start "entryRulePosition"
    // InternalXDrone.g:1330:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalXDrone.g:1330:49: (iv_rulePosition= rulePosition EOF )
            // InternalXDrone.g:1331:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalXDrone.g:1337:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1343:2: ( (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1344:2: (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1344:2: (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1345:3: otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1353:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1354:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1354:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1355:5: lv_vector_2_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getVectorVectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_2_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleVector"
    // InternalXDrone.g:1376:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalXDrone.g:1376:47: (iv_ruleVector= ruleVector EOF )
            // InternalXDrone.g:1377:2: iv_ruleVector= ruleVector EOF
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
    // InternalXDrone.g:1383:1: ruleVector returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
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
            // InternalXDrone.g:1389:2: ( (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalXDrone.g:1390:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalXDrone.g:1390:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalXDrone.g:1391:3: otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXDrone.g:1395:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalXDrone.g:1396:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1396:4: (lv_x_1_0= ruleDOUBLE )
            // InternalXDrone.g:1397:5: lv_x_1_0= ruleDOUBLE
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

            otherlv_2=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getCommaKeyword_2());
            		
            // InternalXDrone.g:1418:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalXDrone.g:1419:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1419:4: (lv_y_3_0= ruleDOUBLE )
            // InternalXDrone.g:1420:5: lv_y_3_0= ruleDOUBLE
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

            otherlv_4=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getCommaKeyword_4());
            		
            // InternalXDrone.g:1441:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalXDrone.g:1442:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1442:4: (lv_z_5_0= ruleDOUBLE )
            // InternalXDrone.g:1443:5: lv_z_5_0= ruleDOUBLE
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:1468:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXDrone.g:1468:46: (iv_ruleColor= ruleColor EOF )
            // InternalXDrone.g:1469:2: iv_ruleColor= ruleColor EOF
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
    // InternalXDrone.g:1475:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_color_value_2_0=null;


        	enterRule();

        try {
            // InternalXDrone.g:1481:2: ( (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) )
            // InternalXDrone.g:1482:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            {
            // InternalXDrone.g:1482:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            // InternalXDrone.g:1483:3: otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1491:3: ( (lv_color_value_2_0= RULE_STRING ) )
            // InternalXDrone.g:1492:4: (lv_color_value_2_0= RULE_STRING )
            {
            // InternalXDrone.g:1492:4: (lv_color_value_2_0= RULE_STRING )
            // InternalXDrone.g:1493:5: lv_color_value_2_0= RULE_STRING
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
    // InternalXDrone.g:1513:1: entryRuleWalls returns [EObject current=null] : iv_ruleWalls= ruleWalls EOF ;
    public final EObject entryRuleWalls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalls = null;


        try {
            // InternalXDrone.g:1513:46: (iv_ruleWalls= ruleWalls EOF )
            // InternalXDrone.g:1514:2: iv_ruleWalls= ruleWalls EOF
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
    // InternalXDrone.g:1520:1: ruleWalls returns [EObject current=null] : (otherlv_0= 'WALLS' otherlv_1= '{' ( ( (lv_front_2_0= ruleFrontWall ) ) | ( (lv_right_3_0= ruleRightWall ) ) | ( (lv_back_4_0= ruleBackWall ) ) | ( (lv_left_5_0= ruleLeftWall ) ) | ( (lv_up_6_0= ruleUpWall ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleWalls() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_7=null;
        EObject lv_front_2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_back_4_0 = null;

        EObject lv_left_5_0 = null;

        EObject lv_up_6_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1526:2: ( (otherlv_0= 'WALLS' otherlv_1= '{' ( ( (lv_front_2_0= ruleFrontWall ) ) | ( (lv_right_3_0= ruleRightWall ) ) | ( (lv_back_4_0= ruleBackWall ) ) | ( (lv_left_5_0= ruleLeftWall ) ) | ( (lv_up_6_0= ruleUpWall ) ) )* otherlv_7= '}' ) )
            // InternalXDrone.g:1527:2: (otherlv_0= 'WALLS' otherlv_1= '{' ( ( (lv_front_2_0= ruleFrontWall ) ) | ( (lv_right_3_0= ruleRightWall ) ) | ( (lv_back_4_0= ruleBackWall ) ) | ( (lv_left_5_0= ruleLeftWall ) ) | ( (lv_up_6_0= ruleUpWall ) ) )* otherlv_7= '}' )
            {
            // InternalXDrone.g:1527:2: (otherlv_0= 'WALLS' otherlv_1= '{' ( ( (lv_front_2_0= ruleFrontWall ) ) | ( (lv_right_3_0= ruleRightWall ) ) | ( (lv_back_4_0= ruleBackWall ) ) | ( (lv_left_5_0= ruleLeftWall ) ) | ( (lv_up_6_0= ruleUpWall ) ) )* otherlv_7= '}' )
            // InternalXDrone.g:1528:3: otherlv_0= 'WALLS' otherlv_1= '{' ( ( (lv_front_2_0= ruleFrontWall ) ) | ( (lv_right_3_0= ruleRightWall ) ) | ( (lv_back_4_0= ruleBackWall ) ) | ( (lv_left_5_0= ruleLeftWall ) ) | ( (lv_up_6_0= ruleUpWall ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWallsAccess().getWALLSKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDrone.g:1536:3: ( ( (lv_front_2_0= ruleFrontWall ) ) | ( (lv_right_3_0= ruleRightWall ) ) | ( (lv_back_4_0= ruleBackWall ) ) | ( (lv_left_5_0= ruleLeftWall ) ) | ( (lv_up_6_0= ruleUpWall ) ) )*
            loop9:
            do {
                int alt9=6;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    alt9=1;
                    }
                    break;
                case 40:
                    {
                    alt9=2;
                    }
                    break;
                case 42:
                    {
                    alt9=3;
                    }
                    break;
                case 41:
                    {
                    alt9=4;
                    }
                    break;
                case 43:
                    {
                    alt9=5;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalXDrone.g:1537:4: ( (lv_front_2_0= ruleFrontWall ) )
            	    {
            	    // InternalXDrone.g:1537:4: ( (lv_front_2_0= ruleFrontWall ) )
            	    // InternalXDrone.g:1538:5: (lv_front_2_0= ruleFrontWall )
            	    {
            	    // InternalXDrone.g:1538:5: (lv_front_2_0= ruleFrontWall )
            	    // InternalXDrone.g:1539:6: lv_front_2_0= ruleFrontWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getFrontFrontWallParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_front_2_0=ruleFrontWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"front",
            	    							lv_front_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.FrontWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1557:4: ( (lv_right_3_0= ruleRightWall ) )
            	    {
            	    // InternalXDrone.g:1557:4: ( (lv_right_3_0= ruleRightWall ) )
            	    // InternalXDrone.g:1558:5: (lv_right_3_0= ruleRightWall )
            	    {
            	    // InternalXDrone.g:1558:5: (lv_right_3_0= ruleRightWall )
            	    // InternalXDrone.g:1559:6: lv_right_3_0= ruleRightWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getRightRightWallParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleRightWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.RightWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:1577:4: ( (lv_back_4_0= ruleBackWall ) )
            	    {
            	    // InternalXDrone.g:1577:4: ( (lv_back_4_0= ruleBackWall ) )
            	    // InternalXDrone.g:1578:5: (lv_back_4_0= ruleBackWall )
            	    {
            	    // InternalXDrone.g:1578:5: (lv_back_4_0= ruleBackWall )
            	    // InternalXDrone.g:1579:6: lv_back_4_0= ruleBackWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getBackBackWallParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_back_4_0=ruleBackWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"back",
            	    							lv_back_4_0,
            	    							"ic.ac.uk.xdrone.XDrone.BackWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDrone.g:1597:4: ( (lv_left_5_0= ruleLeftWall ) )
            	    {
            	    // InternalXDrone.g:1597:4: ( (lv_left_5_0= ruleLeftWall ) )
            	    // InternalXDrone.g:1598:5: (lv_left_5_0= ruleLeftWall )
            	    {
            	    // InternalXDrone.g:1598:5: (lv_left_5_0= ruleLeftWall )
            	    // InternalXDrone.g:1599:6: lv_left_5_0= ruleLeftWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getLeftLeftWallParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_left_5_0=ruleLeftWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"left",
            	    							lv_left_5_0,
            	    							"ic.ac.uk.xdrone.XDrone.LeftWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDrone.g:1617:4: ( (lv_up_6_0= ruleUpWall ) )
            	    {
            	    // InternalXDrone.g:1617:4: ( (lv_up_6_0= ruleUpWall ) )
            	    // InternalXDrone.g:1618:5: (lv_up_6_0= ruleUpWall )
            	    {
            	    // InternalXDrone.g:1618:5: (lv_up_6_0= ruleUpWall )
            	    // InternalXDrone.g:1619:6: lv_up_6_0= ruleUpWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getUpUpWallParserRuleCall_2_4_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_up_6_0=ruleUpWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"up",
            	    							lv_up_6_0,
            	    							"ic.ac.uk.xdrone.XDrone.UpWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleFrontWall"
    // InternalXDrone.g:1645:1: entryRuleFrontWall returns [EObject current=null] : iv_ruleFrontWall= ruleFrontWall EOF ;
    public final EObject entryRuleFrontWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrontWall = null;


        try {
            // InternalXDrone.g:1645:50: (iv_ruleFrontWall= ruleFrontWall EOF )
            // InternalXDrone.g:1646:2: iv_ruleFrontWall= ruleFrontWall EOF
            {
             newCompositeNode(grammarAccess.getFrontWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrontWall=ruleFrontWall();

            state._fsp--;

             current =iv_ruleFrontWall; 
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
    // $ANTLR end "entryRuleFrontWall"


    // $ANTLR start "ruleFrontWall"
    // InternalXDrone.g:1652:1: ruleFrontWall returns [EObject current=null] : (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleFrontWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1658:2: ( (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1659:2: (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1659:2: (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1660:3: otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontWallAccess().getFrontKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFrontWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1668:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1669:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1669:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1670:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getFrontWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrontWallRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
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
    // $ANTLR end "ruleFrontWall"


    // $ANTLR start "entryRuleRightWall"
    // InternalXDrone.g:1691:1: entryRuleRightWall returns [EObject current=null] : iv_ruleRightWall= ruleRightWall EOF ;
    public final EObject entryRuleRightWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightWall = null;


        try {
            // InternalXDrone.g:1691:50: (iv_ruleRightWall= ruleRightWall EOF )
            // InternalXDrone.g:1692:2: iv_ruleRightWall= ruleRightWall EOF
            {
             newCompositeNode(grammarAccess.getRightWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightWall=ruleRightWall();

            state._fsp--;

             current =iv_ruleRightWall; 
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
    // $ANTLR end "entryRuleRightWall"


    // $ANTLR start "ruleRightWall"
    // InternalXDrone.g:1698:1: ruleRightWall returns [EObject current=null] : (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleRightWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1704:2: ( (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1705:2: (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1705:2: (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1706:3: otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getRightWallAccess().getRightKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRightWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1714:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1715:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1715:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1716:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getRightWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightWallRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
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
    // $ANTLR end "ruleRightWall"


    // $ANTLR start "entryRuleLeftWall"
    // InternalXDrone.g:1737:1: entryRuleLeftWall returns [EObject current=null] : iv_ruleLeftWall= ruleLeftWall EOF ;
    public final EObject entryRuleLeftWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftWall = null;


        try {
            // InternalXDrone.g:1737:49: (iv_ruleLeftWall= ruleLeftWall EOF )
            // InternalXDrone.g:1738:2: iv_ruleLeftWall= ruleLeftWall EOF
            {
             newCompositeNode(grammarAccess.getLeftWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftWall=ruleLeftWall();

            state._fsp--;

             current =iv_ruleLeftWall; 
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
    // $ANTLR end "entryRuleLeftWall"


    // $ANTLR start "ruleLeftWall"
    // InternalXDrone.g:1744:1: ruleLeftWall returns [EObject current=null] : (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleLeftWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1750:2: ( (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1751:2: (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1751:2: (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1752:3: otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftWallAccess().getLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1760:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1761:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1761:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1762:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getLeftWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftWallRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
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
    // $ANTLR end "ruleLeftWall"


    // $ANTLR start "entryRuleBackWall"
    // InternalXDrone.g:1783:1: entryRuleBackWall returns [EObject current=null] : iv_ruleBackWall= ruleBackWall EOF ;
    public final EObject entryRuleBackWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackWall = null;


        try {
            // InternalXDrone.g:1783:49: (iv_ruleBackWall= ruleBackWall EOF )
            // InternalXDrone.g:1784:2: iv_ruleBackWall= ruleBackWall EOF
            {
             newCompositeNode(grammarAccess.getBackWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackWall=ruleBackWall();

            state._fsp--;

             current =iv_ruleBackWall; 
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
    // $ANTLR end "entryRuleBackWall"


    // $ANTLR start "ruleBackWall"
    // InternalXDrone.g:1790:1: ruleBackWall returns [EObject current=null] : (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleBackWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1796:2: ( (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1797:2: (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1797:2: (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1798:3: otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBackWallAccess().getBackKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBackWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1806:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1807:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1807:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1808:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getBackWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackWallRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
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
    // $ANTLR end "ruleBackWall"


    // $ANTLR start "entryRuleUpWall"
    // InternalXDrone.g:1829:1: entryRuleUpWall returns [EObject current=null] : iv_ruleUpWall= ruleUpWall EOF ;
    public final EObject entryRuleUpWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpWall = null;


        try {
            // InternalXDrone.g:1829:47: (iv_ruleUpWall= ruleUpWall EOF )
            // InternalXDrone.g:1830:2: iv_ruleUpWall= ruleUpWall EOF
            {
             newCompositeNode(grammarAccess.getUpWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpWall=ruleUpWall();

            state._fsp--;

             current =iv_ruleUpWall; 
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
    // $ANTLR end "entryRuleUpWall"


    // $ANTLR start "ruleUpWall"
    // InternalXDrone.g:1836:1: ruleUpWall returns [EObject current=null] : (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleUpWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1842:2: ( (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1843:2: (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1843:2: (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1844:3: otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getUpWallAccess().getUpKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUpWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1852:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1853:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1853:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1854:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getUpWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpWallRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
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
    // $ANTLR end "ruleUpWall"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001FE48000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004020001040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000880001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002600001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000F8000001000L});

}
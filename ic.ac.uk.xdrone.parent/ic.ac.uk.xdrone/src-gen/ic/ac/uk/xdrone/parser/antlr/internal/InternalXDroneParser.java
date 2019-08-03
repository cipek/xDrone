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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fly(){'", "'}'", "'environment(){'", "'TAKEOFF()'", "'LAND()'", "'.'", "'-'", "'UP'", "'('", "')'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'()'", "'DRONE'", "','"
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

                if ( (LA1_0==RULE_ID||LA1_0==18||(LA1_0>=21 && LA1_0<=28)) ) {
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
    // InternalXDrone.g:214:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'environment(){' ( (lv_drone_2_0= ruleDrone ) )? ( (lv_objects_3_0= ruleObject ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_drone_2_0 = null;

        EObject lv_objects_3_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:220:2: ( ( () otherlv_1= 'environment(){' ( (lv_drone_2_0= ruleDrone ) )? ( (lv_objects_3_0= ruleObject ) )* otherlv_4= '}' ) )
            // InternalXDrone.g:221:2: ( () otherlv_1= 'environment(){' ( (lv_drone_2_0= ruleDrone ) )? ( (lv_objects_3_0= ruleObject ) )* otherlv_4= '}' )
            {
            // InternalXDrone.g:221:2: ( () otherlv_1= 'environment(){' ( (lv_drone_2_0= ruleDrone ) )? ( (lv_objects_3_0= ruleObject ) )* otherlv_4= '}' )
            // InternalXDrone.g:222:3: () otherlv_1= 'environment(){' ( (lv_drone_2_0= ruleDrone ) )? ( (lv_objects_3_0= ruleObject ) )* otherlv_4= '}'
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
            		
            // InternalXDrone.g:233:3: ( (lv_drone_2_0= ruleDrone ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXDrone.g:234:4: (lv_drone_2_0= ruleDrone )
                    {
                    // InternalXDrone.g:234:4: (lv_drone_2_0= ruleDrone )
                    // InternalXDrone.g:235:5: lv_drone_2_0= ruleDrone
                    {

                    					newCompositeNode(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
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
                    break;

            }

            // InternalXDrone.g:252:3: ( (lv_objects_3_0= ruleObject ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXDrone.g:253:4: (lv_objects_3_0= ruleObject )
            	    {
            	    // InternalXDrone.g:253:4: (lv_objects_3_0= ruleObject )
            	    // InternalXDrone.g:254:5: lv_objects_3_0= ruleObject
            	    {

            	    					newCompositeNode(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalXDrone.g:279:1: entryRuleTakeoff returns [String current=null] : iv_ruleTakeoff= ruleTakeoff EOF ;
    public final String entryRuleTakeoff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTakeoff = null;


        try {
            // InternalXDrone.g:279:47: (iv_ruleTakeoff= ruleTakeoff EOF )
            // InternalXDrone.g:280:2: iv_ruleTakeoff= ruleTakeoff EOF
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
    // InternalXDrone.g:286:1: ruleTakeoff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TAKEOFF()' ;
    public final AntlrDatatypeRuleToken ruleTakeoff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:292:2: (kw= 'TAKEOFF()' )
            // InternalXDrone.g:293:2: kw= 'TAKEOFF()'
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
    // InternalXDrone.g:301:1: entryRuleLand returns [String current=null] : iv_ruleLand= ruleLand EOF ;
    public final String entryRuleLand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLand = null;


        try {
            // InternalXDrone.g:301:44: (iv_ruleLand= ruleLand EOF )
            // InternalXDrone.g:302:2: iv_ruleLand= ruleLand EOF
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
    // InternalXDrone.g:308:1: ruleLand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LAND()' ;
    public final AntlrDatatypeRuleToken ruleLand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:314:2: (kw= 'LAND()' )
            // InternalXDrone.g:315:2: kw= 'LAND()'
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
    // InternalXDrone.g:323:1: entryRuleSuperCommand returns [EObject current=null] : iv_ruleSuperCommand= ruleSuperCommand EOF ;
    public final EObject entryRuleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperCommand = null;


        try {
            // InternalXDrone.g:323:53: (iv_ruleSuperCommand= ruleSuperCommand EOF )
            // InternalXDrone.g:324:2: iv_ruleSuperCommand= ruleSuperCommand EOF
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
    // InternalXDrone.g:330:1: ruleSuperCommand returns [EObject current=null] : (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) ;
    public final EObject ruleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_FunctionName_1 = null;



        	enterRule();

        try {
            // InternalXDrone.g:336:2: ( (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) )
            // InternalXDrone.g:337:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            {
            // InternalXDrone.g:337:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18||(LA4_0>=21 && LA4_0<=28)) ) {
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
                    // InternalXDrone.g:338:3: this_Command_0= ruleCommand
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
                    // InternalXDrone.g:347:3: this_FunctionName_1= ruleFunctionName
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
    // InternalXDrone.g:359:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalXDrone.g:359:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalXDrone.g:360:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalXDrone.g:366:1: ruleCommand returns [EObject current=null] : (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait ) ;
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



        	enterRule();

        try {
            // InternalXDrone.g:372:2: ( (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait ) )
            // InternalXDrone.g:373:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait )
            {
            // InternalXDrone.g:373:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            case 27:
                {
                alt5=8;
                }
                break;
            case 28:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:374:3: this_Up_0= ruleUp
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
                    // InternalXDrone.g:383:3: this_Down_1= ruleDown
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
                    // InternalXDrone.g:392:3: this_Left_2= ruleLeft
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
                    // InternalXDrone.g:401:3: this_Right_3= ruleRight
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
                    // InternalXDrone.g:410:3: this_Forward_4= ruleForward
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
                    // InternalXDrone.g:419:3: this_Backward_5= ruleBackward
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
                    // InternalXDrone.g:428:3: this_RotateL_6= ruleRotateL
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
                    // InternalXDrone.g:437:3: this_RotateR_7= ruleRotateR
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
                    // InternalXDrone.g:446:3: this_Wait_8= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWaitParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_8=ruleWait();

                    state._fsp--;


                    			current = this_Wait_8;
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
    // InternalXDrone.g:458:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalXDrone.g:458:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalXDrone.g:459:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalXDrone.g:465:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) ) ;
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
            // InternalXDrone.g:471:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) ) )
            // InternalXDrone.g:472:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) )
            {
            // InternalXDrone.g:472:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) | this_INT_7= RULE_INT | (kw= '-' this_INT_9= RULE_INT ) )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==16) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==20||LA6_1==31) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==17) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_INT) ) {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==EOF||LA6_5==20||LA6_5==31) ) {
                        alt6=4;
                    }
                    else if ( (LA6_5==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

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
                    // InternalXDrone.g:473:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // InternalXDrone.g:473:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // InternalXDrone.g:474:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,16,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:495:3: (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
                    {
                    // InternalXDrone.g:495:3: (kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
                    // InternalXDrone.g:496:4: kw= '-' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,17,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_1_0());
                    			
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1());
                    			
                    kw=(Token)match(input,16,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_2());
                    			
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:522:3: this_INT_7= RULE_INT
                    {
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_7);
                    		

                    			newLeafNode(this_INT_7, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXDrone.g:530:3: (kw= '-' this_INT_9= RULE_INT )
                    {
                    // InternalXDrone.g:530:3: (kw= '-' this_INT_9= RULE_INT )
                    // InternalXDrone.g:531:4: kw= '-' this_INT_9= RULE_INT
                    {
                    kw=(Token)match(input,17,FOLLOW_10); 

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


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:548:1: entryRuleUp returns [EObject current=null] : iv_ruleUp= ruleUp EOF ;
    public final EObject entryRuleUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUp = null;


        try {
            // InternalXDrone.g:548:43: (iv_ruleUp= ruleUp EOF )
            // InternalXDrone.g:549:2: iv_ruleUp= ruleUp EOF
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
    // InternalXDrone.g:555:1: ruleUp returns [EObject current=null] : (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:561:2: ( (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:562:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:562:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:563:3: otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUPKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:571:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:572:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:572:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:573:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:598:1: entryRuleDown returns [EObject current=null] : iv_ruleDown= ruleDown EOF ;
    public final EObject entryRuleDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDown = null;


        try {
            // InternalXDrone.g:598:45: (iv_ruleDown= ruleDown EOF )
            // InternalXDrone.g:599:2: iv_ruleDown= ruleDown EOF
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
    // InternalXDrone.g:605:1: ruleDown returns [EObject current=null] : (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:611:2: ( (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:612:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:612:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:613:3: otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDownAccess().getDOWNKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:621:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:622:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:622:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:623:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:648:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalXDrone.g:648:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalXDrone.g:649:2: iv_ruleLeft= ruleLeft EOF
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
    // InternalXDrone.g:655:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:661:2: ( (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:662:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:662:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:663:3: otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:671:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:672:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:672:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:673:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:698:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalXDrone.g:698:46: (iv_ruleRight= ruleRight EOF )
            // InternalXDrone.g:699:2: iv_ruleRight= ruleRight EOF
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
    // InternalXDrone.g:705:1: ruleRight returns [EObject current=null] : (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:711:2: ( (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:712:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:712:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:713:3: otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:721:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:722:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:722:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:723:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:748:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalXDrone.g:748:48: (iv_ruleForward= ruleForward EOF )
            // InternalXDrone.g:749:2: iv_ruleForward= ruleForward EOF
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
    // InternalXDrone.g:755:1: ruleForward returns [EObject current=null] : (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:761:2: ( (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:762:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:762:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:763:3: otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFORWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:771:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:772:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:772:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:773:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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
    // InternalXDrone.g:798:1: entryRuleBackward returns [EObject current=null] : iv_ruleBackward= ruleBackward EOF ;
    public final EObject entryRuleBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackward = null;


        try {
            // InternalXDrone.g:798:49: (iv_ruleBackward= ruleBackward EOF )
            // InternalXDrone.g:799:2: iv_ruleBackward= ruleBackward EOF
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
    // InternalXDrone.g:805:1: ruleBackward returns [EObject current=null] : (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:811:2: ( (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:812:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:812:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:813:3: otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBackwardAccess().getBACKWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:821:3: ( (lv_distance_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:822:4: (lv_distance_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:822:4: (lv_distance_2_0= ruleDOUBLE )
            // InternalXDrone.g:823:5: lv_distance_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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


    // $ANTLR start "entryRuleRotateL"
    // InternalXDrone.g:848:1: entryRuleRotateL returns [EObject current=null] : iv_ruleRotateL= ruleRotateL EOF ;
    public final EObject entryRuleRotateL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateL = null;


        try {
            // InternalXDrone.g:848:48: (iv_ruleRotateL= ruleRotateL EOF )
            // InternalXDrone.g:849:2: iv_ruleRotateL= ruleRotateL EOF
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
    // InternalXDrone.g:855:1: ruleRotateL returns [EObject current=null] : (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_angle_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:861:2: ( (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:862:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:862:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:863:3: otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:871:3: ( (lv_angle_2_0= RULE_INT ) )
            // InternalXDrone.g:872:4: (lv_angle_2_0= RULE_INT )
            {
            // InternalXDrone.g:872:4: (lv_angle_2_0= RULE_INT )
            // InternalXDrone.g:873:5: lv_angle_2_0= RULE_INT
            {
            lv_angle_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:897:1: entryRuleRotateR returns [EObject current=null] : iv_ruleRotateR= ruleRotateR EOF ;
    public final EObject entryRuleRotateR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateR = null;


        try {
            // InternalXDrone.g:897:48: (iv_ruleRotateR= ruleRotateR EOF )
            // InternalXDrone.g:898:2: iv_ruleRotateR= ruleRotateR EOF
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
    // InternalXDrone.g:904:1: ruleRotateR returns [EObject current=null] : (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_angle_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:910:2: ( (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:911:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:911:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalXDrone.g:912:3: otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:920:3: ( (lv_angle_2_0= RULE_INT ) )
            // InternalXDrone.g:921:4: (lv_angle_2_0= RULE_INT )
            {
            // InternalXDrone.g:921:4: (lv_angle_2_0= RULE_INT )
            // InternalXDrone.g:922:5: lv_angle_2_0= RULE_INT
            {
            lv_angle_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalXDrone.g:946:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalXDrone.g:946:45: (iv_ruleWait= ruleWait EOF )
            // InternalXDrone.g:947:2: iv_ruleWait= ruleWait EOF
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
    // InternalXDrone.g:953:1: ruleWait returns [EObject current=null] : (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:959:2: ( (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:960:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:960:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:961:3: otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWAITKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:969:3: ( (lv_seconds_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:970:4: (lv_seconds_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:970:4: (lv_seconds_2_0= ruleDOUBLE )
            // InternalXDrone.g:971:5: lv_seconds_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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


    // $ANTLR start "entryRuleFunctionName"
    // InternalXDrone.g:996:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalXDrone.g:996:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalXDrone.g:997:2: iv_ruleFunctionName= ruleFunctionName EOF
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
    // InternalXDrone.g:1003:1: ruleFunctionName returns [EObject current=null] : ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_func_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXDrone.g:1009:2: ( ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalXDrone.g:1010:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalXDrone.g:1010:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalXDrone.g:1011:3: ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalXDrone.g:1011:3: ( (lv_func_name_0_0= RULE_ID ) )
            // InternalXDrone.g:1012:4: (lv_func_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:1012:4: (lv_func_name_0_0= RULE_ID )
            // InternalXDrone.g:1013:5: lv_func_name_0_0= RULE_ID
            {
            lv_func_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

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
    // InternalXDrone.g:1037:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalXDrone.g:1037:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalXDrone.g:1038:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalXDrone.g:1044:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'DRONE' otherlv_1= '(' ( (lv_x_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDOUBLE ) ) otherlv_7= ')' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_z_4_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1050:2: ( (otherlv_0= 'DRONE' otherlv_1= '(' ( (lv_x_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDOUBLE ) ) otherlv_7= ')' ) )
            // InternalXDrone.g:1051:2: (otherlv_0= 'DRONE' otherlv_1= '(' ( (lv_x_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDOUBLE ) ) otherlv_7= ')' )
            {
            // InternalXDrone.g:1051:2: (otherlv_0= 'DRONE' otherlv_1= '(' ( (lv_x_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDOUBLE ) ) otherlv_7= ')' )
            // InternalXDrone.g:1052:3: otherlv_0= 'DRONE' otherlv_1= '(' ( (lv_x_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_y_6_0= ruleDOUBLE ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDRONEKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1060:3: ( (lv_x_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:1061:4: (lv_x_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1061:4: (lv_x_2_0= ruleDOUBLE )
            // InternalXDrone.g:1062:5: lv_x_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getXDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_x_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getCommaKeyword_3());
            		
            // InternalXDrone.g:1083:3: ( (lv_z_4_0= ruleDOUBLE ) )
            // InternalXDrone.g:1084:4: (lv_z_4_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1084:4: (lv_z_4_0= ruleDOUBLE )
            // InternalXDrone.g:1085:5: lv_z_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getZDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_z_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_4_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDroneAccess().getCommaKeyword_5());
            		
            // InternalXDrone.g:1106:3: ( (lv_y_6_0= ruleDOUBLE ) )
            // InternalXDrone.g:1107:4: (lv_y_6_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1107:4: (lv_y_6_0= ruleDOUBLE )
            // InternalXDrone.g:1108:5: lv_y_6_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getDroneAccess().getYDOUBLEParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_y_6_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroneRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_6_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getRightParenthesisKeyword_7());
            		

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
    // InternalXDrone.g:1133:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalXDrone.g:1133:47: (iv_ruleObject= ruleObject EOF )
            // InternalXDrone.g:1134:2: iv_ruleObject= ruleObject EOF
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
    // InternalXDrone.g:1140:1: ruleObject returns [EObject current=null] : ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_sx_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_sz_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_sy_6_0= ruleDOUBLE ) ) otherlv_7= ',' ( (lv_lx_8_0= ruleDOUBLE ) ) otherlv_9= ',' ( (lv_lz_10_0= ruleDOUBLE ) ) otherlv_11= ',' ( (lv_ly_12_0= ruleDOUBLE ) ) otherlv_13= ')' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_object_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sx_2_0 = null;

        AntlrDatatypeRuleToken lv_sz_4_0 = null;

        AntlrDatatypeRuleToken lv_sy_6_0 = null;

        AntlrDatatypeRuleToken lv_lx_8_0 = null;

        AntlrDatatypeRuleToken lv_lz_10_0 = null;

        AntlrDatatypeRuleToken lv_ly_12_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1146:2: ( ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_sx_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_sz_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_sy_6_0= ruleDOUBLE ) ) otherlv_7= ',' ( (lv_lx_8_0= ruleDOUBLE ) ) otherlv_9= ',' ( (lv_lz_10_0= ruleDOUBLE ) ) otherlv_11= ',' ( (lv_ly_12_0= ruleDOUBLE ) ) otherlv_13= ')' ) )
            // InternalXDrone.g:1147:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_sx_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_sz_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_sy_6_0= ruleDOUBLE ) ) otherlv_7= ',' ( (lv_lx_8_0= ruleDOUBLE ) ) otherlv_9= ',' ( (lv_lz_10_0= ruleDOUBLE ) ) otherlv_11= ',' ( (lv_ly_12_0= ruleDOUBLE ) ) otherlv_13= ')' )
            {
            // InternalXDrone.g:1147:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_sx_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_sz_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_sy_6_0= ruleDOUBLE ) ) otherlv_7= ',' ( (lv_lx_8_0= ruleDOUBLE ) ) otherlv_9= ',' ( (lv_lz_10_0= ruleDOUBLE ) ) otherlv_11= ',' ( (lv_ly_12_0= ruleDOUBLE ) ) otherlv_13= ')' )
            // InternalXDrone.g:1148:3: ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_sx_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_sz_4_0= ruleDOUBLE ) ) otherlv_5= ',' ( (lv_sy_6_0= ruleDOUBLE ) ) otherlv_7= ',' ( (lv_lx_8_0= ruleDOUBLE ) ) otherlv_9= ',' ( (lv_lz_10_0= ruleDOUBLE ) ) otherlv_11= ',' ( (lv_ly_12_0= ruleDOUBLE ) ) otherlv_13= ')'
            {
            // InternalXDrone.g:1148:3: ( (lv_object_name_0_0= RULE_ID ) )
            // InternalXDrone.g:1149:4: (lv_object_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:1149:4: (lv_object_name_0_0= RULE_ID )
            // InternalXDrone.g:1150:5: lv_object_name_0_0= RULE_ID
            {
            lv_object_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1170:3: ( (lv_sx_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:1171:4: (lv_sx_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1171:4: (lv_sx_2_0= ruleDOUBLE )
            // InternalXDrone.g:1172:5: lv_sx_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getSxDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_sx_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"sx",
            						lv_sx_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getCommaKeyword_3());
            		
            // InternalXDrone.g:1193:3: ( (lv_sz_4_0= ruleDOUBLE ) )
            // InternalXDrone.g:1194:4: (lv_sz_4_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1194:4: (lv_sz_4_0= ruleDOUBLE )
            // InternalXDrone.g:1195:5: lv_sz_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getSzDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_sz_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"sz",
            						lv_sz_4_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getCommaKeyword_5());
            		
            // InternalXDrone.g:1216:3: ( (lv_sy_6_0= ruleDOUBLE ) )
            // InternalXDrone.g:1217:4: (lv_sy_6_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1217:4: (lv_sy_6_0= ruleDOUBLE )
            // InternalXDrone.g:1218:5: lv_sy_6_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getSyDOUBLEParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_sy_6_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"sy",
            						lv_sy_6_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getObjectAccess().getCommaKeyword_7());
            		
            // InternalXDrone.g:1239:3: ( (lv_lx_8_0= ruleDOUBLE ) )
            // InternalXDrone.g:1240:4: (lv_lx_8_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1240:4: (lv_lx_8_0= ruleDOUBLE )
            // InternalXDrone.g:1241:5: lv_lx_8_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getLxDOUBLEParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_lx_8_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"lx",
            						lv_lx_8_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getObjectAccess().getCommaKeyword_9());
            		
            // InternalXDrone.g:1262:3: ( (lv_lz_10_0= ruleDOUBLE ) )
            // InternalXDrone.g:1263:4: (lv_lz_10_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1263:4: (lv_lz_10_0= ruleDOUBLE )
            // InternalXDrone.g:1264:5: lv_lz_10_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getLzDOUBLEParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_15);
            lv_lz_10_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"lz",
            						lv_lz_10_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getObjectAccess().getCommaKeyword_11());
            		
            // InternalXDrone.g:1285:3: ( (lv_ly_12_0= ruleDOUBLE ) )
            // InternalXDrone.g:1286:4: (lv_ly_12_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1286:4: (lv_ly_12_0= ruleDOUBLE )
            // InternalXDrone.g:1287:5: lv_ly_12_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getLyDOUBLEParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_13);
            lv_ly_12_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"ly",
            						lv_ly_12_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getObjectAccess().getRightParenthesisKeyword_13());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001FE48020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040001020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});

}
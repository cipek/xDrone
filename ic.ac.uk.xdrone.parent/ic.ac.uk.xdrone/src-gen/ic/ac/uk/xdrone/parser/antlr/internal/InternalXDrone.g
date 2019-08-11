/*
 * generated by Xtext 2.17.0
 */
grammar InternalXDrone;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package ic.ac.uk.xdrone.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getFlyFlyParserRuleCall_0_0());
				}
				lv_fly_0_0=ruleFly
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"fly",
						lv_fly_0_0,
						"ic.ac.uk.xdrone.XDrone.Fly");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_1_0());
				}
				lv_environment_1_0=ruleEnvironment
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					set(
						$current,
						"environment",
						lv_environment_1_0,
						"ic.ac.uk.xdrone.XDrone.Environment");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFly
entryRuleFly returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFlyRule()); }
	iv_ruleFly=ruleFly
	{ $current=$iv_ruleFly.current; }
	EOF;

// Rule Fly
ruleFly returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fly(){'
		{
			newLeafNode(otherlv_0, grammarAccess.getFlyAccess().getFlyKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_1_0_0());
					}
					lv_takeoff_1_0=ruleTakeoff
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlyRule());
						}
						add(
							$current,
							"takeoff",
							lv_takeoff_1_0,
							"ic.ac.uk.xdrone.XDrone.Takeoff");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_1_1_0());
					}
					lv_commands_2_0=ruleSuperCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlyRule());
						}
						add(
							$current,
							"commands",
							lv_commands_2_0,
							"ic.ac.uk.xdrone.XDrone.SuperCommand");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getFlyAccess().getLandLandParserRuleCall_1_2_0());
					}
					lv_land_3_0=ruleLand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFlyRule());
						}
						add(
							$current,
							"land",
							lv_land_3_0,
							"ic.ac.uk.xdrone.XDrone.Land");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleEnvironment
entryRuleEnvironment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnvironmentRule()); }
	iv_ruleEnvironment=ruleEnvironment
	{ $current=$iv_ruleEnvironment.current; }
	EOF;

// Rule Environment
ruleEnvironment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
					$current);
			}
		)
		otherlv_1='environment(){'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0_0());
					}
					lv_drone_2_0=ruleDrone
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
						}
						add(
							$current,
							"drone",
							lv_drone_2_0,
							"ic.ac.uk.xdrone.XDrone.Drone");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_1_0());
					}
					lv_objects_3_0=ruleObject
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnvironmentRule());
						}
						add(
							$current,
							"objects",
							lv_objects_3_0,
							"ic.ac.uk.xdrone.XDrone.Object");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleTakeoff
entryRuleTakeoff returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTakeoffRule()); }
	iv_ruleTakeoff=ruleTakeoff
	{ $current=$iv_ruleTakeoff.current.getText(); }
	EOF;

// Rule Takeoff
ruleTakeoff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='TAKEOFF()'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getTakeoffAccess().getTAKEOFFKeyword());
	}
;

// Entry rule entryRuleLand
entryRuleLand returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLandRule()); }
	iv_ruleLand=ruleLand
	{ $current=$iv_ruleLand.current.getText(); }
	EOF;

// Rule Land
ruleLand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='LAND()'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getLandAccess().getLANDKeyword());
	}
;

// Entry rule entryRuleSuperCommand
entryRuleSuperCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSuperCommandRule()); }
	iv_ruleSuperCommand=ruleSuperCommand
	{ $current=$iv_ruleSuperCommand.current; }
	EOF;

// Rule SuperCommand
ruleSuperCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall_0());
		}
		this_Command_0=ruleCommand
		{
			$current = $this_Command_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSuperCommandAccess().getFunctionNameParserRuleCall_1());
		}
		this_FunctionName_1=ruleFunctionName
		{
			$current = $this_FunctionName_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommandAccess().getUpParserRuleCall_0());
		}
		this_Up_0=ruleUp
		{
			$current = $this_Up_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getDownParserRuleCall_1());
		}
		this_Down_1=ruleDown
		{
			$current = $this_Down_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getLeftParserRuleCall_2());
		}
		this_Left_2=ruleLeft
		{
			$current = $this_Left_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getRightParserRuleCall_3());
		}
		this_Right_3=ruleRight
		{
			$current = $this_Right_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getForwardParserRuleCall_4());
		}
		this_Forward_4=ruleForward
		{
			$current = $this_Forward_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5());
		}
		this_Backward_5=ruleBackward
		{
			$current = $this_Backward_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6());
		}
		this_RotateL_6=ruleRotateL
		{
			$current = $this_RotateL_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7());
		}
		this_RotateR_7=ruleRotateR
		{
			$current = $this_RotateR_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getWaitParserRuleCall_8());
		}
		this_Wait_8=ruleWait
		{
			$current = $this_Wait_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); }
	iv_ruleDOUBLE=ruleDOUBLE
	{ $current=$iv_ruleDOUBLE.current.getText(); }
	EOF;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_0());
			}
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_0_1());
			}
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0_2());
			}
		)
		    |
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_1_0());
			}
			this_INT_4=RULE_INT
			{
				$current.merge(this_INT_4);
			}
			{
				newLeafNode(this_INT_4, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1());
			}
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_2());
			}
			this_INT_6=RULE_INT
			{
				$current.merge(this_INT_6);
			}
			{
				newLeafNode(this_INT_6, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_3());
			}
		)
		    |
		this_INT_7=RULE_INT
		{
			$current.merge(this_INT_7);
		}
		{
			newLeafNode(this_INT_7, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
		}
		    |
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_3_0());
			}
			this_INT_9=RULE_INT
			{
				$current.merge(this_INT_9);
			}
			{
				newLeafNode(this_INT_9, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_3_1());
			}
		)
	)
;

// Entry rule entryRuleUp
entryRuleUp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpRule()); }
	iv_ruleUp=ruleUp
	{ $current=$iv_ruleUp.current; }
	EOF;

// Rule Up
ruleUp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='UP'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUPKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0());
				}
				lv_distance_2_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpRule());
					}
					set(
						$current,
						"distance",
						lv_distance_2_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getUpAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleDown
entryRuleDown returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDownRule()); }
	iv_ruleDown=ruleDown
	{ $current=$iv_ruleDown.current; }
	EOF;

// Rule Down
ruleDown returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DOWN'
		{
			newLeafNode(otherlv_0, grammarAccess.getDownAccess().getDOWNKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0());
				}
				lv_distance_2_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDownRule());
					}
					set(
						$current,
						"distance",
						lv_distance_2_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getDownAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleLeft
entryRuleLeft returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeftRule()); }
	iv_ruleLeft=ruleLeft
	{ $current=$iv_ruleLeft.current; }
	EOF;

// Rule Left
ruleLeft returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LEFT'
		{
			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLEFTKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0());
				}
				lv_distance_2_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLeftRule());
					}
					set(
						$current,
						"distance",
						lv_distance_2_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleRight
entryRuleRight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRightRule()); }
	iv_ruleRight=ruleRight
	{ $current=$iv_ruleRight.current; }
	EOF;

// Rule Right
ruleRight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RIGHT'
		{
			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRIGHTKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0());
				}
				lv_distance_2_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRightRule());
					}
					set(
						$current,
						"distance",
						lv_distance_2_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getRightAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleForward
entryRuleForward returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForwardRule()); }
	iv_ruleForward=ruleForward
	{ $current=$iv_ruleForward.current; }
	EOF;

// Rule Forward
ruleForward returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FORWARD'
		{
			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFORWARDKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0());
				}
				lv_distance_2_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForwardRule());
					}
					set(
						$current,
						"distance",
						lv_distance_2_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleBackward
entryRuleBackward returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBackwardRule()); }
	iv_ruleBackward=ruleBackward
	{ $current=$iv_ruleBackward.current; }
	EOF;

// Rule Backward
ruleBackward returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='BACKWARD'
		{
			newLeafNode(otherlv_0, grammarAccess.getBackwardAccess().getBACKWARDKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0());
				}
				lv_distance_2_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackwardRule());
					}
					set(
						$current,
						"distance",
						lv_distance_2_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleRotateL
entryRuleRotateL returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateLRule()); }
	iv_ruleRotateL=ruleRotateL
	{ $current=$iv_ruleRotateL.current; }
	EOF;

// Rule RotateL
ruleRotateL returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ROTATELEFT'
		{
			newLeafNode(otherlv_0, grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_angle_2_0=RULE_INT
				{
					newLeafNode(lv_angle_2_0, grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateLRule());
					}
					setWithLastConsumed(
						$current,
						"angle",
						lv_angle_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleRotateR
entryRuleRotateR returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRotateRRule()); }
	iv_ruleRotateR=ruleRotateR
	{ $current=$iv_ruleRotateR.current; }
	EOF;

// Rule RotateR
ruleRotateR returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ROTATERIGHT'
		{
			newLeafNode(otherlv_0, grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				lv_angle_2_0=RULE_INT
				{
					newLeafNode(lv_angle_2_0, grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRotateRRule());
					}
					setWithLastConsumed(
						$current,
						"angle",
						lv_angle_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleWait
entryRuleWait returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWaitRule()); }
	iv_ruleWait=ruleWait
	{ $current=$iv_ruleWait.current; }
	EOF;

// Rule Wait
ruleWait returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='WAIT'
		{
			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWAITKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0());
				}
				lv_seconds_2_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWaitRule());
					}
					set(
						$current,
						"seconds",
						lv_seconds_2_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleFunctionName
entryRuleFunctionName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionNameRule()); }
	iv_ruleFunctionName=ruleFunctionName
	{ $current=$iv_ruleFunctionName.current; }
	EOF;

// Rule FunctionName
ruleFunctionName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_func_name_0_0=RULE_ID
				{
					newLeafNode(lv_func_name_0_0, grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionNameRule());
					}
					setWithLastConsumed(
						$current,
						"func_name",
						lv_func_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='()'
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1());
		}
	)
;

// Entry rule entryRuleDrone
entryRuleDrone returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDroneRule()); }
	iv_ruleDrone=ruleDrone
	{ $current=$iv_ruleDrone.current; }
	EOF;

// Rule Drone
ruleDrone returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DRONE'
		{
			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDRONEKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDroneAccess().getVectorVectorParserRuleCall_1_0());
				}
				lv_vector_1_0=ruleVector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDroneRule());
					}
					set(
						$current,
						"vector",
						lv_vector_1_0,
						"ic.ac.uk.xdrone.XDrone.Vector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleObject
entryRuleObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectRule()); }
	iv_ruleObject=ruleObject
	{ $current=$iv_ruleObject.current; }
	EOF;

// Rule Object
ruleObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getObjectAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 0);
				}
							({true}?=>((
								(
									lv_object_name_1_0=RULE_ID
									{
										newLeafNode(lv_object_name_1_0, grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getObjectRule());
										}
										setWithLastConsumed(
											$current,
											"object_name",
											lv_object_name_1_0,
											"org.eclipse.xtext.common.Terminals.ID");
									}
								)
							)
							otherlv_2='{'
							{
								newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_0_1());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_0_2_0());
									}
									lv_origin_3_0=ruleOrigin
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getObjectRule());
										}
										set(
											$current,
											"origin",
											lv_origin_3_0,
											"ic.ac.uk.xdrone.XDrone.Origin");
										afterParserOrEnumRuleCall();
									}
								)
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 1);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_1_0());
								}
								lv_size_4_0=ruleSize
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getObjectRule());
									}
									set(
										$current,
										"size",
										lv_size_4_0,
										"ic.ac.uk.xdrone.XDrone.Size");
									afterParserOrEnumRuleCall();
								}
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getObjectAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getObjectAccess().getUnorderedGroup(), 2);
				}
							({true}?=>((
								(
									{
										newCompositeNode(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_0_0());
									}
									lv_color_5_0=ruleColor
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getObjectRule());
										}
										set(
											$current,
											"color",
											lv_color_5_0,
											"ic.ac.uk.xdrone.XDrone.Color");
										afterParserOrEnumRuleCall();
									}
								)
							)?
							otherlv_6='}'
							{
								newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_2_1());
							}
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getObjectAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getObjectAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getObjectAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleOrigin
entryRuleOrigin returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOriginRule()); }
	iv_ruleOrigin=ruleOrigin
	{ $current=$iv_ruleOrigin.current; }
	EOF;

// Rule Origin
ruleOrigin returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='origin'
		{
			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0());
				}
				lv_vector_2_0=ruleVector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOriginRule());
					}
					set(
						$current,
						"vector",
						lv_vector_2_0,
						"ic.ac.uk.xdrone.XDrone.Vector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSize
entryRuleSize returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSizeRule()); }
	iv_ruleSize=ruleSize
	{ $current=$iv_ruleSize.current; }
	EOF;

// Rule Size
ruleSize returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='size'
		{
			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0());
				}
				lv_vector_2_0=ruleVector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSizeRule());
					}
					set(
						$current,
						"vector",
						lv_vector_2_0,
						"ic.ac.uk.xdrone.XDrone.Vector");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVector
entryRuleVector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVectorRule()); }
	iv_ruleVector=ruleVector
	{ $current=$iv_ruleVector.current; }
	EOF;

// Rule Vector
ruleVector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0());
				}
				lv_x_1_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVectorRule());
					}
					set(
						$current,
						"x",
						lv_x_1_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=','
		{
			newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getCommaKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0());
				}
				lv_y_3_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVectorRule());
					}
					set(
						$current,
						"y",
						lv_y_3_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getCommaKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0());
				}
				lv_z_5_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVectorRule());
					}
					set(
						$current,
						"z",
						lv_z_5_0,
						"ic.ac.uk.xdrone.XDrone.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleColor
entryRuleColor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorRule()); }
	iv_ruleColor=ruleColor
	{ $current=$iv_ruleColor.current; }
	EOF;

// Rule Color
ruleColor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='color'
		{
			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_color_value_2_0=RULE_STRING
				{
					newLeafNode(lv_color_value_2_0, grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColorRule());
					}
					setWithLastConsumed(
						$current,
						"color_value",
						lv_color_value_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

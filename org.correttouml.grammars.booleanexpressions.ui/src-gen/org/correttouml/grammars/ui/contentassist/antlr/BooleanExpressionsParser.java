/*
* generated by Xtext
*/
package org.correttouml.grammars.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.correttouml.grammars.services.BooleanExpressionsGrammarAccess;

public class BooleanExpressionsParser extends AbstractContentAssistParser {
	
	@Inject
	private BooleanExpressionsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.correttouml.grammars.ui.contentassist.antlr.internal.InternalBooleanExpressionsParser createParser() {
		org.correttouml.grammars.ui.contentassist.antlr.internal.InternalBooleanExpressionsParser result = new org.correttouml.grammars.ui.contentassist.antlr.internal.InternalBooleanExpressionsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
					put(grammarAccess.getBooleanTermAccess().getAlternatives(), "rule__BooleanTerm__Alternatives");
					put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
					put(grammarAccess.getEventExtensionsAccess().getAlternatives(), "rule__EventExtensions__Alternatives");
					put(grammarAccess.getBooleanExpressionAccess().getGroup_0(), "rule__BooleanExpression__Group_0__0");
					put(grammarAccess.getBooleanExpressionAccess().getGroup_1(), "rule__BooleanExpression__Group_1__0");
					put(grammarAccess.getBooleanExpressionAccess().getGroup_2(), "rule__BooleanExpression__Group_2__0");
					put(grammarAccess.getTimeConstraintAccess().getGroup(), "rule__TimeConstraint__Group__0");
					put(grammarAccess.getVariableConditionAccess().getGroup(), "rule__VariableCondition__Group__0");
					put(grammarAccess.getEventAccess().getGroup_0(), "rule__Event__Group_0__0");
					put(grammarAccess.getModelAccess().getExpressionAssignment(), "rule__Model__ExpressionAssignment");
					put(grammarAccess.getBooleanExpressionAccess().getNotExpressionAssignment_0_1(), "rule__BooleanExpression__NotExpressionAssignment_0_1");
					put(grammarAccess.getBooleanExpressionAccess().getOrLeftAssignment_1_0(), "rule__BooleanExpression__OrLeftAssignment_1_0");
					put(grammarAccess.getBooleanExpressionAccess().getOrRightAssignment_1_2(), "rule__BooleanExpression__OrRightAssignment_1_2");
					put(grammarAccess.getBooleanExpressionAccess().getAndLeftAssignment_2_0(), "rule__BooleanExpression__AndLeftAssignment_2_0");
					put(grammarAccess.getBooleanExpressionAccess().getAndRightAssignment_2_2(), "rule__BooleanExpression__AndRightAssignment_2_2");
					put(grammarAccess.getBooleanExpressionAccess().getBooleanTermAssignment_3(), "rule__BooleanExpression__BooleanTermAssignment_3");
					put(grammarAccess.getTimeConstraintAccess().getEvent2Assignment_1(), "rule__TimeConstraint__Event2Assignment_1");
					put(grammarAccess.getTimeConstraintAccess().getEvent1Assignment_4(), "rule__TimeConstraint__Event1Assignment_4");
					put(grammarAccess.getTimeConstraintAccess().getOpAssignment_5(), "rule__TimeConstraint__OpAssignment_5");
					put(grammarAccess.getTimeConstraintAccess().getValueAssignment_6(), "rule__TimeConstraint__ValueAssignment_6");
					put(grammarAccess.getBooleanVariableAccess().getVariableAssignment(), "rule__BooleanVariable__VariableAssignment");
					put(grammarAccess.getVariableConditionAccess().getVariableAssignment_1(), "rule__VariableCondition__VariableAssignment_1");
					put(grammarAccess.getVariableConditionAccess().getRelationAssignment_2(), "rule__VariableCondition__RelationAssignment_2");
					put(grammarAccess.getVariableConditionAccess().getValueAssignment_3(), "rule__VariableCondition__ValueAssignment_3");
					put(grammarAccess.getEventAccess().getEventNameAssignment_0_0(), "rule__Event__EventNameAssignment_0_0");
					put(grammarAccess.getEventAccess().getEventExtensionAssignment_0_2(), "rule__Event__EventExtensionAssignment_0_2");
					put(grammarAccess.getEventAccess().getNowEventAssignment_1(), "rule__Event__NowEventAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.correttouml.grammars.ui.contentassist.antlr.internal.InternalBooleanExpressionsParser typedParser = (org.correttouml.grammars.ui.contentassist.antlr.internal.InternalBooleanExpressionsParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BooleanExpressionsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BooleanExpressionsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

package parser.generator.grammar;

import parser.generator.grammar.element.GrammarElement;
import parser.generator.grammar.element.Rule;
import parser.generator.grammar.element.Terminal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PossibleStartTokens {
    private final Grammar grammar;
    private final Map<Rule, Set<Terminal>> possibleStartTokens;

    PossibleStartTokens(final Grammar grammar) {
        this.grammar = grammar;
        this.possibleStartTokens = new HashMap<>();
        computeRulesFirstTokens();
    }


    private void computeRulesFirstTokens() {
        FirstFunction first = new FirstFunction(grammar);
        FollowFunction follow = new FollowFunction(grammar);

        for (Rule rule : grammar.getRules()) {
            List<GrammarElement> destinationElements = rule.getDestinationElements();
            Set<Terminal> firstTokensForRule = first.computeFirst(destinationElements);
            if (firstTokensForRule.remove(Grammar.EPS)) {
                firstTokensForRule.addAll(follow.computeFollow(rule.getSourceNonTerminal()));
            }
            possibleStartTokens.put(rule, firstTokensForRule);
        }
    }

    Set<Terminal> getPossibleStartTokens(final Rule rule) {
        return possibleStartTokens.get(rule);
    }

}

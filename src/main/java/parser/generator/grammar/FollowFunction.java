package parser.generator.grammar;


import parser.generator.grammar.element.GrammarElement;
import parser.generator.grammar.element.NonTerminal;
import parser.generator.grammar.element.Rule;
import parser.generator.grammar.element.Terminal;

import java.util.List;
import java.util.Set;


public class FollowFunction extends GrammarFunction {
    private final FirstFunction first;

    public FollowFunction(final Grammar grammar) {
        super(grammar);
        this.first = new FirstFunction(grammar);
        computeValues();
    }


    private void computeValues() {
        initNonTerminals();
        nonTerminalValue.get(grammar.getStart()).add(Grammar.END);
        boolean changes = true;
        while (changes) {
            changes = false;
            for (Rule rule : grammar.getRules()) {
                List<GrammarElement> elements = rule.getDestinationElements();
                int elementCount = elements.size();
                for (int i = 0; i < elementCount; i++) {
                    GrammarElement element = elements.get(i);
                    if (element instanceof NonTerminal) {
                        Set<Terminal> currentFollow = first.computeFirst(elements.subList(i + 1, elementCount));
                        if (currentFollow.isEmpty() || currentFollow.remove(Grammar.EPS)) {
                            currentFollow.addAll(nonTerminalValue.get(rule.getSourceNonTerminal()));
                        }
                        changes |= nonTerminalValue.get(element).addAll(currentFollow);
                    }
                }
            }
        }
    }

    Set<Terminal> computeFollow(final NonTerminal nonTerminal) {
        return nonTerminalValue.get(nonTerminal);
    }
}

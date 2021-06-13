package parser.generator.grammar;

import parser.generator.grammar.element.GrammarElement;
import parser.generator.grammar.element.NonTerminal;
import parser.generator.grammar.element.Rule;
import parser.generator.grammar.element.Terminal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FirstFunction extends GrammarFunction {

    FirstFunction(final Grammar grammar) {
        super(grammar);
        computeForNonTerminals();
    }

    private void computeForNonTerminals() {
        initNonTerminals();
        boolean changes = true;
        while (changes) {
            changes = false;
            for (Rule rule : grammar.getRules()) {
                changes |= nonTerminalValue.get(rule.getSourceNonTerminal())
                        .addAll(computeFirst(rule.getDestinationElements()));
            }
        }
    }


    Set<Terminal> computeFirst(final List<GrammarElement> elements) {
        Set<Terminal> first = new HashSet<>();

        boolean end = false;
        for (GrammarElement element : elements) {
            if (element instanceof Terminal) {
                first.add((Terminal) element);
                end = !element.equals(Grammar.EPS);
            }
            if (element instanceof NonTerminal) {
                Set<Terminal> elementFirst = nonTerminalValue.get(element);
                first.addAll(elementFirst);
                end = !elementFirst.contains(Grammar.EPS);
            }
            if (end) {
                return first;
            }
            first.remove(Grammar.EPS);

        }
        first.add(Grammar.EPS);
        return first;
    }
}

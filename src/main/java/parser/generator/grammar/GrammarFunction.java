package parser.generator.grammar;

import parser.generator.grammar.element.NonTerminal;
import parser.generator.grammar.element.Terminal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class GrammarFunction {
    final Grammar grammar;
    final Map<NonTerminal, Set<Terminal>> nonTerminalValue;

    GrammarFunction(final Grammar grammar) {
        this.grammar = grammar;
        this.nonTerminalValue = new HashMap<>();
    }

    void initNonTerminals() {
        for (NonTerminal nonTerminal : grammar.getNonTerminals()) {
            nonTerminalValue.put(nonTerminal, new HashSet<>());
        }
    }
}

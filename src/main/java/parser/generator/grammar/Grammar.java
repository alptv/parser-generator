package parser.generator.grammar;

import parser.generator.Util;
import parser.generator.grammar.element.*;

import java.util.*;
import java.util.stream.Collectors;


public class Grammar {
    public static final Epsilon EPS = Epsilon.getInstance();
    public static final End END = End.getInstance();
    private final String name;
    private final NonTerminalDeclaration start;
    private final List<Terminal> terminals;

    private final List<String> missRegex;

    private final List<NonTerminalDeclaration> nonTerminals;
    private final List<Rule> rules;
    private PossibleStartTokens possibleStartTokens;

    public Grammar(final String name, final NonTerminalDeclaration start, final List<Terminal> terminals, final List<String> missRegex,
                   final List<NonTerminalDeclaration> nonTerminals, final List<Rule> rules) {
        this.name = name;
        this.start = start;
        this.terminals = terminals;
        this.missRegex = missRegex;
        this.nonTerminals = nonTerminals;
        this.rules = rules;
        this.possibleStartTokens = null;
    }

    public String getName() {
        return name;
    }

    public List<NonTerminalDeclaration> getNonTerminals() {
        return nonTerminals;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public NonTerminalDeclaration getStart() {
        return start;
    }

    public Set<Terminal> getPossibleStarts(final Rule rule) {
        if (possibleStartTokens == null) {
            possibleStartTokens = new PossibleStartTokens(this);
        }
        return possibleStartTokens.getPossibleStartTokens(rule);
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public List<String> getMissRegex() {
        return missRegex;
    }

    public boolean isLL1() {
        Map<NonTerminalDeclaration, List<Rule>> nonTerminalRules = rules
                .stream()
                .collect(Collectors.groupingBy(Rule::getSourceNonTerminal));
        for (NonTerminalDeclaration nonTerminal : nonTerminalRules.keySet()) {
            if (isIntersectFirstTokens(nonTerminalRules.get(nonTerminal))) {
                return false;
            }
        }
        return true;
    }

    private boolean isIntersectFirstTokens(final List<Rule> rules) {
        int firstTokensSizeSum = 0;
        Set<Terminal> uniqueTokens = new HashSet<>();
        for (Rule rule : rules) {
            Set<Terminal> ruleFirstTokens = getPossibleStarts(rule);
            uniqueTokens.addAll(ruleFirstTokens);
            firstTokensSizeSum += ruleFirstTokens.size();
        }
        return firstTokensSizeSum != uniqueTokens.size();
    }

    @Override
    public String toString() {
        final String startShowing = Util.joinLines("start: ", start);
        final String terminalsShowing = Util.joinLines("terminals: ", terminals);
        final String nonTerminalsShowing = Util.joinLines("non-terminals: ", nonTerminals);
        final String rulesShowing = Util.joinLines("rules: ", rules);
        return Util.joinLines(name, startShowing, terminalsShowing, nonTerminalsShowing, rulesShowing);
    }
}

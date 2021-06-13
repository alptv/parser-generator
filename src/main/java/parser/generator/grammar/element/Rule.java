package parser.generator.grammar.element;


import java.util.List;

public class Rule implements GrammarElement {
    private final NonTerminalDeclaration sourceNonTerminal;
    private final List<GrammarElement> destinationElements;

    public Rule(final NonTerminalDeclaration sourceNonTerminal, final List<GrammarElement> destinationElements) {
        this.sourceNonTerminal = sourceNonTerminal;
        this.destinationElements = destinationElements;
    }

    public NonTerminalDeclaration getSourceNonTerminal() {
        return sourceNonTerminal;
    }

    public List<GrammarElement> getDestinationElements() {
        return destinationElements;
    }

    @Override
    public String toString() {
        return sourceNonTerminal.getName() + " -> " + destinationElements.toString();
    }
}

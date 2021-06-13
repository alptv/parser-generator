package parser.generator.grammar.element;

public class Argument implements GrammarElement {
    private final String argument;

    public Argument(final String argument) {
        this.argument = argument;
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public String toString() {
        return argument;
    }
}

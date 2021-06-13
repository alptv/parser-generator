package parser.generator.grammar.element;


public class Terminal implements GrammarElement {
    private final String name;
    private final String regexp;

    public Terminal(final String name, final String regexp) {
        this.name = name;
        this.regexp = regexp;
    }

    public String getName() {
        return name;
    }

    public String getRegexp() {
        return regexp;
    }

    @Override
    public String toString() {
        return name + " = " + regexp;
    }
}


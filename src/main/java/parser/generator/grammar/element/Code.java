package parser.generator.grammar.element;

public class Code implements GrammarElement {
    private final String value;

    public Code(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }
}

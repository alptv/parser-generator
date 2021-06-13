package parser.generator.grammar.element;


import java.util.Objects;

public abstract class NonTerminal implements GrammarElement {
    private final String name;

    public NonTerminal(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (o instanceof NonTerminal) {
            final NonTerminal that = (NonTerminal) o;
            return Objects.equals(name, that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package parser.generator.grammar.element;

import java.util.List;

public class NonTerminalValue extends NonTerminal {
    private final List<Argument> arguments;

    public NonTerminalValue(final String name, final List<Argument> arguments) {
        super(name);
        this.arguments = arguments;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return getName() + " " + arguments.toString();
    }

}

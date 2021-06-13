package parser.generator.grammar.element;

public class End extends Terminal {
    private static final End instance = new End();

    private End() {
        super("END", "");
    }

    public static End getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "END";
    }
}

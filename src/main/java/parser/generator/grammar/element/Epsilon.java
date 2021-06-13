package parser.generator.grammar.element;

public class Epsilon extends Terminal {
    private static final Epsilon instance = new Epsilon();

    private Epsilon() {
        super("EPS", "");
    }

    public static Epsilon getInstance() {
        return instance;
    }

}

package parser.generator.code.tree;


public class Token extends Node {
    private final String text;
    private final Object type;

    public Token(final String text, final Object type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public Object getType() {
        return type;
    }

}



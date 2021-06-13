package parser.generator.grammar.element;

public class Attribute {
    private final String type;
    private final String name;

    public Attribute(final String name, final String value) {
        this.name = name;
        this.type = value;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }

}

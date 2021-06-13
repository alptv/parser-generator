package parser.generator.grammar.element;


import java.util.List;

public class NonTerminalDeclaration extends NonTerminal {
    private final List<Attribute> inheritanceAttributes;
    private final List<Attribute> synthesizedAttributes;

    public NonTerminalDeclaration(final String name, final List<Attribute> inheritanceAttributes, final List<Attribute> synthesizedAttributes) {
        super(name);
        this.inheritanceAttributes = inheritanceAttributes;
        this.synthesizedAttributes = synthesizedAttributes;
    }

    public List<Attribute> getInheritanceAttributes() {
        return inheritanceAttributes;
    }

    public List<Attribute> getSynthesizedAttributes() {
        return synthesizedAttributes;
    }

    @Override
    public String toString() {
        return getName() + synthesizedAttributes.toString() + " returns" + inheritanceAttributes.toString();
    }
}

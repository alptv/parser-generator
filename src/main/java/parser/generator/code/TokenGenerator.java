package parser.generator.code;

import parser.generator.grammar.Grammar;
import parser.generator.grammar.element.Terminal;

import java.nio.file.Path;
import java.util.stream.Collectors;

public class TokenGenerator extends CodeGenerator {

    public TokenGenerator(final Grammar grammar, final Path path) throws GenerationException {
        super(getEnumName(grammar), grammar, path);
    }


    public static String getEnumName(final Grammar grammar) {
        return grammar.getName() + "Token";
    }

    public static String getTokenName(final Grammar grammar, final Terminal terminal) {
        return getEnumName(grammar) + "." + getInnerTokenName(terminal);
    }

    public static String getInnerTokenName(final Terminal terminal) {
        return terminal.getName().toUpperCase();
    }


    @Override
    public void generate() throws GenerationException {
        writeln("public enum " + getEnumName(grammar) + " {");
        generateTokens();
        writeln("}");
    }

    private void generateTokens() throws GenerationException {
        increaseIndent();
        writeln(grammar
                .getTerminals()
                .stream()
                .map(TokenGenerator::getInnerTokenName)
                .collect(Collectors.joining(", ")));
        writeln(", " + getInnerTokenName(Grammar.END));
        decreaseIndent();
    }
}

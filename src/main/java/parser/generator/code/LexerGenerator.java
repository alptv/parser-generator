package parser.generator.code;

import parser.generator.grammar.Grammar;

import java.nio.file.Path;


public class LexerGenerator extends CodeGenerator {

    public LexerGenerator(final Grammar grammar, final Path path) throws GenerationException {
        super(getLexerClassName(grammar), grammar, path);
    }

    public static String getLexerClassName(final Grammar grammar) {
        return grammar.getName() + "Lexer";
    }

    public static String getNextTokenName() {
        return "nextToken";
    }

    public static String getCurrentTokenName() {
        return "curToken";
    }

    public static String getSourceCurrentStateName() {return "sourceCurrentState";}


    private void generateHeaders() throws GenerationException {
        writeln("import java.util.regex.Pattern;");
        writeln("import java.util.regex.Matcher;");
        writeln("import parser.generator.code.tree.Token;");
        writeln("import parser.generator.code.exception.LexerException;");
    }

    @Override
    public void generate() throws GenerationException {
        generateHeaders();
        nextLn();
        writeln("public class " + getLexerClassName(grammar) + "{");
        generateBody();
        writeln("}");
    }

    private void generateBody() throws GenerationException {
        increaseIndent();
        generateFields();
        generateConstructor();
        generateNextToken();
        generateCurToken();
        generateCurrentSourceState();
        decreaseIndent();
    }

    private void generateFields() throws GenerationException {
        writeln("private int position;");
        writeln("private int prevPosition;");
        writeln("private Token token;");
        writeln("private final String source;");
        writeln("private final int tokenCount;");
        writeln("private final Pattern[] miss;");
        writeln("private final Object[] tokenType;");
        writeln("private final Pattern[] tokenRegex;");
        nextLn();
    }


    private void generateConstructor() throws GenerationException {
        writeln("public " + getLexerClassName(grammar) + "(final String source) {");
        increaseIndent();
        writeln("this.source = source;");
        writeln("this.position = 0;");
        writeln("this.prevPosition = 0;");
        writeln("this.token = null;");
        writeln("this.tokenCount = " + grammar.getTerminals().size() + ";");
        writeln("this.miss = new Pattern[]{" +
                GeneratorUtil.joinWithComma(grammar.getMissRegex(), regex -> "Pattern.compile(" + regex + ")") + "};");

        writeln("this.tokenRegex = new Pattern[]{" +
                GeneratorUtil.joinWithComma(grammar.getTerminals(), terminal -> "Pattern.compile(" + terminal.getRegexp() + ")") + "};");

        writeln("this.tokenType = new Object[]{" +
                GeneratorUtil.joinWithComma(grammar.getTerminals(), terminal -> TokenGenerator.getTokenName(grammar, terminal)) + "};");
        decreaseIndent();
        writeln("}");
        nextLn();
    }

    private void generateNextToken() throws GenerationException {
        writeln("public" + " Token " + getNextTokenName() + "() throws LexerException {");
        increaseIndent();
        generateMiss();
        writeln("prevPosition = position;");
        writeln("if (position >= source.length()) {");
        increaseIndent();
        writeln("token = " + "new Token(\"\", " + TokenGenerator.getTokenName(grammar, Grammar.END) + ");");
        writeln("return token;");
        decreaseIndent();
        writeln("}");
        writeln("String currentSource = source.substring(position);");
        writeln("for (int i = 0; i < tokenCount; i++) {");
        increaseIndent();
        writeln("Matcher matcher = tokenRegex[i].matcher(currentSource);");
        writeln("if (matcher.lookingAt()) {");
        increaseIndent();
        writeln("position += matcher.end();");
        writeln("token = new Token(matcher.group(), tokenType[i]);");
        writeln("return token;");
        decreaseIndent();
        writeln("}");
        decreaseIndent();
        writeln("}");
        writeln("throw new LexerException(\"Unexpected char sequence starts at: \" + source.substring(0, position) + " +
                "\"[\" + source.substring(position));");
        decreaseIndent();
        writeln("}");
    }

    private void generateMiss() throws GenerationException {
        writeln("boolean anyMatch = true;");
        writeln("while (position < source.length() && anyMatch) {");
        writeln("anyMatch = false;");
        increaseIndent();
        writeln("for (int i = 0; i < miss.length; i++) {");
        increaseIndent();
        writeln("Matcher matcher = miss[i].matcher(source.substring(position));");
        writeln("if (matcher.lookingAt()) {");
        increaseIndent();
        writeln("position += matcher.end();");
        writeln("anyMatch = true;");
        writeln("break;");
        decreaseIndent();
        writeln("}");
        decreaseIndent();
        writeln("}");
        decreaseIndent();
        writeln("}");
    }

    private void generateCurrentSourceState() throws GenerationException {
        writeln("public String " +getSourceCurrentStateName() + "() {");
        increaseIndent();
        writeln("return source.substring(0, prevPosition) + \"[\" " +
                "+ source.substring(prevPosition, position) + \"]\" + source.substring(position);");
        decreaseIndent();
        writeln("}");
    }

    private void generateCurToken() throws GenerationException {
        writeln("public Token curToken() {");
        increaseIndent();
        writeln("return token;");
        decreaseIndent();
        writeln("}");
    }
}

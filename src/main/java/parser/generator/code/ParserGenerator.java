package parser.generator.code;

import parser.generator.grammar.Grammar;
import parser.generator.grammar.element.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ParserGenerator extends CodeGenerator {

    public ParserGenerator(final Grammar grammar, final Path path) throws GenerationException {
        super(getParserClassName(grammar), grammar, path);
    }

    public static String getParserClassName(final Grammar grammar) {
        return grammar.getName() + "Parser";
    }

    private String getMethodName(NonTerminal nonTerminal) {
        return "parse" + nonTerminal.getName();
    }

    private void generateHeaders() throws GenerationException {
        writeln("import parser.generator.code.exception.LexerException;");
        writeln("import parser.generator.code.exception.ParserException;");
        writeln("import parser.generator.code.tree.Token;");
    }

    @Override
    public void generate() throws GenerationException {
        generateHeaders();
        writeln("public class " + getParserClassName(grammar) + " {");
        generateBody();
        writeln("}");
    }

    private void generateBody() throws GenerationException {
        increaseIndent();
        generateFields();
        generateConstructor();
        generateParse();
        generateParseMethods();
        decreaseIndent();

    }

    private void generateFields() throws GenerationException {
        String lexerClassName = LexerGenerator.getLexerClassName(grammar);
        writeln("public " + lexerClassName + " lexer;");
    }

    private void generateConstructor() throws GenerationException {
        writeln("public " + getParserClassName(grammar) + "(String source) {");
        increaseIndent();
        writeln("this.lexer = new " + LexerGenerator.getLexerClassName(grammar) + "(source);");
        decreaseIndent();
        writeln("}");
    }

    private void generateParse() throws GenerationException {
        String resultType = NonTerminalGenerator.getNonTerminalClassName(grammar.getStart());
        writeln("public " + resultType + " parse() throws ParserException, LexerException {"
        );
        increaseIndent();
        writeln("lexer." + LexerGenerator.getNextTokenName() + "();");
        writeln(resultType + " result = " + getMethodName(grammar.getStart()) + "();");
        writeln(TokenGenerator.getEnumName(grammar) + " endToken = " + "(" + TokenGenerator.getEnumName(grammar) + ")" +
                "lexer." +  LexerGenerator.getCurrentTokenName() + "().getType();");
        writeln("if (endToken != " +
                TokenGenerator.getTokenName(grammar, Grammar.END) + ") {");
        increaseIndent();
        writeln("throw new ParserException(\"Expected end of input but found token: \" + endToken);");
        decreaseIndent();
        writeln("}");
        writeln("return result;");
        decreaseIndent();
        writeln("}");
    }

    private void generateParseMethods() throws GenerationException {
        Map<NonTerminalDeclaration, List<Rule>> nonTerminalRules = grammar
                .getRules()
                .stream()
                .collect(Collectors.groupingBy(Rule::getSourceNonTerminal));
        for (NonTerminalDeclaration nonTerminal : grammar.getNonTerminals()) {
            generateParseMethod(nonTerminal, nonTerminalRules.get(nonTerminal));
        }
    }


    private void generateParseMethod(final NonTerminalDeclaration nonTerminal, final List<Rule> rules) throws GenerationException {
        String nonTerminalClass = NonTerminalGenerator.getNonTerminalClassName(nonTerminal);

        String arguments = GeneratorUtil.joinWithComma(nonTerminal.getInheritanceAttributes(),
                attribute -> attribute.getType() + " " + attribute.getName());
        writeln("private " + nonTerminalClass + " " +
                getMethodName(nonTerminal) + "(" + arguments + ") throws ParserException, LexerException { ");

        increaseIndent();
        String argumentsNames = GeneratorUtil.joinWithComma(nonTerminal.getInheritanceAttributes(), Attribute::getName);
        String nonTerminalName = nonTerminalClass + "0";
        writeln(nonTerminalClass + " " + nonTerminalName + " = new " + nonTerminalClass + "(" + argumentsNames + ");");
        writeln("Token currentToken = lexer." + LexerGenerator.getCurrentTokenName() + "();");
        writeln("switch ((" + TokenGenerator.getEnumName(grammar) + ")" + "currentToken.getType()) {");
        increaseIndent();
        List<String> possibleStarts = new ArrayList<>();
        for (Rule rule : rules) {
            Set<Terminal> rulePossibleStarts = grammar.getPossibleStarts(rule);
            possibleStarts.addAll(rulePossibleStarts.stream().map(TokenGenerator::getInnerTokenName).collect(Collectors.toList()));
            generateCase(rule, rulePossibleStarts);
        }
        decreaseIndent();
        writeln("default : ");
        increaseIndent();
        String exceptionMessage = "\"Expected one of: \"" + " + \"" + possibleStarts.toString() + "\" + " +
                "\", but found: \" + currentToken.getType() " +
                "+ " + "\" at \" + lexer." + LexerGenerator.getSourceCurrentStateName() + "()";
        writeln("throw new ParserException(" + exceptionMessage + ");");
        decreaseIndent();
        writeln("}");
        writeln("return " + nonTerminalName + ";");
        decreaseIndent();
        writeln("}");

    }

    private void generateCase(final Rule rule, Set<Terminal> possibleStarts) throws GenerationException {
        for (Terminal possibleStart : possibleStarts) {
            writeln("case " + TokenGenerator.getInnerTokenName(possibleStart) + ": ");
        }
        writeln("{");
        increaseIndent();
        List<GrammarElement> destinationElements = rule.getDestinationElements();
        int elementNumber = 1;
        for (GrammarElement element : destinationElements) {
            if (element instanceof Code) {
                writeln(((Code) element).getValue());
            }
            if (element instanceof NonTerminalValue) {
                generateNonTerminalValue((NonTerminalValue) element, elementNumber);
                elementNumber += 1;
            }
            if (element instanceof Terminal && element != Grammar.EPS) {
                generateTerminal((Terminal) element, elementNumber);
                elementNumber += 1;
            }
        }
        writeln("break;");
        decreaseIndent();
        writeln("}");
    }

    private void generateNonTerminalValue(final NonTerminalValue nonTerminal, int elementNumber) throws GenerationException {
        String className = NonTerminalGenerator.getNonTerminalClassName(nonTerminal);
        String arguments = GeneratorUtil.joinWithComma(nonTerminal.getArguments(), Argument::getArgument);
        writeln(className + " " + className + elementNumber + " = " + getMethodName(nonTerminal) + "(" + arguments + ");");
    }

    private void generateTerminal(final Terminal terminal, int elementNumber) throws GenerationException {
        String tokenName = terminal.getName() + elementNumber;
        String actual = "actual" + elementNumber;
        String expected = "expected" + elementNumber;
        writeln("Token " + tokenName + " = lexer." + LexerGenerator.getCurrentTokenName() + "();");
        writeln("lexer." + LexerGenerator.getNextTokenName() + "();");
        writeln(TokenGenerator.getEnumName(grammar) + " " + expected +
                " = " +  TokenGenerator.getTokenName(grammar, terminal) + ";");
        writeln(TokenGenerator.getEnumName(grammar) + " " + actual +

                " = (" + TokenGenerator.getEnumName(grammar) + ")" +  tokenName + ".getType()" + ";");
        writeln("if (" + actual + " != " + expected +") {");
        increaseIndent();
        String exceptionMessage = "\"Expected: \"" + " + " + expected + " + " +
                "\", but found: \"" + " + " + actual + " + " + "\" at \" + lexer." + LexerGenerator.getSourceCurrentStateName() + "()";
        writeln("throw new ParserException(" + exceptionMessage + ");");
        decreaseIndent();
        writeln("}");
    }
}

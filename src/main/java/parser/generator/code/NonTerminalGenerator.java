package parser.generator.code;

import parser.generator.grammar.Grammar;
import parser.generator.grammar.element.Attribute;
import parser.generator.grammar.element.NonTerminal;
import parser.generator.grammar.element.NonTerminalDeclaration;

import java.nio.file.Path;
import java.util.stream.Collectors;

public class NonTerminalGenerator extends CodeGenerator {

    public NonTerminalGenerator(final Grammar grammar, final Path path) throws GenerationException {
        super(getNonTerminalClassName(grammar.getStart()), grammar, path);
    }

    public static String getNonTerminalClassName(final NonTerminal nonTerminal) {
        return nonTerminal.getName();
    }

    private void generateHeaders() throws GenerationException {
        writeln("import parser.generator.code.tree.Node;");
    }

    @Override
    public void generate() throws GenerationException {
        generateHeaders();
        nextLn();
        NonTerminalDeclaration start = grammar.getStart();
        write("public "); generateNonTerminal(start);
        for (NonTerminalDeclaration nonTerminal : grammar.getNonTerminals()) {
            if (!nonTerminal.equals(start)) {
                generateNonTerminal(nonTerminal);
            }
        }
    }


    private void generateNonTerminal(final NonTerminalDeclaration nonTerminal) throws GenerationException {
        writeln("class " + getNonTerminalClassName(nonTerminal) + " extends Node {");
        increaseIndent();

        for (Attribute inheritanceAttribute : nonTerminal.getInheritanceAttributes()) {
            writeln("public " + getFieldDeclaration(inheritanceAttribute) + ";");
        }
        for (Attribute synthesizedAttribute : nonTerminal.getSynthesizedAttributes()) {
            writeln("public " + getFieldDeclaration(synthesizedAttribute) + ";");
        }
        nextLn();
        generateConstructor(nonTerminal);
        decreaseIndent();
        writeln("}");

    }

    private void generateConstructor(final NonTerminalDeclaration nonTerminal) throws GenerationException {
        writeln("public " + getNonTerminalClassName(nonTerminal) + "(" +
                nonTerminal.getInheritanceAttributes().stream()
                        .map(this::getFieldDeclaration)
                        .collect(Collectors.joining(", ")) + ") {");

        for (Attribute inheritanceAttribute : nonTerminal.getInheritanceAttributes()) {
            writeln("this." + inheritanceAttribute.getName() + " = " + inheritanceAttribute.getName() + ";");
        }
        writeln("}");

    }

    private String getFieldDeclaration(final Attribute attribute) {
        return attribute.getType() + " " + attribute.getName();
    }

}

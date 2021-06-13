package parser.generator;

import org.antlr.v4.runtime.*;
import parser.generator.code.*;
import parser.generator.grammar.Grammar;
import tools.grammar.parser.GrammarFileLexer;
import tools.grammar.parser.GrammarFileParser;

import java.io.IOException;
import java.nio.file.Path;

public class Generator {
    private final Path grammarPath;
    private final Path path;

    public Generator(final Path grammarPath, final Path path) {
        this.grammarPath = grammarPath;
        this.path = path;
    }

    private Grammar readGrammar() throws GenerationException {
            CharStream grammarIn;
            try {
                grammarIn = CharStreams.fromPath(grammarPath);
            } catch (IOException e) {
                throw new GenerationException("I/O problem during reading grammar file", e);
            }
            Grammar grammar;
            try {
                GrammarFileLexer lexer = new GrammarFileLexer(grammarIn);
                CommonTokenStream tokenStream = new CommonTokenStream(lexer);
                GrammarFileParser parser = new GrammarFileParser(tokenStream);
                grammar = parser.parseGrammarFile().grammar;
            } catch (Exception e) {
                throw new GenerationException("Error during parsing grammar file", e);
            }
            if (!grammar.isLL1()) {
                throw new GenerationException("Can create parser only for LL1 grammar");
            }
            return grammar;
    }

    public void generateSource() throws GenerationException {
        Grammar grammar = readGrammar();
        try (TokenGenerator tokenGenerator = new TokenGenerator(grammar, path);
             LexerGenerator lexerGenerator = new LexerGenerator(grammar, path);
             NonTerminalGenerator nonTerminalGenerator = new NonTerminalGenerator(grammar, path);
             ParserGenerator parserGenerator = new ParserGenerator(grammar, path)) {
            tokenGenerator.generate();
            lexerGenerator.generate();
            nonTerminalGenerator.generate();
            parserGenerator.generate();
        } catch (IOException e) {
            throw new GenerationException("Can't generate classes in given directory", e);
        }

    }
}
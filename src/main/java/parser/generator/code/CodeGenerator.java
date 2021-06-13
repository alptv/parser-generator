package parser.generator.code;

import parser.generator.grammar.Grammar;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class CodeGenerator implements AutoCloseable {
    private static final String INDENT = "    ";
    protected final Grammar grammar;
    private final Writer writer;
    private int indentLevel;
    private final String className;


    protected CodeGenerator(final String className, final Grammar grammar, final Path path) throws GenerationException {
        this.className = className;
        this.grammar = grammar;
        this.indentLevel = 0;
        String fileName = getFileName(className);
        try {
            this.writer = Files.newBufferedWriter(path.resolve(fileName));
        } catch (IOException e) {
            throw new GenerationException("I/O exception during creating file: " + fileName, e);
        }
    }


    private static String getFileName(final String className) {
        return className + ".java";
    }

    public abstract void generate() throws GenerationException;

    protected void increaseIndent() {
        indentLevel++;
    }

    protected void decreaseIndent() {
        if (indentLevel == 0) {
            throw new IllegalArgumentException("Indent can't be less than zero");
        }
        indentLevel--;
    }

    protected void writeNoIndent(final String string) throws GenerationException {
        try {
            writer.write(string);
        } catch (IOException e) {
            throw new GenerationException("I/O error while writing to a this file: " + getFileName(className), e);
        }
    }

    protected void write(final String string) throws GenerationException {
        writeNoIndent(INDENT.repeat(indentLevel) + string);
    }

    protected void writeln(final String string) throws GenerationException {
        write(string + System.lineSeparator());
    }

    protected void nextLn() throws GenerationException {
        writeln("");
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}

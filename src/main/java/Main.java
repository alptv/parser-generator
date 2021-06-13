import parser.generator.Generator;
import parser.generator.code.GenerationException;
import parser.generator.code.exception.LexerException;
import parser.generator.code.exception.ParserException;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    private void generateCalc() throws GenerationException {
        Path path = Path.of("./parse-calc");
        Path grammarPath = Path.of("./src/main/resources/Calculator");
        new Generator(grammarPath, path).generateSource();
    }


    public static void main(String[] args) throws GenerationException {
        new Main().generateCalc();
    }
}

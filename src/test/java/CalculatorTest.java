
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import parser.generator.code.exception.LexerException;
import parser.generator.code.exception.ParserException;



public class CalculatorTest {


    private void test(final String expression, final double expected) {
        CalculatorParser parser = new CalculatorParser(expression);
        double actual;
        try {
            actual = parser.parse().v;
            Assertions.assertEquals(expected, actual);
        } catch (ParserException | LexerException e) {
            Assertions.fail("Exception was thrown");
        }
    }

    private void testException(final String expression, final Class<? extends Exception> exceptionType) {
        try {
            new CalculatorParser(expression).parse();
        } catch (Throwable e) {
            if (exceptionType.isInstance(e)) {
                System.err.println(e.getMessage());
                return;
            }
        }
        Assertions.fail();
    }


    @Test
    public void testNumbers() {
        test("1", 1);
        test("20", 20);
        test("1245", 1245);
        test("-1", -1);
        test("-16000", -16000);
    }

    @Test
    public void testNumbersWithSpaces() {
        test("   1   ", 1);
        test("   20   ", 20);
        test("   1245   ", 1245);
        test("   -  1   ", -1);
        test("   -  16000   ", -16000);
    }

    @Test
    public void testSumSub() {
        test("   1 + 2  ", 3);
        test("   10+ 100 + 1000   ", 1110);
        test("   -1245 + 100 - 20   ", -1165);
        test("   0 + 0 - 0+ 0 - 0", 0);
        test("1 + 2 + 3 +4 + 5", 15);
        test("-1-2-3-4-5", -15);
    }

    @Test
    public void testSumSubBrackets() {
        test("   (1 + 2)  ", 3);
        test(" 1 + (2 - 3) + 4", 4);
        test("   (-1) + (-1) + -1 +-1", -4);
        test("(((0-0) - 0) -0)", 0);
        test("(1 + (1 + (1 + 1)))", 4);
        test("(1+2) + (-1-2)", 0);
    }

    @Test
    public void testMulDiv() {
        test("   1 * 2  ", 2);
        test("1 * 2 / 2", 1);
        test("8 / 2 / 2 / 2", 1);
        test("1 * 10 * 1000", 10000);
        test("2 * 2 * 2 / 2 / 2", 2);
        test("1 / 2", 0.5);
    }


    @Test
    public void testMulDivBrackets() {
        test("(   0 * 3 ) ", 0);
        test("((5 * 1) * 19)", 95);
        test(" (1 * (1 * (1 * (1 * 1))))", 1);
        test(" (1 / 1 / (1 / (1 / 1)))", 1);
        test(" (2 * 2) /4 ", 1);
        test("(1 / (1 / (1 / 1)))", 1);
    }


    private void testLexerException(final String expression) {
        testException(expression, LexerException.class);
    }

    @Test
    public void testIncorrectToken() {
        testLexerException("@ @ @@@ @@");
        testLexerException("(1 + 2) * !");
        testLexerException("1 + 2 + 3 + 4 + 5 + ?");
        testLexerException("((((????)))");
        testLexerException("1 | 2 | 3");
        testLexerException("(1 * 2) - 3 <> 3 <$> 4 <5>");
    }

    private void testParserException(final String expression) {
        testException(expression, ParserException.class);
    }

    @Test
    public void testIncorrectExpression() {
        testParserException("");
        testParserException("()");
        testParserException("(1+2))");
        testParserException(")))))))))(((((((((");
        testParserException("(1 * 2 * 3) * 123 / 6 * ()");
        testParserException("(((1))))");
        testParserException("((((2)))");
    }

    @Test
    public void testPower() {
        test("1 ** 2", 1);
        test("1 * 2 ** 2", 4);
        test("1 ** 2 ** 2", 1);
        test("1 + 3 ** 1", 4);
        test("(1+2)**3", 27);
        test("(1 / 8) ** (1/3)", 0.5);
        test("1 ** 2 ** 3 ** 4", 1);
        test("2 ** 3 ** 2", 512);
    }

}


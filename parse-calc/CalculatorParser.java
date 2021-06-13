import parser.generator.code.exception.LexerException;
import parser.generator.code.exception.ParserException;
import parser.generator.code.tree.Token;
public class CalculatorParser {
    public CalculatorLexer lexer;
    public CalculatorParser(String source) {
        this.lexer = new CalculatorLexer(source);
    }
    public E parse() throws ParserException, LexerException {
        lexer.nextToken();
        E result = parseE();
        CalculatorToken endToken = (CalculatorToken)lexer.curToken().getType();
        if (endToken != CalculatorToken.END) {
            throw new ParserException("Expected end of input but found token: " + endToken);
        }
        return result;
    }
    private E parseE() throws ParserException, LexerException { 
        E E0 = new E();
        Token currentToken = lexer.curToken();
        switch ((CalculatorToken)currentToken.getType()) {
            case NUM: 
            case MINUS: 
            case LBRACE: 
            {
                T T1 = parseT();
                ER ER2 = parseER(T1.v);
                E0.v = ER2.v;
                break;
            }
        default : 
            throw new ParserException("Expected one of: " + "[NUM, MINUS, LBRACE]" + ", but found: " + currentToken.getType() + " at " + lexer.sourceCurrentState());
        }
        return E0;
    }
    private ER parseER(double acc) throws ParserException, LexerException { 
        ER ER0 = new ER(acc);
        Token currentToken = lexer.curToken();
        switch ((CalculatorToken)currentToken.getType()) {
            case RBRACE: 
            case END: 
            {
                ER0.v = ER0.acc;
                break;
            }
            case PLUS: 
            {
                Token plus1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.PLUS;
                CalculatorToken actual1 = (CalculatorToken)plus1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                T T2 = parseT();
                ER0.v = ER0.acc + T2.v;
                ER ER3 = parseER(ER0.v);
                ER0.v = ER3.v;
                break;
            }
            case MINUS: 
            {
                Token minus1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.MINUS;
                CalculatorToken actual1 = (CalculatorToken)minus1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                T T2 = parseT();
                ER0.v = ER0.acc - T2.v;
                ER ER3 = parseER(ER0.v);
                ER0.v = ER3.v;
                break;
            }
        default : 
            throw new ParserException("Expected one of: " + "[RBRACE, END, PLUS, MINUS]" + ", but found: " + currentToken.getType() + " at " + lexer.sourceCurrentState());
        }
        return ER0;
    }
    private TR parseTR(double acc) throws ParserException, LexerException { 
        TR TR0 = new TR(acc);
        Token currentToken = lexer.curToken();
        switch ((CalculatorToken)currentToken.getType()) {
            case PLUS: 
            case MINUS: 
            case RBRACE: 
            case END: 
            {
                TR0.v = TR0.acc;
                break;
            }
            case DIV: 
            {
                Token div1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.DIV;
                CalculatorToken actual1 = (CalculatorToken)div1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                P P2 = parseP();
                TR0.v = TR0.acc / P2.v;
                TR TR3 = parseTR(TR0.v);
                TR0.v = TR3.v;
                break;
            }
            case MUL: 
            {
                Token mul1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.MUL;
                CalculatorToken actual1 = (CalculatorToken)mul1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                P P2 = parseP();
                TR0.v = TR0.acc * P2.v;
                TR TR3 = parseTR(TR0.v);
                TR0.v = TR3.v;
                break;
            }
        default : 
            throw new ParserException("Expected one of: " + "[PLUS, MINUS, RBRACE, END, DIV, MUL]" + ", but found: " + currentToken.getType() + " at " + lexer.sourceCurrentState());
        }
        return TR0;
    }
    private T parseT() throws ParserException, LexerException { 
        T T0 = new T();
        Token currentToken = lexer.curToken();
        switch ((CalculatorToken)currentToken.getType()) {
            case NUM: 
            case MINUS: 
            case LBRACE: 
            {
                P P1 = parseP();
                TR TR2 = parseTR(P1.v);
                T0.v = TR2.v;
                break;
            }
        default : 
            throw new ParserException("Expected one of: " + "[NUM, MINUS, LBRACE]" + ", but found: " + currentToken.getType() + " at " + lexer.sourceCurrentState());
        }
        return T0;
    }
    private P parseP() throws ParserException, LexerException { 
        P P0 = new P();
        Token currentToken = lexer.curToken();
        switch ((CalculatorToken)currentToken.getType()) {
            case NUM: 
            case MINUS: 
            case LBRACE: 
            {
                V V1 = parseV();
                PR PR2 = parsePR(V1.v);
                P0.v = PR2.v;
                break;
            }
        default : 
            throw new ParserException("Expected one of: " + "[NUM, MINUS, LBRACE]" + ", but found: " + currentToken.getType() + " at " + lexer.sourceCurrentState());
        }
        return P0;
    }
    private PR parsePR(double acc) throws ParserException, LexerException { 
        PR PR0 = new PR(acc);
        Token currentToken = lexer.curToken();
        switch ((CalculatorToken)currentToken.getType()) {
            case POWER: 
            {
                Token power1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.POWER;
                CalculatorToken actual1 = (CalculatorToken)power1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                P P2 = parseP();
                PR0.v = Math.pow(PR0.acc, P2.v);
                break;
            }
            case DIV: 
            case PLUS: 
            case MUL: 
            case MINUS: 
            case RBRACE: 
            case END: 
            {
                PR0.v= PR0.acc;
                break;
            }
        default : 
            throw new ParserException("Expected one of: " + "[POWER, DIV, PLUS, MUL, MINUS, RBRACE, END]" + ", but found: " + currentToken.getType() + " at " + lexer.sourceCurrentState());
        }
        return PR0;
    }
    private V parseV() throws ParserException, LexerException { 
        V V0 = new V();
        Token currentToken = lexer.curToken();
        switch ((CalculatorToken)currentToken.getType()) {
            case MINUS: 
            {
                Token minus1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.MINUS;
                CalculatorToken actual1 = (CalculatorToken)minus1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                V V2 = parseV();
                V0.v = -1 * V2.v;
                break;
            }
            case LBRACE: 
            {
                Token lbrace1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.LBRACE;
                CalculatorToken actual1 = (CalculatorToken)lbrace1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                E E2 = parseE();
                Token rbrace3 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected3 = CalculatorToken.RBRACE;
                CalculatorToken actual3 = (CalculatorToken)rbrace3.getType();
                if (actual3 != expected3) {
                    throw new ParserException("Expected: " + expected3 + ", but found: " + actual3 + " at " + lexer.sourceCurrentState());
                }
                V0.v = E2.v;
                break;
            }
            case NUM: 
            {
                Token num1 = lexer.curToken();
                lexer.nextToken();
                CalculatorToken expected1 = CalculatorToken.NUM;
                CalculatorToken actual1 = (CalculatorToken)num1.getType();
                if (actual1 != expected1) {
                    throw new ParserException("Expected: " + expected1 + ", but found: " + actual1 + " at " + lexer.sourceCurrentState());
                }
                V0.v = Double.parseDouble(num1.getText());
                break;
            }
        default : 
            throw new ParserException("Expected one of: " + "[MINUS, LBRACE, NUM]" + ", but found: " + currentToken.getType() + " at " + lexer.sourceCurrentState());
        }
        return V0;
    }
}

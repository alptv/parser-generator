import java.util.regex.Pattern;
import java.util.regex.Matcher;
import parser.generator.code.tree.Token;
import parser.generator.code.exception.LexerException;

public class CalculatorLexer{
    private int position;
    private int prevPosition;
    private Token token;
    private final String source;
    private final int tokenCount;
    private final Pattern[] miss;
    private final Object[] tokenType;
    private final Pattern[] tokenRegex;
    
    public CalculatorLexer(final String source) {
        this.source = source;
        this.position = 0;
        this.prevPosition = 0;
        this.token = null;
        this.tokenCount = 8;
        this.miss = new Pattern[]{Pattern.compile("[ \t\n\r]+")};
        this.tokenRegex = new Pattern[]{Pattern.compile("\\("), Pattern.compile("\\)"), Pattern.compile("\\+"), Pattern.compile("-"), Pattern.compile("\\*\\*"), Pattern.compile("\\*"), Pattern.compile("/"), Pattern.compile("([1-9][0-9]*)|0")};
        this.tokenType = new Object[]{CalculatorToken.LBRACE, CalculatorToken.RBRACE, CalculatorToken.PLUS, CalculatorToken.MINUS, CalculatorToken.POWER, CalculatorToken.MUL, CalculatorToken.DIV, CalculatorToken.NUM};
    }
    
    public Token nextToken() throws LexerException {
        boolean anyMatch = true;
        while (position < source.length() && anyMatch) {
        anyMatch = false;
            for (int i = 0; i < miss.length; i++) {
                Matcher matcher = miss[i].matcher(source.substring(position));
                if (matcher.lookingAt()) {
                    position += matcher.end();
                    anyMatch = true;
                    break;
                }
            }
        }
        prevPosition = position;
        if (position >= source.length()) {
            token = new Token("", CalculatorToken.END);
            return token;
        }
        String currentSource = source.substring(position);
        for (int i = 0; i < tokenCount; i++) {
            Matcher matcher = tokenRegex[i].matcher(currentSource);
            if (matcher.lookingAt()) {
                position += matcher.end();
                token = new Token(matcher.group(), tokenType[i]);
                return token;
            }
        }
        throw new LexerException("Unexpected char sequence starts at: " + source.substring(0, position) + "[" + source.substring(position));
    }
    public Token curToken() {
        return token;
    }
    public String sourceCurrentState() {
        return source.substring(0, prevPosition) + "[" + source.substring(prevPosition, position) + "]" + source.substring(position);
    }
}

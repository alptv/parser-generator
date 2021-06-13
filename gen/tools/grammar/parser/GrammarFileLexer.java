// Generated from /home/alexander/Projects/Java/parser-gen/src/main/resources/GrammarFile.g4 by ANTLR 4.9.1

package tools.grammar.parser;
import java.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.stream.Collectors;
import parser.generator.grammar.Grammar;
import parser.generator.grammar.element.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROW=1, TERMINALS=2, NON_TERMINALS=3, RETURNS=4, START=5, RULES=6, MISS=7, 
		EPSILON=8, LTRIANGULAR_BRACKET=9, RTRIANGULAR_BRACKET=10, REGEXP=11, CODE=12, 
		GRAMMAR_NAME=13, COLON=14, EQ=15, SEMICOLON=16, COMMA=17, ID=18, WS=19, 
		ARGUMENTS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ARROW", "TERMINALS", "NON_TERMINALS", "RETURNS", "START", "RULES", "MISS", 
			"EPSILON", "LTRIANGULAR_BRACKET", "RTRIANGULAR_BRACKET", "REGEXP", "CODE", 
			"GRAMMAR_NAME", "COLON", "EQ", "SEMICOLON", "COMMA", "ID", "WS", "ARGUMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'terminals'", "'non-terminals'", "'returns'", "'start'", 
			"'rules'", "'miss'", "'EPS'", "'<'", "'>'", null, null, null, "':'", 
			"'='", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ARROW", "TERMINALS", "NON_TERMINALS", "RETURNS", "START", "RULES", 
			"MISS", "EPSILON", "LTRIANGULAR_BRACKET", "RTRIANGULAR_BRACKET", "REGEXP", 
			"CODE", "GRAMMAR_NAME", "COLON", "EQ", "SEMICOLON", "COMMA", "ID", "WS", 
			"ARGUMENTS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	Map<String, Terminal> terminalsByName = new HashMap<>();
	Map<String, NonTerminalDeclaration> nonTerminalsByName = new HashMap<>();


	public GrammarFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\6\fj\n\f\r\f\16\fk\3\f\3\f\3\r\3\r\6\rr\n\r\r\r\16\rs\3\r\5\rw"+
		"\n\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\6\16\u0089\n\16\r\16\16\16\u008a\3\16\6\16\u008e\n\16\r\16"+
		"\16\16\u008f\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\7\23\u009c"+
		"\n\23\f\23\16\23\u009f\13\23\3\24\3\24\3\25\3\25\6\25\u00a5\n\25\r\25"+
		"\16\25\u00a6\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\t\3\2$$\4"+
		"\2}}\177\177\4\2C\\c|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2"+
		"==__\2\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2"+
		"\2\78\3\2\2\2\tF\3\2\2\2\13N\3\2\2\2\rT\3\2\2\2\17Z\3\2\2\2\21_\3\2\2"+
		"\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31o\3\2\2\2\33\177\3\2\2\2\35\u0091"+
		"\3\2\2\2\37\u0093\3\2\2\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2"+
		"\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+,\7/\2\2,-\7@\2\2-\4\3\2\2\2./\7v\2\2"+
		"/\60\7g\2\2\60\61\7t\2\2\61\62\7o\2\2\62\63\7k\2\2\63\64\7p\2\2\64\65"+
		"\7c\2\2\65\66\7n\2\2\66\67\7u\2\2\67\6\3\2\2\289\7p\2\29:\7q\2\2:;\7p"+
		"\2\2;<\7/\2\2<=\7v\2\2=>\7g\2\2>?\7t\2\2?@\7o\2\2@A\7k\2\2AB\7p\2\2BC"+
		"\7c\2\2CD\7n\2\2DE\7u\2\2E\b\3\2\2\2FG\7t\2\2GH\7g\2\2HI\7v\2\2IJ\7w\2"+
		"\2JK\7t\2\2KL\7p\2\2LM\7u\2\2M\n\3\2\2\2NO\7u\2\2OP\7v\2\2PQ\7c\2\2QR"+
		"\7t\2\2RS\7v\2\2S\f\3\2\2\2TU\7t\2\2UV\7w\2\2VW\7n\2\2WX\7g\2\2XY\7u\2"+
		"\2Y\16\3\2\2\2Z[\7o\2\2[\\\7k\2\2\\]\7u\2\2]^\7u\2\2^\20\3\2\2\2_`\7G"+
		"\2\2`a\7R\2\2ab\7U\2\2b\22\3\2\2\2cd\7>\2\2d\24\3\2\2\2ef\7@\2\2f\26\3"+
		"\2\2\2gi\7$\2\2hj\n\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3"+
		"\2\2\2mn\7$\2\2n\30\3\2\2\2oz\7}\2\2pr\n\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3"+
		"\2\2\2st\3\2\2\2tv\3\2\2\2uw\5\31\r\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xq"+
		"\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\177\2\2"+
		"~\32\3\2\2\2\177\u0080\7i\2\2\u0080\u0081\7t\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7o\2\2\u0083\u0084\7o\2\2\u0084\u0085\7c\2\2\u0085\u0086\7t\2\2"+
		"\u0086\u0088\3\2\2\2\u0087\u0089\5\'\24\2\u0088\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008e\t\4\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\34\3\2\2\2\u0091\u0092\7<\2\2\u0092\36"+
		"\3\2\2\2\u0093\u0094\7?\2\2\u0094 \3\2\2\2\u0095\u0096\7=\2\2\u0096\""+
		"\3\2\2\2\u0097\u0098\7.\2\2\u0098$\3\2\2\2\u0099\u009d\t\5\2\2\u009a\u009c"+
		"\t\6\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e&\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\t\7\2\2"+
		"\u00a1(\3\2\2\2\u00a2\u00a4\7]\2\2\u00a3\u00a5\n\b\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\7_\2\2\u00a9*\3\2\2\2\13\2ksvz\u008a\u008f"+
		"\u009d\u00a6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
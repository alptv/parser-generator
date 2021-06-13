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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROW=1, TERMINALS=2, NON_TERMINALS=3, RETURNS=4, START=5, RULES=6, MISS=7, 
		EPSILON=8, LTRIANGULAR_BRACKET=9, RTRIANGULAR_BRACKET=10, REGEXP=11, CODE=12, 
		GRAMMAR_NAME=13, COLON=14, EQ=15, SEMICOLON=16, COMMA=17, ID=18, WS=19, 
		ARGUMENTS=20;
	public static final int
		RULE_parseGrammarFile = 0, RULE_name = 1, RULE_miss = 2, RULE_missList = 3, 
		RULE_parseTerminals = 4, RULE_terminals = 5, RULE_terminal = 6, RULE_parseNonTerminals = 7, 
		RULE_nonTerminals = 8, RULE_nonTerminal = 9, RULE_attributes = 10, RULE_attributesList = 11, 
		RULE_attribute = 12, RULE_type = 13, RULE_generic = 14, RULE_csvType = 15, 
		RULE_parseStart = 16, RULE_parseRules = 17, RULE_rules = 18, RULE_oneRule = 19, 
		RULE_grammarElements = 20, RULE_grammarElement = 21, RULE_args = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseGrammarFile", "name", "miss", "missList", "parseTerminals", "terminals", 
			"terminal", "parseNonTerminals", "nonTerminals", "nonTerminal", "attributes", 
			"attributesList", "attribute", "type", "generic", "csvType", "parseStart", 
			"parseRules", "rules", "oneRule", "grammarElements", "grammarElement", 
			"args"
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

	@Override
	public String getGrammarFileName() { return "GrammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	Map<String, Terminal> terminalsByName = new HashMap<>();
	Map<String, NonTerminalDeclaration> nonTerminalsByName = new HashMap<>();

	public GrammarFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseGrammarFileContext extends ParserRuleContext {
		public Grammar grammar;
		public NameContext name;
		public MissContext miss;
		public ParseTerminalsContext parseTerminals;
		public ParseNonTerminalsContext parseNonTerminals;
		public ParseStartContext parseStart;
		public ParseRulesContext parseRules;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MissContext miss() {
			return getRuleContext(MissContext.class,0);
		}
		public ParseTerminalsContext parseTerminals() {
			return getRuleContext(ParseTerminalsContext.class,0);
		}
		public ParseNonTerminalsContext parseNonTerminals() {
			return getRuleContext(ParseNonTerminalsContext.class,0);
		}
		public ParseStartContext parseStart() {
			return getRuleContext(ParseStartContext.class,0);
		}
		public ParseRulesContext parseRules() {
			return getRuleContext(ParseRulesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public ParseGrammarFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseGrammarFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterParseGrammarFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitParseGrammarFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitParseGrammarFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseGrammarFileContext parseGrammarFile() throws RecognitionException {
		ParseGrammarFileContext _localctx = new ParseGrammarFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseGrammarFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(46);
				match(WS);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			((ParseGrammarFileContext)_localctx).name = name();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					match(WS);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(59);
			((ParseGrammarFileContext)_localctx).miss = miss();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(60);
				match(WS);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			((ParseGrammarFileContext)_localctx).parseTerminals = parseTerminals();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(67);
				match(WS);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			((ParseGrammarFileContext)_localctx).parseNonTerminals = parseNonTerminals();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(74);
				match(WS);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			((ParseGrammarFileContext)_localctx).parseStart = parseStart();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(81);
				match(WS);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			((ParseGrammarFileContext)_localctx).parseRules = parseRules();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(88);
				match(WS);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ParseGrammarFileContext)_localctx).grammar =  new Grammar(((ParseGrammarFileContext)_localctx).name.value, ((ParseGrammarFileContext)_localctx).parseStart.s, ((ParseGrammarFileContext)_localctx).parseTerminals.terms, ((ParseGrammarFileContext)_localctx).miss.regex, ((ParseGrammarFileContext)_localctx).parseNonTerminals.nonTerms, ((ParseGrammarFileContext)_localctx).parseRules.grammarRules);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public String value;
		public Token GRAMMAR_NAME;
		public TerminalNode GRAMMAR_NAME() { return getToken(GrammarFileParser.GRAMMAR_NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((NameContext)_localctx).GRAMMAR_NAME = match(GRAMMAR_NAME);
			  String name = (((NameContext)_localctx).GRAMMAR_NAME!=null?((NameContext)_localctx).GRAMMAR_NAME.getText():null);
			        name = name.substring("grammar".length(), name.length()).trim();
			        ((NameContext)_localctx).value =  name;
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MissContext extends ParserRuleContext {
		public List<String> regex = new ArrayList();
		public TerminalNode MISS() { return getToken(GrammarFileParser.MISS, 0); }
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public MissListContext missList() {
			return getRuleContext(MissListContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public MissContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterMiss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitMiss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitMiss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissContext miss() throws RecognitionException {
		MissContext _localctx = new MissContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_miss);
		int _la;
		try {
			int _alt;
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MISS:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(MISS);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(100);
					match(WS);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(COLON);
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(107);
						match(WS);
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(113);
				missList(_localctx.regex);
				}
				break;
			case TERMINALS:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MissListContext extends ParserRuleContext {
		public List<String> regex;
		public Token REGEXP;
		public TerminalNode REGEXP() { return getToken(GrammarFileParser.REGEXP, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarFileParser.SEMICOLON, 0); }
		public MissListContext missList() {
			return getRuleContext(MissListContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public MissListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MissListContext(ParserRuleContext parent, int invokingState, List<String> regex) {
			super(parent, invokingState);
			this.regex = regex;
		}
		@Override public int getRuleIndex() { return RULE_missList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterMissList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitMissList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitMissList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MissListContext missList(List<String> regex) throws RecognitionException {
		MissListContext _localctx = new MissListContext(_ctx, getState(), regex);
		enterRule(_localctx, 6, RULE_missList);
		int _la;
		try {
			int _alt;
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEXP:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((MissListContext)_localctx).REGEXP = match(REGEXP);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(118);
					match(WS);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(SEMICOLON);
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(125);
						match(WS);
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(131);
				missList(_localctx.regex);
				regex.add((((MissListContext)_localctx).REGEXP!=null?((MissListContext)_localctx).REGEXP.getText():null));
				}
				break;
			case TERMINALS:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParseTerminalsContext extends ParserRuleContext {
		public List<Terminal> terms = new ArrayList<>();
		public TerminalNode TERMINALS() { return getToken(GrammarFileParser.TERMINALS, 0); }
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public TerminalsContext terminals() {
			return getRuleContext(TerminalsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public ParseTerminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseTerminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterParseTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitParseTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitParseTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseTerminalsContext parseTerminals() throws RecognitionException {
		ParseTerminalsContext _localctx = new ParseTerminalsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parseTerminals);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TERMINALS);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(138);
				match(WS);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(COLON);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(WS);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(151);
			terminals(_localctx.terms);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(WS);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalsContext extends ParserRuleContext {
		public List<Terminal> terms;
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarFileParser.SEMICOLON, 0); }
		public TerminalsContext terminals() {
			return getRuleContext(TerminalsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public TerminalsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalsContext(ParserRuleContext parent, int invokingState, List<Terminal> terms) {
			super(parent, invokingState);
			this.terms = terms;
		}
		@Override public int getRuleIndex() { return RULE_terminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalsContext terminals(List<Terminal> terms) throws RecognitionException {
		TerminalsContext _localctx = new TerminalsContext(_ctx, getState(), terms);
		enterRule(_localctx, 10, RULE_terminals);
		int _la;
		try {
			int _alt;
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				terminal(_localctx.terms);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(159);
					match(WS);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				match(SEMICOLON);
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						match(WS);
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(172);
				terminals(_localctx.terms);
				}
				break;
			case NON_TERMINALS:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminalContext extends ParserRuleContext {
		public List<Terminal> terms;
		public Token ID;
		public Token REGEXP;
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public TerminalNode EQ() { return getToken(GrammarFileParser.EQ, 0); }
		public TerminalNode REGEXP() { return getToken(GrammarFileParser.REGEXP, 0); }
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TerminalContext(ParserRuleContext parent, int invokingState, List<Terminal> terms) {
			super(parent, invokingState);
			this.terms = terms;
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal(List<Terminal> terms) throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState(), terms);
		enterRule(_localctx, 12, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((TerminalContext)_localctx).ID = match(ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(178);
				match(WS);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(EQ);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(185);
				match(WS);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			((TerminalContext)_localctx).REGEXP = match(REGEXP);
			 Terminal term = new Terminal((((TerminalContext)_localctx).ID!=null?((TerminalContext)_localctx).ID.getText():null), (((TerminalContext)_localctx).REGEXP!=null?((TerminalContext)_localctx).REGEXP.getText():null));
			          _localctx.terms.add(term);
			          terminalsByName.put((((TerminalContext)_localctx).ID!=null?((TerminalContext)_localctx).ID.getText():null), term);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParseNonTerminalsContext extends ParserRuleContext {
		public List<NonTerminalDeclaration> nonTerms = new ArrayList<>();
		public TerminalNode NON_TERMINALS() { return getToken(GrammarFileParser.NON_TERMINALS, 0); }
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public NonTerminalsContext nonTerminals() {
			return getRuleContext(NonTerminalsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public ParseNonTerminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseNonTerminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterParseNonTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitParseNonTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitParseNonTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseNonTerminalsContext parseNonTerminals() throws RecognitionException {
		ParseNonTerminalsContext _localctx = new ParseNonTerminalsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parseNonTerminals);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(NON_TERMINALS);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(195);
				match(WS);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(COLON);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					match(WS);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(208);
			nonTerminals(_localctx.nonTerms);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(209);
					match(WS);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTerminalsContext extends ParserRuleContext {
		public List<NonTerminalDeclaration> nonTerms;
		public NonTerminalContext nonTerminal() {
			return getRuleContext(NonTerminalContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarFileParser.SEMICOLON, 0); }
		public NonTerminalsContext nonTerminals() {
			return getRuleContext(NonTerminalsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public NonTerminalsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NonTerminalsContext(ParserRuleContext parent, int invokingState, List<NonTerminalDeclaration> nonTerms) {
			super(parent, invokingState);
			this.nonTerms = nonTerms;
		}
		@Override public int getRuleIndex() { return RULE_nonTerminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterNonTerminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitNonTerminals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitNonTerminals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalsContext nonTerminals(List<NonTerminalDeclaration> nonTerms) throws RecognitionException {
		NonTerminalsContext _localctx = new NonTerminalsContext(_ctx, getState(), nonTerms);
		enterRule(_localctx, 16, RULE_nonTerminals);
		int _la;
		try {
			int _alt;
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				nonTerminal(_localctx.nonTerms);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(216);
					match(WS);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(SEMICOLON);
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						match(WS);
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(229);
				nonTerminals(_localctx.nonTerms);
				}
				break;
			case START:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTerminalContext extends ParserRuleContext {
		public List<NonTerminalDeclaration> nonTerms;
		public Token ID;
		public AttributesContext attributes;
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public NonTerminalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NonTerminalContext(ParserRuleContext parent, int invokingState, List<NonTerminalDeclaration> nonTerms) {
			super(parent, invokingState);
			this.nonTerms = nonTerms;
		}
		@Override public int getRuleIndex() { return RULE_nonTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterNonTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitNonTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitNonTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTerminalContext nonTerminal(List<NonTerminalDeclaration> nonTerms) throws RecognitionException {
		NonTerminalContext _localctx = new NonTerminalContext(_ctx, getState(), nonTerms);
		enterRule(_localctx, 18, RULE_nonTerminal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((NonTerminalContext)_localctx).ID = match(ID);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					match(WS);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(241);
			((NonTerminalContext)_localctx).attributes = attributes();
			 NonTerminalDeclaration nonTerm = new NonTerminalDeclaration((((NonTerminalContext)_localctx).ID!=null?((NonTerminalContext)_localctx).ID.getText():null), ((NonTerminalContext)_localctx).attributes.inheritance, ((NonTerminalContext)_localctx).attributes.synthesized);
			          nonTerms.add(nonTerm);
			          nonTerminalsByName.put((((NonTerminalContext)_localctx).ID!=null?((NonTerminalContext)_localctx).ID.getText():null), nonTerm);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<Attribute> inheritance = new ArrayList();
		public List<Attribute> synthesized = new ArrayList();
		public List<TerminalNode> LTRIANGULAR_BRACKET() { return getTokens(GrammarFileParser.LTRIANGULAR_BRACKET); }
		public TerminalNode LTRIANGULAR_BRACKET(int i) {
			return getToken(GrammarFileParser.LTRIANGULAR_BRACKET, i);
		}
		public List<AttributesListContext> attributesList() {
			return getRuleContexts(AttributesListContext.class);
		}
		public AttributesListContext attributesList(int i) {
			return getRuleContext(AttributesListContext.class,i);
		}
		public List<TerminalNode> RTRIANGULAR_BRACKET() { return getTokens(GrammarFileParser.RTRIANGULAR_BRACKET); }
		public TerminalNode RTRIANGULAR_BRACKET(int i) {
			return getToken(GrammarFileParser.RTRIANGULAR_BRACKET, i);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public TerminalNode RETURNS() { return getToken(GrammarFileParser.RETURNS, 0); }
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributes);
		int _la;
		try {
			int _alt;
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LTRIANGULAR_BRACKET) {
					{
					setState(244);
					match(LTRIANGULAR_BRACKET);
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(245);
							match(WS);
							}
							} 
						}
						setState(250);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					setState(251);
					attributesList(_localctx.inheritance);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(252);
						match(WS);
						}
						}
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(258);
					match(RTRIANGULAR_BRACKET);
					}
				}

				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						match(WS);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNS) {
					{
					setState(268);
					match(RETURNS);
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(269);
						match(WS);
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(275);
					match(LTRIANGULAR_BRACKET);
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(276);
							match(WS);
							}
							} 
						}
						setState(281);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					}
					setState(282);
					attributesList(_localctx.synthesized);
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(283);
						match(WS);
						}
						}
						setState(288);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(289);
					match(RTRIANGULAR_BRACKET);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesListContext extends ParserRuleContext {
		public List<Attribute> attr;
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributesListContext attributesList() {
			return getRuleContext(AttributesListContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarFileParser.SEMICOLON, 0); }
		public AttributesListContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AttributesListContext(ParserRuleContext parent, int invokingState, List<Attribute> attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_attributesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterAttributesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitAttributesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitAttributesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesListContext attributesList(List<Attribute> attr) throws RecognitionException {
		AttributesListContext _localctx = new AttributesListContext(_ctx, getState(), attr);
		enterRule(_localctx, 22, RULE_attributesList);
		try {
			int _alt;
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				attribute(_localctx.attr);
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297);
						match(WS);
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(303);
				attributesList(_localctx.attr);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(SEMICOLON);
				setState(306);
				attribute(_localctx.attr);
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						match(WS);
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(313);
				attributesList(_localctx.attr);
				}
				break;
			case RTRIANGULAR_BRACKET:
			case WS:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public List<Attribute> attr;
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AttributeContext(ParserRuleContext parent, int invokingState, List<Attribute> attr) {
			super(parent, invokingState);
			this.attr = attr;
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute(List<Attribute> attr) throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState(), attr);
		enterRule(_localctx, 24, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((AttributeContext)_localctx).type = type();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(319);
				match(WS);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			((AttributeContext)_localctx).ID = match(ID);
			_localctx.attr.add(new Attribute((((AttributeContext)_localctx).ID!=null?((AttributeContext)_localctx).ID.getText():null), ((AttributeContext)_localctx).type.value));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public String value = "";
		public Token ID;
		public GenericContext generic;
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public GenericContext generic() {
			return getRuleContext(GenericContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			((TypeContext)_localctx).ID = match(ID);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					match(WS);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(335);
			((TypeContext)_localctx).generic = generic();
			((TypeContext)_localctx).value =  (((TypeContext)_localctx).ID!=null?((TypeContext)_localctx).ID.getText():null) + ((TypeContext)_localctx).generic.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericContext extends ParserRuleContext {
		public String value = "";
		public TypeContext type;
		public CsvTypeContext csvType;
		public TerminalNode LTRIANGULAR_BRACKET() { return getToken(GrammarFileParser.LTRIANGULAR_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CsvTypeContext csvType() {
			return getRuleContext(CsvTypeContext.class,0);
		}
		public TerminalNode RTRIANGULAR_BRACKET() { return getToken(GrammarFileParser.RTRIANGULAR_BRACKET, 0); }
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public GenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericContext generic() throws RecognitionException {
		GenericContext _localctx = new GenericContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_generic);
		int _la;
		try {
			int _alt;
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LTRIANGULAR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(LTRIANGULAR_BRACKET);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(339);
					match(WS);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				((GenericContext)_localctx).type = type();
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(346);
						match(WS);
						}
						} 
					}
					setState(351);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(352);
				((GenericContext)_localctx).csvType = csvType();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(353);
					match(WS);
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				match(RTRIANGULAR_BRACKET);
				((GenericContext)_localctx).value =  "<" + ((GenericContext)_localctx).type.value + ", " + ((GenericContext)_localctx).csvType.value + ">";
				}
				break;
			case RTRIANGULAR_BRACKET:
			case COMMA:
			case ID:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CsvTypeContext extends ParserRuleContext {
		public String value = "";
		public TypeContext type;
		public CsvTypeContext csvType;
		public TerminalNode COMMA() { return getToken(GrammarFileParser.COMMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CsvTypeContext csvType() {
			return getRuleContext(CsvTypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public CsvTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csvType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterCsvType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitCsvType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitCsvType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsvTypeContext csvType() throws RecognitionException {
		CsvTypeContext _localctx = new CsvTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_csvType);
		int _la;
		try {
			int _alt;
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(COMMA);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(366);
					match(WS);
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				((CsvTypeContext)_localctx).type = type();
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						match(WS);
						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(379);
				((CsvTypeContext)_localctx).csvType = csvType();
				((CsvTypeContext)_localctx).value =  ", " + ((CsvTypeContext)_localctx).type.value + ((CsvTypeContext)_localctx).csvType.value;
				}
				break;
			case RTRIANGULAR_BRACKET:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParseStartContext extends ParserRuleContext {
		public NonTerminalDeclaration s;
		public Token ID;
		public TerminalNode START() { return getToken(GrammarFileParser.START, 0); }
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarFileParser.SEMICOLON, 0); }
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public ParseStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterParseStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitParseStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitParseStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseStartContext parseStart() throws RecognitionException {
		ParseStartContext _localctx = new ParseStartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parseStart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(START);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(386);
				match(WS);
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(COLON);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(393);
				match(WS);
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			((ParseStartContext)_localctx).ID = match(ID);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(400);
				match(WS);
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(SEMICOLON);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407);
					match(WS);
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			((ParseStartContext)_localctx).s =  nonTerminalsByName.get((((ParseStartContext)_localctx).ID!=null?((ParseStartContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParseRulesContext extends ParserRuleContext {
		public List<Rule> grammarRules = new ArrayList();
		public TerminalNode RULES() { return getToken(GrammarFileParser.RULES, 0); }
		public TerminalNode COLON() { return getToken(GrammarFileParser.COLON, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public ParseRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterParseRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitParseRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitParseRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseRulesContext parseRules() throws RecognitionException {
		ParseRulesContext _localctx = new ParseRulesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parseRules);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(RULES);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(416);
				match(WS);
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(COLON);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					match(WS);
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(429);
			rules(_localctx.grammarRules);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(430);
					match(WS);
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public List<Rule> grammarRules;
		public OneRuleContext oneRule() {
			return getRuleContext(OneRuleContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarFileParser.SEMICOLON, 0); }
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RulesContext(ParserRuleContext parent, int invokingState, List<Rule> grammarRules) {
			super(parent, invokingState);
			this.grammarRules = grammarRules;
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules(List<Rule> grammarRules) throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState(), grammarRules);
		enterRule(_localctx, 36, RULE_rules);
		int _la;
		try {
			int _alt;
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				oneRule(_localctx.grammarRules);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(437);
					match(WS);
					}
					}
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(443);
				match(SEMICOLON);
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(444);
						match(WS);
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(450);
				rules(_localctx.grammarRules);
				}
				break;
			case EOF:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OneRuleContext extends ParserRuleContext {
		public List<Rule> grammarRules;
		public NonTerminalDeclaration from = null;
		public List<GrammarElement> elements = new ArrayList();
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(GrammarFileParser.ARROW, 0); }
		public GrammarElementsContext grammarElements() {
			return getRuleContext(GrammarElementsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public OneRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OneRuleContext(ParserRuleContext parent, int invokingState, List<Rule> grammarRules) {
			super(parent, invokingState);
			this.grammarRules = grammarRules;
		}
		@Override public int getRuleIndex() { return RULE_oneRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterOneRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitOneRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitOneRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneRuleContext oneRule(List<Rule> grammarRules) throws RecognitionException {
		OneRuleContext _localctx = new OneRuleContext(_ctx, getState(), grammarRules);
		enterRule(_localctx, 38, RULE_oneRule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			((OneRuleContext)_localctx).ID = match(ID);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(456);
				match(WS);
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((OneRuleContext)_localctx).from =  nonTerminalsByName.get((((OneRuleContext)_localctx).ID!=null?((OneRuleContext)_localctx).ID.getText():null));
			setState(463);
			match(ARROW);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464);
					match(WS);
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(470);
			grammarElements(_localctx.elements);
			_localctx.grammarRules.add(new Rule(_localctx.from, _localctx.elements));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarElementsContext extends ParserRuleContext {
		public List<GrammarElement> elements;
		public GrammarElementContext grammarElement;
		public GrammarElementContext grammarElement() {
			return getRuleContext(GrammarElementContext.class,0);
		}
		public GrammarElementsContext grammarElements() {
			return getRuleContext(GrammarElementsContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(GrammarFileParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GrammarFileParser.WS, i);
		}
		public GrammarElementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public GrammarElementsContext(ParserRuleContext parent, int invokingState, List<GrammarElement> elements) {
			super(parent, invokingState);
			this.elements = elements;
		}
		@Override public int getRuleIndex() { return RULE_grammarElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterGrammarElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitGrammarElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitGrammarElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarElementsContext grammarElements(List<GrammarElement> elements) throws RecognitionException {
		GrammarElementsContext _localctx = new GrammarElementsContext(_ctx, getState(), elements);
		enterRule(_localctx, 40, RULE_grammarElements);
		int _la;
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				((GrammarElementsContext)_localctx).grammarElement = grammarElement();
				_localctx.elements.add(((GrammarElementsContext)_localctx).grammarElement.value);
				setState(475);
				grammarElements(_localctx.elements);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(477);
					match(WS);
					}
					}
					setState(480); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WS );
				setState(482);
				((GrammarElementsContext)_localctx).grammarElement = grammarElement();
				_localctx.elements.add(((GrammarElementsContext)_localctx).grammarElement.value);
				setState(484);
				grammarElements(_localctx.elements);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarElementContext extends ParserRuleContext {
		public GrammarElement value;
		public Token CODE;
		public Token ID;
		public ArgsContext args;
		public TerminalNode CODE() { return getToken(GrammarFileParser.CODE, 0); }
		public TerminalNode ID() { return getToken(GrammarFileParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode EPSILON() { return getToken(GrammarFileParser.EPSILON, 0); }
		public GrammarElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterGrammarElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitGrammarElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitGrammarElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarElementContext grammarElement() throws RecognitionException {
		GrammarElementContext _localctx = new GrammarElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_grammarElement);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				((GrammarElementContext)_localctx).CODE = match(CODE);
				((GrammarElementContext)_localctx).value =  new Code((((GrammarElementContext)_localctx).CODE!=null?((GrammarElementContext)_localctx).CODE.getText():null).substring(1, (((GrammarElementContext)_localctx).CODE!=null?((GrammarElementContext)_localctx).CODE.getText():null).length() - 1));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				((GrammarElementContext)_localctx).ID = match(ID);
				setState(492);
				((GrammarElementContext)_localctx).args = args();

				        if (terminalsByName.containsKey((((GrammarElementContext)_localctx).ID!=null?((GrammarElementContext)_localctx).ID.getText():null))) {
				            ((GrammarElementContext)_localctx).value =  terminalsByName.get((((GrammarElementContext)_localctx).ID!=null?((GrammarElementContext)_localctx).ID.getText():null));
				        } else {
				            ((GrammarElementContext)_localctx).value =  new NonTerminalValue((((GrammarElementContext)_localctx).ID!=null?((GrammarElementContext)_localctx).ID.getText():null), ((GrammarElementContext)_localctx).args.value);
				        }
				      
				}
				break;
			case EPSILON:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(EPSILON);
				((GrammarElementContext)_localctx).value =  Grammar.EPS;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<Argument> value = new ArrayList<>();
		public Token ARGUMENTS;
		public TerminalNode ARGUMENTS() { return getToken(GrammarFileParser.ARGUMENTS, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarFileListener ) ((GrammarFileListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarFileVisitor ) return ((GrammarFileVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_args);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				((ArgsContext)_localctx).ARGUMENTS = match(ARGUMENTS);
				 String synStr  = (((ArgsContext)_localctx).ARGUMENTS!=null?((ArgsContext)_localctx).ARGUMENTS.getText():null).substring(1, (((ArgsContext)_localctx).ARGUMENTS!=null?((ArgsContext)_localctx).ARGUMENTS.getText():null).length()- 1);
				         ((ArgsContext)_localctx).value =  Arrays.stream(synStr.split(",")).map(Argument::new).collect(Collectors.toList());
				       
				}
				break;
			case EPSILON:
			case CODE:
			case SEMICOLON:
			case ID:
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u01fb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\7\2N\n\2\f\2\16"+
		"\2Q\13\2\3\2\3\2\7\2U\n\2\f\2\16\2X\13\2\3\2\3\2\7\2\\\n\2\f\2\16\2_\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\7\4o\n"+
		"\4\f\4\16\4r\13\4\3\4\3\4\5\4v\n\4\3\5\3\5\7\5z\n\5\f\5\16\5}\13\5\3\5"+
		"\3\5\7\5\u0081\n\5\f\5\16\5\u0084\13\5\3\5\3\5\3\5\3\5\5\5\u008a\n\5\3"+
		"\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\6\3\6\7\6\u0095\n\6\f\6\16"+
		"\6\u0098\13\6\3\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3\7\3\7\7\7\u00a3"+
		"\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\7\7\u00aa\n\7\f\7\16\7\u00ad\13\7\3\7"+
		"\3\7\3\7\5\7\u00b2\n\7\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\3"+
		"\b\7\b\u00bd\n\b\f\b\16\b\u00c0\13\b\3\b\3\b\3\b\3\t\3\t\7\t\u00c7\n\t"+
		"\f\t\16\t\u00ca\13\t\3\t\3\t\7\t\u00ce\n\t\f\t\16\t\u00d1\13\t\3\t\3\t"+
		"\7\t\u00d5\n\t\f\t\16\t\u00d8\13\t\3\n\3\n\7\n\u00dc\n\n\f\n\16\n\u00df"+
		"\13\n\3\n\3\n\7\n\u00e3\n\n\f\n\16\n\u00e6\13\n\3\n\3\n\3\n\5\n\u00eb"+
		"\n\n\3\13\3\13\7\13\u00ef\n\13\f\13\16\13\u00f2\13\13\3\13\3\13\3\13\3"+
		"\f\3\f\7\f\u00f9\n\f\f\f\16\f\u00fc\13\f\3\f\3\f\7\f\u0100\n\f\f\f\16"+
		"\f\u0103\13\f\3\f\3\f\5\f\u0107\n\f\3\f\7\f\u010a\n\f\f\f\16\f\u010d\13"+
		"\f\3\f\3\f\7\f\u0111\n\f\f\f\16\f\u0114\13\f\3\f\3\f\7\f\u0118\n\f\f\f"+
		"\16\f\u011b\13\f\3\f\3\f\7\f\u011f\n\f\f\f\16\f\u0122\13\f\3\f\3\f\5\f"+
		"\u0126\n\f\3\f\5\f\u0129\n\f\3\r\3\r\7\r\u012d\n\r\f\r\16\r\u0130\13\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u0137\n\r\f\r\16\r\u013a\13\r\3\r\3\r\3\r\5\r"+
		"\u013f\n\r\3\16\3\16\7\16\u0143\n\16\f\16\16\16\u0146\13\16\3\16\3\16"+
		"\3\16\3\17\3\17\7\17\u014d\n\17\f\17\16\17\u0150\13\17\3\17\3\17\3\17"+
		"\3\20\3\20\7\20\u0157\n\20\f\20\16\20\u015a\13\20\3\20\3\20\7\20\u015e"+
		"\n\20\f\20\16\20\u0161\13\20\3\20\3\20\7\20\u0165\n\20\f\20\16\20\u0168"+
		"\13\20\3\20\3\20\3\20\3\20\5\20\u016e\n\20\3\21\3\21\7\21\u0172\n\21\f"+
		"\21\16\21\u0175\13\21\3\21\3\21\7\21\u0179\n\21\f\21\16\21\u017c\13\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0182\n\21\3\22\3\22\7\22\u0186\n\22\f\22\16"+
		"\22\u0189\13\22\3\22\3\22\7\22\u018d\n\22\f\22\16\22\u0190\13\22\3\22"+
		"\3\22\7\22\u0194\n\22\f\22\16\22\u0197\13\22\3\22\3\22\7\22\u019b\n\22"+
		"\f\22\16\22\u019e\13\22\3\22\3\22\3\23\3\23\7\23\u01a4\n\23\f\23\16\23"+
		"\u01a7\13\23\3\23\3\23\7\23\u01ab\n\23\f\23\16\23\u01ae\13\23\3\23\3\23"+
		"\7\23\u01b2\n\23\f\23\16\23\u01b5\13\23\3\24\3\24\7\24\u01b9\n\24\f\24"+
		"\16\24\u01bc\13\24\3\24\3\24\7\24\u01c0\n\24\f\24\16\24\u01c3\13\24\3"+
		"\24\3\24\3\24\5\24\u01c8\n\24\3\25\3\25\7\25\u01cc\n\25\f\25\16\25\u01cf"+
		"\13\25\3\25\3\25\3\25\7\25\u01d4\n\25\f\25\16\25\u01d7\13\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\6\26\u01e1\n\26\r\26\16\26\u01e2\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u01ea\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01f4\n\27\3\30\3\30\3\30\5\30\u01f9\n\30\3\30\2\2\31\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u0227\2\63\3\2\2\2\4"+
		"b\3\2\2\2\6u\3\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2\f\u00b1\3\2\2\2\16"+
		"\u00b3\3\2\2\2\20\u00c4\3\2\2\2\22\u00ea\3\2\2\2\24\u00ec\3\2\2\2\26\u0128"+
		"\3\2\2\2\30\u013e\3\2\2\2\32\u0140\3\2\2\2\34\u014a\3\2\2\2\36\u016d\3"+
		"\2\2\2 \u0181\3\2\2\2\"\u0183\3\2\2\2$\u01a1\3\2\2\2&\u01c7\3\2\2\2(\u01c9"+
		"\3\2\2\2*\u01e9\3\2\2\2,\u01f3\3\2\2\2.\u01f8\3\2\2\2\60\62\7\25\2\2\61"+
		"\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65"+
		"\63\3\2\2\2\66:\5\4\3\2\679\7\25\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:"+
		";\3\2\2\2;=\3\2\2\2<:\3\2\2\2=A\5\6\4\2>@\7\25\2\2?>\3\2\2\2@C\3\2\2\2"+
		"A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DH\5\n\6\2EG\7\25\2\2FE\3\2\2"+
		"\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KO\5\20\t\2LN\7\25"+
		"\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RV\5\""+
		"\22\2SU\7\25\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3"+
		"\2\2\2Y]\5$\23\2Z\\\7\25\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^`\3\2\2\2_]\3\2\2\2`a\b\2\1\2a\3\3\2\2\2bc\7\17\2\2cd\b\3\1\2d\5\3\2"+
		"\2\2ei\7\t\2\2fh\7\25\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3"+
		"\2\2\2ki\3\2\2\2lp\7\20\2\2mo\7\25\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2p"+
		"q\3\2\2\2qs\3\2\2\2rp\3\2\2\2sv\5\b\5\2tv\3\2\2\2ue\3\2\2\2ut\3\2\2\2"+
		"v\7\3\2\2\2w{\7\r\2\2xz\7\25\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}{\3\2\2\2~\u0082\7\22\2\2\177\u0081\7\25\2\2\u0080\177\3"+
		"\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5\b\5\2\u0086\u0087\b\5"+
		"\1\2\u0087\u008a\3\2\2\2\u0088\u008a\3\2\2\2\u0089w\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\t\3\2\2\2\u008b\u008f\7\4\2\2\u008c\u008e\7\25\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096\7\20\2\2\u0093"+
		"\u0095\7\25\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009d\5\f\7\2\u009a\u009c\7\25\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\13\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a4\5\16\b\2\u00a1\u00a3\7\25\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab\7\22\2\2\u00a8\u00aa\7"+
		"\25\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5\f"+
		"\7\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a0\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\r\3\2\2\2\u00b3\u00b7\7\24\2\2\u00b4\u00b6\7\25\2"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00be\7\21\2\2"+
		"\u00bb\u00bd\7\25\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7\r\2\2\u00c2\u00c3\b\b\1\2\u00c3\17\3\2\2\2\u00c4\u00c8\7\5\2"+
		"\2\u00c5\u00c7\7\25\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cf\7\20\2\2\u00cc\u00ce\7\25\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d6\5\22\n\2\u00d3\u00d5\7\25\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\21\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dd\5\24\13\2\u00da"+
		"\u00dc\7\25\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e4\7\22\2\2\u00e1\u00e3\7\25\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3"+
		"\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\3"+
		"\2\2\2\u00ea\u00d9\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\23\3\2\2\2\u00ec"+
		"\u00f0\7\24\2\2\u00ed\u00ef\7\25\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\5\26\f\2\u00f4\u00f5\b\13\1\2\u00f5\25\3\2"+
		"\2\2\u00f6\u00fa\7\13\2\2\u00f7\u00f9\7\25\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0101\5\30\r\2\u00fe\u0100\7\25\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\f\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u00f6\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010b\3\2"+
		"\2\2\u0108\u010a\7\25\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0125\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0112\7\6\2\2\u010f\u0111\7\25\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0115\u0119\7\13\2\2\u0116\u0118\7\25\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0120\5\30\r\2\u011d"+
		"\u011f\7\25\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\7\f\2\2\u0124\u0126\3\2\2\2\u0125\u010e\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0129\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0106\3\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\27\3\2\2\2\u012a\u012e\5\32\16\2\u012b\u012d\7\25"+
		"\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\5\30"+
		"\r\2\u0132\u013f\3\2\2\2\u0133\u0134\7\22\2\2\u0134\u0138\5\32\16\2\u0135"+
		"\u0137\7\25\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\5\30\r\2\u013c\u013f\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u012a\3"+
		"\2\2\2\u013e\u0133\3\2\2\2\u013e\u013d\3\2\2\2\u013f\31\3\2\2\2\u0140"+
		"\u0144\5\34\17\2\u0141\u0143\7\25\2\2\u0142\u0141\3\2\2\2\u0143\u0146"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u0148\7\24\2\2\u0148\u0149\b\16\1\2\u0149\33\3\2"+
		"\2\2\u014a\u014e\7\24\2\2\u014b\u014d\7\25\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5\36\20\2\u0152\u0153\b\17\1\2\u0153"+
		"\35\3\2\2\2\u0154\u0158\7\13\2\2\u0155\u0157\7\25\2\2\u0156\u0155\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015f\5\34\17\2\u015c\u015e\7"+
		"\25\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0166\5 "+
		"\21\2\u0163\u0165\7\25\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169\u016a\7\f\2\2\u016a\u016b\b\20\1\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u0154\3\2\2\2\u016d\u016c\3\2\2\2\u016e\37\3\2\2"+
		"\2\u016f\u0173\7\23\2\2\u0170\u0172\7\25\2\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u017a\5\34\17\2\u0177\u0179\7\25\2\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\5 \21\2\u017e"+
		"\u017f\b\21\1\2\u017f\u0182\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u016f\3"+
		"\2\2\2\u0181\u0180\3\2\2\2\u0182!\3\2\2\2\u0183\u0187\7\7\2\2\u0184\u0186"+
		"\7\25\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2"+
		"\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018e"+
		"\7\20\2\2\u018b\u018d\7\25\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e"+
		"\3\2\2\2\u0191\u0195\7\24\2\2\u0192\u0194\7\25\2\2\u0193\u0192\3\2\2\2"+
		"\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019c\7\22\2\2\u0199\u019b\7\25\2\2"+
		"\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\b\22\1\2"+
		"\u01a0#\3\2\2\2\u01a1\u01a5\7\b\2\2\u01a2\u01a4\7\25\2\2\u01a3\u01a2\3"+
		"\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ac\7\20\2\2\u01a9\u01ab\7"+
		"\25\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b3\5&"+
		"\24\2\u01b0\u01b2\7\25\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4%\3\2\2\2\u01b5\u01b3\3\2\2\2"+
		"\u01b6\u01ba\5(\25\2\u01b7\u01b9\7\25\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01c1\7\22\2\2\u01be\u01c0\7\25\2\2\u01bf\u01be\3"+
		"\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\5&\24\2\u01c5\u01c8\3\2"+
		"\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01b6\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8"+
		"\'\3\2\2\2\u01c9\u01cd\7\24\2\2\u01ca\u01cc\7\25\2\2\u01cb\u01ca\3\2\2"+
		"\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\b\25\1\2\u01d1\u01d5\7\3\2\2"+
		"\u01d2\u01d4\7\25\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8"+
		"\u01d9\5*\26\2\u01d9\u01da\b\25\1\2\u01da)\3\2\2\2\u01db\u01dc\5,\27\2"+
		"\u01dc\u01dd\b\26\1\2\u01dd\u01de\5*\26\2\u01de\u01ea\3\2\2\2\u01df\u01e1"+
		"\7\25\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2"+
		"\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\5,\27\2\u01e5\u01e6"+
		"\b\26\1\2\u01e6\u01e7\5*\26\2\u01e7\u01ea\3\2\2\2\u01e8\u01ea\3\2\2\2"+
		"\u01e9\u01db\3\2\2\2\u01e9\u01e0\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea+\3"+
		"\2\2\2\u01eb\u01ec\7\16\2\2\u01ec\u01f4\b\27\1\2\u01ed\u01ee\7\24\2\2"+
		"\u01ee\u01ef\5.\30\2\u01ef\u01f0\b\27\1\2\u01f0\u01f4\3\2\2\2\u01f1\u01f2"+
		"\7\n\2\2\u01f2\u01f4\b\27\1\2\u01f3\u01eb\3\2\2\2\u01f3\u01ed\3\2\2\2"+
		"\u01f3\u01f1\3\2\2\2\u01f4-\3\2\2\2\u01f5\u01f6\7\26\2\2\u01f6\u01f9\b"+
		"\30\1\2\u01f7\u01f9\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9"+
		"/\3\2\2\2C\63:AHOV]ipu{\u0082\u0089\u008f\u0096\u009d\u00a4\u00ab\u00b1"+
		"\u00b7\u00be\u00c8\u00cf\u00d6\u00dd\u00e4\u00ea\u00f0\u00fa\u0101\u0106"+
		"\u010b\u0112\u0119\u0120\u0125\u0128\u012e\u0138\u013e\u0144\u014e\u0158"+
		"\u015f\u0166\u016d\u0173\u017a\u0181\u0187\u018e\u0195\u019c\u01a5\u01ac"+
		"\u01b3\u01ba\u01c1\u01c7\u01cd\u01d5\u01e2\u01e9\u01f3\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
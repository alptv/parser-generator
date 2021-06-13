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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarFileParser}.
 */
public interface GrammarFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#parseGrammarFile}.
	 * @param ctx the parse tree
	 */
	void enterParseGrammarFile(GrammarFileParser.ParseGrammarFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#parseGrammarFile}.
	 * @param ctx the parse tree
	 */
	void exitParseGrammarFile(GrammarFileParser.ParseGrammarFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarFileParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarFileParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#miss}.
	 * @param ctx the parse tree
	 */
	void enterMiss(GrammarFileParser.MissContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#miss}.
	 * @param ctx the parse tree
	 */
	void exitMiss(GrammarFileParser.MissContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#missList}.
	 * @param ctx the parse tree
	 */
	void enterMissList(GrammarFileParser.MissListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#missList}.
	 * @param ctx the parse tree
	 */
	void exitMissList(GrammarFileParser.MissListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#parseTerminals}.
	 * @param ctx the parse tree
	 */
	void enterParseTerminals(GrammarFileParser.ParseTerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#parseTerminals}.
	 * @param ctx the parse tree
	 */
	void exitParseTerminals(GrammarFileParser.ParseTerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#terminals}.
	 * @param ctx the parse tree
	 */
	void enterTerminals(GrammarFileParser.TerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#terminals}.
	 * @param ctx the parse tree
	 */
	void exitTerminals(GrammarFileParser.TerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(GrammarFileParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(GrammarFileParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#parseNonTerminals}.
	 * @param ctx the parse tree
	 */
	void enterParseNonTerminals(GrammarFileParser.ParseNonTerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#parseNonTerminals}.
	 * @param ctx the parse tree
	 */
	void exitParseNonTerminals(GrammarFileParser.ParseNonTerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#nonTerminals}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminals(GrammarFileParser.NonTerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#nonTerminals}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminals(GrammarFileParser.NonTerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminal(GrammarFileParser.NonTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#nonTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminal(GrammarFileParser.NonTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(GrammarFileParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(GrammarFileParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#attributesList}.
	 * @param ctx the parse tree
	 */
	void enterAttributesList(GrammarFileParser.AttributesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#attributesList}.
	 * @param ctx the parse tree
	 */
	void exitAttributesList(GrammarFileParser.AttributesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GrammarFileParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GrammarFileParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarFileParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarFileParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#generic}.
	 * @param ctx the parse tree
	 */
	void enterGeneric(GrammarFileParser.GenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#generic}.
	 * @param ctx the parse tree
	 */
	void exitGeneric(GrammarFileParser.GenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#csvType}.
	 * @param ctx the parse tree
	 */
	void enterCsvType(GrammarFileParser.CsvTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#csvType}.
	 * @param ctx the parse tree
	 */
	void exitCsvType(GrammarFileParser.CsvTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#parseStart}.
	 * @param ctx the parse tree
	 */
	void enterParseStart(GrammarFileParser.ParseStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#parseStart}.
	 * @param ctx the parse tree
	 */
	void exitParseStart(GrammarFileParser.ParseStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#parseRules}.
	 * @param ctx the parse tree
	 */
	void enterParseRules(GrammarFileParser.ParseRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#parseRules}.
	 * @param ctx the parse tree
	 */
	void exitParseRules(GrammarFileParser.ParseRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarFileParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarFileParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#oneRule}.
	 * @param ctx the parse tree
	 */
	void enterOneRule(GrammarFileParser.OneRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#oneRule}.
	 * @param ctx the parse tree
	 */
	void exitOneRule(GrammarFileParser.OneRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#grammarElements}.
	 * @param ctx the parse tree
	 */
	void enterGrammarElements(GrammarFileParser.GrammarElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#grammarElements}.
	 * @param ctx the parse tree
	 */
	void exitGrammarElements(GrammarFileParser.GrammarElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#grammarElement}.
	 * @param ctx the parse tree
	 */
	void enterGrammarElement(GrammarFileParser.GrammarElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#grammarElement}.
	 * @param ctx the parse tree
	 */
	void exitGrammarElement(GrammarFileParser.GrammarElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammarFileParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammarFileParser.ArgsContext ctx);
}
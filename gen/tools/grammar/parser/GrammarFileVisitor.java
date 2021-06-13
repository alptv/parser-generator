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

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#parseGrammarFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseGrammarFile(GrammarFileParser.ParseGrammarFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammarFileParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#miss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiss(GrammarFileParser.MissContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#missList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissList(GrammarFileParser.MissListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#parseTerminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseTerminals(GrammarFileParser.ParseTerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#terminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminals(GrammarFileParser.TerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(GrammarFileParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#parseNonTerminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseNonTerminals(GrammarFileParser.ParseNonTerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#nonTerminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminals(GrammarFileParser.NonTerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#nonTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminal(GrammarFileParser.NonTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(GrammarFileParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#attributesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributesList(GrammarFileParser.AttributesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GrammarFileParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarFileParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#generic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric(GrammarFileParser.GenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#csvType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsvType(GrammarFileParser.CsvTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#parseStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseStart(GrammarFileParser.ParseStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#parseRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseRules(GrammarFileParser.ParseRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(GrammarFileParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#oneRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneRule(GrammarFileParser.OneRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#grammarElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarElements(GrammarFileParser.GrammarElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#grammarElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarElement(GrammarFileParser.GrammarElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GrammarFileParser.ArgsContext ctx);
}
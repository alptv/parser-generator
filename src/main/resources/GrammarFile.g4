grammar GrammarFile;

import Tokens;


//package parser.generator.grammar;
@header {
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
}

@members {
Map<String, Terminal> terminalsByName = new HashMap<>();
Map<String, NonTerminalDeclaration> nonTerminalsByName = new HashMap<>();
}

parseGrammarFile returns [Grammar grammar]
    : WS* name WS* miss WS* parseTerminals WS* parseNonTerminals WS* parseStart WS* parseRules WS*
        { $grammar = new Grammar($name.value, $parseStart.s, $parseTerminals.terms, $miss.regex, $parseNonTerminals.nonTerms, $parseRules.grammarRules);}
    ;
//name
name returns [String value]
     : GRAMMAR_NAME
     {  String name = $GRAMMAR_NAME.text;
        name = name.substring("grammar".length(), name.length()).trim();
        $value = name;
     }
     ;

//Skip

miss returns [List<String> regex = new ArrayList()]
    : MISS WS* COLON WS* missList[$regex]
    |
    ;

missList[List<String> regex]
    : REGEXP WS* SEMICOLON WS* missList[$regex] {regex.add($REGEXP.text);}
    |
    ;


//Terminals

parseTerminals returns [List<Terminal> terms = new ArrayList<>()]
    : TERMINALS WS* COLON WS* terminals[$terms] WS*
    ;

terminals[List<Terminal> terms]
    : terminal[$terms] WS* SEMICOLON WS* terminals[$terms]
    |
    ;

terminal[List<Terminal> terms]
    : ID WS* EQ WS* REGEXP
        { Terminal term = new Terminal($ID.text, $REGEXP.text);
          $terms.add(term);
          terminalsByName.put($ID.text, term);
        }
    ;


//NonTerminals
parseNonTerminals returns [List<NonTerminalDeclaration> nonTerms = new ArrayList<>()]
    : NON_TERMINALS WS* COLON WS* nonTerminals[$nonTerms] WS*
    ;

nonTerminals[List<NonTerminalDeclaration> nonTerms]
    : nonTerminal[$nonTerms] WS* SEMICOLON WS* nonTerminals[$nonTerms]
    |
    ;

nonTerminal[List<NonTerminalDeclaration> nonTerms]
    : ID WS* attributes
        { NonTerminalDeclaration nonTerm = new NonTerminalDeclaration($ID.text, $attributes.inheritance, $attributes.synthesized);
          nonTerms.add(nonTerm);
          nonTerminalsByName.put($ID.text, nonTerm);
        }
    ;

attributes returns [List<Attribute> inheritance = new ArrayList(),
                    List<Attribute> synthesized = new ArrayList()]
    : (LTRIANGULAR_BRACKET WS* attributesList[$inheritance] WS* RTRIANGULAR_BRACKET)? WS*
      (RETURNS  WS* LTRIANGULAR_BRACKET WS* attributesList[$synthesized] WS* RTRIANGULAR_BRACKET)?
    |
    ;


//Inheritance Attributes
attributesList[List<Attribute> attr]
    :  attribute[$attr] WS* attributesList[$attr]
    | SEMICOLON attribute[$attr] WS* attributesList[$attr]
    |
    ;

attribute[List<Attribute> attr]
    : type WS* ID {$attr.add(new Attribute($ID.text, $type.value));}
    ;

//Type
type returns [String value = ""]
    : ID WS* generic {$value = $ID.text + $generic.value;}
    ;


generic returns [String value = ""]
    : LTRIANGULAR_BRACKET WS* type WS* csvType WS* RTRIANGULAR_BRACKET
        {$value = "<" + $type.value + ", " + $csvType.value + ">";}
    |
    ;

csvType returns [String value = ""]
    : COMMA WS* type WS* csvType {$value = ", " + $type.value + $csvType.value;}
    |
    ;

//Start
parseStart returns [NonTerminalDeclaration s]
    : START WS* COLON WS* ID WS* SEMICOLON WS* {$s = nonTerminalsByName.get($ID.text);}
    ;

//Rules

parseRules returns[List<Rule> grammarRules = new ArrayList()]
    : RULES WS* COLON WS* rules[$grammarRules] WS*
    ;

rules[List<Rule> grammarRules]
    : oneRule[$grammarRules] WS* SEMICOLON WS* rules[$grammarRules]
    |
    ;


oneRule[List<Rule> grammarRules]
locals [NonTerminalDeclaration from = null,
        List<GrammarElement> elements = new ArrayList()]
    : ID WS*
      {$from = nonTerminalsByName.get($ID.text);}
      ARROW WS* grammarElements[$elements]
      {$grammarRules.add(new Rule($from, $elements));}
    ;


grammarElements[List<GrammarElement> elements]
    :     grammarElement {$elements.add($grammarElement.value);} grammarElements[$elements]
    | WS+ grammarElement {$elements.add($grammarElement.value);} grammarElements[$elements]
    |
    ;



grammarElement returns [GrammarElement value]
    : CODE {$value  = new Code($CODE.text.substring(1, $CODE.text.length() - 1));}
    | ID args
      {
        if (terminalsByName.containsKey($ID.text)) {
            $value = terminalsByName.get($ID.text);
        } else {
            $value = new NonTerminalValue($ID.text, $args.value);
        }
      }
    | EPSILON {$value = Grammar.EPS;}
    ;

//  NonTerminal  t = nonTerminalsByName.get($ID.text);
args returns [List<Argument> value = new ArrayList<>()]
    :  ARGUMENTS
       { String synStr  = $ARGUMENTS.text.substring(1, $ARGUMENTS.text.length()- 1);
         $value = Arrays.stream(synStr.split(",")).map(Argument::new).collect(Collectors.toList());
       }
    |
    ;
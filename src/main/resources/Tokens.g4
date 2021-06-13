lexer grammar Tokens;



ARROW : '->' ;

TERMINALS             : 'terminals'             ;
NON_TERMINALS         : 'non-terminals'         ;
RETURNS               : 'returns'               ;
START                 : 'start'                 ;
RULES                 : 'rules'                 ;
MISS                  : 'miss'                  ;
EPSILON               : 'EPS'                   ;
LTRIANGULAR_BRACKET   : '<'                     ;
RTRIANGULAR_BRACKET   : '>'                     ;
REGEXP                : '"' ~["]+ '"'           ; // mb change
CODE                  : '{' (~[{}]+ CODE?)*'}'   ;
GRAMMAR_NAME          : 'grammar' WS+ [a-zA-Z]+ ;

COLON                 : ':'   ;
EQ                    : '='   ;
SEMICOLON             : ';'   ;
COMMA                 : ','   ;
ID                    : [a-zA-Z_][a-zA-Z_0-9]* ;
WS                    : [ \r\t\n]     ;
ARGUMENTS             : '[' ~[\];]+ ']';

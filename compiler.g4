grammar compiler;

//r   : 'hello' ID;
//ID  : [a-z]+ ;
//WS  : [ \t\r\n]+ -> skip ;

//terminal keyword
T_INT : 'int' ;
T_DOUBLE : 'double' ;
T_STRING : 'string' ;
T_BOOLEAN : 'bool' ;
VOID : 'void';
NULL : 'null';
THIS: 'this';
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
RETURN: 'return';
BREAK: 'break';
NEW: 'new';
NEWARRAY: 'NewArray';
PRINT: 'Print';
READINTEGER: 'ReadInteger';
READLINE: 'ReadLine';
//extra
UNDESCORE: '_';
PLUS : '+';
MINUS : '-';
STAR : '*';
SLASH : '/';
MOD : '%';
LESS_SIGN: '<';
LESS_EQUAL : '<=';
MORE_SIGN : '>';
MORE_EQUAL : '=>';
EQUAL : '=';
EQUALEQUAL: '==';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
NOT : '!';
SEMICOLON : ';';
COMMA: ',';
DOT : '.';
BRACKET : '[]';
BRACKET2 : '[ ]';
PAREBTISES : '()';
COMMENT : '//';
OPEN_COMMENT : '/*';
CLOSE_COMMENT : '*/';


//Aref
//identifier
ID  : ([a-z]|[A_Z]) (UNDESCORE | [a-z] | [A-Z] | [0-9] )* ;
//strings
STRING: '"' (~[\\"\r\n])+ '"';
//TODO comments
MULTI_LINE_COMMENT: OPEN_COMMENT (MULTI_LINE_COMMENT | .)*? CLOSE_COMMENT -> skip;
ONE_LINE_COMMENT: COMMENT (~ '\n')* '\n'? -> skip;
//Aref

CONST_NUMBER : [0-9]+ ('x'|'X')? (('0'..'9')* | ('a'..'f')* ); //TODO erfan Error
Decimal_num : [0-9]+ '.' ('0'..'9')* ('e' | 'E')? (PLUS|MINUS)? ('0'..'9')*;


r : CONST_NUMBER ;

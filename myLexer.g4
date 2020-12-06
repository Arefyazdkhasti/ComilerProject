grammar compiler;

WS  : [ \t\r\n]+ -> skip ;

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
EPSILON: ' '; //TODO ??
//Aref
//identifier
ID  : ([a-z]|[A_Z]) (UNDESCORE | [a-z] | [A-Z] | [0-9] )* ;
//strings
STRING: '"' (~[\\"\r\n])+ '"';
//TODO comments
MULTI_LINE_COMMENT: OPEN_COMMENT (MULTI_LINE_COMMENT | .)*? CLOSE_COMMENT -> skip;
ONE_LINE_COMMENT: COMMENT (~ '\n')* '\n'? -> skip;
//Aref

//number decimal and Hex عدد صحیح
CONST_NUMBER : [0-9]+ ('x'|'X')? (('0'..'9')* | ('a'..'f')* ); //TODO erfan Error
//decimal عدد اعشاری
Decimal_num : [0-9]+ '.' ('0'..'9')* ('e' | 'E')? (PLUS|MINUS)? ('0'..'9')*; //Erfan

lexeme : (T_INT| T_DOUBLE| T_STRING| T_BOOLEAN
         | VOID| NULL| THIS| FOR| WHILE| IF| ELSE
         | RETURN| BREAK| NEW| NEWARRAY| PRINT| READINTEGER| READLINE
         | ID| STRING| CONST_NUMBER| Decimal_num)+;



/*
//Language Grammer
decl : variableDecl | functionDecl;
variableDecl : variable;
variable : type ID;
type : T_INT|T_DOUBLE|T_BOOLEAN|T_STRING|ID| type BRACKET;
functionDecl: type ID '('formals')' stmtBlock SEMICOLON| VOID ID '('formals')' stmtBlock SEMICOLON;
formals : variable+ ','| EPSILON;
protoType : type ID '('formals')' SEMICOLON|VOID ID '('formals')';
stmtBlock : '{' variableDecl* stmt* '}';
stmt : '<' expr '>' | ifStmt|whileStmt|forStmt|breakStmt|returnStmt|printStmt|stmtBlock;
ifStmt : IF '(' expr ')' stmt '<' ELSE '>';
whileStmt: WHILE '(' expr ')' stmt;
forStmt: FOR '(' '<' expr '>' SEMICOLON expr SEMICOLON '<' expr '>' ')' stmt ;
breakStmt: RETURN '<' expr '>';
returnStmt: BREAK;
printStmt: PRINT '(' expr COMMA ')'; //need expr+ got errer

//TODO first expr
expr : constant | THIS | call | '('expr')'
       | expr PLUS expr | expr MINUS expr | expr STAR expr | expr SLASH expr | expr MOD expr
       | MINUS expr| expr LESS_SIGN expr | expr LESS_EQUAL expr | expr MORE_SIGN expr | expr MORE_EQUAL expr
       | expr EQUALEQUAL expr | expr NOTEQUAL expr | expr AND expr | expr OR expr | NOT expr;

call : ID '(' actual ')'; //need expr+ got errer
actual : expr COMMA| EPSILON;
constant : ; //TODO constant
*/
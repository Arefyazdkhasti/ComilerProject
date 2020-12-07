// Generated from myLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, T_INT=2, T_DOUBLE=3, T_STRING=4, T_BOOLEAN=5, VOID=6, NULL=7, THIS=8, 
		FOR=9, WHILE=10, IF=11, ELSE=12, RETURN=13, BREAK=14, NEW=15, NEWARRAY=16, 
		PRINT=17, READINTEGER=18, READLINE=19, UNDESCORE=20, PLUS=21, MINUS=22, 
		STAR=23, SLASH=24, MOD=25, LESS_SIGN=26, LESS_EQUAL=27, MORE_SIGN=28, 
		MORE_EQUAL=29, EQUAL=30, EQUALEQUAL=31, NOTEQUAL=32, AND=33, OR=34, NOT=35, 
		SEMICOLON=36, COMMA=37, DOT=38, OPENBRACKET=39, CLOSEBRACKET=40, OPENBPARENTISIS=41, 
		CLOSEPARENTISIS=42, OPENACULAD=43, CLOSEACULAD=44, COMMENT=45, OPEN_COMMENT=46, 
		CLOSE_COMMENT=47, QUOTAION=48, FULL_QUOTAION=49, FALSE=50, TRUE=51, EPSILON=52, 
		ID=53, STRING=54, MULTI_LINE_COMMENT=55, ONE_LINE_COMMENT=56, CONST_NUMBER=57, 
		Decimal_num=58, Undifiend_Tokens=59, BRACKET=60, BRACKET2=61, PAREBTISES=62, 
		ACULAD=63;
	public static final int
		RULE_lexeme = 0, RULE_decl = 1, RULE_variableDecl = 2, RULE_variable = 3, 
		RULE_type = 4, RULE_functionDecl = 5, RULE_formals = 6, RULE_protoType = 7, 
		RULE_stmtBlock = 8, RULE_stmt = 9, RULE_ifStmt = 10, RULE_whileStmt = 11, 
		RULE_forStmt = 12, RULE_breakStmt = 13, RULE_returnStmt = 14, RULE_printStmt = 15, 
		RULE_expr = 16, RULE_call = 17, RULE_actual = 18, RULE_constant = 19, 
		RULE_parse = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"lexeme", "decl", "variableDecl", "variable", "type", "functionDecl", 
			"formals", "protoType", "stmtBlock", "stmt", "ifStmt", "whileStmt", "forStmt", 
			"breakStmt", "returnStmt", "printStmt", "expr", "call", "actual", "constant", 
			"parse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'double'", "'string'", "'bool'", "'void'", "'null'", 
			"'this'", "'for'", "'while'", "'if'", "'else'", "'return'", "'break'", 
			"'new'", "'NewArray'", "'Print'", "'ReadInteger'", "'ReadLine'", "'_'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", "'=>'", "'='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", "';'", "','", "'.'", "'['", "']'", 
			"'('", "')'", "'{'", "'}'", "'//'", "'/*'", "'*/'", "'\"'", "'\"\"'", 
			null, null, "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "T_INT", "T_DOUBLE", "T_STRING", "T_BOOLEAN", "VOID", "NULL", 
			"THIS", "FOR", "WHILE", "IF", "ELSE", "RETURN", "BREAK", "NEW", "NEWARRAY", 
			"PRINT", "READINTEGER", "READLINE", "UNDESCORE", "PLUS", "MINUS", "STAR", 
			"SLASH", "MOD", "LESS_SIGN", "LESS_EQUAL", "MORE_SIGN", "MORE_EQUAL", 
			"EQUAL", "EQUALEQUAL", "NOTEQUAL", "AND", "OR", "NOT", "SEMICOLON", "COMMA", 
			"DOT", "OPENBRACKET", "CLOSEBRACKET", "OPENBPARENTISIS", "CLOSEPARENTISIS", 
			"OPENACULAD", "CLOSEACULAD", "COMMENT", "OPEN_COMMENT", "CLOSE_COMMENT", 
			"QUOTAION", "FULL_QUOTAION", "FALSE", "TRUE", "EPSILON", "ID", "STRING", 
			"MULTI_LINE_COMMENT", "ONE_LINE_COMMENT", "CONST_NUMBER", "Decimal_num", 
			"Undifiend_Tokens", "BRACKET", "BRACKET2", "PAREBTISES", "ACULAD"
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
	public String getGrammarFileName() { return "myLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LexemeContext extends ParserRuleContext {
		public List<TerminalNode> ONE_LINE_COMMENT() { return getTokens(myLexerParser.ONE_LINE_COMMENT); }
		public TerminalNode ONE_LINE_COMMENT(int i) {
			return getToken(myLexerParser.ONE_LINE_COMMENT, i);
		}
		public List<TerminalNode> MULTI_LINE_COMMENT() { return getTokens(myLexerParser.MULTI_LINE_COMMENT); }
		public TerminalNode MULTI_LINE_COMMENT(int i) {
			return getToken(myLexerParser.MULTI_LINE_COMMENT, i);
		}
		public List<TerminalNode> Undifiend_Tokens() { return getTokens(myLexerParser.Undifiend_Tokens); }
		public TerminalNode Undifiend_Tokens(int i) {
			return getToken(myLexerParser.Undifiend_Tokens, i);
		}
		public List<TerminalNode> ID() { return getTokens(myLexerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myLexerParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(myLexerParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(myLexerParser.STRING, i);
		}
		public List<TerminalNode> CONST_NUMBER() { return getTokens(myLexerParser.CONST_NUMBER); }
		public TerminalNode CONST_NUMBER(int i) {
			return getToken(myLexerParser.CONST_NUMBER, i);
		}
		public List<TerminalNode> Decimal_num() { return getTokens(myLexerParser.Decimal_num); }
		public TerminalNode Decimal_num(int i) {
			return getToken(myLexerParser.Decimal_num, i);
		}
		public List<TerminalNode> T_INT() { return getTokens(myLexerParser.T_INT); }
		public TerminalNode T_INT(int i) {
			return getToken(myLexerParser.T_INT, i);
		}
		public List<TerminalNode> T_DOUBLE() { return getTokens(myLexerParser.T_DOUBLE); }
		public TerminalNode T_DOUBLE(int i) {
			return getToken(myLexerParser.T_DOUBLE, i);
		}
		public List<TerminalNode> T_STRING() { return getTokens(myLexerParser.T_STRING); }
		public TerminalNode T_STRING(int i) {
			return getToken(myLexerParser.T_STRING, i);
		}
		public List<TerminalNode> T_BOOLEAN() { return getTokens(myLexerParser.T_BOOLEAN); }
		public TerminalNode T_BOOLEAN(int i) {
			return getToken(myLexerParser.T_BOOLEAN, i);
		}
		public List<TerminalNode> VOID() { return getTokens(myLexerParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(myLexerParser.VOID, i);
		}
		public List<TerminalNode> NULL() { return getTokens(myLexerParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(myLexerParser.NULL, i);
		}
		public List<TerminalNode> THIS() { return getTokens(myLexerParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(myLexerParser.THIS, i);
		}
		public List<TerminalNode> FOR() { return getTokens(myLexerParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(myLexerParser.FOR, i);
		}
		public List<TerminalNode> WHILE() { return getTokens(myLexerParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(myLexerParser.WHILE, i);
		}
		public List<TerminalNode> IF() { return getTokens(myLexerParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(myLexerParser.IF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(myLexerParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(myLexerParser.ELSE, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(myLexerParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(myLexerParser.RETURN, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(myLexerParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(myLexerParser.BREAK, i);
		}
		public List<TerminalNode> NEW() { return getTokens(myLexerParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(myLexerParser.NEW, i);
		}
		public List<TerminalNode> NEWARRAY() { return getTokens(myLexerParser.NEWARRAY); }
		public TerminalNode NEWARRAY(int i) {
			return getToken(myLexerParser.NEWARRAY, i);
		}
		public List<TerminalNode> PRINT() { return getTokens(myLexerParser.PRINT); }
		public TerminalNode PRINT(int i) {
			return getToken(myLexerParser.PRINT, i);
		}
		public List<TerminalNode> READINTEGER() { return getTokens(myLexerParser.READINTEGER); }
		public TerminalNode READINTEGER(int i) {
			return getToken(myLexerParser.READINTEGER, i);
		}
		public List<TerminalNode> READLINE() { return getTokens(myLexerParser.READLINE); }
		public TerminalNode READLINE(int i) {
			return getToken(myLexerParser.READLINE, i);
		}
		public List<TerminalNode> UNDESCORE() { return getTokens(myLexerParser.UNDESCORE); }
		public TerminalNode UNDESCORE(int i) {
			return getToken(myLexerParser.UNDESCORE, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(myLexerParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(myLexerParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(myLexerParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(myLexerParser.MINUS, i);
		}
		public List<TerminalNode> STAR() { return getTokens(myLexerParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(myLexerParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(myLexerParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(myLexerParser.SLASH, i);
		}
		public List<TerminalNode> MOD() { return getTokens(myLexerParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(myLexerParser.MOD, i);
		}
		public List<TerminalNode> LESS_SIGN() { return getTokens(myLexerParser.LESS_SIGN); }
		public TerminalNode LESS_SIGN(int i) {
			return getToken(myLexerParser.LESS_SIGN, i);
		}
		public List<TerminalNode> LESS_EQUAL() { return getTokens(myLexerParser.LESS_EQUAL); }
		public TerminalNode LESS_EQUAL(int i) {
			return getToken(myLexerParser.LESS_EQUAL, i);
		}
		public List<TerminalNode> MORE_SIGN() { return getTokens(myLexerParser.MORE_SIGN); }
		public TerminalNode MORE_SIGN(int i) {
			return getToken(myLexerParser.MORE_SIGN, i);
		}
		public List<TerminalNode> MORE_EQUAL() { return getTokens(myLexerParser.MORE_EQUAL); }
		public TerminalNode MORE_EQUAL(int i) {
			return getToken(myLexerParser.MORE_EQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(myLexerParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(myLexerParser.EQUAL, i);
		}
		public List<TerminalNode> EQUALEQUAL() { return getTokens(myLexerParser.EQUALEQUAL); }
		public TerminalNode EQUALEQUAL(int i) {
			return getToken(myLexerParser.EQUALEQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(myLexerParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(myLexerParser.NOTEQUAL, i);
		}
		public List<TerminalNode> AND() { return getTokens(myLexerParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(myLexerParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(myLexerParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(myLexerParser.OR, i);
		}
		public List<TerminalNode> NOT() { return getTokens(myLexerParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(myLexerParser.NOT, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(myLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(myLexerParser.SEMICOLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myLexerParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(myLexerParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(myLexerParser.DOT, i);
		}
		public List<TerminalNode> BRACKET() { return getTokens(myLexerParser.BRACKET); }
		public TerminalNode BRACKET(int i) {
			return getToken(myLexerParser.BRACKET, i);
		}
		public List<TerminalNode> BRACKET2() { return getTokens(myLexerParser.BRACKET2); }
		public TerminalNode BRACKET2(int i) {
			return getToken(myLexerParser.BRACKET2, i);
		}
		public List<TerminalNode> PAREBTISES() { return getTokens(myLexerParser.PAREBTISES); }
		public TerminalNode PAREBTISES(int i) {
			return getToken(myLexerParser.PAREBTISES, i);
		}
		public List<TerminalNode> ACULAD() { return getTokens(myLexerParser.ACULAD); }
		public TerminalNode ACULAD(int i) {
			return getToken(myLexerParser.ACULAD, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(myLexerParser.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(myLexerParser.OPENBRACKET, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(myLexerParser.CLOSEBRACKET); }
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(myLexerParser.CLOSEBRACKET, i);
		}
		public List<TerminalNode> OPENBPARENTISIS() { return getTokens(myLexerParser.OPENBPARENTISIS); }
		public TerminalNode OPENBPARENTISIS(int i) {
			return getToken(myLexerParser.OPENBPARENTISIS, i);
		}
		public List<TerminalNode> CLOSEPARENTISIS() { return getTokens(myLexerParser.CLOSEPARENTISIS); }
		public TerminalNode CLOSEPARENTISIS(int i) {
			return getToken(myLexerParser.CLOSEPARENTISIS, i);
		}
		public List<TerminalNode> OPENACULAD() { return getTokens(myLexerParser.OPENACULAD); }
		public TerminalNode OPENACULAD(int i) {
			return getToken(myLexerParser.OPENACULAD, i);
		}
		public List<TerminalNode> CLOSEACULAD() { return getTokens(myLexerParser.CLOSEACULAD); }
		public TerminalNode CLOSEACULAD(int i) {
			return getToken(myLexerParser.CLOSEACULAD, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(myLexerParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(myLexerParser.COMMENT, i);
		}
		public List<TerminalNode> OPEN_COMMENT() { return getTokens(myLexerParser.OPEN_COMMENT); }
		public TerminalNode OPEN_COMMENT(int i) {
			return getToken(myLexerParser.OPEN_COMMENT, i);
		}
		public List<TerminalNode> CLOSE_COMMENT() { return getTokens(myLexerParser.CLOSE_COMMENT); }
		public TerminalNode CLOSE_COMMENT(int i) {
			return getToken(myLexerParser.CLOSE_COMMENT, i);
		}
		public List<TerminalNode> QUOTAION() { return getTokens(myLexerParser.QUOTAION); }
		public TerminalNode QUOTAION(int i) {
			return getToken(myLexerParser.QUOTAION, i);
		}
		public List<TerminalNode> FULL_QUOTAION() { return getTokens(myLexerParser.FULL_QUOTAION); }
		public TerminalNode FULL_QUOTAION(int i) {
			return getToken(myLexerParser.FULL_QUOTAION, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(myLexerParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(myLexerParser.FALSE, i);
		}
		public List<TerminalNode> TRUE() { return getTokens(myLexerParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(myLexerParser.TRUE, i);
		}
		public LexemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexeme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterLexeme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitLexeme(this);
		}
	}

	public final LexemeContext lexeme() throws RecognitionException {
		LexemeContext _localctx = new LexemeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lexeme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << VOID) | (1L << NULL) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << ELSE) | (1L << RETURN) | (1L << BREAK) | (1L << NEW) | (1L << NEWARRAY) | (1L << PRINT) | (1L << READINTEGER) | (1L << READLINE) | (1L << UNDESCORE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << MOD) | (1L << LESS_SIGN) | (1L << LESS_EQUAL) | (1L << MORE_SIGN) | (1L << MORE_EQUAL) | (1L << EQUAL) | (1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << DOT) | (1L << OPENBRACKET) | (1L << CLOSEBRACKET) | (1L << OPENBPARENTISIS) | (1L << CLOSEPARENTISIS) | (1L << OPENACULAD) | (1L << CLOSEACULAD) | (1L << COMMENT) | (1L << OPEN_COMMENT) | (1L << CLOSE_COMMENT) | (1L << QUOTAION) | (1L << FULL_QUOTAION) | (1L << FALSE) | (1L << TRUE) | (1L << ID) | (1L << STRING) | (1L << MULTI_LINE_COMMENT) | (1L << ONE_LINE_COMMENT) | (1L << CONST_NUMBER) | (1L << Decimal_num) | (1L << Undifiend_Tokens) | (1L << BRACKET) | (1L << BRACKET2) | (1L << PAREBTISES) | (1L << ACULAD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << VOID) | (1L << NULL) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << ELSE) | (1L << RETURN) | (1L << BREAK) | (1L << NEW) | (1L << NEWARRAY) | (1L << PRINT) | (1L << READINTEGER) | (1L << READLINE) | (1L << UNDESCORE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << MOD) | (1L << LESS_SIGN) | (1L << LESS_EQUAL) | (1L << MORE_SIGN) | (1L << MORE_EQUAL) | (1L << EQUAL) | (1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << DOT) | (1L << OPENBRACKET) | (1L << CLOSEBRACKET) | (1L << OPENBPARENTISIS) | (1L << CLOSEPARENTISIS) | (1L << OPENACULAD) | (1L << CLOSEACULAD) | (1L << COMMENT) | (1L << OPEN_COMMENT) | (1L << CLOSE_COMMENT) | (1L << QUOTAION) | (1L << FULL_QUOTAION) | (1L << FALSE) | (1L << TRUE) | (1L << ID) | (1L << STRING) | (1L << MULTI_LINE_COMMENT) | (1L << ONE_LINE_COMMENT) | (1L << CONST_NUMBER) | (1L << Decimal_num) | (1L << Undifiend_Tokens) | (1L << BRACKET) | (1L << BRACKET2) | (1L << PAREBTISES) | (1L << ACULAD))) != 0) );
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

	public static class DeclContext extends ParserRuleContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				variableDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				functionDecl();
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

	public static class VariableDeclContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitVariableDecl(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			variable();
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

	public static class VariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myLexerParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			type(0);
			setState(54);
			match(ID);
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
		public TerminalNode T_INT() { return getToken(myLexerParser.T_INT, 0); }
		public TerminalNode T_DOUBLE() { return getToken(myLexerParser.T_DOUBLE, 0); }
		public TerminalNode T_BOOLEAN() { return getToken(myLexerParser.T_BOOLEAN, 0); }
		public TerminalNode T_STRING() { return getToken(myLexerParser.T_STRING, 0); }
		public TerminalNode ID() { return getToken(myLexerParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BRACKET() { return getToken(myLexerParser.BRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
				{
				setState(57);
				match(T_INT);
				}
				break;
			case T_DOUBLE:
				{
				setState(58);
				match(T_DOUBLE);
				}
				break;
			case T_BOOLEAN:
				{
				setState(59);
				match(T_BOOLEAN);
				}
				break;
			case T_STRING:
				{
				setState(60);
				match(T_STRING);
				}
				break;
			case ID:
				{
				setState(61);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(64);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(65);
					match(BRACKET);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myLexerParser.ID, 0); }
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(myLexerParser.SEMICOLON, 0); }
		public TerminalNode VOID() { return getToken(myLexerParser.VOID, 0); }
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDecl);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
			case T_DOUBLE:
			case T_STRING:
			case T_BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				type(0);
				setState(72);
				match(ID);
				setState(73);
				match(OPENBPARENTISIS);
				setState(74);
				formals();
				setState(75);
				match(CLOSEPARENTISIS);
				setState(76);
				stmtBlock();
				setState(77);
				match(SEMICOLON);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(VOID);
				setState(80);
				match(ID);
				setState(81);
				match(OPENBPARENTISIS);
				setState(82);
				formals();
				setState(83);
				match(CLOSEPARENTISIS);
				setState(84);
				stmtBlock();
				setState(85);
				match(SEMICOLON);
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

	public static class FormalsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myLexerParser.COMMA, i);
		}
		public TerminalNode EPSILON() { return getToken(myLexerParser.EPSILON, 0); }
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitFormals(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formals);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
			case T_DOUBLE:
			case T_STRING:
			case T_BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					variable();
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << ID))) != 0) );
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(94);
					match(COMMA);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EPSILON:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(EPSILON);
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

	public static class ProtoTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myLexerParser.ID, 0); }
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(myLexerParser.SEMICOLON, 0); }
		public TerminalNode VOID() { return getToken(myLexerParser.VOID, 0); }
		public ProtoTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protoType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterProtoType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitProtoType(this);
		}
	}

	public final ProtoTypeContext protoType() throws RecognitionException {
		ProtoTypeContext _localctx = new ProtoTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_protoType);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
			case T_DOUBLE:
			case T_STRING:
			case T_BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				type(0);
				setState(104);
				match(ID);
				setState(105);
				match(OPENBPARENTISIS);
				setState(106);
				formals();
				setState(107);
				match(CLOSEPARENTISIS);
				setState(108);
				match(SEMICOLON);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(VOID);
				setState(111);
				match(ID);
				setState(112);
				match(OPENBPARENTISIS);
				setState(113);
				formals();
				setState(114);
				match(CLOSEPARENTISIS);
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

	public static class StmtBlockContext extends ParserRuleContext {
		public TerminalNode OPENACULAD() { return getToken(myLexerParser.OPENACULAD, 0); }
		public TerminalNode CLOSEACULAD() { return getToken(myLexerParser.CLOSEACULAD, 0); }
		public List<VariableDeclContext> variableDecl() {
			return getRuleContexts(VariableDeclContext.class);
		}
		public VariableDeclContext variableDecl(int i) {
			return getRuleContext(VariableDeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitStmtBlock(this);
		}
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(OPENACULAD);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				variableDecl();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << PRINT) | (1L << LESS_SIGN) | (1L << OPENACULAD))) != 0)) {
				{
				{
				setState(125);
				stmt();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(CLOSEACULAD);
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode LESS_SIGN() { return getToken(myLexerParser.LESS_SIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MORE_SIGN() { return getToken(myLexerParser.MORE_SIGN, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(LESS_SIGN);
				setState(134);
				expr(0);
				setState(135);
				match(MORE_SIGN);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				ifStmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				whileStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				forStmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				breakStmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				returnStmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				printStmt();
				}
				break;
			case OPENACULAD:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				stmtBlock();
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(myLexerParser.IF, 0); }
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode LESS_SIGN() { return getToken(myLexerParser.LESS_SIGN, 0); }
		public TerminalNode ELSE() { return getToken(myLexerParser.ELSE, 0); }
		public TerminalNode MORE_SIGN() { return getToken(myLexerParser.MORE_SIGN, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			match(OPENBPARENTISIS);
			setState(148);
			expr(0);
			setState(149);
			match(CLOSEPARENTISIS);
			setState(150);
			stmt();
			setState(151);
			match(LESS_SIGN);
			setState(152);
			match(ELSE);
			setState(153);
			match(MORE_SIGN);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(myLexerParser.WHILE, 0); }
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WHILE);
			setState(156);
			match(OPENBPARENTISIS);
			setState(157);
			expr(0);
			setState(158);
			match(CLOSEPARENTISIS);
			setState(159);
			stmt();
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(myLexerParser.FOR, 0); }
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public List<TerminalNode> LESS_SIGN() { return getTokens(myLexerParser.LESS_SIGN); }
		public TerminalNode LESS_SIGN(int i) {
			return getToken(myLexerParser.LESS_SIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> MORE_SIGN() { return getTokens(myLexerParser.MORE_SIGN); }
		public TerminalNode MORE_SIGN(int i) {
			return getToken(myLexerParser.MORE_SIGN, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(myLexerParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(myLexerParser.SEMICOLON, i);
		}
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitForStmt(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FOR);
			setState(162);
			match(OPENBPARENTISIS);
			setState(163);
			match(LESS_SIGN);
			setState(164);
			expr(0);
			setState(165);
			match(MORE_SIGN);
			setState(166);
			match(SEMICOLON);
			setState(167);
			expr(0);
			setState(168);
			match(SEMICOLON);
			setState(169);
			match(LESS_SIGN);
			setState(170);
			expr(0);
			setState(171);
			match(MORE_SIGN);
			setState(172);
			match(CLOSEPARENTISIS);
			setState(173);
			stmt();
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(myLexerParser.BREAK, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitBreakStmt(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(BREAK);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(myLexerParser.RETURN, 0); }
		public TerminalNode LESS_SIGN() { return getToken(myLexerParser.LESS_SIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MORE_SIGN() { return getToken(myLexerParser.MORE_SIGN, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(RETURN);
			setState(178);
			match(LESS_SIGN);
			setState(179);
			expr(0);
			setState(180);
			match(MORE_SIGN);
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

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(myLexerParser.PRINT, 0); }
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myLexerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myLexerParser.COMMA, i);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_printStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(PRINT);
			setState(183);
			match(OPENBPARENTISIS);
			setState(187); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(184);
					expr(0);
					setState(185);
					match(COMMA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(189); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(191);
			match(CLOSEPARENTISIS);
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

	public static class ExprContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode THIS() { return getToken(myLexerParser.THIS, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public TerminalNode MINUS() { return getToken(myLexerParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(myLexerParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(myLexerParser.PLUS, 0); }
		public TerminalNode STAR() { return getToken(myLexerParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(myLexerParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(myLexerParser.MOD, 0); }
		public TerminalNode LESS_SIGN() { return getToken(myLexerParser.LESS_SIGN, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(myLexerParser.LESS_EQUAL, 0); }
		public TerminalNode MORE_SIGN() { return getToken(myLexerParser.MORE_SIGN, 0); }
		public TerminalNode MORE_EQUAL() { return getToken(myLexerParser.MORE_EQUAL, 0); }
		public TerminalNode EQUALEQUAL() { return getToken(myLexerParser.EQUALEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(myLexerParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(myLexerParser.AND, 0); }
		public TerminalNode OR() { return getToken(myLexerParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(194);
				constant();
				}
				break;
			case 2:
				{
				setState(195);
				match(THIS);
				}
				break;
			case 3:
				{
				setState(196);
				call();
				}
				break;
			case 4:
				{
				setState(197);
				match(OPENBPARENTISIS);
				setState(198);
				expr(0);
				setState(199);
				match(CLOSEPARENTISIS);
				}
				break;
			case 5:
				{
				setState(201);
				match(MINUS);
				setState(202);
				expr(10);
				}
				break;
			case 6:
				{
				setState(203);
				match(NOT);
				setState(204);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(208);
						match(PLUS);
						setState(209);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(211);
						match(MINUS);
						setState(212);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(214);
						match(STAR);
						setState(215);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(217);
						match(SLASH);
						setState(218);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(220);
						match(MOD);
						setState(221);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(223);
						match(LESS_SIGN);
						setState(224);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(226);
						match(LESS_EQUAL);
						setState(227);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(229);
						match(MORE_SIGN);
						setState(230);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(232);
						match(MORE_EQUAL);
						setState(233);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(235);
						match(EQUALEQUAL);
						setState(236);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(238);
						match(NOTEQUAL);
						setState(239);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						match(AND);
						setState(242);
						expr(4);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(244);
						match(OR);
						setState(245);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(250);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myLexerParser.ID, 0); }
		public TerminalNode OPENBPARENTISIS() { return getToken(myLexerParser.OPENBPARENTISIS, 0); }
		public ActualContext actual() {
			return getRuleContext(ActualContext.class,0);
		}
		public TerminalNode CLOSEPARENTISIS() { return getToken(myLexerParser.CLOSEPARENTISIS, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(252);
			match(OPENBPARENTISIS);
			setState(253);
			actual();
			setState(254);
			match(CLOSEPARENTISIS);
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

	public static class ActualContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(myLexerParser.COMMA, 0); }
		public TerminalNode EPSILON() { return getToken(myLexerParser.EPSILON, 0); }
		public ActualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterActual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitActual(this);
		}
	}

	public final ActualContext actual() throws RecognitionException {
		ActualContext _localctx = new ActualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_actual);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				expr(0);
				setState(257);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(EPSILON);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ParseContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public ProtoTypeContext protoType() {
			return getRuleContext(ProtoTypeContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ActualContext actual() {
			return getRuleContext(ActualContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myLexerListener ) ((myLexerListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parse);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				variableDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				type(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				functionDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				formals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				protoType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				stmtBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(273);
				ifStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				whileStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(275);
				forStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(276);
				breakStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(277);
				returnStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(278);
				printStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(279);
				call();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(280);
				actual();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(281);
				constant();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\3"+
		"\3\5\3\64\n\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\6"+
		"\3\6\7\6E\n\6\f\6\16\6H\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\6\b]\n\b\r\b\16\b^\3\b\7\bb\n\b\f"+
		"\b\16\be\13\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tw\n\t\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\7\n\u0081\n\n\f"+
		"\n\16\n\u0084\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\6\21\u00be\n\21\r\21\16\21\u00bf\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d0\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f9\n\22\f\22\16\22\u00fc"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0107\n\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u011d\n\26\3\26\2\4\n\"\27\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\4\2\4\65\67A\2\u0143\2-\3\2\2"+
		"\2\4\63\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n@\3\2\2\2\fY\3\2\2\2\16g\3"+
		"\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24\u0092\3\2\2\2\26\u0094\3\2\2\2\30\u009d"+
		"\3\2\2\2\32\u00a3\3\2\2\2\34\u00b1\3\2\2\2\36\u00b3\3\2\2\2 \u00b8\3\2"+
		"\2\2\"\u00cf\3\2\2\2$\u00fd\3\2\2\2&\u0106\3\2\2\2(\u0108\3\2\2\2*\u011c"+
		"\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2"+
		"\2\2\61\64\5\6\4\2\62\64\5\f\7\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2"+
		"\2\2\65\66\5\b\5\2\66\7\3\2\2\2\678\5\n\6\289\7\67\2\29\t\3\2\2\2:;\b"+
		"\6\1\2;A\7\4\2\2<A\7\5\2\2=A\7\7\2\2>A\7\6\2\2?A\7\67\2\2@:\3\2\2\2@<"+
		"\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2AF\3\2\2\2BC\f\3\2\2CE\7>\2\2DB"+
		"\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3\2\2\2IJ\5\n\6\2"+
		"JK\7\67\2\2KL\7+\2\2LM\5\16\b\2MN\7,\2\2NO\5\22\n\2OP\7&\2\2PZ\3\2\2\2"+
		"QR\7\b\2\2RS\7\67\2\2ST\7+\2\2TU\5\16\b\2UV\7,\2\2VW\5\22\n\2WX\7&\2\2"+
		"XZ\3\2\2\2YI\3\2\2\2YQ\3\2\2\2Z\r\3\2\2\2[]\5\b\5\2\\[\3\2\2\2]^\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_c\3\2\2\2`b\7\'\2\2a`\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2dh\3\2\2\2ec\3\2\2\2fh\7\66\2\2g\\\3\2\2\2gf\3\2\2\2h\17"+
		"\3\2\2\2ij\5\n\6\2jk\7\67\2\2kl\7+\2\2lm\5\16\b\2mn\7,\2\2no\7&\2\2ow"+
		"\3\2\2\2pq\7\b\2\2qr\7\67\2\2rs\7+\2\2st\5\16\b\2tu\7,\2\2uw\3\2\2\2v"+
		"i\3\2\2\2vp\3\2\2\2w\21\3\2\2\2x|\7-\2\2y{\5\6\4\2zy\3\2\2\2{~\3\2\2\2"+
		"|z\3\2\2\2|}\3\2\2\2}\u0082\3\2\2\2~|\3\2\2\2\177\u0081\5\24\13\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7.\2\2\u0086\23"+
		"\3\2\2\2\u0087\u0088\7\34\2\2\u0088\u0089\5\"\22\2\u0089\u008a\7\36\2"+
		"\2\u008a\u0093\3\2\2\2\u008b\u0093\5\26\f\2\u008c\u0093\5\30\r\2\u008d"+
		"\u0093\5\32\16\2\u008e\u0093\5\34\17\2\u008f\u0093\5\36\20\2\u0090\u0093"+
		"\5 \21\2\u0091\u0093\5\22\n\2\u0092\u0087\3\2\2\2\u0092\u008b\3\2\2\2"+
		"\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\25\3\2\2\2\u0094"+
		"\u0095\7\r\2\2\u0095\u0096\7+\2\2\u0096\u0097\5\"\22\2\u0097\u0098\7,"+
		"\2\2\u0098\u0099\5\24\13\2\u0099\u009a\7\34\2\2\u009a\u009b\7\16\2\2\u009b"+
		"\u009c\7\36\2\2\u009c\27\3\2\2\2\u009d\u009e\7\f\2\2\u009e\u009f\7+\2"+
		"\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\7,\2\2\u00a1\u00a2\5\24\13\2\u00a2"+
		"\31\3\2\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\7+\2\2\u00a5\u00a6\7\34\2"+
		"\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\7\36\2\2\u00a8\u00a9\7&\2\2\u00a9"+
		"\u00aa\5\"\22\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\7\34\2\2\u00ac\u00ad\5"+
		"\"\22\2\u00ad\u00ae\7\36\2\2\u00ae\u00af\7,\2\2\u00af\u00b0\5\24\13\2"+
		"\u00b0\33\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\35\3\2\2\2\u00b3\u00b4\7"+
		"\17\2\2\u00b4\u00b5\7\34\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7\7\36\2\2"+
		"\u00b7\37\3\2\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00bd\7+\2\2\u00ba\u00bb"+
		"\5\"\22\2\u00bb\u00bc\7\'\2\2\u00bc\u00be\3\2\2\2\u00bd\u00ba\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2!\3\2\2\2\u00c3\u00c4\b\22\1\2\u00c4"+
		"\u00d0\5(\25\2\u00c5\u00d0\7\n\2\2\u00c6\u00d0\5$\23\2\u00c7\u00c8\7+"+
		"\2\2\u00c8\u00c9\5\"\22\2\u00c9\u00ca\7,\2\2\u00ca\u00d0\3\2\2\2\u00cb"+
		"\u00cc\7\30\2\2\u00cc\u00d0\5\"\22\f\u00cd\u00ce\7%\2\2\u00ce\u00d0\5"+
		"\"\22\3\u00cf\u00c3\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf"+
		"\u00c7\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00fa\3\2"+
		"\2\2\u00d1\u00d2\f\21\2\2\u00d2\u00d3\7\27\2\2\u00d3\u00f9\5\"\22\22\u00d4"+
		"\u00d5\f\20\2\2\u00d5\u00d6\7\30\2\2\u00d6\u00f9\5\"\22\21\u00d7\u00d8"+
		"\f\17\2\2\u00d8\u00d9\7\31\2\2\u00d9\u00f9\5\"\22\20\u00da\u00db\f\16"+
		"\2\2\u00db\u00dc\7\32\2\2\u00dc\u00f9\5\"\22\17\u00dd\u00de\f\r\2\2\u00de"+
		"\u00df\7\33\2\2\u00df\u00f9\5\"\22\16\u00e0\u00e1\f\13\2\2\u00e1\u00e2"+
		"\7\34\2\2\u00e2\u00f9\5\"\22\f\u00e3\u00e4\f\n\2\2\u00e4\u00e5\7\35\2"+
		"\2\u00e5\u00f9\5\"\22\13\u00e6\u00e7\f\t\2\2\u00e7\u00e8\7\36\2\2\u00e8"+
		"\u00f9\5\"\22\n\u00e9\u00ea\f\b\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00f9\5"+
		"\"\22\t\u00ec\u00ed\f\7\2\2\u00ed\u00ee\7!\2\2\u00ee\u00f9\5\"\22\b\u00ef"+
		"\u00f0\f\6\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f9\5\"\22\7\u00f2\u00f3\f"+
		"\5\2\2\u00f3\u00f4\7#\2\2\u00f4\u00f9\5\"\22\6\u00f5\u00f6\f\4\2\2\u00f6"+
		"\u00f7\7$\2\2\u00f7\u00f9\5\"\22\5\u00f8\u00d1\3\2\2\2\u00f8\u00d4\3\2"+
		"\2\2\u00f8\u00d7\3\2\2\2\u00f8\u00da\3\2\2\2\u00f8\u00dd\3\2\2\2\u00f8"+
		"\u00e0\3\2\2\2\u00f8\u00e3\3\2\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00e9\3\2"+
		"\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb#\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\67\2\2\u00fe\u00ff"+
		"\7+\2\2\u00ff\u0100\5&\24\2\u0100\u0101\7,\2\2\u0101%\3\2\2\2\u0102\u0103"+
		"\5\"\22\2\u0103\u0104\7\'\2\2\u0104\u0107\3\2\2\2\u0105\u0107\7\66\2\2"+
		"\u0106\u0102\3\2\2\2\u0106\u0105\3\2\2\2\u0107\'\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109)\3\2\2\2\u010a\u011d\5\4\3\2\u010b\u011d\5\6\4\2\u010c\u011d"+
		"\5\b\5\2\u010d\u011d\5\n\6\2\u010e\u011d\5\f\7\2\u010f\u011d\5\16\b\2"+
		"\u0110\u011d\5\20\t\2\u0111\u011d\5\22\n\2\u0112\u011d\5\24\13\2\u0113"+
		"\u011d\5\26\f\2\u0114\u011d\5\30\r\2\u0115\u011d\5\32\16\2\u0116\u011d"+
		"\5\34\17\2\u0117\u011d\5\36\20\2\u0118\u011d\5 \21\2\u0119\u011d\5$\23"+
		"\2\u011a\u011d\5&\24\2\u011b\u011d\5(\25\2\u011c\u010a\3\2\2\2\u011c\u010b"+
		"\3\2\2\2\u011c\u010c\3\2\2\2\u011c\u010d\3\2\2\2\u011c\u010e\3\2\2\2\u011c"+
		"\u010f\3\2\2\2\u011c\u0110\3\2\2\2\u011c\u0111\3\2\2\2\u011c\u0112\3\2"+
		"\2\2\u011c\u0113\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0115\3\2\2\2\u011c"+
		"\u0116\3\2\2\2\u011c\u0117\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u0119\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d+\3\2\2\2\24/\63@FY"+
		"^cgv|\u0082\u0092\u00bf\u00cf\u00f8\u00fa\u0106\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
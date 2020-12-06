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
		SEMICOLON=36, COMMA=37, DOT=38, BRACKET=39, PAREBTISES=40, ACULAD=41, 
		BRACKET2=42, OPENBRACKET=43, CLOSEBRACKET=44, OPENBPARENTISIS=45, CLOSEPARENTISIS=46, 
		OPENACULAD=47, CLOSEACULAD=48, COMMENT=49, OPEN_COMMENT=50, CLOSE_COMMENT=51, 
		EPSILON=52, ID=53, STRING=54, MULTI_LINE_COMMENT=55, ONE_LINE_COMMENT=56, 
		CONST_NUMBER=57, Decimal_num=58;
	public static final int
		RULE_lexeme = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"lexeme"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'double'", "'string'", "'bool'", "'void'", "'null'", 
			"'this'", "'for'", "'while'", "'if'", "'else'", "'return'", "'break'", 
			"'new'", "'NewArray'", "'Print'", "'ReadInteger'", "'ReadLine'", "'_'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", "'=>'", "'='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", "';'", "','", "'.'", "'[]'", "'()'", 
			"'{}'", "'[ ]'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'//'", "'/*'", 
			"'*/'", "' '"
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
			"DOT", "BRACKET", "PAREBTISES", "ACULAD", "BRACKET2", "OPENBRACKET", 
			"CLOSEBRACKET", "OPENBPARENTISIS", "CLOSEPARENTISIS", "OPENACULAD", "CLOSEACULAD", 
			"COMMENT", "OPEN_COMMENT", "CLOSE_COMMENT", "EPSILON", "ID", "STRING", 
			"MULTI_LINE_COMMENT", "ONE_LINE_COMMENT", "CONST_NUMBER", "Decimal_num"
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
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << VOID) | (1L << NULL) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << ELSE) | (1L << RETURN) | (1L << BREAK) | (1L << NEW) | (1L << NEWARRAY) | (1L << PRINT) | (1L << READINTEGER) | (1L << READLINE) | (1L << UNDESCORE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << MOD) | (1L << LESS_SIGN) | (1L << LESS_EQUAL) | (1L << MORE_SIGN) | (1L << MORE_EQUAL) | (1L << EQUAL) | (1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << DOT) | (1L << BRACKET) | (1L << BRACKET2) | (1L << OPENBRACKET) | (1L << CLOSEBRACKET) | (1L << OPENBPARENTISIS) | (1L << CLOSEPARENTISIS) | (1L << OPENACULAD) | (1L << CLOSEACULAD) | (1L << ID) | (1L << STRING) | (1L << CONST_NUMBER) | (1L << Decimal_num))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << VOID) | (1L << NULL) | (1L << THIS) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << ELSE) | (1L << RETURN) | (1L << BREAK) | (1L << NEW) | (1L << NEWARRAY) | (1L << PRINT) | (1L << READINTEGER) | (1L << READLINE) | (1L << UNDESCORE) | (1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << MOD) | (1L << LESS_SIGN) | (1L << LESS_EQUAL) | (1L << MORE_SIGN) | (1L << MORE_EQUAL) | (1L << EQUAL) | (1L << EQUALEQUAL) | (1L << NOTEQUAL) | (1L << AND) | (1L << OR) | (1L << NOT) | (1L << SEMICOLON) | (1L << COMMA) | (1L << DOT) | (1L << BRACKET) | (1L << BRACKET2) | (1L << OPENBRACKET) | (1L << CLOSEBRACKET) | (1L << OPENBPARENTISIS) | (1L << CLOSEPARENTISIS) | (1L << OPENACULAD) | (1L << CLOSEACULAD) | (1L << ID) | (1L << STRING) | (1L << CONST_NUMBER) | (1L << Decimal_num))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\n\4\2\t\2\3\2\6"+
		"\2\6\n\2\r\2\16\2\7\3\2\2\2\3\2\2\3\6\2\4),\62\678;<\2\t\2\5\3\2\2\2\4"+
		"\6\t\2\2\2\5\4\3\2\2\2\6\7\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2"+
		"\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
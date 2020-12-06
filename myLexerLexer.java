// Generated from myLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myLexerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "T_INT", "T_DOUBLE", "T_STRING", "T_BOOLEAN", "VOID", "NULL", "THIS", 
			"FOR", "WHILE", "IF", "ELSE", "RETURN", "BREAK", "NEW", "NEWARRAY", "PRINT", 
			"READINTEGER", "READLINE", "UNDESCORE", "PLUS", "MINUS", "STAR", "SLASH", 
			"MOD", "LESS_SIGN", "LESS_EQUAL", "MORE_SIGN", "MORE_EQUAL", "EQUAL", 
			"EQUALEQUAL", "NOTEQUAL", "AND", "OR", "NOT", "SEMICOLON", "COMMA", "DOT", 
			"BRACKET", "PAREBTISES", "ACULAD", "BRACKET2", "OPENBRACKET", "CLOSEBRACKET", 
			"OPENBPARENTISIS", "CLOSEPARENTISIS", "OPENACULAD", "CLOSEACULAD", "COMMENT", 
			"OPEN_COMMENT", "CLOSE_COMMENT", "EPSILON", "ID", "STRING", "MULTI_LINE_COMMENT", 
			"ONE_LINE_COMMENT", "CONST_NUMBER", "Decimal_num"
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


	public myLexerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0194\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\6\2y\n\2"+
		"\r\2\16\2z\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\5\66\u013d\n\66\3\66\3\66\7\66\u0141\n\66\f\66\16\66\u0144\13\66\3\67"+
		"\3\67\6\67\u0148\n\67\r\67\16\67\u0149\3\67\3\67\38\38\38\78\u0151\n8"+
		"\f8\168\u0154\138\38\38\38\38\39\39\79\u015c\n9\f9\169\u015f\139\39\5"+
		"9\u0162\n9\39\39\3:\6:\u0167\n:\r:\16:\u0168\3:\5:\u016c\n:\3:\7:\u016f"+
		"\n:\f:\16:\u0172\13:\3:\7:\u0175\n:\f:\16:\u0178\13:\5:\u017a\n:\3;\6"+
		";\u017d\n;\r;\16;\u017e\3;\3;\7;\u0183\n;\f;\16;\u0186\13;\3;\5;\u0189"+
		"\n;\3;\3;\5;\u018d\n;\3;\7;\u0190\n;\f;\16;\u0193\13;\3\u0152\2<\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<\3\2\n\5\2\13\f\17\17\"\"\6\2CC\\\\aac|\5\2\62;C\\c|\6\2\f\f\17\17"+
		"$$^^\3\2\f\f\3\2\62;\4\2ZZzz\4\2GGgg\2\u01a6\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\3x\3\2\2\2\5~\3\2\2\2\7\u0082\3\2\2\2\t\u0089\3\2"+
		"\2\2\13\u0090\3\2\2\2\r\u0095\3\2\2\2\17\u009a\3\2\2\2\21\u009f\3\2\2"+
		"\2\23\u00a4\3\2\2\2\25\u00a8\3\2\2\2\27\u00ae\3\2\2\2\31\u00b1\3\2\2\2"+
		"\33\u00b6\3\2\2\2\35\u00bd\3\2\2\2\37\u00c3\3\2\2\2!\u00c7\3\2\2\2#\u00d0"+
		"\3\2\2\2%\u00d6\3\2\2\2\'\u00e2\3\2\2\2)\u00eb\3\2\2\2+\u00ed\3\2\2\2"+
		"-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5\3\2\2\2\65\u00f7"+
		"\3\2\2\2\67\u00f9\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0101\3\2\2\2"+
		"?\u0103\3\2\2\2A\u0106\3\2\2\2C\u0109\3\2\2\2E\u010c\3\2\2\2G\u010f\3"+
		"\2\2\2I\u0111\3\2\2\2K\u0113\3\2\2\2M\u0115\3\2\2\2O\u0117\3\2\2\2Q\u011a"+
		"\3\2\2\2S\u011d\3\2\2\2U\u0120\3\2\2\2W\u0124\3\2\2\2Y\u0126\3\2\2\2["+
		"\u0128\3\2\2\2]\u012a\3\2\2\2_\u012c\3\2\2\2a\u012e\3\2\2\2c\u0130\3\2"+
		"\2\2e\u0133\3\2\2\2g\u0136\3\2\2\2i\u0139\3\2\2\2k\u013c\3\2\2\2m\u0145"+
		"\3\2\2\2o\u014d\3\2\2\2q\u0159\3\2\2\2s\u0166\3\2\2\2u\u017c\3\2\2\2w"+
		"y\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\2\2\2"+
		"}\4\3\2\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081\6\3"+
		"\2\2\2\u0082\u0083\7f\2\2\u0083\u0084\7q\2\2\u0084\u0085\7w\2\2\u0085"+
		"\u0086\7d\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\b\3\2\2\2\u0089"+
		"\u008a\7u\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2"+
		"\u008d\u008e\7p\2\2\u008e\u008f\7i\2\2\u008f\n\3\2\2\2\u0090\u0091\7d"+
		"\2\2\u0091\u0092\7q\2\2\u0092\u0093\7q\2\2\u0093\u0094\7n\2\2\u0094\f"+
		"\3\2\2\2\u0095\u0096\7x\2\2\u0096\u0097\7q\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7f\2\2\u0099\16\3\2\2\2\u009a\u009b\7p\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7n\2\2\u009d\u009e\7n\2\2\u009e\20\3\2\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7u\2\2\u00a3\22\3\2\2\2\u00a4"+
		"\u00a5\7h\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\24\3\2\2\2\u00a8"+
		"\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7"+
		"h\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7m\2\2\u00c2\36\3\2\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7y\2\2\u00c6 \3\2\2\2\u00c7"+
		"\u00c8\7P\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7C\2\2"+
		"\u00cb\u00cc\7t\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf"+
		"\7{\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7R\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5$\3\2\2\2\u00d6\u00d7"+
		"\7T\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7f\2\2\u00da"+
		"\u00db\7K\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7i\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7t\2\2\u00e1&\3\2\2"+
		"\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7f\2\2\u00e6\u00e7\7N\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7a\2\2\u00ec*\3\2\2\2\u00ed\u00ee"+
		"\7-\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7"+
		",\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\62\3\2\2\2\u00f5\u00f6"+
		"\7\'\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8\66\3\2\2\2\u00f9\u00fa"+
		"\7>\2\2\u00fa\u00fb\7?\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd:\3"+
		"\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100\7@\2\2\u0100<\3\2\2\2\u0101\u0102"+
		"\7?\2\2\u0102>\3\2\2\2\u0103\u0104\7?\2\2\u0104\u0105\7?\2\2\u0105@\3"+
		"\2\2\2\u0106\u0107\7#\2\2\u0107\u0108\7?\2\2\u0108B\3\2\2\2\u0109\u010a"+
		"\7(\2\2\u010a\u010b\7(\2\2\u010bD\3\2\2\2\u010c\u010d\7~\2\2\u010d\u010e"+
		"\7~\2\2\u010eF\3\2\2\2\u010f\u0110\7#\2\2\u0110H\3\2\2\2\u0111\u0112\7"+
		"=\2\2\u0112J\3\2\2\2\u0113\u0114\7.\2\2\u0114L\3\2\2\2\u0115\u0116\7\60"+
		"\2\2\u0116N\3\2\2\2\u0117\u0118\7]\2\2\u0118\u0119\7_\2\2\u0119P\3\2\2"+
		"\2\u011a\u011b\7*\2\2\u011b\u011c\7+\2\2\u011cR\3\2\2\2\u011d\u011e\7"+
		"}\2\2\u011e\u011f\7\177\2\2\u011fT\3\2\2\2\u0120\u0121\7]\2\2\u0121\u0122"+
		"\7\"\2\2\u0122\u0123\7_\2\2\u0123V\3\2\2\2\u0124\u0125\7]\2\2\u0125X\3"+
		"\2\2\2\u0126\u0127\7_\2\2\u0127Z\3\2\2\2\u0128\u0129\7*\2\2\u0129\\\3"+
		"\2\2\2\u012a\u012b\7+\2\2\u012b^\3\2\2\2\u012c\u012d\7}\2\2\u012d`\3\2"+
		"\2\2\u012e\u012f\7\177\2\2\u012fb\3\2\2\2\u0130\u0131\7\61\2\2\u0131\u0132"+
		"\7\61\2\2\u0132d\3\2\2\2\u0133\u0134\7\61\2\2\u0134\u0135\7,\2\2\u0135"+
		"f\3\2\2\2\u0136\u0137\7,\2\2\u0137\u0138\7\61\2\2\u0138h\3\2\2\2\u0139"+
		"\u013a\7\"\2\2\u013aj\3\2\2\2\u013b\u013d\t\3\2\2\u013c\u013b\3\2\2\2"+
		"\u013d\u0142\3\2\2\2\u013e\u0141\5)\25\2\u013f\u0141\t\4\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143l\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\7$\2\2\u0146"+
		"\u0148\n\5\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7$\2\2\u014c"+
		"n\3\2\2\2\u014d\u0152\5e\63\2\u014e\u0151\5o8\2\u014f\u0151\13\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0156\5g\64\2\u0156\u0157\3\2\2\2\u0157\u0158\b8\2\2\u0158p\3\2\2\2\u0159"+
		"\u015d\5c\62\2\u015a\u015c\n\6\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0162\7\f\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b9\2\2\u0164r\3\2\2\2\u0165\u0167"+
		"\t\7\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\t\b\2\2\u016b\u016a\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u0179\3\2\2\2\u016d\u016f\4\62;\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u017a\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\4ch\2\u0174\u0173"+
		"\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0176\3\2"+
		"\2\2\u017at\3\2\2\2\u017b\u017d\t\7\2\2\u017c\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0184\7\60\2\2\u0181\u0183\4\62;\2\u0182\u0181\3\2\2\2\u0183\u0186\3"+
		"\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0189\t\t\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u018d\5+\26\2\u018b\u018d\5-\27\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0191\3\2"+
		"\2\2\u018e\u0190\4\62;\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192v\3\2\2\2\u0193\u0191\3\2\2\2"+
		"\26\2z\u013c\u0140\u0142\u0149\u0150\u0152\u015d\u0161\u0168\u016b\u0170"+
		"\u0176\u0179\u017e\u0184\u0188\u018c\u0191\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
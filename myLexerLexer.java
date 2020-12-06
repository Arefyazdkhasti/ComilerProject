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
		FALSE=52, TRUE=53, EPSILON=54, ID=55, STRING=56, MULTI_LINE_COMMENT=57, 
		ONE_LINE_COMMENT=58, CONST_NUMBER=59, Decimal_num=60;
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
			"OPEN_COMMENT", "CLOSE_COMMENT", "FALSE", "TRUE", "EPSILON", "ID", "STRING", 
			"MULTI_LINE_COMMENT", "ONE_LINE_COMMENT", "CONST_NUMBER", "Decimal_num"
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
			"'*/'", null, null, "' '"
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
			"COMMENT", "OPEN_COMMENT", "CLOSE_COMMENT", "FALSE", "TRUE", "EPSILON", 
			"ID", "STRING", "MULTI_LINE_COMMENT", "ONE_LINE_COMMENT", "CONST_NUMBER", 
			"Decimal_num"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2}\n\2\r\2\16\2~\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u014d\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u015b\n\66\3\67\3\67\38\58\u0160\n8\38\38\78\u0164"+
		"\n8\f8\168\u0167\138\39\39\69\u016b\n9\r9\169\u016c\39\39\3:\3:\3:\7:"+
		"\u0174\n:\f:\16:\u0177\13:\3:\3:\3:\3:\3;\3;\7;\u017f\n;\f;\16;\u0182"+
		"\13;\3;\5;\u0185\n;\3;\3;\3<\6<\u018a\n<\r<\16<\u018b\3<\5<\u018f\n<\3"+
		"<\7<\u0192\n<\f<\16<\u0195\13<\3<\7<\u0198\n<\f<\16<\u019b\13<\5<\u019d"+
		"\n<\3=\6=\u01a0\n=\r=\16=\u01a1\3=\3=\7=\u01a6\n=\f=\16=\u01a9\13=\3="+
		"\5=\u01ac\n=\3=\3=\5=\u01b0\n=\3=\7=\u01b3\n=\f=\16=\u01b6\13=\3\u0175"+
		"\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>\3\2\n\5\2\13\f\17\17\"\"\6\2CC\\\\aac|\5\2\62;C\\c|\6\2"+
		"\f\f\17\17$$^^\3\2\f\f\3\2\62;\4\2ZZzz\4\2GGgg\2\u01cd\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3|\3\2\2\2\5\u0082"+
		"\3\2\2\2\7\u0086\3\2\2\2\t\u008d\3\2\2\2\13\u0094\3\2\2\2\r\u0099\3\2"+
		"\2\2\17\u009e\3\2\2\2\21\u00a3\3\2\2\2\23\u00a8\3\2\2\2\25\u00ac\3\2\2"+
		"\2\27\u00b2\3\2\2\2\31\u00b5\3\2\2\2\33\u00ba\3\2\2\2\35\u00c1\3\2\2\2"+
		"\37\u00c7\3\2\2\2!\u00cb\3\2\2\2#\u00d4\3\2\2\2%\u00da\3\2\2\2\'\u00e6"+
		"\3\2\2\2)\u00ef\3\2\2\2+\u00f1\3\2\2\2-\u00f3\3\2\2\2/\u00f5\3\2\2\2\61"+
		"\u00f7\3\2\2\2\63\u00f9\3\2\2\2\65\u00fb\3\2\2\2\67\u00fd\3\2\2\29\u0100"+
		"\3\2\2\2;\u0102\3\2\2\2=\u0105\3\2\2\2?\u0107\3\2\2\2A\u010a\3\2\2\2C"+
		"\u010d\3\2\2\2E\u0110\3\2\2\2G\u0113\3\2\2\2I\u0115\3\2\2\2K\u0117\3\2"+
		"\2\2M\u0119\3\2\2\2O\u011b\3\2\2\2Q\u011e\3\2\2\2S\u0121\3\2\2\2U\u0124"+
		"\3\2\2\2W\u0128\3\2\2\2Y\u012a\3\2\2\2[\u012c\3\2\2\2]\u012e\3\2\2\2_"+
		"\u0130\3\2\2\2a\u0132\3\2\2\2c\u0134\3\2\2\2e\u0137\3\2\2\2g\u013a\3\2"+
		"\2\2i\u014c\3\2\2\2k\u015a\3\2\2\2m\u015c\3\2\2\2o\u015f\3\2\2\2q\u0168"+
		"\3\2\2\2s\u0170\3\2\2\2u\u017c\3\2\2\2w\u0189\3\2\2\2y\u019f\3\2\2\2{"+
		"}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\b\2\2\2\u0081\4\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7"+
		"p\2\2\u0084\u0085\7v\2\2\u0085\6\3\2\2\2\u0086\u0087\7f\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7w\2\2\u0089\u008a\7d\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7g\2\2\u008c\b\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7v\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7i\2\2"+
		"\u0093\n\3\2\2\2\u0094\u0095\7d\2\2\u0095\u0096\7q\2\2\u0096\u0097\7q"+
		"\2\2\u0097\u0098\7n\2\2\u0098\f\3\2\2\2\u0099\u009a\7x\2\2\u009a\u009b"+
		"\7q\2\2\u009b\u009c\7k\2\2\u009c\u009d\7f\2\2\u009d\16\3\2\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\20\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\24\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7j\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\26\3\2\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4\30\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\32\3\2\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7w\2\2"+
		"\u00be\u00bf\7t\2\2\u00bf\u00c0\7p\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7"+
		"d\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6"+
		"\7m\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7y\2\2\u00ca \3\2\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7y\2\2\u00ce\u00cf\7C\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7t\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7{\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7R\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9$\3\2\2\2\u00da\u00db\7T\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7c\2"+
		"\2\u00dd\u00de\7f\2\2\u00de\u00df\7K\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1"+
		"\7v\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5&\3\2\2\2\u00e6\u00e7\7T\2\2\u00e7\u00e8\7g\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7N\2\2\u00eb\u00ec\7k\2\2"+
		"\u00ec\u00ed\7p\2\2\u00ed\u00ee\7g\2\2\u00ee(\3\2\2\2\u00ef\u00f0\7a\2"+
		"\2\u00f0*\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2,\3\2\2\2\u00f3\u00f4\7/\2\2"+
		"\u00f4.\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7\61\2"+
		"\2\u00f8\62\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\7"+
		">\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7?\2\2\u00ff8\3"+
		"\2\2\2\u0100\u0101\7@\2\2\u0101:\3\2\2\2\u0102\u0103\7?\2\2\u0103\u0104"+
		"\7@\2\2\u0104<\3\2\2\2\u0105\u0106\7?\2\2\u0106>\3\2\2\2\u0107\u0108\7"+
		"?\2\2\u0108\u0109\7?\2\2\u0109@\3\2\2\2\u010a\u010b\7#\2\2\u010b\u010c"+
		"\7?\2\2\u010cB\3\2\2\2\u010d\u010e\7(\2\2\u010e\u010f\7(\2\2\u010fD\3"+
		"\2\2\2\u0110\u0111\7~\2\2\u0111\u0112\7~\2\2\u0112F\3\2\2\2\u0113\u0114"+
		"\7#\2\2\u0114H\3\2\2\2\u0115\u0116\7=\2\2\u0116J\3\2\2\2\u0117\u0118\7"+
		".\2\2\u0118L\3\2\2\2\u0119\u011a\7\60\2\2\u011aN\3\2\2\2\u011b\u011c\7"+
		"]\2\2\u011c\u011d\7_\2\2\u011dP\3\2\2\2\u011e\u011f\7*\2\2\u011f\u0120"+
		"\7+\2\2\u0120R\3\2\2\2\u0121\u0122\7}\2\2\u0122\u0123\7\177\2\2\u0123"+
		"T\3\2\2\2\u0124\u0125\7]\2\2\u0125\u0126\7\"\2\2\u0126\u0127\7_\2\2\u0127"+
		"V\3\2\2\2\u0128\u0129\7]\2\2\u0129X\3\2\2\2\u012a\u012b\7_\2\2\u012bZ"+
		"\3\2\2\2\u012c\u012d\7*\2\2\u012d\\\3\2\2\2\u012e\u012f\7+\2\2\u012f^"+
		"\3\2\2\2\u0130\u0131\7}\2\2\u0131`\3\2\2\2\u0132\u0133\7\177\2\2\u0133"+
		"b\3\2\2\2\u0134\u0135\7\61\2\2\u0135\u0136\7\61\2\2\u0136d\3\2\2\2\u0137"+
		"\u0138\7\61\2\2\u0138\u0139\7,\2\2\u0139f\3\2\2\2\u013a\u013b\7,\2\2\u013b"+
		"\u013c\7\61\2\2\u013ch\3\2\2\2\u013d\u013e\7h\2\2\u013e\u013f\7c\2\2\u013f"+
		"\u0140\7n\2\2\u0140\u0141\7u\2\2\u0141\u014d\7g\2\2\u0142\u0143\7H\2\2"+
		"\u0143\u0144\7c\2\2\u0144\u0145\7n\2\2\u0145\u0146\7u\2\2\u0146\u014d"+
		"\7g\2\2\u0147\u0148\7H\2\2\u0148\u0149\7C\2\2\u0149\u014a\7N\2\2\u014a"+
		"\u014b\7U\2\2\u014b\u014d\7G\2\2\u014c\u013d\3\2\2\2\u014c\u0142\3\2\2"+
		"\2\u014c\u0147\3\2\2\2\u014dj\3\2\2\2\u014e\u014f\7v\2\2\u014f\u0150\7"+
		"t\2\2\u0150\u0151\7w\2\2\u0151\u015b\7g\2\2\u0152\u0153\7V\2\2\u0153\u0154"+
		"\7t\2\2\u0154\u0155\7w\2\2\u0155\u015b\7g\2\2\u0156\u0157\7V\2\2\u0157"+
		"\u0158\7T\2\2\u0158\u0159\7W\2\2\u0159\u015b\7G\2\2\u015a\u014e\3\2\2"+
		"\2\u015a\u0152\3\2\2\2\u015a\u0156\3\2\2\2\u015bl\3\2\2\2\u015c\u015d"+
		"\7\"\2\2\u015dn\3\2\2\2\u015e\u0160\t\3\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0165\3\2\2\2\u0161\u0164\5)\25\2\u0162\u0164\t\4\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166p\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\7$\2\2\u0169"+
		"\u016b\n\5\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7$\2\2\u016f"+
		"r\3\2\2\2\u0170\u0175\5e\63\2\u0171\u0174\5s:\2\u0172\u0174\13\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0179\5g\64\2\u0179\u017a\3\2\2\2\u017a\u017b\b:\2\2\u017bt\3\2\2\2\u017c"+
		"\u0180\5c\62\2\u017d\u017f\n\6\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u0185\7\f\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0187\b;\2\2\u0187v\3\2\2\2\u0188\u018a"+
		"\t\7\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\t\b\2\2\u018e\u018d\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u019c\3\2\2\2\u0190\u0192\4\62;\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u019d\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\4ch\2\u0197\u0196"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u0193\3\2\2\2\u019c\u0199\3\2"+
		"\2\2\u019dx\3\2\2\2\u019e\u01a0\t\7\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a7\7\60\2\2\u01a4\u01a6\4\62;\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3"+
		"\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ac\t\t\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01af\3\2\2\2\u01ad\u01b0\5+\26\2\u01ae\u01b0\5-\27\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b4\3\2"+
		"\2\2\u01b1\u01b3\4\62;\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5z\3\2\2\2\u01b6\u01b4\3\2\2\2"+
		"\30\2~\u014c\u015a\u015f\u0163\u0165\u016c\u0173\u0175\u0180\u0184\u018b"+
		"\u018e\u0193\u0199\u019c\u01a1\u01a7\u01ab\u01af\u01b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
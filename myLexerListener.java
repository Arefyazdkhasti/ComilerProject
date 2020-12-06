// Generated from myLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myLexerParser}.
 */
public interface myLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myLexerParser#lexeme}.
	 * @param ctx the parse tree
	 */
	void enterLexeme(myLexerParser.LexemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#lexeme}.
	 * @param ctx the parse tree
	 */
	void exitLexeme(myLexerParser.LexemeContext ctx);
}
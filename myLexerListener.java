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
	/**
	 * Enter a parse tree produced by {@link myLexerParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(myLexerParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(myLexerParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(myLexerParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(myLexerParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(myLexerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(myLexerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(myLexerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(myLexerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(myLexerParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(myLexerParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#formals}.
	 * @param ctx the parse tree
	 */
	void enterFormals(myLexerParser.FormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#formals}.
	 * @param ctx the parse tree
	 */
	void exitFormals(myLexerParser.FormalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#protoType}.
	 * @param ctx the parse tree
	 */
	void enterProtoType(myLexerParser.ProtoTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#protoType}.
	 * @param ctx the parse tree
	 */
	void exitProtoType(myLexerParser.ProtoTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(myLexerParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(myLexerParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(myLexerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(myLexerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(myLexerParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(myLexerParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(myLexerParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(myLexerParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(myLexerParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(myLexerParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(myLexerParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(myLexerParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(myLexerParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(myLexerParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(myLexerParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(myLexerParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(myLexerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(myLexerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(myLexerParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(myLexerParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#actual}.
	 * @param ctx the parse tree
	 */
	void enterActual(myLexerParser.ActualContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#actual}.
	 * @param ctx the parse tree
	 */
	void exitActual(myLexerParser.ActualContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(myLexerParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(myLexerParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link myLexerParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(myLexerParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link myLexerParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(myLexerParser.ParseContext ctx);
}
import jdk.nashorn.internal.parser.TokenType;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class start {

    public static void main(String[] args) {
        CharStream cs = null;
        try {
            cs = fromFileName("C:\\Users\\Acer\\IdeaProjects\\ComplierProject\\src\\input.txt");  //load the file
        } catch (Exception e) {
            System.err.println("No input file: " + e.getMessage());
            return;
        }
        myLexerLexer lexer = new myLexerLexer(cs);  //instantiate a lexer
        Token token = lexer.nextToken();
        //CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        //myLexerParser parser = new myLexerParser(tokens);  //parse the tokens
        //ParseTree tree = parser.lexeme(); // parse the content and get the tree
        //ParseTreeListener listener = new myLexerBaseListener();
        //ParseTreeWalker walker = new ParseTreeWalker();
        //walker.walk(listener, tree);
        System.out.println("Tokens");
        while (token.getType() != Token.EOF) {
            String type=getTokenType(token.getType());
            if(!type.equals("Default")) {
                System.out.println(getTokenType(token.getType()) + " " + token.getText());
            }else{
                System.out.println(token.getText());
            }
            token = lexer.nextToken();
        }
    }

    private static String getTokenType (int tokenType){
        switch (tokenType){
            case myLexerLexer.ID:
                return "T_ID";
            case myLexerLexer.STRING:
                return "T_STRING";
            case myLexerLexer.T_BOOLEAN:
            case myLexerLexer.TRUE:
            case myLexerLexer.FALSE:
                return "T_BOOLEAN";
            case myLexerLexer.CONST_NUMBER:
                return "T_INT";
            case myLexerLexer.Decimal_num:
                return "T_DECIMAL";
            default:
                return "Default";
        }
    }
}

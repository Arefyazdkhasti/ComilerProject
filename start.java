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
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        myLexerParser parser = new myLexerParser(tokens);  //parse the tokens
        ParseTree tree = parser.lexeme(); // parse the content and get the tree

        Token token = lexer.nextToken();
        while (token.getType() != Token.EOF) {
            System.out.println(token.getText() + " " + token.getType());
            token = lexer.nextToken();
        }
        ParseTreeListener listener = new myLexerBaseListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }

    private TokenType getTokenType(TokenType tokenType){
        switch (tokenType){
            case myLexerLexer.
        }
    }
}

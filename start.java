import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

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
        Token token = lexer.nextToken(); //get first token

        System.out.println("Tokens");
        //check for end of file
        while (token.getType() != Token.EOF) {
            String type = getTokenType(token.getType());
            if (!type.equals("Default")) {
                if (type.equals("T_ID")) {
                    //check if id has more the 31 char
                    if (token.getText().length() > 31) {
                        System.out.println("Error identifier with more than 31 character doesn't supported!");
                    } else {
                        System.out.println(getTokenType(token.getType()) + " => " + token.getText());
                    }
                }else {
                    System.out.println(getTokenType(token.getType()) + " => " + token.getText());
                }
            } else {
                System.out.println(token.getText());
            }
            token = lexer.nextToken(); //get next token
        }
    }

    //return token types
    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case myLexerLexer.ID:
                return "T_ID";
            case myLexerLexer.STRING:
                return "T_STRING";
            case myLexerLexer.TRUE:
            case myLexerLexer.FALSE:
                return "T_BOOLEAN";
            case myLexerLexer.T_BOOLEAN:
                return "Boolean";
            case myLexerLexer.CONST_NUMBER:
            case myLexerLexer.Decimal_num:
                return "T_INT";
            case myLexerLexer.T_INT:
                return "int";
            case myLexerLexer.T_DOUBLE:
                return "double";
            /*case myLexerLexer.Undifiend_Tokens:
                return "Undefined_Tokens";*/
            case myLexerLexer.ONE_LINE_COMMENT:
                return "one line Comment";
            case myLexerLexer.MULTI_LINE_COMMENT:
                return "multiLine Comment";
            default:
                return "Default";
        }
    }
}

//CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
//myLexerParser parser = new myLexerParser(tokens);  //parse the tokens
//ParseTree tree = parser.lexeme(); // parse the content and get the tree
//ParseTreeListener listener = new myLexerBaseListener();
//ParseTreeWalker walker = new ParseTreeWalker();
//walker.walk(listener, tree);

/*
case myLexerLexer.CONST_NUMBER:
      return "Const_Number";
  case myLexerLexer.Decimal_num:
      return "Decimal_Number";
  case myLexerLexer.T_INT:
      return "T_INT";
      */
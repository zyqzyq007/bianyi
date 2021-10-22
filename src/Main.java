// Main.java
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Collections;
import java.util.List;

public class Main {
    public static class VerboseListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e)
        {
            List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
            Collections.reverse(stack);
            System.err.println("rule stack: "+stack);
            System.err.println("line "+line+":"+charPositionInLine+" at "+
                    offendingSymbol+": "+msg);
            System.exit(1);
        }

    }



    public static void main(String[] args) {
        try{
            String input = "int main(){//1c4hf 3i,\n  return 011; /*;*/ \n}";

            CharStream inputStream = CharStreams.fromString(input);

            lab1Lexer lexer = new lab1Lexer(inputStream);

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            lab1Parser parser = new lab1Parser(tokenStream);

            parser.removeErrorListeners(); // remove ConsoleErrorListener
            parser.addErrorListener(new VerboseListener()); // add ours

            //System.out.println("1");
            ParseTree tree = parser.compUnit();

            Visitor visitor = new Visitor();
            //System.out.println("2");
            visitor.visit(tree);

        }catch (Exception e){
            System.exit(2);
        }


    }
}
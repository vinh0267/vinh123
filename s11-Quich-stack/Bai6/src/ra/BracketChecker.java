package ra;

import java.util.Stack;

public class BracketChecker {
    public static boolean checkBrackets(String expression) {
        Stack<Character> bracketStack = new Stack<>();


        for (char sym : expression.toCharArray()) {
            if (sym == '(' || sym == '[' || sym == '{') {
                bracketStack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}') {
                if (bracketStack.isEmpty()) {
                    return false;
                }


                char left = bracketStack.pop();

                if ((left == '(' && sym != ')') || (left == '[' && sym != ']') || (left == '{' && sym != '}')) {
                    return false;
                }
            }
        }

        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "((a + b) * (c - d))";

        if (checkBrackets(expression)) {
            System.out.println("Biểu thức có sử dụng đúng dấu ngoặc.");
        } else {
            System.out.println("Biểu thức không sử dụng đúng dấu ngoặc.");
        }
    }
}
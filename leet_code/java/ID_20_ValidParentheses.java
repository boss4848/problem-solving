package leet_code.java;

import java.util.Stack;

public class ID_20_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
    }

    public static boolean isValid(String s) {
        Stack<Character> str = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ')' && !str.empty() && str.peek() == '('
                    || s.charAt(i) == '}' && !str.empty() && str.peek() == '{'
                    || s.charAt(i) == ']' && !str.empty() && str.peek() == '[') {
                str.pop();
            }

            else {
                str.push(s.charAt(i));
            }

        }
        return str.size() == 0 ? true : false;
    }

}

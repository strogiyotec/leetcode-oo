package leetcode.oo.stacks;

import java.util.Stack;

final class ValidParenthesisString {

    boolean checkValidString(final String str) {
        final Stack<Integer> leftBrackets = new Stack<>();
        final Stack<Integer> stars = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                leftBrackets.push(i);
            } else if (str.charAt(i) == '*') {
                stars.push(i);
            } else {
                if (!leftBrackets.isEmpty()) {
                    leftBrackets.pop();
                } else if (!stars.isEmpty()) {
                    stars.pop();
                } else {
                    return false;
                }
            }
        }
        while (!leftBrackets.isEmpty() && !stars.isEmpty()) {
            if (leftBrackets.pop() > stars.pop()) {
                return false;
            }
        }
        return leftBrackets.isEmpty();
    }
}

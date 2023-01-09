package leetcode.oo.stacks;

import java.util.Stack;

final class ValidParenthesisString {

    boolean checkValidString(final String str) {
        final Stack<Integer> left = new Stack<>();
        final Stack<Integer> star = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            final char c = str.charAt(i);
            if (c == '(') {
                left.push(i);
            } else if (c == '*') {
                star.push(i);
            } else {
                if (!left.empty()) {
                    left.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }
        while (!left.isEmpty() && !star.isEmpty()) {
            if(left.pop()> star.pop()){
                return false;
            }
        }
        return left.isEmpty();
    }
}

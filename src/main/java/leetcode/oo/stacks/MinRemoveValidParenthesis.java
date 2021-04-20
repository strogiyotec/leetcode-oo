package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
final class MinRemoveValidParenthesis {

    String minRemoveToMakeValid(final String line) {
        final StringBuilder builder = new StringBuilder(line);
        final Stack<Integer> left = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                left.add(i);
            } else if (line.charAt(i) == ')') {
                if (left.isEmpty()) {
                    builder.setCharAt(i, '*');
                } else {
                    left.pop();
                }
            }
        }
        while (!left.isEmpty()) {
            builder.setCharAt(left.pop(), '*');
        }
        final StringBuilder solution = new StringBuilder(builder.length());
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) != '*') {
                solution.append(builder.charAt(i));
            }
        }
        return solution.toString();
    }
}

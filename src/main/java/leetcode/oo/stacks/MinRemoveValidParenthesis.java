package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
final class MinRemoveValidParenthesis {

    String minRemoveToMakeValid(final String line) {
        final StringBuilder builder = new StringBuilder(line.length());
        final Stack<Integer> leftPosition = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            final char c = line.charAt(i);
            if (c != '(' && c != ')') {
                builder.append(c);
            } else {
                if (c == '(') {
                    builder.append('(');
                    leftPosition.push(i);
                } else {
                    if (!leftPosition.isEmpty()) {
                        leftPosition.pop();
                        builder.append(c);
                    } else {
                        builder.append('*');
                    }
                }
            }
        }
        while (!leftPosition.isEmpty()) {
            builder.setCharAt(leftPosition.pop(), '*');
        }
        final StringBuilder solution = new StringBuilder(builder.length());
        for (int i = 0; i < builder.length(); i++) {
            final char c = builder.charAt(i);
            if (c != '*') {
                solution.append(c);
            }
        }
        return solution.toString();
    }
}

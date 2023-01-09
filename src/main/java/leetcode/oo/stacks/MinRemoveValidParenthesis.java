package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
final class MinRemoveValidParenthesis {

    String minRemoveToMakeValid(final String line) {
        final Stack<Integer> stack = new Stack<>();
        final StringBuilder builder = new StringBuilder(line.length());
        for (int i = 0; i < line.length(); i++) {
            final char currentChar = line.charAt(i);
            if (Character.isLetter(currentChar)) {
                builder.append(currentChar);
            } else {
                if (currentChar == '(') {
                    stack.push(i);
                    builder.append('(');
                } else {
                    if (stack.isEmpty()) {
                        builder.append('*');
                    } else {
                        stack.pop();
                        builder.append(')');
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            builder.setCharAt(stack.pop(), '*');
        }
        final StringBuilder solution = new StringBuilder(builder.length());
        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) !='*'){
                solution.append(builder.charAt(i));
            }
        }
        return solution.toString();
    }
}

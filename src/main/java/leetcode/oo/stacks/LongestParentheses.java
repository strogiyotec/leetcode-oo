package leetcode.oo.stacks;

import java.util.Stack;


/**
 * Longest Valid Parentheses.
 * See {@link <a href ="https://leetcode.com/problems/longest-valid-parentheses/">https://leetcode.com/problems/longest-valid-parentheses/</a>}.
 */
public final class LongestParentheses {

    /**
     * Length of longest parentheses.
     *
     * @param word Word
     * @return Length
     */
    public int longestValidParentheses(final String word) {
        final int length = word.length();
        if (length <= 1) {
            return 0;
        }
        final Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;
        for (int i = 0; i < length; i++) {
            final char bracket = word.charAt(i);
            if (bracket == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }
}

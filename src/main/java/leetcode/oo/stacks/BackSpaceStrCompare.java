package leetcode.oo.stacks;

import java.util.Stack;


/**
 * Backspace String Compare.
 * See {@link <a href ="https://leetcode.com/problems/backspace-string-compare/">https://leetcode.com/problems/backspace-string-compare/</a>}
 */
final class BackSpaceStrCompare {

    boolean backspaceCompare(final String first, final String second) {
        final Stack<Character> s1 = new Stack<>();
        this.fillStack(s1, first);
        final Stack<Character> s2 = new Stack<>();
        this.fillStack(s2, second);
        if (s1.size() != s2.size()) {
            return false;
        }
        final int size = s1.size();
        for (int i = 0; i < size; i++) {
            if (!s1.pop().equals(s2.pop())) {
                return false;
            }
        }
        return true;
    }

    private void fillStack(final Stack<Character> stack, final String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != '#') {
                stack.push(word.charAt(i));
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
    }
}

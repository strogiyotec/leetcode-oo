package leetcode.oo.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Valid Parentheses.
 * See {@link <a href ="https://leetcode.com/problems/valid-parentheses/">https://leetcode.com/problems/valid-parentheses/</a>}.
 */
public final class ValidParentheses {

    /**
     * Map of open->close brackets.
     */
    private final Map<Character, Character> brackets;

    /**
     * Ctor.
     */
    public ValidParentheses() {
        this.brackets = new HashMap<>(4, 1);
        this.brackets.put('[', ']');
        this.brackets.put('(', ')');
        this.brackets.put('{', '}');
    }

    /**
     * Check that line has valid parentheses.
     *
     * @param line Line
     * @return True if all open brackets
     * have close brackets
     */
    @SuppressWarnings("ReturnCount")
    public boolean isValid(final String line) {
        final int length = line.length();
        if (length == 0) {
            return true;
        }
        //if length is odd then skip
        if (length % 2 != 0) {
            return false;
        }
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            final Character bracket = line.charAt(i);
            if (this.brackets.containsKey(bracket)) {
                stack.push(this.brackets.get(bracket));
            } else if (stack.isEmpty() || stack.pop() != bracket) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

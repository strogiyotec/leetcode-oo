package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;


/**
 * Generate Parentheses.
 * See {@link <a href ="https://leetcode.com/problems/generate-parentheses/">https://leetcode.com/problems/generate-parentheses/</a>}.
 */
final class GenerateParentheses {

    List<String> generateParenthesis(final int max) {
        final List<String> solution = new ArrayList<>(16);
        final GenerateParentheses.Backtracking backtracking = new GenerateParentheses.Backtracking() {
            @Override
            public void track(final int open, final int close, final StringBuilder parentheses) {
                if (parentheses.length() == max << 1) {
                    solution.add(parentheses.toString());
                    return;
                }
                if (open < max) {
                    this.track(open + 1, close, parentheses.append('('));
                    parentheses.deleteCharAt(parentheses.length() - 1);
                }
                if (close < open) {
                    this.track(open, close + 1, parentheses.append(')'));
                    parentheses.deleteCharAt(parentheses.length() - 1);
                }
            }
        };
        backtracking.track(0, 0, new StringBuilder(16));
        return solution;
    }

    public interface Backtracking {
        void track(int open, int close, StringBuilder parentheses);
    }
}

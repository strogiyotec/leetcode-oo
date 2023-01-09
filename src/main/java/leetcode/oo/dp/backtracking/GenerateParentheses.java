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
        this.dfs(0, 0, max, new StringBuilder(16), solution);
        return solution;
    }

    private void dfs(final int open, final int close, final int max, final StringBuilder builder, final List<String> solution) {
        if (builder.length() == max << 1) {
            solution.add(builder.toString());
            return;
        }
        if (open < max) {
            builder.append('(');
            this.dfs(open + 1, close, max, builder, solution);
            builder.deleteCharAt(builder.length() - 1);
        }
        if (close < open) {
            builder.append(')');
            this.dfs(open, close + 1, max, builder, solution);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

}

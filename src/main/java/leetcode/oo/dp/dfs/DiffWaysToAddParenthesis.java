package leetcode.oo.dp.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/different-ways-to-add-parentheses/
final class DiffWaysToAddParenthesis {

    public List<Integer> diffWaysToCompute(final String input) {
        if (input.isEmpty()) {
            return Collections.emptyList();
        }
        final List<Integer> solution = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                final List<Integer> left = this.diffWaysToCompute(input.substring(0, i));
                final List<Integer> right = this.diffWaysToCompute(input.substring(i + 1));
                for (final Integer leftInt : left) {
                    for (final Integer rightInt : right) {
                        switch (input.charAt(i)) {
                            case '-':
                                solution.add(leftInt - rightInt);
                                break;
                            case '+':
                                solution.add(leftInt + rightInt);
                                break;
                            case '*':
                                solution.add(leftInt * rightInt);
                                break;
                        }
                    }
                }
            }
        }
        if (solution.isEmpty()) {
            solution.add(Integer.parseInt(input));
        }
        return solution;
    }
}

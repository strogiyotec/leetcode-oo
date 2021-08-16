package leetcode.oo.dp.dfs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/different-ways-to-add-parentheses/
final class DiffWaysToAddParenthesis {

    public List<Integer> diffWaysToCompute(final String input) {
        if (input.isEmpty()) {
            return Collections.emptyList();
        }
        final List<Integer> res = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (!Character.isDigit(c)) {
                final String firstPart = input.substring(0, i);
                final String secondPart = input.substring(i + 1);
                final List<Integer> firstList = this.diffWaysToCompute(firstPart);
                final List<Integer> secondList = this.diffWaysToCompute(secondPart);
                for (final Integer first : firstList) {
                    for (final Integer second : secondList) {
                        final int result;
                        switch (c) {
                            case '-':
                                result = first - second;
                                break;
                            case '+':
                                result = first + second;
                                break;
                            default:
                                result = first * second;
                                break;
                        }
                        res.add(result);
                    }
                }
            }
        }
        if (res.isEmpty()) {
            return Collections.singletonList(Integer.valueOf(input));
        }
        return res;
    }
}

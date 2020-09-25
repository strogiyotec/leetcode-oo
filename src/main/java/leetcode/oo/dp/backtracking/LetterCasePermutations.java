package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Letter case permutations.
 * See {@link <a href ="https://leetcode.com/problems/letter-case-permutation/">https://leetcode.com/problems/letter-case-permutation/</a>}.
 */
final class LetterCasePermutations {

    List<String> letterCasePermutation(final String word) {
        final List<String> solution = new ArrayList<>(16);
        this.find(new StringBuilder(word), solution, 0);
        return solution;
    }

    private void find(final StringBuilder builder, final List<String> solution, final int index) {
        solution.add(builder.toString());
        for (int i = index; i < builder.length(); i++) {
            if (!Character.isDigit(builder.charAt(i))) {
                if (Character.isUpperCase(builder.charAt(i))) {
                    builder.setCharAt(i, Character.toLowerCase(builder.charAt(i)));
                    this.find(builder, solution, i + 1);
                    builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
                } else {
                    builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
                    this.find(builder, solution, i + 1);
                    builder.setCharAt(i, Character.toLowerCase(builder.charAt(i)));
                }
            }
        }
    }

}

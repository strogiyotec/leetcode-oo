package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Custom Sort String.
 * See {@link <a href ="https://leetcode.com/problems/custom-sort-string/">https://leetcode.com/problems/custom-sort-string/</a>}
 */
final class CustomSortString {

    String customSortString(final String original, final String toSort) {
        final Map<Character, Integer> toSortCnt = new HashMap<>(toSort.length());
        for (final char c : toSort.toCharArray()) {
            toSortCnt.merge(c, 1, Integer::sum);
        }
        final StringBuilder solution = new StringBuilder(toSort.length());
        for (final Character originalChar : original.toCharArray()) {
            if (toSortCnt.containsKey(originalChar)) {
                while (toSortCnt.computeIfPresent(originalChar, (character, cnt) -> cnt - 1) >= 0) {
                    solution.append(originalChar);
                }
            }
        }

        for (final Character toSortChar : toSortCnt.keySet()) {
            while (toSortCnt.computeIfPresent(toSortChar, (character, cnt) -> cnt - 1) >= 0) {
                solution.append(toSortChar);
            }
        }
        return solution.toString();
    }
}

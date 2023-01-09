package leetcode.oo.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/concatenated-words/
final class ConcatWords {

    List<String> findAllConcatenatedWordsInADict(final String[] words) {
        final Set<String> set = new HashSet<>(Arrays.asList(words));
        final List<String> solution = new ArrayList<>();
        for (final String word : words) {
            if (this.dfs(word, set)) {
                solution.add(word);
            }
        }
        return solution;
    }

    private boolean dfs(final String word, final Set<String> set) {
        if (word.isEmpty()) {
            return false;
        }
        for (int i = 1; i <= word.length(); i++) {
            final String sub = word.substring(0, i);
            final String next = word.substring(i);
            if (set.contains(sub)) {
                if (set.contains(next) || this.dfs(next, set)) {
                    return true;
                }
            }
        }
        return false;
    }

}

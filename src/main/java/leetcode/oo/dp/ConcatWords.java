package leetcode.oo.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/concatenated-words/
final class ConcatWords {

    List<String> findAllConcatenatedWordsInADict(final String[] words) {
        final Set<String> set = new HashSet<>(Arrays.asList(words));
        final Map<String, Boolean> cache = new HashMap<>();
        final List<String> solution = new ArrayList<>(words.length);
        for (final String word : words) {
            if (this.dfs(set, cache, word)) {
                solution.add(word);
            }
        }
        return solution;
    }

    private boolean dfs(final Set<String> words, final Map<String, Boolean> cache, final String word) {
        if (cache.containsKey(word)) {
            return cache.get(word);
        }
        for (int i = 1; i < word.length(); i++) {
            if (words.contains(word.substring(0, i))) {
                final String suffix = word.substring(i);
                if (words.contains(suffix) || this.dfs(words, cache, suffix)) {
                    cache.put(word, true);
                    return true;
                }
            }
        }
        cache.put(word, false);
        return false;
    }
}

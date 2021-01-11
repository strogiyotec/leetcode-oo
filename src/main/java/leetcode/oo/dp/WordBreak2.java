package leetcode.oo.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/word-break-ii/
final class WordBreak2 {

    List<String> wordBreak(final String word, final List<String> wordDict) {
        final Set<String> dictionary = new HashSet<>(wordDict);
        final Map<String, List<String>> memo = new HashMap<>(dictionary.size());
        return this.findAll(word, dictionary, memo);
    }

    private List<String> findAll(
        final String word,
        final Set<String> dictionary,
        final Map<String, List<String>> memo
    ) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }
        final List<String> list = new ArrayList<>(dictionary.size());
        for (final String dictWord : dictionary) {
            if (word.startsWith(dictWord)) {
                final String next = word.substring(dictWord.length());
                if (next.isEmpty()) {
                    list.add(word);
                } else {
                    final List<String> nextList = this.findAll(next, dictionary, memo);
                    nextList.forEach(sub -> list.add(dictWord + ' ' + sub));
                }
            }
        }
        memo.put(word, list);
        return list;
    }
}

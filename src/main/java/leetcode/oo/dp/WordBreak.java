package leetcode.oo.dp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Word Break.
 * See {@link <a href ="https://leetcode.com/problems/word-break/">https://leetcode.com/problems/word-break/</a>}
 */
final class WordBreak {

    boolean wordBreak(final String line, final List<String> wordDict) {
        final Set<String> set = new HashSet<>(wordDict);
        final Map<String, Boolean> memo = new HashMap<>(set.size());
        return this.validDict(set, line,memo);
    }

    private boolean validDict(final Set<String> set, final String line, final Map<String, Boolean> memo) {
        if(memo.containsKey(line)){
            return memo.get(line);
        }
        if (line.isEmpty()) {
            return true;
        }
        boolean found = false;
        for (final String word : set) {
            if (line.length() >= word.length() && line.substring(0, word.length()).equals(word)) {
                final String substr = line.substring(word.length());
                found = this.validDict(set, substr, memo);
            }
            if (found) {
                return true;
            }
        }
        memo.put(line,false);
        return false;
    }

}

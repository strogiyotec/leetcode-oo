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
        final Map<String, Boolean> memo = new HashMap<>(wordDict.size());
        return this.found(line, set, memo);

    }

    private boolean found(final String line, final Set<String> set, final Map<String, Boolean> memo) {
        if (line.isEmpty()) {
            return true;
        }
        if (memo.containsKey(line)) {
            return memo.get(line);
        }
        for (int i = 0; i <= line.length(); i++) {
            final String sub = line.substring(0, i);
            if (set.contains(sub) && this.found(line.substring(i), set, memo)) {
                return true;
            }
        }
        memo.put(line,false);
        return false;
    }

}

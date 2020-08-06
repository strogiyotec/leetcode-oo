package leetcode.oo.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Word Break.
 * See {@link <a href ="https://leetcode.com/problems/word-break/">https://leetcode.com/problems/word-break/</a>}
 */
final class WordBreak {

    boolean wordBreak(final String line, final List<String> wordDict) {
        final Set<String> set = new HashSet<>(wordDict);
        final boolean[] dp = new boolean[line.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= line.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(line.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        return dp[line.length()];
    }
}

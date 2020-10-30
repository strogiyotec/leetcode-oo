package leetcode.oo.dp;

/**
 *Interleaving String.
 * See {@link <a href ="https://leetcode.com/problems/interleaving-string/">https://leetcode.com/problems/interleaving-string/</a>}
 */
final class InterleavingStrings {

    boolean isInterleave(final String s1, final String s2, final String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        final boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = true;
                } else if (j == 0) {
                    dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
                } else if (i == 0) {
                    dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
                } else {
                    dp[i][j] =
                        (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||
                            (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}

package leetcode.oo.dp;

/**
 * Edit distance.
 * See {@link <a href ="https://leetcode.com/problems/edit-distance/">https://leetcode.com/problems/edit-distance/</a>}
 */
final class EditDistance {

    int minDistance(final String first, final String second) {
        final int[][] dp = new int[first.length() + 1][second.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= first.length(); i++) {
            for (int j = 1; j <= second.length(); j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    final int min = Math.min(
                        dp[i][j - 1],
                        Math.min(
                            dp[i - 1][j],
                            dp[i - 1][j - 1]
                        )
                    );
                    dp[i][j] = min + 1;
                }
            }
        }
        return dp[first.length()][second.length()];
    }
}

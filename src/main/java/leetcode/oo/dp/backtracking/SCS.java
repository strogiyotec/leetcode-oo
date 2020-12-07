package leetcode.oo.dp.backtracking;

import java.util.Arrays;

/**
 * Shortest Common Supersequence.
 * See {@link <a href ="https://leetcode.com/problems/shortest-common-supersequence/">https://leetcode.com/problems/shortest-common-supersequence/</a>}
 */
final class SCS {

    String shortestCommonSupersequence(final String first, final String second) {
        final String[][] dp = new String[first.length() + 1][second.length() + 1];
        for (final String[] line : dp) {
            Arrays.fill(line, "");
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = String.format("%s%s", dp[i - 1][j - 1], first.charAt(i - 1));
                } else {
                    if (dp[i - 1][j].length() > dp[i][j - 1].length()) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        final String longest = dp[first.length()][second.length()];
        int i = 0;
        int j = 0;
        final StringBuilder answer = new StringBuilder(first.length() + second.length());
        for (final char c : longest.toCharArray()) {
            while (i < first.length() && first.charAt(i) != c) {
                answer.append(first.charAt(i++));
            }
            while (j < second.length() && second.charAt(j) != c) {
                answer.append(second.charAt(j++));
            }
            answer.append(c);
            i++;
            j++;
        }
        return answer
            .append(i >= first.length() ? "" : first.substring(i))
            .append(j >= second.length() ? "" : second.substring(j))
            .toString();
    }
}

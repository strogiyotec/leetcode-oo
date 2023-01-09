package leetcode.oo.strings;

import java.util.Arrays;

//https://leetcode.com/problems/longest-palindromic-subsequence/
final class LongestPalindromeSubseq {

    public int longestPalindromeSubseq(final String word) {
        final int[][] dp = new int[word.length()][word.length()];
        for (final int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return this.dfs(dp, 0, word.length() - 1, word);
    }

    private int dfs(final int[][] dp, final int left, final int right, final String word) {
        if (left > right) {
            return 0;
        }
        if (dp[left][right] != -1) {
            return dp[left][right];
        }
        int longest = 0;
        if (word.charAt(left) == word.charAt(right)) {
            if (left == right) {
                longest = 1;
            } else {
                longest = 2 + this.dfs(dp, left + 1, right - 1, word);
            }
        } else {
            longest = Math.max(
                this.dfs(dp, left + 1, right, word),
                this.dfs(dp, left, right - 1, word)
                );
        }
        dp[left][right] = longest;
        return longest;
    }

}

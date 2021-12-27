package leetcode.oo.strings;

import java.util.Arrays;

//https://leetcode.com/problems/longest-palindromic-subsequence/
final class LongestPalindromeSubseq {

    public int longestPalindromeSubseq(final String word) {
        final int[][] dp = new int[word.length() + 1][word.length() + 1];
        for (final int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return this.longest(0, word.length() - 1, dp, word);
    }

    private int longest(final int left, final int right, final int[][] dp, final String word) {
        if (left > right) {
            return 0;
        }
        if (dp[left][right] != -1) {
            return dp[left][right];
        }
        final int longest;
        if (word.charAt(left) == word.charAt(right)) {
            if (left == right) {
                longest = 1 + this.longest(left + 1, right - 1, dp, word);
            } else {
                longest = 2 + this.longest(left + 1, right - 1, dp, word);
            }
        } else {
            longest = Math.max(
                this.longest(left + 1, right, dp, word),
                this.longest(left, right - 1, dp, word)
            );
        }
        dp[left][right] = longest;
        return longest;
    }

}

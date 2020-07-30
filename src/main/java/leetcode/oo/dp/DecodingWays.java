package leetcode.oo.dp;

/**
 * Decode Ways.
 * See {@link <a href ="https://leetcode.com/problems/decode-ways/">https://leetcode.com/problems/decode-ways/</a>}
 */
final class DecodingWays {

    int numDecodings(final String word) {
        final int[] dp = new int[word.length() + 1];
        dp[0] = 1;
        dp[1] = word.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= word.length(); i++) {
            if (Character.getNumericValue(word.charAt(i - 1)) != 0) {
                dp[i] += dp[i - 1];
            }
            final int twoDigit = Integer.parseInt(word.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[word.length()];

    }
}

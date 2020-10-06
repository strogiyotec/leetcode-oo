package leetcode.oo.dp;

/**
 * Palindromic Substrings
 * See {@link <a href ="https://leetcode.com/problems/palindromic-substrings/">https://leetcode.com/problems/palindromic-substrings/</a>}
 */
final class PalindromeSubs {

    int countSubstrings(final String line) {
        final int[] cnt = {0};
        for (int i = 0; i < line.length(); i++) {
            this.palindrome(cnt, i, i, line);
            this.palindrome(cnt, i, i + 1, line);
        }
        return cnt[0];
    }

    private void palindrome(final int[] cnt, int left, int right, final String line) {
        while (left >= 0 && right < line.length() && line.charAt(left) == line.charAt(right)) {
            left--;
            right++;
            cnt[0]++;
        }
    }
}

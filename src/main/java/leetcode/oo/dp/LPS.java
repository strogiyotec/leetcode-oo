package leetcode.oo.dp;

/**
 * Longest Palindromic Substring.
 * See {@link <a href ="https://leetcode.com/problems/longest-palindromic-substring/">https://leetcode.com/problems/longest-palindromic-substring/</a>}
 */
final class LPS {

    String longestPalindrome(final String input) {
        Range range = new Range(0, 0);
        for (int i = 0; i < input.length(); i++) {
            final Range include = this.expand(input, i, i);
            final Range exclude = this.expand(input, i, i + 1);
            if (include.isBigger(range)) {
                range = include;
            }
            if (exclude.isBigger(range)) {
                range = exclude;
            }
        }
        return range.substring(input);
    }

    private Range expand(final String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }
        return new Range(left, right);
    }

    private static class Range {
        final int left;
        final int right;

        private Range(final int left, final int right) {
            this.left = left;
            this.right = right;
        }

        public boolean isBigger(final Range other) {
            final int ownLength = this.right - this.left;
            final int otherLength = other.right - other.left;
            return ownLength > otherLength;
        }

        public String substring(final String input) {
            return input.substring(this.left+1, this.right);
        }
    }

}

package leetcode.oo.dp;

/**
 * Longest Palindromic Substring.
 * See {@link <a href ="https://leetcode.com/problems/longest-palindromic-substring/">https://leetcode.com/problems/longest-palindromic-substring/</a>}
 */
final class LPS {

    String longestPalindrome(final String input) {
        Range biggest = new Range(0,0);
        for (int i = 0; i < input.length(); i++) {
            final Range shrink = this.expand(i, i, input);
            final Range expand = this.expand(i, i + 1, input);
            if(shrink.isBigger(biggest)){
                biggest = shrink;
            }
            if(expand.isBigger(biggest)){
                biggest = expand;
            }
        }
        return biggest.substring(input);
    }

    private Range expand(int from, int to, final String input) {
        while (from >= 0 && to < input.length() && input.charAt(from) == input.charAt(to)) {
            from--;
            to++;
        }
        return new Range(from,to);
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
            return input.substring(this.left + 1, this.right);
        }
    }

}

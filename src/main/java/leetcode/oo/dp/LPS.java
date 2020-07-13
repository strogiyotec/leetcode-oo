package leetcode.oo.dp;

/**
 * Longest Palindromic Substring.
 * See {@link <a href ="https://leetcode.com/problems/longest-palindromic-substring/">https://leetcode.com/problems/longest-palindromic-substring/</a>}
 */
final class LPS {

    String dynamicApproach(final String input) {
        int end = 0;
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            final int length = Math.max(
                    this.expand(input, i, i),
                    this.expand(input, i, i + 1)
            );
            if (length > end - start) {
                start = i - ((length - 1) / 2);
                end = i + (length / 2);
            }
        }
        return input.substring(start, end + 1);
    }

    private int expand(final String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    String bruteForce(final String word) {
        String max = "";

        for (int i = 1; i < word.length(); i++) {
            final StringBuilder builder = new StringBuilder();
            for (int j = 0; j < i; j++) {
                builder.append(word.charAt(j));
            }
            final String subString = builder.toString();
            if (this.isPalindrome(subString)) {
                if (subString.length() > max.length()) {
                    max = subString;
                }
            }
        }
        return max;
    }

    private boolean isPalindrome(final String word) {
        int start = 0;
        int end = word.length() - 1;
        while (end >= start) {
            if (word.charAt(start++) != word.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}

package leetcode.oo.window;

import java.util.Arrays;

/**
 * Longest prefix for array of words.
 * See {@link <a href ="https://leetcode.com/problems/longest-common-prefix/">https://leetcode.com/problems/longest-common-prefix/</a>}
 */
public final class LongestPrefix {

    /**
     * Find the longest common prefix.
     * Algorithm iterates over chars from first word
     * then it compares each char from first words with
     * each chars with the same position from other words
     * As soon as chars are not equal then
     * substring from 0 to index of char is the answer
     *
     * @param words Array of words
     * @return Longest common prefix, or empty string if
     * there are not common prefixes
     */
    public String longestCommonPrefix(final String[] words) {
        if (words.length == 0) {
            return "";
        }
        Arrays.sort(words);
        final String first = words[0];
        final String last = words[words.length - 1];
        int matched = 0;
        while (matched < first.length()) {
            if (first.charAt(matched) == last.charAt(matched)) {
                matched++;
            } else {
                break;
            }
        }
        return matched == 0 ? "" : first.substring(0, matched);
    }
}

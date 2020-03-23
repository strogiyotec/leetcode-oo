package leetcode.oo.window;

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
        for (int i = 0; i < words[0].length(); i++) {
            final char firstChar = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (i == words[j].length() || words[j].charAt(i) != firstChar) {
                    return words[0].substring(0, i);
                }
            }
        }
        return words[0];
    }
}

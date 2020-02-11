package leetcode.oo.sliding_window;

/**
 * Longest unique chars sequence using string builder approach.
 * See {@link <a href ="https://leetcode.com/problems/longest-substring-without-repeating-characters/">https://leetcode.com/problems/longest-substring-without-repeating-characters/</a>}
 */
public final class UniqueCharsLength {

    /**
     * Find longest sequence length.
     *
     * @param text Given string
     * @return Length
     */
    public int lengthOfLongestSubstring(final String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            final char charI = text.charAt(i);
            final StringBuilder uniqueSequence =
                    new StringBuilder(
                            text.length()
                    ).append(charI);
            for (int j = i + 1; j < text.length(); j++) {
                final char charJ = text.charAt(j);
                if (uniqueSequence.indexOf(String.valueOf(charJ)) == -1) {
                    uniqueSequence.append(charJ);
                } else {
                    break;
                }
            }
            if (result < uniqueSequence.length()) {
                result = uniqueSequence.length();
            }
        }
        return result;
    }
}

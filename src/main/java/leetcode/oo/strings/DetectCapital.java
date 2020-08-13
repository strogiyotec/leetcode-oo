package leetcode.oo.strings;


/**
 * Detect Capital.
 * See {@link <a href ="https://leetcode.com/problems/detect-capital/">https://leetcode.com/problems/detect-capital/</a>}
 */
final class DetectCapital {

    boolean detectCapitalUse(final String word) {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                cnt++;
            }
        }
        return cnt == 0 || cnt == word.length() || (cnt == 1 && Character.isUpperCase(word.charAt(0)));
    }
}

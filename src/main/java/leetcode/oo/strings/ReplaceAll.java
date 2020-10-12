package leetcode.oo.strings;

/**
 * Replace All ?'s to Avoid Consecutive Repeating Characters.
 * See {@link <a href ="https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/">https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/</a>}
 */
final class ReplaceAll {

    String modifyString(final String word) {
        if (word.length() == 1 && word.charAt(0) == '?') {
            return "a";
        }
        final char[] array = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '?') {
                for (char j = 'a'; j <= 'c'; j++) {
                    if (i > 0 && array[i - 1] == j) {
                        continue;
                    }
                    if (i < array.length - 1 && array[i + 1] == j) {
                        continue;
                    }
                    array[i] = j;
                    break;
                }
            }
        }
        return new String(array);
    }
}

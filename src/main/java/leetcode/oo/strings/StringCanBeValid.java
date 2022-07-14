package leetcode.oo.strings;

/**
 * https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
 */
final class StringCanBeValid {

    public boolean canBeValid(String s, String locked) {
        return s.length() %2 ==0 && this.validLeft(s, locked) && this.validRight(s, locked);
    }

    private boolean validRight(final String word, final String locker) {
        int rights = 0;
        for (int i = word.length()-1; i >= 0; i--) {
            final char current = word.charAt(i);
            if (current == ')' || locker.charAt(i) == '0') {
                rights++;
            } else {
                rights--;
            }
            if (rights < 0) {
                return false;
            }
        }
        return true;
    }

    private boolean validLeft(final String word, final String locker) {
        int lefts = 0;
        for (int i = 0; i < word.length(); i++) {
            final char current = word.charAt(i);
            if (current == '(' || locker.charAt(i) == '0') {
                lefts++;
            } else {
                lefts--;
            }
            if (lefts < 0) {
                return false;
            }
        }
        return true;
    }
}

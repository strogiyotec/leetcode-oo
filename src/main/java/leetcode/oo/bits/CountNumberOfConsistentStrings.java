package leetcode.oo.bits;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
public final class CountNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        final boolean[] allowedSlots = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            allowedSlots[allowed.charAt(i) - 'a'] = true;
        }
        int cnt = 0;
        for (final String word : words) {
            boolean consistent = true;
            for (int i = 0; i < word.length(); i++) {
                if (!allowedSlots[word.charAt(i) - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                cnt++;
            }
        }
        return cnt;
    }
}

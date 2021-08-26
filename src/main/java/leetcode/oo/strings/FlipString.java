package leetcode.oo.strings;

//https://leetcode.com/problems/flip-string-to-monotone-increasing/
final class FlipString {

    public int minFlipsMonoIncr(String s) {
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '0') {
                ones = Math.min(ones, zeros) + 1;
            } else {
                ones = Math.min(ones, zeros);
                zeros++;
            }
        }
        return Math.min(ones, zeros);
    }
}

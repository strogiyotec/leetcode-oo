package leetcode.oo.strings;

import java.util.PriorityQueue;

//https://leetcode.com/problems/check-if-a-string-can-break-another-string/
public final class BreakString {

    public static void main(final String[] args) {
        System.out.println(
            new BreakString().checkIfCanBreak(
            "leetcodee", "interview"
            )
        );
    }

    public boolean checkIfCanBreak(String s1, String s2) {
        return this.canBreak(s1, s2) || this.canBreak(s2, s1);
    }

    private boolean canBreak(final String s1, final String s2) {
        final PriorityQueue<Character> first = new PriorityQueue<>(s1.length());
        final PriorityQueue<Character> second = new PriorityQueue<>(s2.length());
        for (int i = 0; i < s1.length(); i++) {
            first.offer(s1.charAt(i));
            second.offer(s2.charAt(i));
        }
        while (!first.isEmpty() && !second.isEmpty()) {
            if (first.poll() < second.poll()) {
                return false;
            }
        }
        return true;
    }
}

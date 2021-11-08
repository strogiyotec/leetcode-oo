package leetcode.oo.dp.greedy;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/longest-subsequence-repeated-k-times/
final class LongestSubseqRepeated {

    public String longestSubsequenceRepeatedK(String s, int k) {
        final Queue<String> queue = new LinkedList<>();
        String res = "";
        queue.add("");
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final String current = queue.poll();
                for (int j = 0; j < 26; j++) {
                    final String next = current + (char) ('a' + j);
                    if (this.isSub(next, s, k)) {
                        queue.offer(next);
                        res = next;
                    }
                }
            }
        }
        return res;
    }

    private boolean isSub(final String next, final String full, final int times) {
        int currentTimes = 0;
        int j = 0;
        for (int i = 0; i < full.length(); i++) {
            if (full.charAt(i) == next.charAt(j)) {
                j++;
                if (j == next.length()) {
                    j = 0;
                    currentTimes++;
                    if (currentTimes == times) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

package leetcode.oo.dp.greedy;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/longest-subsequence-repeated-k-times/
final class LongestSubseqRepeated {

    public String longestSubsequenceRepeatedK(String s, int k) {
        final Queue<String> queue = new LinkedList<>();
        queue.add("");
        String res = "";
        while (!queue.isEmpty()) {
            final String current = queue.poll();
            for (int i = 0; i < 26; i++) {
                final String next = current + (char)('a' + i);
                if (this.isSubKTimes(s, next, k)) {
                    queue.add(next);
                    res = next;
                }
            }
        }
        return res;
    }

    private boolean isSubKTimes(final String full, final String next, final int times) {
        int timesMatched = 0;
        int nextIndex = 0;
        for (int i = 0; i < full.length(); i++) {
            if (full.charAt(i) == next.charAt(nextIndex)) {
                nextIndex++;
                if (nextIndex == next.length()) {
                    timesMatched++;
                    nextIndex = 0;
                    if(timesMatched == times){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

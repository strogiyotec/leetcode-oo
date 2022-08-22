package leetcode.oo.strings;

import java.util.ArrayDeque;

//https://leetcode.com/problems/maximum-score-from-removing-substrings/submissions/
class MaxScoreRemovingSubstr {

    public int maximumGain(String s, int x, int y) {
        final String maxStr = x > y ? "ab" : "ba";
        final String minStr = x > y ? "ba" : "ab";
        int maxScore = Math.max(x, y);
        int minScore = Math.min(x, y);
        int maxGain = 0;
        final ArrayDeque<Character> queue = new ArrayDeque<>(s.length());
        maxGain += this.calculateScore(s, maxStr, maxScore, queue);
        final StringBuilder remaining = new StringBuilder(queue.size());
        while (!queue.isEmpty()) {
            remaining.append(queue.pollFirst());
        }
        maxGain += this.calculateScore(remaining.toString(), minStr, minScore, queue);
        return maxGain;
    }

    private int calculateScore(final String word, final String maxStr, final int maxScore, final ArrayDeque<Character> queue) {
        int score = 0;
        for (final char currentChar : word.toCharArray()) {
            if (queue.isEmpty() || queue.peekLast() != maxStr.charAt(0) || currentChar != maxStr.charAt(1)) {
                queue.addLast(currentChar);
            } else {
                queue.pollLast();
                score += maxScore;
            }
        }
        return score;
    }
}

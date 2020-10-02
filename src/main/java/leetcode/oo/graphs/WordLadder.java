package leetcode.oo.graphs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * Word ladder.
 * See {@link <a href ="https://leetcode.com/problems/word-ladder/">https://leetcode.com/problems/word-ladder/</a>}
 */
final class WordLadder {

    int ladderLength(final String beginWord, final String endWord, final List<String> wordList) {
        final Set<String> wordsSet = new HashSet<>(wordList);
        final Queue<String> queue = new ArrayDeque<>(wordList.size());
        final Set<String> visited = new HashSet<>(wordList.size());
        queue.add(beginWord);
        visited.add(beginWord);
        int cnt = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                final String current = queue.poll();
                if (current.equals(endWord)) {
                    return cnt;
                }
                for (int j = 0; j < current.length(); j++) {
                    for (int k = 'a'; k <= 'z'; k++) {
                        final char[] chars = current.toCharArray();
                        chars[j] = (char) k;
                        final String candidate = new String(chars);
                        if (wordsSet.contains(candidate) && !visited.contains(candidate)) {
                            queue.offer(candidate);
                            visited.add(candidate);
                        }
                    }
                }
            }
            cnt++;
        }
        return 0;
    }
}

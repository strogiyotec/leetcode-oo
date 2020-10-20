package leetcode.oo.graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Queue;

/**
 * Minimum Genetic Mutation.
 * See {@link <a href ="https://leetcode.com/problems/minimum-genetic-mutation/">https://leetcode.com/problems/minimum-genetic-mutation/</a>}
 */
final class MinGenMutations {

    int minMutation(final String start, final String end, final String[] bank) {
        final Collection<String> set = new HashSet<>(Arrays.asList(bank));
        final Queue<String> queue = new ArrayDeque<>(bank.length);
        final Collection<String> visited = new HashSet<>(bank.length);
        queue.offer(start);
        int cnt = 0;
        final char[] gens = {'A', 'C', 'G', 'T'};
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int k = 0; k < size; k++) {
                final String word = queue.poll();
                if (word.equals(end)) {
                    return cnt;
                }
                for (int i = 0; i < word.length(); i++) {
                    final char[] ar = word.toCharArray();
                    for (int j = 0; j < gens.length; j++) {
                        ar[i] = gens[j];
                        final String str = new String(ar);
                        if (!visited.contains(str) && set.contains(str)) {
                            visited.add(str);
                            queue.offer(str);
                        }
                    }
                }
            }
            cnt++;
        }
        return -1;
    }
}

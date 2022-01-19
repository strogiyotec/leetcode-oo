package leetcode.oo.dp;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/similar-string-groups/
final class SimilarStringGroups {

    public int numSimilarGroups(final String[] strs) {
        final Map<Integer, Integer> disjointSet = new HashMap<>(strs.length << 1);
        for (int i = 0; i < strs.length; i++) {
            disjointSet.put(i, i);
        }
        final int length = strs.length;
        int groups = length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (this.match(strs[i], strs[j])) {
                    final Integer first = this.find(i, disjointSet);
                    final Integer second = this.find(j, disjointSet);
                    if (!first.equals(second)) {
                        groups--;
                    }
                    disjointSet.put(first, second);
                }
            }
        }
        return groups;
    }

    private Integer find(final Integer node, final Map<Integer, Integer> graph) {
        Integer parent = graph.get(node);
        while (!graph.get(parent).equals(parent)) {
            parent = graph.get(parent);
        }
        return parent;
    }

    private boolean match(final String first, final String second) {
        int different = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                different++;
            }
            if (different > 2) {
                return false;
            }
        }
        return true;
    }
}

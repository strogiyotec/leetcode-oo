package leetcode.oo.dp.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/get-the-maximum-score/
final class GetMaxScore {

    public int maxSum(int[] nums1, int[] nums2) {
        final Map<Integer, List<Integer>> paths = new HashMap<>(nums1.length);
        for (int i = 0; i < nums1.length - 1; i++) {
            paths.computeIfAbsent(nums1[i], integer -> new ArrayList<>()).add(nums1[i + 1]);
        }
        for (int i = 0; i < nums2.length - 1; i++) {
            paths.computeIfAbsent(nums2[i], integer -> new ArrayList<>()).add(nums2[i + 1]);
        }
        final Map<Integer, Integer> cache = new HashMap<>(nums1.length);
        return Math.max(
            this.dfs(paths, cache, nums1[0]),
            this.dfs(paths, cache, nums2[0])
        );
    }

    private int dfs(final Map<Integer, List<Integer>> paths, final Map<Integer, Integer> cache, final int currentNode) {
        if (cache.containsKey(currentNode)) {
            return cache.get(currentNode);
        }
        int maxScore = 0;
        for (final Integer vertex : paths.getOrDefault(currentNode, Collections.emptyList())) {
            maxScore = Math.max(
                maxScore,
                this.dfs(paths, cache, vertex)
            );
        }
        maxScore += currentNode;
        cache.put(currentNode, maxScore);
        return maxScore;
    }

}

package leetcode.oo.dp.backtracking;

import java.util.*;

/**
 * Combination Sum II.
 * See {@link <a href ="https://leetcode.com/problems/combination-sum-ii/">https://leetcode.com/problems/combination-sum-ii/</a>}
 */
final class CombinationSum2 {
    List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        final Set<List<Integer>> combinations = new HashSet<>();
        this.find(candidates, target, combinations, new ArrayList<>(), 0);
        return new ArrayList<>(combinations);
    }

    private void find(
            final int[] candidates,
            final int target,
            final Set<List<Integer>> combinations,
            final ArrayList<Integer> storage,
            final int index) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(storage));
        }
        for (int i = index; i < candidates.length; i++) {
            storage.add(candidates[i]);
            this.find(candidates, target - candidates[i], combinations, storage, i + 1);
            storage.remove(storage.size() - 1);
        }
    }
}
